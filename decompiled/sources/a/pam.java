package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pam implements sam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26660a;
    public final oam b;

    public pam(String str, oam oamVar) {
        str.getClass();
        this.f26660a = str;
        this.b = oamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pam)) {
            return false;
        }
        pam pamVar = (pam) obj;
        return Intrinsics.d(this.f26660a, pamVar.f26660a) && Intrinsics.d(this.b, pamVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f26660a.hashCode() * 31;
        oam oamVar = this.b;
        return iHashCode + (oamVar == null ? 0 : oamVar.hashCode());
    }

    public final String toString() {
        return "Line(text=" + this.f26660a + ", timer=" + this.b + Separators.RPAREN;
    }
}
