package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ve40 implements df40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fyx f37265a;

    public ve40(fyx fyxVar) {
        this.f37265a = fyxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve40) && this.f37265a.equals(((ve40) obj).f37265a);
    }

    @Override // a.df40
    public final fyx getState() {
        return this.f37265a;
    }

    public final int hashCode() {
        return this.f37265a.hashCode();
    }

    public final String toString() {
        return "PromoEntity(state=" + this.f37265a + Separators.RPAREN;
    }
}
