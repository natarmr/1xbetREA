package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class f8b {
    public static final e8b Companion = new e8b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9097a;
    public final String b;

    public /* synthetic */ f8b(int i, int i2, String str) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, d8b.f5639a.getDescriptor());
            throw null;
        }
        this.f9097a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8b)) {
            return false;
        }
        f8b f8bVar = (f8b) obj;
        return this.f9097a == f8bVar.f9097a && Intrinsics.d(this.b, f8bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f9097a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f9097a, "CategoryResult(categoryId=", ", categoryName=", this.b, Separators.RPAREN);
    }

    public f8b(int i, String str) {
        str.getClass();
        this.f9097a = i;
        this.b = str;
    }
}
