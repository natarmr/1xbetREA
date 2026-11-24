package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qdu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28552a;

    public final boolean equals(Object obj) {
        if (obj instanceof qdu0) {
            return this.f28552a.equals(((qdu0) obj).f28552a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28552a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondPlayerFormula(value=", this.f28552a, Separators.RPAREN);
    }
}
