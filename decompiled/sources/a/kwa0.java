package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kwa0 implements owa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18992a;

    public kwa0(String str) {
        ro8 ro8Var = ro8.f30824a;
        this.f18992a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwa0) || !this.f18992a.equals(((kwa0) obj).f18992a)) {
            return false;
        }
        ro8 ro8Var = ro8.f30824a;
        return true;
    }

    public final int hashCode() {
        return ro8.c.hashCode() + (this.f18992a.hashCode() * 31);
    }

    public final String toString() {
        return "Body(text=" + this.f18992a + ", style=" + ro8.c + Separators.RPAREN;
    }
}
