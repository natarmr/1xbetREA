package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qjd0 implements xjd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28833a;

    public qjd0(String str) {
        this.f28833a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjd0) && this.f28833a.equals(((qjd0) obj).f28833a);
    }

    public final int hashCode() {
        return this.f28833a.hashCode();
    }

    public final String toString() {
        return kng0.l("ExpiredTokenError(message=", this.f28833a, Separators.RPAREN);
    }
}
