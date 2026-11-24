package a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class nm30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23754a;
    public final boolean b;
    public final boolean c;

    public nm30(String str, boolean z, boolean z2) {
        this.f23754a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == nm30.class) {
            nm30 nm30Var = (nm30) obj;
            if (TextUtils.equals(this.f23754a, nm30Var.f23754a) && this.b == nm30Var.b && this.c == nm30Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((ua80.b(31, 31, this.f23754a) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
