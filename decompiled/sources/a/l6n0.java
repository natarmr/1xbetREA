package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class l6n0 {
    public static final h6n0 Companion = new h6n0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new x9m0(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19515a;
    public final int b;
    public final List c;

    public /* synthetic */ l6n0(int i, int i2, long j, List list) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, g6n0.f10776a.getDescriptor());
            throw null;
        }
        this.f19515a = j;
        this.b = i2;
        this.c = list;
    }

    public l6n0(int i, long j, ArrayList arrayList) {
        this.f19515a = j;
        this.b = i;
        this.c = arrayList;
    }
}
