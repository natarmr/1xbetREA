package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hmk0 implements gqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1x f13312a;
    public final String b;
    public final ibj c;

    public hmk0(y1x y1xVar, String str, ibj ibjVar) {
        this.f13312a = y1xVar;
        this.b = str;
        this.c = ibjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmk0)) {
            return false;
        }
        hmk0 hmk0Var = (hmk0) obj;
        return Intrinsics.d(this.f13312a, hmk0Var.f13312a) && Intrinsics.d(this.b, hmk0Var.b) && this.c == hmk0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.f13312a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f13312a + ", mimeType=" + this.b + ", dataSource=" + this.c + Separators.RPAREN;
    }
}
