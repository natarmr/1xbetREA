package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zst0 {
    public static final yst0 Companion = new yst0();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new tht0(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44922a;
    public final String b;
    public final Long c;
    public final List d;

    public /* synthetic */ zst0(int i, Long l, Long l2, String str, List list) {
        if ((i & 1) == 0) {
            this.f44922a = null;
        } else {
            this.f44922a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }
}
