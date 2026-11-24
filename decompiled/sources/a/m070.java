package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class m070 {
    public static final f070 Companion = new f070();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20941a;
    public final List b;
    public final List c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new fq60((byte) 14)), maz.a(wezVar, new fq60((byte) 15)), maz.a(wezVar, new fq60((byte) 16))};
    }

    public /* synthetic */ m070(int i, List list, List list2, List list3) {
        if ((i & 1) == 0) {
            this.f20941a = null;
        } else {
            this.f20941a = list;
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
