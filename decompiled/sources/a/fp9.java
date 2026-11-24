package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fp9 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9917a;
    public final String b;

    public fp9(int i, String str) {
        str.getClass();
        this.f9917a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp9)) {
            return false;
        }
        fp9 fp9Var = (fp9) obj;
        return this.f9917a == fp9Var.f9917a && Intrinsics.d(this.b, fp9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f9917a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f9917a, "CallThemeModel(id=", ", themeName=", this.b, Separators.RPAREN);
    }
}
