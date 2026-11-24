package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40535a;
    public final wul b;

    public xa4(String str, wul wulVar) {
        str.getClass();
        this.f40535a = str;
        this.b = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa4)) {
            return false;
        }
        xa4 xa4Var = (xa4) obj;
        return Intrinsics.d(this.f40535a, xa4Var.f40535a) && this.b.equals(xa4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40535a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthLoginDefaultRegistrationUiModel(label=" + this.f40535a + ", button=" + this.b + Separators.RPAREN;
    }
}
