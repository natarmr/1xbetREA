package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ftk implements htk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sip f10115a;
    public final a4x b;

    public ftk(sip sipVar, i4 i4Var) {
        i4Var.getClass();
        this.f10115a = sipVar;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftk)) {
            return false;
        }
        ftk ftkVar = (ftk) obj;
        return this.f10115a == ftkVar.f10115a && Intrinsics.d(this.b, ftkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10115a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(feedKind=" + this.f10115a + ", chips=" + this.b + Separators.RPAREN;
    }
}
