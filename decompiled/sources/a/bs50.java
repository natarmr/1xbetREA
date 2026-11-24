package a;

import android.content.Context;
import android.view.View;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinButton;
import org.xplatform.spin_and_win.presentation.views.SpinAndWinChoiceView;
import org.xplatform.ui_core.viewcomponents.views.NumberItemView;
import org.xplatform.ui_core.viewcomponents.views.NumberKeyboardView;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_web_games.game_collection_section.WebGamesGameCollectionSection;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bs50 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3112a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bs50(oz60 oz60Var, u6b0 u6b0Var, WebGamesGameCollectionSection webGamesGameCollectionSection) {
        this.f3112a = (byte) 6;
        this.b = oz60Var;
        this.c = u6b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object value;
        odl0 odl0Var;
        HashSet hashSetJ0;
        boolean z;
        boolean z2;
        byte b = this.f3112a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                cs50 cs50Var = (cs50) obj2;
                cs50Var.u.invoke((ct5) obj, cs50Var.w);
                break;
            case 1:
                ((Function1) ((zr50) obj2).w).invoke(((qn50) obj).b);
                break;
            case 2:
                NumberKeyboardView numberKeyboardView = (NumberKeyboardView) obj2;
                NumberItemView numberItemView = (NumberItemView) obj;
                int i = NumberKeyboardView.e;
                numberItemView.getClass();
                Context context = numberKeyboardView.getContext();
                if (context != null) {
                    new nvu(context).Z();
                    Function1 function1 = numberKeyboardView.b;
                    if (function1 != null) {
                        function1.invoke(numberItemView);
                    }
                    break;
                }
                break;
            case 3:
                ((jw50) obj2).invoke(((cp) obj).u());
                break;
            case 4:
                ((vra) obj2).invoke(((i1b) ((cp) obj).u()).f13989a);
                break;
            case 5:
                ((wma0) obj2).invoke(((cp) obj).u());
                break;
            case 6:
                u6b0 u6b0Var = (u6b0) obj;
                xi70 xi70Var = u6b0.e2;
                List list = ((sd00) ((oz60) obj2).f26091a).b;
                list.getClass();
                if (((u4s) CollectionsKt.firstOrNull(pgi0.t(lgi0.c(pgi0.p(pgi0.h(new sx3(list, (byte) 1), b180.f), eab0.b), new eoh0((byte) 23))))) != null) {
                    sbb0 sbb0VarJ0 = u6b0Var.J0();
                    zn60 zn60Var = zn60.Main;
                    sbb0VarJ0.o.w("WebGamesGameCollectionSection");
                }
                break;
            case 7:
                o470 o470Var = (o470) obj;
                view.getClass();
                yfu0 yfu0Var = ((cp) obj2).u;
                ckb.Z(view, ((u7z) yfu0Var).b.isChecked() ? 21 : 22);
                boolean zIsChecked = ((u7z) yfu0Var).b.isChecked();
                woe0 woe0Var = (woe0) o470Var.f24619a;
                gne0 gne0Var = woe0.S1;
                zoe0 zoe0VarH0 = woe0Var.H0();
                if (zIsChecked) {
                    zoe0VarH0.j.f42966a.c("promo_referal_accept");
                    zoe0VarH0.n.f40143a.a(xun.f41520a, 3324L);
                }
                p7m0 p7m0Var = zoe0VarH0.r;
                Boolean boolValueOf = Boolean.valueOf(zIsChecked);
                p7m0Var.getClass();
                p7m0Var.o(null, boolValueOf);
                zoe0VarH0.x();
                break;
            case 8:
                ((Function1) obj2).invoke(new drk0((lik0) obj));
                break;
            case 9:
                ((cyk0) ((v70) obj2).v).invoke((xxk0) obj);
                break;
            case 10:
                ((SpinAndWinChoiceView) obj2).b.invoke(((SpinAndWinButton) obj).getType());
                break;
            case 11:
                SportCellLeftView.f((View.OnClickListener) obj2, (SportCellLeftView) obj);
                break;
            case 12:
                cp cpVar = (cp) obj;
                long j = ((fdl0) cpVar.u()).f9362a;
                boolean z3 = ((fdl0) cpVar.u()).d;
                p7m0 p7m0Var2 = ((ndl0) obj2).n;
                do {
                    value = p7m0Var2.getValue();
                    odl0Var = (odl0) value;
                    hashSetJ0 = CollectionsKt.J0(odl0Var.k);
                    Long lValueOf = Long.valueOf(j);
                    if (z3) {
                        hashSetJ0.remove(lValueOf);
                    } else {
                        hashSetJ0.add(lValueOf);
                    }
                    List list2 = odl0Var.i;
                    ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((cok0) it.next()).f4705a));
                    }
                    z = !Intrinsics.d(CollectionsKt.P0(arrayList), hashSetJ0);
                    boolean zD = Intrinsics.d(odl0Var.l, hashSetJ0);
                    z2 = false;
                    if (hashSetJ0.size() >= 1) {
                        z2 = true;
                    }
                    if (!zD && hashSetJ0.size() >= 1) {
                        z2 = true;
                    }
                } while (!p7m0Var2.m(value, odl0.a(odl0Var, false, z, z2, z2, false, false, null, null, null, hashSetJ0, null, null, 15331)));
                break;
            case 13:
                cp cpVar2 = (cp) obj;
                ((nfj0) obj2).invoke(Integer.valueOf(((tjp0) cpVar2.u()).f34060a), Boolean.valueOf(true ^ ((tjp0) cpVar2.u()).d));
                break;
            case 14:
                cp cpVar3 = (cp) obj2;
                mhc mhcVar = (mhc) obj;
                rlf0 rlf0Var = ((ude0) cpVar3.u()).b;
                if (rlf0Var instanceof nlf0) {
                    mhcVar.invoke(Integer.valueOf(((ude0) cpVar3.u()).f35473a), Integer.valueOf(((nlf0) rlf0Var).f23724a));
                    break;
                } else if (rlf0Var instanceof olf0) {
                    mhcVar.invoke(Integer.valueOf(((ude0) cpVar3.u()).f35473a), Integer.valueOf(((olf0) rlf0Var).f25452a));
                    break;
                } else if (rlf0Var instanceof qlf0) {
                    mhcVar.invoke(Integer.valueOf(((ude0) cpVar3.u()).f35473a), Integer.valueOf(((qlf0) rlf0Var).f28932a));
                    break;
                } else if (!rlf0Var.equals(plf0.f27180a)) {
                    t9f.b();
                    break;
                }
                break;
            case 15:
                ((z6e) obj2).invoke((ne9) obj);
                break;
            case 16:
                ((Function1) obj2).invoke((chq0) obj);
                break;
            case 17:
                ((Function1) ((zr50) obj2).x).invoke((ygq0) obj);
                break;
            case 18:
                dyb.N((rsq0) obj2, ymx.INTERVAL_400, new vpj0((Function0) obj, (byte) 11));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((w7s0) obj2).m.invoke((y8b) obj);
                break;
            default:
                ((dnv0) obj2).m.invoke(((umv0) ((y8b) obj)).g);
                break;
        }
    }

    public /* synthetic */ bs50(Object obj, Object obj2, byte b) {
        this.f3112a = b;
        this.b = obj;
        this.c = obj2;
    }
}
