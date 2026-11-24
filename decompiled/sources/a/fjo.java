package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class fjo {
    public static final djo Companion = new djo();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new ago(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9652a;
    public final List b;

    public /* synthetic */ fjo(String str, List list, int i) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, bjo.f2715a.getDescriptor());
            throw null;
        }
        this.f9652a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjo)) {
            return false;
        }
        fjo fjoVar = (fjo) obj;
        return Intrinsics.d(this.f9652a, fjoVar.f9652a) && Intrinsics.d(this.b, fjoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9652a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("ExamAnswersRequest(tokenGuid=", this.f9652a, ", answers=", this.b, Separators.RPAREN);
    }

    public fjo(String str, ArrayList arrayList) {
        this.f9652a = str;
        this.b = arrayList;
    }
}
