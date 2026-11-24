package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class m84 {
    public static final k84 Companion = new k84();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21352a;
    public final List b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new a04((byte) 3)), maz.a(wezVar, new a04((byte) 4))};
    }

    public /* synthetic */ m84(int i, List list, List list2) {
        if ((i & 1) == 0) {
            this.f21352a = null;
        } else {
            this.f21352a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
    }
}
