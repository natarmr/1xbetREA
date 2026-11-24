package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pt60 implements tt60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27549a;

    public pt60(String str) {
        this.f27549a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pt60) && Intrinsics.d(this.f27549a, ((pt60) obj).f27549a);
    }

    public final int hashCode() {
        String str = this.f27549a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSecondGameClick(loadedImageUrl=", this.f27549a, Separators.RPAREN);
    }
}
