package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cpb0 implements fpb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f4738a;

    public cpb0(mdm mdmVar) {
        this.f4738a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpb0) && this.f4738a.equals(((cpb0) obj).f4738a);
    }

    public final int hashCode() {
        return this.f4738a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(lottieConfigurator=", this.f4738a, Separators.RPAREN);
    }
}
