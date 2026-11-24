package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class svf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32862a;
    public final ldr0 b;

    public svf(ArrayList arrayList, ldr0 ldr0Var) {
        ldr0Var.getClass();
        this.f32862a = arrayList;
        this.b = ldr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svf)) {
            return false;
        }
        svf svfVar = (svf) obj;
        return this.f32862a.equals(svfVar.f32862a) && Intrinsics.d(this.b, svfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32862a.hashCode() * 31);
    }

    public final String toString() {
        return "CurrentLastGameModel(listPagerModel=" + this.f32862a + ", topRoundDescriptionModel=" + this.b + Separators.RPAREN;
    }
}
