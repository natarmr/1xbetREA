package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class n16 implements kmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bby f22733a;

    public /* synthetic */ n16(bby bbyVar) {
        this.f22733a = bbyVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n16) {
            return this.f22733a.equals(((n16) obj).f22733a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22733a.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.f22733a + Separators.RPAREN;
    }
}
