package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class c57 {
    public static final b57 Companion = new b57();
    public static final a8z[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hv7 f3757a;
    public final List b;
    public final String c;
    public final boolean d;
    public final kuw e;

    static {
        wez wezVar = wez.f39042a;
        f = new a8z[]{null, maz.a(wezVar, new t07((byte) 5)), null, null, maz.a(wezVar, new t07((byte) 6))};
    }

    public /* synthetic */ c57(int i, hv7 hv7Var, List list, String str, boolean z, kuw kuwVar) {
        if ((i & 1) == 0) {
            this.f3757a = null;
        } else {
            this.f3757a = hv7Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
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
        List list = this.b;
        if (list != null) {
            return list;
        }
        jf4.k(null);
        return null;
    }
}
