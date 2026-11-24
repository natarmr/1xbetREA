package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zcp0 implements cdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44176a;
    public final k5a0 b;
    public final k5a0 c;

    public zcp0(String str, k5a0 k5a0Var, k5a0 k5a0Var2) {
        str.getClass();
        this.f44176a = str;
        this.b = k5a0Var;
        this.c = k5a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcp0)) {
            return false;
        }
        zcp0 zcp0Var = (zcp0) obj;
        return Intrinsics.d(this.f44176a, zcp0Var.f44176a) && this.b.equals(zcp0Var.b) && this.c.equals(zcp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f44176a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Default(name=" + this.f44176a + ", firstPlayerLogo=" + this.b + ", secondPlayerLogo=" + this.c + Separators.RPAREN;
    }
}
