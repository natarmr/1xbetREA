package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v93 extends i3t0 {
    public final hzg o;
    public final e1u p;
    public final oeg0 q;
    public final vqc r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v93(mne mneVar, hzg hzgVar, e1u e1uVar, oeg0 oeg0Var, vqc vqcVar) {
        super(new f33((byte) 6), cvm0.p(mneVar.c, mneVar.f22085a), new sy2((byte) 17), (yzn0) null);
        oeg0Var.getClass();
        this.o = hzgVar;
        this.p = e1uVar;
        this.q = oeg0Var;
        this.r = vqcVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        vcw vcwVar;
        List list;
        List list2;
        Object next;
        o93 o93Var = (o93) obj;
        o93Var.getClass();
        super.x(o93Var);
        if (o93Var instanceof m93) {
            ((uzg) this.o).a();
            return;
        }
        if (!(o93Var instanceof l93)) {
            if (!(o93Var instanceof n93)) {
                t9f.b();
                return;
            }
            n93 n93Var = (n93) o93Var;
            Cnew cnew = (Cnew) ((pew) this.p.b).b.b.b();
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, new s93(cnew, ((s93) value).b, n93Var.f23118a)));
            return;
        }
        l93 l93Var = (l93) o93Var;
        Cnew cnew2 = ((s93) D()).f31833a;
        jdw jdwVar = null;
        Object obj2 = null;
        jdwVar = null;
        if (cnew2 == null || (list2 = cnew2.b) == null) {
            vcwVar = null;
        } else {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((vcw) next).f37207a != ((s93) D()).c);
            vcwVar = (vcw) next;
        }
        if (vcwVar != null && (list = vcwVar.c) != null) {
            for (Object obj3 : list) {
                if (((jdw) obj3).f16349a == l93Var.f19632a) {
                    obj2 = obj3;
                    break;
                }
            }
            jdwVar = (jdw) obj2;
        }
        this.q.c().d(new mz0((Object) this, (Object) l93Var, jdwVar != null ? jdwVar.c : 0L, (byte) 5));
    }
}
