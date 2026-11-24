package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class anm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1162a;

    public anm(String str) {
        str.getClass();
        this.f1162a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anm) && Intrinsics.d(this.f1162a, ((anm) obj).f1162a);
    }

    public final int hashCode() {
        return this.f1162a.hashCode();
    }

    public final String toString() {
        return kng0.l("DsPhoneErrorUiModel(error=", this.f1162a, Separators.RPAREN);
    }
}
