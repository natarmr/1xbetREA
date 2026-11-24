package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uyh implements wyh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36488a;
    public final String b;
    public final String c;
    public final String d;
    public final tyh e;

    public uyh(String str, String str2, String str3, String str4, tyh tyhVar) {
        cs0.x(str, str2, str3, str4);
        this.f36488a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = tyhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyh)) {
            return false;
        }
        uyh uyhVar = (uyh) obj;
        return Intrinsics.d(this.f36488a, uyhVar.f36488a) && Intrinsics.d(this.b, uyhVar.b) && Intrinsics.d(this.c, uyhVar.c) && Intrinsics.d(this.d, uyhVar.d) && this.e.equals(uyhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f36488a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(title=", this.f36488a, ", subtitle=", this.b, ", authorizationButtonText=");
        f140.v(sbN, this.c, ", registrationButtonText=", this.d, ", pictureModel=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
