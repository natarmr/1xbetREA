package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class aoh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final unh f1200a;
    public final unh b;

    public aoh(unh unhVar, unh unhVar2) {
        this.f1200a = unhVar;
        this.b = unhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoh)) {
            return false;
        }
        aoh aohVar = (aoh) obj;
        return this.f1200a.equals(aohVar.f1200a) && this.b.equals(aohVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_circle_globe) + ((this.b.hashCode() + twn.a(R.drawable.ic_glyph_circle_globe, this.f1200a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "CyberTransferStatusCellUiModel(oldTeamImage=" + this.f1200a + ", oldTeamImagePlaceholder=" + R.drawable.ic_glyph_circle_globe + ", newTeamImage=" + this.b + ", newTeamImagePlaceholder=" + R.drawable.ic_glyph_circle_globe + Separators.RPAREN;
    }
}
