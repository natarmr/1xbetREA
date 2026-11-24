package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c4b extends rsr0 {
    public final int j;
    public final String k;

    public c4b(int i, String str) {
        str.getClass();
        this.j = i;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4b)) {
            return false;
        }
        c4b c4bVar = (c4b) obj;
        return this.j == c4bVar.j && Intrinsics.d(this.k, c4bVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + (Integer.hashCode(this.j) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.j, "SimpleCategoryModel(id=", ", name=", this.k, Separators.RPAREN);
    }
}
