package a;

import android.gov.nist.core.Separators;
import java.util.Calendar;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ug60 implements xg60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w2c0 f35609a;
    public final Calendar b;

    public ug60(w2c0 w2c0Var, Calendar calendar) {
        calendar.getClass();
        this.f35609a = w2c0Var;
        this.b = calendar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug60)) {
            return false;
        }
        ug60 ug60Var = (ug60) obj;
        return this.f35609a == ug60Var.f35609a && Intrinsics.d(this.b, ug60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35609a.hashCode() * 31);
    }

    public final String toString() {
        return "DateDialog(type=" + this.f35609a + ", calendar=" + this.b + Separators.RPAREN;
    }
}
