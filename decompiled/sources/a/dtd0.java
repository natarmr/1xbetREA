package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class dtd0 {
    public static final ctd0 Companion = new ctd0();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6651a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new cbc0((byte) 27)), maz.a(wezVar, new cbc0((byte) 28)), maz.a(wezVar, new cbc0((byte) 29))};
    }

    public /* synthetic */ dtd0(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f6651a = null;
        } else {
            this.f6651a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list3;
        }
    }
}
