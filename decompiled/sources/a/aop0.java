package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aop0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1213a;
    public final String b;

    public aop0(String str, String str2) {
        str.getClass();
        this.f1213a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aop0)) {
            return false;
        }
        aop0 aop0Var = (aop0) obj;
        return Intrinsics.d(this.f1213a, aop0Var.f1213a) && this.b.equals(aop0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1213a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TeamUiModel(teamName=", this.f1213a, ", teamLogoUrl=", this.b, Separators.RPAREN);
    }
}
