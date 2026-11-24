package a;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.bethistory.history.presentation.HistoryScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m1w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21029a;
    public final /* synthetic */ s1w b;

    public /* synthetic */ m1w(s1w s1wVar, byte b) {
        this.f21029a = b;
        this.b = s1wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f21029a;
        boolean z = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        s1w s1wVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                bst bstVar = s1w.d2;
                str.getClass();
                naw nawVarM0 = s1wVar.M0();
                androidx.recyclerview.widget.b layoutManager = s1wVar.I0().o.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                nawVarM0.O0 = linearLayoutManager != null ? linearLayoutManager.h1() : 0;
                s1wVar.M0().F(str);
                break;
            case 1:
                String str2 = (String) obj;
                bst bstVar2 = s1w.d2;
                str2.getClass();
                naw nawVarM1 = s1wVar.M0();
                String simpleName = s1w.class.getSimpleName();
                boolean zL = sj3.L(s1wVar.o0());
                fvt0 fvt0Var = nawVarM1.C;
                n3w n3wVarC = nawVarM1.J.c(str2);
                if (n3wVarC != null) {
                    String str3 = n3wVarC.f22868a;
                    if (n3wVarC.j1 && Long.parseLong(str2) > 0) {
                        q37 q37Var = nawVarM1.l0;
                        a1w a1wVar = a1w.i;
                        q37Var.getClass();
                        str3.getClass();
                        q37Var.b.i(a1wVar, str3);
                        h97.r(Long.parseLong(str3), q37Var.i.f15516a, 3367L);
                        bvc bvcVarA = jiu0.a(nawVarM1);
                        ax5 ax5Var = nawVarM1.b1;
                        dvj dvjVar = nawVarM1.L.b;
                        ax5Var.getClass();
                        qjj.W(bvcVarA, kotlin.coroutines.e.c(ax5Var, dvjVar), null, new atj(nawVarM1, n3wVarC, objArr == true ? 1 : 0, (byte) 26), 2);
                    } else if (!zL) {
                        fvt0Var.x(Long.parseLong(str3));
                        nawVarM1.Z0.f(v8w.f37006a);
                    } else if (nawVarM1.y.a()) {
                        nawVarM1.L(n3wVarC, simpleName);
                    } else {
                        fvt0Var.x(Long.parseLong(str3));
                        nawVarM1.a1.f(f9w.f9175a);
                    }
                }
                break;
            case 2:
                bst bstVar3 = s1w.d2;
                ((View) obj).getClass();
                naw nawVarM2 = s1wVar.M0();
                nawVarM2.m0.c("history_user");
                nawVarM2.n0.i("history_user");
                s77 s77Var = nawVarM2.D0;
                if (s77Var != s77.EVENTS && s77Var != s77.UNSETTLED) {
                    z = false;
                }
                nawVarM2.Z0.f(new a9w(z));
                break;
            case 3:
                bst bstVar4 = s1w.d2;
                ((View) obj).getClass();
                naw nawVarM3 = s1wVar.M0();
                q37 q37Var2 = nawVarM3.l0;
                y1p y1pVar = y1p.MAIN;
                q37Var2.getClass();
                i8i.D("screen", "history_anonim", q37Var2.b.f1961a, "login_page_call");
                q37Var2.d.c("history_anonim");
                i1w0 i1w0Var = nawVarM3.O;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 4:
                bst bstVar5 = s1w.d2;
                ((View) obj).getClass();
                naw nawVarM4 = s1wVar.M0();
                q37 q37Var3 = nawVarM4.l0;
                y1p y1pVar2 = y1p.HISTORY_ANONIM;
                String strG = nawVarM4.w0.g();
                q37Var3.getClass();
                i8i.D("screen", "history_anonim", q37Var3.b.f1961a, "reg_page_call");
                q37Var3.d.d(y1pVar2, strG);
                sac.V(jiu0.a(nawVarM4), new n5w(1, nawVarM4, naw.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, null, new r8w(nawVarM4, objArr2 == true ? 1 : 0, (byte) 7), 14);
                break;
            case 5:
                bst bstVar6 = s1w.d2;
                ((View) obj).getClass();
                naw nawVarM5 = s1wVar.M0();
                boolean z2 = nawVarM5.S0;
                z = nawVarM5.D0 == s77.EVENTS && nawVarM5.Q0.f32117a.b.b;
                if (z2 || z) {
                    nawVarM5.l0.b.f1961a.c("bet_history_date_filter");
                    nawVarM5.Z0.f(new d9w(z2, z));
                }
                break;
            case 6:
                bst bstVar7 = s1w.d2;
                ((View) obj).getClass();
                naw nawVarM6 = s1wVar.M0();
                q37 q37Var4 = nawVarM6.l0;
                a1w a1wVar2 = a1w.g;
                q37Var4.getClass();
                q37Var4.b.f1961a.c(a1wVar2.a());
                q37Var4.c.f1455a.a(xun.f41520a, 3193L);
                ql5 ql5Var = nawVarM6.C0;
                if (ql5Var == null || !ql5Var.i.a()) {
                    bj5 bj5Var = s77.b;
                    HistoryScreen historyScreen = new HistoryScreen(new p57(4, 0L, 0L, nawVarM6.A0, nawVarM6.B0), nawVarM6.d);
                    i1w0 i1w0Var2 = nawVarM6.O;
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                    if (historyScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) historyScreen)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(historyScreen)));
                    }
                    ListIterator listIteratorO = b1j.o(i1w0Var2, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO;
                        if (pawVar2.hasNext()) {
                            i1w0Var2.a((oe50) pawVar2.next());
                        }
                    }
                } else {
                    nawVarM6.Z0.f(y8w.f42214a);
                }
                break;
            case 7:
                bst bstVar8 = s1w.d2;
                ((View) obj).getClass();
                naw nawVarM7 = s1wVar.M0();
                q37 q37Var5 = nawVarM7.l0;
                y1p y1pVar3 = y1p.MAIN;
                String strG2 = nawVarM7.w0.g();
                q37Var5.getClass();
                i8i.D("screen", "history_user", q37Var5.e.f14765a, "deposit_call");
                q37Var5.f.b("history_user", strG2);
                ql5 ql5Var2 = nawVarM7.C0;
                if (ql5Var2 != null) {
                    nawVarM7.K.a(nawVarM7.O, true, ql5Var2.f28916a);
                }
                break;
            case 8:
                Bundle bundle = (Bundle) obj;
                bst bstVar9 = s1w.d2;
                bundle.getClass();
                Serializable serializable = bundle.getSerializable("RESULT_TYPE");
                vlq0 vlq0Var = serializable instanceof vlq0 ? (vlq0) serializable : null;
                if (vlq0Var != null) {
                    naw nawVarM8 = s1wVar.M0();
                    sac.V(jiu0.a(nawVarM8), new p8w(nawVarM8, (byte) (objArr4 == true ? 1 : 0)), null, nawVarM8.L.b, new fhq(nawVarM8, vlq0Var, objArr3 == true ? 1 : 0, (byte) 15), 10);
                }
                break;
            case 9:
                Bundle bundle2 = (Bundle) obj;
                bst bstVar10 = s1w.d2;
                bundle2.getClass();
                if (bundle2.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    Serializable serializable2 = bundle2.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                    if (serializable2 instanceof ql5) {
                        s1wVar.M0().C((ql5) serializable2);
                    }
                }
                break;
            case 10:
                Bundle bundle3 = (Bundle) obj;
                bst bstVar11 = s1w.d2;
                bundle3.getClass();
                long j = bundle3.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L);
                long j2 = bundle3.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L);
                naw nawVarM9 = s1wVar.M0();
                if (!bundle3.getBoolean("BUNDLE_RESULT_CANCELED", false)) {
                    if (j2 == 0) {
                        nawVarM9.Z0.f(new e9w(j, nawVarM9.Q0.f32117a.b.d));
                    } else {
                        qjj.W(jiu0.a(nawVarM9), null, null, new iaw(nawVarM9, j, j2, null, (byte) 0), 3);
                    }
                }
                break;
            case 11:
                h7d h7dVar = (h7d) obj;
                bst bstVar12 = s1w.d2;
                h7dVar.getClass();
                ((t3w) s1wVar.Y1.getValue()).F(h7dVar.c);
                break;
            default:
                Bundle bundle4 = (Bundle) obj;
                bst bstVar13 = s1w.d2;
                bundle4.getClass();
                long j3 = bundle4.getLong("BUNDLE_RESULT_START_TIME_SEC", 0L);
                long j4 = bundle4.getLong("BUNDLE_RESULT_END_TIME_SEC", 0L);
                naw nawVarM10 = s1wVar.M0();
                if (j4 == 0) {
                    nawVarM10.Z0.f(new n9w(j3));
                } else {
                    p7m0 p7m0Var = nawVarM10.W0;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, l9h0.a((l9h0) value, true, false, false, null, false, false, false, false, false, null, null, false, false, 32766)));
                    bvc bvcVarA2 = jiu0.a(nawVarM10);
                    ax5 ax5Var2 = nawVarM10.b1;
                    dvj dvjVar2 = nawVarM10.L.b;
                    ax5Var2.getClass();
                    qjj.W(bvcVarA2, kotlin.coroutines.e.c(ax5Var2, dvjVar2), null, new iaw(nawVarM10, j3, j4, null, (byte) 1), 2);
                }
                break;
        }
        return Unit.f46060a;
    }
}
