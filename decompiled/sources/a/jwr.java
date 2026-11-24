package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jwr implements mwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17267a;

    public final boolean equals(Object obj) {
        if (obj instanceof jwr) {
            return this.f17267a.equals(((jwr) obj).f17267a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17267a.hashCode();
    }

    public final String toString() {
        return kng0.l("Information(value=", this.f17267a, Separators.RPAREN);
    }
}
