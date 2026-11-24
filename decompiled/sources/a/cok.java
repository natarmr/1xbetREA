package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cok implements eok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4704a;
    public final String b;
    public final int c;
    public final boa d;

    public cok(String str, String str2, int i, boa boaVar) {
        this.f4704a = str;
        this.b = str2;
        this.c = i;
        this.d = boaVar;
    }

    @Override // a.eok
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cok)) {
            return false;
        }
        cok cokVar = (cok) obj;
        return this.f4704a.equals(cokVar.f4704a) && this.b.equals(cokVar.b) && this.c == cokVar.c && this.d.equals(cokVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CHIPS_HEADER";
    }

    @Override // a.eok
    public final String getTitle() {
        return this.f4704a;
    }

    public final int hashCode() {
        return this.d.f2924a.hashCode() + twn.a(this.c, ua80.b(ua80.b(1532897371, 31, this.f4704a), 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CardStack(key=CHIPS_HEADER, title=", this.f4704a, ", image=", this.b, ", placeholderRes=");
        sbN.append(this.c);
        sbN.append(", cardStack=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
