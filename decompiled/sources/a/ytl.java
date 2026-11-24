package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ytl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43223a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ytl(String str, String str2, String str3, String str4, String str5) {
        brm0.B(str3, str4, str5);
        this.f43223a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytl)) {
            return false;
        }
        ytl ytlVar = (ytl) obj;
        return this.f43223a.equals(ytlVar.f43223a) && this.b.equals(ytlVar.b) && Intrinsics.d(this.c, ytlVar.c) && Intrinsics.d(this.d, ytlVar.d) && Intrinsics.d(this.e, ytlVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f43223a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DsBottomSheetConfirmLanguageModel(currentLanguage=", this.f43223a, ", chosenLanguage=", this.b, ", rebootDescription=");
        f140.v(sbN, this.c, ", rebootNowTitle=", this.d, ", laterTitle=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
