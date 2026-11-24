package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wlo0 implements ylo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39365a;
    public final String b;
    public final nvv c;
    public final a4x d;

    public wlo0(String str, String str2, nvv nvvVar, a4x a4xVar) {
        str2.getClass();
        a4xVar.getClass();
        this.f39365a = str;
        this.b = str2;
        this.c = nvvVar;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlo0)) {
            return false;
        }
        wlo0 wlo0Var = (wlo0) obj;
        return this.f39365a.equals(wlo0Var.f39365a) && Intrinsics.d(this.b, wlo0Var.b) && this.c.equals(wlo0Var.c) && Intrinsics.d(this.d, wlo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ua80.b(this.f39365a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Full(playerName=", this.f39365a, ", heroName=", this.b, ", heroImage=");
        sbN.append(this.c);
        sbN.append(", additionalImages=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
