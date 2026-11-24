package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lss0 implements nss0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20597a;
    public final String b;

    public lss0(String str, String str2) {
        str.getClass();
        this.f20597a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lss0)) {
            return false;
        }
        lss0 lss0Var = (lss0) obj;
        return Intrinsics.d(this.f20597a, lss0Var.f20597a) && this.b.equals(lss0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ua80.b(twn.a(R.drawable.tv_bet_score, Integer.hashCode(R.drawable.tv_bet_back) * 31, 31), 31, this.f20597a);
    }

    public final String toString() {
        return ua80.m(dw9.t("Content(backImage=", R.drawable.tv_bet_back, ", scoreImage=", ", amount=", R.drawable.tv_bet_score), this.f20597a, ", currency=", this.b, Separators.RPAREN);
    }
}
