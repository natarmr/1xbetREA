package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class rzl0 implements wzl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31367a;

    public rzl0(String str) {
        this.f31367a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzl0) && this.f31367a.equals(((rzl0) obj).f31367a);
    }

    public final int hashCode() {
        return this.f31367a.hashCode();
    }

    public final String toString() {
        return kng0.l("SearchInput(text=", this.f31367a, Separators.RPAREN);
    }
}
