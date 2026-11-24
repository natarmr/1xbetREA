package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jvk0 implements lvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f17207a;
    public final i9h0 b;

    public jvk0(mdm mdmVar, i9h0 i9h0Var) {
        mdmVar.getClass();
        i9h0Var.getClass();
        this.f17207a = mdmVar;
        this.b = i9h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvk0)) {
            return false;
        }
        jvk0 jvk0Var = (jvk0) obj;
        return Intrinsics.d(this.f17207a, jvk0Var.f17207a) && this.b == jvk0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17207a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(config=" + this.f17207a + ", screenStyle=" + this.b + Separators.RPAREN;
    }
}
