package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/b9g;", "La/yx5;", "<init>", "()V", "a/qud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b9g extends yx5 {
    public xai K1;
    public final s0r L1;
    public final yzn0 M1;
    public final yzn0 N1;
    public final kiu0 O1;
    public nl9 P1;
    public y8g Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(b9g.class, "binding", "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarPagesFragmentBinding;", 0), new ez40(b9g.class, "segmentType", "getSegmentType()Lorg/xplatform/cyber/calendar/api/domain/model/CyberCalendarType;", 0), new ez40(b9g.class, "ufcCalendar", "getUfcCalendar()Z", 0)};
    public static final qud R1 = new qud();

    public b9g() {
        super(R.layout.cyber_calendar_pages_fragment);
        this.L1 = ltt0.o(this, z8g.f43964a);
        this.M1 = new yzn0("PARAMS_BUNDLE_KEY");
        this.N1 = new yzn0("PARAMS_UFC_KEY");
        e8g e8gVar = new e8g(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new q7g(new q7g(this, (byte) 6), (byte) 7));
        this.O1 = agc.G(this, sre0.f32672a.b(g9g.class), new r7g(a8zVarA, (byte) 6), new r7g(a8zVarA, (byte) 7), e8gVar);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        c9g c9gVarG0 = G0();
        ViewPager2 viewPager2 = c9gVarG0.c;
        if (viewPager2.getAdapter() == null) {
            yag yagVarH0 = H0();
            boolean zBooleanValue = ((Boolean) this.N1.n(this, S1[2])).booleanValue();
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            n6r n6rVarK = K();
            n6rVarK.b();
            nl9 nl9Var = new nl9(yagVarH0, zBooleanValue, eVarC, n6rVarK.c, iun.f15405a, new e8g(c9gVarG0, (byte) 3));
            this.P1 = nl9Var;
            viewPager2.setAdapter(nl9Var);
            viewPager2.setOffscreenPageLimit(1);
            viewPager2.c(new a9g(this, c9gVarG0, (byte) 0));
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ol9.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ol9 ol9Var = (ol9) (ze3Var instanceof ol9 ? ze3Var : null);
            if (ol9Var != null) {
                yag yagVarH0 = H0();
                Boolean bool = (Boolean) this.N1.n(this, S1[2]);
                boolean zBooleanValue = bool.booleanValue();
                cad cadVar = ol9Var.f25440a;
                m1e m1eVar = ol9Var.b;
                g2v g2vVar = ol9Var.c;
                ctf0 ctf0Var = ol9Var.d;
                oeg0 oeg0Var = ol9Var.e;
                sjl0 sjl0Var = ol9Var.f;
                duj dujVar = ol9Var.g;
                ul9 ul9Var = zBooleanValue ? ol9Var.i : ol9Var.h;
                m1eVar.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                sjl0Var.getClass();
                ul9Var.getClass();
                this.K1 = (xai) ((n5d0) new qgd(cadVar, yagVarH0, bool, g2vVar, dujVar, ul9Var).h).get();
                return;
            }
        }
        jf4.n(b1j.i(ol9.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.O1;
        g9g g9gVar = (g9g) kiu0Var.getValue();
        dnq dnqVar = new dnq(new s6n0(g9gVar.j, new f9g(g9gVar, null, (byte) 0)), new e00(g9gVar, null, (byte) 21), (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new b1f(dnqVar, clzVarW, (yje) null), 3);
        p7m0 p7m0Var = ((g9g) kiu0Var.getValue()).k;
        fob fobVar = new fob(this, null, (byte) 29);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g8g(p7m0Var, clzVarW2, fobVar, (yje) null, (byte) 0), 3);
    }

    public final c9g G0() {
        Object objN = this.L1.n(S1[0], this);
        objN.getClass();
        return (c9g) objN;
    }

    public final yag H0() {
        return (yag) this.M1.n(this, S1[1]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        g9g g9gVar = (g9g) this.O1.getValue();
        sac.V(jiu0.a(g9gVar), new vlf((byte) 14), null, null, new f9g(g9gVar, null, (byte) 1), 14);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        List list;
        CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel;
        List list2;
        CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel2;
        if (H0() == yag.b) {
            y8g y8gVar = this.Q1;
            w8g w8gVar = y8gVar instanceof w8g ? (w8g) y8gVar : null;
            y8g y8gVar2 = (y8g) ((g9g) this.O1.getValue()).k.getValue();
            w8g w8gVar2 = y8gVar2 instanceof w8g ? (w8g) y8gVar2 : null;
            long j = 0;
            long j2 = ((w8gVar == null || (list2 = w8gVar.f38720a) == null || (cyberCalendarPeriodUiModel2 = (CyberCalendarPeriodUiModel) CollectionsKt.firstOrNull(list2)) == null) ? 0L : cyberCalendarPeriodUiModel2.f46479a) / 10000;
            if (w8gVar2 != null && (list = w8gVar2.f38720a) != null && (cyberCalendarPeriodUiModel = (CyberCalendarPeriodUiModel) CollectionsKt.firstOrNull(list)) != null) {
                j = cyberCalendarPeriodUiModel.f46479a;
            }
            long j3 = j / 10000;
            if (j3 != j2) {
                G0().c.setAdapter(null);
                nl9 nl9Var = this.P1;
                if (nl9Var != null) {
                    ((ArrayList) nl9Var.n).clear();
                    nl9Var.g();
                }
            }
            G0().c.setVisibility(j3 != j2 ? 4 : 0);
        }
        super.e0();
    }
}
