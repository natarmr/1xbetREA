package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gta0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11871a;
    public final String b;
    public final String c;

    public gta0(long j, String str, String str2) {
        str.getClass();
        this.f11871a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gta0)) {
            return false;
        }
        gta0 gta0Var = (gta0) obj;
        return this.f11871a == gta0Var.f11871a && Intrinsics.d(this.b, gta0Var.b) && this.c.equals(gta0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f11871a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f11871a, "PolybetInfoUiModel(ruleId=", ", title=", this.b), ", description=", this.c, Separators.RPAREN);
    }
}
