package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class bwu0 implements ewu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iqt0 f3345a;

    public bwu0(iqt0 iqt0Var) {
        this.f3345a = iqt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwu0) && this.f3345a.equals(((bwu0) obj).f3345a);
    }

    public final int hashCode() {
        return this.f3345a.hashCode();
    }

    public final String toString() {
        return "OnCaptchaConfirmed(captcha=" + this.f3345a + Separators.RPAREN;
    }
}
