package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class qaf0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28393a;
    public final /* synthetic */ gmq b;

    public /* synthetic */ qaf0(gmq gmqVar, byte b) {
        this.f28393a = b;
        this.b = gmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0196  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:137:0x0213  */
    /* JADX WARN: Code duplicated, block: B:153:0x0252  */
    /* JADX WARN: Code duplicated, block: B:169:0x0291  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:201:0x030d  */
    /* JADX WARN: Code duplicated, block: B:217:0x034c  */
    /* JADX WARN: Code duplicated, block: B:233:0x038b  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:265:0x0407  */
    /* JADX WARN: Code duplicated, block: B:281:0x0446  */
    /* JADX WARN: Code duplicated, block: B:297:0x0483  */
    /* JADX WARN: Code duplicated, block: B:313:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:329:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:73:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0159  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        oaf0 oaf0Var;
        raf0 raf0Var;
        p5j0 p5j0Var;
        s5j0 s5j0Var;
        boj0 boj0Var;
        ajk0 ajk0Var;
        t8l0 t8l0Var;
        ibl0 ibl0Var;
        kbl0 kbl0Var;
        xbl0 xbl0Var;
        ecl0 ecl0Var;
        ldl0 ldl0Var;
        osl0 osl0Var;
        qsl0 qsl0Var;
        lbn0 lbn0Var;
        hkn0 hkn0Var;
        srp0 srp0Var;
        qnt0 qnt0Var;
        e7u0 e7u0Var;
        vyv0 vyv0Var;
        ozv0 ozv0Var;
        byte b = this.f28393a;
        byte b2 = 17;
        byte b3 = 18;
        byte b4 = 24;
        byte b5 = 6;
        gmq gmqVar = this.b;
        byte b6 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof oaf0) {
                    oaf0Var = (oaf0) yjeVar;
                    int i = oaf0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oaf0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        oaf0Var = new oaf0(this, yjeVar);
                    }
                } else {
                    oaf0Var = new oaf0(this, yjeVar);
                }
                Object obj = oaf0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = oaf0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    hbb0 hbb0Var = new hbb0(kmqVar, b2);
                    oaf0Var.j = 1;
                    if (gmqVar.c(hbb0Var, oaf0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof raf0) {
                    raf0Var = (raf0) yjeVar;
                    int i3 = raf0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        raf0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        raf0Var = new raf0(this, yjeVar);
                    }
                } else {
                    raf0Var = new raf0(this, yjeVar);
                }
                Object obj2 = raf0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = raf0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    hbb0 hbb0Var2 = new hbb0(kmqVar, b3);
                    raf0Var.j = 1;
                    if (gmqVar.c(hbb0Var2, raf0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof p5j0) {
                    p5j0Var = (p5j0) yjeVar;
                    int i5 = p5j0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        p5j0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        p5j0Var = new p5j0(this, yjeVar);
                    }
                } else {
                    p5j0Var = new p5j0(this, yjeVar);
                }
                Object obj3 = p5j0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = p5j0Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    r5j0 r5j0Var = new r5j0(kmqVar, (byte) 0);
                    p5j0Var.j = 1;
                    if (gmqVar.c(r5j0Var, p5j0Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof s5j0) {
                    s5j0Var = (s5j0) yjeVar;
                    int i7 = s5j0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        s5j0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        s5j0Var = new s5j0(this, yjeVar);
                    }
                } else {
                    s5j0Var = new s5j0(this, yjeVar);
                }
                Object obj4 = s5j0Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = s5j0Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    r5j0 r5j0Var2 = new r5j0(kmqVar, b6);
                    s5j0Var.j = 1;
                    if (gmqVar.c(r5j0Var2, s5j0Var) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof boj0) {
                    boj0Var = (boj0) yjeVar;
                    int i9 = boj0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        boj0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        boj0Var = new boj0(this, yjeVar);
                    }
                } else {
                    boj0Var = new boj0(this, yjeVar);
                }
                Object obj5 = boj0Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = boj0Var.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    r5j0 r5j0Var3 = new r5j0(kmqVar, (byte) 11);
                    boj0Var.j = 1;
                    if (gmqVar.c(r5j0Var3, boj0Var) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof ajk0) {
                    ajk0Var = (ajk0) yjeVar;
                    int i11 = ajk0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ajk0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        ajk0Var = new ajk0(this, yjeVar);
                    }
                } else {
                    ajk0Var = new ajk0(this, yjeVar);
                }
                Object obj6 = ajk0Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = ajk0Var.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    r5j0 r5j0Var4 = new r5j0(kmqVar, b2);
                    ajk0Var.j = 1;
                    if (gmqVar.c(r5j0Var4, ajk0Var) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof t8l0) {
                    t8l0Var = (t8l0) yjeVar;
                    int i13 = t8l0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        t8l0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        t8l0Var = new t8l0(this, yjeVar);
                    }
                } else {
                    t8l0Var = new t8l0(this, yjeVar);
                }
                Object obj7 = t8l0Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = t8l0Var.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    r5j0 r5j0Var5 = new r5j0(kmqVar, (byte) 21);
                    t8l0Var.j = 1;
                    if (gmqVar.c(r5j0Var5, t8l0Var) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof ibl0) {
                    ibl0Var = (ibl0) yjeVar;
                    int i15 = ibl0Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ibl0Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        ibl0Var = new ibl0(this, yjeVar);
                    }
                } else {
                    ibl0Var = new ibl0(this, yjeVar);
                }
                Object obj8 = ibl0Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = ibl0Var.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    r5j0 r5j0Var6 = new r5j0(kmqVar, (byte) 22);
                    ibl0Var.j = 1;
                    if (gmqVar.c(r5j0Var6, ibl0Var) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof kbl0) {
                    kbl0Var = (kbl0) yjeVar;
                    int i17 = kbl0Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        kbl0Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        kbl0Var = new kbl0(this, yjeVar);
                    }
                } else {
                    kbl0Var = new kbl0(this, yjeVar);
                }
                Object obj9 = kbl0Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = kbl0Var.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    r5j0 r5j0Var7 = new r5j0(kmqVar, (byte) 23);
                    kbl0Var.j = 1;
                    if (gmqVar.c(r5j0Var7, kbl0Var) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof xbl0) {
                    xbl0Var = (xbl0) yjeVar;
                    int i19 = xbl0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        xbl0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        xbl0Var = new xbl0(this, yjeVar);
                    }
                } else {
                    xbl0Var = new xbl0(this, yjeVar);
                }
                Object obj10 = xbl0Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = xbl0Var.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    r5j0 r5j0Var8 = new r5j0(kmqVar, b4);
                    xbl0Var.j = 1;
                    if (gmqVar.c(r5j0Var8, xbl0Var) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof ecl0) {
                    ecl0Var = (ecl0) yjeVar;
                    int i21 = ecl0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ecl0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        ecl0Var = new ecl0(this, yjeVar);
                    }
                } else {
                    ecl0Var = new ecl0(this, yjeVar);
                }
                Object obj11 = ecl0Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = ecl0Var.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    r5j0 r5j0Var9 = new r5j0(kmqVar, (byte) 25);
                    ecl0Var.j = 1;
                    if (gmqVar.c(r5j0Var9, ecl0Var) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof ldl0) {
                    ldl0Var = (ldl0) yjeVar;
                    int i23 = ldl0Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ldl0Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        ldl0Var = new ldl0(this, yjeVar);
                    }
                } else {
                    ldl0Var = new ldl0(this, yjeVar);
                }
                Object obj12 = ldl0Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = ldl0Var.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    r5j0 r5j0Var10 = new r5j0(kmqVar, (byte) 26);
                    ldl0Var.j = 1;
                    if (gmqVar.c(r5j0Var10, ldl0Var) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof osl0) {
                    osl0Var = (osl0) yjeVar;
                    int i25 = osl0Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        osl0Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        osl0Var = new osl0(this, yjeVar);
                    }
                } else {
                    osl0Var = new osl0(this, yjeVar);
                }
                Object obj13 = osl0Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = osl0Var.j;
                if (i26 == 0) {
                    z1x.P(obj13);
                    r5j0 r5j0Var11 = new r5j0(kmqVar, (byte) 28);
                    osl0Var.j = 1;
                    if (gmqVar.c(r5j0Var11, osl0Var) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof qsl0) {
                    qsl0Var = (qsl0) yjeVar;
                    int i27 = qsl0Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        qsl0Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        qsl0Var = new qsl0(this, yjeVar);
                    }
                } else {
                    qsl0Var = new qsl0(this, yjeVar);
                }
                Object obj14 = qsl0Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = qsl0Var.j;
                if (i28 == 0) {
                    z1x.P(obj14);
                    r5j0 r5j0Var12 = new r5j0(kmqVar, (byte) 29);
                    qsl0Var.j = 1;
                    if (gmqVar.c(r5j0Var12, qsl0Var) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof lbn0) {
                    lbn0Var = (lbn0) yjeVar;
                    int i29 = lbn0Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        lbn0Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        lbn0Var = new lbn0(this, yjeVar);
                    }
                } else {
                    lbn0Var = new lbn0(this, yjeVar);
                }
                Object obj15 = lbn0Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = lbn0Var.j;
                if (i30 == 0) {
                    z1x.P(obj15);
                    d8n0 d8n0Var = new d8n0(kmqVar, (byte) 3);
                    lbn0Var.j = 1;
                    if (gmqVar.c(d8n0Var, lbn0Var) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof hkn0) {
                    hkn0Var = (hkn0) yjeVar;
                    int i31 = hkn0Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        hkn0Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        hkn0Var = new hkn0(this, yjeVar);
                    }
                } else {
                    hkn0Var = new hkn0(this, yjeVar);
                }
                Object obj16 = hkn0Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = hkn0Var.j;
                if (i32 == 0) {
                    z1x.P(obj16);
                    d8n0 d8n0Var2 = new d8n0(kmqVar, b5);
                    hkn0Var.j = 1;
                    if (gmqVar.c(d8n0Var2, hkn0Var) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof srp0) {
                    srp0Var = (srp0) yjeVar;
                    int i33 = srp0Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        srp0Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        srp0Var = new srp0(this, yjeVar);
                    }
                } else {
                    srp0Var = new srp0(this, yjeVar);
                }
                Object obj17 = srp0Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = srp0Var.j;
                if (i34 == 0) {
                    z1x.P(obj17);
                    d8n0 d8n0Var3 = new d8n0(kmqVar, b3);
                    srp0Var.j = 1;
                    if (gmqVar.c(d8n0Var3, srp0Var) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof qnt0) {
                    qnt0Var = (qnt0) yjeVar;
                    int i35 = qnt0Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        qnt0Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        qnt0Var = new qnt0(this, yjeVar);
                    }
                } else {
                    qnt0Var = new qnt0(this, yjeVar);
                }
                Object obj18 = qnt0Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = qnt0Var.j;
                if (i36 == 0) {
                    z1x.P(obj18);
                    d8n0 d8n0Var4 = new d8n0(kmqVar, b4);
                    qnt0Var.j = 1;
                    if (gmqVar.c(d8n0Var4, qnt0Var) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof e7u0) {
                    e7u0Var = (e7u0) yjeVar;
                    int i37 = e7u0Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        e7u0Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        e7u0Var = new e7u0(this, yjeVar);
                    }
                } else {
                    e7u0Var = new e7u0(this, yjeVar);
                }
                Object obj19 = e7u0Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = e7u0Var.j;
                if (i38 == 0) {
                    z1x.P(obj19);
                    d8n0 d8n0Var5 = new d8n0(kmqVar, (byte) 27);
                    e7u0Var.j = 1;
                    if (gmqVar.c(d8n0Var5, e7u0Var) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof vyv0) {
                    vyv0Var = (vyv0) yjeVar;
                    int i39 = vyv0Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        vyv0Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        vyv0Var = new vyv0(this, yjeVar);
                    }
                } else {
                    vyv0Var = new vyv0(this, yjeVar);
                }
                Object obj20 = vyv0Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = vyv0Var.j;
                if (i40 == 0) {
                    z1x.P(obj20);
                    ofv0 ofv0Var = new ofv0(kmqVar, (byte) 4);
                    vyv0Var.j = 1;
                    if (gmqVar.c(ofv0Var, vyv0Var) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof ozv0) {
                    ozv0Var = (ozv0) yjeVar;
                    int i41 = ozv0Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        ozv0Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        ozv0Var = new ozv0(this, yjeVar);
                    }
                } else {
                    ozv0Var = new ozv0(this, yjeVar);
                }
                Object obj21 = ozv0Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = ozv0Var.j;
                if (i42 == 0) {
                    z1x.P(obj21);
                    ofv0 ofv0Var2 = new ofv0(kmqVar, (byte) 6);
                    ozv0Var.j = 1;
                    if (gmqVar.c(ofv0Var2, ozv0Var) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
        }
    }
}
