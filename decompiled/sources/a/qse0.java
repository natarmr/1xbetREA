package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qse0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29255a;
    public final String b;

    public qse0(int i, String str) {
        str.getClass();
        this.f29255a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qse0)) {
            return false;
        }
        qse0 qse0Var = (qse0) obj;
        return this.f29255a == qse0Var.f29255a && Intrinsics.d(this.b, qse0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f29255a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f29255a, "RegionModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
