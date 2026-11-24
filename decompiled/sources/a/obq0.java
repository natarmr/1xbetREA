package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class obq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24995a;
    public final uaq0 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;

    public obq0(List list, uaq0 uaq0Var, boolean z, boolean z2, String str, String str2) {
        list.getClass();
        uaq0Var.getClass();
        this.f24995a = list;
        this.b = uaq0Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = str2;
    }

    public static obq0 a(obq0 obq0Var, uaq0 uaq0Var, boolean z, boolean z2, String str, String str2, int i) {
        uaq0 uaq0Var2 = uaq0Var;
        List list = obq0Var.f24995a;
        if ((i & 2) != 0) {
            uaq0Var2 = obq0Var.b;
        }
        if ((i & 4) != 0) {
            z = obq0Var.c;
        }
        if ((i & 8) != 0) {
            z2 = obq0Var.d;
        }
        if ((i & 16) != 0) {
            str = obq0Var.e;
        }
        if ((i & 32) != 0) {
            str2 = obq0Var.f;
        }
        String str3 = str2;
        obq0Var.getClass();
        list.getClass();
        uaq0Var2.getClass();
        String str4 = str;
        boolean z3 = z2;
        return new obq0(list, uaq0Var2, z, z3, str4, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obq0)) {
            return false;
        }
        obq0 obq0Var = (obq0) obj;
        return Intrinsics.d(this.f24995a, obq0Var.f24995a) && this.b == obq0Var.b && this.c == obq0Var.c && this.d == obq0Var.d && this.e.equals(obq0Var.e) && this.f.equals(obq0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(brm0.e(brm0.e((this.b.hashCode() + (this.f24995a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeState(availableThemes=");
        sb.append(this.f24995a);
        sb.append(", currentTheme=");
        sb.append(this.b);
        sb.append(", timeTableSelected=");
        ua80.u(", timeTableEnabled=", ", turnOnTime=", sb, this.c, this.d);
        return ua80.m(sb, this.e, ", turnOffTime=", this.f, Separators.RPAREN);
    }
}
