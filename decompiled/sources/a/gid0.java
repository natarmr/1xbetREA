package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gid0 implements hid0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11341a;

    public gid0(String str) {
        str.getClass();
        this.f11341a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gid0) && Intrinsics.d(this.f11341a, ((gid0) obj).f11341a);
    }

    public final int hashCode() {
        return this.f11341a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowWrongSecretQuestionError(errorMessage=", this.f11341a, Separators.RPAREN);
    }
}
