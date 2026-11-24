package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class sg7 {
    public static final og7 Companion = new og7();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32146a;
    public final ng7 b;
    public final String c;
    public final boolean d;
    public final kuw e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{maz.a(wezVar, new t07((byte) 21)), null, null, null, maz.a(wezVar, new t07((byte) 22))};
    }

    public /* synthetic */ sg7(int i, List list, ng7 ng7Var, String str, boolean z, kuw kuwVar) {
        if ((i & 1) == 0) {
            this.f32146a = null;
        } else {
            this.f32146a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ng7Var;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = kuwVar;
        }
    }

    public final List a() throws zhi0 {
        String str = this.c;
        if (str != null && str.length() > 0) {
            throw new zhi0(str, this.e, (Integer) null, 12);
        }
        List list = this.f32146a;
        if (list != null) {
            return list;
        }
        jf4.k(null);
        return null;
    }
}
