package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15686a;
    public final String b;

    public j0k(int i, String str) {
        str.getClass();
        this.f15686a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0k)) {
            return false;
        }
        j0k j0kVar = (j0k) obj;
        return this.f15686a == j0kVar.f15686a && Intrinsics.d(this.b, j0kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f15686a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f15686a, "OnMakeBetGlobalChampClicked(globalChampId=", ", globalChampTitle=", this.b, Separators.RPAREN);
    }
}
