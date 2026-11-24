package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class qqu implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29181a;
    public final /* synthetic */ vsg0 b;
    public final /* synthetic */ hie0 c;

    public /* synthetic */ qqu(vsg0 vsg0Var, hie0 hie0Var, byte b) {
        this.f29181a = b;
        this.b = vsg0Var;
        this.c = hie0Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x019a  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:137:0x0218  */
    /* JADX WARN: Code duplicated, block: B:153:0x0257  */
    /* JADX WARN: Code duplicated, block: B:169:0x0296  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:201:0x0312  */
    /* JADX WARN: Code duplicated, block: B:217:0x0350  */
    /* JADX WARN: Code duplicated, block: B:233:0x038e  */
    /* JADX WARN: Code duplicated, block: B:249:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:265:0x0409  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x011c  */
    /* JADX WARN: Code duplicated, block: B:89:0x015b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        nqu nquVar;
        uqu uquVar;
        dsu dsuVar;
        vxu vxuVar;
        yxu yxuVar;
        kzu kzuVar;
        xzu xzuVar;
        f0v f0vVar;
        k0v k0vVar;
        m0v m0vVar;
        s0v s0vVar;
        l1v l1vVar;
        z1v z1vVar;
        zqx zqxVar;
        ua60 ua60Var;
        bb60 bb60Var;
        gb60 gb60Var;
        byte b = this.f29181a;
        hie0 hie0Var = this.c;
        vsg0 vsg0Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof nqu) {
                    nquVar = (nqu) yjeVar;
                    int i = nquVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nquVar.j = i - Integer.MIN_VALUE;
                    } else {
                        nquVar = new nqu(this, yjeVar);
                    }
                } else {
                    nquVar = new nqu(this, yjeVar);
                }
                Object obj = nquVar.i;
                wne wneVar = wne.f39444a;
                int i2 = nquVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    pqu pquVar = new pqu(kmqVar, hie0Var, (byte) 0);
                    nquVar.j = 1;
                    if (vsg0Var.c(pquVar, nquVar) == wneVar) {
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
                if (yjeVar instanceof uqu) {
                    uquVar = (uqu) yjeVar;
                    int i3 = uquVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        uquVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        uquVar = new uqu(this, yjeVar);
                    }
                } else {
                    uquVar = new uqu(this, yjeVar);
                }
                Object obj2 = uquVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = uquVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    pqu pquVar2 = new pqu(kmqVar, hie0Var, b2);
                    uquVar.j = 1;
                    if (vsg0Var.c(pquVar2, uquVar) == wneVar2) {
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
                if (yjeVar instanceof dsu) {
                    dsuVar = (dsu) yjeVar;
                    int i5 = dsuVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        dsuVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        dsuVar = new dsu(this, yjeVar);
                    }
                } else {
                    dsuVar = new dsu(this, yjeVar);
                }
                Object obj3 = dsuVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = dsuVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    pqu pquVar3 = new pqu(kmqVar, hie0Var, (byte) 2);
                    dsuVar.j = 1;
                    if (vsg0Var.c(pquVar3, dsuVar) == wneVar3) {
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
                if (yjeVar instanceof vxu) {
                    vxuVar = (vxu) yjeVar;
                    int i7 = vxuVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        vxuVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        vxuVar = new vxu(this, yjeVar);
                    }
                } else {
                    vxuVar = new vxu(this, yjeVar);
                }
                Object obj4 = vxuVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = vxuVar.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    pqu pquVar4 = new pqu(kmqVar, hie0Var, (byte) 3);
                    vxuVar.j = 1;
                    if (vsg0Var.c(pquVar4, vxuVar) == wneVar4) {
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
                if (yjeVar instanceof yxu) {
                    yxuVar = (yxu) yjeVar;
                    int i9 = yxuVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        yxuVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        yxuVar = new yxu(this, yjeVar);
                    }
                } else {
                    yxuVar = new yxu(this, yjeVar);
                }
                Object obj5 = yxuVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = yxuVar.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    pqu pquVar5 = new pqu(kmqVar, hie0Var, (byte) 4);
                    yxuVar.j = 1;
                    if (vsg0Var.c(pquVar5, yxuVar) == wneVar5) {
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
                if (yjeVar instanceof kzu) {
                    kzuVar = (kzu) yjeVar;
                    int i11 = kzuVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        kzuVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        kzuVar = new kzu(this, yjeVar);
                    }
                } else {
                    kzuVar = new kzu(this, yjeVar);
                }
                Object obj6 = kzuVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = kzuVar.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    pqu pquVar6 = new pqu(kmqVar, hie0Var, (byte) 5);
                    kzuVar.j = 1;
                    if (vsg0Var.c(pquVar6, kzuVar) == wneVar6) {
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
                if (yjeVar instanceof xzu) {
                    xzuVar = (xzu) yjeVar;
                    int i13 = xzuVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        xzuVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        xzuVar = new xzu(this, yjeVar);
                    }
                } else {
                    xzuVar = new xzu(this, yjeVar);
                }
                Object obj7 = xzuVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = xzuVar.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    pqu pquVar7 = new pqu(kmqVar, hie0Var, (byte) 7);
                    xzuVar.j = 1;
                    if (vsg0Var.c(pquVar7, xzuVar) == wneVar7) {
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
                if (yjeVar instanceof f0v) {
                    f0vVar = (f0v) yjeVar;
                    int i15 = f0vVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        f0vVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        f0vVar = new f0v(this, yjeVar);
                    }
                } else {
                    f0vVar = new f0v(this, yjeVar);
                }
                Object obj8 = f0vVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = f0vVar.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    pqu pquVar8 = new pqu(kmqVar, hie0Var, (byte) 8);
                    f0vVar.j = 1;
                    if (vsg0Var.c(pquVar8, f0vVar) == wneVar8) {
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
                if (yjeVar instanceof k0v) {
                    k0vVar = (k0v) yjeVar;
                    int i17 = k0vVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        k0vVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        k0vVar = new k0v(this, yjeVar);
                    }
                } else {
                    k0vVar = new k0v(this, yjeVar);
                }
                Object obj9 = k0vVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = k0vVar.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    pqu pquVar9 = new pqu(kmqVar, hie0Var, (byte) 9);
                    k0vVar.j = 1;
                    if (vsg0Var.c(pquVar9, k0vVar) == wneVar9) {
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
                if (yjeVar instanceof m0v) {
                    m0vVar = (m0v) yjeVar;
                    int i19 = m0vVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        m0vVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        m0vVar = new m0v(this, yjeVar);
                    }
                } else {
                    m0vVar = new m0v(this, yjeVar);
                }
                Object obj10 = m0vVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = m0vVar.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    pqu pquVar10 = new pqu(kmqVar, hie0Var, (byte) 10);
                    m0vVar.j = 1;
                    if (vsg0Var.c(pquVar10, m0vVar) == wneVar10) {
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
                if (yjeVar instanceof s0v) {
                    s0vVar = (s0v) yjeVar;
                    int i21 = s0vVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        s0vVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        s0vVar = new s0v(this, yjeVar);
                    }
                } else {
                    s0vVar = new s0v(this, yjeVar);
                }
                Object obj11 = s0vVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = s0vVar.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    pqu pquVar11 = new pqu(kmqVar, hie0Var, (byte) 11);
                    s0vVar.j = 1;
                    if (vsg0Var.c(pquVar11, s0vVar) == wneVar11) {
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
                if (yjeVar instanceof l1v) {
                    l1vVar = (l1v) yjeVar;
                    int i23 = l1vVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        l1vVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        l1vVar = new l1v(this, yjeVar);
                    }
                } else {
                    l1vVar = new l1v(this, yjeVar);
                }
                Object obj12 = l1vVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = l1vVar.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    pqu pquVar12 = new pqu(kmqVar, hie0Var, (byte) 12);
                    l1vVar.j = 1;
                    if (vsg0Var.c(pquVar12, l1vVar) == wneVar12) {
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
                if (yjeVar instanceof z1v) {
                    z1vVar = (z1v) yjeVar;
                    int i25 = z1vVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        z1vVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        z1vVar = new z1v(this, yjeVar);
                    }
                } else {
                    z1vVar = new z1v(this, yjeVar);
                }
                Object obj13 = z1vVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = z1vVar.j;
                if (i26 == 0) {
                    z1x.P(obj13);
                    pqu pquVar13 = new pqu(kmqVar, hie0Var, (byte) 14);
                    z1vVar.j = 1;
                    if (vsg0Var.c(pquVar13, z1vVar) == wneVar13) {
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
                if (yjeVar instanceof zqx) {
                    zqxVar = (zqx) yjeVar;
                    int i27 = zqxVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        zqxVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        zqxVar = new zqx(this, yjeVar);
                    }
                } else {
                    zqxVar = new zqx(this, yjeVar);
                }
                Object obj14 = zqxVar.i;
                wne wneVar14 = wne.f39444a;
                int i28 = zqxVar.j;
                if (i28 == 0) {
                    z1x.P(obj14);
                    pqu pquVar14 = new pqu(kmqVar, hie0Var, (byte) 16);
                    zqxVar.j = 1;
                    if (vsg0Var.c(pquVar14, zqxVar) == wneVar14) {
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
                if (yjeVar instanceof ua60) {
                    ua60Var = (ua60) yjeVar;
                    int i29 = ua60Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        ua60Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        ua60Var = new ua60(this, yjeVar);
                    }
                } else {
                    ua60Var = new ua60(this, yjeVar);
                }
                Object obj15 = ua60Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = ua60Var.j;
                if (i30 == 0) {
                    z1x.P(obj15);
                    pqu pquVar15 = new pqu(kmqVar, hie0Var, (byte) 18);
                    ua60Var.j = 1;
                    if (vsg0Var.c(pquVar15, ua60Var) == wneVar15) {
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
                if (yjeVar instanceof bb60) {
                    bb60Var = (bb60) yjeVar;
                    int i31 = bb60Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        bb60Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        bb60Var = new bb60(this, yjeVar);
                    }
                } else {
                    bb60Var = new bb60(this, yjeVar);
                }
                Object obj16 = bb60Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = bb60Var.j;
                if (i32 == 0) {
                    z1x.P(obj16);
                    pqu pquVar16 = new pqu(kmqVar, hie0Var, (byte) 19);
                    bb60Var.j = 1;
                    if (vsg0Var.c(pquVar16, bb60Var) == wneVar16) {
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
            default:
                if (yjeVar instanceof gb60) {
                    gb60Var = (gb60) yjeVar;
                    int i33 = gb60Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        gb60Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        gb60Var = new gb60(this, yjeVar);
                    }
                } else {
                    gb60Var = new gb60(this, yjeVar);
                }
                Object obj17 = gb60Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = gb60Var.j;
                if (i34 == 0) {
                    z1x.P(obj17);
                    pqu pquVar17 = new pqu(kmqVar, hie0Var, (byte) 20);
                    gb60Var.j = 1;
                    if (vsg0Var.c(pquVar17, gb60Var) == wneVar17) {
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
        }
    }
}
