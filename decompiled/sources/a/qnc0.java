package a;

import java.util.Arrays;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class qnc0 extends w46 {
    public final pv00 b;
    public final mne c;
    public final ctf0 d;
    public final nou e;
    public final mrt f;
    public final xfu g;
    public final m1e h;
    public final ol60 i;
    public final p7m0 j;
    public final p7m0 k;

    public qnc0(pv00 pv00Var, mne mneVar, ctf0 ctf0Var, nou nouVar, mrt mrtVar, xfu xfuVar, m1e m1eVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = pv00Var;
        this.c = mneVar;
        this.d = ctf0Var;
        this.e = nouVar;
        this.f = mrtVar;
        this.g = xfuVar;
        this.h = m1eVar;
        this.i = new ol60(3);
        this.j = q7m0.a("");
        this.k = q7m0.a("");
        sac.V(jiu0.a(this), new inc0(this, (byte) 1), null, null, new c670(this, null, (byte) 29), 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(zje zjeVar) {
        pnc0 pnc0Var;
        p7m0 p7m0Var;
        if (zjeVar instanceof pnc0) {
            pnc0Var = (pnc0) zjeVar;
            int i = pnc0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                pnc0Var.l = i - Integer.MIN_VALUE;
            } else {
                pnc0Var = new pnc0(this, zjeVar);
            }
        } else {
            pnc0Var = new pnc0(this, zjeVar);
        }
        Object obj = pnc0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = pnc0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            p7m0 p7m0Var2 = this.k;
            pnc0Var.i = p7m0Var2;
            pnc0Var.l = 1;
            Object objA = this.f.a(pnc0Var);
            if (objA == wneVar) {
                return wneVar;
            }
            p7m0Var = p7m0Var2;
            obj = objA;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p7m0Var = pnc0Var.i;
            z1x.P(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ctf0 ctf0Var = this.d;
        String strA = zBooleanValue ? ctf0Var.b.a(R.string.ds_bet_promo_description, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.bet_promo_description, Arrays.copyOf(new Object[0], 0));
        p7m0Var.getClass();
        p7m0Var.o(null, strA);
        return Unit.f46060a;
    }

    public final void x() {
        pek0 pek0Var = pek0.f26859a;
        ctf0 ctf0Var = this.d;
        this.i.f(new lnc0(new xdk0(pek0Var, ctf0Var.f(R.string.no_connection_title_with_hyphen, new Object[0]), ctf0Var.f(R.string.no_connection_description, new Object[0]), null, null, null, 120)));
    }
}
