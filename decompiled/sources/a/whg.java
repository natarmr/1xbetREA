package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final class whg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberChampsMainParams f39166a;
    public final cnb b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final hhq0 f;
    public final boolean g;
    public final boolean h;

    public whg(CyberChampsMainParams cyberChampsMainParams, cnb cnbVar, String str, boolean z, boolean z2, hhq0 hhq0Var, boolean z3, boolean z4) {
        cyberChampsMainParams.getClass();
        str.getClass();
        hhq0Var.getClass();
        this.f39166a = cyberChampsMainParams;
        this.b = cnbVar;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = hhq0Var;
        this.g = z3;
        this.h = z4;
    }

    public static whg a(whg whgVar, cnb cnbVar, boolean z, hhq0 hhq0Var, boolean z2, int i) {
        CyberChampsMainParams cyberChampsMainParams = whgVar.f39166a;
        if ((i & 2) != 0) {
            cnbVar = whgVar.b;
        }
        cnb cnbVar2 = cnbVar;
        String str = (i & 4) != 0 ? whgVar.c : "";
        if ((i & 8) != 0) {
            z = whgVar.d;
        }
        boolean z3 = z;
        boolean z4 = whgVar.e;
        if ((i & 32) != 0) {
            hhq0Var = whgVar.f;
        }
        hhq0 hhq0Var2 = hhq0Var;
        boolean z5 = whgVar.g;
        if ((i & 128) != 0) {
            z2 = whgVar.h;
        }
        whgVar.getClass();
        cyberChampsMainParams.getClass();
        cnbVar2.getClass();
        str.getClass();
        hhq0Var2.getClass();
        return new whg(cyberChampsMainParams, cnbVar2, str, z3, z4, hhq0Var2, z5, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whg)) {
            return false;
        }
        whg whgVar = (whg) obj;
        return Intrinsics.d(this.f39166a, whgVar.f39166a) && Intrinsics.d(this.b, whgVar.b) && Intrinsics.d(this.c, whgVar.c) && this.d == whgVar.d && this.e == whgVar.e && Intrinsics.d(this.f, whgVar.f) && this.g == whgVar.g && this.h == whgVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e((this.f.hashCode() + brm0.e(brm0.e(ua80.b((this.b.hashCode() + (this.f39166a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampsMainStateModel(params=");
        sb.append(this.f39166a);
        sb.append(", selectedTabKey=");
        sb.append(this.b);
        sb.append(", searchQuery=");
        brm0.C(this.c, ", isStreamFilterEnabled=", ", isMultiselectEnabled=", sb, this.d);
        sb.append(this.e);
        sb.append(", timeFilterModel=");
        sb.append(this.f);
        sb.append(", isLiveEmpty=");
        return ohs0.p(", isSearchActive=", Separators.RPAREN, sb, this.g, this.h);
    }

    public /* synthetic */ whg(CyberChampsMainParams cyberChampsMainParams, cnb cnbVar, String str, boolean z, boolean z2, hhq0 hhq0Var, boolean z3, int i) {
        this(cyberChampsMainParams, cnbVar, str, z, z2, hhq0Var, (i & 64) != 0 ? false : z3, false);
    }
}
