package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class br40 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3059a;
    public final wul b;
    public final ar40 c;

    public br40(Object obj, wul wulVar, ar40 ar40Var) {
        this.f3059a = obj;
        this.b = wulVar;
        this.c = ar40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br40)) {
            return false;
        }
        br40 br40Var = (br40) obj;
        return this.f3059a.equals(br40Var.f3059a) && this.b.equals(br40Var.b) && this.c == br40Var.c;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.f3059a;
    }

    public final int hashCode() {
        return this.c.hashCode() + i8i.a(this.b, this.f3059a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MoreButtonUiModel(key=" + this.f3059a + ", buttonUiModel=" + this.b + ", sectionType=" + this.c + Separators.RPAREN;
    }
}
