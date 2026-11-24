package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wj k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj(wj wjVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wjVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wj wjVar = this.k;
        switch (b) {
            case 0:
                return new nj(wjVar, yjeVar, (byte) 0);
            case 1:
                return new nj(wjVar, yjeVar, (byte) 1);
            case 2:
                nj njVar = new nj(wjVar, yjeVar, (byte) 2);
                njVar.j = ((Boolean) obj).booleanValue();
                return njVar;
            case 3:
                return new nj(wjVar, yjeVar, (byte) 3);
            case 4:
                nj njVar2 = new nj(wjVar, yjeVar, (byte) 4);
                njVar2.j = ((Boolean) obj).booleanValue();
                return njVar2;
            case 5:
                return new nj(wjVar, yjeVar, (byte) 5);
            case 6:
                nj njVar3 = new nj(wjVar, yjeVar, (byte) 6);
                njVar3.j = ((Boolean) obj).booleanValue();
                return njVar3;
            default:
                return new nj(wjVar, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((nj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((nj) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((nj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((nj) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((nj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((nj) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        a1g a1gVar;
        gmq vsg0Var;
        Object value2;
        byte b = this.i;
        h660 h660Var = h660.f12515a;
        byte b2 = 0;
        byte b3 = 4;
        byte b4 = 2;
        wj wjVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    qoj0 qoj0Var = wjVar.x;
                    ej ejVar = ej.f7882a;
                    this.j = true;
                    if (qoj0Var.a(ejVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    qoj0 qoj0Var2 = wjVar.x;
                    ej ejVar2 = ej.b;
                    this.j = true;
                    if (qoj0Var2.a(ejVar2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = wjVar.w;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, yi.a((yi) value, false, z3, false, false, false, null, 32751)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    oif0 oif0Var = wjVar.g;
                    goo gooVar = (goo) oif0Var.c;
                    xvm0 xvm0VarA = ((kym0) oif0Var.d).b.a();
                    if (xvm0VarA instanceof svm0) {
                        ino inoVar = (ino) oif0Var.b;
                        vsg0Var = new a1g(inoVar.f15084a.f27246a, inoVar, (byte) 8);
                    } else {
                        byte b5 = 16;
                        if (xvm0VarA instanceof wvm0) {
                            a1gVar = new a1g(aoq.c(new i89(gooVar.b.f43316a, (byte) 22), new zo1(yjeVar, gooVar, b5)), gooVar, (byte) 9);
                        } else if (xvm0VarA instanceof rvm0) {
                            vsg0Var = new vsg0(new fot(b4, yjeVar, b2));
                        } else {
                            if (!(xvm0VarA instanceof tvm0)) {
                                t9f.b();
                                return null;
                            }
                            a1gVar = new a1g(aoq.c(new i89(gooVar.b.f43316a, (byte) 22), new zo1(yjeVar, gooVar, b5)), gooVar, (byte) 9);
                        }
                        vsg0Var = a1gVar;
                    }
                    nj njVar = new nj(wjVar, yjeVar, b4);
                    this.j = true;
                    Object objC = vsg0Var.c(new vnq(h660Var, njVar, (byte) 2), this);
                    if (objC != wneVar4) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar4) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar4) {
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
                boolean z5 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = wjVar.w;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, yi.a((yi) value2, false, false, z5, false, false, null, 32735)));
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    fno fnoVar = (fno) wjVar.r.b;
                    a1g a1gVar2 = new a1g(aoq.c(new i89(fnoVar.b.b, (byte) 22), new zo1(yjeVar, (Object) fnoVar, (byte) 15)), fnoVar, (byte) 7);
                    nj njVar2 = new nj(wjVar, yjeVar, b3);
                    this.j = true;
                    Object objC2 = a1gVar2.c(new vnq(h660Var, njVar2, (byte) 2), this);
                    if (objC2 != wneVar6) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 != wneVar6) {
                        objC2 = Unit.f46060a;
                    }
                    if (objC2 == wneVar6) {
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
                p7m0 p7m0Var3 = wjVar.w;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    boolean z8 = z7;
                    if (p7m0Var3.m(value3, yi.a((yi) value3, false, false, false, z7, false, null, 32639))) {
                        return Unit.f46060a;
                    }
                    z7 = z8;
                }
                break;
            default:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    dnq dnqVar = new dnq(new fnq(new lj(wjVar.l.f43985a.d(), wjVar, (byte) 1), new nj(wjVar, yjeVar, (byte) 6), (byte) 4), new rj(wjVar, yjeVar, b2), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
