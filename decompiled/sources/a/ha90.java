package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ha90 implements ka90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12714a;
    public final k790 b;
    public final lun c;
    public final boolean d;

    public ha90(boolean z, k790 k790Var) {
        this.f12714a = z;
        this.b = k790Var;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.c = lunVar;
        this.d = k790Var != null ? k790Var.f17810a : false;
    }

    @Override // a.ka90
    public final boolean a() {
        return this.f12714a;
    }

    @Override // a.ka90
    public final k790 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha90)) {
            return false;
        }
        ha90 ha90Var = (ha90) obj;
        return this.f12714a == ha90Var.f12714a && Intrinsics.d(this.b, ha90Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f12714a) * 31;
        k790 k790Var = this.b;
        return iHashCode + (k790Var == null ? 0 : k790Var.hashCode());
    }

    public final String toString() {
        return "ErrorData(reloadEnable=" + this.f12714a + ", paymentParams=" + this.b + Separators.RPAREN;
    }
}
