package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class w4q implements x4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f38553a;
    public final mdm b;

    public w4q(mdm mdmVar, imm immVar) {
        this.f38553a = immVar;
        this.b = mdmVar;
    }

    @Override // a.x4q
    public final imm a() {
        return this.f38553a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4q)) {
            return false;
        }
        w4q w4qVar = (w4q) obj;
        return this.f38553a.equals(w4qVar.f38553a) && this.b.equals(w4qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38553a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(navigationBarModel=" + this.f38553a + ", lottieConfig=" + this.b + Separators.RPAREN;
    }
}
