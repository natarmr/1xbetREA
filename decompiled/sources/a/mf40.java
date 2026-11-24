package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class mf40 implements tf40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0i f21679a;

    public mf40(a0i a0iVar) {
        this.f21679a = a0iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf40) && this.f21679a.equals(((mf40) obj).f21679a);
    }

    @Override // a.tf40
    public final String getKey() {
        String strJ = sre0.f32672a.b(mf40.class).J();
        return strJ == null ? "" : strJ;
    }

    public final int hashCode() {
        return this.f21679a.hashCode();
    }

    public final String toString() {
        return "LoyaltyProgramBasicWidget(model=" + this.f21679a + Separators.RPAREN;
    }
}
