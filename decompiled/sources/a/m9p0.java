package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m9p0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21421a;
    public final jjm b;

    public m9p0(String str, jjm jjmVar) {
        str.getClass();
        this.f21421a = str;
        this.b = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9p0)) {
            return false;
        }
        m9p0 m9p0Var = (m9p0) obj;
        return Intrinsics.d(this.f21421a, m9p0Var.f21421a) && this.b.equals(m9p0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f21421a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21421a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamDetailsHeaderUiModel(key=" + this.f21421a + ", dsModel=" + this.b + Separators.RPAREN;
    }
}
