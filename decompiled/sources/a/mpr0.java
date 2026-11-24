package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mpr0 {
    public static final lpr0 Companion = new lpr0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new dfr0(26))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22191a;
    public final List b;

    public /* synthetic */ mpr0(int i, int i2, List list) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, kpr0.f18688a.getDescriptor());
            throw null;
        }
        this.f22191a = i2;
        this.b = list;
    }

    public mpr0(int i, ArrayList arrayList) {
        this.f22191a = i;
        this.b = arrayList;
    }
}
