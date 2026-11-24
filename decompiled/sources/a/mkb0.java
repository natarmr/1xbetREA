package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mkb0 implements okb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21937a;
    public final String b;

    public mkb0(int i, String str) {
        str.getClass();
        this.f21937a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkb0)) {
            return false;
        }
        mkb0 mkb0Var = (mkb0) obj;
        return this.f21937a == mkb0Var.f21937a && Intrinsics.d(this.b, mkb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f21937a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f21937a, "OnSpecialEventClick(eventId=", ", title=", this.b, Separators.RPAREN);
    }
}
