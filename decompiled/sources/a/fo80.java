package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class fo80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f9870a;
    public static final /* synthetic */ int b = 0;

    static {
        eaq0[] eaq0VarArr = daq0.b;
        f9870a = daq0.c;
    }

    public static final eo80 a(eo80 eo80Var, int i, int i2, long j, g8q0 g8q0Var, ew90 ew90Var, m600 m600Var, int i3, int i4, i9q0 i9q0Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        g8q0 g8q0Var2 = g8q0Var;
        ew90 ew90Var2 = ew90Var;
        m600 m600Var2 = m600Var;
        int i7 = i3;
        int i8 = i4;
        i9q0 i9q0Var2 = i9q0Var;
        if (i5 == 0 || i5 == eo80Var.f8127a) {
            eaq0[] eaq0VarArr = daq0.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (daq0.a(j3, eo80Var.c)) {
                }
            }
            if ((g8q0Var2 == null || g8q0Var2.equals(eo80Var.d)) && ((i6 == 0 || i6 == eo80Var.b) && ((ew90Var2 == null || ew90Var2.equals(eo80Var.e)) && ((m600Var2 == null || m600Var2.equals(eo80Var.f)) && ((i7 == 0 || i7 == eo80Var.g) && ((i8 == 0 || i8 == eo80Var.h) && (i9q0Var2 == null || i9q0Var2.equals(eo80Var.i)))))))) {
                return eo80Var;
            }
        } else {
            j2 = 0;
        }
        eaq0[] eaq0VarArr2 = daq0.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = eo80Var.c;
        }
        if (g8q0Var2 == null) {
            g8q0Var2 = eo80Var.d;
        }
        if (i5 == 0) {
            i5 = eo80Var.f8127a;
        }
        if (i6 == 0) {
            i6 = eo80Var.b;
        }
        ew90 ew90Var3 = eo80Var.e;
        if (ew90Var3 != null && ew90Var2 == null) {
            ew90Var2 = ew90Var3;
        }
        if (m600Var2 == null) {
            m600Var2 = eo80Var.f;
        }
        if (i7 == 0) {
            i7 = eo80Var.g;
        }
        if (i8 == 0) {
            i8 = eo80Var.h;
        }
        if (i9q0Var2 == null) {
            i9q0Var2 = eo80Var.i;
        }
        return new eo80(i5, i6, j3, g8q0Var2, ew90Var2, m600Var2, i7, i8, i9q0Var2);
    }
}
