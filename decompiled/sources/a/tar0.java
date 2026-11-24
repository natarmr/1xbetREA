package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tar0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33628a;
    public final String b;
    public final String c;
    public final String d;

    public tar0(String str, String str2, String str3, String str4) {
        this.f33628a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tar0)) {
            return false;
        }
        tar0 tar0Var = (tar0) obj;
        return this.f33628a.equals(tar0Var.f33628a) && this.b.equals(tar0Var.b) && this.c.equals(tar0Var.c) && this.d.equals(tar0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f33628a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("TopPlayersPairItemUiModel(playerOneName=", this.f33628a, ", playerOneScore=", this.b, ", playerTwoName="), this.c, ", playerTwoScore=", this.d, Separators.RPAREN);
    }
}
