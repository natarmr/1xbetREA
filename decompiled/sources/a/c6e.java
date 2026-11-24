package a;

import android.os.Build;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c6e extends w46 {
    public final i1w0 b;
    public final vqc c;
    public final kj5 d;
    public final aqt e;
    public final pru f;
    public final is g;
    public final h03 h;
    public final mne i;
    public final ol60 j;

    public c6e(i1w0 i1w0Var, vqc vqcVar, kj5 kj5Var, aqt aqtVar, pru pruVar, is isVar, h03 h03Var, mne mneVar) {
        i1w0Var.getClass();
        aqtVar.getClass();
        this.b = i1w0Var;
        this.c = vqcVar;
        this.d = kj5Var;
        this.e = aqtVar;
        this.f = pruVar;
        this.g = isVar;
        this.h = h03Var;
        this.i = mneVar;
        this.j = new ol60(3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable w(zje zjeVar) {
        t5e t5eVar;
        if (zjeVar instanceof t5e) {
            t5eVar = (t5e) zjeVar;
            int i = t5eVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t5eVar.k = i - Integer.MIN_VALUE;
            } else {
                t5eVar = new t5e(this, zjeVar);
            }
        } else {
            t5eVar = new t5e(this, zjeVar);
        }
        Object objE = t5eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = t5eVar.k;
        int i3 = 0;
        if (i2 == 0) {
            z1x.P(objE);
            t5eVar.k = 1;
            objE = this.g.e(false, t5eVar);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        l14 l14Var = (l14) objE;
        if (l14Var != null) {
            ArrayList arrayList = l14Var.b;
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((a0g0) it.next()).f24a);
            }
            return arrayList2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            j85.b.getClass();
            j85[] j85VarArr = {j85.TXT, j85.PNG, j85.JPEG, j85.MP4, j85.AVI, j85.PDF};
            ArrayList arrayList3 = new ArrayList(6);
            while (i3 < 6) {
                arrayList3.add(j85VarArr[i3].f16069a);
                i3++;
            }
            return arrayList3;
        }
        j85.b.getClass();
        j85[] j85VarArrValues = j85.values();
        j85VarArrValues.getClass();
        ArrayList arrayList4 = new ArrayList(j85VarArrValues.length);
        int length = j85VarArrValues.length;
        while (i3 < length) {
            arrayList4.add(j85VarArrValues[i3].f16069a);
            i3++;
        }
        return arrayList4;
    }

    public final void x(List list) {
        list.getClass();
        sac.V(jiu0.a(this), w5e.f38579a, null, this.i.b, new x5e(list, this, null), 10);
    }

    public final void y(s5e s5eVar) {
        this.j.f(s5eVar);
    }
}
