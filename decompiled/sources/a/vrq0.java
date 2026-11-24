package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vrq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37914a;
    public final ugd b;

    public vrq0(String str, ugd ugdVar) {
        str.getClass();
        this.f37914a = str;
        this.b = ugdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vrq0) {
            vrq0 vrq0Var = (vrq0) obj;
            return Intrinsics.d(this.f37914a, vrq0Var.f37914a) && this.b == vrq0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37914a.hashCode() * 31);
    }

    public final String toString() {
        return "TitleRouteModel(title=" + this.f37914a + ", routeRunner=" + this.b + Separators.RPAREN;
    }
}
