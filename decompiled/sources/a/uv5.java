package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@lbk
@ahi0
public final class uv5 {
    public static final tv5 Companion = new tv5();
    public static final a8z[] g = {maz.a(wez.f39042a, new o85(14)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36332a;
    public final bg8 b;
    public final Double c;
    public final long d;
    public final String e;
    public final int f;

    public uv5(int i, int i2, long j, bg8 bg8Var, Double d, String str, List list) {
        if (56 != (i & 56)) {
            m2x.I(i, 56, sv5.f32850a.getDescriptor());
            throw null;
        }
        this.f36332a = (i & 1) == 0 ? iun.f15405a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bg8Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d;
        }
        this.d = j;
        this.e = str;
        this.f = i2;
    }

    public uv5(long j, bg8 bg8Var, Double d, String str) {
        iun iunVar = iun.f15405a;
        iunVar.getClass();
        this.f36332a = iunVar;
        this.b = bg8Var;
        this.c = d;
        this.d = j;
        this.e = str;
        this.f = 22;
    }
}
