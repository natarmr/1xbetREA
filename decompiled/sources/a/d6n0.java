package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class d6n0 {
    public static final c6n0 Companion = new c6n0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new x9m0(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5558a;
    public final List b;

    public /* synthetic */ d6n0(int i, long j, List list) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, b6n0.f2064a.getDescriptor());
            throw null;
        }
        this.f5558a = j;
        this.b = list;
    }

    public d6n0(long j, List list) {
        list.getClass();
        this.f5558a = j;
        this.b = list;
    }
}
