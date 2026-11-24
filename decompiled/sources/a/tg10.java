package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tg10 implements wg10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mwa f33888a;

    public tg10(mwa mwaVar) {
        this.f33888a = mwaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg10) && this.f33888a.equals(((tg10) obj).f33888a);
    }

    public final int hashCode() {
        return this.f33888a.hashCode();
    }

    public final String toString() {
        return "CashbackButton(model=" + this.f33888a + Separators.RPAREN;
    }
}
