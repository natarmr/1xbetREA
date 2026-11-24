package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ikb implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14917a;
    public final jjm b;
    public final a4x c;
    public final boolean d;

    public ikb(String str, jjm jjmVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f14917a = str;
        this.b = jjmVar;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikb)) {
            return false;
        }
        ikb ikbVar = (ikb) obj;
        return this.f14917a.equals(ikbVar.f14917a) && this.b.equals(ikbVar.b) && Intrinsics.d(this.c, ikbVar.c) && this.d == ikbVar.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f14917a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, (this.b.hashCode() + (this.f14917a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChampionshipResultCardUiModel(key=");
        sb.append(this.f14917a);
        sb.append(", dsModel=");
        sb.append(this.b);
        sb.append(", results=");
        return rz4.m(sb, this.c, ", rtlSupport=", this.d, Separators.RPAREN);
    }
}
