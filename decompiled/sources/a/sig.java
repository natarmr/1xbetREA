package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final class sig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberChampsMainParams f32262a;
    public final sip b;
    public final sff0 c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final wcb g;
    public final mig h;
    public final String i;
    public final List j;
    public final boolean k;
    public final List l;

    public sig(CyberChampsMainParams cyberChampsMainParams, sip sipVar, sff0 sff0Var, List list, boolean z, boolean z2, wcb wcbVar, mig migVar, String str, List list2, boolean z3, List list3) {
        cyberChampsMainParams.getClass();
        sipVar.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f32262a = cyberChampsMainParams;
        this.b = sipVar;
        this.c = sff0Var;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = wcbVar;
        this.h = migVar;
        this.i = str;
        this.j = list2;
        this.k = z3;
        this.l = list3;
    }

    public static sig a(sig sigVar, boolean z, wcb wcbVar, mig migVar, String str, List list, boolean z2, List list2, int i) {
        CyberChampsMainParams cyberChampsMainParams = sigVar.f32262a;
        sip sipVar = sigVar.b;
        sff0 sff0Var = sigVar.c;
        List list3 = sigVar.d;
        boolean z3 = sigVar.e;
        if ((i & 32) != 0) {
            z = sigVar.f;
        }
        boolean z4 = z;
        wcb wcbVar2 = (i & 64) != 0 ? sigVar.g : wcbVar;
        mig migVar2 = (i & 128) != 0 ? sigVar.h : migVar;
        String str2 = (i & 256) != 0 ? sigVar.i : str;
        List list4 = (i & 512) != 0 ? sigVar.j : list;
        boolean z5 = (i & 1024) != 0 ? sigVar.k : z2;
        List list5 = (i & 2048) != 0 ? sigVar.l : list2;
        sigVar.getClass();
        cyberChampsMainParams.getClass();
        sipVar.getClass();
        list3.getClass();
        wcbVar2.getClass();
        str2.getClass();
        list4.getClass();
        list5.getClass();
        return new sig(cyberChampsMainParams, sipVar, sff0Var, list3, z3, z4, wcbVar2, migVar2, str2, list4, z5, list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sig)) {
            return false;
        }
        sig sigVar = (sig) obj;
        return Intrinsics.d(this.f32262a, sigVar.f32262a) && this.b == sigVar.b && this.c.equals(sigVar.c) && Intrinsics.d(this.d, sigVar.d) && this.e == sigVar.e && this.f == sigVar.f && this.g.equals(sigVar.g) && Intrinsics.d(this.h, sigVar.h) && this.i.equals(sigVar.i) && Intrinsics.d(this.j, sigVar.j) && this.k == sigVar.k && Intrinsics.d(this.l, sigVar.l);
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + brm0.e(brm0.e(dw9.a(cs0.c(this.c, (this.b.hashCode() + (this.f32262a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f)) * 31;
        mig migVar = this.h;
        return this.l.hashCode() + brm0.e(dw9.a(ua80.b((iHashCode + (migVar == null ? 0 : migVar.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberChampsPageStateModel(params=");
        sb.append(this.f32262a);
        sb.append(", feedKind=");
        sb.append(this.b);
        sb.append(", remoteConfig=");
        sb.append(this.c);
        sb.append(", specialEventList=");
        sb.append(this.d);
        sb.append(", bettingDisabled=");
        ua80.u(", isConnected=", ", champImagesHolder=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", scenarioModel=");
        sb.append(this.h);
        sb.append(", searchQuery=");
        cs0.y(this.i, ", favoriteIds=", ", isMultiselectEnabled=", sb, this.j);
        sb.append(this.k);
        sb.append(", selectedChampIds=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
