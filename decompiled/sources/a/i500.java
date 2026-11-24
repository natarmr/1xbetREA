package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i500 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14169a;
    public final List b;

    public i500(String str, List list) {
        list.getClass();
        this.f14169a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i500)) {
            return false;
        }
        i500 i500Var = (i500) obj;
        return this.f14169a.equals(i500Var.f14169a) && Intrinsics.d(this.b, i500Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14169a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("LimitsWithExamModel(tokenGuid=", this.f14169a, ", questionsList=", this.b, Separators.RPAREN);
    }
}
