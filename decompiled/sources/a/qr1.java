package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qr1 implements rr1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29188a;
    public final czr0 b;

    public qr1(String str, czr0 czr0Var) {
        str.getClass();
        this.f29188a = str;
        this.b = czr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr1)) {
            return false;
        }
        qr1 qr1Var = (qr1) obj;
        return Intrinsics.d(this.f29188a, qr1Var.f29188a) && this.b == qr1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29188a.hashCode() * 31);
    }

    public final String toString() {
        return "Text(text=" + this.f29188a + ", type=" + this.b + Separators.RPAREN;
    }
}
