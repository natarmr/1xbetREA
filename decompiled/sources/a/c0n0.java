package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c0n0 implements d0n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1n0 f3534a;
    public final String b;

    public c0n0(e1n0 e1n0Var, String str) {
        str.getClass();
        this.f3534a = e1n0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0n0)) {
            return false;
        }
        c0n0 c0n0Var = (c0n0) obj;
        return this.f3534a.equals(c0n0Var.f3534a) && Intrinsics.d(this.b, c0n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3534a.hashCode() * 31);
    }

    public final String toString() {
        return "TextFieldAction(subSectionTextFieldItem=" + this.f3534a + ", value=" + this.b + Separators.RPAREN;
    }
}
