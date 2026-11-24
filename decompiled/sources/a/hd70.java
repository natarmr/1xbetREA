package a;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class hd70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wir k;
    public final /* synthetic */ xd70 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd70(wir wirVar, xd70 xd70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wirVar;
        this.l = xd70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xd70 xd70Var = this.l;
        wir wirVar = this.k;
        switch (b) {
            case 0:
                return new hd70(wirVar, xd70Var, yjeVar, (byte) 0);
            default:
                return new hd70(wirVar, xd70Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((hd70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Integer num2;
        Object objQ;
        Double d;
        Long l;
        byte b = this.i;
        wir wirVar = this.k;
        xd70 xd70Var = this.l;
        switch (b) {
            case 0:
                i1w0 i1w0Var = xd70Var.q;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (wirVar == null || (num2 = wirVar.f39231a) == null || num2.intValue() != ((xb70) xd70Var.D()).n.e) {
                        t470 t470Var = a570.Companion;
                        long jIntValue = (wirVar == null || (num = wirVar.f39231a) == null) ? -1L : num.intValue();
                        t470Var.getClass();
                        if (jIntValue > 0) {
                            int i = xd70.B0;
                            xd70Var.l0();
                            i1w0Var.d(new wc70(xd70Var, (byte) 3));
                        } else {
                            int i2 = xd70.B0;
                            xd70Var.l0();
                            i1w0Var.d(new wc70(xd70Var, (byte) 4));
                        }
                    } else {
                        pir pirVar = wirVar.c;
                        if (pirVar != null) {
                            nek nekVar = esr.b;
                            int i3 = pirVar.f27057a;
                            nekVar.getClass();
                            esr esrVarF = nek.f(i3);
                            csr csrVar = new csr(new bsr(esrVarF, esrVarF.b() ? 0L : ((xb70) xd70Var.D()).n.e, 0.0d), "", dsr.b, 0L);
                            ql5 ql5Var = ((xb70) xd70Var.D()).q.e;
                            this.j = true;
                            if (xd70Var.u0(csrVar, ql5Var, this) == wneVar) {
                                return wneVar;
                            }
                        } else {
                            int i4 = xd70.B0;
                            xd70Var.l0();
                            i1w0Var.d(new wc70(xd70Var, (byte) 2));
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    Integer num3 = wirVar.f39231a;
                    pir pirVar2 = wirVar.c;
                    long jIntValue2 = num3.intValue();
                    nek nekVar2 = esr.b;
                    int i5 = pirVar2 != null ? pirVar2.f27057a : 0;
                    nekVar2.getClass();
                    bsr bsrVar = new bsr(nek.f(i5), (pirVar2 == null || (l = pirVar2.b) == null) ? s470.GAME_UNAVAILABLE.a() : l.longValue(), (pirVar2 == null || (d = pirVar2.c) == null) ? 0.0d : d.doubleValue());
                    dsr.f6625a.getClass();
                    csr csrVar2 = new csr(bsrVar, "", dsr.c, 1L);
                    this.j = true;
                    int i6 = xd70.B0;
                    objQ = xd70Var.Q(jIntValue2, this, csrVar2);
                    if (objQ == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objQ = obj;
                }
                m7h0 m7h0Var = (m7h0) objQ;
                if (m7h0Var != null) {
                    int i7 = xd70.B0;
                    xd70Var.l0();
                    i1w0 i1w0Var2 = xd70Var.q;
                    k0w0 k0w0VarI = cs0.i(i1w0Var2, i1w0Var2);
                    c8d c8dVar = (c8d) k0w0VarI.h(m7h0Var).f14945a;
                    bjk bjkVar = cfx0.o;
                    c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                    ListIterator listIteratorO = b1j.o(i1w0Var2, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            i1w0Var2.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
