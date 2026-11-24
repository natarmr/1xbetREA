package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class fxf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10306a;
    public final String b;
    public final dtb c;
    public final exf d;

    public fxf(int i, String str, dtb dtbVar, exf exfVar) {
        str.getClass();
        this.f10306a = i;
        this.b = str;
        this.c = dtbVar;
        this.d = exfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxf)) {
            return false;
        }
        fxf fxfVar = (fxf) obj;
        return this.f10306a == fxfVar.f10306a && Intrinsics.d(this.b, fxfVar.b) && Intrinsics.d(this.c, fxfVar.c) && this.d == fxfVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(Integer.hashCode(this.f10306a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f10306a, "CustomButtonUiModel(icon=", ", title=", this.b, ", badgeType=");
        sbR.append(this.c);
        sbR.append(", type=");
        sbR.append(this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
