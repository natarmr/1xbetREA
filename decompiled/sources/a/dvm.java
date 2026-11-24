package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dvm implements fvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvm f6750a;
    public final jvm b;
    public final a2m c;
    public final String d;
    public final a4x e;
    public final boolean f;

    public dvm(jvm jvmVar, jvm jvmVar2, a2m a2mVar, String str, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f6750a = jvmVar;
        this.b = jvmVar2;
        this.c = a2mVar;
        this.d = str;
        this.e = a4xVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvm)) {
            return false;
        }
        dvm dvmVar = (dvm) obj;
        return this.f6750a.equals(dvmVar.f6750a) && this.b.equals(dvmVar.b) && this.c.equals(dvmVar.c) && this.d.equals(dvmVar.d) && Intrinsics.d(this.e, dvmVar.e) && this.f == dvmVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cs0.b(this.e, ua80.b(rz4.a(this.c, (this.b.hashCode() + (this.f6750a.hashCode() * 31)) * 31, 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V3(firstOpponent=");
        sb.append(this.f6750a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", scoreModel=");
        sb.append(this.c);
        sb.append(", gameLabel=");
        sb.append(this.d);
        sb.append(", cardOnTableList=");
        return rz4.m(sb, this.e, ", supportRtl=", this.f, Separators.RPAREN);
    }
}
