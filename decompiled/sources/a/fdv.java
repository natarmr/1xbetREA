package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9376a;
    public final boolean b;
    public final List c;
    public final List d;

    public fdv(List list, List list2, boolean z, boolean z2) {
        list.getClass();
        list2.getClass();
        this.f9376a = z;
        this.b = z2;
        this.c = list;
        this.d = list2;
    }

    public static fdv a(fdv fdvVar, boolean z, List list, List list2, int i) {
        if ((i & 1) != 0) {
            z = fdvVar.f9376a;
        }
        boolean z2 = (i & 2) != 0 ? fdvVar.b : true;
        if ((i & 4) != 0) {
            list = fdvVar.c;
        }
        if ((i & 8) != 0) {
            list2 = fdvVar.d;
        }
        fdvVar.getClass();
        list.getClass();
        list2.getClass();
        return new fdv(list, list2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdv)) {
            return false;
        }
        fdv fdvVar = (fdv) obj;
        return this.f9376a == fdvVar.f9376a && this.b == fdvVar.b && Intrinsics.d(this.c, fdvVar.c) && Intrinsics.d(this.d, fdvVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(brm0.e(Boolean.hashCode(this.f9376a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kng0.n(", seasonSelectorModelList=", Separators.RPAREN, f140.q("GrandPrixTableState(isLoading=", ", hasError=", ", tableContentList=", this.f9376a, this.b), this.c, this.d);
    }
}
