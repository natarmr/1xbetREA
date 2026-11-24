package a;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kr30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyw f18747a;
    public final Map b;

    public kr30(dyw dywVar, Map map) {
        this.f18747a = dywVar;
        this.b = aac.f0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr30)) {
            return false;
        }
        kr30 kr30Var = (kr30) obj;
        return Intrinsics.d(this.f18747a, kr30Var.f18747a) && Intrinsics.d(this.b, kr30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18747a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.f18747a + ", extras=" + this.b + Separators.RPAREN;
    }
}
