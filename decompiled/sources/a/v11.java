package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v11 implements w11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f36606a;
    public final bd b;
    public final mdm c;

    public v11(imm immVar, bd bdVar, mdm mdmVar) {
        immVar.getClass();
        bdVar.getClass();
        mdmVar.getClass();
        this.f36606a = immVar;
        this.b = bdVar;
        this.c = mdmVar;
    }

    @Override // a.w11
    public final imm a() {
        return this.f36606a;
    }

    @Override // a.w11
    public final bd b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11)) {
            return false;
        }
        v11 v11Var = (v11) obj;
        return Intrinsics.d(this.f36606a, v11Var.f36606a) && Intrinsics.d(this.b, v11Var.b) && Intrinsics.d(this.c, v11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f36606a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(navigationBarUiModel=");
        sb.append(this.f36606a);
        sb.append(", accountBalance=");
        sb.append(this.b);
        sb.append(", emptyConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
