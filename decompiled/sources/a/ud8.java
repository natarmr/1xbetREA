package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ud8 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ int j;
    public final /* synthetic */ xcz k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ l7m0 n;
    public final /* synthetic */ l7m0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud8(int i, xcz xczVar, int i2, int i3, l7m0 l7m0Var, l7m0 l7m0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.j = i;
        this.k = xczVar;
        this.l = i2;
        this.m = i3;
        this.n = l7m0Var;
        this.o = l7m0Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ud8(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ud8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object next;
        int i;
        int iIntValue;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            int i2 = this.j;
            if (i2 < 0 || !((Boolean) this.n.getValue()).booleanValue()) {
                return Unit.f46060a;
            }
            xcz xczVar = this.k;
            mcz mczVarJ = xczVar.j();
            ncz nczVar = (ncz) CollectionsKt.firstOrNull(mczVarJ.l);
            if (nczVar == null) {
                return Unit.f46060a;
            }
            Iterator it = mczVarJ.l.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ncz) next).f23317a != i2);
            ncz nczVar2 = (ncz) next;
            l7m0 l7m0Var = this.o;
            int i3 = this.l;
            if (nczVar2 != null) {
                i = (i3 / 2) + nczVar2.p;
                iIntValue = ((Number) l7m0Var.getValue()).intValue();
            } else {
                i = (i3 / 2) + ((i2 - nczVar.f23317a) * this.m) + nczVar.p;
                iIntValue = ((Number) l7m0Var.getValue()).intValue();
            }
            float f = i - iIntValue;
            if (f != 0.0f) {
                uts0 uts0VarM0 = ro4.m0((int) ((Math.abs(f) / i3) * 300.0f), 0, null, 6);
                this.i = true;
                if (bww.x(xczVar, f, uts0VarM0, this) == wneVar) {
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
