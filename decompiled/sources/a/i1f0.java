package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class i1f0 {
    public static final h1f0 Companion = new h1f0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new o6e0(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f13995a;
    public final List b;

    public /* synthetic */ i1f0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f13995a = null;
        } else {
            this.f13995a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}
