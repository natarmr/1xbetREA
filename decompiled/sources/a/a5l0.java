package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a5l0 implements b5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f276a;
    public final String b;

    public a5l0(int i, String str) {
        str.getClass();
        this.f276a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5l0)) {
            return false;
        }
        a5l0 a5l0Var = (a5l0) obj;
        return this.f276a == a5l0Var.f276a && Intrinsics.d(this.b, a5l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f276a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f276a, "TopEventClick(eventId=", ", title=", this.b, Separators.RPAREN);
    }
}
