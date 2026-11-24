package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qam implements sam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28402a;
    public final String b;
    public final oam c;

    public qam(String str, String str2, oam oamVar) {
        str.getClass();
        str2.getClass();
        this.f28402a = str;
        this.b = str2;
        this.c = oamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qam)) {
            return false;
        }
        qam qamVar = (qam) obj;
        return Intrinsics.d(this.f28402a, qamVar.f28402a) && Intrinsics.d(this.b, qamVar.b) && Intrinsics.d(this.c, qamVar.c);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f28402a.hashCode() * 31, 31, this.b);
        oam oamVar = this.c;
        return iB + (oamVar == null ? 0 : oamVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Live(text=", this.f28402a, ", tagText=", this.b, ", timer=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
