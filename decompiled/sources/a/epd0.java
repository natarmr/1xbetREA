package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class epd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8182a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public epd0(String str, String str2, String str3, String str4, String str5, boolean z) {
        str4.getClass();
        this.f8182a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj instanceof epd0) {
                epd0 epd0Var = (epd0) obj;
                if (this.f8182a == epd0Var.f8182a && this.b.equals(epd0Var.b) && this.c.equals(epd0Var.c) && this.d.equals(epd0Var.d) && Intrinsics.d(this.e, epd0Var.e)) {
                    String str = epd0Var.f;
                    String str2 = this.f;
                    if (str2 == null) {
                        if (str == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (str == null) {
                        zEquals = false;
                    } else {
                        zEquals = str2.equals(str);
                    }
                    if (!zEquals) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(ua80.b(Boolean.hashCode(this.f8182a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String strL = kng0.l("First(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("Second(value=", this.c, Separators.RPAREN);
        String strL3 = kng0.l("Third(value=", this.d, Separators.RPAREN);
        String str = this.f;
        String strL4 = str == null ? "null" : kng0.l("Max(value=", str, Separators.RPAREN);
        StringBuilder sbQ = axq.q("QuickBetsUiModel(enabled=", ", firstBet=", strL, this.f8182a, ", secondBet=");
        f140.v(sbQ, strL2, ", thirdBet=", strL3, ", currencySymbol=");
        return ua80.m(sbQ, this.e, ", maxBet=", strL4, Separators.RPAREN);
    }
}
