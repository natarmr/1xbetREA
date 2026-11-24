package a;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bethistory.filter.presentation.FilterInfoScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n1w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22772a;
    public final /* synthetic */ s1w b;

    public /* synthetic */ n1w(s1w s1wVar, byte b) {
        this.f22772a = b;
        this.b = s1wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f22772a;
        s1w s1wVar = this.b;
        switch (b) {
            case 0:
                qii qiiVar = s1wVar.L1;
                if (qiiVar != null) {
                    return new q0h0(qiiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                bst bstVar = s1w.d2;
                s1wVar.M0().R.y();
                return Unit.f46060a;
            case 2:
                bst bstVar2 = s1w.d2;
                naw nawVarM0 = s1wVar.M0();
                String simpleName = s1w.class.getSimpleName();
                nawVarM0.z.a(true);
                nawVarM0.A.a(true);
                nawVarM0.B(simpleName);
                return Unit.f46060a;
            case 3:
                bst bstVar3 = s1w.d2;
                naw nawVarM1 = s1wVar.M0();
                z4w z4wVar = nawVarM1.R;
                ql5 ql5Var = nawVarM1.C0;
                z4wVar.x(ql5Var != null ? ql5Var.f28916a : 0L);
                return Unit.f46060a;
            case 4:
                bst bstVar4 = s1w.d2;
                naw nawVarM2 = s1wVar.M0();
                q37 q37Var = nawVarM2.l0;
                q37Var.getClass();
                i8i.D("action", "link", q37Var.b.f1961a, "bet_history_link_mail");
                b1j.v("link", q37Var.c.f1455a, 11098L);
                ouu ouuVar = nawVarM2.P;
                ab50 ab50Var = new ab50(0);
                ouuVar.getClass();
                ouuVar.q(ab50Var, true);
                i1w0 i1w0VarM = ouuVar.M(ab50Var);
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                FragmentScreen fragmentScreenJ = jh70.j(nawVarM2.r0, false);
                if (fragmentScreenJ instanceof DialogScreen) {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenJ)));
                } else {
                    copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenJ)));
                }
                ListIterator listIteratorO = b1j.o(i1w0VarM, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarM.a((oe50) pawVar.next());
                }
                break;
            case 5:
                bst bstVar5 = s1w.d2;
                q37 q37Var2 = s1wVar.M0().l0;
                q37Var2.getClass();
                i8i.D("action", "cancel", q37Var2.b.f1961a, "bet_history_link_mail");
                b1j.v("cancel", q37Var2.c.f1455a, 11098L);
                return Unit.f46060a;
            case 6:
                ywq ywqVar = s1wVar.Z1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 7:
                bst bstVar6 = s1w.d2;
                s1wVar.M0().R.B();
                return Unit.f46060a;
            case 8:
                bst bstVar7 = s1w.d2;
                vft vftVar = new vft(1, s1wVar.M0(), naw.class, "onSaleButtonClicked", "onSaleButtonClicked(Ljava/lang/String;)V", 0, (byte) 23);
                vft vftVar2 = new vft(1, s1wVar.M0(), naw.class, "onMoreButtonClicked", "onMoreButtonClicked(Ljava/lang/String;)V", 0, (byte) 24);
                o0t o0tVar = new o0t(0, s1wVar.M0(), naw.class, "onHeaderClicked", "onHeaderClicked()V", 0, (byte) 5);
                vft vftVar3 = new vft(1, s1wVar.M0(), naw.class, "winBackClicked", "winBackClicked(Ljava/lang/String;)V", 0, (byte) 25);
                ens ensVar = new ens(2, s1wVar.M0(), naw.class, "logItems", "logItems(Ljava/lang/Exception;Ljava/util/List;)V", 0, (byte) 8);
                m1w m1wVar = new m1w(s1wVar, (byte) 0);
                m1w m1wVar2 = new m1w(s1wVar, (byte) 1);
                r5w r5wVar = new r5w(ensVar);
                gbn gbnVar = new gbn(new nuq((byte) 3), new atq(3, (byte) 4), new enm((Object) m1wVar, (Object) m1wVar2, (Object) vftVar2, (Object) vftVar, (byte) 5), gzn.B);
                dp dpVar = r5wVar.h;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new sfc((byte) 24), new tad(3, (byte) 9), new sw8(m1wVar, m1wVar2, vftVar2, (byte) 9), qja.t));
                dpVar.b(new gbn(new x2w((byte) 0), new pkv(3, (byte) 13), new y2w(o0tVar, (byte) 0), btv.i));
                dpVar.b(new gbn(new i9v0((byte) 4), new d8q0(3, (byte) 29), new gdv0(vftVar3, (byte) 1), mnu0.h));
                dpVar.b = new gbn(new x2w((byte) 3), new pkv(3, (byte) 15), new umu((byte) 26), btv.k);
                return r5wVar;
            case 9:
                bst bstVar8 = s1w.d2;
                r5w r5wVarJ0 = s1wVar.J0();
                t3w t3wVar = (t3w) s1wVar.Y1.getValue();
                r5wVarJ0.getClass();
                t3wVar.getClass();
                r5wVarJ0.z(new cd60(t3wVar, (byte) 29));
                return new oqd(nqd.c, Arrays.asList(r5wVarJ0, t3wVar));
            case 10:
                bst bstVar9 = s1w.d2;
                naw nawVarM3 = s1wVar.M0();
                ArrayList<s77> arrayList = nawVarM3.I0;
                if (!arrayList.isEmpty() && nawVarM3.d == sys0.f33037a) {
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (s77 s77Var : arrayList) {
                        arrayList2.add(new m77(s77Var, s77Var == nawVarM3.D0));
                    }
                    gx7 gx7Var = nawVarM3.Q0.f32117a;
                    nawVarM3.Z0.f(new b9w(arrayList2, gx7Var.b.f, gx7Var.f));
                }
                return Unit.f46060a;
            case 11:
                bst bstVar10 = s1w.d2;
                i1w0 i1w0Var = s1wVar.M0().O;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar2.next());
                }
                break;
            case 12:
                bst bstVar11 = s1w.d2;
                naw nawVarM4 = s1wVar.M0();
                q37 q37Var3 = nawVarM4.l0;
                a1w a1wVar = a1w.f;
                r6w r6wVarW0 = b34.w0(nawVarM4.D0);
                String strA = b34.w0(nawVarM4.D0).a();
                q37Var3.getClass();
                b4j.h(q37Var3.b, a1wVar, r6wVarW0);
                b1j.v(strA, q37Var3.c.f1455a, 3201L);
                s77 s77Var2 = nawVarM4.D0;
                if (s77Var2 == s77.AGGREGATOR) {
                    i1w0 i1w0Var2 = nawVarM4.O;
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                    FragmentScreen filterInfoScreen = new FilterInfoScreen(nawVarM4.d);
                    if (filterInfoScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) filterInfoScreen)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(filterInfoScreen)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO2;
                        if (pawVar3.hasNext()) {
                            i1w0Var2.a((oe50) pawVar3.next());
                        }
                    }
                } else {
                    nawVarM4.Z0.f(new o9w(s77Var2));
                }
                return Unit.f46060a;
            default:
                bst bstVar12 = s1w.d2;
                androidx.recyclerview.widget.b layoutManager = s1wVar.I0().o.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.c1()) : null;
                naw nawVarM5 = s1wVar.M0();
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                nawVarM5.O0 = iIntValue;
                boolean z = nawVarM5.T0;
                nawVarM5.T0 = !z;
                String str = !z ? "compact" : "all";
                q37 q37Var4 = nawVarM5.l0;
                q37Var4.getClass();
                i8i.D("option", str, q37Var4.b.f1961a, "bet_history_select_view");
                b1j.v(str, q37Var4.c.f1455a, 3203L);
                nawVarM5.x.f43485a.f36880a.d("COMPACT_HISTORY", nawVarM5.T0);
                p7m0 p7m0Var = nawVarM5.W0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, l9h0.a((l9h0) value, false, false, false, null, false, nawVarM5.T0, false, false, false, null, null, false, false, 32735)));
                td9 td9Var = nawVarM5.J;
                td9Var.f33756a = true;
                td9Var.e = new bp00(false);
                td9Var.h(new umu((byte) 27));
                p7m0 p7m0Var2 = nawVarM5.c1;
                r9w r9wVar = new r9w(iIntValue);
                p7m0Var2.getClass();
                p7m0Var2.o(null, r9wVar);
                nawVarM5.Z0.f(new s8w(false));
                return Unit.f46060a;
        }
    }
}
