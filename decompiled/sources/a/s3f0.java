package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class s3f0 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31555a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ List f;
    public final /* synthetic */ Object g;

    public s3f0(a4x a4xVar, float f, Map map, Function1 function1, float f2, pz40 pz40Var) {
        this.f = a4xVar;
        this.b = f;
        this.c = map;
        this.d = function1;
        this.e = f2;
        this.g = pz40Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0166  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:111:0x017b  */
    /* JADX WARN: Code duplicated, block: B:113:0x017f  */
    /* JADX WARN: Code duplicated, block: B:114:0x019f  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:123:0x021f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0223  */
    /* JADX WARN: Code duplicated, block: B:126:0x0247  */
    /* JADX WARN: Code duplicated, block: B:128:0x024b  */
    /* JADX WARN: Code duplicated, block: B:129:0x026f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0273  */
    /* JADX WARN: Code duplicated, block: B:132:0x0283  */
    /* JADX WARN: Code duplicated, block: B:134:0x0287  */
    /* JADX WARN: Code duplicated, block: B:135:0x0296  */
    /* JADX WARN: Code duplicated, block: B:137:0x029a  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:141:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:143:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:252:0x0418  */
    /* JADX WARN: Code duplicated, block: B:253:0x041b  */
    /* JADX WARN: Code duplicated, block: B:255:0x041f  */
    /* JADX WARN: Code duplicated, block: B:256:0x044b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0451  */
    /* JADX WARN: Code duplicated, block: B:259:0x0461  */
    /* JADX WARN: Code duplicated, block: B:261:0x0465  */
    /* JADX WARN: Code duplicated, block: B:262:0x0485  */
    /* JADX WARN: Code duplicated, block: B:264:0x048b  */
    /* JADX WARN: Code duplicated, block: B:265:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:267:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:268:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:270:0x04db  */
    /* JADX WARN: Code duplicated, block: B:271:0x0505  */
    /* JADX WARN: Code duplicated, block: B:273:0x050b  */
    /* JADX WARN: Code duplicated, block: B:274:0x052f  */
    /* JADX WARN: Code duplicated, block: B:276:0x0533  */
    /* JADX WARN: Code duplicated, block: B:277:0x0557  */
    /* JADX WARN: Code duplicated, block: B:279:0x055b  */
    /* JADX WARN: Code duplicated, block: B:280:0x056b  */
    /* JADX WARN: Code duplicated, block: B:282:0x056f  */
    /* JADX WARN: Code duplicated, block: B:283:0x057f  */
    /* JADX WARN: Code duplicated, block: B:285:0x0583  */
    /* JADX WARN: Code duplicated, block: B:286:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:288:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:289:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:291:0x05c8  */
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object obj5;
        float f;
        Object objP;
        cl5 cl5Var;
        jm40 jm40Var;
        mm40 mm40Var;
        fet fetVar;
        boolean z;
        float f2;
        int i2;
        float f3;
        jm40 jm40Var2;
        float f4;
        mm40 mm40VarL;
        fet fetVar2;
        byte b = this.f31555a;
        Object obj6 = this.g;
        List list = this.f;
        boolean z2 = true;
        Map map = this.c;
        Function1 function1 = this.d;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar3.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(i & 1, (i & 147) != 146)) {
                    z0f0 z0f0Var = (z0f0) list.get(iIntValue);
                    fetVar3.e0(-598299648);
                    obj5 = iIntValue > 0 ? (z0f0) CollectionsKt.W(iIntValue - 1, (List) obj6) : null;
                    boolean z3 = iIntValue == 0;
                    boolean z4 = (z0f0Var instanceof jzj0) || (z0f0Var instanceof m9q0) || (z0f0Var instanceof yl90) || (z0f0Var instanceof rfc0) || (z0f0Var instanceof m090) || (z0f0Var instanceof fgt) || (z0f0Var instanceof upa0) || (z0f0Var instanceof ie8) || (z0f0Var instanceof hjk0);
                    boolean z5 = (z0f0Var instanceof tzb) || (z0f0Var instanceof o02);
                    if (obj5 == null || (!(obj5 instanceof jzj0) && !(obj5 instanceof m9q0) && !(obj5 instanceof rfc0) && !(obj5 instanceof yl90) && !(obj5 instanceof m090) && !(obj5 instanceof r090) && !(obj5 instanceof ksn) && !(obj5 instanceof fgt) && !(obj5 instanceof upa0) && !(obj5 instanceof ie8) && !(obj5 instanceof hjk0))) {
                        z2 = false;
                    }
                    if (z3) {
                        zcl zclVar = qmk.f28987a;
                    } else {
                        if ((z0f0Var instanceof r090) || (z0f0Var instanceof ksn)) {
                            zcl zclVar2 = qmk.f28987a;
                            f = 24.0f;
                        } else if ((z5 && z2) || z4) {
                            zcl zclVar3 = qmk.f28987a;
                        } else if (z5) {
                            zcl zclVar4 = qmk.f28987a;
                            f = 4.0f;
                        } else {
                            zcl zclVar5 = qmk.f28987a;
                            f = 0.0f;
                        }
                        objP = fetVar3.P();
                        cl5Var = ukd.f35823a;
                        jm40Var = jm40.b;
                        if (objP == cl5Var) {
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            float f5 = this.e;
                            objP = s5x0.N(mm40VarD, f5, f, f5, 0.0f, 8);
                            fetVar3.o0(objP);
                        }
                        mm40Var = (mm40) objP;
                        if (z0f0Var == null) {
                            fetVar = fetVar3;
                        } else {
                            if (z0f0Var instanceof jzj0) {
                                fetVar3.e0(-296380105);
                                uvw.k(zvw.z(fetVar3, mm40Var), (jzj0) z0f0Var, (cqq) map.get(z0f0Var.getKey()), this.d, fetVar3, 0);
                                fetVar = fetVar3;
                                fetVar.r(false);
                            } else {
                                fetVar = fetVar3;
                                if (z0f0Var instanceof m9q0) {
                                    fetVar.e0(-296369494);
                                    j5n0.k(mm40Var, (m9q0) z0f0Var, function1, fetVar, 6);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof tzb) {
                                    fetVar.e0(-296362155);
                                    float f6 = this.b;
                                    qzb.c(s5x0.N(jm40Var, f6, f, f6, 0.0f, 8), (tzb) z0f0Var, function1, fetVar, 0);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof o02) {
                                    fetVar.e0(-296349482);
                                    float f7 = this.b;
                                    xia0.d(s5x0.N(jm40Var, f7, f, f7, 0.0f, 8), (o02) z0f0Var, function1, fetVar, 0);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof rfc0) {
                                    fetVar.e0(-296336714);
                                    vvw.h(zvw.z(fetVar, mm40Var), (rfc0) z0f0Var, (cqq) map.get(z0f0Var.getKey()), this.d, fetVar, 0);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof m090) {
                                    fetVar.e0(-296326095);
                                    wdx.r(zvw.z(fetVar, mm40Var), (m090) z0f0Var, (cqq) map.get(z0f0Var.getKey()), this.d, fetVar, 0);
                                    fetVar.r(false);
                                } else {
                                    z = z0f0Var instanceof r090;
                                    f2 = this.e;
                                    if (z) {
                                        fetVar.e0(-296315193);
                                        zdx.i(o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), f2, 0.0f, 2), 1.0f), (r090) z0f0Var, function1, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (z0f0Var instanceof ksn) {
                                        fetVar.e0(-296302823);
                                        jcb.p(o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), f2, 0.0f, 2), 1.0f), (ksn) z0f0Var, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (z0f0Var instanceof fgt) {
                                        fetVar.e0(-296292286);
                                        vcc.o(mm40Var, (fgt) z0f0Var, function1, fetVar, 6);
                                        fetVar.r(false);
                                    } else if (z0f0Var instanceof upa0) {
                                        fetVar.e0(-296284910);
                                        k7x.l(mm40Var, (upa0) z0f0Var, function1, fetVar, 6);
                                        fetVar.r(false);
                                    } else if (z0f0Var instanceof ie8) {
                                        fetVar.e0(-296276147);
                                        tke.k(o7k0.d(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), 1.0f), (ie8) z0f0Var, u1c.M(-2066784872, new wyl0(function1, (byte) 5), fetVar), fetVar, 384);
                                        fetVar.r(false);
                                    } else if (z0f0Var instanceof hjk0) {
                                        fetVar.e0(-296224252);
                                        vvw.l(mm40Var, (hjk0) z0f0Var, function1, fetVar, 6);
                                        fetVar.r(false);
                                    } else if (z0f0Var instanceof yl90) {
                                        fetVar.e0(-296217258);
                                        a8k0.g(zvw.z(fetVar, mm40Var), (yl90) z0f0Var, (cqq) map.get(z0f0Var.getKey()), this.d, fetVar, 0);
                                        fetVar.r(false);
                                    }
                                }
                            }
                            fetVar.r(false);
                        }
                        fetVar.e0(-592505780);
                        fetVar.r(false);
                        fetVar.r(false);
                    }
                    f = 12.0f;
                    objP = fetVar3.P();
                    cl5Var = ukd.f35823a;
                    jm40Var = jm40.b;
                    if (objP == cl5Var) {
                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                        float f8 = this.e;
                        objP = s5x0.N(mm40VarD2, f8, f, f8, 0.0f, 8);
                        fetVar3.o0(objP);
                    }
                    mm40Var = (mm40) objP;
                    if (z0f0Var == null) {
                        fetVar = fetVar3;
                    } else {
                        if (z0f0Var instanceof jzj0) {
                            fetVar3.e0(-296380105);
                            uvw.k(zvw.z(fetVar3, mm40Var), (jzj0) z0f0Var, (cqq) map.get(z0f0Var.getKey()), this.d, fetVar3, 0);
                            fetVar = fetVar3;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar3;
                            if (z0f0Var instanceof m9q0) {
                                fetVar.e0(-296369494);
                                j5n0.k(mm40Var, (m9q0) z0f0Var, function1, fetVar, 6);
                                fetVar.r(false);
                            } else if (z0f0Var instanceof tzb) {
                                fetVar.e0(-296362155);
                                float f9 = this.b;
                                qzb.c(s5x0.N(jm40Var, f9, f, f9, 0.0f, 8), (tzb) z0f0Var, function1, fetVar, 0);
                                fetVar.r(false);
                            } else if (z0f0Var instanceof o02) {
                                fetVar.e0(-296349482);
                                float f10 = this.b;
                                xia0.d(s5x0.N(jm40Var, f10, f, f10, 0.0f, 8), (o02) z0f0Var, function1, fetVar, 0);
                                fetVar.r(false);
                            } else if (z0f0Var instanceof rfc0) {
                                fetVar.e0(-296336714);
                                vvw.h(zvw.z(fetVar, mm40Var), (rfc0) z0f0Var, (cqq) map.get(z0f0Var.getKey()), this.d, fetVar, 0);
                                fetVar.r(false);
                            } else if (z0f0Var instanceof m090) {
                                fetVar.e0(-296326095);
                                wdx.r(zvw.z(fetVar, mm40Var), (m090) z0f0Var, (cqq) map.get(z0f0Var.getKey()), this.d, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                z = z0f0Var instanceof r090;
                                f2 = this.e;
                                if (z) {
                                    fetVar.e0(-296315193);
                                    zdx.i(o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), f2, 0.0f, 2), 1.0f), (r090) z0f0Var, function1, fetVar, 0);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof ksn) {
                                    fetVar.e0(-296302823);
                                    jcb.p(o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), f2, 0.0f, 2), 1.0f), (ksn) z0f0Var, fetVar, 0);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof fgt) {
                                    fetVar.e0(-296292286);
                                    vcc.o(mm40Var, (fgt) z0f0Var, function1, fetVar, 6);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof upa0) {
                                    fetVar.e0(-296284910);
                                    k7x.l(mm40Var, (upa0) z0f0Var, function1, fetVar, 6);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof ie8) {
                                    fetVar.e0(-296276147);
                                    tke.k(o7k0.d(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), 1.0f), (ie8) z0f0Var, u1c.M(-2066784872, new wyl0(function1, (byte) 5), fetVar), fetVar, 384);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof hjk0) {
                                    fetVar.e0(-296224252);
                                    vvw.l(mm40Var, (hjk0) z0f0Var, function1, fetVar, 6);
                                    fetVar.r(false);
                                } else if (z0f0Var instanceof yl90) {
                                    fetVar.e0(-296217258);
                                    a8k0.g(zvw.z(fetVar, mm40Var), (yl90) z0f0Var, (cqq) map.get(z0f0Var.getKey()), this.d, fetVar, 0);
                                    fetVar.r(false);
                                }
                            }
                        }
                        fetVar.r(false);
                    }
                    fetVar.e0(-592505780);
                    fetVar.r(false);
                    fetVar.r(false);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar4.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
                    x0f0 x0f0Var = (x0f0) ((a4x) list).get(iIntValue3);
                    fetVar4.e0(1620167393);
                    obj5 = iIntValue3 > 0 ? (x0f0) CollectionsKt.W(iIntValue3 - 1, (a4x) ((pz40) obj6).getValue()) : null;
                    boolean z6 = iIntValue3 == 0;
                    boolean z7 = (x0f0Var instanceof hzj0) || (x0f0Var instanceof k9q0) || (x0f0Var instanceof vl90) || (x0f0Var instanceof pfc0) || (x0f0Var instanceof k090) || (x0f0Var instanceof dgt) || (x0f0Var instanceof spa0) || (x0f0Var instanceof ge8) || (x0f0Var instanceof fjk0);
                    boolean z8 = (x0f0Var instanceof rzb) || (x0f0Var instanceof m02);
                    if (obj5 == null || (!(obj5 instanceof hzj0) && !(obj5 instanceof k9q0) && !(obj5 instanceof pfc0) && !(obj5 instanceof vl90) && !(obj5 instanceof k090) && !(obj5 instanceof p090) && !(obj5 instanceof isn) && !(obj5 instanceof dgt) && !(obj5 instanceof spa0) && !(obj5 instanceof ge8) && !(obj5 instanceof fjk0))) {
                        z2 = false;
                    }
                    if (z6) {
                        zcl zclVar6 = qmk.f28987a;
                    } else {
                        if ((x0f0Var instanceof p090) || (x0f0Var instanceof isn)) {
                            zcl zclVar7 = qmk.f28987a;
                            f3 = 24.0f;
                        } else if ((z8 && z2) || z7) {
                            zcl zclVar8 = qmk.f28987a;
                        } else if (z8) {
                            zcl zclVar9 = qmk.f28987a;
                            f3 = 4.0f;
                        } else {
                            zcl zclVar10 = qmk.f28987a;
                            f3 = 0.0f;
                        }
                        jm40Var2 = jm40.b;
                        mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var2, 1.0f), 0.0f, f3, 0.0f, 0.0f, 13);
                        f4 = this.b;
                        mm40VarL = s5x0.L(mm40VarN, f4, 0.0f, 2);
                        if (x0f0Var == null) {
                            fetVar2 = fetVar4;
                        } else {
                            if (x0f0Var instanceof hzj0) {
                                fetVar4.e0(1991940330);
                                tfx.n(bww.z(fetVar4, mm40VarL), (hzj0) x0f0Var, (cqq) map.get(x0f0Var.getKey()), this.d, fetVar4, 0);
                                fetVar2 = fetVar4;
                                fetVar2.r(false);
                            } else {
                                fetVar2 = fetVar4;
                                if (x0f0Var instanceof k9q0) {
                                    fetVar2.e0(1991951581);
                                    a4n0.a(mm40VarL, (k9q0) x0f0Var, function1, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof rzb) {
                                    fetVar2.e0(1991959576);
                                    float f11 = this.e;
                                    ozb.e(s5x0.N(jm40Var2, f11, f3, f11, 0.0f, 8), (rzb) x0f0Var, function1, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof m02) {
                                    fetVar2.e0(1991973401);
                                    float f12 = this.e;
                                    wha0.d(s5x0.N(jm40Var2, f12, f3, f12, 0.0f, 8), (m02) x0f0Var, function1, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof pfc0) {
                                    fetVar2.e0(1991987309);
                                    ufx.m(bww.z(fetVar2, mm40VarL), (pfc0) x0f0Var, (cqq) map.get(x0f0Var.getKey()), this.d, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof k090) {
                                    fetVar2.e0(1991998696);
                                    idx.i(bww.z(fetVar2, mm40VarL), (k090) x0f0Var, (cqq) map.get(x0f0Var.getKey()), this.d, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof p090) {
                                    fetVar2.e0(1992010374);
                                    xdx.g(o7k0.d(s5x0.L(s5x0.N(jm40Var2, 0.0f, f3, 0.0f, 0.0f, 13), f4, 0.0f, 2), 1.0f), (p090) x0f0Var, function1, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof isn) {
                                    fetVar2.e0(1992023764);
                                    obb.v(o7k0.d(s5x0.L(s5x0.N(jm40Var2, 0.0f, f3, 0.0f, 0.0f, 13), f4, 0.0f, 2), 1.0f), (isn) x0f0Var, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof dgt) {
                                    fetVar2.e0(1992035189);
                                    xbc.y(mm40VarL, (dgt) x0f0Var, function1, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof spa0) {
                                    fetVar2.e0(1992043205);
                                    d7x.g(mm40VarL, (spa0) x0f0Var, function1, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof ge8) {
                                    fetVar2.e0(1992051156);
                                    j2e.j(mm40VarL, (ge8) x0f0Var, function1, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof fjk0) {
                                    fetVar2.e0(1992058679);
                                    ufx.o(mm40VarL, (fjk0) x0f0Var, function1, fetVar2, 0);
                                    fetVar2.r(false);
                                } else if (x0f0Var instanceof vl90) {
                                    fetVar2.e0(1992066309);
                                    r7x.f(bww.z(fetVar2, mm40VarL), (vl90) x0f0Var, (cqq) map.get(x0f0Var.getKey()), this.d, fetVar2, 0);
                                    fetVar2.r(false);
                                }
                            }
                            fetVar2.r(false);
                        }
                        fetVar2.e0(1624819593);
                        fetVar2.r(false);
                        fetVar2.r(false);
                    }
                    f3 = 12.0f;
                    jm40Var2 = jm40.b;
                    mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var2, 1.0f), 0.0f, f3, 0.0f, 0.0f, 13);
                    f4 = this.b;
                    mm40VarL = s5x0.L(mm40VarN2, f4, 0.0f, 2);
                    if (x0f0Var == null) {
                        fetVar2 = fetVar4;
                    } else {
                        if (x0f0Var instanceof hzj0) {
                            fetVar4.e0(1991940330);
                            tfx.n(bww.z(fetVar4, mm40VarL), (hzj0) x0f0Var, (cqq) map.get(x0f0Var.getKey()), this.d, fetVar4, 0);
                            fetVar2 = fetVar4;
                            fetVar2.r(false);
                        } else {
                            fetVar2 = fetVar4;
                            if (x0f0Var instanceof k9q0) {
                                fetVar2.e0(1991951581);
                                a4n0.a(mm40VarL, (k9q0) x0f0Var, function1, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof rzb) {
                                fetVar2.e0(1991959576);
                                float f13 = this.e;
                                ozb.e(s5x0.N(jm40Var2, f13, f3, f13, 0.0f, 8), (rzb) x0f0Var, function1, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof m02) {
                                fetVar2.e0(1991973401);
                                float f14 = this.e;
                                wha0.d(s5x0.N(jm40Var2, f14, f3, f14, 0.0f, 8), (m02) x0f0Var, function1, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof pfc0) {
                                fetVar2.e0(1991987309);
                                ufx.m(bww.z(fetVar2, mm40VarL), (pfc0) x0f0Var, (cqq) map.get(x0f0Var.getKey()), this.d, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof k090) {
                                fetVar2.e0(1991998696);
                                idx.i(bww.z(fetVar2, mm40VarL), (k090) x0f0Var, (cqq) map.get(x0f0Var.getKey()), this.d, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof p090) {
                                fetVar2.e0(1992010374);
                                xdx.g(o7k0.d(s5x0.L(s5x0.N(jm40Var2, 0.0f, f3, 0.0f, 0.0f, 13), f4, 0.0f, 2), 1.0f), (p090) x0f0Var, function1, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof isn) {
                                fetVar2.e0(1992023764);
                                obb.v(o7k0.d(s5x0.L(s5x0.N(jm40Var2, 0.0f, f3, 0.0f, 0.0f, 13), f4, 0.0f, 2), 1.0f), (isn) x0f0Var, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof dgt) {
                                fetVar2.e0(1992035189);
                                xbc.y(mm40VarL, (dgt) x0f0Var, function1, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof spa0) {
                                fetVar2.e0(1992043205);
                                d7x.g(mm40VarL, (spa0) x0f0Var, function1, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof ge8) {
                                fetVar2.e0(1992051156);
                                j2e.j(mm40VarL, (ge8) x0f0Var, function1, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof fjk0) {
                                fetVar2.e0(1992058679);
                                ufx.o(mm40VarL, (fjk0) x0f0Var, function1, fetVar2, 0);
                                fetVar2.r(false);
                            } else if (x0f0Var instanceof vl90) {
                                fetVar2.e0(1992066309);
                                r7x.f(bww.z(fetVar2, mm40VarL), (vl90) x0f0Var, (cqq) map.get(x0f0Var.getKey()), this.d, fetVar2, 0);
                                fetVar2.r(false);
                            }
                        }
                        fetVar2.r(false);
                    }
                    fetVar2.e0(1624819593);
                    fetVar2.r(false);
                    fetVar2.r(false);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public s3f0(List list, List list2, Map map, Function1 function1, float f, float f2) {
        this.f = list;
        this.g = list2;
        this.c = map;
        this.d = function1;
        this.b = f;
        this.e = f2;
    }
}
