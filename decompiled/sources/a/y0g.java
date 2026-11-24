package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.game.core.betting.domain.model.RelatedParams;

/* JADX INFO: loaded from: classes3.dex */
public final class y0g extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0g(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = obj;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = 3;
        switch (this.i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                y0g y0gVar = new y0g((int) b, (yje) obj3, (byte) 0);
                y0gVar.j = zBooleanValue;
                y0gVar.k = (fs20) obj2;
                return y0gVar.invokeSuspend(Unit.f46060a);
            case 1:
                return new y0g(this.k, (yje) obj3, (byte) 1).invokeSuspend(Unit.f46060a);
            case 2:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                y0g y0gVar2 = new y0g((int) b, (yje) obj3, (byte) 2);
                y0gVar2.j = zBooleanValue2;
                y0gVar2.k = (RelatedParams) obj2;
                return y0gVar2.invokeSuspend(Unit.f46060a);
            case 3:
                return new y0g((ncj) this.k, (yje) obj3, b).invokeSuspend(Unit.f46060a);
            case 4:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                y0g y0gVar3 = new y0g((int) b, (yje) obj3, (byte) 4);
                y0gVar3.k = (Boolean) obj;
                y0gVar3.j = zBooleanValue3;
                return y0gVar3.invokeSuspend(Unit.f46060a);
            case 5:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                y0g y0gVar4 = new y0g((int) b, (yje) obj3, (byte) 5);
                y0gVar4.j = zBooleanValue4;
                y0gVar4.k = (px7) obj2;
                return y0gVar4.invokeSuspend(Unit.f46060a);
            case 6:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                y0g y0gVar5 = new y0g((int) b, (yje) obj3, (byte) 6);
                y0gVar5.k = (tk60) obj;
                y0gVar5.j = zBooleanValue5;
                return y0gVar5.invokeSuspend(Unit.f46060a);
            case 7:
                return new y0g(this.k, (yje) obj3, (byte) 7).invokeSuspend(Unit.f46060a);
            case 8:
                return new y0g(this.k, (yje) obj3, (byte) 8).invokeSuspend(Unit.f46060a);
            case 9:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                y0g y0gVar6 = new y0g((int) b, (yje) obj3, (byte) 9);
                y0gVar6.j = zBooleanValue6;
                y0gVar6.k = (Throwable) obj2;
                return y0gVar6.invokeSuspend(Unit.f46060a);
            case 10:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                y0g y0gVar7 = new y0g((int) b, (yje) obj3, (byte) 10);
                y0gVar7.k = (yfd0) obj;
                y0gVar7.j = zBooleanValue7;
                return y0gVar7.invokeSuspend(Unit.f46060a);
            default:
                ((Boolean) obj2).getClass();
                y0g y0gVar8 = new y0g((int) b, (yje) obj3, (byte) 11);
                y0gVar8.k = (nzp) obj;
                return y0gVar8.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = false;
        yje yjeVar = null;
        switch (this.i) {
            case 0:
                boolean z2 = this.j;
                fs20 fs20Var = (fs20) this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return new Pair(Boolean.valueOf(z2), Boolean.valueOf(fs20Var.a() != -26));
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    vqg vqgVar = (vqg) this.k;
                    this.j = true;
                    if (vqgVar.A(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                boolean z4 = this.j;
                RelatedParams relatedParams = (RelatedParams) this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return new Pair(Boolean.valueOf(z4), relatedParams);
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    ncj ncjVar = (ncj) this.k;
                    this.j = true;
                    if (ncjVar.b(this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                Boolean bool = (Boolean) this.k;
                boolean zBooleanValue = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 5:
                boolean z6 = this.j;
                px7 px7Var = (px7) this.k;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (z6 && !(px7Var instanceof lx7)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 6:
                tk60 tk60Var = (tk60) this.k;
                boolean z7 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (z7 && Intrinsics.d(tk60Var, qk60.f28870a)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    pht0 pht0Var = ((rt70) this.k).p;
                    this.j = true;
                    pht0Var.f27014a.f27130a.f28880a.o(null, new Long(0L));
                    if (Unit.f46060a == wneVar8) {
                        return wneVar8;
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
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    iu iuVar = ((gz70) this.k).f;
                    this.j = true;
                    ((vae) iuVar.f15374a.b).a();
                    if (Unit.f46060a == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                boolean z10 = this.j;
                Throwable th = (Throwable) this.k;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                if (th != null && ((th instanceof dxb) || (th instanceof j7t0) || (th instanceof zhi0))) {
                    throw th;
                }
                return th instanceof voo ? Boolean.FALSE : Boolean.valueOf(z10);
            case 10:
                yfd0 yfd0Var = (yfd0) this.k;
                boolean z11 = this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                if (yfd0Var.f42536a.length() > 0 && z11) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    nzp nzpVar = (nzp) this.k;
                    this.j = true;
                    if (!nzpVar.c.get()) {
                        Object objL0 = sac.l0(nzpVar.f24384a, new hr(nzpVar, yjeVar, (byte) 15), this);
                        return objL0 == wneVar12 ? wneVar12 : objL0;
                    }
                    jf4.n("This scope has already been closed.");
                } else {
                    if (z12) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0g(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }
}
