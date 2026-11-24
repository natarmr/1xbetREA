package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lfa implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19943a;

    public lfa(String str) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        this.f19943a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfa)) {
            return false;
        }
        dja djaVar = dja.PENALTY;
        return Intrinsics.d(this.f19943a, ((lfa) obj).f19943a);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.COMMON;
    }

    public final int hashCode() {
        return this.f19943a.hashCode() + (dja.COMMON.hashCode() * 31);
    }

    public final String toString() {
        return "CardErrorUiModel(type=" + dja.COMMON + ", description=" + this.f19943a + Separators.RPAREN;
    }
}
