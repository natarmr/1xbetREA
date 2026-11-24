package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sur0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tur0 f32836a;
    public final String b;

    public sur0(tur0 tur0Var, String str) {
        tur0Var.getClass();
        this.f32836a = tur0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sur0)) {
            return false;
        }
        sur0 sur0Var = (sur0) obj;
        return Intrinsics.d(this.f32836a, sur0Var.f32836a) && this.b.equals(sur0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32836a.hashCode() * 31);
    }

    public final String toString() {
        return "TotoTipModel(totoTipScreenModel=" + this.f32836a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
