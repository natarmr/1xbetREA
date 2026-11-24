package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42759a;
    public final boolean b;
    public final sff0 c;
    public final boolean d;
    public final Locale e;
    public final boolean f;
    public final boolean g;
    public final viw h;

    public yjw(List list, boolean z, sff0 sff0Var, boolean z2, Locale locale, boolean z3, boolean z4, viw viwVar) {
        this.f42759a = list;
        this.b = z;
        this.c = sff0Var;
        this.d = z2;
        this.e = locale;
        this.f = z3;
        this.g = z4;
        this.h = viwVar;
    }

    public static yjw a(yjw yjwVar, boolean z, viw viwVar, int i) {
        List list = yjwVar.f42759a;
        boolean z2 = yjwVar.b;
        sff0 sff0Var = yjwVar.c;
        boolean z3 = yjwVar.d;
        Locale locale = yjwVar.e;
        boolean z4 = yjwVar.f;
        if ((i & 64) != 0) {
            z = yjwVar.g;
        }
        boolean z5 = z;
        if ((i & 128) != 0) {
            viwVar = yjwVar.h;
        }
        yjwVar.getClass();
        return new yjw(list, z2, sff0Var, z3, locale, z4, z5, viwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjw)) {
            return false;
        }
        yjw yjwVar = (yjw) obj;
        return Intrinsics.d(this.f42759a, yjwVar.f42759a) && this.b == yjwVar.b && this.c.equals(yjwVar.c) && this.d == yjwVar.d && this.e.equals(yjwVar.e) && this.f == yjwVar.f && this.g == yjwVar.g && Intrinsics.d(this.h, yjwVar.h);
    }

    public final int hashCode() {
        List list = this.f42759a;
        int iE = brm0.e(brm0.e((this.e.hashCode() + brm0.e(cs0.c(this.c, brm0.e((list == null ? 0 : list.hashCode()) * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f), 31, this.g);
        viw viwVar = this.h;
        return iE + (viwVar != null ? viwVar.hashCode() : 0);
    }

    public final String toString() {
        return "HomeStateModel(specialEventList=" + this.f42759a + ", bettingDisabled=" + this.b + ", remoteConfigModel=" + this.c + ", tablet=" + this.d + ", currentLocale=" + this.e + ", supportRtl=" + this.f + ", connected=" + this.g + ", scenarioModel=" + this.h + Separators.RPAREN;
    }
}
