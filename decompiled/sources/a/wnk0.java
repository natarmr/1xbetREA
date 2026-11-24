package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wnk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39454a;
    public final ohk b;
    public final vnq0 c;

    public wnk0(String str, ohk ohkVar, vnq0 vnq0Var) {
        str.getClass();
        ohkVar.getClass();
        this.f39454a = str;
        this.b = ohkVar;
        this.c = vnq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnk0)) {
            return false;
        }
        wnk0 wnk0Var = (wnk0) obj;
        return Intrinsics.d(this.f39454a, wnk0Var.f39454a) && this.b == wnk0Var.b && Intrinsics.d(this.c, wnk0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f39454a.hashCode() * 31)) * 31;
        vnq0 vnq0Var = this.c;
        return iHashCode + (vnq0Var == null ? 0 : vnq0Var.hashCode());
    }

    public final String toString() {
        return "SpecialEventCollapsingHeaderUiModel(title=" + this.f39454a + ", deviceSize=" + this.b + ", timerUiModel=" + this.c + Separators.RPAREN;
    }
}
