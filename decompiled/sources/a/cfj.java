package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4265a;
    public final String b;
    public final String c;
    public final String d;

    public cfj(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f4265a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfj)) {
            return false;
        }
        cfj cfjVar = (cfj) obj;
        return Intrinsics.d(this.f4265a, cfjVar.f4265a) && Intrinsics.d(this.b, cfjVar.b) && Intrinsics.d(this.c, cfjVar.c) && Intrinsics.d(this.d, cfjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f4265a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("DateTimeLabels(startDateLabel=", this.f4265a, ", endDateLabel=", this.b, ", startTimeLabel="), this.c, ", endTimeLabel=", this.d, Separators.RPAREN);
    }
}
