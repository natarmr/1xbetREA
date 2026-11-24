package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ftq0 implements htq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10127a;
    public final sek0 b;

    public ftq0(sek0 sek0Var, String str) {
        str.getClass();
        this.f10127a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftq0)) {
            return false;
        }
        ftq0 ftq0Var = (ftq0) obj;
        return Intrinsics.d(this.f10127a, ftq0Var.f10127a) && this.b.equals(ftq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10127a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMessage(message=" + this.f10127a + ", type=" + this.b + Separators.RPAREN;
    }
}
