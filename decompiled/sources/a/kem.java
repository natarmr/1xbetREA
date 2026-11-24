package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kem implements nem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18159a;
    public final a4x b;
    public final jfm c;

    public kem(long j, a4x a4xVar, jfm jfmVar) {
        a4xVar.getClass();
        this.f18159a = j;
        this.b = a4xVar;
        this.c = jfmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kem)) {
            return false;
        }
        kem kemVar = (kem) obj;
        return this.f18159a == kemVar.f18159a && Intrinsics.d(this.b, kemVar.b) && this.c.equals(kemVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, Long.hashCode(this.f18159a) * 31, 31);
    }

    public final String toString() {
        return "Expandable(gameId=" + this.f18159a + ", marketGroupList=" + this.b + ", expandableHeader=" + this.c + Separators.RPAREN;
    }
}
