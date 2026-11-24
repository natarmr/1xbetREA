package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class jdu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f16345a;
    public final gst0 b;

    public jdu(pbt pbtVar, gst0 gst0Var, byte b) {
        switch (b) {
            case 1:
                this.f16345a = pbtVar;
                this.b = gst0Var;
                break;
            case 2:
                pbtVar.getClass();
                gst0Var.getClass();
                this.f16345a = pbtVar;
                this.b = gst0Var;
                break;
            default:
                pbtVar.getClass();
                gst0Var.getClass();
                this.f16345a = pbtVar;
                this.b = gst0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Serializable a(zje zjeVar, String str, boolean z, boolean z2) {
        idu iduVar;
        if (zjeVar instanceof idu) {
            iduVar = (idu) zjeVar;
            int i = iduVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iduVar.k = i - Integer.MIN_VALUE;
            } else {
                iduVar = new idu(this, zjeVar);
            }
        } else {
            iduVar = new idu(this, zjeVar);
        }
        idu iduVar2 = iduVar;
        Object objO = iduVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = iduVar2.k;
        if (i2 == 0) {
            z1x.P(objO);
            boolean zA = this.b.a();
            iduVar2.k = 1;
            objO = this.f16345a.o(z, str, zA, z2, iduVar2);
            if (objO == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objO);
        }
        p070 p070Var = (p070) objO;
        List list = p070Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            f8b f8bVar = (f8b) obj;
            List list2 = p070Var.f26136a;
            if (list2 == null || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (rz4.C(f8bVar.f9097a, ((pbv) it.next()).b)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(zje zjeVar) {
        lmu lmuVar;
        if (zjeVar instanceof lmu) {
            lmuVar = (lmu) zjeVar;
            int i = lmuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lmuVar.k = i - Integer.MIN_VALUE;
            } else {
                lmuVar = new lmu(this, zjeVar);
            }
        } else {
            lmuVar = new lmu(this, zjeVar);
        }
        Object objK = lmuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = lmuVar.k;
        gst0 gst0Var = this.b;
        if (i2 == 0) {
            z1x.P(objK);
            boolean zA = gst0Var.a();
            lmuVar.k = 1;
            objK = this.f16345a.k(zA, lmuVar);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        Iterable iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(((rq60) it.next()).f30917a));
        }
        return Boolean.valueOf(arrayList.contains(new Integer(8)) && gst0Var.a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(boolean z, zje zjeVar) {
        jkt0 jkt0Var;
        if (zjeVar instanceof jkt0) {
            jkt0Var = (jkt0) zjeVar;
            int i = jkt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkt0Var.k = i - Integer.MIN_VALUE;
            } else {
                jkt0Var = new jkt0(this, zjeVar);
            }
        } else {
            jkt0Var = new jkt0(this, zjeVar);
        }
        Object obj = jkt0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jkt0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zA = this.b.a();
            jkt0Var.k = 1;
            pbt pbtVar = this.f16345a;
            if (qjj.d0(pbtVar.m.b, new ebt(z, pbtVar, zA, null), jkt0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
