package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wrr implements asr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqr f39658a;
    public final String b;
    public final j83 c;

    public wrr(vqr vqrVar, String str, j83 j83Var) {
        str.getClass();
        this.f39658a = vqrVar;
        this.b = str;
        this.c = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrr)) {
            return false;
        }
        wrr wrrVar = (wrr) obj;
        return this.f39658a.equals(wrrVar.f39658a) && Intrinsics.d(this.b, wrrVar.b) && this.c.equals(wrrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f39658a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SingleTeam(labels=" + this.f39658a + ", teamName=" + this.b + ", bottomInfo=" + ((Object) this.c) + Separators.RPAREN;
    }
}
