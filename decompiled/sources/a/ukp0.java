package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ukp0 implements wkp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f35840a;
    public final a4x b;
    public final mdm c;

    public ukp0(imm immVar, a4x a4xVar, mdm mdmVar) {
        a4xVar.getClass();
        this.f35840a = immVar;
        this.b = a4xVar;
        this.c = mdmVar;
    }

    @Override // a.wkp0
    public final imm a() {
        return this.f35840a;
    }

    @Override // a.wkp0
    public final a4x b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukp0)) {
            return false;
        }
        ukp0 ukp0Var = (ukp0) obj;
        return this.f35840a.equals(ukp0Var.f35840a) && Intrinsics.d(this.b, ukp0Var.b) && this.c.equals(ukp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f35840a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(navigationBarModel=");
        sb.append(this.f35840a);
        sb.append(", championshipFilterList=");
        sb.append(this.b);
        sb.append(", dsEmptyConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
