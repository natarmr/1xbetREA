package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class psk implements qsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27519a;
    public final int b;
    public final String c;
    public final String d;
    public final qt20 e;

    public psk(String str, int i, String str2, String str3, qt20 qt20Var) {
        this.f27519a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = qt20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psk)) {
            return false;
        }
        psk pskVar = (psk) obj;
        return this.f27519a.equals(pskVar.f27519a) && this.b == pskVar.b && this.c.equals(pskVar.c) && this.d.equals(pskVar.d) && this.e.equals(pskVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(R.drawable.ic_glyph_cyber_gamepad, ua80.b(twn.a(this.b, this.f27519a.hashCode() * 31, 31), 31, this.c), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "IconFocus(backgroundImageUrl=", this.f27519a, ", placeholderUrl=", ", disciplineImageUrl=");
        twn.w(R.drawable.ic_glyph_cyber_gamepad, this.c, ", placeholderDiscipline=", ", name=", sbP);
        sbP.append(this.d);
        sbP.append(", marketExpandButtonUiModel=");
        sbP.append(this.e);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
