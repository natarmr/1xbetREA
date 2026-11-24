package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class m430 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21148a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m430(Object obj, Object obj2, byte b) {
        this.f21148a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01df  */
    /* JADX WARN: Code duplicated, block: B:126:0x0225  */
    /* JADX WARN: Code duplicated, block: B:142:0x0267  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:163:0x02be  */
    /* JADX WARN: Code duplicated, block: B:179:0x0300  */
    /* JADX WARN: Code duplicated, block: B:195:0x0344  */
    /* JADX WARN: Code duplicated, block: B:211:0x0386  */
    /* JADX WARN: Code duplicated, block: B:227:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:243:0x040a  */
    /* JADX WARN: Code duplicated, block: B:259:0x044c  */
    /* JADX WARN: Code duplicated, block: B:275:0x048f  */
    /* JADX WARN: Code duplicated, block: B:291:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:307:0x0513  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:323:0x0559  */
    /* JADX WARN: Code duplicated, block: B:339:0x059f  */
    /* JADX WARN: Code duplicated, block: B:355:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:371:0x0629  */
    /* JADX WARN: Code duplicated, block: B:387:0x066b  */
    /* JADX WARN: Code duplicated, block: B:403:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:419:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:435:0x0733  */
    /* JADX WARN: Code duplicated, block: B:451:0x0779  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0111  */
    /* JADX WARN: Code duplicated, block: B:78:0x0159  */
    /* JADX WARN: Code duplicated, block: B:94:0x019b  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        j430 j430Var;
        g340 g340Var;
        ag40 ag40Var;
        i850 i850Var;
        u260 u260Var;
        xb60 xb60Var;
        x570 x570Var;
        if70 if70Var;
        po70 po70Var;
        qp70 qp70Var;
        ry70 ry70Var;
        uy70 uy70Var;
        wy70 wy70Var;
        yy70 yy70Var;
        az70 az70Var;
        cz70 cz70Var;
        ez70 ez70Var;
        t580 t580Var;
        p980 p980Var;
        rn80 rn80Var;
        e090 e090Var;
        bs90 bs90Var;
        e5b0 e5b0Var;
        vab0 vab0Var;
        gyc0 gyc0Var;
        m9g0 m9g0Var;
        gph0 gph0Var;
        hdi0 hdi0Var;
        byte b = this.f21148a;
        byte b2 = 0;
        byte b3 = 4;
        byte b4 = 5;
        byte b5 = 6;
        byte b6 = 12;
        byte b7 = 19;
        yje yjeVar2 = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof j430) {
                    j430Var = (j430) yjeVar;
                    int i = j430Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        j430Var.j = i - Integer.MIN_VALUE;
                    } else {
                        j430Var = new j430(this, yjeVar);
                    }
                } else {
                    j430Var = new j430(this, yjeVar);
                }
                Object obj3 = j430Var.i;
                wne wneVar = wne.f39444a;
                int i2 = j430Var.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    clu cluVar = new clu(kmqVar, (q430) obj, (byte) 16);
                    j430Var.j = 1;
                    if (((zj2) obj2).c(cluVar, j430Var) == wneVar) {
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
                if (yjeVar instanceof g340) {
                    g340Var = (g340) yjeVar;
                    int i3 = g340Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        g340Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        g340Var = new g340(this, yjeVar);
                    }
                } else {
                    g340Var = new g340(this, yjeVar);
                }
                Object obj4 = g340Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = g340Var.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    clu cluVar2 = new clu(kmqVar, (j340) obj, (byte) 17);
                    g340Var.j = 1;
                    if (((xae0) obj2).f40549a.c(cluVar2, g340Var) == wneVar2) {
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
                if (yjeVar instanceof ag40) {
                    ag40Var = (ag40) yjeVar;
                    int i5 = ag40Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ag40Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        ag40Var = new ag40(this, yjeVar);
                    }
                } else {
                    ag40Var = new ag40(this, yjeVar);
                }
                Object obj5 = ag40Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = ag40Var.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    clu cluVar3 = new clu(kmqVar, (cg40) obj, b7);
                    ag40Var.j = 1;
                    if (((gmq) obj2).c(cluVar3, ag40Var) == wneVar3) {
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
                if (yjeVar instanceof i850) {
                    i850Var = (i850) yjeVar;
                    int i7 = i850Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        i850Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        i850Var = new i850(this, yjeVar);
                    }
                } else {
                    i850Var = new i850(this, yjeVar);
                }
                Object obj6 = i850Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = i850Var.j;
                if (i8 == 0) {
                    z1x.P(obj6);
                    clu cluVar4 = new clu(kmqVar, (p850) obj, (byte) 20);
                    i850Var.j = 1;
                    if (((fnq) obj2).c(cluVar4, i850Var) == wneVar4) {
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
                if (yjeVar instanceof u260) {
                    u260Var = (u260) yjeVar;
                    int i9 = u260Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        u260Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        u260Var = new u260(this, yjeVar);
                    }
                } else {
                    u260Var = new u260(this, yjeVar);
                }
                Object obj7 = u260Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = u260Var.j;
                if (i10 == 0) {
                    z1x.P(obj7);
                    ch2 ch2Var = new ch2(kmqVar, (Throwable) obj, (byte) 3);
                    u260Var.j = 1;
                    if (((fnq) obj2).c(ch2Var, u260Var) == wneVar5) {
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
                if (yjeVar instanceof xb60) {
                    xb60Var = (xb60) yjeVar;
                    int i11 = xb60Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        xb60Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        xb60Var = new xb60(this, yjeVar);
                    }
                } else {
                    xb60Var = new xb60(this, yjeVar);
                }
                Object obj8 = xb60Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = xb60Var.j;
                if (i12 == 0) {
                    z1x.P(obj8);
                    nr30 nr30Var = new nr30(kmqVar, (j910) obj);
                    xb60Var.j = 1;
                    if (((gmq) obj2).c(nr30Var, xb60Var) == wneVar6) {
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
                if (yjeVar instanceof x570) {
                    x570Var = (x570) yjeVar;
                    int i13 = x570Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        x570Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        x570Var = new x570(this, yjeVar);
                    }
                } else {
                    x570Var = new x570(this, yjeVar);
                }
                Object obj9 = x570Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = x570Var.j;
                if (i14 == 0) {
                    z1x.P(obj9);
                    clu cluVar5 = new clu(kmqVar, (g670) obj, (byte) 25);
                    x570Var.j = 1;
                    if (((gmq) obj2).c(cluVar5, x570Var) == wneVar7) {
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
                if (yjeVar instanceof if70) {
                    if70Var = (if70) yjeVar;
                    int i15 = if70Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        if70Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        if70Var = new if70(this, yjeVar);
                    }
                } else {
                    if70Var = new if70(this, yjeVar);
                }
                Object obj10 = if70Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = if70Var.j;
                if (i16 == 0) {
                    z1x.P(obj10);
                    clu cluVar6 = new clu(kmqVar, (qf70) obj, (byte) 26);
                    if70Var.j = 1;
                    if (((vae0) obj2).f37082a.c(cluVar6, if70Var) == wneVar8) {
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
                if (yjeVar instanceof po70) {
                    po70Var = (po70) yjeVar;
                    int i17 = po70Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        po70Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        po70Var = new po70(this, yjeVar);
                    }
                } else {
                    po70Var = new po70(this, yjeVar);
                }
                Object obj11 = po70Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = po70Var.j;
                if (i18 == 0) {
                    z1x.P(obj11);
                    clu cluVar7 = new clu(kmqVar, (to70) obj, (byte) 27);
                    po70Var.j = 1;
                    if (((vae0) obj2).f37082a.c(cluVar7, po70Var) == wneVar9) {
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
                if (yjeVar instanceof qp70) {
                    qp70Var = (qp70) yjeVar;
                    int i19 = qp70Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        qp70Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        qp70Var = new qp70(this, yjeVar);
                    }
                } else {
                    qp70Var = new qp70(this, yjeVar);
                }
                Object obj12 = qp70Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = qp70Var.j;
                if (i20 == 0) {
                    z1x.P(obj12);
                    clu cluVar8 = new clu(kmqVar, (sp70) obj, (byte) 28);
                    qp70Var.j = 1;
                    if (((vae0) obj2).f37082a.c(cluVar8, qp70Var) == wneVar10) {
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
                if (yjeVar instanceof ry70) {
                    ry70Var = (ry70) yjeVar;
                    int i21 = ry70Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ry70Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        ry70Var = new ry70(this, yjeVar);
                    }
                } else {
                    ry70Var = new ry70(this, yjeVar);
                }
                Object obj13 = ry70Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = ry70Var.j;
                if (i22 == 0) {
                    z1x.P(obj13);
                    ty70 ty70Var = new ty70(kmqVar, (gz70) obj, (byte) 0);
                    ry70Var.j = 1;
                    if (((w7e) obj2).c(ty70Var, ry70Var) == wneVar11) {
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
                if (yjeVar instanceof uy70) {
                    uy70Var = (uy70) yjeVar;
                    int i23 = uy70Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        uy70Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        uy70Var = new uy70(this, yjeVar);
                    }
                } else {
                    uy70Var = new uy70(this, yjeVar);
                }
                Object obj14 = uy70Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = uy70Var.j;
                if (i24 == 0) {
                    z1x.P(obj14);
                    ty70 ty70Var2 = new ty70(kmqVar, (gz70) obj, (byte) 1);
                    uy70Var.j = 1;
                    if (((va) obj2).c(ty70Var2, uy70Var) == wneVar12) {
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
                if (yjeVar instanceof wy70) {
                    wy70Var = (wy70) yjeVar;
                    int i25 = wy70Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        wy70Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        wy70Var = new wy70(this, yjeVar);
                    }
                } else {
                    wy70Var = new wy70(this, yjeVar);
                }
                Object obj15 = wy70Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = wy70Var.j;
                if (i26 == 0) {
                    z1x.P(obj15);
                    ty70 ty70Var3 = new ty70(kmqVar, (gz70) obj, (byte) 2);
                    wy70Var.j = 1;
                    if (((va) obj2).c(ty70Var3, wy70Var) == wneVar13) {
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
                if (yjeVar instanceof yy70) {
                    yy70Var = (yy70) yjeVar;
                    int i27 = yy70Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        yy70Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        yy70Var = new yy70(this, yjeVar);
                    }
                } else {
                    yy70Var = new yy70(this, yjeVar);
                }
                Object obj16 = yy70Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = yy70Var.j;
                if (i28 == 0) {
                    z1x.P(obj16);
                    ty70 ty70Var4 = new ty70(kmqVar, (gz70) obj, (byte) 3);
                    yy70Var.j = 1;
                    if (((va) obj2).c(ty70Var4, yy70Var) == wneVar14) {
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
                if (yjeVar instanceof az70) {
                    az70Var = (az70) yjeVar;
                    int i29 = az70Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        az70Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        az70Var = new az70(this, yjeVar);
                    }
                } else {
                    az70Var = new az70(this, yjeVar);
                }
                Object obj17 = az70Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = az70Var.j;
                if (i30 == 0) {
                    z1x.P(obj17);
                    ty70 ty70Var5 = new ty70(kmqVar, (gz70) obj, (byte) 4);
                    az70Var.j = 1;
                    if (((va) obj2).c(ty70Var5, az70Var) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof cz70) {
                    cz70Var = (cz70) yjeVar;
                    int i31 = cz70Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        cz70Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        cz70Var = new cz70(this, yjeVar);
                    }
                } else {
                    cz70Var = new cz70(this, yjeVar);
                }
                Object obj18 = cz70Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = cz70Var.j;
                if (i32 == 0) {
                    z1x.P(obj18);
                    ty70 ty70Var6 = new ty70(kmqVar, (gz70) obj, (byte) 5);
                    cz70Var.j = 1;
                    if (((va) obj2).c(ty70Var6, cz70Var) == wneVar16) {
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
                if (yjeVar instanceof ez70) {
                    ez70Var = (ez70) yjeVar;
                    int i33 = ez70Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        ez70Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        ez70Var = new ez70(this, yjeVar);
                    }
                } else {
                    ez70Var = new ez70(this, yjeVar);
                }
                Object obj19 = ez70Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = ez70Var.j;
                if (i34 == 0) {
                    z1x.P(obj19);
                    ty70 ty70Var7 = new ty70(kmqVar, (gz70) obj, (byte) 6);
                    ez70Var.j = 1;
                    if (((w7e) obj2).c(ty70Var7, ez70Var) == wneVar17) {
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
                if (yjeVar instanceof t580) {
                    t580Var = (t580) yjeVar;
                    int i35 = t580Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        t580Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        t580Var = new t580(this, yjeVar);
                    }
                } else {
                    t580Var = new t580(this, yjeVar);
                }
                Object obj20 = t580Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = t580Var.j;
                if (i36 == 0) {
                    z1x.P(obj20);
                    clu cluVar9 = new clu(kmqVar, (v580) obj, (byte) 29);
                    t580Var.j = 1;
                    if (((a1g) obj2).c(cluVar9, t580Var) == wneVar18) {
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
                if (yjeVar instanceof p980) {
                    p980Var = (p980) yjeVar;
                    int i37 = p980Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        p980Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        p980Var = new p980(this, yjeVar);
                    }
                } else {
                    p980Var = new p980(this, yjeVar);
                }
                Object obj21 = p980Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = p980Var.j;
                if (i38 == 0) {
                    z1x.P(obj21);
                    r980 r980Var = new r980(kmqVar, (aa80) obj, b2);
                    p980Var.j = 1;
                    if (((gmq) obj2).c(r980Var, p980Var) == wneVar19) {
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
                Object objC = ((gmq) obj2).c(new r980(kmqVar, (caw) obj, b3), yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
            case 20:
                if (yjeVar instanceof rn80) {
                    rn80Var = (rn80) yjeVar;
                    int i39 = rn80Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        rn80Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        rn80Var = new rn80(this, yjeVar);
                    }
                } else {
                    rn80Var = new rn80(this, yjeVar);
                }
                Object obj22 = rn80Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = rn80Var.j;
                if (i40 == 0) {
                    z1x.P(obj22);
                    r980 r980Var2 = new r980(kmqVar, (tn80) obj, b4);
                    rn80Var.j = 1;
                    if (((gmq) obj2).c(r980Var2, rn80Var) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof e090) {
                    e090Var = (e090) yjeVar;
                    int i41 = e090Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        e090Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        e090Var = new e090(this, yjeVar);
                    }
                } else {
                    e090Var = new e090(this, yjeVar);
                }
                Object obj23 = e090Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = e090Var.j;
                if (i42 == 0) {
                    z1x.P(obj23);
                    r980 r980Var3 = new r980(kmqVar, (p6a) obj, b5);
                    e090Var.j = 1;
                    if (((p5a) obj2).c(r980Var3, e090Var) == wneVar21) {
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
            case 22:
                if (yjeVar instanceof bs90) {
                    bs90Var = (bs90) yjeVar;
                    int i43 = bs90Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        bs90Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        bs90Var = new bs90(this, yjeVar);
                    }
                } else {
                    bs90Var = new bs90(this, yjeVar);
                }
                Object obj24 = bs90Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = bs90Var.j;
                if (i44 == 0) {
                    z1x.P(obj24);
                    r980 r980Var4 = new r980(kmqVar, (es90) obj, (byte) 8);
                    bs90Var.j = 1;
                    if (((xae0) obj2).f40549a.c(r980Var4, bs90Var) == wneVar22) {
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
            case 23:
                if (yjeVar instanceof e5b0) {
                    e5b0Var = (e5b0) yjeVar;
                    int i45 = e5b0Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        e5b0Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        e5b0Var = new e5b0(this, yjeVar);
                    }
                } else {
                    e5b0Var = new e5b0(this, yjeVar);
                }
                Object obj25 = e5b0Var.i;
                wne wneVar23 = wne.f39444a;
                int i46 = e5b0Var.j;
                if (i46 == 0) {
                    z1x.P(obj25);
                    r980 r980Var5 = new r980(kmqVar, (j5b0) obj, (byte) 9);
                    e5b0Var.j = 1;
                    if (((gmq) obj2).c(r980Var5, e5b0Var) == wneVar23) {
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
            case 24:
                if (yjeVar instanceof vab0) {
                    vab0Var = (vab0) yjeVar;
                    int i47 = vab0Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        vab0Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        vab0Var = new vab0(this, yjeVar);
                    }
                } else {
                    vab0Var = new vab0(this, yjeVar);
                }
                Object obj26 = vab0Var.i;
                wne wneVar24 = wne.f39444a;
                int i48 = vab0Var.j;
                if (i48 == 0) {
                    z1x.P(obj26);
                    r980 r980Var6 = new r980(kmqVar, (sbb0) obj, b6);
                    vab0Var.j = 1;
                    if (((gmq) obj2).c(r980Var6, vab0Var) == wneVar24) {
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
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof gyc0) {
                    gyc0Var = (gyc0) yjeVar;
                    int i49 = gyc0Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        gyc0Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        gyc0Var = new gyc0(this, yjeVar);
                    }
                } else {
                    gyc0Var = new gyc0(this, yjeVar);
                }
                Object obj27 = gyc0Var.i;
                wne wneVar25 = wne.f39444a;
                int i50 = gyc0Var.j;
                if (i50 == 0) {
                    z1x.P(obj27);
                    gmq[] gmqVarArr = (gmq[]) obj2;
                    ti3 ti3Var = new ti3(gmqVarArr, (byte) 12);
                    za60 za60Var = new za60(yjeVar2, obj, (byte) 7);
                    gyc0Var.j = 1;
                    if (tdc.G(gyc0Var, kmqVar, za60Var, ti3Var, gmqVarArr) == wneVar25) {
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
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof m9g0) {
                    m9g0Var = (m9g0) yjeVar;
                    int i51 = m9g0Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        m9g0Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        m9g0Var = new m9g0(this, yjeVar);
                    }
                } else {
                    m9g0Var = new m9g0(this, yjeVar);
                }
                Object obj28 = m9g0Var.i;
                wne wneVar26 = wne.f39444a;
                int i52 = m9g0Var.j;
                if (i52 == 0) {
                    z1x.P(obj28);
                    r980 r980Var7 = new r980(kmqVar, (o9g0) obj, (byte) 13);
                    m9g0Var.j = 1;
                    if (((gmq) obj2).c(r980Var7, m9g0Var) == wneVar26) {
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
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof gph0) {
                    gph0Var = (gph0) yjeVar;
                    int i53 = gph0Var.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        gph0Var.j = i53 - Integer.MIN_VALUE;
                    } else {
                        gph0Var = new gph0(this, yjeVar);
                    }
                } else {
                    gph0Var = new gph0(this, yjeVar);
                }
                Object obj29 = gph0Var.i;
                wne wneVar27 = wne.f39444a;
                int i54 = gph0Var.j;
                if (i54 == 0) {
                    z1x.P(obj29);
                    hbb0 hbb0Var = new hbb0(kmqVar, (iph0) obj, (byte) 23);
                    gph0Var.j = 1;
                    if (((dnq) obj2).c(hbb0Var, gph0Var) == wneVar27) {
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
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof hdi0) {
                    hdi0Var = (hdi0) yjeVar;
                    int i55 = hdi0Var.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        hdi0Var.j = i55 - Integer.MIN_VALUE;
                    } else {
                        hdi0Var = new hdi0(this, yjeVar);
                    }
                } else {
                    hdi0Var = new hdi0(this, yjeVar);
                }
                Object obj30 = hdi0Var.i;
                wne wneVar28 = wne.f39444a;
                int i56 = hdi0Var.j;
                if (i56 == 0) {
                    z1x.P(obj30);
                    r980 r980Var8 = new r980(kmqVar, (zl60) obj, (byte) 18);
                    hdi0Var.j = 1;
                    if (((p5a) obj2).c(r980Var8, hdi0Var) == wneVar28) {
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
            default:
                Object objC2 = ((gmq) obj2).c(new r980(kmqVar, (ufi0) obj, b7), yjeVar);
                return objC2 == wne.f39444a ? objC2 : Unit.f46060a;
        }
    }
}
