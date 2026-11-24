package a;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class aoj0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ eoj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aoj0(eoj0 eoj0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = eoj0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        eoj0 eoj0Var = this.k;
        switch (b) {
            case 0:
                return new aoj0(eoj0Var, yjeVar, (byte) 0);
            case 1:
                return new aoj0(eoj0Var, yjeVar, (byte) 1);
            case 2:
                return new aoj0(eoj0Var, yjeVar, (byte) 2);
            case 3:
                return new aoj0(eoj0Var, yjeVar, (byte) 3);
            default:
                return new aoj0(eoj0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((aoj0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object g0g0Var;
        byte b = this.i;
        eoj0 eoj0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ieu ieuVar = eoj0Var.o;
                    String str = eoj0Var.v;
                    File file = eoj0Var.w;
                    this.j = true;
                    obj = ieuVar.m(str, file, this);
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
                File file2 = (File) obj;
                int i = eoj0.D;
                p7m0 p7m0Var = eoj0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, rnj0.a((rnj0) value, file2, false, false, false, 12)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        e0g0 e0g0Var = j0g0.b;
                        e1u e1uVar = eoj0Var.p;
                        File file3 = eoj0Var.w;
                        String str2 = eoj0Var.v;
                        this.j = true;
                        obj = e1uVar.b(file3, str2, this);
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
                    g0g0Var = (File) obj;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (j0g0.a(g0g0Var) instanceof cxe) {
                    int i2 = eoj0.D;
                    eoj0Var.M();
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    hr hrVar = new hr(eoj0Var, yjeVar, (byte) 29);
                    this.j = true;
                    int i3 = eoj0.D;
                    obj = eoj0Var.N(hrVar, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i4 = eoj0.D;
                eoj0Var.G((onj0) obj);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (z4) {
                    if (z4) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                e1u e1uVar2 = eoj0Var.p;
                File file4 = eoj0Var.w;
                String str3 = eoj0Var.v;
                this.j = true;
                Object objB = e1uVar2.b(file4, str3, this);
                return objB == wneVar4 ? wneVar4 : objB;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    aoj0 aoj0Var = new aoj0(eoj0Var, yjeVar, (byte) 3);
                    this.j = true;
                    int i5 = eoj0.D;
                    obj = eoj0Var.N(aoj0Var, this);
                    if (obj == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                eoj0Var.t.a();
                eoj0Var.G(new nnj0((File) obj));
                return Unit.f46060a;
        }
    }
}
