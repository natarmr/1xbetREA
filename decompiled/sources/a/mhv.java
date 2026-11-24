package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class mhv {
    public static final khv Companion = new khv();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new ldv(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21816a;
    public final List b;

    public /* synthetic */ mhv(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f21816a = null;
        } else {
            this.f21816a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}
