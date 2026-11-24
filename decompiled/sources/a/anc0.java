package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class anc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1144a;
    public final a4x b;

    public anc0(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f1144a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anc0)) {
            return false;
        }
        anc0 anc0Var = (anc0) obj;
        return Intrinsics.d(this.f1144a, anc0Var.f1144a) && Intrinsics.d(this.b, anc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1144a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("Data(headerTitle=", this.f1144a, ", items=", this.b, Separators.RPAREN);
    }
}
