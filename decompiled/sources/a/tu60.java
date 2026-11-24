package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class tu60 implements vu60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ed50 f34536a;
    public final zva b;
    public final mdm c;
    public final mdm d;

    public tu60(ed50 ed50Var, zva zvaVar, mdm mdmVar, mdm mdmVar2) {
        ed50Var.getClass();
        zvaVar.getClass();
        this.f34536a = ed50Var;
        this.b = zvaVar;
        this.c = mdmVar;
        this.d = mdmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu60)) {
            return false;
        }
        tu60 tu60Var = (tu60) obj;
        return Intrinsics.d(this.f34536a, tu60Var.f34536a) && Intrinsics.d(this.b, tu60Var.b) && Intrinsics.d(this.c, tu60Var.c) && Intrinsics.d(this.d, tu60Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f34536a.f7602a.hashCode() * 31)) * 31;
        mdm mdmVar = this.c;
        int iHashCode2 = (iHashCode + (mdmVar == null ? 0 : mdmVar.hashCode())) * 31;
        mdm mdmVar2 = this.d;
        return iHashCode2 + (mdmVar2 != null ? mdmVar2.hashCode() : 0);
    }

    public final String toString() {
        return "Error(navigationBarUiState=" + this.f34536a + ", accountUiState=" + this.b + ", config=" + this.c + ", umConfig=" + this.d + Separators.RPAREN;
    }
}
