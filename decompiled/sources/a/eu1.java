package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class eu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8396a;
    public final sso0 b;

    public eu1(String str, sso0 sso0Var) {
        str.getClass();
        this.f8396a = str;
        this.b = sso0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu1)) {
            return false;
        }
        eu1 eu1Var = (eu1) obj;
        return Intrinsics.d(this.f8396a, eu1Var.f8396a) && this.b.equals(eu1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8396a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorTournamentFullInfoHeaderTagUiModel(text=" + this.f8396a + ", style=" + this.b + Separators.RPAREN;
    }
}
