package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzp f41635a;
    public final btt0 b;

    public xx0(xzp xzpVar, btt0 btt0Var) {
        btt0Var.getClass();
        this.f41635a = xzpVar;
        this.b = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Serializable a(boolean z, String str, qmu0 qmu0Var, boolean z2, zje zjeVar) {
        wx0 wx0Var;
        String str2;
        List list;
        if (zjeVar instanceof wx0) {
            wx0Var = (wx0) zjeVar;
            int i = wx0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                wx0Var.l = i - Integer.MIN_VALUE;
            } else {
                wx0Var = new wx0(this, zjeVar);
            }
        } else {
            wx0Var = new wx0(this, zjeVar);
        }
        Object objW = wx0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = wx0Var.l;
        ArrayList arrayList = null;
        if (i2 == 0) {
            z1x.P(objW);
            String strA = this.b.a();
            xzp xzpVar = this.f41635a;
            if (z2) {
                jo20 jo20VarK = cwr0.K(0, qmu0Var instanceof omu0 ? ((omu0) qmu0Var).f25521a : (byte) 0, kotlin.collections.a.c("847"), null, null, null, null, null, null, null, Boolean.valueOf(z), null, null, 30712);
                wx0Var.i = str;
                wx0Var.l = 1;
                objW = xzp.z(xzpVar, jo20VarK, strA, wx0Var);
                if (objW != wneVar) {
                    str2 = str;
                    list = ((ty0) ((dx5) objW).a()).f34728a;
                }
            } else {
                edy edyVarH = zcm0.h(z, 0, qmu0Var);
                wx0Var.i = str;
                wx0Var.l = 2;
                objW = xzpVar.W(edyVarH, strA, wx0Var);
                if (objW != wneVar) {
                    str2 = str;
                    list = ((ty0) ((dx5) objW).a()).f34728a;
                }
            }
            return wneVar;
        }
        if (i2 == 1) {
            str2 = wx0Var.i;
            z1x.P(objW);
            list = ((ty0) ((dx5) objW).a()).f34728a;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = wx0Var.i;
            z1x.P(objW);
            list = ((ty0) ((dx5) objW).a()).f34728a;
        }
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(jar0.b0((bw0) it.next(), str2));
            }
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }
}
