package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q7t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fck0 f28267a;
    public fck0 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    public final void a(a8q0 a8q0Var) {
        fck0 fck0Var;
        a8q0 a8q0Var2;
        this.e = false;
        fck0 fck0Var2 = this.f28267a;
        if (Intrinsics.d(a8q0Var, fck0Var2 != null ? (a8q0) fck0Var2.c : null)) {
            return;
        }
        String str = a8q0Var.f440a.b;
        fck0 fck0Var3 = this.f28267a;
        boolean zD = Intrinsics.d(str, (fck0Var3 == null || (a8q0Var2 = (a8q0) fck0Var3.c) == null) ? null : a8q0Var2.f440a.b);
        fck0 fck0Var4 = this.f28267a;
        if (zD) {
            if (fck0Var4 != null) {
                fck0Var4.c = a8q0Var;
                return;
            }
            return;
        }
        this.f28267a = new fck0((Object) fck0Var4, (Object) a8q0Var, (byte) 12);
        this.b = null;
        int length = a8q0Var.f440a.b.length() + this.c;
        this.c = length;
        if (length > 100000) {
            fck0 fck0Var5 = this.f28267a;
            if ((fck0Var5 != null ? (fck0) fck0Var5.b : null) == null) {
                return;
            }
            while (true) {
                if (fck0Var5 == null) {
                    fck0Var = null;
                } else {
                    fck0 fck0Var6 = (fck0) fck0Var5.b;
                    if (fck0Var6 != null) {
                        fck0Var = (fck0) fck0Var6.b;
                    } else {
                        fck0Var = null;
                    }
                }
                if (fck0Var == null) {
                    break;
                } else {
                    fck0Var5 = (fck0) fck0Var5.b;
                }
            }
            if (fck0Var5 != null) {
                fck0Var5.b = null;
            }
        }
    }
}
