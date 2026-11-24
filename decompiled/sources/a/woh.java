package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class woh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final voh f39497a;
    public final g4m b;
    public final a4x c;

    public woh(voh vohVar, g4m g4mVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f39497a = vohVar;
        this.b = g4mVar;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woh)) {
            return false;
        }
        woh wohVar = (woh) obj;
        return this.f39497a.equals(wohVar.f39497a) && this.b.equals(wohVar.b) && Intrinsics.d(this.c, wohVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b.f10673a, this.f39497a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(topInfo=");
        sb.append(this.f39497a);
        sb.append(", chips=");
        sb.append(this.b);
        sb.append(", stadiumImages=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
