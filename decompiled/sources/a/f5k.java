package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class f5k {
    public static final e5k Companion = new e5k();
    public static final a8z[] b = {maz.a(wez.f39042a, new rtj(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8965a;

    public /* synthetic */ f5k(int i, List list) {
        if (1 == (i & 1)) {
            this.f8965a = list;
        } else {
            m2x.I(i, 1, d5k.f5509a.getDescriptor());
            throw null;
        }
    }

    public f5k(List list) {
        list.getClass();
        this.f8965a = list;
    }
}
