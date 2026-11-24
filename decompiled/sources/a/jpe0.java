package a;

import android.view.View;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.ui_core.viewcomponents.views.TaxExpandableSpoiler;
import org.xplatform.uikit_sport.express_card.SportExpressCard;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jpe0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16896a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jpe0(Object obj, byte b) {
        this.f16896a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        evo0 evo0Var;
        byte b = this.f16896a;
        p0w0 p0w0Var = p0w0.f26173a;
        byte b2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = ppe0.S1;
                ((ppe0) obj).H0().f.B();
                break;
            case 1:
                iiy[] iiyVarArr = iuf0.R1;
                ((iuf0) obj).H0().x();
                break;
            case 2:
                cge0 cge0Var = dwf0.O1;
                i1w0 i1w0Var = ((jwf0) ((dwf0) obj).L1.getValue()).g;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 3:
                eke0 eke0Var = ayf0.S1;
                nyf0 nyf0VarH0 = ((ayf0) obj).H0();
                sac.V(jiu0.a(nyf0VarH0), new cyf0(nyf0VarH0, (byte) 3), null, nyf0VarH0.q.f22085a, new k6d0(nyf0VarH0, null, (byte) 16), 10);
                break;
            case 4:
                woe0 woe0Var = (woe0) ((o470) obj).f24619a;
                gne0 gne0Var = woe0.S1;
                woe0Var.H0().w("rules_link");
                break;
            case 5:
                lme0 lme0Var = mug0.m2;
                rug0 rug0Var = (rug0) ((mug0) obj).l2.getValue();
                if (rug0Var.e) {
                    rug0Var.d.g(new pug0(rug0Var.b));
                }
                break;
            case 6:
                eke0 eke0Var2 = m9i0.S1;
                i1w0 i1w0Var2 = ((m9i0) obj).H0().c;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (pawVar2.hasNext()) {
                        i1w0Var2.a((oe50) pawVar2.next());
                    }
                    break;
                }
                break;
            case 7:
                iiy[] iiyVarArr2 = t9i0.Q1;
                i1w0 i1w0Var3 = ((t9i0) obj).H0().c;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0Var), i1w0Var3, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (pawVar3.hasNext()) {
                        i1w0Var3.a((oe50) pawVar3.next());
                    }
                    break;
                }
                break;
            case 8:
                rd7 rd7Var = ((oyj0) obj).R1;
                if (rd7Var != null) {
                    rd7Var.invoke();
                }
                break;
            case 9:
                iiy[] iiyVarArr3 = wgk0.d2;
                ((wgk0) obj).S0();
                break;
            case 10:
                int i = SportExpressCard.r;
                ((lhf) obj).invoke();
                break;
            case 11:
                s2m0 s2m0Var = whn0.Y1;
                fin0 fin0VarJ0 = ((whn0) obj).J0();
                fin0VarJ0.b.d(new xhn0(fin0VarJ0, b2));
                break;
            case 12:
                TaxExpandableSpoiler taxExpandableSpoiler = (TaxExpandableSpoiler) obj;
                int i2 = TaxExpandableSpoiler.k;
                int iOrdinal = taxExpandableSpoiler.b.ordinal();
                if (iOrdinal == 0) {
                    evo0Var = evo0.b;
                } else if (iOrdinal != 1) {
                    t9f.b();
                } else {
                    evo0Var = evo0.f8481a;
                }
                taxExpandableSpoiler.b = evo0Var;
                taxExpandableSpoiler.d();
                break;
            case 13:
                ((zdq0) obj).h.invoke();
                break;
            case 14:
                s2m0 s2m0Var2 = u2s0.X1;
                ((u2s0) obj).H0().w();
                break;
            case 15:
                s9m0 s9m0Var = hvs0.c2;
                ((hvs0) obj).z0(false, false, false);
                break;
            case 16:
                uxs0 uxs0Var = a9u0.R1;
                i1w0 i1w0Var4 = ((i9u0) ((a9u0) obj).P1.getValue()).b;
                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var4);
                ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, p0w0Var), i1w0Var4, copyOnWriteArrayListQ4, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorP4;
                    if (pawVar4.hasNext()) {
                        i1w0Var4.a((oe50) pawVar4.next());
                    }
                    break;
                }
                break;
            case 17:
                bzs0 bzs0Var = mau0.Q1;
                ((mau0) obj).H0().A();
                break;
            case 18:
                w1v0 w1v0Var = (w1v0) obj;
                bzs0 bzs0Var2 = w1v0.j2;
                vcc.f0(i120.U(), w1v0Var, w1v0Var.S0());
                w1v0Var.z0(false, false, false);
                break;
            default:
                kys0 kys0Var = u3v0.P1;
                i1w0 i1w0Var5 = ((u3v0) obj).H0().b;
                CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var5);
                ListIterator listIteratorP5 = b1j.p(copyOnWriteArrayListQ5, new c8d(y7d.f42146a, p0w0Var), i1w0Var5, copyOnWriteArrayListQ5, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorP5;
                    if (pawVar5.hasNext()) {
                        i1w0Var5.a((oe50) pawVar5.next());
                    }
                    break;
                }
                break;
        }
    }
}
