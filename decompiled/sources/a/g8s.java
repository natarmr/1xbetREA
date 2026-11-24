package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class g8s extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ g9s k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8s(g9s g9sVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g9sVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g9s g9sVar = this.k;
        switch (b) {
            case 0:
                return new g8s(g9sVar, yjeVar, (byte) 0);
            case 1:
                g8s g8sVar = new g8s(g9sVar, yjeVar, (byte) 1);
                g8sVar.j = ((Boolean) obj).booleanValue();
                return g8sVar;
            case 2:
                g8s g8sVar2 = new g8s(g9sVar, yjeVar, (byte) 2);
                g8sVar2.j = ((Boolean) obj).booleanValue();
                return g8sVar2;
            case 3:
                g8s g8sVar3 = new g8s(g9sVar, yjeVar, (byte) 3);
                g8sVar3.j = ((Boolean) obj).booleanValue();
                return g8sVar3;
            case 4:
                return new g8s(g9sVar, yjeVar, (byte) 4);
            case 5:
                return new g8s(g9sVar, yjeVar, (byte) 5);
            case 6:
                g8s g8sVar4 = new g8s(g9sVar, yjeVar, (byte) 6);
                g8sVar4.j = ((Boolean) obj).booleanValue();
                return g8sVar4;
            default:
                return new g8s(g9sVar, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g8s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((g8s) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((g8s) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((g8s) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((g8s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((g8s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((g8s) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g8s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object[] objArr = 0;
        byte b2 = 1;
        g9s g9sVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    jru jruVar = g9sVar.T;
                    long j = ((r7s) g9sVar.D()).e;
                    this.j = true;
                    obj = jruVar.e(j, this);
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
                CharSequence charSequence = (CharSequence) obj;
                hxk hxkVar = new hxk((String) (charSequence.length() != 0 ? charSequence : null), (byte) 15);
                int i = g9s.n0;
                g9sVar.H(hxkVar);
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                obg obgVar = new obg((byte) 8, z2);
                int i2 = g9s.n0;
                g9sVar.H(obgVar);
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                obg obgVar2 = new obg((byte) 9, z3);
                int i3 = g9s.n0;
                g9sVar.H(obgVar2);
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                g9s g9sVar2 = this.k;
                if (z4) {
                    int i4 = g9s.n0;
                    r7s r7sVar = (r7s) g9sVar2.D();
                    long j2 = r7sVar.f29992a;
                    long j3 = r7sVar.e;
                    t3z t3zVar = r7sVar.h;
                    u3z u3zVar = new u3z(j2, t3zVar, j3);
                    if (j2 == ((r7s) g9sVar2.D()).f || ((r7s) g9sVar2.D()).f == 0) {
                        g9sVar2.O(u3zVar, ((r7s) g9sVar2.D()).R);
                    } else if (((r7s) g9sVar2.D()).f == -746) {
                        g9sVar2.P(j3, j2);
                        g9sVar2.O(u3zVar, null);
                    } else {
                        g9sVar2.Q(((r7s) g9sVar2.D()).f, j2, j3, t3zVar == t3z.c, g9sVar2.M().D0);
                    }
                    g9sVar2.k0 = i3t0.K(g9sVar2, null, t8s.f33526a, new p8s(g9sVar2, objArr == true ? 1 : 0, (byte) 3), 1);
                } else {
                    int i5 = g9s.n0;
                    c4m0 c4m0Var = g9sVar2.i0;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    bby bbyVar = g9sVar2.k0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    bby bbyVar2 = g9sVar2.m0;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    fc4 fc4Var = new fc4(((n9s) g9sVar.w.f13365a).a(), (byte) 28);
                    x8s x8sVar = new x8s(g9sVar, b2);
                    this.j = true;
                    if (fc4Var.c(x8sVar, this) == wneVar5) {
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
                    fnq fnqVarA = g9sVar.A.a();
                    x8s x8sVar2 = new x8s(g9sVar, (byte) 2);
                    this.j = true;
                    if (fnqVarA.c(x8sVar2, this) == wneVar6) {
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
            case 6:
                boolean z7 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                obg obgVar3 = new obg((byte) 11, z7);
                int i6 = g9s.n0;
                g9sVar.H(obgVar3);
                if (z7 && ((r7s) g9sVar.D()).k == py20.f27786a) {
                    g9sVar.H(new gup(py20.b, g9sVar, (byte) 26));
                }
                return Unit.f46060a;
            default:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    vpu vpuVar = g9sVar.z;
                    this.j = true;
                    if (vpuVar.b(false, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                o7s o7sVar = o7s.b;
                int i7 = g9s.n0;
                g9sVar.G(o7sVar);
                return Unit.f46060a;
        }
    }
}
