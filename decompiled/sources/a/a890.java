package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a890 implements b890 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f416a;

    public a890(String str) {
        this.f416a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a890) && this.f416a.equals(((a890) obj).f416a);
    }

    public final int hashCode() {
        return this.f416a.hashCode();
    }

    public final String toString() {
        return kng0.l("StartIntentAndFinish(link=", this.f416a, Separators.RPAREN);
    }
}
