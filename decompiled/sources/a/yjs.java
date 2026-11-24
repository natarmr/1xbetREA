package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class yjs extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ yks k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yjs(yks yksVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yksVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yks yksVar = this.k;
        switch (b) {
            case 0:
                return new yjs(yksVar, yjeVar, (byte) 0);
            case 1:
                yjs yjsVar = new yjs(yksVar, yjeVar, (byte) 1);
                yjsVar.j = ((Boolean) obj).booleanValue();
                return yjsVar;
            case 2:
                yjs yjsVar2 = new yjs(yksVar, yjeVar, (byte) 2);
                yjsVar2.j = ((Boolean) obj).booleanValue();
                return yjsVar2;
            case 3:
                yjs yjsVar3 = new yjs(yksVar, yjeVar, (byte) 3);
                yjsVar3.j = ((Boolean) obj).booleanValue();
                return yjsVar3;
            case 4:
                return new yjs(yksVar, yjeVar, (byte) 4);
            case 5:
                return new yjs(yksVar, yjeVar, (byte) 5);
            default:
                return new yjs(yksVar, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yjs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yjs) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((yjs) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((yjs) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((yjs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((yjs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yjs) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objE;
        byte b = this.i;
        final byte b2 = 0;
        Object[] objArr = 0;
        final yks yksVar = this.k;
        final byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    jru jruVar = yksVar.T;
                    long j = ((njs) yksVar.D()).e;
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
                CharSequence charSequence = (CharSequence) objE;
                hxk hxkVar = new hxk((String) (charSequence.length() != 0 ? charSequence : null), (byte) 17);
                int i = yks.m0;
                yksVar.H(hxkVar);
                return Unit.f46060a;
            case 1:
                final boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                Function2 function2 = new Function2() { // from class: a.hks
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b2;
                        yks yksVar2 = yksVar;
                        switch (b4) {
                            case 0:
                                njs njsVar = (njs) obj3;
                                boolean z3 = z2;
                                njs njsVarA = njs.a(njsVar, 0L, null, null, false, 0L, 0L, null, z3 ? tf50.f33851a : njsVar.j, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, z3, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -33554945, 65535);
                                if (z3) {
                                    yksVar2.o.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA.j);
                                }
                                return njsVarA;
                            default:
                                njs njsVar2 = (njs) obj3;
                                boolean z4 = z2;
                                njs njsVarA2 = njs.a(njsVar2, 0L, null, null, false, 0L, 0L, null, z4 ? tf50.f33851a : njsVar2.j, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, z4, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -67109377, 65535);
                                if (z4) {
                                    yksVar2.o.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA2.j);
                                }
                                return njsVarA2;
                        }
                    }
                };
                int i2 = yks.m0;
                yksVar.H(function2);
                return Unit.f46060a;
            case 2:
                final boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                Function2 function3 = new Function2() { // from class: a.hks
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b4 = b3;
                        yks yksVar2 = yksVar;
                        switch (b4) {
                            case 0:
                                njs njsVar = (njs) obj3;
                                boolean z4 = z3;
                                njs njsVarA = njs.a(njsVar, 0L, null, null, false, 0L, 0L, null, z4 ? tf50.f33851a : njsVar.j, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, z4, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -33554945, 65535);
                                if (z4) {
                                    yksVar2.o.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA.j);
                                }
                                return njsVarA;
                            default:
                                njs njsVar2 = (njs) obj3;
                                boolean z5 = z3;
                                njs njsVarA2 = njs.a(njsVar2, 0L, null, null, false, 0L, 0L, null, z5 ? tf50.f33851a : njsVar2.j, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, z5, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -67109377, 65535);
                                if (z5) {
                                    yksVar2.o.e("KEY_CURRENT_NAVIGATION_TAB", njsVarA2.j);
                                }
                                return njsVarA2;
                        }
                    }
                };
                int i3 = yks.m0;
                yksVar.H(function3);
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                yks yksVar2 = this.k;
                if (z4) {
                    int i4 = yks.m0;
                    njs njsVar = (njs) yksVar2.D();
                    long j2 = njsVar.f23650a;
                    long j3 = njsVar.e;
                    t3z t3zVar = njsVar.h;
                    u3z u3zVar = new u3z(j2, t3zVar, j3);
                    if (j2 == ((njs) yksVar2.D()).f || ((njs) yksVar2.D()).f == 0) {
                        yksVar2.N(u3zVar, ((njs) yksVar2.D()).O);
                    } else if (((njs) yksVar2.D()).f == -746) {
                        yksVar2.O(j3, j2);
                        yksVar2.N(u3zVar, null);
                    } else {
                        yksVar2.P(((njs) yksVar2.D()).f, j2, j3, t3zVar == t3z.c, yksVar2.M().D0);
                    }
                    yksVar2.j0 = i3t0.K(yksVar2, null, nks.f23695a, new jks(yksVar2, objArr == true ? 1 : 0, (byte) 3), 1);
                } else {
                    int i5 = yks.m0;
                    c4m0 c4m0Var = yksVar2.h0;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    bby bbyVar = yksVar2.j0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    bby bbyVar2 = yksVar2.l0;
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
                    fc4 fc4Var = new fc4(((n9s) yksVar.w.f13365a).a(), (byte) 28);
                    rks rksVar = new rks(yksVar, b3);
                    this.j = true;
                    if (fc4Var.c(rksVar, this) == wneVar5) {
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
                    fnq fnqVarA = yksVar.A.a();
                    rks rksVar2 = new rks(yksVar, (byte) 2);
                    this.j = true;
                    if (fnqVarA.c(rksVar2, this) == wneVar6) {
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
                    vpu vpuVar = yksVar.z;
                    this.j = true;
                    if (vpuVar.b(false, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                kjs kjsVar = kjs.b;
                int i6 = yks.m0;
                yksVar.G(kjsVar);
                return Unit.f46060a;
        }
    }
}
