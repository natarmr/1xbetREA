package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mf1 implements nf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21675a;

    public mf1(String str) {
        str.getClass();
        this.f21675a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf1) && Intrinsics.d(this.f21675a, ((mf1) obj).f21675a);
    }

    public final int hashCode() {
        return this.f21675a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(text=", this.f21675a, Separators.RPAREN);
    }
}
