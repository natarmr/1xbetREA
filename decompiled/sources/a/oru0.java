package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oru0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25753a;
    public final String b;
    public final String c;
    public final List d;

    public oru0(int i, String str, String str2, List list) {
        list.getClass();
        this.f25753a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oru0)) {
            return false;
        }
        oru0 oru0Var = (oru0) obj;
        return this.f25753a == oru0Var.f25753a && this.b.equals(oru0Var.b) && this.c.equals(oru0Var.c) && Intrinsics.d(this.d, oru0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f25753a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return rw2.m(this.c, ", sports=", Separators.RPAREN, vqd.r(this.f25753a, "VirtualGamesCategoryModel(sportCategoryId=", ", sportCategoryName=", this.b, ", sportCategoryNameEng="), this.d);
    }
}
