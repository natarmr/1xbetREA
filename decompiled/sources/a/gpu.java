package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class gpu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ivn f11700a;
    public final a6u b;

    public /* synthetic */ gpu(ivn ivnVar, a6u a6uVar) {
        this.f11700a = ivnVar;
        this.b = a6uVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(long j, long j2, zje zjeVar) {
        oru oruVar;
        if (zjeVar instanceof oru) {
            oruVar = (oru) zjeVar;
            int i = oruVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                oruVar.m = i - Integer.MIN_VALUE;
            } else {
                oruVar = new oru(this, zjeVar);
            }
        } else {
            oruVar = new oru(this, zjeVar);
        }
        Object objK = oruVar.k;
        wne wneVar = wne.f39444a;
        int i2 = oruVar.m;
        if (i2 == 0) {
            z1x.P(objK);
            oruVar.i = j;
            oruVar.j = j2;
            oruVar.m = 1;
            objK = this.f11700a.k(j, oruVar);
            if (objK != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objK);
                return objK;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = oruVar.j;
        j = oruVar.i;
        z1x.P(objK);
        List list = ((asc0) objK).c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((vrc0) obj).getId() != j2) {
                arrayList.add(obj);
            }
        }
        oruVar.i = j;
        oruVar.j = j2;
        oruVar.m = 2;
        Serializable serializableW = this.b.w(oruVar, "static/img/android/promo_store/showcase", arrayList);
        return serializableW == wneVar ? wneVar : serializableW;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(long j, zje zjeVar) {
        fpu fpuVar;
        if (zjeVar instanceof fpu) {
            fpuVar = (fpu) zjeVar;
            int i = fpuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fpuVar.l = i - Integer.MIN_VALUE;
            } else {
                fpuVar = new fpu(this, zjeVar);
            }
        } else {
            fpuVar = new fpu(this, zjeVar);
        }
        Object objK = fpuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = fpuVar.l;
        if (i2 == 0) {
            z1x.P(objK);
            fpuVar.i = j;
            fpuVar.l = 1;
            objK = this.f11700a.k(j, fpuVar);
            if (objK != wneVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objK);
                return objK;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = fpuVar.i;
        z1x.P(objK);
        List list = ((asc0) objK).c;
        fpuVar.i = j;
        fpuVar.l = 2;
        Serializable serializableW = this.b.w(fpuVar, "static/img/android/promo_store/showcase/square", list);
        return serializableW == wneVar ? wneVar : serializableW;
    }
}
