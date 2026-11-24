package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class k65 {
    public static final j65 Companion = new j65();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i65 f17750a;

    public /* synthetic */ k65(int i, i65 i65Var) {
        if ((i & 1) == 0) {
            this.f17750a = null;
        } else {
            this.f17750a = i65Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k65) && Intrinsics.d(this.f17750a, ((k65) obj).f17750a);
    }

    public final int hashCode() {
        i65 i65Var = this.f17750a;
        if (i65Var == null) {
            return 0;
        }
        return i65Var.hashCode();
    }

    public final String toString() {
        return "AvailableBonusesResponse(data=" + this.f17750a + Separators.RPAREN;
    }
}
