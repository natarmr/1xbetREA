package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class va implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37059a;
    public final /* synthetic */ qoj0 b;

    public /* synthetic */ va(qoj0 qoj0Var, byte b) {
        this.f37059a = b;
        this.b = qoj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:126:0x022f  */
    /* JADX WARN: Code duplicated, block: B:139:0x026a  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:165:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:178:0x0318  */
    /* JADX WARN: Code duplicated, block: B:191:0x0351  */
    /* JADX WARN: Code duplicated, block: B:204:0x038b  */
    /* JADX WARN: Code duplicated, block: B:217:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:230:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:243:0x043a  */
    /* JADX WARN: Code duplicated, block: B:256:0x0475  */
    /* JADX WARN: Code duplicated, block: B:269:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:282:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:295:0x0522  */
    /* JADX WARN: Code duplicated, block: B:308:0x055d  */
    /* JADX WARN: Code duplicated, block: B:321:0x0596  */
    /* JADX WARN: Code duplicated, block: B:334:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x010e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:87:0x0181  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) throws Throwable {
        sa saVar;
        u87 u87Var;
        r4a r4aVar;
        tnc tncVar;
        x7e x7eVar;
        z7e z7eVar;
        b8e b8eVar;
        d8e d8eVar;
        f8e f8eVar;
        k8e k8eVar;
        m8e m8eVar;
        c6f c6fVar;
        rtf rtfVar;
        cen cenVar;
        een eenVar;
        eaw eawVar;
        af00 af00Var;
        b340 b340Var;
        cj40 cj40Var;
        wq70 wq70Var;
        mbb0 mbb0Var;
        mmb0 mmb0Var;
        zgo0 zgo0Var;
        mio0 mio0Var;
        ttq0 ttq0Var;
        mfv0 mfv0Var;
        byte b = this.f37059a;
        byte b2 = 27;
        byte b3 = 21;
        byte b4 = 5;
        byte b5 = 17;
        byte b6 = 22;
        byte b7 = 0;
        qoj0 qoj0Var = this.b;
        byte b8 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof sa) {
                    saVar = (sa) yjeVar;
                    int i = saVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        saVar.j = i - Integer.MIN_VALUE;
                    } else {
                        saVar = new sa(this, yjeVar);
                    }
                } else {
                    saVar = new sa(this, yjeVar);
                }
                Object obj = saVar.i;
                wne wneVar = wne.f39444a;
                int i2 = saVar.j;
                if (i2 != 0) {
                    if (i2 == 1) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ua uaVar = new ua(kmqVar, b7);
                saVar.j = 1;
                qoj0Var.c(uaVar, saVar);
                return wneVar;
            case 1:
                if (yjeVar instanceof u87) {
                    u87Var = (u87) yjeVar;
                    int i3 = u87Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        u87Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        u87Var = new u87(this, yjeVar);
                    }
                } else {
                    u87Var = new u87(this, yjeVar);
                }
                Object obj2 = u87Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = u87Var.j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        z1x.P(obj2);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj2);
                qo3 qo3Var = new qo3(kmqVar, b5);
                u87Var.j = 1;
                qoj0Var.c(qo3Var, u87Var);
                return wneVar2;
            case 2:
                if (yjeVar instanceof r4a) {
                    r4aVar = (r4a) yjeVar;
                    int i5 = r4aVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        r4aVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        r4aVar = new r4a(this, yjeVar);
                    }
                } else {
                    r4aVar = new r4a(this, yjeVar);
                }
                Object obj3 = r4aVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = r4aVar.j;
                if (i6 != 0) {
                    if (i6 == 1) {
                        z1x.P(obj3);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj3);
                qo3 qo3Var2 = new qo3(kmqVar, b2);
                r4aVar.j = 1;
                qoj0Var.c(qo3Var2, r4aVar);
                return wneVar3;
            case 3:
                if (yjeVar instanceof tnc) {
                    tncVar = (tnc) yjeVar;
                    int i7 = tncVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        tncVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        tncVar = new tnc(this, yjeVar);
                    }
                } else {
                    tncVar = new tnc(this, yjeVar);
                }
                Object obj4 = tncVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = tncVar.j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        z1x.P(obj4);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj4);
                osa osaVar = new osa(kmqVar, (byte) 10);
                tncVar.j = 1;
                qoj0Var.c(osaVar, tncVar);
                return wneVar4;
            case 4:
                if (yjeVar instanceof x7e) {
                    x7eVar = (x7e) yjeVar;
                    int i9 = x7eVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        x7eVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        x7eVar = new x7e(this, yjeVar);
                    }
                } else {
                    x7eVar = new x7e(this, yjeVar);
                }
                Object obj5 = x7eVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = x7eVar.j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        z1x.P(obj5);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj5);
                osa osaVar2 = new osa(kmqVar, b3);
                x7eVar.j = 1;
                qoj0Var.c(osaVar2, x7eVar);
                return wneVar5;
            case 5:
                if (yjeVar instanceof z7e) {
                    z7eVar = (z7e) yjeVar;
                    int i11 = z7eVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        z7eVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        z7eVar = new z7e(this, yjeVar);
                    }
                } else {
                    z7eVar = new z7e(this, yjeVar);
                }
                Object obj6 = z7eVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = z7eVar.j;
                if (i12 != 0) {
                    if (i12 == 1) {
                        z1x.P(obj6);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj6);
                osa osaVar3 = new osa(kmqVar, b6);
                z7eVar.j = 1;
                qoj0Var.c(osaVar3, z7eVar);
                return wneVar6;
            case 6:
                if (yjeVar instanceof b8e) {
                    b8eVar = (b8e) yjeVar;
                    int i13 = b8eVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        b8eVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        b8eVar = new b8e(this, yjeVar);
                    }
                } else {
                    b8eVar = new b8e(this, yjeVar);
                }
                Object obj7 = b8eVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = b8eVar.j;
                if (i14 != 0) {
                    if (i14 == 1) {
                        z1x.P(obj7);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj7);
                osa osaVar4 = new osa(kmqVar, (byte) 23);
                b8eVar.j = 1;
                qoj0Var.c(osaVar4, b8eVar);
                return wneVar7;
            case 7:
                if (yjeVar instanceof d8e) {
                    d8eVar = (d8e) yjeVar;
                    int i15 = d8eVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        d8eVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        d8eVar = new d8e(this, yjeVar);
                    }
                } else {
                    d8eVar = new d8e(this, yjeVar);
                }
                Object obj8 = d8eVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = d8eVar.j;
                if (i16 != 0) {
                    if (i16 == 1) {
                        z1x.P(obj8);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj8);
                osa osaVar5 = new osa(kmqVar, (byte) 24);
                d8eVar.j = 1;
                qoj0Var.c(osaVar5, d8eVar);
                return wneVar8;
            case 8:
                if (yjeVar instanceof f8e) {
                    f8eVar = (f8e) yjeVar;
                    int i17 = f8eVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        f8eVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        f8eVar = new f8e(this, yjeVar);
                    }
                } else {
                    f8eVar = new f8e(this, yjeVar);
                }
                Object obj9 = f8eVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = f8eVar.j;
                if (i18 != 0) {
                    if (i18 == 1) {
                        z1x.P(obj9);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj9);
                osa osaVar6 = new osa(kmqVar, (byte) 25);
                f8eVar.j = 1;
                qoj0Var.c(osaVar6, f8eVar);
                return wneVar9;
            case 9:
                if (yjeVar instanceof k8e) {
                    k8eVar = (k8e) yjeVar;
                    int i19 = k8eVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        k8eVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        k8eVar = new k8e(this, yjeVar);
                    }
                } else {
                    k8eVar = new k8e(this, yjeVar);
                }
                Object obj10 = k8eVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = k8eVar.j;
                if (i20 != 0) {
                    if (i20 == 1) {
                        z1x.P(obj10);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj10);
                osa osaVar7 = new osa(kmqVar, (byte) 26);
                k8eVar.j = 1;
                qoj0Var.c(osaVar7, k8eVar);
                return wneVar10;
            case 10:
                if (yjeVar instanceof m8e) {
                    m8eVar = (m8e) yjeVar;
                    int i21 = m8eVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        m8eVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        m8eVar = new m8e(this, yjeVar);
                    }
                } else {
                    m8eVar = new m8e(this, yjeVar);
                }
                Object obj11 = m8eVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = m8eVar.j;
                if (i22 != 0) {
                    if (i22 == 1) {
                        z1x.P(obj11);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj11);
                osa osaVar8 = new osa(kmqVar, b2);
                m8eVar.j = 1;
                qoj0Var.c(osaVar8, m8eVar);
                return wneVar11;
            case 11:
                if (yjeVar instanceof c6f) {
                    c6fVar = (c6f) yjeVar;
                    int i23 = c6fVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        c6fVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        c6fVar = new c6f(this, yjeVar);
                    }
                } else {
                    c6fVar = new c6f(this, yjeVar);
                }
                Object obj12 = c6fVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = c6fVar.j;
                if (i24 != 0) {
                    if (i24 == 1) {
                        z1x.P(obj12);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj12);
                k0f k0fVar = new k0f(kmqVar, (byte) 3);
                c6fVar.j = 1;
                qoj0Var.c(k0fVar, c6fVar);
                return wneVar12;
            case 12:
                if (yjeVar instanceof rtf) {
                    rtfVar = (rtf) yjeVar;
                    int i25 = rtfVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        rtfVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        rtfVar = new rtf(this, yjeVar);
                    }
                } else {
                    rtfVar = new rtf(this, yjeVar);
                }
                Object obj13 = rtfVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = rtfVar.j;
                if (i26 != 0) {
                    if (i26 == 1) {
                        z1x.P(obj13);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj13);
                k0f k0fVar2 = new k0f(kmqVar, b4);
                rtfVar.j = 1;
                qoj0Var.c(k0fVar2, rtfVar);
                return wneVar13;
            case 13:
                if (yjeVar instanceof cen) {
                    cenVar = (cen) yjeVar;
                    int i27 = cenVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        cenVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        cenVar = new cen(this, yjeVar);
                    }
                } else {
                    cenVar = new cen(this, yjeVar);
                }
                Object obj14 = cenVar.i;
                wne wneVar14 = wne.f39444a;
                int i28 = cenVar.j;
                if (i28 != 0) {
                    if (i28 == 1) {
                        z1x.P(obj14);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj14);
                k0f k0fVar3 = new k0f(kmqVar, (byte) 20);
                cenVar.j = 1;
                qoj0Var.c(k0fVar3, cenVar);
                return wneVar14;
            case 14:
                if (yjeVar instanceof een) {
                    eenVar = (een) yjeVar;
                    int i29 = eenVar.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        eenVar.j = i29 - Integer.MIN_VALUE;
                    } else {
                        eenVar = new een(this, yjeVar);
                    }
                } else {
                    eenVar = new een(this, yjeVar);
                }
                Object obj15 = eenVar.i;
                wne wneVar15 = wne.f39444a;
                int i30 = eenVar.j;
                if (i30 != 0) {
                    if (i30 == 1) {
                        z1x.P(obj15);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj15);
                k0f k0fVar4 = new k0f(kmqVar, b3);
                eenVar.j = 1;
                qoj0Var.c(k0fVar4, eenVar);
                return wneVar15;
            case 15:
                if (yjeVar instanceof eaw) {
                    eawVar = (eaw) yjeVar;
                    int i31 = eawVar.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        eawVar.j = i31 - Integer.MIN_VALUE;
                    } else {
                        eawVar = new eaw(this, yjeVar);
                    }
                } else {
                    eawVar = new eaw(this, yjeVar);
                }
                Object obj16 = eawVar.i;
                wne wneVar16 = wne.f39444a;
                int i32 = eawVar.j;
                if (i32 != 0) {
                    if (i32 == 1) {
                        z1x.P(obj16);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj16);
                b4v b4vVar = new b4v(kmqVar, (byte) 7);
                eawVar.j = 1;
                qoj0Var.c(b4vVar, eawVar);
                return wneVar16;
            case 16:
                if (yjeVar instanceof af00) {
                    af00Var = (af00) yjeVar;
                    int i33 = af00Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        af00Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        af00Var = new af00(this, yjeVar);
                    }
                } else {
                    af00Var = new af00(this, yjeVar);
                }
                Object obj17 = af00Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = af00Var.j;
                if (i34 != 0) {
                    if (i34 == 1) {
                        z1x.P(obj17);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj17);
                b4v b4vVar2 = new b4v(kmqVar, (byte) 13);
                af00Var.j = 1;
                qoj0Var.c(b4vVar2, af00Var);
                return wneVar17;
            case 17:
                if (yjeVar instanceof b340) {
                    b340Var = (b340) yjeVar;
                    int i35 = b340Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        b340Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        b340Var = new b340(this, yjeVar);
                    }
                } else {
                    b340Var = new b340(this, yjeVar);
                }
                Object obj18 = b340Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = b340Var.j;
                if (i36 != 0) {
                    if (i36 == 1) {
                        z1x.P(obj18);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj18);
                nr30 nr30Var = new nr30(kmqVar, (byte) 2);
                b340Var.j = 1;
                qoj0Var.c(nr30Var, b340Var);
                return wneVar18;
            case 18:
                if (yjeVar instanceof cj40) {
                    cj40Var = (cj40) yjeVar;
                    int i37 = cj40Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        cj40Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        cj40Var = new cj40(this, yjeVar);
                    }
                } else {
                    cj40Var = new cj40(this, yjeVar);
                }
                Object obj19 = cj40Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = cj40Var.j;
                if (i38 != 0) {
                    if (i38 == 1) {
                        z1x.P(obj19);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj19);
                nr30 nr30Var2 = new nr30(kmqVar, b4);
                cj40Var.j = 1;
                qoj0Var.c(nr30Var2, cj40Var);
                return wneVar19;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof wq70) {
                    wq70Var = (wq70) yjeVar;
                    int i39 = wq70Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        wq70Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        wq70Var = new wq70(this, yjeVar);
                    }
                } else {
                    wq70Var = new wq70(this, yjeVar);
                }
                Object obj20 = wq70Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = wq70Var.j;
                if (i40 != 0) {
                    if (i40 == 1) {
                        z1x.P(obj20);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj20);
                ld60 ld60Var = new ld60(kmqVar, (byte) 9);
                wq70Var.j = 1;
                qoj0Var.c(ld60Var, wq70Var);
                return wneVar20;
            case 20:
                if (yjeVar instanceof mbb0) {
                    mbb0Var = (mbb0) yjeVar;
                    int i41 = mbb0Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        mbb0Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        mbb0Var = new mbb0(this, yjeVar);
                    }
                } else {
                    mbb0Var = new mbb0(this, yjeVar);
                }
                Object obj21 = mbb0Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = mbb0Var.j;
                if (i42 != 0) {
                    if (i42 == 1) {
                        z1x.P(obj21);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj21);
                hbb0 hbb0Var = new hbb0(kmqVar, b8);
                mbb0Var.j = 1;
                qoj0Var.c(hbb0Var, mbb0Var);
                return wneVar21;
            case 21:
                if (yjeVar instanceof mmb0) {
                    mmb0Var = (mmb0) yjeVar;
                    int i43 = mmb0Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        mmb0Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        mmb0Var = new mmb0(this, yjeVar);
                    }
                } else {
                    mmb0Var = new mmb0(this, yjeVar);
                }
                Object obj22 = mmb0Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = mmb0Var.j;
                if (i44 != 0) {
                    if (i44 == 1) {
                        z1x.P(obj22);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj22);
                hbb0 hbb0Var2 = new hbb0(kmqVar, (byte) 4);
                mmb0Var.j = 1;
                qoj0Var.c(hbb0Var2, mmb0Var);
                return wneVar22;
            case 22:
                if (yjeVar instanceof zgo0) {
                    zgo0Var = (zgo0) yjeVar;
                    int i45 = zgo0Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        zgo0Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        zgo0Var = new zgo0(this, yjeVar);
                    }
                } else {
                    zgo0Var = new zgo0(this, yjeVar);
                }
                Object obj23 = zgo0Var.i;
                wne wneVar23 = wne.f39444a;
                int i46 = zgo0Var.j;
                if (i46 != 0) {
                    if (i46 == 1) {
                        z1x.P(obj23);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj23);
                d8n0 d8n0Var = new d8n0(kmqVar, (byte) 15);
                zgo0Var.j = 1;
                qoj0Var.c(d8n0Var, zgo0Var);
                return wneVar23;
            case 23:
                if (yjeVar instanceof mio0) {
                    mio0Var = (mio0) yjeVar;
                    int i47 = mio0Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        mio0Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        mio0Var = new mio0(this, yjeVar);
                    }
                } else {
                    mio0Var = new mio0(this, yjeVar);
                }
                Object obj24 = mio0Var.i;
                wne wneVar24 = wne.f39444a;
                int i48 = mio0Var.j;
                if (i48 != 0) {
                    if (i48 == 1) {
                        z1x.P(obj24);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj24);
                d8n0 d8n0Var2 = new d8n0(kmqVar, b5);
                mio0Var.j = 1;
                qoj0Var.c(d8n0Var2, mio0Var);
                return wneVar24;
            case 24:
                if (yjeVar instanceof ttq0) {
                    ttq0Var = (ttq0) yjeVar;
                    int i49 = ttq0Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        ttq0Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        ttq0Var = new ttq0(this, yjeVar);
                    }
                } else {
                    ttq0Var = new ttq0(this, yjeVar);
                }
                Object obj25 = ttq0Var.i;
                wne wneVar25 = wne.f39444a;
                int i50 = ttq0Var.j;
                if (i50 != 0) {
                    if (i50 == 1) {
                        z1x.P(obj25);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj25);
                d8n0 d8n0Var3 = new d8n0(kmqVar, b6);
                ttq0Var.j = 1;
                qoj0Var.c(d8n0Var3, ttq0Var);
                return wneVar25;
            default:
                if (yjeVar instanceof mfv0) {
                    mfv0Var = (mfv0) yjeVar;
                    int i51 = mfv0Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        mfv0Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        mfv0Var = new mfv0(this, yjeVar);
                    }
                } else {
                    mfv0Var = new mfv0(this, yjeVar);
                }
                Object obj26 = mfv0Var.i;
                wne wneVar26 = wne.f39444a;
                int i52 = mfv0Var.j;
                if (i52 != 0) {
                    if (i52 == 1) {
                        z1x.P(obj26);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj26);
                ofv0 ofv0Var = new ofv0(kmqVar, (byte) 0);
                mfv0Var.j = 1;
                qoj0Var.c(ofv0Var, mfv0Var);
                return wneVar26;
        }
    }
}
