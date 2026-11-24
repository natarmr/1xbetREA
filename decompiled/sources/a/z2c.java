package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class z2c {
    public static final y2c Companion = new y2c();
    public static final a8z[] b = {maz.a(wez.f39042a, new zxb(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43664a;

    public /* synthetic */ z2c(int i, List list) {
        if (1 == (i & 1)) {
            this.f43664a = list;
        } else {
            m2x.I(i, 1, x2c.f40158a.getDescriptor());
            throw null;
        }
    }

    public z2c(ArrayList arrayList) {
        this.f43664a = arrayList;
    }
}
