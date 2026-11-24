package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class edo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mne f7628a;
    public final wco b;

    public edo(mne mneVar, ddk ddkVar, xak xakVar, wco wcoVar) {
        wcoVar.getClass();
        this.f7628a = mneVar;
        this.b = wcoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        yco ycoVar;
        if (zjeVar instanceof yco) {
            ycoVar = (yco) zjeVar;
            int i = ycoVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ycoVar.k = i - Integer.MIN_VALUE;
            } else {
                ycoVar = new yco(this, zjeVar);
            }
        } else {
            ycoVar = new yco(this, zjeVar);
        }
        Object objW0 = ycoVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ycoVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            ycoVar.k = 1;
            objW0 = sj3.w0(ycoVar, ((qco) this.b.b.getValue()).f28493a, new hu6(j, yjeVar, (byte) 6), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        rco rcoVar = (rco) objW0;
        if (rcoVar != null) {
            return ddk.s(rcoVar);
        }
        return null;
    }

    public final Object b(zje zjeVar) {
        return qjj.d0(this.f7628a.b, new zco(this, null, (byte) 0), zjeVar);
    }

    public final eu4 c() {
        return new eu4(new a1g(wwb.C(((qco) this.b.b.getValue()).f28493a, new String[]{"event_groups"}, new f1e(2, null, (byte) 25)), this, (byte) 5), (byte) 7);
    }

    public final Object d(List list, zje zjeVar) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xco xcoVar = (xco) it.next();
            xcoVar.getClass();
            arrayList.add(new rco(xcoVar.f40655a, xcoVar.c, xcoVar.d, xcoVar.b, xcoVar.e));
        }
        qco qcoVar = (qco) this.b.b.getValue();
        Object objW0 = sj3.w0(zjeVar, qcoVar.f28493a, new ofl((Object) qcoVar, (Object) arrayList, (yje) null, (byte) 13), false, true);
        wne wneVar = wne.f39444a;
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        return objW0 == wneVar ? objW0 : Unit.f46060a;
    }
}
