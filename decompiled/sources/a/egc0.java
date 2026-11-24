package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class egc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ k3t0 k;
    public final /* synthetic */ Function1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ egc0(k3t0 k3t0Var, Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k3t0Var;
        this.l = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new egc0(this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new egc0(this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new egc0(this.k, this.l, yjeVar, (byte) 2);
            case 3:
                return new egc0(this.k, this.l, yjeVar, (byte) 3);
            case 4:
                return new egc0(this.k, this.l, yjeVar, (byte) 4);
            case 5:
                return new egc0(this.k, this.l, yjeVar, (byte) 5);
            case 6:
                return new egc0(this.k, this.l, yjeVar, (byte) 6);
            case 7:
                return new egc0(this.k, this.l, yjeVar, (byte) 7);
            case 8:
                return new egc0(this.k, this.l, yjeVar, (byte) 8);
            case 9:
                return new egc0(this.k, this.l, yjeVar, (byte) 9);
            case 10:
                return new egc0(this.k, this.l, yjeVar, (byte) 10);
            case 11:
                return new egc0(this.k, this.l, yjeVar, (byte) 11);
            case 12:
                return new egc0(this.k, this.l, yjeVar, (byte) 12);
            case 13:
                return new egc0(this.k, this.l, yjeVar, (byte) 13);
            case 14:
                return new egc0(this.k, this.l, yjeVar, (byte) 14);
            case 15:
                return new egc0(this.k, this.l, yjeVar, (byte) 15);
            default:
                return new egc0(this.k, this.l, yjeVar, (byte) 16);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
        }
        return ((egc0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.l;
        k3t0 k3t0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq gmqVarC = ((i3t0) k3t0Var).C();
                    x6h x6hVar = new x6h(function1, (byte) 13);
                    this.j = true;
                    if (((i89) gmqVarC).c(x6hVar, this) == wneVar) {
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
                    gmq gmqVarC2 = ((i3t0) k3t0Var).C();
                    x6h x6hVar2 = new x6h(function1, (byte) 14);
                    this.j = true;
                    if (((i89) gmqVarC2).c(x6hVar2, this) == wneVar2) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    gmq gmqVarC3 = ((i3t0) k3t0Var).C();
                    x6h x6hVar3 = new x6h(function1, (byte) 15);
                    this.j = true;
                    if (((i89) gmqVarC3).c(x6hVar3, this) == wneVar3) {
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
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    gmq gmqVarC4 = ((i3t0) k3t0Var).C();
                    x6h x6hVar4 = new x6h(function1, (byte) 16);
                    this.j = true;
                    if (((i89) gmqVarC4).c(x6hVar4, this) == wneVar4) {
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
                    gmq gmqVarC5 = ((i3t0) k3t0Var).C();
                    x6h x6hVar5 = new x6h(function1, (byte) 17);
                    this.j = true;
                    if (((i89) gmqVarC5).c(x6hVar5, this) == wneVar5) {
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
                    gmq gmqVarC6 = ((i3t0) k3t0Var).C();
                    x6h x6hVar6 = new x6h(function1, (byte) 19);
                    this.j = true;
                    if (((i89) gmqVarC6).c(x6hVar6, this) == wneVar6) {
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
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    gmq gmqVarC7 = ((i3t0) k3t0Var).C();
                    x6h x6hVar7 = new x6h(function1, (byte) 20);
                    this.j = true;
                    if (((i89) gmqVarC7).c(x6hVar7, this) == wneVar7) {
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
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    gmq gmqVarC8 = ((i3t0) k3t0Var).C();
                    x6h x6hVar8 = new x6h(function1, (byte) 21);
                    this.j = true;
                    if (((i89) gmqVarC8).c(x6hVar8, this) == wneVar8) {
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
                    gmq gmqVarC9 = ((i3t0) k3t0Var).C();
                    x6h x6hVar9 = new x6h(function1, (byte) 22);
                    this.j = true;
                    if (((i89) gmqVarC9).c(x6hVar9, this) == wneVar9) {
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
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    gmq gmqVarC10 = ((i3t0) k3t0Var).C();
                    x6h x6hVar10 = new x6h(function1, (byte) 23);
                    this.j = true;
                    if (((i89) gmqVarC10).c(x6hVar10, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    gmq gmqVarC11 = ((i3t0) k3t0Var).C();
                    x6h x6hVar11 = new x6h(function1, (byte) 24);
                    this.j = true;
                    if (((i89) gmqVarC11).c(x6hVar11, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    gmq gmqVarC12 = ((i3t0) k3t0Var).C();
                    x6h x6hVar12 = new x6h(function1, (byte) 26);
                    this.j = true;
                    if (((i89) gmqVarC12).c(x6hVar12, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    gmq gmqVarC13 = ((i3t0) k3t0Var).C();
                    f0p0 f0p0Var = new f0p0(function1, (byte) 0);
                    this.j = true;
                    if (((i89) gmqVarC13).c(f0p0Var, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    gmq gmqVarC14 = ((i3t0) k3t0Var).C();
                    f0p0 f0p0Var2 = new f0p0(function1, (byte) 1);
                    this.j = true;
                    if (((i89) gmqVarC14).c(f0p0Var2, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    gmq gmqVarC15 = ((i3t0) k3t0Var).C();
                    f0p0 f0p0Var3 = new f0p0(function1, (byte) 2);
                    this.j = true;
                    if (((i89) gmqVarC15).c(f0p0Var3, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    gmq gmqVarC16 = ((i3t0) k3t0Var).C();
                    f0p0 f0p0Var4 = new f0p0(function1, (byte) 3);
                    this.j = true;
                    if (((i89) gmqVarC16).c(f0p0Var4, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar17 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    gmq gmqVarC17 = ((i3t0) k3t0Var).C();
                    f0p0 f0p0Var5 = new f0p0(function1, (byte) 4);
                    this.j = true;
                    if (((i89) gmqVarC17).c(f0p0Var5, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
