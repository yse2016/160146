var canvas;
var ctx;
var cellSize=8;
var cols;
var rows;
var cells= new Array();
var buttonStart;
var buttonRandom;
var buttonReset;
var timer1;
var running =false;

window.onload = function()
{
	canvas =document.getElementById('Lifgame');
	ctx =canvas.getContext('2d');
	cold=Math.floor(canvas.width/cellSize);
	rows=Math.floor(canvas.height/cellSize);
	initCells();
	buttonStart = documents.getElementById('buttonStart');
	buttonRandom = documents.getElementById('buttonRondom');
	buttonReset = documents.getElementById('buttonReset');
	buttonStart.addEventLister('click', onStart,false);
	buttonRandom.addEventLister('click', randomCells,false);
	buttonReset.addEventLister('click',initCells,false);
	canvas.addEventListener('click',canvasClick,false);
}

function onStart(){
	if(running){
		clearInterval(timer1);
		buttonStart.value="start";
		running=false;
	}else{
		nextGeneration();
		timer1 = setInterval("nextGeneration()",100);
		buttonStart,value="Stop";
		running=true;

	}
}

function initCells(){
    ctx.fillStyle = 'rgb(60, 60, 60)';
    ctx.fillRect(0,0, canvas.width, canvas.height);
    for(col=0;col<cols;col++){
        cells[col] = new Array();
        for(row=0;row<rows;row++){
            cells[col][row] = 0;
        }
    }
    redraw();
}
function randomCells(){
    for(col=0;col<cols;col++){
        cells[col] = new Array();
        for(row=0;row<rows;row++){
            cells[col][row] = Math.round( Math.random());
        }
    }
    redraw();
}

function redraw(){
	for(col=0;col<cols;col++){
		for(row=0;row<rows;row++){
			dramCell(col,row);
		}
	}
}

function dramCell(x,y){
	var value =cells[x][y];
	var style =value ？ "reg(156,255,0)":"rgb(40,40,40)";
	ctx.fileStyle=style;
	ctx.fileRect(x*cellSize,y*cellSize,
		cellSize -1, cellSize,-1);
}

function nextGeneration(){
	var tmpCells=new Array();
	for(row=0;row<rows;row++){
      var count =countAround(col,row);
      if(cells[col][row]){
      	if(count==2|| count == 3){
	tmpCells[col][row]=1;
      }if(count==3){
      	tmpCells[col][row]=1;
      }else{
      	tmpCells[col][row]=0;
      }
	}
	}
}
cells =tmpCells;
redraw();
}
function countAround(x, y){
    var count = 0;
    for(i=-1;i<=1;i++){
        for(j=-1;j<=1;j++){
            if(
             (i!=0 || j != 0) &&
              x+i>=0 &&x+i < cols &&
              y+j>=0&&y+j < rows
            ) {
                count += cells[x + i][y + j];
            }
        }
    }
    return count;
}
function canvasClick(e){
    var x = e.clientX - canvas.offsetLeft;
    var y = e.clientY - canvas.offsetTop;
    var col = Math.floor(x / cellSize);
    var row = Math.floor(y / cellSize);
    cells[col][row] = !cells[col][row];
    drawCell(col, row);