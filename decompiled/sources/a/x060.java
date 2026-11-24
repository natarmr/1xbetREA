package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class x060 extends i3t0 {
    public static final /* synthetic */ int H = 0;
    public final jtj A;
    public final ntu B;
    public final ort C;
    public final ont D;
    public final duj E;
    public final bzu F;
    public bby G;
    public final vzg0 o;
    public final i1w0 p;
    public final mne q;
    public final ctf0 r;
    public final pru s;
    public final jtj t;
    public final fhj u;
    public final o470 v;
    public final n4u w;
    public final z8u x;
    public final rpt y;
    public final ali z;

    public x060(vzg0 vzg0Var, i1w0 i1w0Var, mne mneVar, ctf0 ctf0Var, g2v g2vVar, m1e m1eVar, pru pruVar, jtj jtjVar, fhj fhjVar, o470 o470Var, n4u n4uVar, z8u z8uVar, rpt rptVar, ali aliVar, jtj jtjVar2, ntu ntuVar, ort ortVar, ont ontVar, duj dujVar, bzu bzuVar, qho qhoVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        g8l g8lVar = new g8l(ctf0Var, g2vVar, qhoVar, (byte) 28);
        v510 v510Var = new v510(ctf0Var, (byte) 18);
        rwj rwjVar = mneVar.f22085a;
        super(null, g8lVar, v510Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = vzg0Var;
        this.p = i1w0Var;
        this.q = mneVar;
        this.r = ctf0Var;
        this.s = pruVar;
        this.t = jtjVar;
        this.u = fhjVar;
        this.v = o470Var;
        this.w = n4uVar;
        this.x = z8uVar;
        this.y = rptVar;
        this.z = aliVar;
        this.A = jtjVar2;
        this.B = ntuVar;
        this.C = ortVar;
        this.D = ontVar;
        this.E = dujVar;
        this.F = bzuVar;
        i3t0.K(this, null, null, new v060(this, null, (byte) 0), 3);
    }

    public final void M() {
        bby bbyVar = this.G;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.G = sac.V(jiu0.a(this), new jw50(1, this, x060.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, this.q.f22085a, new w620((Object) this, (yje) null, (byte) 24), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        d060 d060Var = (d060) obj;
        d060Var.getClass();
        super.x(d060Var);
        if (d060Var instanceof uz50) {
            E();
            return;
        }
        if (d060Var instanceof vz50) {
            M();
            return;
        }
        yje yjeVar = null;
        if (d060Var instanceof xz50) {
            bby bbyVar = this.G;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        if (d060Var instanceof yz50) {
            i3t0.K(this, null, null, new v060(this, yjeVar, (byte) 1), 3);
            return;
        }
        if (!(d060Var instanceof zz50)) {
            if (!(d060Var instanceof a060)) {
                if (d060Var instanceof b060) {
                    ctf0 ctf0Var = this.r;
                    G(new p060(ctf0Var.b.a(R.string.attention, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.favorite_filters_reset_default_dialog_desc, Arrays.copyOf(new Object[0], 0))));
                    return;
                } else {
                    if (d060Var instanceof c060) {
                        i3t0.K(this, null, null, new v060(this, yjeVar, (byte) 2), 3);
                        return;
                    }
                    if (!(d060Var instanceof wz50)) {
                        t9f.b();
                        return;
                    }
                    bby bbyVar2 = this.G;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    M();
                    return;
                }
            }
            a060 a060Var = (a060) d060Var;
            int i = a060Var.f11a;
            int i2 = a060Var.b;
            if (i != i2) {
                ArrayList arrayListN0 = CollectionsKt.N0(((q060) D()).e);
                if (arrayListN0.size() > i && arrayListN0.size() > i2) {
                    arrayListN0.add(i2, (k460) arrayListN0.remove(i));
                }
                List listL0 = CollectionsKt.L0(arrayListN0);
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, q060.a((q060) value, null, null, listL0, null, null, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS)));
                ArrayList arrayList = new ArrayList(r3d.q(listL0, 10));
                Iterator it = listL0.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((k460) it.next()).f17654a));
                }
                this.o.e("CURRENT_ORDER_KEY", CollectionsKt.M0(arrayList));
                return;
            }
            return;
        }
        i1w0 i1w0Var = this.p;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
