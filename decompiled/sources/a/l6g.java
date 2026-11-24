package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.container.CyberCalendarGridView;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweek.CyberCalendarDaysOfWeekParams;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarWeekView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/l6g;", "La/yx5;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l6g extends yx5 {
    public bei K1;
    public g2v L1;
    public final kiu0 M1;
    public final s0r N1;
    public final khf0 O1;
    public final yzn0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(l6g.class, "binding", "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDaysOfWeekFragmentBinding;", 0), new ez40(l6g.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/calendar/impl/presentation/content/daysofweek/CyberCalendarDaysOfWeekParams;", 0), new ez40(l6g.class, "ufcCalendar", "getUfcCalendar()Z", 0)};
    public static final kwd Q1 = new kwd();

    public l6g() {
        super(R.layout.cyber_calendar_days_of_week_fragment);
        jwd jwdVar = new jwd(this, (byte) 27);
        a8z a8zVarA = maz.a(wez.b, new aqe(new aqe(this, (byte) 26), (byte) 27));
        this.M1 = agc.G(this, sre0.f32672a.b(w6g.class), new cce(a8zVarA, (byte) 26), new cce(a8zVarA, (byte) 27), jwdVar);
        this.N1 = ltt0.o(this, i6g.f14238a);
        this.O1 = new khf0("params_key");
        this.P1 = new yzn0("ufc_key");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        int dimensionPixelSize = G().getDimensionPixelSize(o0().getResources().getBoolean(R.bool.isTablet) ? R.dimen.space_52 : R.dimen.space_0);
        CyberCalendarWeekView cyberCalendarWeekView = G0().e;
        cyberCalendarWeekView.setPadding(dimensionPixelSize, cyberCalendarWeekView.getPaddingTop(), dimensionPixelSize, cyberCalendarWeekView.getPaddingBottom());
        sj3.L0(G0().b, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        sj3.L0(G0().c, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        int i = ((CyberCalendarDaysOfWeekParams) this.O1.n(this, R1[1])).f46486a == yag.c ? 7 : 3;
        CyberCalendarGridView cyberCalendarGridView = G0().b;
        cyberCalendarGridView.f46481a = i;
        cyberCalendarGridView.invalidate();
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(lag.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            lag lagVar = (lag) (ze3Var instanceof lag ? ze3Var : null);
            if (lagVar != null) {
                iiy[] iiyVarArr = R1;
                CyberCalendarDaysOfWeekParams cyberCalendarDaysOfWeekParams = (CyberCalendarDaysOfWeekParams) this.O1.n(this, iiyVarArr[1]);
                Boolean bool = (Boolean) this.P1.n(this, iiyVarArr[2]);
                boolean zBooleanValue = bool.booleanValue();
                cad cadVar = lagVar.f19704a;
                iip iipVar = lagVar.b;
                m1e m1eVar = lagVar.c;
                g2v g2vVar = lagVar.d;
                ctf0 ctf0Var = lagVar.e;
                oeg0 oeg0Var = lagVar.f;
                sjl0 sjl0Var = lagVar.g;
                duj dujVar = lagVar.h;
                ul9 ul9Var = zBooleanValue ? lagVar.j : lagVar.i;
                iipVar.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                sjl0Var.getClass();
                ul9Var.getClass();
                ru ruVar = new ru();
                ruVar.h = m1eVar;
                ruVar.f31100a = cyberCalendarDaysOfWeekParams;
                ruVar.c = bool;
                ruVar.d = ul9Var;
                ruVar.e = sjl0Var;
                ruVar.f = g2vVar;
                ruVar.g = cadVar;
                ruVar.b = dujVar;
                ruVar.i = iipVar;
                ruVar.j = n0k0.a(new uci(ruVar, (byte) 18));
                this.K1 = (bei) ((n5d0) ruVar.j).get();
                this.L1 = g2vVar;
                return;
            }
        }
        jf4.n(b1j.i(lag.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        w6g w6gVarH0 = H0();
        yje yjeVar = null;
        p5a p5aVarH = ulb.H(new dnq(new s6n0(w6gVarH0.m, new u6g(w6gVarH0, null, (byte) 0)), new e00(w6gVarH0, yjeVar, (byte) 17), (byte) 0));
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new b5g(p5aVarH, clzVarW, null, (byte) 2), 3);
        i89 i89Var = new i89(H0().o, (byte) 22);
        k6g k6gVar = new k6g(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fze(i89Var, clzVarW2, k6gVar, (yje) null), 3);
        p7m0 p7m0Var = H0().n;
        k6g k6gVar2 = new k6g(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fze(p7m0Var, clzVarW3, k6gVar2, (yje) null), 3);
    }

    public final m6g G0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        return (m6g) objN;
    }

    public final w6g H0() {
        return (w6g) this.M1.getValue();
    }
}
