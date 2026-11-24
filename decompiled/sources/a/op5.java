package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class op5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25624a;

    public /* synthetic */ op5(String str) {
        this.f25624a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof op5) {
            return Intrinsics.d(this.f25624a, ((op5) obj).f25624a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f25624a.hashCode();
    }

    public final String toString() {
        return kng0.l("TagText(value=", this.f25624a, Separators.RPAREN);
    }
}
