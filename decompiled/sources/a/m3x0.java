package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m3x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21140a;
    public final boolean b;

    public m3x0(String str, boolean z) {
        s0x.E(str);
        this.f21140a = str;
        s0x.E("com.google.android.gms");
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3x0)) {
            return false;
        }
        m3x0 m3x0Var = (m3x0) obj;
        return l8x.Z(this.f21140a, m3x0Var.f21140a) && l8x.Z("com.google.android.gms", "com.google.android.gms") && l8x.Z(null, null) && this.b == m3x0Var.b && l8x.Z(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f21140a, "com.google.android.gms", null, 4225, Boolean.valueOf(this.b), null});
    }

    public final String toString() {
        String str = this.f21140a;
        if (str != null) {
            return str;
        }
        s0x.H(null);
        throw null;
    }
}
