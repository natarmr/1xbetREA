package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class gcc extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ a4x j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ int l;
    public final /* synthetic */ w6k m;
    public final /* synthetic */ k6z n;
    public final /* synthetic */ hh80 o;
    public final /* synthetic */ tyl p;
    public final /* synthetic */ vne q;
    public final /* synthetic */ pz40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcc(a4x a4xVar, xcz xczVar, int i, w6k w6kVar, k6z k6zVar, hh80 hh80Var, tyl tylVar, vne vneVar, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = a4xVar;
        this.k = xczVar;
        this.l = i;
        this.m = w6kVar;
        this.n = k6zVar;
        this.o = hh80Var;
        this.p = tylVar;
        this.q = vneVar;
        this.r = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new gcc(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gcc) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            a4x a4xVar = this.j;
            Iterator it = a4xVar.iterator();
            byte b = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((lxl) it.next()).b()) {
                    i = i2;
                    break;
                }
                i2++;
            }
            if (i == -1) {
                return Unit.f46060a;
            }
            uts0 uts0Var = lcc.f19792a;
            pz40 pz40Var = this.r;
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            hh80 hh80Var = this.o;
            if (zBooleanValue) {
                boolean z2 = i == a4xVar.size() - 1;
                int iOrdinal = this.p.ordinal();
                if (iOrdinal != 0) {
                    xcz xczVar = this.k;
                    vne vneVar = this.q;
                    if (iOrdinal == 1) {
                        qjj.W(vneVar, null, null, new kcc(xczVar, i, this.m, this.l, z2, hh80Var, this.n, null), 3);
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        qjj.W(vneVar, null, null, new jcc(xczVar, i, yjeVar, b), 3);
                    }
                }
            } else {
                b = i == a4xVar.size() - 1 ? (byte) 1 : (byte) 0;
                xx xxVar = new xx(pz40Var, (byte) 22);
                this.i = true;
                if (lcc.f(this.k, i, b, this.l, this.m, this.n, hh80Var, xxVar, this) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
