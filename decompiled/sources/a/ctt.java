package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ctt {
    public static final btt Companion = new btt();
    public static final a8z[] e = {null, null, maz.a(wez.f39042a, new tet(21)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4958a;
    public final Long b;
    public final List c;
    public final boolean d;

    public /* synthetic */ ctt(int i, int i2, Long l, List list, boolean z) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, att.f1448a.getDescriptor());
            throw null;
        }
        this.f4958a = i2;
        this.b = l;
        this.c = list;
        this.d = z;
    }

    public ctt(int i, Long l, List list) {
        list.getClass();
        this.f4958a = i;
        this.b = l;
        this.c = list;
        this.d = true;
    }
}
