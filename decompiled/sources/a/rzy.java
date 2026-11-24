package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31384a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public rzy(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.f31384a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }

    public static rzy a(rzy rzyVar, boolean z, boolean z2, boolean z3) {
        List list = rzyVar.d;
        list.getClass();
        return new rzy(list, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzy)) {
            return false;
        }
        rzy rzyVar = (rzy) obj;
        return this.f31384a == rzyVar.f31384a && this.b == rzyVar.b && this.c == rzyVar.c && Intrinsics.d(this.d, rzyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(brm0.e(Boolean.hashCode(this.f31384a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("LastGamePlayerState(isLoading=", ", isError=", ", isEmpty=", this.f31384a, this.b);
        sbQ.append(this.c);
        sbQ.append(", gamesResultList=");
        sbQ.append(this.d);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
