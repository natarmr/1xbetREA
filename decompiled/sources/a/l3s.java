package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class l3s extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ k4s k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3s(k4s k4sVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k4sVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        k4s k4sVar = this.k;
        switch (b) {
            case 0:
                return new l3s(k4sVar, yjeVar, (byte) 0);
            case 1:
                l3s l3sVar = new l3s(k4sVar, yjeVar, (byte) 1);
                l3sVar.j = ((Boolean) obj).booleanValue();
                return l3sVar;
            case 2:
                l3s l3sVar2 = new l3s(k4sVar, yjeVar, (byte) 2);
                l3sVar2.j = ((Boolean) obj).booleanValue();
                return l3sVar2;
            case 3:
                l3s l3sVar3 = new l3s(k4sVar, yjeVar, (byte) 3);
                l3sVar3.j = ((Boolean) obj).booleanValue();
                return l3sVar3;
            case 4:
                return new l3s(k4sVar, yjeVar, (byte) 4);
            case 5:
                return new l3s(k4sVar, yjeVar, (byte) 5);
            default:
                return new l3s(k4sVar, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((l3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((l3s) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((l3s) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((l3s) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((l3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((l3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objE;
        byte b = this.i;
        byte b2 = 0;
        yje yjeVar = null;
        k4s k4sVar = this.k;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    jru jruVar = k4sVar.J;
                    long j = ((z2s) k4sVar.D()).e;
                    this.j = true;
                    objE = jruVar.e(j, this);
                    if (objE == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objE = obj;
                }
                hxk hxkVar = new hxk((String) objE, (byte) 14);
                int i = k4s.c0;
                k4sVar.H(hxkVar);
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2 && ((z2s) k4sVar.D()).I != null) {
                    k4sVar.H(new gwr((byte) 24));
                }
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3 && ((z2s) k4sVar.D()).I != null) {
                    k4sVar.H(new gwr((byte) 25));
                }
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                k4s k4sVar2 = this.k;
                if (z4) {
                    int i2 = k4s.c0;
                    z2s z2sVar = (z2s) k4sVar2.D();
                    long j2 = z2sVar.f43686a;
                    long j3 = z2sVar.e;
                    t3z t3zVar = z2sVar.i;
                    u3z u3zVar = new u3z(j2, t3zVar, j3);
                    if (j2 == ((z2s) k4sVar2.D()).f || ((z2s) k4sVar2.D()).f == 0) {
                        k4sVar2.N(u3zVar, ((z2s) k4sVar2.D()).g);
                    } else if (((z2s) k4sVar2.D()).f == -746) {
                        k4sVar2.O(j3, j2);
                        k4sVar2.N(u3zVar, null);
                    } else {
                        k4sVar2.P(((z2s) k4sVar2.D()).f, j2, j3, t3zVar == t3z.c, k4sVar2.V.D0);
                    }
                    k4sVar2.a0 = sac.T(new p6d(k4sVar2.P.a(), new i89(k4sVar2.S.f15754a.f1372a.b, (byte) 22), new wx4((Object) k4sVar2, yjeVar, (byte) 9), (byte) 1), jiu0.a(k4sVar2), b4s.h);
                } else {
                    int i3 = k4s.c0;
                    c4m0 c4m0Var = k4sVar2.Y;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    c4m0 c4m0Var2 = k4sVar2.a0;
                    if (c4m0Var2 != null) {
                        c4m0Var2.cancel(null);
                    }
                    c4m0 c4m0Var3 = k4sVar2.X;
                    if (c4m0Var3 != null) {
                        c4m0Var3.cancel(null);
                    }
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(k4sVar.K.a());
                    d4s d4sVar = new d4s(k4sVar, b2);
                    this.j = true;
                    if (gmqVarW.c(d4sVar, this) == wneVar5) {
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
                if (!z6) {
                    z1x.P(obj);
                    fc4 fc4Var = new fc4(((n9s) k4sVar.L.f13365a).a(), (byte) 28);
                    d4s d4sVar2 = new d4s(k4sVar, b3);
                    this.j = true;
                    if (fc4Var.c(d4sVar2, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    fnq fnqVarA = k4sVar.O.a();
                    d4s d4sVar3 = new d4s(k4sVar, (byte) 2);
                    this.j = true;
                    if (fnqVarA.c(d4sVar3, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
