package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class g17 {
    public static final c17 Companion = new c17();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new t07(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f10497a;
    public final Long b;
    public final Boolean c;
    public final List d;

    public /* synthetic */ g17(int i, Boolean bool, Long l, Long l2, List list) {
        if ((i & 1) == 0) {
            this.f10497a = null;
        } else {
            this.f10497a = l;
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
