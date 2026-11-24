package a;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.android.material.internal.CheckableImageButton;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampSubMenuItem;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b0l0 implements e0l0, zf60, n9c, k4r, wyg, rbe, xbf, u8m0, hwq0, zon0, wzn0, ikf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1770a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b0l0(Object obj, byte b) {
        this.f1770a = b;
        this.b = obj;
    }

    @Override // a.n9c
    public void a() {
        y4m0 y4m0Var = (y4m0) this.b;
        CheckableImageButton checkableImageButton = y4m0Var.d;
        cww.S(checkableImageButton, y4m0Var.i, checkableImageButton.getContentDescription());
    }

    @Override // a.rbe
    public void accept(Object obj) {
        ((u3x) this.b).b((ftf) obj);
    }

    @Override // a.zon0
    public void b() {
        zes0 zes0Var = (zes0) this.b;
        m6m0 m6m0Var = zes0.b2;
        vfs0 vfs0Var = (vfs0) zes0Var.N1.getValue();
        p7m0 p7m0Var = vfs0Var.l;
        p7m0Var.getClass();
        p7m0Var.o(null, qfs0.f28652a);
        bvc bvcVarA = jiu0.a(vfs0Var);
        ax5 ax5Var = vfs0Var.k;
        dvj dvjVar = vfs0Var.f.b;
        ax5Var.getClass();
        qjj.W(bvcVarA, kotlin.coroutines.e.c(ax5Var, dvjVar), null, new k6s0(vfs0Var, null, (byte) 2), 2);
    }

    @Override // a.xbf
    public Object c(Object obj) {
        SupportMenuScreenParams supportMenuScreenParams = (SupportMenuScreenParams) this.b;
        ((m1r) obj).getClass();
        jjn0.S1.getClass();
        jjn0 jjn0Var = new jjn0();
        jjn0Var.L1.J(jjn0Var, jjn0.U1[0], supportMenuScreenParams);
        return jjn0Var;
    }

    @Override // a.e0l0
    public Iterator d(qo8 qo8Var, CharSequence charSequence) {
        return new c0l0(qo8Var, charSequence, (vub) this.b, (byte) 0);
    }

    @Override // a.wyg
    public void e(p6t0 p6t0Var) {
        hqm0 hqm0Var = (hqm0) this.b;
        s9m0 s9m0Var = hqm0.V1;
        p6t0Var.getClass();
        rqm0 rqm0VarI0 = hqm0Var.I0();
        hzg hzgVar = rqm0VarI0.c;
        if (p6t0Var instanceof cqm0) {
            ih5 ih5Var = rqm0VarI0.f;
            cqm0 cqm0Var = (cqm0) p6t0Var;
            String str = cqm0Var.g;
            String str2 = cqm0Var.f;
            boolean z = cqm0Var.e;
            int i = cqm0Var.f4802a;
            ih5Var.j(i, r1g.CYBERSPORT_ACTIONS);
            zr1 zr1Var = rqm0VarI0.g;
            int i2 = cqm0Var.f4802a;
            y1p y1pVar = y1p.MAIN;
            zr1Var.b(i2, 0, "", "cybersport_actions", false, null);
            if (z && str2.length() > 0) {
                uzg uzgVar = (uzg) hzgVar;
                uzgVar.getClass();
                uzgVar.i.a(str2);
            } else if (!z || str.length() <= 0) {
                Object value = rqm0VarI0.r.getValue();
                value.getClass();
                int iIndexOf = ((jqm0) value).f16961a.indexOf(p6t0Var);
                i1w0 i1w0VarC = ((uzg) hzgVar).f36533a.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                FragmentScreen promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 = new PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1(i, iIndexOf, 46, false, true);
                if (promotionsNewsScreenFactoryImpl$getNewsMainScreen$1 instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(promotionsNewsScreenFactoryImpl$getNewsMainScreen$1)));
                }
                ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        break;
                    } else {
                        i1w0VarC.a((oe50) pawVar.next());
                    }
                }
            } else {
                ((uzg) hzgVar).m(str);
            }
            rqm0VarI0.k.y(kotlin.collections.a.c(String.valueOf(i)));
        }
    }

    @Override // a.ikf0
    public void f(long j, fq80 fq80Var) {
        nnw0.E(j, fq80Var, (ncs0[]) ((cyu) this.b).b);
    }

    public float g(float f) {
        return ((f7m0) this.b).k.getDensity() * f;
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        Object serializable;
        s9s0 s9s0Var;
        Object serializable2;
        Object serializable3;
        Object serializable4;
        byte b = this.f1770a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 4:
                ubm0 ubm0Var = (ubm0) obj;
                y2m0 y2m0Var = ubm0.R1;
                str.getClass();
                if (str.equals("SELECT_MENU_REQUEST_KEY") && bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    ChampSubMenuItem champSubMenuItem = (ChampSubMenuItem) (Build.VERSION.SDK_INT <= 33 ? bundle.getParcelable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY") : (Parcelable) bundle.getParcelable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ChampSubMenuItem.class));
                    if (champSubMenuItem != null) {
                        ubm0Var.G0().x(new rbm0(champSubMenuItem));
                    }
                }
                break;
            case 5:
            case 6:
            case 9:
            case 10:
            case 13:
            case 16:
            case 17:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            default:
                str.getClass();
                ((ebh) obj).invoke(fk0.f9667a);
                break;
            case 7:
                str.getClass();
                ((vi6) obj).invoke(Long.valueOf(bundle.getLong("SUB_GAME_SELECTED_KEY")));
                break;
            case 8:
                eym0 eym0Var = (eym0) obj;
                g9m0 g9m0Var = eym0.S1;
                str.getClass();
                if (str.hashCode() == -2111857280 && str.equals("KEY_SUB_GAME_FILTER_MODEL_REQUEST")) {
                    dzm0 dzm0VarH0 = eym0Var.H0();
                    sac.V(jiu0.a(dzm0VarH0), bzm0.f3477a, null, dzm0VarH0.j.f22085a, new czm0(dzm0VarH0, bundle.getLong("KEY_SUB_GAME_FILTER_MODEL_REQUEST"), null), 10);
                }
                break;
            case 11:
                bun0 bun0Var = (bun0) obj;
                s2m0 s2m0Var = bun0.g2;
                str.getClass();
                if (bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    pun0 pun0VarR0 = bun0Var.R0();
                    pun0VarR0.i.e("SUM_STEPPER_FIRST_FOCUS_KEY", Boolean.FALSE);
                    pun0VarR0.l.E();
                    sac.V(jiu0.a(pun0VarR0), new dun0(pun0VarR0, b2), null, pun0VarR0.d.f22085a, new wk20(true, pun0VarR0, (yje) null), 10);
                }
                break;
            case 12:
                vvn0 vvn0Var = (vvn0) obj;
                j6m0 j6m0Var = vvn0.W1;
                str.getClass();
                if (!bundle.getBoolean("SWIPE_ACTION_CONFIRMED_RESULT_KEY", false)) {
                    vvn0Var.K0().x(wrn0.f39652a);
                } else {
                    vvn0Var.K0().x(vrn0.f37908a);
                }
                break;
            case 14:
                s2m0 s2m0Var2 = ufo0.Q1;
                str.getClass();
                ((ufo0) obj).H0().B();
                break;
            case 15:
                y2m0 y2m0Var2 = jho0.R1;
                str.getClass();
                ((Function0) obj).invoke();
                break;
            case 18:
                fhq0 fhq0Var = (fhq0) obj;
                m6m0 m6m0Var = fhq0.q2;
                str.getClass();
                if (str.equals("RESULT_KEY_DATE_TIME_CALENDAR_REQUEST")) {
                    long j = bundle.getLong("RESULT_KEY_CALENDAR_START_SIMPLE_DATE");
                    long jMax = Math.max(j, fhq0Var.m2);
                    fhq0Var.m2 = jMax;
                    long jMax2 = Math.max(j, jMax);
                    r34 r34Var = fhq0Var.g2;
                    iiy[] iiyVarArr = fhq0.r2;
                    r34Var.j(fhq0Var, iiyVarArr[1], jMax2);
                    fhq0Var.V0();
                    long j2 = bundle.getLong("RESULT_KEY_CALENDAR_END_SIMPLE_DATE", -1L);
                    if (j2 > 0) {
                        fhq0Var.h2.j(fhq0Var, iiyVarArr[2], j2);
                        fhq0Var.V0();
                        fhq0Var.T0(ygq0.CUSTOM_DATE);
                    }
                    break;
                }
                break;
            case 20:
                y2m0 y2m0Var3 = xsq0.P1;
                str.getClass();
                ((xsq0) obj).H0().z();
                break;
            case 22:
                v3s0 v3s0Var = (v3s0) obj;
                y2m0 y2m0Var4 = v3s0.S1;
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable("RESULT_TOURNAMENT_PAGE", s9s0.class);
                } else {
                    Object serializable5 = bundle.getSerializable("RESULT_TOURNAMENT_PAGE");
                    if (!(serializable5 instanceof s9s0)) {
                        serializable5 = null;
                    }
                    serializable = (s9s0) serializable5;
                }
                s9s0Var = serializable instanceof s9s0 ? (s9s0) serializable : null;
                if (s9s0Var != null) {
                    v3s0Var.G0(s9s0Var);
                }
                break;
            case 23:
                a6s0 a6s0Var = (a6s0) obj;
                j6m0 j6m0Var2 = a6s0.S1;
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable2 = bundle.getSerializable("RESULT_TOURNAMENT_PAGE", s9s0.class);
                } else {
                    Object serializable6 = bundle.getSerializable("RESULT_TOURNAMENT_PAGE");
                    if (!(serializable6 instanceof s9s0)) {
                        serializable6 = null;
                    }
                    serializable2 = (s9s0) serializable6;
                }
                s9s0Var = serializable2 instanceof s9s0 ? (s9s0) serializable2 : null;
                if (s9s0Var != null) {
                    a6s0Var.n0().r().t0(i120.V(new Pair("TOURNAMENT_PAGE_ITEM", s9s0Var)), "REQUEST_KEY_CLOSE_OTHER_TOURNAMENTS_FRAGMENTS");
                    a6s0Var.G0().x(u5s0.f35111a);
                }
                break;
            case 24:
                z6s0 z6s0Var = (z6s0) obj;
                m6m0 m6m0Var2 = z6s0.S1;
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable3 = bundle.getSerializable("RESULT_TOURNAMENT_PAGE", s9s0.class);
                } else {
                    Object serializable7 = bundle.getSerializable("RESULT_TOURNAMENT_PAGE");
                    if (!(serializable7 instanceof s9s0)) {
                        serializable7 = null;
                    }
                    serializable3 = (s9s0) serializable7;
                }
                s9s0Var = serializable3 instanceof s9s0 ? (s9s0) serializable3 : null;
                if (s9s0Var != null) {
                    z6s0Var.G0(s9s0Var);
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                mas0 mas0Var = (mas0) obj;
                g9m0 g9m0Var2 = mas0.Q1;
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable4 = bundle.getSerializable("RESULT_TOURNAMENT_PAGE", s9s0.class);
                } else {
                    Object serializable8 = bundle.getSerializable("RESULT_TOURNAMENT_PAGE");
                    if (!(serializable8 instanceof s9s0)) {
                        serializable8 = null;
                    }
                    serializable4 = (s9s0) serializable8;
                }
                s9s0Var = serializable4 instanceof s9s0 ? (s9s0) serializable4 : null;
                if (s9s0Var != null) {
                    mas0Var.G0().x(new y9s0(s9s0Var));
                }
                break;
        }
    }

    @Override // a.wzn0
    public Object k() {
        wpg0 wpg0Var = (wpg0) ((wdu) this.b).j;
        SQLiteDatabase sQLiteDatabaseA = wpg0Var.a();
        sQLiteDatabaseA.beginTransaction();
        try {
            sQLiteDatabaseA.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseA.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + wpg0Var.b.getTime()).execute();
            sQLiteDatabaseA.setTransactionSuccessful();
            return null;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        byte b = this.f1770a;
        Object obj = this.b;
        switch (b) {
            case 1:
                cge0 cge0Var = ddl0.V1;
                view.getClass();
                sj3.L0(view, 0, 0, 0, ((ddl0) obj).G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height) + xiv0Var.f40966a.i(2).d, 7);
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
                return xiv0.b;
            case 13:
                b9o0 b9o0Var = (b9o0) obj;
                ArrayList arrayList = b9o0Var.b;
                uiv0 uiv0Var = xiv0Var.f40966a;
                pfx pfxVarB = pfx.b(uiv0Var.i(519), uiv0Var.i(64));
                pfx pfxVarB2 = pfx.b(uiv0Var.j(519), uiv0Var.j(64));
                if (!pfxVarB.equals(b9o0Var.c) || !pfxVarB2.equals(b9o0Var.d)) {
                    b9o0Var.c = pfxVarB;
                    b9o0Var.d = pfxVarB2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        i2d0 i2d0Var = (i2d0) arrayList.get(size);
                        i2d0Var.c = pfxVarB;
                        i2d0Var.d = pfxVarB2;
                        i2d0Var.c();
                    }
                }
                return xiv0Var;
            default:
                y2m0 y2m0Var = zqp0.V1;
                view.getClass();
                sj3.L0(view, 0, 0, 0, ((zqp0) obj).G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height) + xiv0Var.f40966a.i(2).d, 7);
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
                return xiv0.b;
        }
    }

    @Override // a.hwq0
    public boolean onMenuItemClick(MenuItem menuItem) {
        u2s0 u2s0Var = (u2s0) this.b;
        s2m0 s2m0Var = u2s0.X1;
        if (menuItem.getItemId() != R.id.one_x_rules) {
            return false;
        }
        o6j o6jVarH0 = u2s0Var.H0();
        o6jVarH0.d.d(new x9((Object) o6jVarH0, u2s0Var.P1.n(u2s0Var, u2s0.Y1[0]).booleanValue(), (byte) 12));
        return true;
    }
}
