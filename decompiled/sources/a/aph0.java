package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class aph0 implements dph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wxf f1253a;
    public final a4x b;

    public aph0(wxf wxfVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f1253a = wxfVar;
        this.b = a4xVar;
    }

    public static aph0 a(aph0 aph0Var, a4x a4xVar) {
        wxf wxfVar = aph0Var.f1253a;
        a4xVar.getClass();
        return new aph0(wxfVar, a4xVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aph0)) {
            return false;
        }
        aph0 aph0Var = (aph0) obj;
        return this.f1253a.equals(aph0Var.f1253a) && Intrinsics.d(this.b, aph0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1253a.hashCode() * 31);
    }

    public final String toString() {
        return "Data(header=" + this.f1253a + ", items=" + this.b + Separators.RPAREN;
    }
}
