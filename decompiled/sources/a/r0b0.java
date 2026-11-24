package a;

import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r0b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ f1b0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0b0(f1b0 f1b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f1b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f1b0 f1b0Var = this.k;
        switch (b) {
            case 0:
                return new r0b0(f1b0Var, yjeVar, (byte) 0);
            case 1:
                return new r0b0(f1b0Var, yjeVar, (byte) 1);
            case 2:
                return new r0b0(f1b0Var, yjeVar, (byte) 2);
            default:
                r0b0 r0b0Var = new r0b0(f1b0Var, yjeVar, (byte) 3);
                r0b0Var.j = ((Boolean) obj).booleanValue();
                return r0b0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r0b0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r0b0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((r0b0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((r0b0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        bby bbyVar;
        Object value;
        byte b = this.i;
        f1b0 f1b0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                try {
                    if (!z) {
                        z1x.P(obj);
                        bby bbyVar2 = f1b0Var.r0;
                        if (bbyVar2 != null && bbyVar2.isActive()) {
                            this.j = true;
                            if (bbyVar2.join(this) == wneVar) {
                                return wneVar;
                            }
                        }
                        bbyVar = f1b0Var.q0;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                        return Unit.f46060a;
                    }
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    break;
                } catch (CancellationException unused) {
                }
                bbyVar = f1b0Var.q0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ytt yttVar = f1b0Var.d0;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var = f1b0Var.o;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI.h(f1b0Var.z.q(new hr1(0L, 3)));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    n660 n660Var = f1b0Var.M;
                    this.j = true;
                    if (n660Var.z(this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (!((d0b0) f1b0Var.D()).h && z4) {
                    f1b0Var.X();
                    f1b0Var.R(false);
                }
                p7m0 p7m0Var = f1b0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, d0b0.a((d0b0) value, null, null, null, null, null, false, z4, false, false, null, false, 3967)));
                return Unit.f46060a;
        }
    }
}
