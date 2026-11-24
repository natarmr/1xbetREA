package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class bub0 {
    public static final bub0 c = new bub0(aub0.f1470a, 0);
    public static final bub0 d = new bub0(aub0.f, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aub0 f3222a;
    public final int b;

    public bub0(aub0 aub0Var, int i) {
        this.f3222a = aub0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bub0.class != obj.getClass()) {
            return false;
        }
        bub0 bub0Var = (bub0) obj;
        return this.f3222a == bub0Var.f3222a && this.b == bub0Var.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3222a);
        sb.append(Separators.SP);
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb.append(str);
        return sb.toString();
    }
}
