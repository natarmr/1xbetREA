package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jg1 implements kg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16457a;
    public final ad b;
    public final mdm c;

    public jg1(String str, ad adVar, mdm mdmVar) {
        str.getClass();
        adVar.getClass();
        mdmVar.getClass();
        this.f16457a = str;
        this.b = adVar;
        this.c = mdmVar;
    }

    @Override // a.kg1
    public final String a() {
        return this.f16457a;
    }

    @Override // a.kg1
    public final ad b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg1)) {
            return false;
        }
        jg1 jg1Var = (jg1) obj;
        return Intrinsics.d(this.f16457a, jg1Var.f16457a) && Intrinsics.d(this.b, jg1Var.b) && Intrinsics.d(this.c, jg1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f16457a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(screenTitle=");
        sb.append(this.f16457a);
        sb.append(", accountBalance=");
        sb.append(this.b);
        sb.append(", emptyConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
