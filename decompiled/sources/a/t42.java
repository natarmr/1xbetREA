package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/t42;", "La/iw5;", "<init>", "()V", "a/jdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t42 extends iw5 {
    public fiu0 n2;
    public static final /* synthetic */ iiy[] q2 = {new ez40(t42.class, "historyTypeScreen", "getHistoryTypeScreen()Lorg/xplatform/bet_history/domain/model/HistoryTypeScreen;", 0), new ez40(t42.class, "historyTypeModel", "getHistoryTypeModel()Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;", 0), new ez40(t42.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final jdk0 p2 = new jdk0();
    public final yzn0 k2 = new yzn0("HISTORY_TYPE_KEY");
    public final yzn0 l2 = new yzn0("HISTORY_TYPE_MODEL_KEY");
    public final phf0 m2 = new phf0("REQUEST_KEY");
    public final a8z o2 = xbc.b0(this, sre0.f32672a.b(h52.class), new r42(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        t42 t42Var;
        fetVar.e0(778679686);
        L0().K = true;
        L0().N(3);
        k3t0 k3t0VarQ0 = Q0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            t42Var = this;
            Object ln1Var = new ln1(1, t42Var, t42.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/bet_history/history/presentation/dialog/all_filters_bottom_sheet/model/AllFiltersSideEffect;)V", 0, (byte) 10);
            fetVar.o0(ln1Var);
            objP = ln1Var;
        } else {
            t42Var = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zE = fetVar.e(3) | fetVar.i(k3t0VarQ0) | fetVar.i(t42Var) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zE || objP2 == obj) {
            objP2 = new ee0(k3t0VarQ0, t42Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, t42Var, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) t42Var.Q0()).y(fetVar);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(1002114165, new q42(pz40VarY, (byte) 0), fetVar), u1c.M(-1995684291, new ri1(pz40VarY, t42Var, (byte) 28), fetVar), u1c.M(-311715721, new qb((Object) pz40VarY, (Object) ((d52) pz40VarY.getValue()).e, (Object) t42Var, (byte) 16), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(inh0 inh0Var, Function2 function2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1545898687);
        int i2 = i | (fetVar2.g(inh0Var) ? 4 : 2) | (fetVar2.i(function2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            v8q0.a(inh0Var.f15074a, o7k0.y(o7k0.d(o7k0.e(jm40Var, 36.0f), 1.0f), gqw0.d, 2), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fyl fylVar = inh0Var.b;
            vxl vxlVar = vxl.b;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new df1(function2, inh0Var, (byte) 10);
                fetVar2.o0(objP);
            }
            ebc.r(null, fylVar, vxlVar, (Function1) objP, null, fetVar2, 384, 41);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(this, inh0Var, function2, i, (byte) 28);
        }
    }

    public final k3t0 Q0() {
        return (k3t0) this.o2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(u42.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            u42 u42Var = (u42) (ze3Var instanceof u42 ? ze3Var : null);
            if (u42Var != null) {
                iiy[] iiyVarArr = q2;
                f8w f8wVar = (f8w) this.k2.n(this, iiyVarArr[0]);
                HistoryTypeModel historyTypeModel = (HistoryTypeModel) this.l2.n(this, iiyVarArr[1]);
                cad cadVar = u42Var.b;
                ctf0 ctf0Var = u42Var.f35023a;
                r9u r9uVar = u42Var.d;
                pru pruVar = u42Var.c;
                j77 j77Var = u42Var.e;
                t37 t37Var = u42Var.f;
                xdj xdjVar = u42Var.g;
                ctf0Var.getClass();
                r9uVar.getClass();
                j77Var.getClass();
                t37Var.getClass();
                xdjVar.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = historyTypeModel;
                ruVar.b = f8wVar;
                ruVar.c = t37Var;
                ruVar.d = j77Var;
                ruVar.f = pruVar;
                ruVar.e = ctf0Var;
                ruVar.g = xdjVar;
                ruVar.h = r9uVar;
                ruVar.i = cadVar;
                ruVar.j = new t5i(ruVar, (byte) 25);
                this.n2 = new fiu0(Collections.singletonMap(h52.class, (t5i) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(u42.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        C().u0("DATE_PICKER_REQUEST_KEY", this, new gne(this, (byte) 9));
        final byte b = 0;
        sj3.A0(this, "HISTORY_DAY_PICKER_KEY", new Function2(this) { // from class: a.p42
            public final /* synthetic */ t42 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                t42 t42Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b2) {
                    case 0:
                        jdk0 jdk0Var = t42.p2;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            t42Var.Q0().x(new j42(simpleDate));
                        }
                        break;
                    default:
                        jdk0 jdk0Var2 = t42.p2;
                        str.getClass();
                        bundle2.getClass();
                        DateRangeModel dateRangeModel = (DateRangeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE", DateRangeModel.class));
                        if (dateRangeModel != null) {
                            t42Var.Q0().x(new i42(dateRangeModel));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        sj3.A0(this, "RESULT_KEY_CALENDAR_RANGE_REQUEST", new Function2(this) { // from class: a.p42
            public final /* synthetic */ t42 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                t42 t42Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b3) {
                    case 0:
                        jdk0 jdk0Var = t42.p2;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            t42Var.Q0().x(new j42(simpleDate));
                        }
                        break;
                    default:
                        jdk0 jdk0Var2 = t42.p2;
                        str.getClass();
                        bundle2.getClass();
                        DateRangeModel dateRangeModel = (DateRangeModel) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_DATE_RANGE", DateRangeModel.class));
                        if (dateRangeModel != null) {
                            t42Var.Q0().x(new i42(dateRangeModel));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
    }
}
