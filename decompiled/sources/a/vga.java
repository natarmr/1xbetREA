package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0n f37372a;
    public final String b;
    public final String c;
    public final kpm d;
    public final ows0 e;
    public final ows0 f;

    public vga(e0n e0nVar, String str, String str2, kpm kpmVar, ows0 ows0Var, ows0 ows0Var2) {
        str.getClass();
        str2.getClass();
        this.f37372a = e0nVar;
        this.b = str;
        this.c = str2;
        this.d = kpmVar;
        this.e = ows0Var;
        this.f = ows0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vga)) {
            return false;
        }
        vga vgaVar = (vga) obj;
        return Intrinsics.d(this.f37372a, vgaVar.f37372a) && Intrinsics.d(this.b, vgaVar.b) && Intrinsics.d(this.c, vgaVar.c) && this.d.equals(vgaVar.d) && this.e.equals(vgaVar.e) && this.f.equals(vgaVar.f);
    }

    public final int hashCode() {
        e0n e0nVar = this.f37372a;
        return this.f.hashCode() + ((this.e.hashCode() + dw9.c(this.d, ua80.b(ua80.b((e0nVar == null ? 0 : e0nVar.hashCode()) * 31, 31, this.b), 31, this.c), 31)) * 31);
    }

    public final String toString() {
        return "TwoOpponents(timerModel=" + this.f37372a + ", championshipLabel=" + this.b + ", infoLabel=" + this.c + ", scoreSection=" + this.d + ", teamOneModel=" + this.e + ", teamTwoModel=" + this.f + Separators.RPAREN;
    }
}
