package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mur implements nur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22425a;
    public final sso0 b;

    public mur(String str, sso0 sso0Var) {
        str.getClass();
        this.f22425a = str;
        this.b = sso0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mur)) {
            return false;
        }
        mur murVar = (mur) obj;
        return Intrinsics.d(this.f22425a, murVar.f22425a) && this.b.equals(murVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22425a.hashCode() * 31);
    }

    public final String toString() {
        return "OneTag(firstTagText=" + this.f22425a + ", firstTagStyle=" + this.b + Separators.RPAREN;
    }
}
