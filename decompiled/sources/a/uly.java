package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35895a;
    public final Boolean b;
    public final int c;
    public final int d;

    public uly(int i, Boolean bool, int i2, int i3, int i4) {
        i = (i4 & 1) != 0 ? -1 : i;
        bool = (i4 & 2) != 0 ? null : bool;
        i2 = (i4 & 4) != 0 ? 0 : i2;
        i3 = (i4 & 8) != 0 ? -1 : i3;
        this.f35895a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
    }

    public final k3x a(boolean z) {
        int i = this.f35895a;
        ply plyVar = new ply(i);
        if (i == -1) {
            plyVar = null;
        }
        int i2 = plyVar != null ? plyVar.f27207a : 0;
        Boolean bool = this.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.c;
        bmy bmyVar = new bmy(i3);
        if (i3 == 0) {
            bmyVar = null;
        }
        int i4 = bmyVar != null ? bmyVar.f2857a : 1;
        int i5 = this.d;
        j3x j3xVar = i5 != -1 ? new j3x(i5) : null;
        return new k3x(z, i2, zBooleanValue, i4, j3xVar != null ? j3xVar.f15856a : 1, rs00.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uly)) {
            return false;
        }
        uly ulyVar = (uly) obj;
        return this.f35895a == ulyVar.f35895a && Intrinsics.d(this.b, ulyVar.b) && this.c == ulyVar.c && this.d == ulyVar.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f35895a) * 31;
        Boolean bool = this.b;
        return twn.a(this.d, twn.a(this.c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        String strA = ply.a(this.f35895a);
        String strA2 = bmy.a(this.c);
        String strA3 = j3x.a(this.d);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(strA);
        sb.append(", autoCorrectEnabled=");
        sb.append(this.b);
        sb.append(", keyboardType=");
        return ua80.m(sb, strA2, ", imeAction=", strA3, ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
    }
}
