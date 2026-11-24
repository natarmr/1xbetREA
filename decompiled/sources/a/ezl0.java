package a;

import java.util.List;
import kotlin.Unit;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
public final class ezl0 extends i3t0 {
    public final TypeStageId o;
    public final ivn p;
    public final zrc q;

    public ezl0(TypeStageId typeStageId, mne mneVar, ocl oclVar, ivn ivnVar, zrc zrcVar) {
        super(null, new fzk0((byte) 23), new yar(oclVar, (byte) 12), cvm0.p(mneVar.c, mneVar.f22085a), null);
        this.o = typeStageId;
        this.p = ivnVar;
        this.q = zrcVar;
        sac.V(jiu0.a(this), new j1l0(this, (byte) 11), null, null, new yng0(this, null, (byte) 24), 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(TypeStageId typeStageId, zje zjeVar) {
        dzl0 dzl0Var;
        Object value;
        if (zjeVar instanceof dzl0) {
            dzl0Var = (dzl0) zjeVar;
            int i = dzl0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dzl0Var.k = i - Integer.MIN_VALUE;
            } else {
                dzl0Var = new dzl0(this, zjeVar);
            }
        } else {
            dzl0Var = new dzl0(this, zjeVar);
        }
        Object objA = dzl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = dzl0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            dzl0Var.k = 1;
            objA = ((q2m0) this.p.f15453a).a(typeStageId, true, dzl0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list = ((pdt0) objA).c;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            list.getClass();
        } while (!p7m0Var.m(value, new yyl0(list, false, false)));
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ((uyl0) obj).getClass();
        zrc zrcVar = this.q;
        zrcVar.getClass();
        TypeStageId typeStageId = this.o;
        typeStageId.getClass();
        q2m0 q2m0Var = zrcVar.f44846a;
        q2m0Var.getClass();
        l2m0 l2m0Var = q2m0Var.c;
        l2m0Var.getClass();
        l2m0Var.f19317a.remove(typeStageId);
        sac.V(jiu0.a(this), new j1l0(this, (byte) 11), null, null, new yng0(this, null, (byte) 24), 14);
    }
}
