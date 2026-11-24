package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class s550 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ d650 j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s550(d650 d650Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = d650Var;
        this.k = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.k;
        d650 d650Var = this.j;
        switch (b) {
            case 0:
                return new s550(d650Var, str, yjeVar, (byte) 0);
            case 1:
                return new s550(d650Var, str, yjeVar, (byte) 1);
            case 2:
                return new s550(d650Var, str, yjeVar, (byte) 2);
            default:
                return new s550(d650Var, str, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((s550) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        Object value3;
        ArrayList arrayList3;
        Object value4;
        ArrayList arrayList4;
        byte b = this.i;
        obj objVar = obj.f24982a;
        String str = this.k;
        d650 d650Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                d650Var.C0.remove(str);
                p7m0 p7m0Var = d650Var.g1;
                do {
                    value = p7m0Var.getValue();
                    Iterable<Object> iterable = (Iterable) p7m0Var.getValue();
                    arrayList = new ArrayList(r3d.q(iterable, 10));
                    for (Object me40Var : iterable) {
                        if (me40Var instanceof me40) {
                            me40Var = new me40(objVar);
                        }
                        arrayList.add(me40Var);
                    }
                } while (!p7m0Var.m(value, arrayList));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = d650Var.g1;
                do {
                    value2 = p7m0Var2.getValue();
                    Iterable<Object> iterable2 = (Iterable) p7m0Var2.getValue();
                    arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                    for (Object oe40Var : iterable2) {
                        if (oe40Var instanceof oe40) {
                            oe40Var = new oe40(objVar);
                        }
                        arrayList2.add(oe40Var);
                    }
                } while (!p7m0Var2.m(value2, arrayList2));
                d650Var.C0.remove(str);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                d650Var.C0.remove(str);
                p7m0 p7m0Var3 = d650Var.g1;
                do {
                    value3 = p7m0Var3.getValue();
                    Iterable<Object> iterable3 = (Iterable) p7m0Var3.getValue();
                    arrayList3 = new ArrayList(r3d.q(iterable3, 10));
                    for (Object qe40Var : iterable3) {
                        if (qe40Var instanceof qe40) {
                            x4t x4tVar = ((qe40) qe40Var).f28565a;
                            if (x4tVar instanceof p4t) {
                                qe40Var = new qe40(x4tVar, objVar);
                            }
                        }
                        arrayList3.add(qe40Var);
                    }
                } while (!p7m0Var3.m(value3, arrayList3));
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                d650Var.C0.remove(str);
                p7m0 p7m0Var4 = d650Var.g1;
                do {
                    value4 = p7m0Var4.getValue();
                    Iterable<Object> iterable4 = (Iterable) p7m0Var4.getValue();
                    arrayList4 = new ArrayList(r3d.q(iterable4, 10));
                    for (Object qe40Var2 : iterable4) {
                        if (qe40Var2 instanceof qe40) {
                            x4t x4tVar2 = ((qe40) qe40Var2).f28565a;
                            if (x4tVar2 instanceof s4t) {
                                qe40Var2 = new qe40(x4tVar2, objVar);
                            }
                        }
                        arrayList4.add(qe40Var2);
                    }
                } while (!p7m0Var4.m(value4, arrayList4));
                break;
        }
        return Unit.f46060a;
    }
}
