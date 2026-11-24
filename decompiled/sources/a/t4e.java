package a;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class t4e implements s7k0, t6z {
    public long b;
    public ArrayList c;

    @Override // a.t6z
    public final uj30 c(vj30 vj30Var, pj30 pj30Var, long j) {
        h(j);
        pu90 pu90VarS = pj30Var.S(j);
        return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new y1(pu90VarS, (byte) 13));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.s7k0
    public final Object f(yje yjeVar) throws Throwable {
        s4e s4eVar;
        mie0 mie0Var;
        Throwable th;
        umk rmkVar;
        if (yjeVar instanceof s4e) {
            s4eVar = (s4e) yjeVar;
            int i = s4eVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s4eVar.l = i - Integer.MIN_VALUE;
            } else {
                s4eVar = new s4e(this, (zje) yjeVar);
            }
        } else {
            s4eVar = new s4e(this, (zje) yjeVar);
        }
        Object obj = s4eVar.j;
        wne wneVar = wne.f39444a;
        int i2 = s4eVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            if (p4e.l(this.b)) {
                mie0 mie0Var2 = new mie0();
                try {
                    s4eVar.i = mie0Var2;
                    s4eVar.l = 1;
                    n5a n5aVar = new n5a(1, pnx.b(s4eVar));
                    n5aVar.r();
                    mie0Var2.f21842a = n5aVar;
                    this.c.add(n5aVar);
                    if (n5aVar.p() == wneVar) {
                        return wneVar;
                    }
                    mie0Var = mie0Var2;
                    ArrayList arrayList = this.c;
                    zys0.a(arrayList).remove(mie0Var.f21842a);
                } catch (Throwable th2) {
                    mie0Var = mie0Var2;
                    th = th2;
                    ArrayList arrayList2 = this.c;
                    zys0.a(arrayList2).remove(mie0Var.f21842a);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var = s4eVar.i;
            try {
                z1x.P(obj);
                ArrayList arrayList3 = this.c;
                zys0.a(arrayList3).remove(mie0Var.f21842a);
            } catch (Throwable th3) {
                th = th3;
                ArrayList arrayList4 = this.c;
                zys0.a(arrayList4).remove(mie0Var.f21842a);
                throw th;
            }
        }
        long j = this.b;
        int i3 = p4e.i(j);
        umk rmkVar2 = smk.f32450a;
        if (i3 != Integer.MAX_VALUE) {
            rmk.a(i3);
            rmkVar = new rmk(i3);
        } else {
            rmkVar = rmkVar2;
        }
        int iH = p4e.h(j);
        if (iH != Integer.MAX_VALUE) {
            rmk.a(iH);
            rmkVar2 = new rmk(iH);
        }
        return new f7k0(rmkVar, rmkVar2);
    }

    public final void h(long j) {
        this.b = j;
        if (p4e.l(j)) {
            return;
        }
        ArrayList<yje> arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        this.c = new ArrayList();
        for (yje yjeVar : arrayList) {
            e0g0 e0g0Var = j0g0.b;
            yjeVar.resumeWith(Unit.f46060a);
        }
    }
}
