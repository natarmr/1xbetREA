package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a2b extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ h2b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2b(h2b h2bVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = h2bVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        h2b h2bVar = this.k;
        switch (b) {
            case 0:
                a2b a2bVar = new a2b(h2bVar, yjeVar, (byte) 0);
                a2bVar.j = ((Boolean) obj).booleanValue();
                return a2bVar;
            case 1:
                return new a2b(h2bVar, yjeVar, (byte) 1);
            default:
                return new a2b(h2bVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((a2b) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a2b) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a2b) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        r1b r1bVar;
        ra10 ra10VarW;
        Object value2;
        ra10 ra10VarW2;
        Object value3;
        a570 a570VarA;
        iun iunVar;
        Object objA;
        byte b = this.i;
        h2b h2bVar = this.k;
        boolean z = true;
        switch (b) {
            case 0:
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z2 && !h2bVar.Q) {
                    p7m0 p7m0Var = h2bVar.V;
                    do {
                        value3 = p7m0Var.getValue();
                        a570.Companion.getClass();
                        a570VarA = t470.a(false, -1L);
                        iunVar = iun.f15405a;
                    } while (!p7m0Var.m(value3, q1b.a((q1b) value3, null, null, null, new p1b(new jza(a570VarA, iunVar, 0.0d, "", 0.0d, iunVar, 0.0d, 0.0d, 0.0d, 0.0d, 0L), "", false, "", "", true), 7)));
                    h2bVar.D(true);
                } else if (!z2) {
                    p7m0 p7m0Var2 = h2bVar.Y;
                    pat patVar = (pat) h2bVar.S.getValue();
                    patVar.getClass();
                    if (!(patVar instanceof oat)) {
                        pat patVar2 = (pat) h2bVar.T.getValue();
                        patVar2.getClass();
                        if (!(patVar2 instanceof oat)) {
                            z = false;
                        }
                    }
                    boolean z3 = h2bVar.Q;
                    if (z3 && z) {
                        h2bVar.B();
                    } else if (z3 || !z) {
                        do {
                            value = p7m0Var2.getValue();
                            r1bVar = (r1b) value;
                            if (h2bVar.P) {
                                ra10VarW = null;
                            } else {
                                v3c.N(h2bVar.M);
                                ra10VarW = h2bVar.w();
                            }
                        } while (!p7m0Var2.m(value, new r1b(ra10VarW, r1bVar.b)));
                    } else {
                        do {
                            value2 = p7m0Var2.getValue();
                            ra10VarW2 = h2bVar.w();
                            ((r1b) value2).getClass();
                        } while (!p7m0Var2.m(value2, new r1b(ra10VarW2, null)));
                    }
                }
                h2bVar.Q = z2;
                return Unit.f46060a;
            case 1:
                wsf0 wsf0Var = h2bVar.y;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    khf0 khf0VarG = ((g45) wsf0Var.b).G();
                    bm5 bm5Var = bm5.d;
                    this.j = true;
                    objA = khf0VarG.A(bm5Var, tl5.c, this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ql5 ql5Var = (ql5) objA;
                wsf0Var.s().l(bm5.d, ql5Var);
                h2bVar.q.a(h2bVar.b, true, ql5Var.f28916a);
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    o470 o470Var = h2bVar.f;
                    this.j = true;
                    if (((d0b) o470Var.f24619a).e(this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                h2bVar.i.f35083a.c("games_cashback_withdraw_done");
                h2bVar.D.f15516a.a(xun.f41520a, 3337L);
                h2bVar.A(s1b.f31447a);
                return Unit.f46060a;
        }
    }
}
