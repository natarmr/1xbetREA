package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gwd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12020a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public gwd(String str, String str2, String str3, String str4, String str5, String str6) {
        brm0.B(str4, str5, str6);
        this.f12020a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwd)) {
            return false;
        }
        gwd gwdVar = (gwd) obj;
        return this.f12020a.equals(gwdVar.f12020a) && this.b.equals(gwdVar.b) && this.c.equals(gwdVar.c) && Intrinsics.d(this.d, gwdVar.d) && Intrinsics.d(this.e, gwdVar.e) && Intrinsics.d(this.f, gwdVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f12020a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ConfirmChooseLanguageBottomSheetState(currentLanguage=", this.f12020a, ", chosenLanguage=", this.b, ", chosenLanguageEng=");
        f140.v(sbN, this.c, ", rebootDescription=", this.d, ", rebootNowTitle=");
        return ua80.m(sbN, this.e, ", laterTitle=", this.f, Separators.RPAREN);
    }
}
