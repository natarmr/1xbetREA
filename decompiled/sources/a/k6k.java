package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class k6k {
    public static final j6k Companion = new j6k();
    public static final a8z[] b = {maz.a(wez.f39042a, new rtj(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17775a;

    public /* synthetic */ k6k(int i, List list) {
        if (1 == (i & 1)) {
            this.f17775a = list;
        } else {
            m2x.I(i, 1, i6k.f14243a.getDescriptor());
            throw null;
        }
    }

    public k6k(List list) {
        list.getClass();
        this.f17775a = list;
    }
}
