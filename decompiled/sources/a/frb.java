package a;

import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class frb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbn f10010a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final SpannableStringBuilder e;

    public frb(kbn kbnVar, boolean z, boolean z2, String str, SpannableStringBuilder spannableStringBuilder) {
        this.f10010a = kbnVar;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = spannableStringBuilder;
    }

    public static frb a(frb frbVar, kbn kbnVar, boolean z, boolean z2, String str, SpannableStringBuilder spannableStringBuilder, int i) {
        if ((i & 1) != 0) {
            kbnVar = frbVar.f10010a;
        }
        kbn kbnVar2 = kbnVar;
        if ((i & 2) != 0) {
            z = frbVar.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = frbVar.c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            str = frbVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            spannableStringBuilder = frbVar.e;
        }
        frbVar.getClass();
        kbnVar2.getClass();
        return new frb(kbnVar2, z3, z4, str2, spannableStringBuilder);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof frb)) {
            return false;
        }
        frb frbVar = (frb) obj;
        return this.f10010a.equals(frbVar.f10010a) && this.b == frbVar.b && this.c == frbVar.c && this.d.equals(frbVar.d) && this.e.equals(frbVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(brm0.e(brm0.e(this.f10010a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiState(dualPhoneCountry=");
        sb.append(this.f10010a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", nextBtnEnabled=");
        f140.s(", phoneNumber=", this.d, ", bottomMessage=", sb, this.c);
        sb.append((Object) this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
