package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s3s extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ k4s k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s3s(k4s k4sVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k4sVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        k4s k4sVar = this.k;
        switch (b) {
            case 0:
                s3s s3sVar = new s3s(k4sVar, yjeVar, (byte) 0);
                s3sVar.j = obj;
                return s3sVar;
            case 1:
                s3s s3sVar2 = new s3s(k4sVar, yjeVar, (byte) 1);
                s3sVar2.j = obj;
                return s3sVar2;
            case 2:
                s3s s3sVar3 = new s3s(k4sVar, yjeVar, (byte) 2);
                s3sVar3.j = obj;
                return s3sVar3;
            case 3:
                s3s s3sVar4 = new s3s(k4sVar, yjeVar, (byte) 3);
                s3sVar4.j = obj;
                return s3sVar4;
            case 4:
                s3s s3sVar5 = new s3s(k4sVar, yjeVar, (byte) 4);
                s3sVar5.j = obj;
                return s3sVar5;
            case 5:
                s3s s3sVar6 = new s3s(k4sVar, yjeVar, (byte) 5);
                s3sVar6.j = obj;
                return s3sVar6;
            case 6:
                s3s s3sVar7 = new s3s(k4sVar, yjeVar, (byte) 6);
                s3sVar7.j = obj;
                return s3sVar7;
            case 7:
                s3s s3sVar8 = new s3s(k4sVar, yjeVar, (byte) 7);
                s3sVar8.j = obj;
                return s3sVar8;
            case 8:
                s3s s3sVar9 = new s3s(k4sVar, yjeVar, (byte) 8);
                s3sVar9.j = obj;
                return s3sVar9;
            case 9:
                s3s s3sVar10 = new s3s(k4sVar, yjeVar, (byte) 9);
                s3sVar10.j = obj;
                return s3sVar10;
            case 10:
                s3s s3sVar11 = new s3s(k4sVar, yjeVar, (byte) 10);
                s3sVar11.j = obj;
                return s3sVar11;
            case 11:
                s3s s3sVar12 = new s3s(k4sVar, yjeVar, (byte) 11);
                s3sVar12.j = obj;
                return s3sVar12;
            default:
                s3s s3sVar13 = new s3s(k4sVar, yjeVar, (byte) 12);
                s3sVar13.j = obj;
                return s3sVar13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((s3s) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((s3s) create((psr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((s3s) create((ui9) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((s3s) create((gna) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((s3s) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((s3s) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((s3s) create((fsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((s3s) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((s3s) create((px7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((s3s) create((bg30) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((s3s) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((s3s) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((s3s) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 2;
        dja djaVar = null;
        Object[] objArr = 0;
        final byte b3 = 1;
        k4s k4sVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                xsr xsrVar = (xsr) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = k4s.c0;
                if (xsrVar instanceof usr) {
                    if (((usr) xsrVar).a() == ((z2s) k4sVar.D()).f43686a) {
                        k4sVar.H(new jar(xsrVar, (byte) 7));
                    }
                } else if (!(xsrVar instanceof wsr) && !Intrinsics.d(xsrVar, vsr.f37965a) && !Intrinsics.d(xsrVar, vsr.b)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 1:
                psr psrVar = (psr) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(psrVar, psr.e)) {
                    gwr gwrVar = new gwr((byte) 20);
                    int i2 = k4s.c0;
                    k4sVar.H(gwrVar);
                } else if (Intrinsics.d(psrVar, psr.f)) {
                    gwr gwrVar2 = new gwr((byte) 21);
                    int i3 = k4s.c0;
                    k4sVar.H(gwrVar2);
                } else if (Intrinsics.d(psrVar, psr.f27527a)) {
                    gwr gwrVar3 = new gwr((byte) 22);
                    int i4 = k4s.c0;
                    k4sVar.H(gwrVar3);
                } else if (Intrinsics.d(psrVar, psr.b)) {
                    gwr gwrVar4 = new gwr((byte) 23);
                    int i5 = k4s.c0;
                    k4sVar.H(gwrVar4);
                } else if (!Intrinsics.d(psrVar, psr.c) && !Intrinsics.d(psrVar, psr.d)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 2:
                ui9 ui9Var = (ui9) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (((z2s) k4sVar.D()).R == null) {
                    k4sVar.H(new wor(ui9Var, (byte) 1));
                } else {
                    k4sVar.H(new wor(ui9Var, (byte) 2));
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                yor yorVar = new yor((gna) obj2, (byte) 1);
                int i6 = k4s.c0;
                k4sVar.H(yorVar);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0((List) obj2, (byte) 17);
                int i7 = k4s.c0;
                k4sVar.H(bo0Var);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var2 = new bo0((List) obj2, (byte) 18);
                int i8 = k4s.c0;
                k4sVar.H(bo0Var2);
                return Unit.f46060a;
            case 6:
                final fsr fsrVar = (fsr) obj2;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (((z2s) k4sVar.D()).I == null) {
                    if (fsrVar.d && fsrVar.b) {
                        final byte b4 = 0;
                        k4sVar.H(new Function2() { // from class: a.g3s
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (b4) {
                                    case 0:
                                        oyg0 oyg0Var = (oyg0) obj3;
                                        z2s z2sVar = (z2s) obj4;
                                        oyg0Var.getClass();
                                        z2sVar.getClass();
                                        irs irsVar = irs.b;
                                        q7x.F(oyg0Var, irsVar, "KEY_CURRENT_TAB");
                                        dja djaVar2 = dja.BROADCASTING_VIDEO;
                                        q7x.F(oyg0Var, djaVar2, "KEY_CURRENT_BROADCASTING_TYPE");
                                        return z2s.a(z2sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, fsrVar, null, null, null, irsVar, djaVar2, null, null, null, null, null, false, null, -1, 65339);
                                    default:
                                        z2s z2sVar2 = (z2s) obj4;
                                        ((oyg0) obj3).getClass();
                                        z2sVar2.getClass();
                                        return z2s.a(z2sVar2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, fsrVar, null, null, null, null, null, null, null, null, null, null, false, null, -1, 65531);
                                }
                            }
                        });
                    } else {
                        k4sVar.H(new Function2() { // from class: a.g3s
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                switch (b3) {
                                    case 0:
                                        oyg0 oyg0Var = (oyg0) obj3;
                                        z2s z2sVar = (z2s) obj4;
                                        oyg0Var.getClass();
                                        z2sVar.getClass();
                                        irs irsVar = irs.b;
                                        q7x.F(oyg0Var, irsVar, "KEY_CURRENT_TAB");
                                        dja djaVar2 = dja.BROADCASTING_VIDEO;
                                        q7x.F(oyg0Var, djaVar2, "KEY_CURRENT_BROADCASTING_TYPE");
                                        return z2s.a(z2sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, fsrVar, null, null, null, irsVar, djaVar2, null, null, null, null, null, false, null, -1, 65339);
                                    default:
                                        z2s z2sVar2 = (z2s) obj4;
                                        ((oyg0) obj3).getClass();
                                        z2sVar2.getClass();
                                        return z2s.a(z2sVar2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, fsrVar, null, null, null, null, null, null, null, null, null, null, false, null, -1, 65531);
                                }
                            }
                        });
                    }
                    if (((z2s) k4sVar.D()).M == irs.b) {
                        k4sVar.u.a();
                    }
                } else {
                    dja djaVar2 = ((z2s) k4sVar.D()).N;
                    dja djaVar3 = dja.BROADCASTING_VIDEO;
                    if (djaVar2 == djaVar3 && fsrVar.b) {
                        djaVar = djaVar3;
                    } else {
                        dja djaVar4 = dja.BROADCASTING_ZONE;
                        if (djaVar2 == djaVar4 && fsrVar.c) {
                            djaVar = djaVar4;
                        } else if (fsrVar.b) {
                            djaVar = djaVar3;
                        } else if (fsrVar.c) {
                            djaVar = djaVar4;
                        }
                    }
                    k4sVar.H(new hpr(fsrVar, djaVar == null ? irs.f15274a : ((z2s) k4sVar.D()).M, djaVar, b2));
                }
                return Unit.f46060a;
            case 7:
                anq0 anq0Var = (anq0) obj2;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                int i9 = k4s.c0;
                c4m0 c4m0Var = k4sVar.b0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                k4sVar.C.getClass();
                k4sVar.b0 = sac.T(new fnq(qud.f(anq0Var), new s3s(k4sVar, objArr == true ? 1 : 0, (byte) 12), (byte) 4), jiu0.a(k4sVar), j4s.h);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                jpr jprVar = new jpr((px7) obj2, (byte) 1);
                int i10 = k4s.c0;
                k4sVar.H(jprVar);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                lpr lprVar = new lpr((bg30) obj2, (byte) 1);
                int i11 = k4s.c0;
                k4sVar.H(lprVar);
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                k92 k92Var = new k92((uaq0) obj2, b3);
                int i12 = k4s.c0;
                k4sVar.H(k92Var);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var3 = new bo0((List) obj2, (byte) 19);
                int i13 = k4s.c0;
                k4sVar.H(bo0Var3);
                return Unit.f46060a;
            default:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                qpr qprVar = new qpr((anq0) obj2, (byte) 1);
                int i14 = k4s.c0;
                k4sVar.H(qprVar);
                return Unit.f46060a;
        }
    }
}
