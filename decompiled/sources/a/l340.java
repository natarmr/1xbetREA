package a;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class l340 implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19341a;
    public final boolean b;

    public l340(String str, int i, boolean z) {
        this.f19341a = i;
        this.b = z;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        if (((HashSet) bb10Var.l.b).contains(fb10.f9235a)) {
            return new m340(this);
        }
        xv00.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.f19341a;
        if (i == 1) {
            str = "MERGE";
        } else if (i == 2) {
            str = "ADD";
        } else if (i == 3) {
            str = "SUBTRACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
