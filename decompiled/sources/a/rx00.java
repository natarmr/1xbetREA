package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.presentation.custom_views.cards.LuckyCardWidget;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rx00 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31240a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rx00(Object obj, byte b) {
        this.f31240a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31240a;
        Object obj = this.b;
        switch (b) {
            case 0:
                evz evzVar = tx00.l2;
                fiu0 fiu0Var = ((tx00) obj).f2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                lei leiVar = ((wz00) obj).L1;
                if (leiVar != null) {
                    return new q0h0(leiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                bsf bsfVar = (bsf) obj;
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.addAll((Collection) ((fee) bsfVar.m.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) bsfVar.n.getValue()).b());
                lc00VarB.addAll((Collection) ((fee) bsfVar.p.getValue()).b());
                return twn.k(lc00VarB, (Collection) ((fee) bsfVar.o.getValue()).b(), lc00VarB);
            case 3:
                r810 r810Var = (r810) obj;
                iiy[] iiyVarArr = r810.P1;
                i1w0 i1w0VarF = a4n0.f(r810Var);
                eki ekiVar = r810Var.L1;
                if (ekiVar != null) {
                    return new ry3(i1w0VarF, ekiVar);
                }
                Intrinsics.h("lotteryViewModelFactory");
                throw null;
            case 4:
                return (n810) ((gii0) ((j910) obj).b).b(sre0.f32672a.b(n810.class));
            case 5:
                int i = LottieView.o1;
                int iM = f7k.M(192);
                int width = (int) (((double) ((LottieView) obj).getRootView().getWidth()) / 2.1d);
                if (iM > width) {
                    iM = width;
                }
                return Integer.valueOf(iM);
            case 6:
                return (ic10) ((gii0) ((ieu) obj).b).b(sre0.f32672a.b(ic10.class));
            case 7:
                i1w0 i1w0Var = ((be10) obj).v;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 8:
                uuz uuzVar = mg10.Q1;
                fiu0 fiu0Var2 = ((mg10) obj).K1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 9:
                return (uju) ((wj10) obj).f39243a.b(sre0.f32672a.b(uju.class));
            case 10:
                int i2 = LuckyCardWidget.l;
                ((ij10) obj).invoke();
                return Unit.f46060a;
            case 11:
                ((bo10) obj).P = null;
                return Unit.f46060a;
            case 12:
                return (mk10) ((gii0) ((zpu) obj).b).b(sre0.f32672a.b(mk10.class));
            case 13:
                return Integer.valueOf(((tr10) obj).f34403a.size());
            case 14:
                ((cx10) obj).G.f(new hw10(false));
                return Unit.f46060a;
            case 15:
                fiu0 fiu0Var3 = ((i820) obj).K1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 16:
                return (m520) ((gii0) ((abu) obj).b).b(sre0.f32672a.b(m520.class));
            case 17:
                return (n520) ((gii0) ((dq00) obj).b).b(sre0.f32672a.b(n520.class));
            case 18:
                return ((mn20) obj).m.a();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object parent = ((qr20) obj).f29189a.getParent();
                parent.getClass();
                return (View) parent;
            case 20:
                return Integer.valueOf(((pw20) obj).f27691a.b);
            case 21:
                jli jliVar = ((yb30) obj).Q1;
                if (jliVar != null) {
                    return new q0h0(jliVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 22:
                return (vb30) ((gii0) ((zn00) obj).f44650a).b(sre0.f32672a.b(vb30.class));
            case 23:
                return Integer.valueOf(((nc30) obj).b);
            case 24:
                ili iliVar = ((zc30) obj).Q1;
                if (iliVar != null) {
                    return new q0h0(iliVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(((qd30) obj).c);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (id30) ((gii0) ((kd30) obj).f18086a).b(sre0.f32672a.b(id30.class));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                evz evzVar2 = qg30.o2;
                fiu0 fiu0Var4 = ((qg30) obj).k2;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new tg30(((yqt) obj).a().b, iun.f15405a);
            default:
                return Integer.valueOf(((vwh0) obj).f38150a.size());
        }
    }
}
