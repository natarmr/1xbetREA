package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.presentation.TransferScreenParams;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.disciplinefilter.model.TransfersDisciplineFilterBottomParams;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.timefilter.model.TransfersTimeFilterBottomParams;

/* JADX INFO: loaded from: classes4.dex */
public final class els0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final TransferScreenParams o;
    public final hzg p;
    public final lbu q;
    public final ctf0 r;
    public final j3c s;
    public final ih5 t;
    public final zr1 u;
    public bby v;

    /* JADX WARN: Illegal instructions before constructor call */
    public els0(TransferScreenParams transferScreenParams, mne mneVar, hzg hzgVar, lbu lbuVar, ctf0 ctf0Var, g2v g2vVar, j3c j3cVar, ih5 ih5Var, zr1 zr1Var) {
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new yip0(transferScreenParams, ctf0Var, (byte) 25), g090VarP, new cls0(g2vVar, ctf0Var, (byte) 0), (yzn0) null);
        this.o = transferScreenParams;
        this.p = hzgVar;
        this.q = lbuVar;
        this.r = ctf0Var;
        this.s = j3cVar;
        this.t = ih5Var;
        this.u = zr1Var;
        i3t0.K(this, null, null, new aiz(this, null, (byte) 1), 3);
    }

    public final void M(boolean z, long j) {
        bby bbyVar = this.v;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.v = i3t0.K(this, null, null, new dls0(this, j, z, null), 3);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        qis0 qis0Var = (qis0) obj;
        qis0Var.getClass();
        super.x(qis0Var);
        if (!(qis0Var instanceof pis0)) {
            if (!(qis0Var instanceof dis0)) {
                t9f.b();
                return;
            }
            dis0 dis0Var = (dis0) qis0Var;
            if (dis0Var.equals(ais0.f940a)) {
                E();
                return;
            }
            if (dis0Var.equals(bis0.f2672a)) {
                bby bbyVar = this.v;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                    return;
                }
                return;
            }
            if (!dis0Var.equals(cis0.f4428a)) {
                t9f.b();
                return;
            } else {
                if (((pks0) D()).e == null) {
                    M(((pks0) D()).h, ((pks0) D()).b);
                    return;
                }
                return;
            }
        }
        pis0 pis0Var = (pis0) qis0Var;
        boolean zEquals = pis0Var.equals(eis0.f7875a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        kks0 kks0Var = kks0.f18457a;
        hzg hzgVar = this.p;
        if (zEquals) {
            if (!((pks0) D()).g) {
                ((uzg) hzgVar).a();
                return;
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, pks0.a((pks0) value5, 0L, null, null, false, false, "", null, null, 3775)));
            G(kks0Var);
            return;
        }
        if (pis0Var.equals(jis0.f16591a)) {
            M(((pks0) D()).h, ((pks0) D()).b);
            return;
        }
        if (pis0Var.equals(his0.f13131a)) {
            G(kks0Var);
            return;
        }
        if (pis0Var.equals(lis0.f20121a)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, pks0.a((pks0) value4, 0L, null, null, true, false, null, null, null, 4031)));
            return;
        }
        if (pis0Var instanceof mis0) {
            mis0 mis0Var = (mis0) pis0Var;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, pks0.a((pks0) value3, 0L, null, null, false, false, mis0Var.f21861a, null, null, 3839)));
            return;
        }
        if (pis0Var instanceof fis0) {
            long j = ((fis0) pis0Var).f9603a;
            if (j == 1) {
                G(new lks0(new TransfersDisciplineFilterBottomParams(((pks0) D()).b, ((pks0) D()).l)));
                return;
            } else {
                if (j == 2) {
                    G(new nks0(new TransfersTimeFilterBottomParams(((pks0) D()).k, ((pks0) D()).j)));
                    return;
                }
                return;
            }
        }
        if (pis0Var instanceof gis0) {
            long j2 = ((pks0) D()).b;
            long j3 = ((gis0) pis0Var).f11365a;
            if (j2 != j3) {
                M(true, j3);
                return;
            }
            return;
        }
        if (pis0Var instanceof ois0) {
            TransferTimeFilterUiModel transferTimeFilterUiModel = ((ois0) pis0Var).f25327a;
            if (((pks0) D()).k.equals(transferTimeFilterUiModel)) {
                return;
            }
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, pks0.a((pks0) value2, 0L, null, null, false, true, null, transferTimeFilterUiModel, null, 2943)));
            return;
        }
        if (pis0Var instanceof iis0) {
            long j4 = ((pks0) D()).b;
            String str = ((iis0) pis0Var).f14843a;
            uzg uzgVar = (uzg) hzgVar;
            uzgVar.getClass();
            uzgVar.f36533a.c().d(new mz0((Object) uzgVar, j4, (Object) str, (byte) 12));
            return;
        }
        if (!(pis0Var instanceof nis0)) {
            if (!pis0Var.equals(kis0.f18352a)) {
                t9f.b();
                return;
            }
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value = p7m0Var5.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value, pks0.a((pks0) value, 0L, null, null, false, false, null, null, null, 3967)));
            return;
        }
        nis0 nis0Var = (nis0) pis0Var;
        List listJ = q3d.j(ttg.d, trg.d, oxg.d, pug.d, yvg.d);
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((yxg) it.next()).f43419a));
        }
        if (arrayList.contains(Long.valueOf(((pks0) D()).b))) {
            long j5 = nis0Var.f23605a;
            if (j5 != -1 && j5 != 0) {
                this.t.p(r1g.CYBERSPORT_TRANSFERS, ((pks0) D()).b);
                this.u.z(((pks0) D()).b, "cyber_transfers");
                ((uzg) hzgVar).n(((pks0) D()).b, nis0Var.f23605a, nis0Var.b, k1g.UNKNOWN);
                return;
            }
        }
        G(new mks0(this.r.b.a(R.string.snackbar_no_info_for_selected_team, Arrays.copyOf(new Object[0], 0))));
    }
}
