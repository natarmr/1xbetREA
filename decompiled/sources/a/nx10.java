package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f24262a;
    public final List b;

    public nx10(iz30 iz30Var, List list) {
        list.getClass();
        this.f24262a = iz30Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx10)) {
            return false;
        }
        nx10 nx10Var = (nx10) obj;
        return this.f24262a == nx10Var.f24262a && Intrinsics.d(this.b, nx10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24262a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemOneXGamesModel(menuItem=" + this.f24262a + ", games=" + this.b + Separators.RPAREN;
    }
}
