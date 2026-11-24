package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class dwu0 implements ewu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6817a;

    public dwu0(String str) {
        this.f6817a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dwu0) && this.f6817a.equals(((dwu0) obj).f6817a);
    }

    public final int hashCode() {
        return this.f6817a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSmsCodeError(error=", this.f6817a, Separators.RPAREN);
    }
}
