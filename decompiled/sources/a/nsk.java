package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class nsk implements qsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24053a;
    public final mqk b;
    public final boolean c;

    public nsk(String str, mqk mqkVar, boolean z) {
        this.f24053a = str;
        this.b = mqkVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsk)) {
            return false;
        }
        nsk nskVar = (nsk) obj;
        return this.f24053a.equals(nskVar.f24053a) && this.b.equals(nskVar.b) && this.c == nskVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((pt20.f27543a.hashCode() + ((this.b.hashCode() + twn.a(R.drawable.cybergames_tablet_header_placeholder, this.f24053a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.cybergames_tablet_header_placeholder, "EventFocus(backgroundImageUrl=", this.f24053a, ", placeholderUrl=", ", headerUiModel=");
        sbP.append(this.b);
        sbP.append(", marketExpandButtonUiModel=");
        sbP.append(pt20.f27543a);
        sbP.append(", needExtraAppBarSpace=");
        return rw2.p(sbP, this.c, Separators.RPAREN);
    }
}
