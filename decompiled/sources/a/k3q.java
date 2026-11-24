package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k3q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17631a;
    public final v3q b;

    public k3q(String str, v3q v3qVar) {
        str.getClass();
        this.f17631a = str;
        this.b = v3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3q)) {
            return false;
        }
        k3q k3qVar = (k3q) obj;
        return Intrinsics.d(this.f17631a, k3qVar.f17631a) && this.b == k3qVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17631a.hashCode() * 31);
    }

    public final String toString() {
        return "FilterItem(title=" + this.f17631a + ", type=" + this.b + Separators.RPAREN;
    }
}
