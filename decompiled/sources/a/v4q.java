package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v4q implements x4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f36792a;
    public final u4q b;

    public v4q(imm immVar, u4q u4qVar) {
        this.f36792a = immVar;
        this.b = u4qVar;
    }

    @Override // a.x4q
    public final imm a() {
        return this.f36792a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4q)) {
            return false;
        }
        v4q v4qVar = (v4q) obj;
        return this.f36792a.equals(v4qVar.f36792a) && this.b.equals(v4qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36792a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(navigationBarModel=" + this.f36792a + ", filterWinLossUiModel=" + this.b + Separators.RPAREN;
    }
}
