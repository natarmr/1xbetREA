package a;

import kotlin.Unit;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
public final class q2m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trm0 f28007a;
    public final n7e0 b;
    public final l2m0 c;
    public final knf0 d;
    public final mne e;
    public final pdt0 f;

    public q2m0(trm0 trm0Var, n7e0 n7e0Var, l2m0 l2m0Var, knf0 knf0Var, mne mneVar) {
        n7e0Var.getClass();
        l2m0Var.getClass();
        knf0Var.getClass();
        this.f28007a = trm0Var;
        this.b = n7e0Var;
        this.c = l2m0Var;
        this.d = knf0Var;
        this.e = mneVar;
        iun iunVar = iun.f15405a;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.f = new pdt0("", "", iunVar, lunVar, lunVar, true, iunVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(TypeStageId typeStageId, boolean z, zje zjeVar) {
        n2m0 n2m0Var;
        q2m0 q2m0Var;
        if (zjeVar instanceof n2m0) {
            n2m0Var = (n2m0) zjeVar;
            int i = n2m0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                n2m0Var.l = i - Integer.MIN_VALUE;
            } else {
                n2m0Var = new n2m0(this, zjeVar);
            }
        } else {
            n2m0Var = new n2m0(this, zjeVar);
        }
        Object obj = n2m0Var.j;
        Object obj2 = wne.f39444a;
        int i2 = n2m0Var.l;
        l2m0 l2m0Var = this.c;
        if (i2 == 0) {
            z1x.P(obj);
            l2m0Var.getClass();
            typeStageId.getClass();
            if (l2m0Var.f19317a.get(typeStageId) == null) {
                int iB = this.d.b();
                n2m0Var.i = typeStageId;
                n2m0Var.l = 1;
                q2m0Var = this;
                Object objD0 = qjj.d0(this.e.b, new p2m0(typeStageId, z, q2m0Var, org.xplatform.statistic.stage.api.domain.c.a(typeStageId), iB, null), n2m0Var);
                if (objD0 != obj2) {
                    objD0 = Unit.f46060a;
                }
                if (objD0 == obj2) {
                    return obj2;
                }
                typeStageId = typeStageId;
            } else {
                q2m0Var = this;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            typeStageId = n2m0Var.i;
            z1x.P(obj);
            q2m0Var = this;
        }
        l2m0Var.getClass();
        typeStageId.getClass();
        pdt0 pdt0Var = (pdt0) l2m0Var.f19317a.get(typeStageId);
        return pdt0Var == null ? q2m0Var.f : pdt0Var;
    }
}
