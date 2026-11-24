package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class qfa implements tfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28622a;
    public final oga b;
    public final jga c;
    public final nem d;

    public qfa(long j, oga ogaVar, jga jgaVar, nem nemVar) {
        this.f28622a = j;
        this.b = ogaVar;
        this.c = jgaVar;
        this.d = nemVar;
    }

    @Override // a.tfa
    public final long a() {
        return this.f28622a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfa)) {
            return false;
        }
        qfa qfaVar = (qfa) obj;
        return this.f28622a == qfaVar.f28622a && this.b.equals(qfaVar.b) && this.c.equals(qfaVar.c) && this.d.equals(qfaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f28622a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardWatermark(gameId=" + this.f28622a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
