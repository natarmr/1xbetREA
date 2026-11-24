package a;

import android.content.Context;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class nf7 implements csz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23421a;
    public final String b;

    public nf7(int i, String str) {
        this.f23421a = i;
        this.b = str;
    }

    @Override // a.csz
    public final String a(Context context) {
        context.getClass();
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf7)) {
            return false;
        }
        nf7 nf7Var = (nf7) obj;
        return this.f23421a == nf7Var.f23421a && this.b.equals(nf7Var.b);
    }

    @Override // a.csz
    public final int getValue() {
        return this.f23421a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f23421a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f23421a, "BetLimitUiModel(bet=", ", text=", this.b, Separators.RPAREN);
    }
}
