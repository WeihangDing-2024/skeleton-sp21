package game2048;

import java.util.LinkedList;
import java.util.List;

public class TileGroup {
  private List<Tile> tileGroup;

  public TileGroup(Tile tile) {
    tileGroup = new LinkedList<>();
    tileGroup.add(tile);
  }

  public void addTile(Tile tile) {
    tileGroup.add(tile);
  }

  public int size() {
    return tileGroup.size();
  }

  public List<Tile> getTileGroup() {
    return tileGroup;
  }
}
