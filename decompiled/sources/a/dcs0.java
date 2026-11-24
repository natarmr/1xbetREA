package a;

/* JADX INFO: loaded from: classes.dex */
public final class dcs0 {
    public static final dcs0 d = new dcs0(new ccs0[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5860a;
    public final rcf0 b;
    public int c;

    static {
        vtt0.H(0);
    }

    public dcs0(ccs0... ccs0VarArr) {
        rcf0 rcf0VarQ = b4x.q(ccs0VarArr);
        this.b = rcf0VarQ;
        this.f5860a = ccs0VarArr.length;
        int i = 0;
        while (i < rcf0VarQ.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < rcf0VarQ.d; i3++) {
                if (((ccs0) rcf0VarQ.get(i)).equals(rcf0VarQ.get(i3))) {
                    f1t0.R("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final ccs0 a(int i) {
        return (ccs0) this.b.get(i);
    }

    public final int b(ccs0 ccs0Var) {
        int iIndexOf = this.b.indexOf(ccs0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dcs0.class != obj.getClass()) {
            return false;
        }
        dcs0 dcs0Var = (dcs0) obj;
        return this.f5860a == dcs0Var.f5860a && this.b.equals(dcs0Var.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.c = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
