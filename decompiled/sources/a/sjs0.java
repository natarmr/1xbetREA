package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class sjs0 {
    public static final rjs0 Companion = new rjs0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32317a;
    public final String b;
    public final String c;

    public /* synthetic */ sjs0(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f32317a = null;
        } else {
            this.f32317a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjs0)) {
            return false;
        }
        sjs0 sjs0Var = (sjs0) obj;
        return Intrinsics.d(this.f32317a, sjs0Var.f32317a) && Intrinsics.d(this.b, sjs0Var.b) && Intrinsics.d(this.c, sjs0Var.c);
    }

    public final int hashCode() {
        String str = this.f32317a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("TransfersPlayerResponse(nickname=", this.f32317a, ", image=", this.b, ", playerImageS3="), this.c, Separators.RPAREN);
    }
}
