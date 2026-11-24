package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d5f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ r7f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5f(r7f r7fVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = r7fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r7f r7fVar = this.k;
        switch (b) {
            case 0:
                return new d5f(r7fVar, yjeVar, (byte) 0);
            case 1:
                return new d5f(r7fVar, yjeVar, (byte) 1);
            case 2:
                return new d5f(r7fVar, yjeVar, (byte) 2);
            case 3:
                return new d5f(r7fVar, yjeVar, (byte) 3);
            case 4:
                return new d5f(r7fVar, yjeVar, (byte) 4);
            case 5:
                return new d5f(r7fVar, yjeVar, (byte) 5);
            case 6:
                return new d5f(r7fVar, yjeVar, (byte) 6);
            case 7:
                return new d5f(r7fVar, yjeVar, (byte) 7);
            case 8:
                d5f d5fVar = new d5f(r7fVar, yjeVar, (byte) 8);
                d5fVar.j = ((Boolean) obj).booleanValue();
                return d5fVar;
            default:
                return new d5f(r7fVar, yjeVar, (byte) 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((d5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((d5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((d5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((d5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((d5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((d5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((d5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((d5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((d5f) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((d5f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        r7f r7fVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq gmqVarB = r7fVar.Z0.b();
                    this.j = true;
                    obj = ntb.M(gmqVarB, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Boolean bool = (Boolean) obj;
                if (r7fVar.C1 == w4f.c || Intrinsics.d(bool, Boolean.FALSE)) {
                    r7fVar.B();
                    r7fVar.B1 = false;
                    r7fVar.W();
                }
                return Unit.f46060a;
            case 1:
                x20 x20Var = r7fVar.K0;
                qu quVar = r7fVar.I0;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    i8i.D("action", "generate", quVar.f29324a, "coupon_action_call");
                    x20Var.a(di.c);
                    x20Var.o(ptn.c);
                    quVar.c(koc.c);
                    h9c h9cVar = r7fVar.f;
                    this.j = true;
                    obj = h9cVar.f12667a.D(this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (((Number) obj).longValue() == 0) {
                    r7fVar.b0();
                } else {
                    r7fVar.d2.f(x3f.f40215a);
                }
                return Unit.f46060a;
            case 2:
                String str = r7fVar.W0;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (str.length() > 0) {
                        h9c h9cVar2 = r7fVar.f;
                        this.j = true;
                        obj = h9cVar2.f12667a.D(this);
                        if (obj == wneVar3) {
                            return wneVar3;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                if (((Number) obj).longValue() == 0) {
                    r7fVar.S(str);
                } else {
                    r7fVar.d2.f(z3f.f43714a);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    rue rueVar = rue.CANCEL;
                    this.j = true;
                    if (r7fVar.T(rueVar, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    vs10 vs10Var = r7fVar.Y0.c;
                    a6f a6fVar = new a6f(r7fVar, yjeVar, (byte) 3);
                    this.j = true;
                    if (qjj.d0(vs10Var, a6fVar, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                r7f r7fVar2 = this.k;
                if (!z6) {
                    z1x.P(obj);
                    znt zntVar = r7fVar2.e;
                    this.j = true;
                    obj = zntVar.f44690a.p(this);
                    if (obj == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (((qu6) obj2).y instanceof xfa0) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    long j = ((qu6) it.next()).f29333a;
                    sac.V(jiu0.a(r7fVar2), h5f.f12477a, new s4f(r7fVar2, (byte) 2), r7fVar2.Y0.b, new i5f(r7fVar2, j, null, (byte) 0), 8);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    if (r7fVar.w1 && r7fVar.C1 != w4f.c) {
                        this.j = true;
                        if (r7fVar.l0(false, true, this) == wneVar7) {
                            return wneVar7;
                        }
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    if (r7fVar.w1 && r7fVar.C1 != w4f.c) {
                        this.j = true;
                        if (r7fVar.l0(true, false, this) == wneVar8) {
                            return wneVar8;
                        }
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                boolean z9 = this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (z9) {
                    r7fVar.h0(false, false, new x5f((byte) 6));
                } else {
                    r7fVar.Z();
                }
                return Unit.f46060a;
            default:
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    h9c h9cVar3 = r7fVar.f;
                    this.j = true;
                    obj = h9cVar3.f12667a.D(this);
                    if (obj == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                long jLongValue = ((Number) obj).longValue();
                ol60 ol60Var = r7fVar.d2;
                if (jLongValue == 0) {
                    ol60Var.f(s3f.f31554a);
                } else {
                    ol60Var.f(y3f.f41950a);
                }
                return Unit.f46060a;
        }
    }
}
