package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jnh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16812a;
    public final String b;
    public final n0x c;
    public final String d;

    public jnh(n0x n0xVar, String str, String str2, String str3) {
        this.f16812a = str;
        this.b = str2;
        this.c = n0xVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnh)) {
            return false;
        }
        jnh jnhVar = (jnh) obj;
        return this.f16812a.equals(jnhVar.f16812a) && this.b.equals(jnhVar.b) && this.c.equals(jnhVar.c) && this.d.equals(jnhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f140.f(this.c, ua80.b(this.f16812a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyberTournamentPositionItemUiModel(id=", this.f16812a, ", place=", this.b, ", image=");
        sbN.append(this.c);
        sbN.append(", prize=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
