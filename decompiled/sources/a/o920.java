package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetStringModel;

/* JADX INFO: loaded from: classes3.dex */
public final class o920 implements p920 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24860a;
    public final long b;
    public final String c;
    public final SuccessBetStringModel d;
    public final String e;

    public o920(String str, long j, String str2, SuccessBetStringModel successBetStringModel, String str3) {
        str2.getClass();
        this.f24860a = str;
        this.b = j;
        this.c = str2;
        this.d = successBetStringModel;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o920)) {
            return false;
        }
        o920 o920Var = (o920) obj;
        return this.f24860a.equals(o920Var.f24860a) && this.b == o920Var.b && Intrinsics.d(this.c, o920Var.c) && this.d.equals(o920Var.d) && this.e.equals(o920Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(rw2.b(this.f24860a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "ShowSuccessBet(betId=", this.f24860a, ", balanceId=");
        sbO.append(", coefficient=");
        sbO.append(this.c);
        sbO.append(", successBetStringModel=");
        sbO.append(this.d);
        return rw2.o(sbO, ", betTypeText=", this.e, Separators.RPAREN);
    }
}
