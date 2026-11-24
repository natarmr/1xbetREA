package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class old0 implements qld0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25448a;
    public final ArrayList b;

    public old0(lc00 lc00Var, ArrayList arrayList) {
        lc00Var.getClass();
        this.f25448a = lc00Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof old0)) {
            return false;
        }
        old0 old0Var = (old0) obj;
        return Intrinsics.d(this.f25448a, old0Var.f25448a) && this.b.equals(old0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25448a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(shownItems=" + this.f25448a + ", enabledItems=" + this.b + Separators.RPAREN;
    }
}
