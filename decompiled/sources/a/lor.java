package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lor extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ spr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lor(spr sprVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sprVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        spr sprVar = this.k;
        switch (b) {
            case 0:
                lor lorVar = new lor(sprVar, yjeVar, (byte) 0);
                lorVar.j = obj;
                return lorVar;
            case 1:
                lor lorVar2 = new lor(sprVar, yjeVar, (byte) 1);
                lorVar2.j = obj;
                return lorVar2;
            case 2:
                lor lorVar3 = new lor(sprVar, yjeVar, (byte) 2);
                lorVar3.j = obj;
                return lorVar3;
            case 3:
                lor lorVar4 = new lor(sprVar, yjeVar, (byte) 3);
                lorVar4.j = obj;
                return lorVar4;
            case 4:
                lor lorVar5 = new lor(sprVar, yjeVar, (byte) 4);
                lorVar5.j = obj;
                return lorVar5;
            case 5:
                lor lorVar6 = new lor(sprVar, yjeVar, (byte) 5);
                lorVar6.j = obj;
                return lorVar6;
            case 6:
                lor lorVar7 = new lor(sprVar, yjeVar, (byte) 6);
                lorVar7.j = obj;
                return lorVar7;
            case 7:
                lor lorVar8 = new lor(sprVar, yjeVar, (byte) 7);
                lorVar8.j = obj;
                return lorVar8;
            case 8:
                lor lorVar9 = new lor(sprVar, yjeVar, (byte) 8);
                lorVar9.j = obj;
                return lorVar9;
            case 9:
                lor lorVar10 = new lor(sprVar, yjeVar, (byte) 9);
                lorVar10.j = obj;
                return lorVar10;
            case 10:
                lor lorVar11 = new lor(sprVar, yjeVar, (byte) 10);
                lorVar11.j = obj;
                return lorVar11;
            case 11:
                lor lorVar12 = new lor(sprVar, yjeVar, (byte) 11);
                lorVar12.j = obj;
                return lorVar12;
            default:
                lor lorVar13 = new lor(sprVar, yjeVar, (byte) 12);
                lorVar13.j = obj;
                return lorVar13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lor) create((c3z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((lor) create((g4z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((lor) create((xsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((lor) create((ui9) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((lor) create((gna) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((lor) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((lor) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((lor) create((fsr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((lor) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((lor) create((px7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((lor) create((bg30) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((lor) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lor) create((anq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long j;
        byte b = this.i;
        final byte b2 = 1;
        final byte b3 = 0;
        yje yjeVar = null;
        final spr sprVar = this.k;
        switch (b) {
            case 0:
                mne mneVar = sprVar.q;
                c3z c3zVar = (c3z) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (c3zVar instanceof a3z) {
                    l9s l9sVar = ((a3z) c3zVar).f197a;
                    int i = spr.j0;
                    sac.V(jiu0.a(sprVar), gor.f11645a, null, mneVar.c, new xb2((Object) sprVar, (Object) l9sVar, yjeVar, (byte) 26), 10);
                } else {
                    if (!Intrinsics.d(c3zVar, b3z.f1931a)) {
                        t9f.b();
                        return null;
                    }
                    int i2 = spr.j0;
                    sac.V(jiu0.a(sprVar), hor.f13407a, null, mneVar.c, new Cfor(sprVar, yjeVar, b2), 10);
                }
                return Unit.f46060a;
            case 1:
                g4z g4zVar = (g4z) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i3 = spr.j0;
                sac.V(jiu0.a(sprVar), jor.f16872a, null, sprVar.q.c, new xb2((Object) sprVar, (Object) g4zVar, yjeVar, (byte) 27), 10);
                return Unit.f46060a;
            case 2:
                xsr xsrVar = (xsr) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i4 = spr.j0;
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
                    if (j == ((qnr) sprVar.D()).f29044a) {
                        sprVar.H(new gup(xsrVar, sprVar, (byte) 18));
                    }
                } else if (xsrVar instanceof wsr) {
                    wsr wsrVar = (wsr) xsrVar;
                    if (wsrVar.equals(wsr.f39705a)) {
                        sprVar.H(new nuq((byte) 7));
                    } else {
                        if (!wsrVar.equals(wsr.b)) {
                            t9f.b();
                            return null;
                        }
                        sprVar.H(new nuq((byte) 8));
                    }
                } else if (Intrinsics.d(xsrVar, vsr.f37965a)) {
                    sprVar.H(new nuq((byte) 9));
                } else {
                    if (!Intrinsics.d(xsrVar, vsr.b)) {
                        t9f.b();
                        return null;
                    }
                    sprVar.H(new nuq((byte) 10));
                }
                return Unit.f46060a;
            case 3:
                ui9 ui9Var = (ui9) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                wor worVar = new wor(ui9Var, (byte) 0);
                int i5 = spr.j0;
                sprVar.H(worVar);
                return Unit.f46060a;
            case 4:
                gna gnaVar = (gna) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                yor yorVar = new yor(gnaVar, (byte) 0);
                int i6 = spr.j0;
                sprVar.H(yorVar);
                return Unit.f46060a;
            case 5:
                List list = (List) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0(list, (byte) 14);
                int i7 = spr.j0;
                sprVar.H(bo0Var);
                return Unit.f46060a;
            case 6:
                List list2 = (List) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var2 = new bo0(list2, (byte) 15);
                int i8 = spr.j0;
                sprVar.H(bo0Var2);
                return Unit.f46060a;
            case 7:
                final fsr fsrVar = (fsr) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (fsrVar.d && fsrVar.b) {
                    sprVar.C.a();
                    sprVar.H(new Function2() { // from class: a.epr
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            dja djaVar;
                            byte b4 = b3;
                            spr sprVar2 = sprVar;
                            switch (b4) {
                                case 0:
                                    qnr qnrVarA = qnr.a((qnr) obj3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, true, false, false, false, false, false, false, null, null, false, false, fsrVar, null, null, dja.BROADCASTING_VIDEO, null, null, null, null, null, false, null, false, -33554433, 523711);
                                    sprVar2.o.e("KEY_CURRENT_CARD_TYPE", qnrVarA.P);
                                    return qnrVarA;
                                default:
                                    qnr qnrVar = (qnr) obj3;
                                    int iOrdinal = sprVar2.p.d.ordinal();
                                    if (iOrdinal == 0) {
                                        djaVar = dja.BROADCASTING_VIDEO;
                                    } else if (iOrdinal != 1) {
                                        djaVar = null;
                                        if (iOrdinal != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                    } else {
                                        djaVar = dja.BROADCASTING_ZONE;
                                    }
                                    qnr qnrVarA2 = qnr.a(qnrVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, fsrVar, null, null, djaVar, null, null, null, null, null, false, null, false, -1, 523711);
                                    sprVar2.o.e("KEY_CURRENT_CARD_TYPE", qnrVarA2.P);
                                    return qnrVarA2;
                            }
                        }
                    });
                } else {
                    Function2 function2 = new Function2() { // from class: a.epr
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            dja djaVar;
                            byte b4 = b2;
                            spr sprVar2 = sprVar;
                            switch (b4) {
                                case 0:
                                    qnr qnrVarA = qnr.a((qnr) obj3, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, true, false, false, false, false, false, false, null, null, false, false, fsrVar, null, null, dja.BROADCASTING_VIDEO, null, null, null, null, null, false, null, false, -33554433, 523711);
                                    sprVar2.o.e("KEY_CURRENT_CARD_TYPE", qnrVarA.P);
                                    return qnrVarA;
                                default:
                                    qnr qnrVar = (qnr) obj3;
                                    int iOrdinal = sprVar2.p.d.ordinal();
                                    if (iOrdinal == 0) {
                                        djaVar = dja.BROADCASTING_VIDEO;
                                    } else if (iOrdinal != 1) {
                                        djaVar = null;
                                        if (iOrdinal != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                    } else {
                                        djaVar = dja.BROADCASTING_ZONE;
                                    }
                                    qnr qnrVarA2 = qnr.a(qnrVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, fsrVar, null, null, djaVar, null, null, null, null, null, false, null, false, -1, 523711);
                                    sprVar2.o.e("KEY_CURRENT_CARD_TYPE", qnrVarA2.P);
                                    return qnrVarA2;
                            }
                        }
                    };
                    int i9 = spr.j0;
                    sprVar.H(function2);
                }
                return Unit.f46060a;
            case 8:
                anq0 anq0Var = (anq0) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                int i10 = spr.j0;
                c4m0 c4m0Var = sprVar.i0;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                sprVar.B.getClass();
                sprVar.i0 = sac.T(new fnq(qud.f(anq0Var), new lor(sprVar, yjeVar, (byte) 12), (byte) 4), jiu0.a(sprVar), rpr.h);
                return Unit.f46060a;
            case 9:
                px7 px7Var = (px7) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                jpr jprVar = new jpr(px7Var, (byte) 0);
                int i11 = spr.j0;
                sprVar.H(jprVar);
                return Unit.f46060a;
            case 10:
                bg30 bg30Var = (bg30) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                lpr lprVar = new lpr(bg30Var, (byte) 0);
                int i12 = spr.j0;
                sprVar.H(lprVar);
                return Unit.f46060a;
            case 11:
                List list3 = (List) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var3 = new bo0(list3, (byte) 16);
                int i13 = spr.j0;
                sprVar.H(bo0Var3);
                return Unit.f46060a;
            default:
                anq0 anq0Var2 = (anq0) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                qpr qprVar = new qpr(anq0Var2, (byte) 0);
                int i14 = spr.j0;
                sprVar.H(qprVar);
                return Unit.f46060a;
        }
    }
}
