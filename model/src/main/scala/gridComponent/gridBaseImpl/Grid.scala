package gridComponent.gridBaseImpl

import gridComponent.IGrid

case class Grid (filled:Array[String]) extends IGrid {
  val empt_val = "O"

  override def toString: String = {
    val row1 = "x-----x-----x\n"
    val row2 = "| x---x---x |\n"
    val row3 = "| | x-x-x | |\n"
    val mid  = "x-x-x   x-x-x\n"
    val field = row1 + row2 + row3 + mid + row3 + row2 + row1 //TODO: List oder Vector
    field.map(x => if(x == 'x') 'O' else x)
  }

  override def is_free(pos:Int): Boolean = filled(pos).equals(empt_val)
}