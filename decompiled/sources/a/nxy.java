package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24305a;
    public final String b;
    public final a570 c;
    public final hds d;
    public final boolean e;
    public final boolean f;

    public nxy(long j, String str, a570 a570Var, hds hdsVar, boolean z, boolean z2) {
        str.getClass();
        a570Var.getClass();
        hdsVar.getClass();
        this.f24305a = j;
        this.b = str;
        this.c = a570Var;
        this.d = hdsVar;
        this.e = z;
        this.f = z2;
    }

    public static nxy a(nxy nxyVar) {
        long j = nxyVar.f24305a;
        String str = nxyVar.b;
        a570 a570Var = nxyVar.c;
        hds hdsVar = nxyVar.d;
        boolean z = nxyVar.f;
        nxyVar.getClass();
        str.getClass();
        a570Var.getClass();
        hdsVar.getClass();
        return new nxy(j, str, a570Var, hdsVar, true, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxy)) {
            return false;
        }
        nxy nxyVar = (nxy) obj;
        return this.f24305a == nxyVar.f24305a && Intrinsics.d(this.b, nxyVar.b) && Intrinsics.d(this.c, nxyVar.c) && Intrinsics.d(this.d, nxyVar.d) && this.e == nxyVar.e && this.f == nxyVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e((this.d.hashCode() + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f24305a) * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f24305a, "LastActionGameModel(id=", ", gameName=", this.b);
        sbO.append(", gameType=");
        sbO.append(this.c);
        sbO.append(", imageInfo=");
        sbO.append(this.d);
        w6x.A(", underMaintenance=", ", enable=", sbO, this.e, this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
