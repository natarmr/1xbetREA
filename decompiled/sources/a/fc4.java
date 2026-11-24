package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class fc4 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9291a;
    public final /* synthetic */ i89 b;

    public /* synthetic */ fc4(i89 i89Var, byte b) {
        this.f9291a = b;
        this.b = i89Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:137:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0265  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:185:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:201:0x0322  */
    /* JADX WARN: Code duplicated, block: B:217:0x0362  */
    /* JADX WARN: Code duplicated, block: B:233:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:249:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0420  */
    /* JADX WARN: Code duplicated, block: B:281:0x045e  */
    /* JADX WARN: Code duplicated, block: B:297:0x049c  */
    /* JADX WARN: Code duplicated, block: B:313:0x04da  */
    /* JADX WARN: Code duplicated, block: B:329:0x051a  */
    /* JADX WARN: Code duplicated, block: B:345:0x0558  */
    /* JADX WARN: Code duplicated, block: B:361:0x0596  */
    /* JADX WARN: Code duplicated, block: B:377:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:393:0x0612  */
    /* JADX WARN: Code duplicated, block: B:409:0x0650  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:425:0x068e  */
    /* JADX WARN: Code duplicated, block: B:441:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:457:0x070b  */
    /* JADX WARN: Code duplicated, block: B:473:0x0749  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:89:0x016d  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        dc4 dc4Var;
        zg4 zg4Var;
        dk4 dk4Var;
        xib xibVar;
        syb sybVar;
        cqp cqpVar;
        t6q t6qVar;
        hmt hmtVar;
        mut mutVar;
        put putVar;
        rut rutVar;
        uut uutVar;
        xut xutVar;
        avt avtVar;
        e6u e6uVar;
        h6u h6uVar;
        m6u m6uVar;
        p6u p6uVar;
        t6u t6uVar;
        w6u w6uVar;
        cau cauVar;
        gau gauVar;
        aju ajuVar;
        dju djuVar;
        gju gjuVar;
        jju jjuVar;
        mju mjuVar;
        pju pjuVar;
        kru kruVar;
        yf40 yf40Var;
        byte b = this.f9291a;
        byte b2 = 26;
        byte b3 = 5;
        byte b4 = 9;
        byte b5 = 10;
        byte b6 = 11;
        byte b7 = 4;
        byte b8 = 6;
        byte b9 = 7;
        i89 i89Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof dc4) {
                    dc4Var = (dc4) yjeVar;
                    int i = dc4Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        dc4Var.j = i - Integer.MIN_VALUE;
                    } else {
                        dc4Var = new dc4(this, yjeVar);
                    }
                } else {
                    dc4Var = new dc4(this, yjeVar);
                }
                Object obj = dc4Var.i;
                wne wneVar = wne.f39444a;
                int i2 = dc4Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    qo3 qo3Var = new qo3(kmqVar, b3);
                    dc4Var.j = 1;
                    if (i89Var.c(qo3Var, dc4Var) == wneVar) {
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
                if (yjeVar instanceof zg4) {
                    zg4Var = (zg4) yjeVar;
                    int i3 = zg4Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        zg4Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        zg4Var = new zg4(this, yjeVar);
                    }
                } else {
                    zg4Var = new zg4(this, yjeVar);
                }
                Object obj2 = zg4Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = zg4Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    qo3 qo3Var2 = new qo3(kmqVar, b8);
                    zg4Var.j = 1;
                    if (i89Var.c(qo3Var2, zg4Var) == wneVar2) {
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
                if (yjeVar instanceof dk4) {
                    dk4Var = (dk4) yjeVar;
                    int i5 = dk4Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        dk4Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        dk4Var = new dk4(this, yjeVar);
                    }
                } else {
                    dk4Var = new dk4(this, yjeVar);
                }
                Object obj3 = dk4Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = dk4Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    qo3 qo3Var3 = new qo3(kmqVar, b9);
                    dk4Var.j = 1;
                    if (i89Var.c(qo3Var3, dk4Var) == wneVar3) {
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
                if (yjeVar instanceof xib) {
                    xibVar = (xib) yjeVar;
                    int i7 = xibVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        xibVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        xibVar = new xib(this, yjeVar);
                    }
                } else {
                    xibVar = new xib(this, yjeVar);
                }
                Object obj4 = xibVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = xibVar.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    osa osaVar = new osa(kmqVar, (byte) 3);
                    xibVar.j = 1;
                    if (i89Var.c(osaVar, xibVar) == wneVar4) {
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
                if (yjeVar instanceof syb) {
                    sybVar = (syb) yjeVar;
                    int i9 = sybVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        sybVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        sybVar = new syb(this, yjeVar);
                    }
                } else {
                    sybVar = new syb(this, yjeVar);
                }
                Object obj5 = sybVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = sybVar.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    osa osaVar2 = new osa(kmqVar, b9);
                    sybVar.j = 1;
                    if (i89Var.c(osaVar2, sybVar) == wneVar5) {
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
                if (yjeVar instanceof cqp) {
                    cqpVar = (cqp) yjeVar;
                    int i11 = cqpVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        cqpVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        cqpVar = new cqp(this, yjeVar);
                    }
                } else {
                    cqpVar = new cqp(this, yjeVar);
                }
                Object obj6 = cqpVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = cqpVar.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    uap uapVar = new uap(kmqVar, b8);
                    cqpVar.j = 1;
                    if (i89Var.c(uapVar, cqpVar) == wneVar6) {
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
                if (yjeVar instanceof t6q) {
                    t6qVar = (t6q) yjeVar;
                    int i13 = t6qVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        t6qVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        t6qVar = new t6q(this, yjeVar);
                    }
                } else {
                    t6qVar = new t6q(this, yjeVar);
                }
                Object obj7 = t6qVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = t6qVar.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    uap uapVar2 = new uap(kmqVar, b9);
                    t6qVar.j = 1;
                    if (i89Var.c(uapVar2, t6qVar) == wneVar7) {
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
                if (yjeVar instanceof hmt) {
                    hmtVar = (hmt) yjeVar;
                    int i15 = hmtVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        hmtVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        hmtVar = new hmt(this, yjeVar);
                    }
                } else {
                    hmtVar = new hmt(this, yjeVar);
                }
                Object obj8 = hmtVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = hmtVar.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    uap uapVar3 = new uap(kmqVar, b2);
                    hmtVar.j = 1;
                    if (i89Var.c(uapVar3, hmtVar) == wneVar8) {
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
                if (yjeVar instanceof mut) {
                    mutVar = (mut) yjeVar;
                    int i17 = mutVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        mutVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        mutVar = new mut(this, yjeVar);
                    }
                } else {
                    mutVar = new mut(this, yjeVar);
                }
                Object obj9 = mutVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = mutVar.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    tnt tntVar = new tnt(kmqVar, b8);
                    mutVar.j = 1;
                    if (i89Var.c(tntVar, mutVar) == wneVar9) {
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
                if (yjeVar instanceof put) {
                    putVar = (put) yjeVar;
                    int i19 = putVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        putVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        putVar = new put(this, yjeVar);
                    }
                } else {
                    putVar = new put(this, yjeVar);
                }
                Object obj10 = putVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = putVar.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    tnt tntVar2 = new tnt(kmqVar, b9);
                    putVar.j = 1;
                    if (i89Var.c(tntVar2, putVar) == wneVar10) {
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
                if (yjeVar instanceof rut) {
                    rutVar = (rut) yjeVar;
                    int i21 = rutVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        rutVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        rutVar = new rut(this, yjeVar);
                    }
                } else {
                    rutVar = new rut(this, yjeVar);
                }
                Object obj11 = rutVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = rutVar.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    tnt tntVar3 = new tnt(kmqVar, (byte) 8);
                    rutVar.j = 1;
                    if (i89Var.c(tntVar3, rutVar) == wneVar11) {
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
                if (yjeVar instanceof uut) {
                    uutVar = (uut) yjeVar;
                    int i23 = uutVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        uutVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        uutVar = new uut(this, yjeVar);
                    }
                } else {
                    uutVar = new uut(this, yjeVar);
                }
                Object obj12 = uutVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = uutVar.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    tnt tntVar4 = new tnt(kmqVar, b4);
                    uutVar.j = 1;
                    if (i89Var.c(tntVar4, uutVar) == wneVar12) {
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
                if (yjeVar instanceof xut) {
                    xutVar = (xut) yjeVar;
                    int i25 = xutVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        xutVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        xutVar = new xut(this, yjeVar);
                    }
                } else {
                    xutVar = new xut(this, yjeVar);
                }
                Object obj13 = xutVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = xutVar.j;
                if (i26 == 0) {
                    z1x.P(obj13);
                    tnt tntVar5 = new tnt(kmqVar, b5);
                    xutVar.j = 1;
                    if (i89Var.c(tntVar5, xutVar) == wneVar13) {
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
                if (yjeVar instanceof avt) {
                    avtVar = (avt) yjeVar;
                    int i27 = avtVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        avtVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        avtVar = new avt(this, yjeVar);
                    }
                } else {
                    avtVar = new avt(this, yjeVar);
                }
                Object obj14 = avtVar.i;
                wne wneVar14 = wne.f39444a;
                int i28 = avtVar.j;
                if (i28 == 0) {
                    z1x.P(obj14);
                    tnt tntVar6 = new tnt(kmqVar, b6);
                    avtVar.j = 1;
                    if (i89Var.c(tntVar6, avtVar) == wneVar14) {
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
                if (yjeVar instanceof e6u) {
                    e6uVar = (e6u) yjeVar;
                    int i29 = e6uVar.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        e6uVar.j = i29 - Integer.MIN_VALUE;
                    } else {
                        e6uVar = new e6u(this, yjeVar);
                    }
                } else {
                    e6uVar = new e6u(this, yjeVar);
                }
                Object obj15 = e6uVar.i;
                wne wneVar15 = wne.f39444a;
                int i30 = e6uVar.j;
                if (i30 == 0) {
                    z1x.P(obj15);
                    tnt tntVar7 = new tnt(kmqVar, (byte) 25);
                    e6uVar.j = 1;
                    if (i89Var.c(tntVar7, e6uVar) == wneVar15) {
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
                if (yjeVar instanceof h6u) {
                    h6uVar = (h6u) yjeVar;
                    int i31 = h6uVar.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        h6uVar.j = i31 - Integer.MIN_VALUE;
                    } else {
                        h6uVar = new h6u(this, yjeVar);
                    }
                } else {
                    h6uVar = new h6u(this, yjeVar);
                }
                Object obj16 = h6uVar.i;
                wne wneVar16 = wne.f39444a;
                int i32 = h6uVar.j;
                if (i32 == 0) {
                    z1x.P(obj16);
                    tnt tntVar8 = new tnt(kmqVar, b2);
                    h6uVar.j = 1;
                    if (i89Var.c(tntVar8, h6uVar) == wneVar16) {
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
                if (yjeVar instanceof m6u) {
                    m6uVar = (m6u) yjeVar;
                    int i33 = m6uVar.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        m6uVar.j = i33 - Integer.MIN_VALUE;
                    } else {
                        m6uVar = new m6u(this, yjeVar);
                    }
                } else {
                    m6uVar = new m6u(this, yjeVar);
                }
                Object obj17 = m6uVar.i;
                wne wneVar17 = wne.f39444a;
                int i34 = m6uVar.j;
                if (i34 == 0) {
                    z1x.P(obj17);
                    tnt tntVar9 = new tnt(kmqVar, (byte) 27);
                    m6uVar.j = 1;
                    if (i89Var.c(tntVar9, m6uVar) == wneVar17) {
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
                if (yjeVar instanceof p6u) {
                    p6uVar = (p6u) yjeVar;
                    int i35 = p6uVar.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        p6uVar.j = i35 - Integer.MIN_VALUE;
                    } else {
                        p6uVar = new p6u(this, yjeVar);
                    }
                } else {
                    p6uVar = new p6u(this, yjeVar);
                }
                Object obj18 = p6uVar.i;
                wne wneVar18 = wne.f39444a;
                int i36 = p6uVar.j;
                if (i36 == 0) {
                    z1x.P(obj18);
                    tnt tntVar10 = new tnt(kmqVar, (byte) 28);
                    p6uVar.j = 1;
                    if (i89Var.c(tntVar10, p6uVar) == wneVar18) {
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
                if (yjeVar instanceof t6u) {
                    t6uVar = (t6u) yjeVar;
                    int i37 = t6uVar.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        t6uVar.j = i37 - Integer.MIN_VALUE;
                    } else {
                        t6uVar = new t6u(this, yjeVar);
                    }
                } else {
                    t6uVar = new t6u(this, yjeVar);
                }
                Object obj19 = t6uVar.i;
                wne wneVar19 = wne.f39444a;
                int i38 = t6uVar.j;
                if (i38 == 0) {
                    z1x.P(obj19);
                    tnt tntVar11 = new tnt(kmqVar, (byte) 29);
                    t6uVar.j = 1;
                    if (i89Var.c(tntVar11, t6uVar) == wneVar19) {
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
                if (yjeVar instanceof w6u) {
                    w6uVar = (w6u) yjeVar;
                    int i39 = w6uVar.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        w6uVar.j = i39 - Integer.MIN_VALUE;
                    } else {
                        w6uVar = new w6u(this, yjeVar);
                    }
                } else {
                    w6uVar = new w6u(this, yjeVar);
                }
                Object obj20 = w6uVar.i;
                wne wneVar20 = wne.f39444a;
                int i40 = w6uVar.j;
                if (i40 == 0) {
                    z1x.P(obj20);
                    y6u y6uVar = new y6u(kmqVar, (byte) 0);
                    w6uVar.j = 1;
                    if (i89Var.c(y6uVar, w6uVar) == wneVar20) {
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
                if (yjeVar instanceof cau) {
                    cauVar = (cau) yjeVar;
                    int i41 = cauVar.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        cauVar.j = i41 - Integer.MIN_VALUE;
                    } else {
                        cauVar = new cau(this, yjeVar);
                    }
                } else {
                    cauVar = new cau(this, yjeVar);
                }
                Object obj21 = cauVar.i;
                wne wneVar21 = wne.f39444a;
                int i42 = cauVar.j;
                if (i42 == 0) {
                    z1x.P(obj21);
                    y6u y6uVar2 = new y6u(kmqVar, b7);
                    cauVar.j = 1;
                    if (i89Var.c(y6uVar2, cauVar) == wneVar21) {
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
                if (yjeVar instanceof gau) {
                    gauVar = (gau) yjeVar;
                    int i43 = gauVar.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        gauVar.j = i43 - Integer.MIN_VALUE;
                    } else {
                        gauVar = new gau(this, yjeVar);
                    }
                } else {
                    gauVar = new gau(this, yjeVar);
                }
                Object obj22 = gauVar.i;
                wne wneVar22 = wne.f39444a;
                int i44 = gauVar.j;
                if (i44 == 0) {
                    z1x.P(obj22);
                    y6u y6uVar3 = new y6u(kmqVar, b3);
                    gauVar.j = 1;
                    if (i89Var.c(y6uVar3, gauVar) == wneVar22) {
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
                if (yjeVar instanceof aju) {
                    ajuVar = (aju) yjeVar;
                    int i45 = ajuVar.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        ajuVar.j = i45 - Integer.MIN_VALUE;
                    } else {
                        ajuVar = new aju(this, yjeVar);
                    }
                } else {
                    ajuVar = new aju(this, yjeVar);
                }
                Object obj23 = ajuVar.i;
                wne wneVar23 = wne.f39444a;
                int i46 = ajuVar.j;
                if (i46 == 0) {
                    z1x.P(obj23);
                    y6u y6uVar4 = new y6u(kmqVar, b4);
                    ajuVar.j = 1;
                    if (i89Var.c(y6uVar4, ajuVar) == wneVar23) {
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
                if (yjeVar instanceof dju) {
                    djuVar = (dju) yjeVar;
                    int i47 = djuVar.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        djuVar.j = i47 - Integer.MIN_VALUE;
                    } else {
                        djuVar = new dju(this, yjeVar);
                    }
                } else {
                    djuVar = new dju(this, yjeVar);
                }
                Object obj24 = djuVar.i;
                wne wneVar24 = wne.f39444a;
                int i48 = djuVar.j;
                if (i48 == 0) {
                    z1x.P(obj24);
                    y6u y6uVar5 = new y6u(kmqVar, b5);
                    djuVar.j = 1;
                    if (i89Var.c(y6uVar5, djuVar) == wneVar24) {
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
                if (yjeVar instanceof gju) {
                    gjuVar = (gju) yjeVar;
                    int i49 = gjuVar.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        gjuVar.j = i49 - Integer.MIN_VALUE;
                    } else {
                        gjuVar = new gju(this, yjeVar);
                    }
                } else {
                    gjuVar = new gju(this, yjeVar);
                }
                Object obj25 = gjuVar.i;
                wne wneVar25 = wne.f39444a;
                int i50 = gjuVar.j;
                if (i50 == 0) {
                    z1x.P(obj25);
                    y6u y6uVar6 = new y6u(kmqVar, b6);
                    gjuVar.j = 1;
                    if (i89Var.c(y6uVar6, gjuVar) == wneVar25) {
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
                if (yjeVar instanceof jju) {
                    jjuVar = (jju) yjeVar;
                    int i51 = jjuVar.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        jjuVar.j = i51 - Integer.MIN_VALUE;
                    } else {
                        jjuVar = new jju(this, yjeVar);
                    }
                } else {
                    jjuVar = new jju(this, yjeVar);
                }
                Object obj26 = jjuVar.i;
                wne wneVar26 = wne.f39444a;
                int i52 = jjuVar.j;
                if (i52 == 0) {
                    z1x.P(obj26);
                    y6u y6uVar7 = new y6u(kmqVar, (byte) 12);
                    jjuVar.j = 1;
                    if (i89Var.c(y6uVar7, jjuVar) == wneVar26) {
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
                if (yjeVar instanceof mju) {
                    mjuVar = (mju) yjeVar;
                    int i53 = mjuVar.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        mjuVar.j = i53 - Integer.MIN_VALUE;
                    } else {
                        mjuVar = new mju(this, yjeVar);
                    }
                } else {
                    mjuVar = new mju(this, yjeVar);
                }
                Object obj27 = mjuVar.i;
                wne wneVar27 = wne.f39444a;
                int i54 = mjuVar.j;
                if (i54 == 0) {
                    z1x.P(obj27);
                    y6u y6uVar8 = new y6u(kmqVar, (byte) 13);
                    mjuVar.j = 1;
                    if (i89Var.c(y6uVar8, mjuVar) == wneVar27) {
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
                if (yjeVar instanceof pju) {
                    pjuVar = (pju) yjeVar;
                    int i55 = pjuVar.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        pjuVar.j = i55 - Integer.MIN_VALUE;
                    } else {
                        pjuVar = new pju(this, yjeVar);
                    }
                } else {
                    pjuVar = new pju(this, yjeVar);
                }
                Object obj28 = pjuVar.i;
                wne wneVar28 = wne.f39444a;
                int i56 = pjuVar.j;
                if (i56 == 0) {
                    z1x.P(obj28);
                    y6u y6uVar9 = new y6u(kmqVar, (byte) 14);
                    pjuVar.j = 1;
                    if (i89Var.c(y6uVar9, pjuVar) == wneVar28) {
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
                if (yjeVar instanceof kru) {
                    kruVar = (kru) yjeVar;
                    int i57 = kruVar.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        kruVar.j = i57 - Integer.MIN_VALUE;
                    } else {
                        kruVar = new kru(this, yjeVar);
                    }
                } else {
                    kruVar = new kru(this, yjeVar);
                }
                Object obj29 = kruVar.i;
                wne wneVar29 = wne.f39444a;
                int i58 = kruVar.j;
                if (i58 == 0) {
                    z1x.P(obj29);
                    y6u y6uVar10 = new y6u(kmqVar, (byte) 21);
                    kruVar.j = 1;
                    if (i89Var.c(y6uVar10, kruVar) == wneVar29) {
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
                if (yjeVar instanceof yf40) {
                    yf40Var = (yf40) yjeVar;
                    int i59 = yf40Var.j;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        yf40Var.j = i59 - Integer.MIN_VALUE;
                    } else {
                        yf40Var = new yf40(this, yjeVar);
                    }
                } else {
                    yf40Var = new yf40(this, yjeVar);
                }
                Object obj30 = yf40Var.i;
                wne wneVar30 = wne.f39444a;
                int i60 = yf40Var.j;
                if (i60 == 0) {
                    z1x.P(obj30);
                    nr30 nr30Var = new nr30(kmqVar, b7);
                    yf40Var.j = 1;
                    if (i89Var.c(nr30Var, yf40Var) == wneVar30) {
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
