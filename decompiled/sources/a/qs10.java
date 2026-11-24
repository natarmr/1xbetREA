package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qs10 implements ss10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29237a;
    public final bye b;

    public qs10(String str, bye byeVar) {
        str.getClass();
        this.f29237a = str;
        this.b = byeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs10)) {
            return false;
        }
        qs10 qs10Var = (qs10) obj;
        return Intrinsics.d(this.f29237a, qs10Var.f29237a) && this.b.equals(qs10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29237a.hashCode() * 31);
    }

    public final String toString() {
        return "System(systemTypeTitle=" + this.f29237a + ", systemTypeState=" + this.b + Separators.RPAREN;
    }
}
