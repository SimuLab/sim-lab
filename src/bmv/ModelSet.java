package bmv;

import java.util.ArrayList;

public class ModelSet extends ArrayList<Model> {

	@Override
	public boolean add(Model e) {
		int preexistingIndex = indexOf(e);
		if (preexistingIndex >= 0) {
			get(preexistingIndex).becomeModel(e);
		} else {
			try {
				super.add(new Model(e));
			} catch (InvalidTableException e1) {
				e1.printStackTrace();
				return false;
			}
		}
		return true;
	}

	@Override
	public int indexOf(Object o) {
		int index = -1;
		if (o.getClass() == Model.class) {
			for (int i = 0; index == -1 && i < size(); i++) {
				if (((Model) o).getModelName().equals(get(i).getModelName())) {
					index = i;
				}
			}
		}
		return index;
	}

	public int indexOf(String modelname) {
		int index = -1;

		for (int i = 0; index == -1 && i < size(); i++) {
			if (modelname.equals(get(i).getModelName())) {
				index = i;
			}
		}
		return index;
	}
}
