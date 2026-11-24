package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gb30 implements kb30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10997a;
    public final db30 b;
    public final boolean c;

    public gb30(String str, db30 db30Var, boolean z) {
        str.getClass();
        this.f10997a = str;
        this.b = db30Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb30)) {
            return false;
        }
        gb30 gb30Var = (gb30) obj;
        return Intrinsics.d(this.f10997a, gb30Var.f10997a) && this.b.equals(gb30Var.b) && this.c == gb30Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f10997a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(eventDescription=");
        sb.append(this.f10997a);
        sb.append(", matchInfoStyle=");
        sb.append(this.b);
        sb.append(", expanded=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
