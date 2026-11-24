package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19892a;
    public final jea b;
    public final iea c;
    public final nea d;

    public lea(String str, jea jeaVar, iea ieaVar, nea neaVar) {
        this.f19892a = str;
        this.b = jeaVar;
        this.c = ieaVar;
        this.d = neaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lea)) {
            return false;
        }
        lea leaVar = (lea) obj;
        return this.f19892a.equals(leaVar.f19892a) && this.b.equals(leaVar.b) && this.c.equals(leaVar.c) && this.d.equals(leaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f19892a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CardCricketGameFieldUiModel(fieldImage=" + this.f19892a + ", gameInfo=" + this.b + ", cardsInfo=" + this.c + ", playersInfo=" + this.d + Separators.RPAREN;
    }
}
