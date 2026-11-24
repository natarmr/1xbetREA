package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q8l0 implements r8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28307a;

    public q8l0(String str) {
        this.f28307a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8l0) && this.f28307a.equals(((q8l0) obj).f28307a);
    }

    public final int hashCode() {
        return this.f28307a.hashCode();
    }

    public final String toString() {
        return kng0.l("Url(value=", this.f28307a, Separators.RPAREN);
    }
}
