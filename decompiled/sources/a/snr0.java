package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class snr0 implements vnr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32509a;
    public final String b;
    public final gmq c;

    public snr0(String str, String str2, gmq gmqVar) {
        str.getClass();
        this.f32509a = str;
        this.b = str2;
        this.c = gmqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snr0)) {
            return false;
        }
        snr0 snr0Var = (snr0) obj;
        return Intrinsics.d(this.f32509a, snr0Var.f32509a) && this.b.equals(snr0Var.b) && this.c.equals(snr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f32509a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Toto1xHeaderBanner(tirageValue=", this.f32509a, ", betAcceptTimeLimit=", this.b, ", untilEndTimerValue=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
