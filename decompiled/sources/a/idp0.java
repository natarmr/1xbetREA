package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class idp0 implements qdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5a0 f14597a;
    public final String b;
    public final uy c;

    public idp0(h5a0 h5a0Var, String str, uy uyVar) {
        str.getClass();
        this.f14597a = h5a0Var;
        this.b = str;
        this.c = uyVar;
    }

    @Override // a.qdp0
    public final h5a0 a() {
        return this.f14597a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idp0)) {
            return false;
        }
        idp0 idp0Var = (idp0) obj;
        return this.f14597a.equals(idp0Var.f14597a) && Intrinsics.d(this.b, idp0Var.b) && Intrinsics.d(this.c, idp0Var.c);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f14597a.hashCode() * 31, 31, this.b);
        uy uyVar = this.c;
        return iB + (uyVar == null ? 0 : uyVar.hashCode());
    }

    public final String toString() {
        return "Vertical(playerLogo=" + this.f14597a + ", name=" + this.b + ", additionalInfo=" + this.c + Separators.RPAREN;
    }
}
