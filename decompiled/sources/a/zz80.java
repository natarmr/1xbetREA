package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zz80 implements d090 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45240a;

    public zz80(String str) {
        this.f45240a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zz80) && this.f45240a.equals(((zz80) obj).f45240a);
    }

    public final int hashCode() {
        return this.f45240a.hashCode();
    }

    public final String toString() {
        return kng0.l("ErrorMessage(message=", this.f45240a, Separators.RPAREN);
    }
}
