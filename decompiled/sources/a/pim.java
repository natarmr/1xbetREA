package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27049a;
    public final String b;

    public pim(int i, String str) {
        str.getClass();
        this.f27049a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pim)) {
            return false;
        }
        pim pimVar = (pim) obj;
        return this.f27049a == pimVar.f27049a && Intrinsics.d(this.b, pimVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f27049a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f27049a, "TabWithIconUiModel(tabIcon=", ", tabText=", this.b, Separators.RPAREN);
    }
}
