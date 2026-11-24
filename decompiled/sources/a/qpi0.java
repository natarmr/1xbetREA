package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class qpi0 {
    public static final ppi0 Companion = new ppi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29121a;

    public /* synthetic */ qpi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f29121a = list;
        } else {
            m2x.I(i, 1, opi0.f25644a.getDescriptor());
            throw null;
        }
    }

    public qpi0(ArrayList arrayList) {
        this.f29121a = arrayList;
    }
}
