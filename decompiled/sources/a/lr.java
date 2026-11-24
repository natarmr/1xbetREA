package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class lr implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20504a;
    public final /* synthetic */ gmq b;

    public /* synthetic */ lr(gmq gmqVar, byte b) {
        this.f20504a = b;
        this.b = gmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0199  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:137:0x0216  */
    /* JADX WARN: Code duplicated, block: B:153:0x0253  */
    /* JADX WARN: Code duplicated, block: B:169:0x0290  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:201:0x030d  */
    /* JADX WARN: Code duplicated, block: B:217:0x034c  */
    /* JADX WARN: Code duplicated, block: B:233:0x038b  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:265:0x0409  */
    /* JADX WARN: Code duplicated, block: B:281:0x0446  */
    /* JADX WARN: Code duplicated, block: B:297:0x0483  */
    /* JADX WARN: Code duplicated, block: B:313:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:345:0x053e  */
    /* JADX WARN: Code duplicated, block: B:361:0x057b  */
    /* JADX WARN: Code duplicated, block: B:377:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:393:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:409:0x0636  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:425:0x0674  */
    /* JADX WARN: Code duplicated, block: B:441:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:457:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:473:0x072d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x015c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        jr jrVar;
        ur urVar;
        bs bsVar;
        nd0 nd0Var;
        he0 he0Var;
        rg0 rg0Var;
        tg0 tg0Var;
        zy0 zy0Var;
        qg1 qg1Var;
        sg1 sg1Var;
        sn1 sn1Var;
        ap1 ap1Var;
        nv1 nv1Var;
        bi3 bi3Var;
        fi3 fi3Var;
        dl3 dl3Var;
        cn3 cn3Var;
        en3 en3Var;
        bo3 bo3Var;
        oo3 oo3Var;
        qr3 qr3Var;
        ls3 ls3Var;
        i64 i64Var;
        fl4 fl4Var;
        uu5 uu5Var;
        l36 l36Var;
        t36 t36Var;
        d29 d29Var;
        f29 f29Var;
        i69 i69Var;
        byte b = this.f20504a;
        byte b2 = 2;
        byte b3 = 12;
        byte b4 = 14;
        byte b5 = 18;
        byte b6 = 19;
        byte b7 = 20;
        gmq gmqVar = this.b;
        byte b8 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof jr) {
                    jrVar = (jr) yjeVar;
                    int i = jrVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jrVar.j = i - Integer.MIN_VALUE;
                    } else {
                        jrVar = new jr(this, yjeVar);
                    }
                } else {
                    jrVar = new jr(this, yjeVar);
                }
                Object obj = jrVar.i;
                wne wneVar = wne.f39444a;
                int i2 = jrVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    ua uaVar = new ua(kmqVar, b8);
                    jrVar.j = 1;
                    if (gmqVar.c(uaVar, jrVar) == wneVar) {
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
                if (yjeVar instanceof ur) {
                    urVar = (ur) yjeVar;
                    int i3 = urVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        urVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        urVar = new ur(this, yjeVar);
                    }
                } else {
                    urVar = new ur(this, yjeVar);
                }
                Object obj2 = urVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = urVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    ua uaVar2 = new ua(kmqVar, b2);
                    urVar.j = 1;
                    if (gmqVar.c(uaVar2, urVar) == wneVar2) {
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
                if (yjeVar instanceof bs) {
                    bsVar = (bs) yjeVar;
                    int i5 = bsVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        bsVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        bsVar = new bs(this, yjeVar);
                    }
                } else {
                    bsVar = new bs(this, yjeVar);
                }
                Object obj3 = bsVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = bsVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    ua uaVar3 = new ua(kmqVar, (byte) 3);
                    bsVar.j = 1;
                    if (gmqVar.c(uaVar3, bsVar) == wneVar3) {
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
                if (yjeVar instanceof nd0) {
                    nd0Var = (nd0) yjeVar;
                    int i7 = nd0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        nd0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        nd0Var = new nd0(this, yjeVar);
                    }
                } else {
                    nd0Var = new nd0(this, yjeVar);
                }
                Object obj4 = nd0Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = nd0Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    ua uaVar4 = new ua(kmqVar, (byte) 6);
                    nd0Var.j = 1;
                    if (gmqVar.c(uaVar4, nd0Var) == wneVar4) {
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
                if (yjeVar instanceof he0) {
                    he0Var = (he0) yjeVar;
                    int i9 = he0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        he0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        he0Var = new he0(this, yjeVar);
                    }
                } else {
                    he0Var = new he0(this, yjeVar);
                }
                Object obj5 = he0Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = he0Var.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    ua uaVar5 = new ua(kmqVar, (byte) 7);
                    he0Var.j = 1;
                    if (gmqVar.c(uaVar5, he0Var) == wneVar5) {
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
                if (yjeVar instanceof rg0) {
                    rg0Var = (rg0) yjeVar;
                    int i11 = rg0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        rg0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        rg0Var = new rg0(this, yjeVar);
                    }
                } else {
                    rg0Var = new rg0(this, yjeVar);
                }
                Object obj6 = rg0Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = rg0Var.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    ua uaVar6 = new ua(kmqVar, (byte) 10);
                    rg0Var.j = 1;
                    if (gmqVar.c(uaVar6, rg0Var) == wneVar6) {
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
                if (yjeVar instanceof tg0) {
                    tg0Var = (tg0) yjeVar;
                    int i13 = tg0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        tg0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        tg0Var = new tg0(this, yjeVar);
                    }
                } else {
                    tg0Var = new tg0(this, yjeVar);
                }
                Object obj7 = tg0Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = tg0Var.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    ua uaVar7 = new ua(kmqVar, (byte) 11);
                    tg0Var.j = 1;
                    if (gmqVar.c(uaVar7, tg0Var) == wneVar7) {
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
                if (yjeVar instanceof zy0) {
                    zy0Var = (zy0) yjeVar;
                    int i15 = zy0Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        zy0Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        zy0Var = new zy0(this, yjeVar);
                    }
                } else {
                    zy0Var = new zy0(this, yjeVar);
                }
                Object obj8 = zy0Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = zy0Var.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    ua uaVar8 = new ua(kmqVar, b3);
                    zy0Var.j = 1;
                    if (gmqVar.c(uaVar8, zy0Var) == wneVar8) {
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
                if (yjeVar instanceof qg1) {
                    qg1Var = (qg1) yjeVar;
                    int i17 = qg1Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        qg1Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        qg1Var = new qg1(this, yjeVar);
                    }
                } else {
                    qg1Var = new qg1(this, yjeVar);
                }
                Object obj9 = qg1Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = qg1Var.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    ua uaVar9 = new ua(kmqVar, b4);
                    qg1Var.j = 1;
                    if (gmqVar.c(uaVar9, qg1Var) == wneVar9) {
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
                if (yjeVar instanceof sg1) {
                    sg1Var = (sg1) yjeVar;
                    int i19 = sg1Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        sg1Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        sg1Var = new sg1(this, yjeVar);
                    }
                } else {
                    sg1Var = new sg1(this, yjeVar);
                }
                Object obj10 = sg1Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = sg1Var.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    ua uaVar10 = new ua(kmqVar, (byte) 15);
                    sg1Var.j = 1;
                    if (gmqVar.c(uaVar10, sg1Var) == wneVar10) {
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
                if (yjeVar instanceof sn1) {
                    sn1Var = (sn1) yjeVar;
                    int i21 = sn1Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        sn1Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        sn1Var = new sn1(this, yjeVar);
                    }
                } else {
                    sn1Var = new sn1(this, yjeVar);
                }
                Object obj11 = sn1Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = sn1Var.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    ua uaVar11 = new ua(kmqVar, (byte) 16);
                    sn1Var.j = 1;
                    if (gmqVar.c(uaVar11, sn1Var) == wneVar11) {
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
                if (yjeVar instanceof ap1) {
                    ap1Var = (ap1) yjeVar;
                    int i23 = ap1Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ap1Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        ap1Var = new ap1(this, yjeVar);
                    }
                } else {
                    ap1Var = new ap1(this, yjeVar);
                }
                Object obj12 = ap1Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = ap1Var.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    ua uaVar12 = new ua(kmqVar, b5);
                    ap1Var.j = 1;
                    if (gmqVar.c(uaVar12, ap1Var) == wneVar12) {
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
                if (yjeVar instanceof nv1) {
                    nv1Var = (nv1) yjeVar;
                    int i25 = nv1Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        nv1Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        nv1Var = new nv1(this, yjeVar);
                    }
                } else {
                    nv1Var = new nv1(this, yjeVar);
                }
                Object obj13 = nv1Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = nv1Var.j;
                if (i26 == 0) {
                    z1x.P(obj13);
                    ua uaVar13 = new ua(kmqVar, b6);
                    nv1Var.j = 1;
                    if (gmqVar.c(uaVar13, nv1Var) == wneVar13) {
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
                if (yjeVar instanceof bi3) {
                    bi3Var = (bi3) yjeVar;
                    int i27 = bi3Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        bi3Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        bi3Var = new bi3(this, yjeVar);
                    }
                } else {
                    bi3Var = new bi3(this, yjeVar);
                }
                Object obj14 = bi3Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = bi3Var.j;
                if (i28 == 0) {
                    z1x.P(obj14);
                    ua uaVar14 = new ua(kmqVar, b7);
                    bi3Var.j = 1;
                    if (gmqVar.c(uaVar14, bi3Var) == wneVar14) {
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
                if (yjeVar instanceof fi3) {
                    fi3Var = (fi3) yjeVar;
                    int i29 = fi3Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        fi3Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        fi3Var = new fi3(this, yjeVar);
                    }
                } else {
                    fi3Var = new fi3(this, yjeVar);
                }
                Object obj15 = fi3Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = fi3Var.j;
                if (i30 == 0) {
                    z1x.P(obj15);
                    ua uaVar15 = new ua(kmqVar, (byte) 21);
                    fi3Var.j = 1;
                    if (gmqVar.c(uaVar15, fi3Var) == wneVar15) {
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
                if (yjeVar instanceof dl3) {
                    dl3Var = (dl3) yjeVar;
                    int i31 = dl3Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        dl3Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        dl3Var = new dl3(this, yjeVar);
                    }
                } else {
                    dl3Var = new dl3(this, yjeVar);
                }
                Object obj16 = dl3Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = dl3Var.j;
                if (i32 == 0) {
                    z1x.P(obj16);
                    ua uaVar16 = new ua(kmqVar, (byte) 25);
                    dl3Var.j = 1;
                    if (gmqVar.c(uaVar16, dl3Var) == wneVar16) {
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
                if (yjeVar instanceof cn3) {
                    cn3Var = (cn3) yjeVar;
                    int i33 = cn3Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        cn3Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        cn3Var = new cn3(this, yjeVar);
                    }
                } else {
                    cn3Var = new cn3(this, yjeVar);
                }
                Object obj17 = cn3Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = cn3Var.j;
                if (i34 == 0) {
                    z1x.P(obj17);
                    ua uaVar17 = new ua(kmqVar, (byte) 26);
                    cn3Var.j = 1;
                    if (gmqVar.c(uaVar17, cn3Var) == wneVar17) {
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
                if (yjeVar instanceof en3) {
                    en3Var = (en3) yjeVar;
                    int i35 = en3Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        en3Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        en3Var = new en3(this, yjeVar);
                    }
                } else {
                    en3Var = new en3(this, yjeVar);
                }
                Object obj18 = en3Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = en3Var.j;
                if (i36 == 0) {
                    z1x.P(obj18);
                    ua uaVar18 = new ua(kmqVar, (byte) 27);
                    en3Var.j = 1;
                    if (gmqVar.c(uaVar18, en3Var) == wneVar18) {
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
                if (yjeVar instanceof bo3) {
                    bo3Var = (bo3) yjeVar;
                    int i37 = bo3Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        bo3Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        bo3Var = new bo3(this, yjeVar);
                    }
                } else {
                    bo3Var = new bo3(this, yjeVar);
                }
                Object obj19 = bo3Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = bo3Var.j;
                if (i38 == 0) {
                    z1x.P(obj19);
                    ua uaVar19 = new ua(kmqVar, (byte) 29);
                    bo3Var.j = 1;
                    if (gmqVar.c(uaVar19, bo3Var) == wneVar19) {
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
                if (yjeVar instanceof oo3) {
                    oo3Var = (oo3) yjeVar;
                    int i39 = oo3Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        oo3Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        oo3Var = new oo3(this, yjeVar);
                    }
                } else {
                    oo3Var = new oo3(this, yjeVar);
                }
                Object obj20 = oo3Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = oo3Var.j;
                if (i40 == 0) {
                    z1x.P(obj20);
                    qo3 qo3Var = new qo3(kmqVar, (byte) 0);
                    oo3Var.j = 1;
                    if (gmqVar.c(qo3Var, oo3Var) == wneVar20) {
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
            case 20:
                if (yjeVar instanceof qr3) {
                    qr3Var = (qr3) yjeVar;
                    int i41 = qr3Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        qr3Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        qr3Var = new qr3(this, yjeVar);
                    }
                } else {
                    qr3Var = new qr3(this, yjeVar);
                }
                Object obj21 = qr3Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = qr3Var.j;
                if (i42 == 0) {
                    z1x.P(obj21);
                    qo3 qo3Var2 = new qo3(kmqVar, b8);
                    qr3Var.j = 1;
                    if (gmqVar.c(qo3Var2, qr3Var) == wneVar21) {
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
            case 21:
                if (yjeVar instanceof ls3) {
                    ls3Var = (ls3) yjeVar;
                    int i43 = ls3Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ls3Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        ls3Var = new ls3(this, yjeVar);
                    }
                } else {
                    ls3Var = new ls3(this, yjeVar);
                }
                Object obj22 = ls3Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = ls3Var.j;
                if (i44 == 0) {
                    z1x.P(obj22);
                    qo3 qo3Var3 = new qo3(kmqVar, b2);
                    ls3Var.j = 1;
                    if (gmqVar.c(qo3Var3, ls3Var) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof i64) {
                    i64Var = (i64) yjeVar;
                    int i45 = i64Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        i64Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        i64Var = new i64(this, yjeVar);
                    }
                } else {
                    i64Var = new i64(this, yjeVar);
                }
                Object obj23 = i64Var.i;
                wne wneVar23 = wne.f39444a;
                int i46 = i64Var.j;
                if (i46 == 0) {
                    z1x.P(obj23);
                    qo3 qo3Var4 = new qo3(kmqVar, (byte) 4);
                    i64Var.j = 1;
                    if (gmqVar.c(qo3Var4, i64Var) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof fl4) {
                    fl4Var = (fl4) yjeVar;
                    int i47 = fl4Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        fl4Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        fl4Var = new fl4(this, yjeVar);
                    }
                } else {
                    fl4Var = new fl4(this, yjeVar);
                }
                Object obj24 = fl4Var.i;
                wne wneVar24 = wne.f39444a;
                int i48 = fl4Var.j;
                if (i48 == 0) {
                    z1x.P(obj24);
                    qo3 qo3Var5 = new qo3(kmqVar, (byte) 8);
                    fl4Var.j = 1;
                    if (gmqVar.c(qo3Var5, fl4Var) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (i48 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof uu5) {
                    uu5Var = (uu5) yjeVar;
                    int i49 = uu5Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        uu5Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        uu5Var = new uu5(this, yjeVar);
                    }
                } else {
                    uu5Var = new uu5(this, yjeVar);
                }
                Object obj25 = uu5Var.i;
                wne wneVar25 = wne.f39444a;
                int i50 = uu5Var.j;
                if (i50 == 0) {
                    z1x.P(obj25);
                    qo3 qo3Var6 = new qo3(kmqVar, b3);
                    uu5Var.j = 1;
                    if (gmqVar.c(qo3Var6, uu5Var) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (i50 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj25);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof l36) {
                    l36Var = (l36) yjeVar;
                    int i51 = l36Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        l36Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        l36Var = new l36(this, yjeVar);
                    }
                } else {
                    l36Var = new l36(this, yjeVar);
                }
                Object obj26 = l36Var.i;
                wne wneVar26 = wne.f39444a;
                int i52 = l36Var.j;
                if (i52 == 0) {
                    z1x.P(obj26);
                    qo3 qo3Var7 = new qo3(kmqVar, (byte) 13);
                    l36Var.j = 1;
                    if (gmqVar.c(qo3Var7, l36Var) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (i52 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj26);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof t36) {
                    t36Var = (t36) yjeVar;
                    int i53 = t36Var.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        t36Var.j = i53 - Integer.MIN_VALUE;
                    } else {
                        t36Var = new t36(this, yjeVar);
                    }
                } else {
                    t36Var = new t36(this, yjeVar);
                }
                Object obj27 = t36Var.i;
                wne wneVar27 = wne.f39444a;
                int i54 = t36Var.j;
                if (i54 == 0) {
                    z1x.P(obj27);
                    qo3 qo3Var8 = new qo3(kmqVar, b4);
                    t36Var.j = 1;
                    if (gmqVar.c(qo3Var8, t36Var) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (i54 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj27);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof d29) {
                    d29Var = (d29) yjeVar;
                    int i55 = d29Var.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        d29Var.j = i55 - Integer.MIN_VALUE;
                    } else {
                        d29Var = new d29(this, yjeVar);
                    }
                } else {
                    d29Var = new d29(this, yjeVar);
                }
                Object obj28 = d29Var.i;
                wne wneVar28 = wne.f39444a;
                int i56 = d29Var.j;
                if (i56 == 0) {
                    z1x.P(obj28);
                    qo3 qo3Var9 = new qo3(kmqVar, b5);
                    d29Var.j = 1;
                    if (gmqVar.c(qo3Var9, d29Var) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (i56 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof f29) {
                    f29Var = (f29) yjeVar;
                    int i57 = f29Var.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        f29Var.j = i57 - Integer.MIN_VALUE;
                    } else {
                        f29Var = new f29(this, yjeVar);
                    }
                } else {
                    f29Var = new f29(this, yjeVar);
                }
                Object obj29 = f29Var.i;
                wne wneVar29 = wne.f39444a;
                int i58 = f29Var.j;
                if (i58 == 0) {
                    z1x.P(obj29);
                    qo3 qo3Var10 = new qo3(kmqVar, b6);
                    f29Var.j = 1;
                    if (gmqVar.c(qo3Var10, f29Var) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (i58 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj29);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof i69) {
                    i69Var = (i69) yjeVar;
                    int i59 = i69Var.j;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        i69Var.j = i59 - Integer.MIN_VALUE;
                    } else {
                        i69Var = new i69(this, yjeVar);
                    }
                } else {
                    i69Var = new i69(this, yjeVar);
                }
                Object obj30 = i69Var.i;
                wne wneVar30 = wne.f39444a;
                int i60 = i69Var.j;
                if (i60 == 0) {
                    z1x.P(obj30);
                    qo3 qo3Var11 = new qo3(kmqVar, b7);
                    i69Var.j = 1;
                    if (gmqVar.c(qo3Var11, i69Var) == wneVar30) {
                        return wneVar30;
                    }
                } else {
                    if (i60 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj30);
                }
                return Unit.f46060a;
        }
    }
}
