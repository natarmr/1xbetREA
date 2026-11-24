package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class i89 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14327a;
    public final /* synthetic */ gmq b;

    public /* synthetic */ i89(gmq gmqVar, byte b) {
        this.f14327a = b;
        this.b = gmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01da  */
    /* JADX WARN: Code duplicated, block: B:136:0x0218  */
    /* JADX WARN: Code duplicated, block: B:152:0x0255  */
    /* JADX WARN: Code duplicated, block: B:168:0x0292  */
    /* JADX WARN: Code duplicated, block: B:184:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:200:0x030e  */
    /* JADX WARN: Code duplicated, block: B:216:0x034b  */
    /* JADX WARN: Code duplicated, block: B:232:0x038a  */
    /* JADX WARN: Code duplicated, block: B:248:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:264:0x0406  */
    /* JADX WARN: Code duplicated, block: B:280:0x0443  */
    /* JADX WARN: Code duplicated, block: B:296:0x0482  */
    /* JADX WARN: Code duplicated, block: B:312:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:328:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:344:0x053b  */
    /* JADX WARN: Code duplicated, block: B:360:0x0578  */
    /* JADX WARN: Code duplicated, block: B:376:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:392:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:408:0x0631  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:424:0x0670  */
    /* JADX WARN: Code duplicated, block: B:440:0x06af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:89:0x0161  */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        g89 g89Var;
        ij9 ij9Var;
        mj9 mj9Var;
        ql9 ql9Var;
        nxb nxbVar;
        nxc nxcVar;
        ivd ivdVar;
        byd bydVar;
        g7e g7eVar;
        cae caeVar;
        mce mceVar;
        s0f s0fVar;
        tvf tvfVar;
        t0g t0gVar;
        v0g v0gVar;
        cdg cdgVar;
        y7h y7hVar;
        duk dukVar;
        oap oapVar;
        qbp qbpVar;
        opp oppVar;
        qor qorVar;
        q3s q3sVar;
        l8s l8sVar;
        eks eksVar;
        jvs jvsVar;
        pzs pzsVar;
        byte b = this.f14327a;
        byte b2 = 6;
        byte b3 = 11;
        byte b4 = 28;
        byte b5 = 2;
        byte b6 = 13;
        byte b7 = 21;
        byte b8 = 15;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof g89) {
                    g89Var = (g89) yjeVar;
                    int i = g89Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        g89Var.j = i - Integer.MIN_VALUE;
                    } else {
                        g89Var = new g89(this, yjeVar);
                    }
                } else {
                    g89Var = new g89(this, yjeVar);
                }
                Object obj = g89Var.i;
                wne wneVar = wne.f39444a;
                int i2 = g89Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    qo3 qo3Var = new qo3(kmqVar, b7);
                    g89Var.j = 1;
                    if (gmqVar.c(qo3Var, g89Var) == wneVar) {
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
                if (yjeVar instanceof ij9) {
                    ij9Var = (ij9) yjeVar;
                    int i3 = ij9Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ij9Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        ij9Var = new ij9(this, yjeVar);
                    }
                } else {
                    ij9Var = new ij9(this, yjeVar);
                }
                Object obj2 = ij9Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = ij9Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    qo3 qo3Var2 = new qo3(kmqVar, (byte) 22);
                    ij9Var.j = 1;
                    if (gmqVar.c(qo3Var2, ij9Var) == wneVar2) {
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
                if (yjeVar instanceof mj9) {
                    mj9Var = (mj9) yjeVar;
                    int i5 = mj9Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mj9Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        mj9Var = new mj9(this, yjeVar);
                    }
                } else {
                    mj9Var = new mj9(this, yjeVar);
                }
                Object obj3 = mj9Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = mj9Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    qo3 qo3Var3 = new qo3(kmqVar, (byte) 24);
                    mj9Var.j = 1;
                    if (gmqVar.c(qo3Var3, mj9Var) == wneVar3) {
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
                if (yjeVar instanceof ql9) {
                    ql9Var = (ql9) yjeVar;
                    int i7 = ql9Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ql9Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        ql9Var = new ql9(this, yjeVar);
                    }
                } else {
                    ql9Var = new ql9(this, yjeVar);
                }
                Object obj4 = ql9Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = ql9Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    qo3 qo3Var4 = new qo3(kmqVar, (byte) 26);
                    ql9Var.j = 1;
                    if (gmqVar.c(qo3Var4, ql9Var) == wneVar4) {
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
                if (yjeVar instanceof nxb) {
                    nxbVar = (nxb) yjeVar;
                    int i9 = nxbVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        nxbVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        nxbVar = new nxb(this, yjeVar);
                    }
                } else {
                    nxbVar = new nxb(this, yjeVar);
                }
                Object obj5 = nxbVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = nxbVar.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    osa osaVar = new osa(kmqVar, b2);
                    nxbVar.j = 1;
                    if (gmqVar.c(osaVar, nxbVar) == wneVar5) {
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
                if (yjeVar instanceof nxc) {
                    nxcVar = (nxc) yjeVar;
                    int i11 = nxcVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nxcVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        nxcVar = new nxc(this, yjeVar);
                    }
                } else {
                    nxcVar = new nxc(this, yjeVar);
                }
                Object obj6 = nxcVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = nxcVar.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    osa osaVar2 = new osa(kmqVar, b3);
                    nxcVar.j = 1;
                    if (gmqVar.c(osaVar2, nxcVar) == wneVar6) {
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
                if (yjeVar instanceof ivd) {
                    ivdVar = (ivd) yjeVar;
                    int i13 = ivdVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ivdVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        ivdVar = new ivd(this, yjeVar);
                    }
                } else {
                    ivdVar = new ivd(this, yjeVar);
                }
                Object obj7 = ivdVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = ivdVar.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    osa osaVar3 = new osa(kmqVar, b6);
                    ivdVar.j = 1;
                    if (gmqVar.c(osaVar3, ivdVar) == wneVar7) {
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
                if (yjeVar instanceof byd) {
                    bydVar = (byd) yjeVar;
                    int i15 = bydVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        bydVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        bydVar = new byd(this, yjeVar);
                    }
                } else {
                    bydVar = new byd(this, yjeVar);
                }
                Object obj8 = bydVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = bydVar.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    osa osaVar4 = new osa(kmqVar, b8);
                    bydVar.j = 1;
                    if (gmqVar.c(osaVar4, bydVar) == wneVar8) {
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
                if (yjeVar instanceof g7e) {
                    g7eVar = (g7e) yjeVar;
                    int i17 = g7eVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        g7eVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        g7eVar = new g7e(this, yjeVar);
                    }
                } else {
                    g7eVar = new g7e(this, yjeVar);
                }
                Object obj9 = g7eVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = g7eVar.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    osa osaVar5 = new osa(kmqVar, (byte) 19);
                    g7eVar.j = 1;
                    if (gmqVar.c(osaVar5, g7eVar) == wneVar9) {
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
                if (yjeVar instanceof cae) {
                    caeVar = (cae) yjeVar;
                    int i19 = caeVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        caeVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        caeVar = new cae(this, yjeVar);
                    }
                } else {
                    caeVar = new cae(this, yjeVar);
                }
                Object obj10 = caeVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = caeVar.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    osa osaVar6 = new osa(kmqVar, b4);
                    caeVar.j = 1;
                    if (gmqVar.c(osaVar6, caeVar) == wneVar10) {
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
                if (yjeVar instanceof mce) {
                    mceVar = (mce) yjeVar;
                    int i21 = mceVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        mceVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        mceVar = new mce(this, yjeVar);
                    }
                } else {
                    mceVar = new mce(this, yjeVar);
                }
                Object obj11 = mceVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = mceVar.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    osa osaVar7 = new osa(kmqVar, (byte) 29);
                    mceVar.j = 1;
                    if (gmqVar.c(osaVar7, mceVar) == wneVar11) {
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
                if (yjeVar instanceof s0f) {
                    s0fVar = (s0f) yjeVar;
                    int i23 = s0fVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        s0fVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        s0fVar = new s0f(this, yjeVar);
                    }
                } else {
                    s0fVar = new s0f(this, yjeVar);
                }
                Object obj12 = s0fVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = s0fVar.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    k0f k0fVar = new k0f(kmqVar, b5);
                    s0fVar.j = 1;
                    if (gmqVar.c(k0fVar, s0fVar) == wneVar12) {
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
                if (yjeVar instanceof tvf) {
                    tvfVar = (tvf) yjeVar;
                    int i25 = tvfVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        tvfVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        tvfVar = new tvf(this, yjeVar);
                    }
                } else {
                    tvfVar = new tvf(this, yjeVar);
                }
                Object obj13 = tvfVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = tvfVar.j;
                if (i26 == 0) {
                    z1x.P(obj13);
                    k0f k0fVar2 = new k0f(kmqVar, b2);
                    tvfVar.j = 1;
                    if (gmqVar.c(k0fVar2, tvfVar) == wneVar13) {
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
                if (yjeVar instanceof t0g) {
                    t0gVar = (t0g) yjeVar;
                    int i27 = t0gVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        t0gVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        t0gVar = new t0g(this, yjeVar);
                    }
                } else {
                    t0gVar = new t0g(this, yjeVar);
                }
                Object obj14 = t0gVar.i;
                wne wneVar14 = wne.f39444a;
                int i28 = t0gVar.j;
                if (i28 == 0) {
                    z1x.P(obj14);
                    k0f k0fVar3 = new k0f(kmqVar, (byte) 8);
                    t0gVar.j = 1;
                    if (gmqVar.c(k0fVar3, t0gVar) == wneVar14) {
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
                if (yjeVar instanceof v0g) {
                    v0gVar = (v0g) yjeVar;
                    int i29 = v0gVar.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        v0gVar.j = i29 - Integer.MIN_VALUE;
                    } else {
                        v0gVar = new v0g(this, yjeVar);
                    }
                } else {
                    v0gVar = new v0g(this, yjeVar);
                }
                Object obj15 = v0gVar.i;
                wne wneVar15 = wne.f39444a;
                int i30 = v0gVar.j;
                if (i30 == 0) {
                    z1x.P(obj15);
                    k0f k0fVar4 = new k0f(kmqVar, (byte) 9);
                    v0gVar.j = 1;
                    if (gmqVar.c(k0fVar4, v0gVar) == wneVar15) {
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
                if (yjeVar instanceof cdg) {
                    cdgVar = (cdg) yjeVar;
                    int i31 = cdgVar.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        cdgVar.j = i31 - Integer.MIN_VALUE;
                    } else {
                        cdgVar = new cdg(this, yjeVar);
                    }
                } else {
                    cdgVar = new cdg(this, yjeVar);
                }
                Object obj16 = cdgVar.i;
                wne wneVar16 = wne.f39444a;
                int i32 = cdgVar.j;
                if (i32 == 0) {
                    z1x.P(obj16);
                    k0f k0fVar5 = new k0f(kmqVar, b3);
                    cdgVar.j = 1;
                    if (gmqVar.c(k0fVar5, cdgVar) == wneVar16) {
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
                if (yjeVar instanceof y7h) {
                    y7hVar = (y7h) yjeVar;
                    int i33 = y7hVar.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        y7hVar.j = i33 - Integer.MIN_VALUE;
                    } else {
                        y7hVar = new y7h(this, yjeVar);
                    }
                } else {
                    y7hVar = new y7h(this, yjeVar);
                }
                Object obj17 = y7hVar.i;
                wne wneVar17 = wne.f39444a;
                int i34 = y7hVar.j;
                if (i34 == 0) {
                    z1x.P(obj17);
                    k0f k0fVar6 = new k0f(kmqVar, b8);
                    y7hVar.j = 1;
                    if (gmqVar.c(k0fVar6, y7hVar) == wneVar17) {
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
                if (yjeVar instanceof duk) {
                    dukVar = (duk) yjeVar;
                    int i35 = dukVar.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        dukVar.j = i35 - Integer.MIN_VALUE;
                    } else {
                        dukVar = new duk(this, yjeVar);
                    }
                } else {
                    dukVar = new duk(this, yjeVar);
                }
                Object obj18 = dukVar.i;
                wne wneVar18 = wne.f39444a;
                int i36 = dukVar.j;
                if (i36 == 0) {
                    z1x.P(obj18);
                    k0f k0fVar7 = new k0f(kmqVar, (byte) 18);
                    dukVar.j = 1;
                    if (gmqVar.c(k0fVar7, dukVar) == wneVar18) {
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
                if (yjeVar instanceof oap) {
                    oapVar = (oap) yjeVar;
                    int i37 = oapVar.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        oapVar.j = i37 - Integer.MIN_VALUE;
                    } else {
                        oapVar = new oap(this, yjeVar);
                    }
                } else {
                    oapVar = new oap(this, yjeVar);
                }
                Object obj19 = oapVar.i;
                wne wneVar19 = wne.f39444a;
                int i38 = oapVar.j;
                if (i38 == 0) {
                    z1x.P(obj19);
                    k0f k0fVar8 = new k0f(kmqVar, b4);
                    oapVar.j = 1;
                    if (gmqVar.c(k0fVar8, oapVar) == wneVar19) {
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
                if (yjeVar instanceof qbp) {
                    qbpVar = (qbp) yjeVar;
                    int i39 = qbpVar.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        qbpVar.j = i39 - Integer.MIN_VALUE;
                    } else {
                        qbpVar = new qbp(this, yjeVar);
                    }
                } else {
                    qbpVar = new qbp(this, yjeVar);
                }
                Object obj20 = qbpVar.i;
                wne wneVar20 = wne.f39444a;
                int i40 = qbpVar.j;
                if (i40 == 0) {
                    z1x.P(obj20);
                    uap uapVar = new uap(kmqVar, b5);
                    qbpVar.j = 1;
                    if (gmqVar.c(uapVar, qbpVar) == wneVar20) {
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
                if (yjeVar instanceof opp) {
                    oppVar = (opp) yjeVar;
                    int i41 = oppVar.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        oppVar.j = i41 - Integer.MIN_VALUE;
                    } else {
                        oppVar = new opp(this, yjeVar);
                    }
                } else {
                    oppVar = new opp(this, yjeVar);
                }
                Object obj21 = oppVar.i;
                wne wneVar21 = wne.f39444a;
                int i42 = oppVar.j;
                if (i42 == 0) {
                    z1x.P(obj21);
                    uap uapVar2 = new uap(kmqVar, (byte) 5);
                    oppVar.j = 1;
                    if (gmqVar.c(uapVar2, oppVar) == wneVar21) {
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
                Object objC = gmqVar.c(new uap(kmqVar, (byte) 10), yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
            case 22:
                Object objC2 = gmqVar.c(new uap(kmqVar, (byte) 12), yjeVar);
                return objC2 == wne.f39444a ? objC2 : Unit.f46060a;
            case 23:
                Object objC3 = gmqVar.c(new xj9(kmqVar, new kie0()), yjeVar);
                return objC3 == wne.f39444a ? objC3 : Unit.f46060a;
            case 24:
                if (yjeVar instanceof qor) {
                    qorVar = (qor) yjeVar;
                    int i43 = qorVar.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        qorVar.j = i43 - Integer.MIN_VALUE;
                    } else {
                        qorVar = new qor(this, yjeVar);
                    }
                } else {
                    qorVar = new qor(this, yjeVar);
                }
                Object obj22 = qorVar.i;
                wne wneVar22 = wne.f39444a;
                int i44 = qorVar.j;
                if (i44 == 0) {
                    z1x.P(obj22);
                    uap uapVar3 = new uap(kmqVar, b6);
                    qorVar.j = 1;
                    if (gmqVar.c(uapVar3, qorVar) == wneVar22) {
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
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof q3s) {
                    q3sVar = (q3s) yjeVar;
                    int i45 = q3sVar.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        q3sVar.j = i45 - Integer.MIN_VALUE;
                    } else {
                        q3sVar = new q3s(this, yjeVar);
                    }
                } else {
                    q3sVar = new q3s(this, yjeVar);
                }
                Object obj23 = q3sVar.i;
                wne wneVar23 = wne.f39444a;
                int i46 = q3sVar.j;
                if (i46 == 0) {
                    z1x.P(obj23);
                    uap uapVar4 = new uap(kmqVar, (byte) 14);
                    q3sVar.j = 1;
                    if (gmqVar.c(uapVar4, q3sVar) == wneVar23) {
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
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof l8s) {
                    l8sVar = (l8s) yjeVar;
                    int i47 = l8sVar.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        l8sVar.j = i47 - Integer.MIN_VALUE;
                    } else {
                        l8sVar = new l8s(this, yjeVar);
                    }
                } else {
                    l8sVar = new l8s(this, yjeVar);
                }
                Object obj24 = l8sVar.i;
                wne wneVar24 = wne.f39444a;
                int i48 = l8sVar.j;
                if (i48 == 0) {
                    z1x.P(obj24);
                    uap uapVar5 = new uap(kmqVar, b8);
                    l8sVar.j = 1;
                    if (gmqVar.c(uapVar5, l8sVar) == wneVar24) {
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
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof eks) {
                    eksVar = (eks) yjeVar;
                    int i49 = eksVar.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        eksVar.j = i49 - Integer.MIN_VALUE;
                    } else {
                        eksVar = new eks(this, yjeVar);
                    }
                } else {
                    eksVar = new eks(this, yjeVar);
                }
                Object obj25 = eksVar.i;
                wne wneVar25 = wne.f39444a;
                int i50 = eksVar.j;
                if (i50 == 0) {
                    z1x.P(obj25);
                    uap uapVar6 = new uap(kmqVar, (byte) 17);
                    eksVar.j = 1;
                    if (gmqVar.c(uapVar6, eksVar) == wneVar25) {
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
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof jvs) {
                    jvsVar = (jvs) yjeVar;
                    int i51 = jvsVar.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        jvsVar.j = i51 - Integer.MIN_VALUE;
                    } else {
                        jvsVar = new jvs(this, yjeVar);
                    }
                } else {
                    jvsVar = new jvs(this, yjeVar);
                }
                Object obj26 = jvsVar.i;
                wne wneVar26 = wne.f39444a;
                int i52 = jvsVar.j;
                if (i52 == 0) {
                    z1x.P(obj26);
                    uap uapVar7 = new uap(kmqVar, b7);
                    jvsVar.j = 1;
                    if (gmqVar.c(uapVar7, jvsVar) == wneVar26) {
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
            default:
                if (yjeVar instanceof pzs) {
                    pzsVar = (pzs) yjeVar;
                    int i53 = pzsVar.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        pzsVar.j = i53 - Integer.MIN_VALUE;
                    } else {
                        pzsVar = new pzs(this, yjeVar);
                    }
                } else {
                    pzsVar = new pzs(this, yjeVar);
                }
                Object obj27 = pzsVar.i;
                wne wneVar27 = wne.f39444a;
                int i54 = pzsVar.j;
                if (i54 == 0) {
                    z1x.P(obj27);
                    uap uapVar8 = new uap(kmqVar, (byte) 23);
                    pzsVar.j = 1;
                    if (gmqVar.c(uapVar8, pzsVar) == wneVar27) {
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
        }
    }
}
