package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jg8 implements kg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16469a;
    public final String b;

    public jg8(int i, String str) {
        str.getClass();
        this.f16469a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg8)) {
            return false;
        }
        jg8 jg8Var = (jg8) obj;
        return this.f16469a == jg8Var.f16469a && Intrinsics.d(this.b, jg8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f16469a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f16469a, "OnBonusClick(selectedBonusId=", ", selectedBonusName=", this.b, Separators.RPAREN);
    }
}
