package a;

import android.gov.nist.core.Separators;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class pm50 implements p6t0, y640 {
    public static final pm50 c = new pm50(-1, new Date(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f27214a;
    public final int b;

    public pm50(int i, Date date) {
        this.f27214a = date;
        this.b = i;
    }

    @Override // a.y640
    public final Date e() {
        return this.f27214a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm50)) {
            return false;
        }
        pm50 pm50Var = (pm50) obj;
        return this.f27214a.equals(pm50Var.f27214a) && this.b == pm50Var.b;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof pm50) && (p6t0Var2 instanceof pm50)) {
            return ((pm50) p6t0Var).f27214a.equals(((pm50) p6t0Var2).f27214a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f27214a.hashCode() * 31);
    }

    public final String toString() {
        return "NewMessagesLabelUIModel(createdAt=" + this.f27214a + ", dependMessageId=" + this.b + Separators.RPAREN;
    }
}
