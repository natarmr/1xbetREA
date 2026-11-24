package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feed.notifictation.presentation.models.GameSubscriptionSettingsScreenUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class qns {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29046a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final mdm f;
    public final GameSubscriptionSettingsScreenUiModel g;
    public final List h;
    public final List i;

    public qns(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, mdm mdmVar, GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f29046a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = mdmVar;
        this.g = gameSubscriptionSettingsScreenUiModel;
        this.h = list;
        this.i = list2;
    }

    public static qns a(qns qnsVar, boolean z, boolean z2, boolean z3, GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel, ArrayList arrayList, ArrayList arrayList2, int i) {
        boolean z4 = (i & 1) != 0 ? qnsVar.f29046a : false;
        if ((i & 2) != 0) {
            z = qnsVar.b;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = qnsVar.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = qnsVar.d;
        }
        boolean z7 = z3;
        boolean z8 = qnsVar.e;
        mdm mdmVar = qnsVar.f;
        GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel2 = (i & 64) != 0 ? qnsVar.g : gameSubscriptionSettingsScreenUiModel;
        List list = (i & 128) != 0 ? qnsVar.h : arrayList;
        List list2 = (i & 256) != 0 ? qnsVar.i : arrayList2;
        qnsVar.getClass();
        list.getClass();
        list2.getClass();
        return new qns(z4, z5, z6, z7, z8, mdmVar, gameSubscriptionSettingsScreenUiModel2, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qns)) {
            return false;
        }
        qns qnsVar = (qns) obj;
        return this.f29046a == qnsVar.f29046a && this.b == qnsVar.b && this.c == qnsVar.c && this.d == qnsVar.d && this.e == qnsVar.e && this.f.equals(qnsVar.f) && Intrinsics.d(this.g, qnsVar.g) && Intrinsics.d(this.h, qnsVar.h) && Intrinsics.d(this.i, qnsVar.i);
    }

    public final int hashCode() {
        int iD = f140.d(this.f, brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f29046a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
        GameSubscriptionSettingsScreenUiModel gameSubscriptionSettingsScreenUiModel = this.g;
        return this.i.hashCode() + dw9.a((iD + (gameSubscriptionSettingsScreenUiModel == null ? 0 : gameSubscriptionSettingsScreenUiModel.hashCode())) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("GameNotificationState(shimmers=", ", loading=", ", connected=", this.f29046a, this.b);
        ua80.u(", error=", ", live=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", errorConfig=");
        sbQ.append(this.f);
        sbQ.append(", subscriptionSettings=");
        sbQ.append(this.g);
        sbQ.append(", toggleItemsState=");
        sbQ.append(this.h);
        sbQ.append(", initialToggleItemsState=");
        return dw9.r(sbQ, this.i, Separators.RPAREN);
    }
}
