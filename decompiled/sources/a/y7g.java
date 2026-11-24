package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.cyber.calendar.impl.presentation.container.CyberCalendarGridView;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweekview.CyberCalendarDaysOfWeekView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/y7g;", "La/yx5;", "<init>", "()V", "a/std", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y7g extends yx5 {
    public zdi K1;
    public g2v L1;
    public final kiu0 M1;
    public final s0r N1;
    public final khf0 O1;
    public final yzn0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(y7g.class, "binding", "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarMonthFragmentBinding;", 0), new ez40(y7g.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;", 0), new ez40(y7g.class, "ufcCalendar", "getUfcCalendar()Z", 0)};
    public static final std Q1 = new std();

    public y7g() {
        super(R.layout.cyber_calendar_month_fragment);
        jwd jwdVar = new jwd(this, (byte) 29);
        a8z a8zVarA = maz.a(wez.b, new q7g(new q7g(this, (byte) 2), (byte) 3));
        this.M1 = agc.G(this, sre0.f32672a.b(u8g.class), new r7g(a8zVarA, (byte) 2), new r7g(a8zVarA, (byte) 3), jwdVar);
        this.N1 = ltt0.o(this, v7g.f36923a);
        this.O1 = new khf0("params_key");
        this.P1 = new yzn0("ufc_key");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        int dimensionPixelSize = G().getDimensionPixelSize(o0().getResources().getBoolean(R.bool.isTablet) ? R.dimen.space_52 : R.dimen.space_0);
        CyberCalendarDaysOfWeekView cyberCalendarDaysOfWeekView = G0().c;
        cyberCalendarDaysOfWeekView.setPadding(dimensionPixelSize, cyberCalendarDaysOfWeekView.getPaddingTop(), dimensionPixelSize, cyberCalendarDaysOfWeekView.getPaddingBottom());
        sj3.L0(G0().b, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        sj3.L0(G0().e, dimensionPixelSize, 0, dimensionPixelSize, 0, 10);
        CyberCalendarGridView cyberCalendarGridView = G0().b;
        cyberCalendarGridView.f46481a = 7;
        cyberCalendarGridView.invalidate();
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(u7g.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            u7g u7gVar = (u7g) (ze3Var instanceof u7g ? ze3Var : null);
            if (u7gVar != null) {
                iiy[] iiyVarArr = R1;
                CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel = (CyberCalendarPeriodUiModel) this.O1.n(this, iiyVarArr[1]);
                Boolean bool = (Boolean) this.P1.n(this, iiyVarArr[2]);
                boolean zBooleanValue = bool.booleanValue();
                cad cadVar = u7gVar.f35182a;
                iip iipVar = u7gVar.b;
                m1e m1eVar = u7gVar.c;
                g2v g2vVar = u7gVar.d;
                ctf0 ctf0Var = u7gVar.e;
                oeg0 oeg0Var = u7gVar.f;
                sjl0 sjl0Var = u7gVar.g;
                duj dujVar = u7gVar.h;
                ul9 ul9Var = zBooleanValue ? u7gVar.j : u7gVar.i;
                iipVar.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                sjl0Var.getClass();
                ul9Var.getClass();
                ru ruVar = new ru();
                ruVar.h = m1eVar;
                ruVar.f31100a = cyberCalendarPeriodUiModel;
                ruVar.c = bool;
                ruVar.d = ul9Var;
                ruVar.e = sjl0Var;
                ruVar.f = iipVar;
                ruVar.g = g2vVar;
                ruVar.i = cadVar;
                ruVar.b = dujVar;
                ruVar.j = n0k0.a(new uci(ruVar, (byte) 16));
                this.K1 = (zdi) ((n5d0) ruVar.j).get();
                this.L1 = g2vVar;
                return;
            }
        }
        jf4.n(b1j.i(u7g.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        u8g u8gVarH0 = H0();
        yje yjeVar = null;
        p5a p5aVarH = ulb.H(new dnq(new s6n0(u8gVarH0.l, new s8g(u8gVarH0, yjeVar, (byte) 1)), new e00(u8gVarH0, yjeVar, (byte) 20), (byte) 0));
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new b5g(p5aVarH, clzVarW, null, (byte) 5), 3);
        i89 i89Var = new i89(H0().m, (byte) 22);
        w7g w7gVar = new w7g(this, null, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fze(i89Var, clzVarW2, w7gVar, (yje) null), 3);
        p7m0 p7m0Var = H0().n;
        w7g w7gVar2 = new w7g(this, null, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fze(p7m0Var, clzVarW3, w7gVar2, (yje) null), 3);
    }

    public final z7g G0() {
        Object objN = this.N1.n(R1[0], this);
        objN.getClass();
        return (z7g) objN;
    }

    public final u8g H0() {
        return (u8g) this.M1.getValue();
    }
}
