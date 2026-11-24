package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e3n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7146a;
    public final String b;

    public e3n0(int i, String str) {
        str.getClass();
        this.f7146a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3n0)) {
            return false;
        }
        e3n0 e3n0Var = (e3n0) obj;
        return this.f7146a == e3n0Var.f7146a && Intrinsics.d(this.b, e3n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f7146a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f7146a, "SubSportModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
