package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ddp0 implements fdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5906a;
    public final k5a0 b;

    public ddp0(String str, k5a0 k5a0Var) {
        str.getClass();
        this.f5906a = str;
        this.b = k5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddp0)) {
            return false;
        }
        ddp0 ddp0Var = (ddp0) obj;
        return Intrinsics.d(this.f5906a, ddp0Var.f5906a) && this.b.equals(ddp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5906a.hashCode() * 31);
    }

    public final String toString() {
        return "Default(name=" + this.f5906a + ", playerLogo=" + this.b + Separators.RPAREN;
    }
}
