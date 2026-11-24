package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class n2u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2u f22820a;
    public final o8u b;
    public final pmi c;
    public final epc d;
    public final kqc e;
    public final pru f;

    public n2u(j2u j2uVar, o8u o8uVar, pmi pmiVar, epc epcVar, kqc kqcVar, pru pruVar) {
        j2uVar.getClass();
        this.f22820a = j2uVar;
        this.b = o8uVar;
        this.c = pmiVar;
        this.d = epcVar;
        this.e = kqcVar;
        this.f = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(List list, zje zjeVar) {
        m2u m2uVar;
        j2u j2uVar;
        if (zjeVar instanceof m2u) {
            m2uVar = (m2u) zjeVar;
            int i = m2uVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                m2uVar.m = i - Integer.MIN_VALUE;
            } else {
                m2uVar = new m2u(this, zjeVar);
            }
        } else {
            m2uVar = new m2u(this, zjeVar);
        }
        m2u m2uVar2 = m2uVar;
        Object objX = m2uVar2.k;
        wne wneVar = wne.f39444a;
        int i2 = m2uVar2.m;
        if (i2 == 0) {
            z1x.P(objX);
            j2uVar = this.f22820a;
            m2uVar2.i = j2uVar;
            m2uVar2.j = list;
            m2uVar2.m = 1;
            objX = this.c.x(m2uVar2);
            if (objX != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            list = m2uVar2.j;
            j2uVar = (j2u) m2uVar2.i;
            z1x.P(objX);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj = m2uVar2.i;
                z1x.P(objX);
                return obj;
            }
            z1x.P(objX);
        }
        List list2 = (List) objX;
        m2uVar2.i = objX;
        m2uVar2.j = null;
        m2uVar2.m = 3;
        ehf0 ehf0Var = this.b.f24850a.f1850a;
        list2.getClass();
        ((or30) ehf0Var.b).d(list2);
        if (Unit.f46060a != wneVar) {
            return wneVar;
        }
        return objX;
        int iIntValue = ((Number) objX).intValue();
        boolean z = this.d.a().f13512a;
        nh70 nh70Var = sub0.b;
        sub0 sub0VarA = this.e.a();
        nh70Var.getClass();
        boolean zJ = nh70.j(sub0VarA);
        boolean z2 = this.f.a().d.b;
        m2uVar2.i = null;
        m2uVar2.j = null;
        m2uVar2.m = 2;
        objX = j2uVar.a(list, iIntValue, z, zJ, z2, m2uVar2);
        if (objX != wneVar) {
            List list3 = (List) objX;
            m2uVar2.i = objX;
            m2uVar2.j = null;
            m2uVar2.m = 3;
            ehf0 ehf0Var2 = this.b.f24850a.f1850a;
            list3.getClass();
            ((or30) ehf0Var2.b).d(list3);
            if (Unit.f46060a != wneVar) {
                return objX;
            }
        }
        return wneVar;
    }
}
