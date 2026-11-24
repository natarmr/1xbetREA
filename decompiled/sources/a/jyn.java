package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jyn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17367a;
    public final wul b;
    public final wul c;

    public jyn(boolean z, wul wulVar, wul wulVar2) {
        this.f17367a = z;
        this.b = wulVar;
        this.c = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyn)) {
            return false;
        }
        jyn jynVar = (jyn) obj;
        return this.f17367a == jynVar.f17367a && this.b.equals(jynVar.b) && this.c.equals(jynVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + i8i.a(this.b, Boolean.hashCode(this.f17367a) * 31, 31);
    }

    public final String toString() {
        return "EndSessionUiState(isLoginLaterVisible=" + this.f17367a + ", loginButtonModel=" + this.b + ", loginLaterButtonModel=" + this.c + Separators.RPAREN;
    }
}
