package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n8s extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ g9s k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8s(g9s g9sVar, yje yjeVar, byte b) {
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
                n8s n8sVar = new n8s(g9sVar, yjeVar, (byte) 0);
                n8sVar.j = obj;
                return n8sVar;
            case 1:
                n8s n8sVar2 = new n8s(g9sVar, yjeVar, (byte) 1);
                n8sVar2.j = obj;
                return n8sVar2;
            case 2:
                n8s n8sVar3 = new n8s(g9sVar, yjeVar, (byte) 2);
                n8sVar3.j = obj;
                return n8sVar3;
            case 3:
                n8s n8sVar4 = new n8s(g9sVar, yjeVar, (byte) 3);
                n8sVar4.j = obj;
                return n8sVar4;
            case 4:
                n8s n8sVar5 = new n8s(g9sVar, yjeVar, (byte) 4);
                n8sVar5.j = obj;
                return n8sVar5;
            case 5:
                n8s n8sVar6 = new n8s(g9sVar, yjeVar, (byte) 5);
                n8sVar6.j = obj;
                return n8sVar6;
            case 6:
                n8s n8sVar7 = new n8s(g9sVar, yjeVar, (byte) 6);
                n8sVar7.j = obj;
                return n8sVar7;
            case 7:
                n8s n8sVar8 = new n8s(g9sVar, yjeVar, (byte) 7);
                n8sVar8.j = obj;
                return n8sVar8;
            case 8:
                n8s n8sVar9 = new n8s(g9sVar, yjeVar, (byte) 8);
                n8sVar9.j = obj;
                return n8sVar9;
            case 9:
                n8s n8sVar10 = new n8s(g9sVar, yjeVar, (byte) 9);
                n8sVar10.j = obj;
                return n8sVar10;
            case 10:
                n8s n8sVar11 = new n8s(g9sVar, yjeVar, (byte) 10);
                n8sVar11.j = obj;
                return n8sVar11;
            case 11:
                n8s n8sVar12 = new n8s(g9sVar, yjeVar, (byte) 11);
                n8sVar12.j = obj;
                return n8sVar12;
            default:
                n8s n8sVar13 = new n8s(g9sVar, yjeVar, (byte) 12);
                n8sVar13.j = obj;
                return n8sVar13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((n8s) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((n8s) create((psr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((n8s) create((ui9) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((n8s) create((gna) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((n8s) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((n8s) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((n8s) create((fsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((n8s) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((n8s) create((px7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((n8s) create((bg30) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((n8s) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((n8s) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((n8s) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long j;
        byte b = this.i;
        byte b2 = 3;
        boolean z = true;
        yje yjeVar = null;
        byte b3 = 2;
        g9s g9sVar = this.k;
        switch (b) {
            case 0:
                xsr xsrVar = (xsr) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = g9s.n0;
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
                    if (j == ((r7s) g9sVar.D()).f29992a) {
                        g9sVar.H(new gup(xsrVar, g9sVar, (byte) 27));
                    }
                } else if (xsrVar instanceof wsr) {
                    wsr wsrVar = (wsr) xsrVar;
                    if (wsrVar.equals(wsr.f39705a)) {
                        g9sVar.H(new t4s((byte) 2));
                    } else {
                        if (!wsrVar.equals(wsr.b)) {
                            t9f.b();
                            return null;
                        }
                        g9sVar.H(new t4s((byte) 3));
                    }
                } else if (Intrinsics.d(xsrVar, vsr.f37965a)) {
                    g9sVar.H(new t4s((byte) 4));
                } else {
                    if (!Intrinsics.d(xsrVar, vsr.b)) {
                        t9f.b();
                        return null;
                    }
                    g9sVar.H(new t4s((byte) 5));
                }
                return Unit.f46060a;
            case 1:
                psr psrVar = (psr) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(psrVar, psr.e)) {
                    t4s t4sVar = new t4s((byte) 9);
                    int i2 = g9s.n0;
                    g9sVar.H(t4sVar);
                } else if (Intrinsics.d(psrVar, psr.f)) {
                    t4s t4sVar2 = new t4s((byte) 10);
                    int i3 = g9s.n0;
                    g9sVar.H(t4sVar2);
                } else if (Intrinsics.d(psrVar, psr.f27527a)) {
                    t4s t4sVar3 = new t4s((byte) 11);
                    int i4 = g9s.n0;
                    g9sVar.H(t4sVar3);
                } else if (Intrinsics.d(psrVar, psr.b)) {
                    t4s t4sVar4 = new t4s((byte) 12);
                    int i5 = g9s.n0;
                    g9sVar.H(t4sVar4);
                } else if (!Intrinsics.d(psrVar, psr.c) && !Intrinsics.d(psrVar, psr.d)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 2:
                ui9 ui9Var = (ui9) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                wor worVar = new wor(ui9Var, b2);
                int i6 = g9s.n0;
                g9sVar.H(worVar);
                return Unit.f46060a;
            case 3:
                gna gnaVar = (gna) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                yor yorVar = new yor(gnaVar, (byte) 2);
                int i7 = g9s.n0;
                g9sVar.H(yorVar);
                return Unit.f46060a;
            case 4:
                List list = (List) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0(list, (byte) 20);
                int i8 = g9s.n0;
                g9sVar.H(bo0Var);
                return Unit.f46060a;
            case 5:
                List list2 = (List) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var2 = new bo0(list2, (byte) 21);
                int i9 = g9s.n0;
                g9sVar.H(bo0Var2);
                return Unit.f46060a;
            case 6:
                zsr zsrVar = g9sVar.W;
                fsr fsrVar = (fsr) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (fsrVar.d && fsrVar.b) {
                    zsrVar.a();
                    g9sVar.H(new v8s(fsrVar, g9sVar));
                } else {
                    v8s v8sVar = new v8s(g9sVar, fsrVar);
                    int i10 = g9s.n0;
                    g9sVar.H(v8sVar);
                    r7s r7sVar = (r7s) g9sVar.D();
                    boolean z2 = r7sVar.B || r7sVar.D;
                    if (!r7sVar.C && !r7sVar.E) {
                        z = false;
                    }
                    if (z2 || z) {
                        zsrVar.a();
                    }
                }
                return Unit.f46060a;
            case 7:
                anq0 anq0Var = (anq0) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                int i11 = g9s.n0;
                bby bbyVar = g9sVar.l0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                g9sVar.l0 = i3t0.K(g9sVar, null, f9s.f9170a, new ffd(g9sVar, anq0Var, yjeVar, (byte) 13), 1);
                return Unit.f46060a;
            case 8:
                px7 px7Var = (px7) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                jpr jprVar = new jpr(px7Var, (byte) 2);
                int i12 = g9s.n0;
                g9sVar.H(jprVar);
                return Unit.f46060a;
            case 9:
                bg30 bg30Var = (bg30) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                lpr lprVar = new lpr(bg30Var, (byte) 2);
                int i13 = g9s.n0;
                g9sVar.H(lprVar);
                return Unit.f46060a;
            case 10:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                k92 k92Var = new k92(uaq0Var, b3);
                int i14 = g9s.n0;
                g9sVar.H(k92Var);
                return Unit.f46060a;
            case 11:
                List list3 = (List) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var3 = new bo0(list3, (byte) 22);
                int i15 = g9s.n0;
                g9sVar.H(bo0Var3);
                return Unit.f46060a;
            default:
                anq0 anq0Var2 = (anq0) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                qpr qprVar = new qpr(anq0Var2, (byte) 2);
                int i16 = g9s.n0;
                g9sVar.H(qprVar);
                return Unit.f46060a;
        }
    }
}
