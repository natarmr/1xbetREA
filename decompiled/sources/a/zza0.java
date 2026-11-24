package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45243a;
    public final boolean b;
    public final List c;

    public zza0(List list, boolean z, boolean z2) {
        this.f45243a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zza0)) {
            return false;
        }
        zza0 zza0Var = (zza0) obj;
        return this.f45243a == zza0Var.f45243a && this.b == zza0Var.b && Intrinsics.d(this.c, zza0Var.c);
    }

    public final int hashCode() {
        int iE = brm0.e(Boolean.hashCode(this.f45243a) * 31, 31, this.b);
        List list = this.c;
        return iE + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return dw9.r(f140.q("CategorizedGamesState(isLoading=", ", isError=", ", gamesToCategories=", this.f45243a, this.b), this.c, Separators.RPAREN);
    }
}
