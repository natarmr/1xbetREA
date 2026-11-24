package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3557a;

    public /* synthetic */ c15(String str) {
        this.f3557a = str;
    }

    public static String a(String str) {
        return kng0.l("AutoSubUiModel(autoSubLabel=", str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c15) {
            return Intrinsics.d(this.f3557a, ((c15) obj).f3557a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3557a.hashCode();
    }

    public final String toString() {
        return a(this.f3557a);
    }
}
