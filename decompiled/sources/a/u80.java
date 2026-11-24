package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class u80 {
    public static final t80 Companion = new t80();
    public static final a8z[] g = {maz.a(wez.f39042a, new q8(21)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35211a;
    public final Double b;
    public final bg8 c;
    public final long d;
    public final String e;
    public final int f;

    public /* synthetic */ u80(int i, int i2, long j, bg8 bg8Var, Double d, String str, List list) {
        if (57 != (i & 57)) {
            m2x.I(i, 57, s80.f31778a.getDescriptor());
            throw null;
        }
        this.f35211a = list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bg8Var;
        }
        this.d = j;
        this.e = str;
        this.f = i2;
    }

    public u80(ArrayList arrayList, bg8 bg8Var, long j, String str) {
        this.f35211a = arrayList;
        this.b = null;
        this.c = bg8Var;
        this.d = j;
        this.e = str;
        this.f = 22;
    }
}
