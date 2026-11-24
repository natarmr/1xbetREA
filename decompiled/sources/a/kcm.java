package a;

import android.gov.nist.core.Separators;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final class kcm implements lcm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f18067a;
    public final String b;
    public final SimpleDate c;

    public kcm(n0x n0xVar, String str, SimpleDate simpleDate) {
        this.f18067a = n0xVar;
        this.b = str;
        this.c = simpleDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcm)) {
            return false;
        }
        kcm kcmVar = (kcm) obj;
        return this.f18067a.equals(kcmVar.f18067a) && this.b.equals(kcmVar.b) && this.c.equals(kcmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f18067a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PlayerWithDate(image=" + this.f18067a + ", name=" + this.b + ", date=" + this.c + Separators.RPAREN;
    }
}
