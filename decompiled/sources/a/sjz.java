package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class sjz extends tjz {
    public final String d;
    public final i8m0 e;
    public final boolean f;

    public sjz(String str, i8m0 i8m0Var, boolean z) {
        super(R.string.verification, R.drawable.ic_glyph_document, true);
        this.d = str;
        this.e = i8m0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjz)) {
            return false;
        }
        sjz sjzVar = (sjz) obj;
        return this.d.equals(sjzVar.d) && this.e == sjzVar.e && this.f == sjzVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + w6x.g(this.e, this.d.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Verification(subtitle=");
        sb.append(this.d);
        sb.append(", completionStatus=");
        sb.append(this.e);
        sb.append(", isEnabled=");
        return rw2.p(sb, this.f, Separators.RPAREN);
    }
}
