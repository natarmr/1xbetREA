package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bf10 implements ff10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mwa f2479a;

    public bf10(mwa mwaVar) {
        this.f2479a = mwaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf10) && this.f2479a.equals(((bf10) obj).f2479a);
    }

    public final int hashCode() {
        return this.f2479a.hashCode();
    }

    public final String toString() {
        return "CashbackButton(model=" + this.f2479a + Separators.RPAREN;
    }
}
