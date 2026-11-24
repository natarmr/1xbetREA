package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mec implements pec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21637a;
    public final a4x b;
    public final kec c;

    public mec(boolean z, i4 i4Var, kec kecVar) {
        i4Var.getClass();
        this.f21637a = z;
        this.b = i4Var;
        this.c = kecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mec)) {
            return false;
        }
        mec mecVar = (mec) obj;
        return this.f21637a == mecVar.f21637a && Intrinsics.d(this.b, mecVar.b) && this.c.equals(mecVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, Boolean.hashCode(this.f21637a) * 31, 31);
    }

    public final String toString() {
        return "DataLoaded(scrollTop=" + this.f21637a + ", uiItems=" + this.b + ", buttonModel=" + this.c + Separators.RPAREN;
    }
}
