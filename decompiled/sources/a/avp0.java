package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class avp0 {
    public static final zup0 Companion = new zup0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1538a;
    public final String b;

    public /* synthetic */ avp0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f1538a = null;
        } else {
            this.f1538a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avp0)) {
            return false;
        }
        avp0 avp0Var = (avp0) obj;
        return Intrinsics.d(this.f1538a, avp0Var.f1538a) && Intrinsics.d(this.b, avp0Var.b);
    }

    public final int hashCode() {
        String str = this.f1538a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("TelegramBotCodeResponse(deepLink=", this.f1538a, ", code=", this.b, Separators.RPAREN);
    }
}
