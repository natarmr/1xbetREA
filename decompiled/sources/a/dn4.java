package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dn4 {
    public static final cn4 Companion = new cn4();
    public static final a8z[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p94 f6349a;
    public final List b;
    public final List c;
    public final vvq d;

    static {
        wez wezVar = wez.f39042a;
        e = new a8z[]{null, maz.a(wezVar, new a04((byte) 10)), maz.a(wezVar, new a04((byte) 11)), null};
    }

    public /* synthetic */ dn4(int i, p94 p94Var, List list, List list2, vvq vvqVar) {
        if ((i & 1) == 0) {
            this.f6349a = null;
        } else {
            this.f6349a = p94Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = vvqVar;
        }
    }
}
