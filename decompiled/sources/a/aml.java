package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aml implements bml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pt0 f1113a;
    public final yll b;
    public final boolean c;

    public aml(pt0 pt0Var, yll yllVar, boolean z) {
        pt0Var.getClass();
        this.f1113a = pt0Var;
        this.b = yllVar;
        this.c = z;
    }

    @Override // a.bml
    public final yll a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aml)) {
            return false;
        }
        aml amlVar = (aml) obj;
        return this.f1113a == amlVar.f1113a && Intrinsics.d(this.b, amlVar.b) && this.c == amlVar.c;
    }

    @Override // a.bml
    public final pt0 getType() {
        return this.f1113a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f1113a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(type=");
        sb.append(this.f1113a);
        sb.append(", orientationType=");
        sb.append(this.b);
        sb.append(", isScrollable=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
