package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0g0 f34546a;
    public final p0g0 b;
    public final vb9 c;
    public final ArrayList d;

    public tue(p0g0 p0g0Var, p0g0 p0g0Var2, vb9 vb9Var, ArrayList arrayList) {
        p0g0Var.getClass();
        p0g0Var2.getClass();
        vb9Var.getClass();
        this.f34546a = p0g0Var;
        this.b = p0g0Var2;
        this.c = vb9Var;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tue)) {
            return false;
        }
        tue tueVar = (tue) obj;
        return Intrinsics.d(this.f34546a, tueVar.f34546a) && Intrinsics.d(this.b, tueVar.b) && Intrinsics.d(this.c, tueVar.c) && this.d.equals(tueVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f34546a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BetBuilderConfiguredModel(currentResultCoef=" + this.f34546a + ", previousResultCoef=" + this.b + ", builderCouponModel=" + this.c + ", configuredEvents=" + this.d + Separators.RPAREN;
    }
}
