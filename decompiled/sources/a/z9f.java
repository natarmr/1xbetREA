package a;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineListParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z9f implements Continuation, OnSuccessListener, wyg, pg60, k4r, sg00, pyj, diq, zf60, qg60, zon0, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44014a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z9f(ft2 ft2Var, wn00 wn00Var, in30 in30Var, IOException iOException, boolean z) {
        this.f44014a = (byte) 10;
        this.b = in30Var;
    }

    @Override // a.pyj
    public rcf0 a(int i, ccs0 ccs0Var, int[] iArr) {
        nyj nyjVar = (nyj) this.b;
        u3x u3xVarL = b4x.l();
        for (int i2 = 0; i2 < ccs0Var.f4128a; i2++) {
            u3xVarL.b(new kyj(i, ccs0Var, i2, nyjVar, iArr[i2]));
        }
        return u3xVarL.g();
    }

    @Override // a.zon0
    public void b() {
        org.xplatform.favorites.impl.presentation.category.f fVar = (org.xplatform.favorites.impl.presentation.category.f) this.b;
        sek sekVar = org.xplatform.favorites.impl.presentation.category.e.V1;
        fVar.getClass();
        fVar.w();
    }

    @Override // a.diq
    public void c(float f) {
        zeu0 zeu0Var = ((ueu0) this.b).b;
        if (zeu0Var.f == f) {
            return;
        }
        zeu0Var.f = f;
        zeu0Var.c(false);
    }

    @Override // a.wyg
    public void e(p6t0 p6t0Var) {
        byte b = this.f44014a;
        Object obj = this.b;
        switch (b) {
            case 5:
                upg upgVar = (upg) obj;
                kwd kwdVar = upg.X1;
                p6t0Var.getClass();
                if (p6t0Var instanceof mgh) {
                    vqg vqgVarH0 = upgVar.H0();
                    qjj.W(jiu0.a(vqgVarH0), null, null, new sqg(vqgVarH0, null, (byte) 3), 3);
                }
                break;
            default:
                ddk ddkVar = ptk.U1;
                p6t0Var.getClass();
                xtk xtkVar = (xtk) ((ptk) obj).O1.getValue();
                DisciplineListParams disciplineListParams = xtkVar.b;
                if (p6t0Var instanceof hok) {
                    CyberGamesPage cyberGamesPage = disciplineListParams.f46555a;
                    long j = ((hok) p6t0Var).f13397a;
                    Pair pairC = org.xplatform.cyber.section.api.domain.entity.d.c(j, cyberGamesPage);
                    long jLongValue = ((Number) pairC.f46059a).longValue();
                    long jLongValue2 = ((Number) pairC.b).longValue();
                    xtkVar.d.l(jLongValue, jLongValue2, r1g.CYBERSPORT_POPULAR, null, null);
                    xtkVar.h.m(jLongValue, jLongValue2, "cybersport_popular", null, null);
                    ((uzg) xtkVar.c).c(j, disciplineListParams.f46555a, k1g.OPEN_REGULAR);
                }
                break;
        }
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        byte b = this.f44014a;
        Object obj = this.b;
        switch (b) {
            case 7:
                j4j j4jVar = (j4j) obj;
                kud kudVar = j4j.R1;
                str.getClass();
                if (bundle.containsKey("BUNDLE_TASK_KIND_ID_KEY")) {
                    int i = bundle.getInt("BUNDLE_TASK_KIND_ID_KEY");
                    jh70 jh70Var = sba0.b;
                    if (i == 2) {
                        j4jVar.G0().x(new s3j(bundle.getLong("BUNDLE_PRODUCT_ID_KEY"), bundle.getInt("BUNDLE_PROGRESS_KEY")));
                    }
                    break;
                }
                break;
            case 17:
                cio cioVar = (cio) obj;
                ddk ddkVar = cio.P1;
                str.getClass();
                List parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT", FavoriteGroupHeaderUiItem.class) : bundle.getParcelableArrayList("REMOVE_ALL_SPORT_EVENTS_RESULT");
                if (parcelableArrayList == null) {
                    parcelableArrayList = iun.f15405a;
                }
                if (!parcelableArrayList.isEmpty()) {
                    cioVar.H0().x(new yf2(parcelableArrayList));
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i6q i6qVar = (i6q) obj;
                iiy[] iiyVarArr = i6q.V1;
                str.getClass();
                if (str.equals("REQUEST_FINISH_MAKE_BET_DIALOG_KEY") && bundle.containsKey("REQUEST_FINISH_MAKE_BET_DIALOG_KEY")) {
                    r8q r8qVarH0 = i6qVar.H0();
                    qjj.W(r8qVarH0.X, r8qVarH0.i.b, null, new l8q(r8qVarH0, null, (byte) 3), 2);
                }
                break;
            default:
                n9q n9qVar = (n9q) obj;
                iiy[] iiyVarArr2 = n9q.S1;
                str.getClass();
                if (str.equals("REQUEST_FINISH_MAKE_BET_DIALOG_KEY") && bundle.containsKey("REQUEST_FINISH_MAKE_BET_DIALOG_KEY")) {
                    n9qVar.G0().x(y8q.f42206a);
                }
                break;
        }
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        byte b = this.f44014a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                ((kn30) ((gt2) obj)).o = (dlo) obj2;
                break;
            case 9:
                tkj tkjVar = (tkj) obj2;
                kn30 kn30Var = (kn30) ((gt2) obj);
                kn30Var.y += tkjVar.g;
                kn30Var.z += tkjVar.e;
                break;
            case 10:
                kn30 kn30Var2 = (kn30) ((gt2) obj);
                kn30Var2.getClass();
                kn30Var2.w = ((in30) obj2).f15054a;
                break;
            case 18:
                ((ky90) obj).A((jn30) obj2);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((ky90) obj).s((scs0) obj2);
                break;
            case 20:
                ((ky90) obj).C((dtf) obj2);
                break;
            case 21:
                ((ky90) obj).A(((qlo) obj2).f28944a.R);
                break;
            default:
                ((ky90) obj).t((ed40) obj2);
                break;
        }
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        byte b = this.f44014a;
        Object obj = this.b;
        switch (b) {
            case 14:
                DsBottomBar dsBottomBar = (DsBottomBar) obj;
                int i = DsBottomBar.v;
                view.getClass();
                int i2 = xiv0Var.f40966a.i(2).d;
                if (i2 != dsBottomBar.u) {
                    dsBottomBar.u = i2;
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), dsBottomBar.t + i2);
                }
                break;
            default:
                DsTabBar dsTabBar = (DsTabBar) obj;
                int i3 = DsTabBar.n;
                view.getClass();
                int i4 = xiv0Var.f40966a.i(2).d;
                if (i4 != dsTabBar.i) {
                    dsTabBar.i = i4;
                    dsTabBar.requestLayout();
                }
                break;
        }
        return xiv0Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        hgq hgqVar = (hgq) this.b;
        nek nekVar = hgq.g2;
        exc.getClass();
        if ((exc instanceof rfq) && Intrinsics.d(((rfq) exc).b, "ERROR_WEB_CONTEXT_CANCELED")) {
            if (hgqVar.N()) {
                hgqVar.F().t0(i120.V(new Pair("CLOSE_SOCIAL", "")), "CLOSE_SOCIAL");
            }
            hgqVar.y0();
        } else {
            Context contextD = hgqVar.D();
            if (contextD != null) {
                String string = contextD.getString(R.string.exit_from_social);
                string.getClass();
                hgqVar.R0(string);
            }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        byte b = this.f44014a;
        Object obj2 = this.b;
        switch (b) {
            case 2:
                ((v4f) obj2).invoke(obj);
                break;
            case 3:
                ((v4f) obj2).invoke(obj);
                break;
            case 4:
                ((mcf) obj2).invoke(obj);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                nek nekVar = hgq.g2;
                ((g7p) obj2).invoke(obj);
                break;
            default:
                nek nekVar2 = hgq.g2;
                ((f8m) obj2).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        byte b = this.f44014a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (Task) ((Callable) obj).call();
            default:
                ((Runnable) obj).run();
                return Tasks.forResult(null);
        }
    }

    public /* synthetic */ z9f(ft2 ft2Var, Object obj, byte b) {
        this.f44014a = b;
        this.b = obj;
    }

    public /* synthetic */ z9f(Object obj, byte b) {
        this.f44014a = b;
        this.b = obj;
    }
}
