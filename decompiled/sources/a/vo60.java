package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vo60 {
    public static final so60 Companion = new so60();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f37751a;
    public final uo60 b;

    public /* synthetic */ vo60(int i, Long l, uo60 uo60Var) {
        if ((i & 1) == 0) {
            this.f37751a = null;
        } else {
            this.f37751a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = uo60Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo60)) {
            return false;
        }
        vo60 vo60Var = (vo60) obj;
        return Intrinsics.d(this.f37751a, vo60Var.f37751a) && this.b == vo60Var.b;
    }

    public final int hashCode() {
        Long l = this.f37751a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        uo60 uo60Var = this.b;
        return iHashCode + (uo60Var != null ? uo60Var.hashCode() : 0);
    }

    public final String toString() {
        return "OneXGameWorkStatusResponseOld(id=" + this.f37751a + ", status=" + this.b + Separators.RPAREN;
    }
}
