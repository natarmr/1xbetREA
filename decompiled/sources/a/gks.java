package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gks extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yks k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gks(yks yksVar, yje yjeVar, byte b) {
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
                gks gksVar = new gks(yksVar, yjeVar, (byte) 0);
                gksVar.j = obj;
                return gksVar;
            case 1:
                gks gksVar2 = new gks(yksVar, yjeVar, (byte) 1);
                gksVar2.j = obj;
                return gksVar2;
            case 2:
                gks gksVar3 = new gks(yksVar, yjeVar, (byte) 2);
                gksVar3.j = obj;
                return gksVar3;
            case 3:
                gks gksVar4 = new gks(yksVar, yjeVar, (byte) 3);
                gksVar4.j = obj;
                return gksVar4;
            case 4:
                gks gksVar5 = new gks(yksVar, yjeVar, (byte) 4);
                gksVar5.j = obj;
                return gksVar5;
            case 5:
                gks gksVar6 = new gks(yksVar, yjeVar, (byte) 5);
                gksVar6.j = obj;
                return gksVar6;
            case 6:
                gks gksVar7 = new gks(yksVar, yjeVar, (byte) 6);
                gksVar7.j = obj;
                return gksVar7;
            case 7:
                gks gksVar8 = new gks(yksVar, yjeVar, (byte) 7);
                gksVar8.j = obj;
                return gksVar8;
            case 8:
                gks gksVar9 = new gks(yksVar, yjeVar, (byte) 8);
                gksVar9.j = obj;
                return gksVar9;
            case 9:
                gks gksVar10 = new gks(yksVar, yjeVar, (byte) 9);
                gksVar10.j = obj;
                return gksVar10;
            case 10:
                gks gksVar11 = new gks(yksVar, yjeVar, (byte) 10);
                gksVar11.j = obj;
                return gksVar11;
            default:
                gks gksVar12 = new gks(yksVar, yjeVar, (byte) 11);
                gksVar12.j = obj;
                return gksVar12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((gks) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((gks) create((psr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((gks) create((ui9) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((gks) create((gna) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((gks) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((gks) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((gks) create((fsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((gks) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((gks) create((px7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((gks) create((bg30) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((gks) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((gks) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long j;
        byte b = this.i;
        byte b2 = 2;
        byte b3 = 1;
        yje yjeVar = null;
        yks yksVar = this.k;
        switch (b) {
            case 0:
                xsr xsrVar = (xsr) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = yks.m0;
                if (xsrVar instanceof usr) {
                    usr usrVar = (usr) xsrVar;
                    if (usrVar instanceof ssr) {
                        j = ((ssr) xsrVar).f32739a;
                    } else {
                        if (!(usrVar instanceof tsr)) {
                            t9f.b();
                            return null;
                        }
                        j = ((tsr) xsrVar).f34474a;
                    }
                    if (j == ((njs) yksVar.D()).f23650a) {
                        yksVar.H(new sjs(xsrVar, yksVar, b2));
                    }
                }
                return Unit.f46060a;
            case 1:
                psr psrVar = (psr) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(psrVar, psr.e)) {
                    bks bksVar = new bks(yksVar, b3);
                    int i2 = yks.m0;
                    yksVar.H(bksVar);
                } else if (Intrinsics.d(psrVar, psr.f)) {
                    bks bksVar2 = new bks(yksVar, b2);
                    int i3 = yks.m0;
                    yksVar.H(bksVar2);
                } else if (!Intrinsics.d(psrVar, psr.f27527a) && !Intrinsics.d(psrVar, psr.b) && !Intrinsics.d(psrVar, psr.c) && !Intrinsics.d(psrVar, psr.d)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 2:
                ui9 ui9Var = (ui9) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                wor worVar = new wor(ui9Var, (byte) 4);
                int i4 = yks.m0;
                yksVar.H(worVar);
                return Unit.f46060a;
            case 3:
                gna gnaVar = (gna) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                yor yorVar = new yor(gnaVar, (byte) 3);
                int i5 = yks.m0;
                yksVar.H(yorVar);
                return Unit.f46060a;
            case 4:
                List list = (List) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0(list, (byte) 23);
                int i6 = yks.m0;
                yksVar.H(bo0Var);
                return Unit.f46060a;
            case 5:
                List list2 = (List) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var2 = new bo0(list2, (byte) 24);
                int i7 = yks.m0;
                yksVar.H(bo0Var2);
                return Unit.f46060a;
            case 6:
                zsr zsrVar = yksVar.W;
                fsr fsrVar = (fsr) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (fsrVar.d && fsrVar.b) {
                    zsrVar.a();
                    yksVar.H(new pks(fsrVar, yksVar));
                } else {
                    pks pksVar = new pks(yksVar, fsrVar);
                    int i8 = yks.m0;
                    yksVar.H(pksVar);
                    if (((njs) yksVar.D()).j == tf50.b) {
                        zsrVar.a();
                    }
                }
                return Unit.f46060a;
            case 7:
                anq0 anq0Var = (anq0) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                int i9 = yks.m0;
                bby bbyVar = yksVar.k0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                yksVar.k0 = i3t0.K(yksVar, null, xks.f41042a, new ffd(yksVar, anq0Var, yjeVar, (byte) 14), 1);
                return Unit.f46060a;
            case 8:
                px7 px7Var = (px7) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                jpr jprVar = new jpr(px7Var, (byte) 3);
                int i10 = yks.m0;
                yksVar.H(jprVar);
                return Unit.f46060a;
            case 9:
                bg30 bg30Var = (bg30) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                lpr lprVar = new lpr(bg30Var, (byte) 3);
                int i11 = yks.m0;
                yksVar.H(lprVar);
                return Unit.f46060a;
            case 10:
                List list3 = (List) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var3 = new bo0(list3, (byte) 25);
                int i12 = yks.m0;
                yksVar.H(bo0Var3);
                return Unit.f46060a;
            default:
                anq0 anq0Var2 = (anq0) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                qpr qprVar = new qpr(anq0Var2, (byte) 3);
                int i13 = yks.m0;
                yksVar.H(qprVar);
                return Unit.f46060a;
        }
    }
}
