package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class swo0 {
    public static final qwo0 Companion = new qwo0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f32931a;
    public final String b;

    public /* synthetic */ swo0(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f32931a = null;
        } else {
            this.f32931a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swo0)) {
            return false;
        }
        swo0 swo0Var = (swo0) obj;
        return Intrinsics.d(this.f32931a, swo0Var.f32931a) && Intrinsics.d(this.b, swo0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.f32931a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TaxStatusResponse(taxEnabled=" + this.f32931a + ", infoMessage=" + this.b + Separators.RPAREN;
    }
}
