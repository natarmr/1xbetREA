package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gk extends ik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11423a;

    public gk(String str) {
        str.getClass();
        this.f11423a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gk) && Intrinsics.d(this.f11423a, ((gk) obj).f11423a);
    }

    public final int hashCode() {
        return this.f11423a.hashCode();
    }

    public final String toString() {
        return kng0.l("ActionNameChange(actionName=", this.f11423a, Separators.RPAREN);
    }
}
