package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kg6 {
    public static final ag6 Companion = new ag6();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new o85(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18225a;
    public final List b;

    public /* synthetic */ kg6(int i, long j, List list) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, zf6.f44287a.getDescriptor());
            throw null;
        }
        this.f18225a = j;
        this.b = list;
    }

    public kg6(long j, ArrayList arrayList) {
        this.f18225a = j;
        this.b = arrayList;
    }
}
