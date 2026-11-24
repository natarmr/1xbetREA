package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class sko0 {
    public static final oko0 Companion = new oko0();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32361a;
    public final List b;
    public final List c;
    public final List d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{maz.a(wezVar, new dco0((byte) 10)), maz.a(wezVar, new dco0((byte) 14)), maz.a(wezVar, new dco0((byte) 18)), maz.a(wezVar, new dco0((byte) 22))};
    }

    public /* synthetic */ sko0(int i, List list, List list2, List list3, List list4) {
        if ((i & 1) == 0) {
            this.f32361a = null;
        } else {
            this.f32361a = list;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list4;
        }
    }
}
