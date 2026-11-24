package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sp10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32570a;
    public final String b;
    public final String c;

    public sp10(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f32570a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp10)) {
            return false;
        }
        sp10 sp10Var = (sp10) obj;
        return Intrinsics.d(this.f32570a, sp10Var.f32570a) && Intrinsics.d(this.b, sp10Var.b) && Intrinsics.d(this.c, sp10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f32570a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("MailRuKeys(id=", this.f32570a, ", privateKey=", this.b, ", callbackUrl="), this.c, Separators.RPAREN);
    }
}
