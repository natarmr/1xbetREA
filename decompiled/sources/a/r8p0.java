package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r8p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30039a;
    public final cpm b;

    public r8p0(String str, cpm cpmVar) {
        this.f30039a = str;
        this.b = cpmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8p0)) {
            return false;
        }
        r8p0 r8p0Var = (r8p0) obj;
        return this.f30039a.equals(r8p0Var.f30039a) && this.b.equals(r8p0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f30039a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30039a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamDetailsCalendarUiModel(key=" + this.f30039a + ", model=" + this.b + Separators.RPAREN;
    }
}
