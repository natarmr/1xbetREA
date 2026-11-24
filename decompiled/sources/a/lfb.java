package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class lfb {
    public static final kfb Companion = new kfb();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19945a;
    public final Long b;
    public final List c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, null, maz.a(wezVar, new e0b((byte) 14)), maz.a(wezVar, new e0b((byte) 15))};
    }

    public /* synthetic */ lfb(int i, Integer num, Long l, List list, List list2) {
        if ((i & 1) == 0) {
            this.f19945a = null;
        } else {
            this.f19945a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }
}
