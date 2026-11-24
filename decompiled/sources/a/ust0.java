package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ust0 {
    public static final qst0 Companion = new qst0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36227a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new tht0((byte) 15)), maz.a(wezVar, new tht0((byte) 16))};
    }

    public /* synthetic */ ust0(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f36227a = null;
        } else {
            this.f36227a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }
}
