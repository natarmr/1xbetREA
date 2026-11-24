package a;

import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class fr60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ bs60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr60(bs60 bs60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bs60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bs60 bs60Var = this.k;
        switch (b) {
            case 0:
                fr60 fr60Var = new fr60(bs60Var, yjeVar, (byte) 0);
                fr60Var.j = ((Boolean) obj).booleanValue();
                return fr60Var;
            case 1:
                fr60 fr60Var2 = new fr60(bs60Var, yjeVar, (byte) 1);
                fr60Var2.j = ((Boolean) obj).booleanValue();
                return fr60Var2;
            case 2:
                return new fr60(bs60Var, yjeVar, (byte) 2);
            default:
                return new fr60(bs60Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fr60) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((fr60) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fr60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fr60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0164  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a8  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        List list;
        Object value2;
        boolean z2;
        Object objB;
        Object objB2;
        Object value3;
        w370 w370Var;
        zm5 zm5Var;
        byte b = this.i;
        bs60 bs60Var = this.k;
        switch (b) {
            case 0:
                boolean z3 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = bs60.h0;
                p7m0 p7m0Var = bs60Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var.getValue();
                    value4.getClass();
                    w370 w370Var2 = (w370) value4;
                    boolean z4 = z3;
                    if (p7m0Var.m(value4, w370.a(w370Var2, false, false, null, null, zm5.a(w370Var2.e, null, null, null, !z3, 7), null, null, false, false, false, z4, 14319))) {
                        if (z4) {
                            bs60Var.b0();
                        }
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
            case 1:
                boolean z5 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = bs60.h0;
                ocj ocjVar = bs60Var.i;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, w370.a((w370) value, false, false, null, null, null, null, null, z5, false, false, false, 16127)));
                bs60Var.L.a(z5);
                if (z5) {
                    String str = ((w370) bs60Var.D()).d.e;
                    boolean z6 = ((w370) bs60Var.D()).d.c && str.length() > 0;
                    if (z6) {
                        if (bs60Var.X(str) ? true ^ ((w370) bs60Var.D()).j : true) {
                            bs60Var.Q(str);
                        } else if (!z6) {
                            bs60Var.G(m370.f21100a);
                            bs60Var.R(false);
                            bs60Var.U();
                        }
                    } else if (!z6 && !((w370) bs60Var.D()).k && !((w370) bs60Var.D()).f38488a) {
                        bs60Var.G(m370.f21100a);
                        bs60Var.R(false);
                        bs60Var.U();
                    }
                    bs60Var.b0();
                } else {
                    pat patVar = (pat) bs60Var.f0.getValue();
                    patVar.getClass();
                    if (!(patVar instanceof oat)) {
                        pat patVar2 = (pat) bs60Var.g0.getValue();
                        patVar2.getClass();
                        z = patVar2 instanceof oat;
                    }
                    if (((w370) bs60Var.D()).j && z) {
                        bs60Var.a0();
                    } else if (!((w370) bs60Var.D()).j && z) {
                        bs60Var.Y();
                    } else if ((((w370) bs60Var.D()).d.c && ((w370) bs60Var.D()).d.e.length() > 0) || !((w370) bs60Var.D()).k) {
                        bs60Var.Y();
                    } else if ((((w370) bs60Var.D()).d.e.length() == 0 && ((list = ((w370) bs60Var.D()).f.f33786a) == null || list.isEmpty())) || ((w370) bs60Var.D()).g.c == null) {
                        bs60Var.Y();
                    }
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    z2 = z5;
                    z5 = z2;
                } while (!p7m0Var3.m(value2, w370.a((w370) value2, false, false, null, null, null, null, null, false, z2, false, false, 15871)));
                return Unit.f46060a;
            case 2:
                wsf0 wsf0Var = bs60Var.w;
                wne wneVar3 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    ahu ahuVarY = ((g45) wsf0Var.b).y();
                    bm5 bm5Var = bm5.d;
                    this.j = true;
                    objB = ahuVarY.b(bm5Var, this);
                    if (objB == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ql5 ql5Var = (ql5) objB;
                wsf0Var.s().l(bm5.d, ql5Var);
                bs60Var.E.a(bs60Var.z, true, ql5Var.f28916a);
                return Unit.f46060a;
            default:
                wsf0 wsf0Var2 = bs60Var.w;
                wne wneVar4 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    ahu ahuVarY2 = ((g45) wsf0Var2.b).y();
                    bm5 bm5Var2 = bm5.d;
                    this.j = true;
                    objB2 = ahuVarY2.b(bm5Var2, this);
                    if (objB2 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB2 = obj;
                }
                ql5 ql5Var2 = (ql5) objB2;
                kg kgVarB = bs60Var.Q.b();
                wsf0Var2.s().l(bm5.d, ql5Var2);
                String strA = ql5Var2.j;
                if (kgVarB == kg.SECONDARY) {
                    strA = bs60Var.B.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                } else if (strA.length() <= 0) {
                    strA = ql5Var2.k;
                }
                String str2 = strA;
                p7m0 p7m0Var4 = bs60Var.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    w370Var = (w370) value3;
                    zm5Var = w370Var.e;
                    pn40 pn40Var = pn40.f27267a;
                } while (!p7m0Var4.m(value3, w370.a(w370Var, false, false, null, null, zm5.a(zm5Var, pn40.c(ql5Var2.b, p3u0.c), ql5Var2.f, str2, false, 8), null, null, false, false, false, false, 16367)));
                return Unit.f46060a;
        }
    }
}
