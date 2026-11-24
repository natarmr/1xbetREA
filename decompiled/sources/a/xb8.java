package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.models.BonusAccountUiModel;

/* JADX INFO: loaded from: classes6.dex */
public final class xb8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BonusAccountUiModel f40589a;
    public final int b;
    public final String c;
    public final String d;

    public xb8(BonusAccountUiModel bonusAccountUiModel, int i, String str, String str2) {
        bonusAccountUiModel.getClass();
        str.getClass();
        str2.getClass();
        this.f40589a = bonusAccountUiModel;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb8)) {
            return false;
        }
        xb8 xb8Var = (xb8) obj;
        return Intrinsics.d(this.f40589a, xb8Var.f40589a) && this.b == xb8Var.b && Intrinsics.d(this.c, xb8Var.c) && Intrinsics.d(this.d, xb8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, this.f40589a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusAccountCellUiModel(item=");
        sb.append(this.f40589a);
        sb.append(", iconRes=");
        sb.append(this.b);
        sb.append(", title=");
        return ua80.m(sb, this.c, ", subtitle=", this.d, Separators.RPAREN);
    }
}
