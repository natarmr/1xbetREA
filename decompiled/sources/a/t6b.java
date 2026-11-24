package a;

import android.gov.nist.core.Separators;
import org.xplatform.related.api.presentation.RelatedParams;

/* JADX INFO: loaded from: classes6.dex */
public final class t6b implements w6b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f33409a;
    public final boolean b;
    public final RelatedParams c;

    public t6b(udl0 udl0Var, boolean z, RelatedParams relatedParams) {
        this.f33409a = udl0Var;
        this.b = z;
        this.c = relatedParams;
    }

    @Override // a.w6b
    public final boolean a() {
        return this.b;
    }

    @Override // a.w6b
    public final udl0 b() {
        return this.f33409a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6b)) {
            return false;
        }
        t6b t6bVar = (t6b) obj;
        return this.f33409a == t6bVar.f33409a && this.b == t6bVar.b && this.c.equals(t6bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f33409a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "MarketsEmpty(sportGameType=" + this.f33409a + ", rtlSupport=" + this.b + ", relatedParams=" + this.c + Separators.RPAREN;
    }
}
