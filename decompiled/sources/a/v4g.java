package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.container.champinfo.CyberCalendarChampInfoParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/v4g;", "La/stl;", "La/w4g;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v4g extends stl<w4g> {
    public fiu0 g2;
    public final nae0 h2 = ltt0.p(this, u4g.f35046a);
    public final kiu0 i2;
    public final khf0 j2;
    public final yzn0 k2;
    public static final /* synthetic */ iiy[] m2 = {new j0d0(v4g.class, "binding", "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarChampInfoDialogBinding;", 0), new ez40(v4g.class, "params", "getParams()Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;", 0), new ez40(v4g.class, "ufcCalendar", "getUfcCalendar()Z", 0)};
    public static final kud l2 = new kud();

    public v4g() {
        jwd jwdVar = new jwd(this, (byte) 26);
        a8z a8zVarA = maz.a(wez.b, new aqe(new aqe(this, (byte) 22), (byte) 23));
        this.i2 = agc.G(this, sre0.f32672a.b(x4g.class), new cce(a8zVarA, (byte) 22), new cce(a8zVarA, (byte) 23), jwdVar);
        this.j2 = new khf0("CHAMP_INFO_PARAMS");
        this.k2 = new yzn0("UFC_KEY");
    }

    @Override // a.stl
    public final yfu0 Q0() {
        Object objN = this.h2.n(m2[0], this);
        objN.getClass();
        return (w4g) objN;
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(s4g.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            s4g s4gVar = (s4g) (ze3Var instanceof s4g ? ze3Var : null);
            if (s4gVar != null) {
                CyberCalendarChampInfoParams cyberCalendarChampInfoParamsV0 = V0();
                Boolean bool = (Boolean) this.k2.n(this, m2[2]);
                pyg pygVar = s4gVar.f31603a;
                ugf0 ugf0Var = s4gVar.b;
                oeg0 oeg0Var = s4gVar.c;
                kys0 kys0Var = s4gVar.d;
                pygVar.getClass();
                oeg0Var.getClass();
                ywq0 ywq0Var = new ywq0();
                ywq0Var.f43384a = pygVar;
                ywq0Var.b = cyberCalendarChampInfoParamsV0;
                ywq0Var.c = oeg0Var;
                ywq0Var.d = bool;
                ywq0Var.e = ugf0Var;
                ywq0Var.f = kys0Var;
                ywq0Var.g = new uci(ywq0Var, (byte) 12);
                this.g2 = new fiu0(Collections.singletonMap(x4g.class, (uci) ywq0Var.g));
                return;
            }
        }
        jf4.n(b1j.i(s4g.class, "Cannot create dependency "));
    }

    public final CyberCalendarChampInfoParams V0() {
        return (CyberCalendarChampInfoParams) this.j2.n(this, m2[1]);
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        iiy[] iiyVarArr = m2;
        final byte b = 0;
        Object objN = this.h2.n(iiyVarArr[0], this);
        objN.getClass();
        w4g w4gVar = (w4g) objN;
        w4gVar.k.setTitle(V0().f46482a);
        DsButton dsButton = w4gVar.b;
        if (V0().g > 0) {
            dsButton.setOnClickListener(new View.OnClickListener(this) { // from class: a.t4g
                public final /* synthetic */ v4g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object next;
                    byte b2 = b;
                    v4g v4gVar = this.b;
                    switch (b2) {
                        case 0:
                            x4g x4gVar = (x4g) v4gVar.i2.getValue();
                            hzg hzgVar = x4gVar.b;
                            CyberCalendarChampInfoParams cyberCalendarChampInfoParams = x4gVar.c;
                            Iterator it = x4gVar.f.f20692a.a().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    lok0 lok0Var = (lok0) next;
                                    if (lok0Var.f20396a != cyberCalendarChampInfoParams.i || !lok0Var.t.contains(1)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            lok0 lok0Var2 = (lok0) next;
                            if (lok0Var2 != null) {
                                ((uzg) hzgVar).o(lok0Var2.f20396a, lok0Var2.b);
                            } else if (x4gVar.e) {
                                i1w0 i1w0VarC = x4gVar.d.c();
                                k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                                k0w0VarI.h(x4gVar.g.d(cyberCalendarChampInfoParams.g, cyberCalendarChampInfoParams.f46482a));
                                ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorO;
                                    if (pawVar.hasNext()) {
                                        i1w0VarC.a((oe50) pawVar.next());
                                    }
                                }
                            } else {
                                long j = cyberCalendarChampInfoParams.h;
                                long j2 = cyberCalendarChampInfoParams.g;
                                String str = cyberCalendarChampInfoParams.f46482a;
                                byte b3 = CyberGamesPage.Real.INSTANCE.f46556a;
                                k1g k1gVar = k1g.OPEN_REGULAR;
                                ((uzg) hzgVar).f(str, j, j2, b3);
                            }
                            v4gVar.x0();
                            break;
                        default:
                            kud kudVar = v4g.l2;
                            v4gVar.x0();
                            break;
                    }
                }
            });
            String string = dsButton.getResources().getString(R.string.go_to_tournament);
            string.getClass();
            dsButton.l(string);
        } else {
            final byte b2 = 1;
            dsButton.setOnClickListener(new View.OnClickListener(this) { // from class: a.t4g
                public final /* synthetic */ v4g b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object next;
                    byte b3 = b2;
                    v4g v4gVar = this.b;
                    switch (b3) {
                        case 0:
                            x4g x4gVar = (x4g) v4gVar.i2.getValue();
                            hzg hzgVar = x4gVar.b;
                            CyberCalendarChampInfoParams cyberCalendarChampInfoParams = x4gVar.c;
                            Iterator it = x4gVar.f.f20692a.a().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    lok0 lok0Var = (lok0) next;
                                    if (lok0Var.f20396a != cyberCalendarChampInfoParams.i || !lok0Var.t.contains(1)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            lok0 lok0Var2 = (lok0) next;
                            if (lok0Var2 != null) {
                                ((uzg) hzgVar).o(lok0Var2.f20396a, lok0Var2.b);
                            } else if (x4gVar.e) {
                                i1w0 i1w0VarC = x4gVar.d.c();
                                k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                                k0w0VarI.h(x4gVar.g.d(cyberCalendarChampInfoParams.g, cyberCalendarChampInfoParams.f46482a));
                                ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorO;
                                    if (pawVar.hasNext()) {
                                        i1w0VarC.a((oe50) pawVar.next());
                                    }
                                }
                            } else {
                                long j = cyberCalendarChampInfoParams.h;
                                long j2 = cyberCalendarChampInfoParams.g;
                                String str = cyberCalendarChampInfoParams.f46482a;
                                byte b4 = CyberGamesPage.Real.INSTANCE.f46556a;
                                k1g k1gVar = k1g.OPEN_REGULAR;
                                ((uzg) hzgVar).f(str, j, j2, b4);
                            }
                            v4gVar.x0();
                            break;
                        default:
                            kud kudVar = v4g.l2;
                            v4gVar.x0();
                            break;
                    }
                }
            });
            String string2 = dsButton.getResources().getString(R.string.close);
            string2.getClass();
            dsButton.l(string2);
        }
        w4gVar.h.setText(V0().c);
        List list = u0d.f34849a;
        u0d.j(w4gVar.d, V0().d, ((Boolean) this.k2.n(this, iiyVarArr[2])).booleanValue() ? R.drawable.ic_sport_boxing_champs_228 : R.drawable.ic_glyph_cyber_gamepad, 0, null, null, null, 508);
        w4gVar.c.setVisibility(V0().b.length() > 0 ? 0 : 8);
        w4gVar.g.setText(V0().b);
        w4gVar.f.setVisibility(V0().e.length() > 0 ? 0 : 8);
        w4gVar.j.setText(V0().e);
        w4gVar.e.setVisibility(V0().f.length() <= 0 ? (byte) 8 : (byte) 0);
        w4gVar.i.setText(V0().f);
    }
}
