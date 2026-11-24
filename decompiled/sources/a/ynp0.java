package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ynp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42951a;
    public final a4x b;

    public ynp0(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f42951a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynp0)) {
            return false;
        }
        ynp0 ynp0Var = (ynp0) obj;
        return Intrinsics.d(this.f42951a, ynp0Var.f42951a) && Intrinsics.d(this.b, ynp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42951a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("TeamUiModel(title=", this.f42951a, ", lineupsInfoUiModelList=", this.b, Separators.RPAREN);
    }
}
