package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cf10 implements ff10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iza f4237a;

    public cf10(iza izaVar) {
        this.f4237a = izaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf10) && this.f4237a.equals(((cf10) obj).f4237a);
    }

    public final int hashCode() {
        return this.f4237a.hashCode();
    }

    public final String toString() {
        return "CashbackLevel(model=" + this.f4237a + Separators.RPAREN;
    }
}
