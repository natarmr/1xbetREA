package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a4z implements b4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k9s f245a;

    public a4z(k9s k9sVar) {
        this.f245a = k9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4z) && this.f245a.equals(((a4z) obj).f245a);
    }

    public final int hashCode() {
        return this.f245a.hashCode();
    }

    public final String toString() {
        return "Success(gameDetailsModel=" + this.f245a + Separators.RPAREN;
    }
}
