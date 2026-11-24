package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class hxv {
    public static final gxv Companion = new gxv();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new ldv(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f13830a;
    public final List b;

    public /* synthetic */ hxv(int i, Boolean bool, List list) {
        if ((i & 1) == 0) {
            this.f13830a = null;
        } else {
            this.f13830a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }
}
