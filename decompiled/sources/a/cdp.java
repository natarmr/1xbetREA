package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cdp implements fdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4172a;
    public final String b = String.valueOf(sre0.f32672a.b(cdp.class).J());

    public cdp(int i) {
        this.f4172a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdp) && this.f4172a == ((cdp) obj).f4172a;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4172a);
    }

    public final String toString() {
        return ua80.e(this.f4172a, "TeamBetCardUiModel(teamsCount=", Separators.RPAREN);
    }
}
