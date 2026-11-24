package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ff8 implements hf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id50 f9439a;
    public final mdm b;
    public final mdm c;

    public ff8(id50 id50Var, mdm mdmVar, mdm mdmVar2) {
        this.f9439a = id50Var;
        this.b = mdmVar;
        this.c = mdmVar2;
    }

    @Override // a.hf8
    public final id50 a() {
        return this.f9439a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff8)) {
            return false;
        }
        ff8 ff8Var = (ff8) obj;
        return this.f9439a.equals(ff8Var.f9439a) && this.b.equals(ff8Var.b) && Intrinsics.d(this.c, ff8Var.c);
    }

    public final int hashCode() {
        int iD = f140.d(this.b, this.f9439a.f14567a.hashCode() * 31, 31);
        mdm mdmVar = this.c;
        return iD + (mdmVar == null ? 0 : mdmVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(navigationBarUiState=");
        sb.append(this.f9439a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", umConfig=");
        return cs0.m(sb, this.c, Separators.RPAREN);
    }
}
