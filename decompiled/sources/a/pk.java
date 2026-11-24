package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f27112a;
    public final List b;
    public final List c;

    public pk(swp0 swp0Var, List list, List list2) {
        swp0Var.getClass();
        list.getClass();
        list2.getClass();
        this.f27112a = swp0Var;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk)) {
            return false;
        }
        pk pkVar = (pk) obj;
        return Intrinsics.d(this.f27112a, pkVar.f27112a) && Intrinsics.d(this.b, pkVar.b) && Intrinsics.d(this.c, pkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f27112a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivatePhoneModel(temporaryToken=");
        sb.append(this.f27112a);
        sb.append(", activateCodeTypeAvailable=");
        sb.append(this.b);
        sb.append(", availableRepeatActivationTypeList=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
