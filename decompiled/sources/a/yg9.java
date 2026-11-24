package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yg9 extends wg9 {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public final xg9 G() {
        if (this.e.size() > 0) {
            return (xg9) this.e.get(0);
        }
        return null;
    }

    @Override // a.wg9, a.xg9
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg9) || c().equals(((yg9) obj).c())) {
            return super.equals(obj);
        }
        return false;
    }
}
