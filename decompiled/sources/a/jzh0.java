package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jzh0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17413a;
    public final hjm b;

    public jzh0(hjm hjmVar, String str) {
        str.getClass();
        this.f17413a = str;
        this.b = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzh0)) {
            return false;
        }
        jzh0 jzh0Var = (jzh0) obj;
        return Intrinsics.d(this.f17413a, jzh0Var.f17413a) && this.b.equals(jzh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17413a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectAwardHeaderUiModel(id=" + this.f17413a + ", dsModel=" + this.b + Separators.RPAREN;
    }
}
