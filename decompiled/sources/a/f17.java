package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class f17 {
    public static final e17 Companion = new e17();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new t07(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8752a;
    public final Long b;
    public final Boolean c;
    public final List d;

    public /* synthetic */ f17(int i, Boolean bool, Long l, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f8752a = null;
        } else {
            this.f8752a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }
}
