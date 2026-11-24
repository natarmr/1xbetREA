package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ex80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8566a;
    public final List b;
    public final List c;

    public ex80(String str, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f8566a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex80)) {
            return false;
        }
        ex80 ex80Var = (ex80) obj;
        return Intrinsics.d(this.f8566a, ex80Var.f8566a) && Intrinsics.d(this.b, ex80Var.b) && Intrinsics.d(this.c, ex80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f8566a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(defpackage.c.f("PartnerGamesModel(teamId=", this.f8566a, ", eventModelList=", this.b, ", sportSimpleModels="), this.c, Separators.RPAREN);
    }
}
