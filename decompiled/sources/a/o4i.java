package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24636a;
    public final c280 b;
    public final c280 c;

    public o4i(String str, c280 c280Var, c280 c280Var2) {
        str.getClass();
        this.f24636a = str;
        this.b = c280Var;
        this.c = c280Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4i)) {
            return false;
        }
        o4i o4iVar = (o4i) obj;
        return Intrinsics.d(this.f24636a, o4iVar.f24636a) && this.b.equals(o4iVar.b) && this.c.equals(o4iVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + hne.g(this.b, this.f24636a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "TeamUiModel(name=", this.f24636a, ", logoOne=", ", logoTwo=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
