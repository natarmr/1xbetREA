package a;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrc f41313a;
    public final n0o0 b = maz.b(new jwd(this, 10));

    public xqe(rrc rrcVar) {
        this.f41313a = rrcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(zje zjeVar) {
        vqe vqeVar;
        if (zjeVar instanceof vqe) {
            vqeVar = (vqe) zjeVar;
            int i = vqeVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqeVar.k = i - Integer.MIN_VALUE;
            } else {
                vqeVar = new vqe(this, zjeVar);
            }
        } else {
            vqeVar = new vqe(this, zjeVar);
        }
        Object objW0 = vqeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = vqeVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            nqe nqeVarC = c();
            vqeVar.k = 1;
            objW0 = sj3.w0(vqeVar, nqeVarC.f23955a, new f1e(2, yjeVar, (byte) 4), true, false);
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
        Iterable<skt> iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (skt sktVar : iterable) {
            sktVar.getClass();
            int i3 = sktVar.f32368a;
            String str = sktVar.b;
            int i4 = sktVar.c;
            arrayList.add(new tkt(str, i3, sktVar.d, sktVar.f, i4, sktVar.e));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(zje zjeVar) {
        wqe wqeVar;
        if (zjeVar instanceof wqe) {
            wqeVar = (wqe) zjeVar;
            int i = wqeVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wqeVar.k = i - Integer.MIN_VALUE;
            } else {
                wqeVar = new wqe(this, zjeVar);
            }
        } else {
            wqeVar = new wqe(this, zjeVar);
        }
        Object objW0 = wqeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = wqeVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            nqe nqeVarC = c();
            wqeVar.k = 1;
            objW0 = sj3.w0(wqeVar, nqeVarC.f23955a, new f1e(2, yjeVar, (byte) 3), true, false);
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
        Iterable<oqe> iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (oqe oqeVar : iterable) {
            oqeVar.getClass();
            arrayList.add(new yqe(oqeVar.f25683a, oqeVar.b, oqeVar.c, oqeVar.d, oqeVar.e, oqeVar.f, oqeVar.h, oqeVar.g, oqeVar.i));
        }
        return arrayList;
    }

    public final nqe c() {
        return (nqe) this.b.getValue();
    }
}
