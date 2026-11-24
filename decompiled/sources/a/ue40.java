package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ue40 implements df40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fyx f35508a;

    public ue40(fyx fyxVar) {
        this.f35508a = fyxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ue40) && this.f35508a.equals(((ue40) obj).f35508a);
    }

    @Override // a.df40
    public final fyx getState() {
        return this.f35508a;
    }

    public final int hashCode() {
        return this.f35508a.hashCode();
    }

    public final String toString() {
        return "MyAggregatorBanner(state=" + this.f35508a + Separators.RPAREN;
    }
}
