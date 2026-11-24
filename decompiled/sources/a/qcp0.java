package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qcp0 implements xcp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28494a;
    public final d5a0 b;
    public final d5a0 c;

    public qcp0(String str, d5a0 d5a0Var, d5a0 d5a0Var2) {
        str.getClass();
        this.f28494a = str;
        this.b = d5a0Var;
        this.c = d5a0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcp0)) {
            return false;
        }
        qcp0 qcp0Var = (qcp0) obj;
        return Intrinsics.d(this.f28494a, qcp0Var.f28494a) && this.b.equals(qcp0Var.b) && this.c.equals(qcp0Var.c);
    }

    public final int hashCode() {
        return this.c.f5497a.hashCode() + twn.e(this.b.f5497a, this.f28494a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Default(name=" + this.f28494a + ", firstPlayerLogo=" + this.b + ", secondPlayerLogo=" + this.c + Separators.RPAREN;
    }
}
