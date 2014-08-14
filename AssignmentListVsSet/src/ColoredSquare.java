//Student: Anil Dhungel
// CSIS 1410
//Assignment 07 ListVsSet

import java.awt.Color;

public class ColoredSquare {
	private int side;
	private Color color;

	public ColoredSquare(int s, Color c) {
		side = s;
		color = c;
	}

	public int area() {
		return side * side;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + side;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColoredSquare other = (ColoredSquare) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (side != other.side)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "side: "
				+ side
				+ " #"
				+ Integer.toHexString(0x100 | color.getRed()).substring(1)
						.toUpperCase()
				+ Integer.toHexString(0x100 | color.getGreen()).substring(1)
						.toUpperCase()
				+ Integer.toHexString(0x100 | color.getBlue()).substring(1)
						.toUpperCase();

	}
}
