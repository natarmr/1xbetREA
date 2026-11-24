package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32939a;
    public final d280 b;

    public sws0(String str, d280 d280Var) {
        str.getClass();
        this.f32939a = str;
        this.b = d280Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sws0)) {
            return false;
        }
        sws0 sws0Var = (sws0) obj;
        return Intrinsics.d(this.f32939a, sws0Var.f32939a) && this.b.equals(sws0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32939a.hashCode() * 31);
    }

    public final String toString() {
        return "V3(opponentLabel=" + this.f32939a + ", opponentIcon=" + this.b + Separators.RPAREN;
    }
}
