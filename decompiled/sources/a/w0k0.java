package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class w0k0 implements z0k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38353a;
    public final String b;

    public w0k0(int i, String str) {
        this.f38353a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0k0)) {
            return false;
        }
        w0k0 w0k0Var = (w0k0) obj;
        return this.f38353a == w0k0Var.f38353a && this.b.equals(w0k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f38353a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f38353a, "OpenDisciplineFilter(eventId=", ", selectedDiscipline=", this.b, Separators.RPAREN);
    }
}
