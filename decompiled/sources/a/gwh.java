package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gwh implements hwh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zvh f12027a;
    public final boolean b;

    public gwh(zvh zvhVar, boolean z) {
        this.f12027a = zvhVar;
        this.b = z;
    }

    @Override // a.hwh
    public final boolean a() {
        return this.b;
    }

    @Override // a.hwh
    public final zvh b() {
        return this.f12027a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwh)) {
            return false;
        }
        gwh gwhVar = (gwh) obj;
        return this.f12027a.equals(gwhVar.f12027a) && this.b == gwhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f12027a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(cyclingPlayerStatisticsHeaderUiModel=" + this.f12027a + ", headerIsLoaded=" + this.b + Separators.RPAREN;
    }
}
