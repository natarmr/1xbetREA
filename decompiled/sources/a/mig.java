package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21844a;
    public final List b;
    public final wcb c;
    public final String d;
    public final Map e;

    public mig(Object obj, List list, wcb wcbVar, String str, Map map) {
        list.getClass();
        wcbVar.getClass();
        str.getClass();
        map.getClass();
        this.f21844a = obj;
        this.b = list;
        this.c = wcbVar;
        this.d = str;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mig)) {
            return false;
        }
        mig migVar = (mig) obj;
        Object obj2 = migVar.f21844a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f21844a, obj2) && Intrinsics.d(this.b, migVar.b) && Intrinsics.d(this.c, migVar.c) && Intrinsics.d(this.d, migVar.d) && Intrinsics.d(this.e, migVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b((this.c.hashCode() + dw9.a(j0g0.b(this.f21844a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("CyberChampsPageScenarioModel(champs=", j0g0.d(this.f21844a), ", favoriteIds=", this.b, ", champImagesHolder=");
        sbF.append(this.c);
        sbF.append(", searchQuery=");
        sbF.append(this.d);
        sbF.append(", cyberDisciplineIcons=");
        sbF.append(this.e);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
