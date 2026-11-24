package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class c00 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3499a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c00(Object obj, Object obj2, byte b) {
        this.f3499a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:137:0x023c  */
    /* JADX WARN: Code duplicated, block: B:153:0x027f  */
    /* JADX WARN: Code duplicated, block: B:169:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:182:0x0301  */
    /* JADX WARN: Code duplicated, block: B:198:0x0344  */
    /* JADX WARN: Code duplicated, block: B:214:0x0387  */
    /* JADX WARN: Code duplicated, block: B:230:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:246:0x0410  */
    /* JADX WARN: Code duplicated, block: B:259:0x044f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:275:0x0492  */
    /* JADX WARN: Code duplicated, block: B:291:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:307:0x0517  */
    /* JADX WARN: Code duplicated, block: B:323:0x0558  */
    /* JADX WARN: Code duplicated, block: B:339:0x0599  */
    /* JADX WARN: Code duplicated, block: B:355:0x05df  */
    /* JADX WARN: Code duplicated, block: B:371:0x0620  */
    /* JADX WARN: Code duplicated, block: B:387:0x0661  */
    /* JADX WARN: Code duplicated, block: B:403:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:419:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:435:0x0725  */
    /* JADX WARN: Code duplicated, block: B:451:0x0766  */
    /* JADX WARN: Code duplicated, block: B:467:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x016e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) throws Throwable {
        a00 a00Var;
        pz0 pz0Var;
        oo1 oo1Var;
        ii2 ii2Var;
        ki2 ki2Var;
        uj2 uj2Var;
        tn2 tn2Var;
        nc3 nc3Var;
        si3 si3Var;
        gn3 gn3Var;
        jn3 jn3Var;
        do3 do3Var;
        xt3 xt3Var;
        k64 k64Var;
        aq4 aq4Var;
        hs4 hs4Var;
        hu4 hu4Var;
        yu6 yu6Var;
        kz6 kz6Var;
        hh7 hh7Var;
        ku7 ku7Var;
        hr9 hr9Var;
        cqb cqbVar;
        szc szcVar;
        f8d f8dVar;
        q7e q7eVar;
        rze rzeVar;
        x4f x4fVar;
        o5f o5fVar;
        b7f b7fVar;
        byte b = this.f3499a;
        byte b2 = 5;
        byte b3 = 4;
        byte b4 = 6;
        byte b5 = 2;
        byte b6 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        yje yjeVar2 = null;
        byte b7 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof a00) {
                    a00Var = (a00) yjeVar;
                    int i = a00Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        a00Var.j = i - Integer.MIN_VALUE;
                    } else {
                        a00Var = new a00(this, yjeVar);
                    }
                } else {
                    a00Var = new a00(this, yjeVar);
                }
                Object obj3 = a00Var.i;
                wne wneVar = wne.f39444a;
                int i2 = a00Var.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    ua uaVar = new ua(kmqVar, (g00) obj, b2);
                    a00Var.j = 1;
                    if (((gmq) obj2).c(uaVar, a00Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof pz0) {
                    pz0Var = (pz0) yjeVar;
                    int i3 = pz0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pz0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        pz0Var = new pz0(this, yjeVar);
                    }
                } else {
                    pz0Var = new pz0(this, yjeVar);
                }
                Object obj4 = pz0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = pz0Var.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    na naVar = new na(kmqVar, (a01) obj, b7);
                    pz0Var.j = 1;
                    if (((gmq) obj2).c(naVar, pz0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof oo1) {
                    oo1Var = (oo1) yjeVar;
                    int i5 = oo1Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        oo1Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        oo1Var = new oo1(this, yjeVar);
                    }
                } else {
                    oo1Var = new oo1(this, yjeVar);
                }
                Object obj5 = oo1Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = oo1Var.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    na naVar2 = new na(kmqVar, (dp1) obj, b5);
                    oo1Var.j = 1;
                    if (((gmq) obj2).c(naVar2, oo1Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof ii2) {
                    ii2Var = (ii2) yjeVar;
                    int i7 = ii2Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ii2Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        ii2Var = new ii2(this, yjeVar);
                    }
                } else {
                    ii2Var = new ii2(this, yjeVar);
                }
                Object obj6 = ii2Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = ii2Var.j;
                if (i8 == 0) {
                    z1x.P(obj6);
                    na naVar3 = new na(kmqVar, (qi2) obj, (byte) 3);
                    ii2Var.j = 1;
                    if (((a1t) obj2).c(naVar3, ii2Var) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof ki2) {
                    ki2Var = (ki2) yjeVar;
                    int i9 = ki2Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ki2Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        ki2Var = new ki2(this, yjeVar);
                    }
                } else {
                    ki2Var = new ki2(this, yjeVar);
                }
                Object obj7 = ki2Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = ki2Var.j;
                if (i10 == 0) {
                    z1x.P(obj7);
                    ch2 ch2Var = new ch2(kmqVar, (Throwable) obj, b7);
                    ki2Var.j = 1;
                    if (((vsg0) obj2).c(ch2Var, ki2Var) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof uj2) {
                    uj2Var = (uj2) yjeVar;
                    int i11 = uj2Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        uj2Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        uj2Var = new uj2(this, yjeVar);
                    }
                } else {
                    uj2Var = new uj2(this, yjeVar);
                }
                Object obj8 = uj2Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = uj2Var.j;
                if (i12 == 0) {
                    z1x.P(obj8);
                    na naVar4 = new na(kmqVar, (fk2) obj, b3);
                    uj2Var.j = 1;
                    if (((a1t) obj2).c(naVar4, uj2Var) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof tn2) {
                    tn2Var = (tn2) yjeVar;
                    int i13 = tn2Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        tn2Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        tn2Var = new tn2(this, yjeVar);
                    }
                } else {
                    tn2Var = new tn2(this, yjeVar);
                }
                Object obj9 = tn2Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = tn2Var.j;
                if (i14 == 0) {
                    z1x.P(obj9);
                    na naVar5 = new na(kmqVar, (yn2) obj, b2);
                    tn2Var.j = 1;
                    if (((gmq) obj2).c(naVar5, tn2Var) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof nc3) {
                    nc3Var = (nc3) yjeVar;
                    int i15 = nc3Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        nc3Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        nc3Var = new nc3(this, yjeVar);
                    }
                } else {
                    nc3Var = new nc3(this, yjeVar);
                }
                Object obj10 = nc3Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = nc3Var.j;
                if (i16 == 0) {
                    z1x.P(obj10);
                    na naVar6 = new na(kmqVar, (qc3) obj, b4);
                    nc3Var.j = 1;
                    if (((gmq) obj2).c(naVar6, nc3Var) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof si3) {
                    si3Var = (si3) yjeVar;
                    int i17 = si3Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        si3Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        si3Var = new si3(this, yjeVar);
                    }
                } else {
                    si3Var = new si3(this, yjeVar);
                }
                Object obj11 = si3Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = si3Var.j;
                if (i18 == 0) {
                    z1x.P(obj11);
                    gmq[] gmqVarArr = (gmq[]) obj2;
                    ti3 ti3Var = new ti3(gmqVarArr, b6);
                    zo1 zo1Var = new zo1(yjeVar2, (ij3) obj, b3);
                    si3Var.j = 1;
                    if (tdc.G(si3Var, kmqVar, zo1Var, ti3Var, gmqVarArr) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof gn3) {
                    gn3Var = (gn3) yjeVar;
                    int i19 = gn3Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        gn3Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        gn3Var = new gn3(this, yjeVar);
                    }
                } else {
                    gn3Var = new gn3(this, yjeVar);
                }
                Object obj12 = gn3Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = gn3Var.j;
                if (i20 == 0) {
                    z1x.P(obj12);
                    in3 in3Var = new in3(kmqVar, (on3) obj, b6);
                    gn3Var.j = 1;
                    if (((rwk) obj2).c(in3Var, gn3Var) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof jn3) {
                    jn3Var = (jn3) yjeVar;
                    int i21 = jn3Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        jn3Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        jn3Var = new jn3(this, yjeVar);
                    }
                } else {
                    jn3Var = new jn3(this, yjeVar);
                }
                Object obj13 = jn3Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = jn3Var.j;
                if (i22 == 0) {
                    z1x.P(obj13);
                    in3 in3Var2 = new in3(kmqVar, (on3) obj, b7);
                    jn3Var.j = 1;
                    if (((gmq) obj2).c(in3Var2, jn3Var) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof do3) {
                    do3Var = (do3) yjeVar;
                    int i23 = do3Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        do3Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        do3Var = new do3(this, yjeVar);
                    }
                } else {
                    do3Var = new do3(this, yjeVar);
                }
                Object obj14 = do3Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = do3Var.j;
                if (i24 == 0) {
                    z1x.P(obj14);
                    na naVar7 = new na(kmqVar, (fo3) obj, (byte) 7);
                    do3Var.j = 1;
                    if (((gmq) obj2).c(naVar7, do3Var) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof xt3) {
                    xt3Var = (xt3) yjeVar;
                    int i25 = xt3Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        xt3Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        xt3Var = new xt3(this, yjeVar);
                    }
                } else {
                    xt3Var = new xt3(this, yjeVar);
                }
                Object obj15 = xt3Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = xt3Var.j;
                if (i26 == 0) {
                    z1x.P(obj15);
                    na naVar8 = new na(kmqVar, (zu3) obj, (byte) 8);
                    xt3Var.j = 1;
                    if (((ltb) obj2).c(naVar8, xt3Var) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof k64) {
                    k64Var = (k64) yjeVar;
                    int i27 = k64Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        k64Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        k64Var = new k64(this, yjeVar);
                    }
                } else {
                    k64Var = new k64(this, yjeVar);
                }
                Object obj16 = k64Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = k64Var.j;
                if (i28 == 0) {
                    z1x.P(obj16);
                    na naVar9 = new na(kmqVar, (m64) obj, (byte) 10);
                    k64Var.j = 1;
                    if (((gmq) obj2).c(naVar9, k64Var) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof aq4) {
                    aq4Var = (aq4) yjeVar;
                    int i29 = aq4Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        aq4Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        aq4Var = new aq4(this, yjeVar);
                    }
                } else {
                    aq4Var = new aq4(this, yjeVar);
                }
                Object obj17 = aq4Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = aq4Var.j;
                if (i30 != 0) {
                    if (i30 == 1) {
                        z1x.P(obj17);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj17);
                na naVar10 = new na(kmqVar, (cq4) obj, (byte) 11);
                aq4Var.j = 1;
                ((zj2) obj2).c(naVar10, aq4Var);
                return wneVar15;
            case 15:
                if (yjeVar instanceof hs4) {
                    hs4Var = (hs4) yjeVar;
                    int i31 = hs4Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        hs4Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        hs4Var = new hs4(this, yjeVar);
                    }
                } else {
                    hs4Var = new hs4(this, yjeVar);
                }
                Object obj18 = hs4Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = hs4Var.j;
                if (i32 == 0) {
                    z1x.P(obj18);
                    qo3 qo3Var = new qo3(kmqVar, (cge0) obj);
                    hs4Var.j = 1;
                    if (((gmq) obj2).c(qo3Var, hs4Var) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof hu4) {
                    hu4Var = (hu4) yjeVar;
                    int i33 = hu4Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        hu4Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        hu4Var = new hu4(this, yjeVar);
                    }
                } else {
                    hu4Var = new hu4(this, yjeVar);
                }
                Object obj19 = hu4Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = hu4Var.j;
                if (i34 == 0) {
                    z1x.P(obj19);
                    gmq[] gmqVarArr2 = (gmq[]) obj2;
                    pul pulVar = new pul(gmqVarArr2, (byte) 17);
                    zo1 zo1Var2 = new zo1(yjeVar2, (ku4) obj, b4);
                    hu4Var.j = 1;
                    if (tdc.G(hu4Var, kmqVar, zo1Var2, pulVar, gmqVarArr2) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof yu6) {
                    yu6Var = (yu6) yjeVar;
                    int i35 = yu6Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        yu6Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        yu6Var = new yu6(this, yjeVar);
                    }
                } else {
                    yu6Var = new yu6(this, yjeVar);
                }
                Object obj20 = yu6Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = yu6Var.j;
                if (i36 == 0) {
                    z1x.P(obj20);
                    na naVar11 = new na(kmqVar, (chf0) obj, (byte) 12);
                    yu6Var.j = 1;
                    if (((zj2) obj2).c(naVar11, yu6Var) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof kz6) {
                    kz6Var = (kz6) yjeVar;
                    int i37 = kz6Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        kz6Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        kz6Var = new kz6(this, yjeVar);
                    }
                } else {
                    kz6Var = new kz6(this, yjeVar);
                }
                Object obj21 = kz6Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = kz6Var.j;
                if (i38 == 0) {
                    z1x.P(obj21);
                    na naVar12 = new na(kmqVar, (b07) obj, (byte) 13);
                    kz6Var.j = 1;
                    if (((gmq) obj2).c(naVar12, kz6Var) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof hh7) {
                    hh7Var = (hh7) yjeVar;
                    int i39 = hh7Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        hh7Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        hh7Var = new hh7(this, yjeVar);
                    }
                } else {
                    hh7Var = new hh7(this, yjeVar);
                }
                Object obj22 = hh7Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = hh7Var.j;
                if (i40 != 0) {
                    if (i40 == 1) {
                        z1x.P(obj22);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj22);
                na naVar13 = new na(kmqVar, (es) obj, (byte) 14);
                hh7Var.j = 1;
                ((qoj0) obj2).c(naVar13, hh7Var);
                return wneVar20;
            case 20:
                if (yjeVar instanceof ku7) {
                    ku7Var = (ku7) yjeVar;
                    int i41 = ku7Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        ku7Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        ku7Var = new ku7(this, yjeVar);
                    }
                } else {
                    ku7Var = new ku7(this, yjeVar);
                }
                Object obj23 = ku7Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = ku7Var.j;
                if (i42 == 0) {
                    z1x.P(obj23);
                    na naVar14 = new na(kmqVar, (agk0) obj, (byte) 15);
                    ku7Var.j = 1;
                    if (((vsg0) obj2).c(naVar14, ku7Var) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof hr9) {
                    hr9Var = (hr9) yjeVar;
                    int i43 = hr9Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        hr9Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        hr9Var = new hr9(this, yjeVar);
                    }
                } else {
                    hr9Var = new hr9(this, yjeVar);
                }
                Object obj24 = hr9Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = hr9Var.j;
                if (i44 == 0) {
                    z1x.P(obj24);
                    na naVar15 = new na(kmqVar, (mr9) obj, (byte) 16);
                    hr9Var.j = 1;
                    if (((gmq) obj2).c(naVar15, hr9Var) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof cqb) {
                    cqbVar = (cqb) yjeVar;
                    int i45 = cqbVar.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        cqbVar.j = i45 - Integer.MIN_VALUE;
                    } else {
                        cqbVar = new cqb(this, yjeVar);
                    }
                } else {
                    cqbVar = new cqb(this, yjeVar);
                }
                Object obj25 = cqbVar.i;
                wne wneVar23 = wne.f39444a;
                int i46 = cqbVar.j;
                if (i46 == 0) {
                    z1x.P(obj25);
                    na naVar16 = new na(kmqVar, (p6a) obj, (byte) 20);
                    cqbVar.j = 1;
                    if (((p5a) obj2).c(naVar16, cqbVar) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj25);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof szc) {
                    szcVar = (szc) yjeVar;
                    int i47 = szcVar.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        szcVar.j = i47 - Integer.MIN_VALUE;
                    } else {
                        szcVar = new szc(this, yjeVar);
                    }
                } else {
                    szcVar = new szc(this, yjeVar);
                }
                Object obj26 = szcVar.i;
                wne wneVar24 = wne.f39444a;
                int i48 = szcVar.j;
                if (i48 == 0) {
                    z1x.P(obj26);
                    na naVar17 = new na(kmqVar, (uzc) obj, (byte) 22);
                    szcVar.j = 1;
                    if (((ltb) obj2).c(naVar17, szcVar) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (i48 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj26);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof f8d) {
                    f8dVar = (f8d) yjeVar;
                    int i49 = f8dVar.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        f8dVar.j = i49 - Integer.MIN_VALUE;
                    } else {
                        f8dVar = new f8d(this, yjeVar);
                    }
                } else {
                    f8dVar = new f8d(this, yjeVar);
                }
                Object obj27 = f8dVar.i;
                wne wneVar25 = wne.f39444a;
                int i50 = f8dVar.j;
                if (i50 == 0) {
                    z1x.P(obj27);
                    gmq[] gmqVarArr3 = (gmq[]) obj2;
                    ti3 ti3Var2 = new ti3(gmqVarArr3, b5);
                    zo1 zo1Var3 = new zo1(yjeVar2, obj, (byte) 9);
                    f8dVar.j = 1;
                    if (tdc.G(f8dVar, kmqVar, zo1Var3, ti3Var2, gmqVarArr3) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (i50 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj27);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof q7e) {
                    q7eVar = (q7e) yjeVar;
                    int i51 = q7eVar.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        q7eVar.j = i51 - Integer.MIN_VALUE;
                    } else {
                        q7eVar = new q7e(this, yjeVar);
                    }
                } else {
                    q7eVar = new q7e(this, yjeVar);
                }
                Object obj28 = q7eVar.i;
                wne wneVar26 = wne.f39444a;
                int i52 = q7eVar.j;
                if (i52 == 0) {
                    z1x.P(obj28);
                    s7e s7eVar = new s7e(kmqVar, (g45) obj, b6);
                    q7eVar.j = 1;
                    if (((gmq) obj2).c(s7eVar, q7eVar) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (i52 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof rze) {
                    rzeVar = (rze) yjeVar;
                    int i53 = rzeVar.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        rzeVar.j = i53 - Integer.MIN_VALUE;
                    } else {
                        rzeVar = new rze(this, yjeVar);
                    }
                } else {
                    rzeVar = new rze(this, yjeVar);
                }
                Object obj29 = rzeVar.i;
                wne wneVar27 = wne.f39444a;
                int i54 = rzeVar.j;
                if (i54 == 0) {
                    z1x.P(obj29);
                    na naVar18 = new na(kmqVar, (wze) obj, (byte) 24);
                    rzeVar.j = 1;
                    if (((gmq) obj2).c(naVar18, rzeVar) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (i54 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj29);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof x4f) {
                    x4fVar = (x4f) yjeVar;
                    int i55 = x4fVar.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        x4fVar.j = i55 - Integer.MIN_VALUE;
                    } else {
                        x4fVar = new x4f(this, yjeVar);
                    }
                } else {
                    x4fVar = new x4f(this, yjeVar);
                }
                Object obj30 = x4fVar.i;
                wne wneVar28 = wne.f39444a;
                int i56 = x4fVar.j;
                if (i56 == 0) {
                    z1x.P(obj30);
                    z4f z4fVar = new z4f(kmqVar, (r7f) obj, b6);
                    x4fVar.j = 1;
                    if (((i89) obj2).c(z4fVar, x4fVar) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (i56 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj30);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof o5f) {
                    o5fVar = (o5f) yjeVar;
                    int i57 = o5fVar.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        o5fVar.j = i57 - Integer.MIN_VALUE;
                    } else {
                        o5fVar = new o5f(this, yjeVar);
                    }
                } else {
                    o5fVar = new o5f(this, yjeVar);
                }
                Object obj31 = o5fVar.i;
                wne wneVar29 = wne.f39444a;
                int i58 = o5fVar.j;
                if (i58 == 0) {
                    z1x.P(obj31);
                    z4f z4fVar2 = new z4f(kmqVar, (r7f) obj, b7);
                    o5fVar.j = 1;
                    if (((xae0) obj2).f40549a.c(z4fVar2, o5fVar) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (i58 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj31);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof b7f) {
                    b7fVar = (b7f) yjeVar;
                    int i59 = b7fVar.j;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        b7fVar.j = i59 - Integer.MIN_VALUE;
                    } else {
                        b7fVar = new b7f(this, yjeVar);
                    }
                } else {
                    b7fVar = new b7f(this, yjeVar);
                }
                Object obj32 = b7fVar.i;
                wne wneVar30 = wne.f39444a;
                int i60 = b7fVar.j;
                if (i60 == 0) {
                    z1x.P(obj32);
                    z4f z4fVar3 = new z4f(kmqVar, (r7f) obj, b5);
                    b7fVar.j = 1;
                    if (((gmq) obj2).c(z4fVar3, b7fVar) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (i60 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj32);
                }
                return Unit.f46060a;
        }
    }
}
