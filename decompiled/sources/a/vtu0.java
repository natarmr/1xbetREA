package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vtu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38025a;
    public final a4x b;

    public vtu0(a4x a4xVar, String str) {
        a4xVar.getClass();
        this.f38025a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtu0)) {
            return false;
        }
        vtu0 vtu0Var = (vtu0) obj;
        return this.f38025a.equals(vtu0Var.f38025a) && Intrinsics.d(this.b, vtu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38025a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("VirtualSportRulesSectionUiModel(title=", this.f38025a, ", descriptionList=", this.b, Separators.RPAREN);
    }
}
