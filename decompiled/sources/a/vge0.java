package a;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vge0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ a9q0 j;
    public final /* synthetic */ pz40 k;
    public final /* synthetic */ cgk0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vge0(a9q0 a9q0Var, pz40 pz40Var, cgk0 cgk0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = a9q0Var;
        this.k = pz40Var;
        this.l = cgk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new vge0(this.j, this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new vge0(this.j, this.k, this.l, yjeVar, (byte) 1);
            default:
                return new vge0(this.j, this.k, this.l, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((vge0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        cgk0 cgk0Var = this.l;
        boolean z = true;
        a9q0 a9q0Var = this.j;
        pz40 pz40Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bw40 bw40Var = a9q0Var.b;
                Iterable iterableO = l1e0.o(0, bw40Var.f);
                if ((iterableO instanceof Collection) && ((Collection) iterableO).isEmpty()) {
                    z = false;
                } else {
                    Iterator it = iterableO.iterator();
                    while (((kkx) it).c) {
                        if (a9q0Var.m(((bkx) it).nextInt())) {
                        }
                    }
                    z = false;
                }
                pz40Var.setValue(Boolean.valueOf(z));
                cgk0Var.m(bw40Var.f);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                bw40 bw40Var2 = a9q0Var.b;
                Iterable iterableO2 = l1e0.o(0, bw40Var2.f);
                if ((iterableO2 instanceof Collection) && ((Collection) iterableO2).isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = iterableO2.iterator();
                    while (((kkx) it2).c) {
                        if (a9q0Var.m(((bkx) it2).nextInt())) {
                        }
                    }
                    z = false;
                }
                pz40Var.setValue(Boolean.valueOf(z));
                cgk0Var.m(bw40Var2.f);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                bw40 bw40Var3 = a9q0Var.b;
                Iterable iterableO3 = l1e0.o(0, bw40Var3.f);
                if ((iterableO3 instanceof Collection) && ((Collection) iterableO3).isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = iterableO3.iterator();
                    while (((kkx) it3).c) {
                        if (a9q0Var.m(((bkx) it3).nextInt())) {
                        }
                    }
                    z = false;
                }
                pz40Var.setValue(Boolean.valueOf(z));
                cgk0Var.m(bw40Var3.f);
                break;
        }
        return Unit.f46060a;
    }
}
