package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class asm implements dsm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1397a;

    public /* synthetic */ asm(String str) {
        this.f1397a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof asm) {
            return Intrinsics.d(this.f1397a, ((asm) obj).f1397a);
        }
        return false;
    }

    @Override // a.dsm
    public final String getKey() {
        return "All";
    }

    public final int hashCode() {
        return this.f1397a.hashCode();
    }

    public final String toString() {
        return kng0.l("All(label=", this.f1397a, Separators.RPAREN);
    }
}
