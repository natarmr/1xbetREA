package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ao60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f1187a;
    public final o0x b;
    public final m0x c;

    public ao60(o0x o0xVar, o0x o0xVar2, m0x m0xVar) {
        this.f1187a = o0xVar;
        this.b = o0xVar2;
        this.c = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao60)) {
            return false;
        }
        ao60 ao60Var = (ao60) obj;
        return this.f1187a.equals(ao60Var.f1187a) && this.b.equals(ao60Var.b) && this.c.equals(ao60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w6x.d(this.b, this.f1187a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "OneXGamePresetUiModel(image=" + this.f1187a + ", fallbackImage=" + this.b + ", placeholder=" + this.c + Separators.RPAREN;
    }
}
