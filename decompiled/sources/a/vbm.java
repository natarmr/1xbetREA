package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class vbm implements ybm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f37147a;
    public final tbm b;

    public vbm(n0x n0xVar, tbm tbmVar) {
        ubm ubmVar = ubm.f35388a;
        this.f37147a = n0xVar;
        this.b = tbmVar;
    }

    @Override // a.ybm
    public final tbm a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbm)) {
            return false;
        }
        vbm vbmVar = (vbm) obj;
        if (!this.f37147a.equals(vbmVar.f37147a)) {
            return false;
        }
        ubm ubmVar = ubm.f35388a;
        return this.b.equals(vbmVar.b);
    }

    @Override // a.ybm
    public final long getId() {
        return 1L;
    }

    public final int hashCode() {
        return this.b.hashCode() + twn.a(R.drawable.ic_glyph_cyber_gamepad, (ubm.f35388a.hashCode() + f140.f(this.f37147a, Long.hashCode(1L) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "Icon(id=1, icon=" + this.f37147a + ", iconType=" + ubm.f35388a + ", placeholderRes=" + R.drawable.ic_glyph_cyber_gamepad + ", chevronType=" + this.b + Separators.RPAREN;
    }
}
