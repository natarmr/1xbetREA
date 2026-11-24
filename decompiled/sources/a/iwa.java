package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class iwa implements jwa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f15479a;
    public final String b;
    public final bi90 c;

    public iwa(Date date, String str, bi90 bi90Var) {
        str.getClass();
        this.f15479a = date;
        this.b = str;
        this.c = bi90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwa)) {
            return false;
        }
        iwa iwaVar = (iwa) obj;
        return this.f15479a.equals(iwaVar.f15479a) && Intrinsics.d(this.b, iwaVar.b) && this.c.equals(iwaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f15479a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Waiting(endDate=" + this.f15479a + ", daysLabel=" + this.b + ", displayMeasureTimerTypes=" + this.c + Separators.RPAREN;
    }
}
