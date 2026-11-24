package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t9n implements x9n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f33573a;
    public final o0x b;
    public final Integer c;
    public final p9n d;
    public final p9n e;

    public t9n(o0x o0xVar, o0x o0xVar2, Integer num, p9n p9nVar, p9n p9nVar2) {
        this.f33573a = o0xVar;
        this.b = o0xVar2;
        this.c = num;
        this.d = p9nVar;
        this.e = p9nVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9n)) {
            return false;
        }
        t9n t9nVar = (t9n) obj;
        return this.f33573a.equals(t9nVar.f33573a) && this.b.equals(t9nVar.b) && this.c.equals(t9nVar.c) && this.d == t9nVar.d && this.e == t9nVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + w6x.d(this.b, this.f33573a.hashCode() * 31, 31)) * 31;
        p9n p9nVar = this.d;
        int iHashCode2 = (iHashCode + (p9nVar == null ? 0 : p9nVar.hashCode())) * 31;
        p9n p9nVar2 = this.e;
        return iHashCode2 + (p9nVar2 != null ? p9nVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TechnicalWorks(imageLink=" + this.f33573a + ", fallbackImageLink=" + this.b + ", placeholderRes=" + this.c + ", firstTag=" + this.d + ", secondTag=" + this.e + Separators.RPAREN;
    }
}
