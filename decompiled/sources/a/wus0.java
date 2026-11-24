package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wus0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39805a;
    public final long b;
    public final String c;
    public final List d;
    public final List e;
    public final vus0 f;

    public wus0(String str, long j, String str2, List list, List list2, vus0 vus0Var) {
        list.getClass();
        list2.getClass();
        this.f39805a = str;
        this.b = j;
        this.c = str2;
        this.d = list;
        this.e = list2;
        this.f = vus0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wus0)) {
            return false;
        }
        wus0 wus0Var = (wus0) obj;
        return this.f39805a.equals(wus0Var.f39805a) && this.b == wus0Var.b && this.c.equals(wus0Var.c) && Intrinsics.d(this.d, wus0Var.d) && Intrinsics.d(this.e, wus0Var.e) && this.f.equals(wus0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(ua80.b(rw2.b(this.f39805a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "TwoFactorAuthenticationCheckCodeModel(message=", this.f39805a, ", messageId=");
        ua80.t(", password=", this.c, ", codeTypes=", sbO, this.d);
        sbO.append(", codeTypesRepeat=");
        sbO.append(this.e);
        sbO.append(", auth=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
