package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yyl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43473a;
    public final boolean b;
    public final List c;

    public yyl0(List list, boolean z, boolean z2) {
        list.getClass();
        this.f43473a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyl0)) {
            return false;
        }
        yyl0 yyl0Var = (yyl0) obj;
        return this.f43473a == yyl0Var.f43473a && this.b == yyl0Var.b && Intrinsics.d(this.c, yyl0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Boolean.hashCode(this.f43473a) * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(f140.q("StageInfoStateModel(isLoading=", ", hasError=", ", columnTitleModelList=", this.f43473a, this.b), this.c, Separators.RPAREN);
    }
}
