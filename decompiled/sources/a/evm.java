package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class evm implements fvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kvm f8476a;
    public final kvm b;
    public final a2m c;
    public final String d;
    public final String e;
    public final a4x f;
    public final String g;
    public final zum h;
    public final boolean i;

    public evm(kvm kvmVar, kvm kvmVar2, a2m a2mVar, String str, String str2, a4x a4xVar, String str3, zum zumVar, boolean z) {
        a4xVar.getClass();
        str3.getClass();
        this.f8476a = kvmVar;
        this.b = kvmVar2;
        this.c = a2mVar;
        this.d = str;
        this.e = str2;
        this.f = a4xVar;
        this.g = str3;
        this.h = zumVar;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evm)) {
            return false;
        }
        evm evmVar = (evm) obj;
        return this.f8476a.equals(evmVar.f8476a) && this.b.equals(evmVar.b) && this.c.equals(evmVar.c) && this.d.equals(evmVar.d) && this.e.equals(evmVar.e) && Intrinsics.d(this.f, evmVar.f) && Intrinsics.d(this.g, evmVar.g) && this.h.equals(evmVar.h) && this.i == evmVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ua80.b(cs0.b(this.f, ua80.b(ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f8476a.hashCode() * 31)) * 31, 31), 961, this.d), 31, this.e), 31), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V4(firstOpponent=");
        sb.append(this.f8476a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(this.d);
        sb.append(", infoLabel=, infoLabel2=");
        cs0.B(sb, this.e, ", cardOnTableList=", this.f, ", tagLive=");
        sb.append(this.g);
        sb.append(", options=");
        sb.append(this.h);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
