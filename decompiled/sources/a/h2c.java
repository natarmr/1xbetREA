package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class h2c implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12323a;
    public final /* synthetic */ p7m0 b;

    public h2c(p7m0 p7m0Var) {
        this.f12323a = (byte) 3;
        bek bekVar = sip.f32274a;
        this.b = p7m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01be  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:126:0x0230  */
    /* JADX WARN: Code duplicated, block: B:139:0x026b  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:178:0x0316  */
    /* JADX WARN: Code duplicated, block: B:191:0x0351  */
    /* JADX WARN: Code duplicated, block: B:204:0x038c  */
    /* JADX WARN: Code duplicated, block: B:217:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:230:0x0401  */
    /* JADX WARN: Code duplicated, block: B:245:0x0449  */
    /* JADX WARN: Code duplicated, block: B:258:0x0482  */
    /* JADX WARN: Code duplicated, block: B:271:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:284:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:297:0x052f  */
    /* JADX WARN: Code duplicated, block: B:310:0x056a  */
    /* JADX WARN: Code duplicated, block: B:325:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:87:0x0183  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        f2c f2cVar;
        pag pagVar;
        wgg wggVar;
        qhk qhkVar;
        qap qapVar;
        sap sapVar;
        vap vapVar;
        cvs cvsVar;
        pmt pmtVar;
        ist istVar;
        nzt nztVar;
        quu quuVar;
        hlx hlxVar;
        zf20 zf20Var;
        lr30 lr30Var;
        x950 x950Var;
        vb60 vb60Var;
        md60 md60Var;
        nxj0 nxj0Var;
        htk0 htk0Var;
        v9n0 v9n0Var;
        lbq0 lbq0Var;
        prt0 prt0Var;
        keu0 keu0Var;
        hvv0 hvv0Var;
        byte b = this.f12323a;
        byte b2 = 17;
        byte b3 = 8;
        byte b4 = 0;
        byte b5 = 21;
        byte b6 = 25;
        p7m0 p7m0Var = this.b;
        byte b7 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof f2c) {
                    f2cVar = (f2c) yjeVar;
                    int i = f2cVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        f2cVar.j = i - Integer.MIN_VALUE;
                    } else {
                        f2cVar = new f2c(this, yjeVar);
                    }
                } else {
                    f2cVar = new f2c(this, yjeVar);
                }
                Object obj = f2cVar.i;
                wne wneVar = wne.f39444a;
                int i2 = f2cVar.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                osa osaVar = new osa(kmqVar, b3);
                f2cVar.j = 1;
                p7m0Var.c(osaVar, f2cVar);
                return wneVar;
            case 1:
                p7m0Var.c(new osa(kmqVar, b2), yjeVar);
                return wne.f39444a;
            case 2:
                if (yjeVar instanceof pag) {
                    pagVar = (pag) yjeVar;
                    int i3 = pagVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pagVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        pagVar = new pag(this, yjeVar);
                    }
                } else {
                    pagVar = new pag(this, yjeVar);
                }
                Object obj2 = pagVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = pagVar.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        z1x.P(obj2);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj2);
                k0f k0fVar = new k0f(kmqVar, (byte) 10);
                pagVar.j = 1;
                p7m0Var.c(k0fVar, pagVar);
                return wneVar2;
            case 3:
                if (yjeVar instanceof wgg) {
                    wggVar = (wgg) yjeVar;
                    int i5 = wggVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        wggVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        wggVar = new wgg(this, yjeVar);
                    }
                } else {
                    wggVar = new wgg(this, yjeVar);
                }
                Object obj3 = wggVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = wggVar.j;
                if (i6 != 0) {
                    if (i6 == 1) {
                        z1x.P(obj3);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj3);
                bek bekVar = sip.f32274a;
                k0f k0fVar2 = new k0f(kmqVar);
                wggVar.j = 1;
                p7m0Var.c(k0fVar2, wggVar);
                return wneVar3;
            case 4:
                if (yjeVar instanceof qhk) {
                    qhkVar = (qhk) yjeVar;
                    int i7 = qhkVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        qhkVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        qhkVar = new qhk(this, yjeVar);
                    }
                } else {
                    qhkVar = new qhk(this, yjeVar);
                }
                Object obj4 = qhkVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = qhkVar.j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        z1x.P(obj4);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj4);
                k0f k0fVar3 = new k0f(kmqVar, b2);
                qhkVar.j = 1;
                p7m0Var.c(k0fVar3, qhkVar);
                return wneVar4;
            case 5:
                if (yjeVar instanceof qap) {
                    qapVar = (qap) yjeVar;
                    int i9 = qapVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        qapVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        qapVar = new qap(this, yjeVar);
                    }
                } else {
                    qapVar = new qap(this, yjeVar);
                }
                Object obj5 = qapVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = qapVar.j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        z1x.P(obj5);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj5);
                k0f k0fVar4 = new k0f(kmqVar, (byte) 29);
                qapVar.j = 1;
                p7m0Var.c(k0fVar4, qapVar);
                return wneVar5;
            case 6:
                if (yjeVar instanceof sap) {
                    sapVar = (sap) yjeVar;
                    int i11 = sapVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        sapVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        sapVar = new sap(this, yjeVar);
                    }
                } else {
                    sapVar = new sap(this, yjeVar);
                }
                Object obj6 = sapVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = sapVar.j;
                if (i12 != 0) {
                    if (i12 == 1) {
                        z1x.P(obj6);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj6);
                uap uapVar = new uap(kmqVar, b4);
                sapVar.j = 1;
                p7m0Var.c(uapVar, sapVar);
                return wneVar6;
            case 7:
                if (yjeVar instanceof vap) {
                    vapVar = (vap) yjeVar;
                    int i13 = vapVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        vapVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        vapVar = new vap(this, yjeVar);
                    }
                } else {
                    vapVar = new vap(this, yjeVar);
                }
                Object obj7 = vapVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = vapVar.j;
                if (i14 != 0) {
                    if (i14 == 1) {
                        z1x.P(obj7);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj7);
                uap uapVar2 = new uap(kmqVar, b7);
                vapVar.j = 1;
                p7m0Var.c(uapVar2, vapVar);
                return wneVar7;
            case 8:
                p7m0Var.c(new uap(kmqVar, (byte) 9), yjeVar);
                return wne.f39444a;
            case 9:
                if (yjeVar instanceof cvs) {
                    cvsVar = (cvs) yjeVar;
                    int i15 = cvsVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        cvsVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        cvsVar = new cvs(this, yjeVar);
                    }
                } else {
                    cvsVar = new cvs(this, yjeVar);
                }
                Object obj8 = cvsVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = cvsVar.j;
                if (i16 != 0) {
                    if (i16 == 1) {
                        z1x.P(obj8);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj8);
                uap uapVar3 = new uap(kmqVar, (byte) 19);
                cvsVar.j = 1;
                p7m0Var.c(uapVar3, cvsVar);
                return wneVar8;
            case 10:
                if (yjeVar instanceof pmt) {
                    pmtVar = (pmt) yjeVar;
                    int i17 = pmtVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        pmtVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        pmtVar = new pmt(this, yjeVar);
                    }
                } else {
                    pmtVar = new pmt(this, yjeVar);
                }
                Object obj9 = pmtVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = pmtVar.j;
                if (i18 != 0) {
                    if (i18 == 1) {
                        z1x.P(obj9);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj9);
                uap uapVar4 = new uap(kmqVar, (byte) 27);
                pmtVar.j = 1;
                p7m0Var.c(uapVar4, pmtVar);
                return wneVar9;
            case 11:
                if (yjeVar instanceof ist) {
                    istVar = (ist) yjeVar;
                    int i19 = istVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        istVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        istVar = new ist(this, yjeVar);
                    }
                } else {
                    istVar = new ist(this, yjeVar);
                }
                Object obj10 = istVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = istVar.j;
                if (i20 != 0) {
                    if (i20 == 1) {
                        z1x.P(obj10);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj10);
                tnt tntVar = new tnt(kmqVar, (byte) 5);
                istVar.j = 1;
                p7m0Var.c(tntVar, istVar);
                return wneVar10;
            case 12:
                if (yjeVar instanceof nzt) {
                    nztVar = (nzt) yjeVar;
                    int i21 = nztVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        nztVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        nztVar = new nzt(this, yjeVar);
                    }
                } else {
                    nztVar = new nzt(this, yjeVar);
                }
                Object obj11 = nztVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = nztVar.j;
                if (i22 != 0) {
                    if (i22 == 1) {
                        z1x.P(obj11);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj11);
                tnt tntVar2 = new tnt(kmqVar, (byte) 16);
                nztVar.j = 1;
                p7m0Var.c(tntVar2, nztVar);
                return wneVar11;
            case 13:
                if (yjeVar instanceof quu) {
                    quuVar = (quu) yjeVar;
                    int i23 = quuVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        quuVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        quuVar = new quu(this, yjeVar);
                    }
                } else {
                    quuVar = new quu(this, yjeVar);
                }
                Object obj12 = quuVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = quuVar.j;
                if (i24 != 0) {
                    if (i24 == 1) {
                        z1x.P(obj12);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj12);
                y6u y6uVar = new y6u(kmqVar, (byte) 23);
                quuVar.j = 1;
                p7m0Var.c(y6uVar, quuVar);
                return wneVar12;
            case 14:
                if (yjeVar instanceof hlx) {
                    hlxVar = (hlx) yjeVar;
                    int i25 = hlxVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        hlxVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        hlxVar = new hlx(this, yjeVar);
                    }
                } else {
                    hlxVar = new hlx(this, yjeVar);
                }
                Object obj13 = hlxVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = hlxVar.j;
                if (i26 != 0) {
                    if (i26 == 1) {
                        z1x.P(obj13);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj13);
                b4v b4vVar = new b4v(kmqVar, b3);
                hlxVar.j = 1;
                p7m0Var.c(b4vVar, hlxVar);
                return wneVar13;
            case 15:
                if (yjeVar instanceof zf20) {
                    zf20Var = (zf20) yjeVar;
                    int i27 = zf20Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        zf20Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        zf20Var = new zf20(this, yjeVar);
                    }
                } else {
                    zf20Var = new zf20(this, yjeVar);
                }
                Object obj14 = zf20Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = zf20Var.j;
                if (i28 != 0) {
                    if (i28 == 1) {
                        z1x.P(obj14);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj14);
                b4v b4vVar2 = new b4v(kmqVar, b6);
                zf20Var.j = 1;
                p7m0Var.c(b4vVar2, zf20Var);
                return wneVar14;
            case 16:
                if (yjeVar instanceof lr30) {
                    lr30Var = (lr30) yjeVar;
                    int i29 = lr30Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        lr30Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        lr30Var = new lr30(this, yjeVar);
                    }
                } else {
                    lr30Var = new lr30(this, yjeVar);
                }
                Object obj15 = lr30Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = lr30Var.j;
                if (i30 != 0) {
                    if (i30 == 1) {
                        z1x.P(obj15);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj15);
                nr30 nr30Var = new nr30(kmqVar, b4);
                lr30Var.j = 1;
                p7m0Var.c(nr30Var, lr30Var);
                return wneVar15;
            case 17:
                if (yjeVar instanceof x950) {
                    x950Var = (x950) yjeVar;
                    int i31 = x950Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        x950Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        x950Var = new x950(this, yjeVar);
                    }
                } else {
                    x950Var = new x950(this, yjeVar);
                }
                Object obj16 = x950Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = x950Var.j;
                if (i32 != 0) {
                    if (i32 == 1) {
                        z1x.P(obj16);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj16);
                nr30 nr30Var2 = new nr30(kmqVar, (byte) 11);
                x950Var.j = 1;
                p7m0Var.c(nr30Var2, x950Var);
                return wneVar16;
            case 18:
                if (yjeVar instanceof vb60) {
                    vb60Var = (vb60) yjeVar;
                    int i33 = vb60Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        vb60Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        vb60Var = new vb60(this, yjeVar);
                    }
                } else {
                    vb60Var = new vb60(this, yjeVar);
                }
                Object obj17 = vb60Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = vb60Var.j;
                if (i34 != 0) {
                    if (i34 == 1) {
                        z1x.P(obj17);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj17);
                nr30 nr30Var3 = new nr30(kmqVar, b5);
                vb60Var.j = 1;
                p7m0Var.c(nr30Var3, vb60Var);
                return wneVar17;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof md60) {
                    md60Var = (md60) yjeVar;
                    int i35 = md60Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        md60Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        md60Var = new md60(this, yjeVar);
                    }
                } else {
                    md60Var = new md60(this, yjeVar);
                }
                Object obj18 = md60Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = md60Var.j;
                if (i36 != 0) {
                    if (i36 == 1) {
                        z1x.P(obj18);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj18);
                ld60 ld60Var = new ld60(kmqVar, b7);
                md60Var.j = 1;
                p7m0Var.c(ld60Var, md60Var);
                return wneVar18;
            case 20:
                if (yjeVar instanceof nxj0) {
                    nxj0Var = (nxj0) yjeVar;
                    int i37 = nxj0Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        nxj0Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        nxj0Var = new nxj0(this, yjeVar);
                    }
                } else {
                    nxj0Var = new nxj0(this, yjeVar);
                }
                Object obj19 = nxj0Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = nxj0Var.j;
                if (i38 != 0) {
                    if (i38 == 1) {
                        z1x.P(obj19);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj19);
                r5j0 r5j0Var = new r5j0(kmqVar, (byte) 14);
                nxj0Var.j = 1;
                p7m0Var.c(r5j0Var, nxj0Var);
                return wneVar19;
            case 21:
                if (yjeVar instanceof htk0) {
                    htk0Var = (htk0) yjeVar;
                    int i39 = htk0Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        htk0Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        htk0Var = new htk0(this, yjeVar);
                    }
                } else {
                    htk0Var = new htk0(this, yjeVar);
                }
                Object obj20 = htk0Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = htk0Var.j;
                if (i40 != 0) {
                    if (i40 == 1) {
                        z1x.P(obj20);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj20);
                r5j0 r5j0Var2 = new r5j0(kmqVar, (byte) 20);
                htk0Var.j = 1;
                p7m0Var.c(r5j0Var2, htk0Var);
                return wneVar20;
            case 22:
                if (yjeVar instanceof v9n0) {
                    v9n0Var = (v9n0) yjeVar;
                    int i41 = v9n0Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        v9n0Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        v9n0Var = new v9n0(this, yjeVar);
                    }
                } else {
                    v9n0Var = new v9n0(this, yjeVar);
                }
                Object obj21 = v9n0Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = v9n0Var.j;
                if (i42 != 0) {
                    if (i42 == 1) {
                        z1x.P(obj21);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj21);
                d8n0 d8n0Var = new d8n0(kmqVar, (byte) 2);
                v9n0Var.j = 1;
                p7m0Var.c(d8n0Var, v9n0Var);
                return wneVar21;
            case 23:
                if (yjeVar instanceof lbq0) {
                    lbq0Var = (lbq0) yjeVar;
                    int i43 = lbq0Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        lbq0Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        lbq0Var = new lbq0(this, yjeVar);
                    }
                } else {
                    lbq0Var = new lbq0(this, yjeVar);
                }
                Object obj22 = lbq0Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = lbq0Var.j;
                if (i44 != 0) {
                    if (i44 == 1) {
                        z1x.P(obj22);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj22);
                d8n0 d8n0Var2 = new d8n0(kmqVar, b5);
                lbq0Var.j = 1;
                p7m0Var.c(d8n0Var2, lbq0Var);
                return wneVar22;
            case 24:
                if (yjeVar instanceof prt0) {
                    prt0Var = (prt0) yjeVar;
                    int i45 = prt0Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        prt0Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        prt0Var = new prt0(this, yjeVar);
                    }
                } else {
                    prt0Var = new prt0(this, yjeVar);
                }
                Object obj23 = prt0Var.i;
                wne wneVar23 = wne.f39444a;
                int i46 = prt0Var.j;
                if (i46 != 0) {
                    if (i46 == 1) {
                        z1x.P(obj23);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj23);
                d8n0 d8n0Var3 = new d8n0(kmqVar, b6);
                prt0Var.j = 1;
                p7m0Var.c(d8n0Var3, prt0Var);
                return wneVar23;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof keu0) {
                    keu0Var = (keu0) yjeVar;
                    int i47 = keu0Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        keu0Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        keu0Var = new keu0(this, yjeVar);
                    }
                } else {
                    keu0Var = new keu0(this, yjeVar);
                }
                Object obj24 = keu0Var.i;
                wne wneVar24 = wne.f39444a;
                int i48 = keu0Var.j;
                if (i48 != 0) {
                    if (i48 == 1) {
                        z1x.P(obj24);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj24);
                d8n0 d8n0Var4 = new d8n0(kmqVar, (byte) 28);
                keu0Var.j = 1;
                p7m0Var.c(d8n0Var4, keu0Var);
                return wneVar24;
            default:
                if (yjeVar instanceof hvv0) {
                    hvv0Var = (hvv0) yjeVar;
                    int i49 = hvv0Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        hvv0Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        hvv0Var = new hvv0(this, yjeVar);
                    }
                } else {
                    hvv0Var = new hvv0(this, yjeVar);
                }
                Object obj25 = hvv0Var.i;
                wne wneVar25 = wne.f39444a;
                int i50 = hvv0Var.j;
                if (i50 != 0) {
                    if (i50 == 1) {
                        z1x.P(obj25);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj25);
                ofv0 ofv0Var = new ofv0(kmqVar, (byte) 3);
                hvv0Var.j = 1;
                p7m0Var.c(ofv0Var, hvv0Var);
                return wneVar25;
        }
    }

    public /* synthetic */ h2c(p7m0 p7m0Var, byte b) {
        this.f12323a = b;
        this.b = p7m0Var;
    }
}
