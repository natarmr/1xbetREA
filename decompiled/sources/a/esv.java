package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class esv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8347a;
    public final b8m b;
    public final a4x c;

    public esv(String str, b8m b8mVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f8347a = str;
        this.b = b8mVar;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esv)) {
            return false;
        }
        esv esvVar = (esv) obj;
        return this.f8347a.equals(esvVar.f8347a) && this.b.equals(esvVar.b) && Intrinsics.d(this.c, esvVar.c);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f8347a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f8347a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(key=");
        sb.append(this.f8347a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", switchTabList=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
