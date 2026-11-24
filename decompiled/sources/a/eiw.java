package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class eiw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7879a;
    public final n0x b;

    public eiw(n0x n0xVar, String str) {
        str.getClass();
        this.f7879a = str;
        this.b = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eiw)) {
            return false;
        }
        eiw eiwVar = (eiw) obj;
        return Intrinsics.d(this.f7879a, eiwVar.f7879a) && this.b.equals(eiwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7879a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeChampHeaderUiModel(champId=" + this.f7879a + ", champLogo=" + this.b + Separators.RPAREN;
    }
}
