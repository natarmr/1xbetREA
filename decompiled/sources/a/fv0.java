package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fv0 implements gv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10190a;

    public fv0(String str) {
        str.getClass();
        this.f10190a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fv0) && Intrinsics.d(this.f10190a, ((fv0) obj).f10190a);
    }

    public final int hashCode() {
        return this.f10190a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnNicknameChange(value=", this.f10190a, Separators.RPAREN);
    }
}
