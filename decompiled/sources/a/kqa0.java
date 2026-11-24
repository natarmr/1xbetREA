package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18713a;

    public kqa0(String str) {
        this.f18713a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqa0) && this.f18713a.equals(((kqa0) obj).f18713a);
    }

    public final int hashCode() {
        return this.f18713a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChange(query=", this.f18713a, Separators.RPAREN);
    }
}
