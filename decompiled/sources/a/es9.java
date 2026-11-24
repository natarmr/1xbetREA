package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class es9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8318a;
    public final ds9 b;
    public final boolean c;
    public final sp9 d;

    public es9(List list, ds9 ds9Var, boolean z, sp9 sp9Var) {
        list.getClass();
        this.f8318a = list;
        this.b = ds9Var;
        this.c = z;
        this.d = sp9Var;
    }

    public static es9 a(es9 es9Var, List list, ds9 ds9Var, boolean z, sp9 sp9Var, int i) {
        if ((i & 1) != 0) {
            list = es9Var.f8318a;
        }
        if ((i & 2) != 0) {
            ds9Var = es9Var.b;
        }
        if ((i & 4) != 0) {
            z = es9Var.c;
        }
        if ((i & 8) != 0) {
            sp9Var = es9Var.d;
        }
        es9Var.getClass();
        list.getClass();
        return new es9(list, ds9Var, z, sp9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es9)) {
            return false;
        }
        es9 es9Var = (es9) obj;
        return Intrinsics.d(this.f8318a, es9Var.f8318a) && this.b == es9Var.b && this.c == es9Var.c && Intrinsics.d(this.d, es9Var.d);
    }

    public final int hashCode() {
        int iE = brm0.e((this.b.hashCode() + (this.f8318a.hashCode() * 31)) * 31, 31, this.c);
        sp9 sp9Var = this.d;
        return iE + (sp9Var == null ? 0 : sp9Var.hashCode());
    }

    public final String toString() {
        return "CallbackHistoryStateModel(callbackHistory=" + this.f8318a + ", contentStatus=" + this.b + ", isLoading=" + this.c + ", requestModelToDelete=" + this.d + Separators.RPAREN;
    }
}
