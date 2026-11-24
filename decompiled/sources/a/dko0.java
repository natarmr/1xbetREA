package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dko0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6242a;
    public final String b;

    public dko0(int i, String str) {
        str.getClass();
        this.f6242a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dko0)) {
            return false;
        }
        dko0 dko0Var = (dko0) obj;
        return this.f6242a == dko0Var.f6242a && Intrinsics.d(this.b, dko0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f6242a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f6242a, "TableInfoItemUiModel(color=", ", text=", this.b, Separators.RPAREN);
    }
}
