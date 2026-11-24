package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xxo0 implements zxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41668a;

    public /* synthetic */ xxo0(String str) {
        this.f41668a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xxo0) {
            return this.f41668a.equals(((xxo0) obj).f41668a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41668a.hashCode();
    }

    public final String toString() {
        return kng0.l("Image(value=", this.f41668a, Separators.RPAREN);
    }
}
