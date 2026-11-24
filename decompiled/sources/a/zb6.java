package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zb6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44099a;
    public final String b;
    public final String c;
    public final String d;

    public zb6(String str, String str2, String str3, String str4) {
        str3.getClass();
        this.f44099a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb6)) {
            return false;
        }
        zb6 zb6Var = (zb6) obj;
        return this.f44099a.equals(zb6Var.f44099a) && this.b.equals(zb6Var.b) && Intrinsics.d(this.c, zb6Var.c) && this.d.equals(zb6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f44099a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("BestHeroInfoUiModel(heroIcon=", this.f44099a, ", heroName=", this.b, ", heroMaps="), this.c, ", heroWinRate=", this.d, Separators.RPAREN);
    }
}
