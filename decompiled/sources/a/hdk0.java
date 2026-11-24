package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hdk0 implements idk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12874a;
    public final Function0 b;

    public hdk0(String str, Function0 function0) {
        str.getClass();
        this.f12874a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdk0)) {
            return false;
        }
        hdk0 hdk0Var = (hdk0) obj;
        return Intrinsics.d(this.f12874a, hdk0Var.f12874a) && this.b.equals(hdk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12874a.hashCode() * 31);
    }

    public final String toString() {
        return "Action(actionButtonText=" + this.f12874a + ", actionButtonClick=" + this.b + Separators.RPAREN;
    }
}
