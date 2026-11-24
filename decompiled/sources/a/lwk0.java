package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.special_event.impl.main.presentation.model.SpecialEventTabs;

/* JADX INFO: loaded from: classes5.dex */
public final class lwk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpecialEventTabs f20768a;
    public final List b;
    public final dxh0 c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;

    public lwk0(SpecialEventTabs specialEventTabs, List list, dxh0 dxh0Var, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f20768a = specialEventTabs;
        this.b = list;
        this.c = dxh0Var;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = list5;
    }

    public static lwk0 a(lwk0 lwk0Var, SpecialEventTabs specialEventTabs, ArrayList arrayList, List list, List list2, List list3, List list4, int i) {
        if ((i & 1) != 0) {
            specialEventTabs = lwk0Var.f20768a;
        }
        SpecialEventTabs specialEventTabs2 = specialEventTabs;
        List list5 = arrayList;
        if ((i & 2) != 0) {
            list5 = lwk0Var.b;
        }
        List list6 = list5;
        dxh0 dxh0Var = lwk0Var.c;
        if ((i & 8) != 0) {
            list = lwk0Var.d;
        }
        List list7 = list;
        if ((i & 16) != 0) {
            list2 = lwk0Var.e;
        }
        List list8 = list2;
        if ((i & 32) != 0) {
            list3 = lwk0Var.f;
        }
        List list9 = list3;
        if ((i & 64) != 0) {
            list4 = lwk0Var.g;
        }
        List list10 = list4;
        specialEventTabs2.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        return new lwk0(specialEventTabs2, list6, dxh0Var, list7, list8, list9, list10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwk0)) {
            return false;
        }
        lwk0 lwk0Var = (lwk0) obj;
        return this.f20768a == lwk0Var.f20768a && Intrinsics.d(this.b, lwk0Var.b) && this.c.equals(lwk0Var.c) && Intrinsics.d(this.d, lwk0Var.d) && Intrinsics.d(this.e, lwk0Var.e) && Intrinsics.d(this.f, lwk0Var.f) && Intrinsics.d(this.g, lwk0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a(dw9.a(dw9.a(hne.h(this.c, dw9.a(this.f20768a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialEventTabsStateModel(selectedTab=");
        sb.append(this.f20768a);
        sb.append(", availableTabList=");
        sb.append(this.b);
        sb.append(", segmentedControlStyle=");
        sb.append(this.c);
        sb.append(", scheduleContentOrderIds=");
        sb.append(this.d);
        sb.append(", myGamesContentOrderIds=");
        b1j.y(", statisticContentOrderIds=", ", tournamentContentOrderIds=", sb, this.e, this.f);
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
