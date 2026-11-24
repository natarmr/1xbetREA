package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class a1t implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f89a;
    public final /* synthetic */ gmq b;

    public /* synthetic */ a1t(gmq gmqVar, byte b) {
        this.f89a = b;
        this.b = gmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:137:0x0233  */
    /* JADX WARN: Code duplicated, block: B:153:0x0272  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:185:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:201:0x0331  */
    /* JADX WARN: Code duplicated, block: B:217:0x0370  */
    /* JADX WARN: Code duplicated, block: B:233:0x03af  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:265:0x042d  */
    /* JADX WARN: Code duplicated, block: B:281:0x046c  */
    /* JADX WARN: Code duplicated, block: B:297:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:313:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:329:0x0529  */
    /* JADX WARN: Code duplicated, block: B:345:0x0568  */
    /* JADX WARN: Code duplicated, block: B:361:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:377:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:393:0x0627  */
    /* JADX WARN: Code duplicated, block: B:409:0x0666  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:425:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:441:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:457:0x0724  */
    /* JADX WARN: Code duplicated, block: B:473:0x0765  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0133  */
    /* JADX WARN: Code duplicated, block: B:89:0x0172  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        y0t y0tVar;
        jnt jntVar;
        rnt rntVar;
        bpt bptVar;
        dpt dptVar;
        qwt qwtVar;
        p1u p1uVar;
        k3u k3uVar;
        o3u o3uVar;
        r3u r3uVar;
        x3u x3uVar;
        k5u k5uVar;
        n5u n5uVar;
        x8u x8uVar;
        l9u l9uVar;
        ebu ebuVar;
        olu oluVar;
        wnu wnuVar;
        ynu ynuVar;
        aou aouVar;
        z3v z3vVar;
        u5v u5vVar;
        w9w w9wVar;
        mty mtyVar;
        at00 at00Var;
        j020 j020Var;
        c220 c220Var;
        k220 k220Var;
        q220 q220Var;
        ul20 ul20Var;
        byte b = this.f89a;
        byte b2 = 15;
        byte b3 = 17;
        byte b4 = 18;
        byte b5 = 0;
        byte b6 = 6;
        byte b7 = 21;
        byte b8 = 22;
        byte b9 = 23;
        byte b10 = 3;
        byte b11 = 24;
        gmq gmqVar = this.b;
        byte b12 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof y0t) {
                    y0tVar = (y0t) yjeVar;
                    int i = y0tVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        y0tVar.j = i - Integer.MIN_VALUE;
                    } else {
                        y0tVar = new y0t(this, yjeVar);
                    }
                } else {
                    y0tVar = new y0t(this, yjeVar);
                }
                Object obj = y0tVar.i;
                wne wneVar = wne.f39444a;
                int i2 = y0tVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    uap uapVar = new uap(kmqVar, b11);
                    y0tVar.j = 1;
                    if (gmqVar.c(uapVar, y0tVar) == wneVar) {
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
                if (yjeVar instanceof jnt) {
                    jntVar = (jnt) yjeVar;
                    int i3 = jntVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jntVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        jntVar = new jnt(this, yjeVar);
                    }
                } else {
                    jntVar = new jnt(this, yjeVar);
                }
                Object obj2 = jntVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = jntVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    uap uapVar2 = new uap(kmqVar, (byte) 28);
                    jntVar.j = 1;
                    if (gmqVar.c(uapVar2, jntVar) == wneVar2) {
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
                if (yjeVar instanceof rnt) {
                    rntVar = (rnt) yjeVar;
                    int i5 = rntVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rntVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        rntVar = new rnt(this, yjeVar);
                    }
                } else {
                    rntVar = new rnt(this, yjeVar);
                }
                Object obj3 = rntVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = rntVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    tnt tntVar = new tnt(kmqVar, b5);
                    rntVar.j = 1;
                    if (gmqVar.c(tntVar, rntVar) == wneVar3) {
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
                if (yjeVar instanceof bpt) {
                    bptVar = (bpt) yjeVar;
                    int i7 = bptVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        bptVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        bptVar = new bpt(this, yjeVar);
                    }
                } else {
                    bptVar = new bpt(this, yjeVar);
                }
                Object obj4 = bptVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = bptVar.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    tnt tntVar2 = new tnt(kmqVar, (byte) 2);
                    bptVar.j = 1;
                    if (gmqVar.c(tntVar2, bptVar) == wneVar4) {
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
                if (yjeVar instanceof dpt) {
                    dptVar = (dpt) yjeVar;
                    int i9 = dptVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        dptVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        dptVar = new dpt(this, yjeVar);
                    }
                } else {
                    dptVar = new dpt(this, yjeVar);
                }
                Object obj5 = dptVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = dptVar.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    tnt tntVar3 = new tnt(kmqVar, b10);
                    dptVar.j = 1;
                    if (gmqVar.c(tntVar3, dptVar) == wneVar5) {
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
                if (yjeVar instanceof qwt) {
                    qwtVar = (qwt) yjeVar;
                    int i11 = qwtVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        qwtVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        qwtVar = new qwt(this, yjeVar);
                    }
                } else {
                    qwtVar = new qwt(this, yjeVar);
                }
                Object obj6 = qwtVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = qwtVar.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    tnt tntVar4 = new tnt(kmqVar, b2);
                    qwtVar.j = 1;
                    if (gmqVar.c(tntVar4, qwtVar) == wneVar6) {
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
                if (yjeVar instanceof p1u) {
                    p1uVar = (p1u) yjeVar;
                    int i13 = p1uVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        p1uVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        p1uVar = new p1u(this, yjeVar);
                    }
                } else {
                    p1uVar = new p1u(this, yjeVar);
                }
                Object obj7 = p1uVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = p1uVar.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    tnt tntVar5 = new tnt(kmqVar, b3);
                    p1uVar.j = 1;
                    if (gmqVar.c(tntVar5, p1uVar) == wneVar7) {
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
                if (yjeVar instanceof k3u) {
                    k3uVar = (k3u) yjeVar;
                    int i15 = k3uVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        k3uVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        k3uVar = new k3u(this, yjeVar);
                    }
                } else {
                    k3uVar = new k3u(this, yjeVar);
                }
                Object obj8 = k3uVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = k3uVar.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    tnt tntVar6 = new tnt(kmqVar, b4);
                    k3uVar.j = 1;
                    if (gmqVar.c(tntVar6, k3uVar) == wneVar8) {
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
                if (yjeVar instanceof o3u) {
                    o3uVar = (o3u) yjeVar;
                    int i17 = o3uVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        o3uVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        o3uVar = new o3u(this, yjeVar);
                    }
                } else {
                    o3uVar = new o3u(this, yjeVar);
                }
                Object obj9 = o3uVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = o3uVar.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    tnt tntVar7 = new tnt(kmqVar, (byte) 20);
                    o3uVar.j = 1;
                    if (gmqVar.c(tntVar7, o3uVar) == wneVar9) {
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
                if (yjeVar instanceof r3u) {
                    r3uVar = (r3u) yjeVar;
                    int i19 = r3uVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        r3uVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        r3uVar = new r3u(this, yjeVar);
                    }
                } else {
                    r3uVar = new r3u(this, yjeVar);
                }
                Object obj10 = r3uVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = r3uVar.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    tnt tntVar8 = new tnt(kmqVar, b7);
                    r3uVar.j = 1;
                    if (gmqVar.c(tntVar8, r3uVar) == wneVar10) {
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
                if (yjeVar instanceof x3u) {
                    x3uVar = (x3u) yjeVar;
                    int i21 = x3uVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        x3uVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        x3uVar = new x3u(this, yjeVar);
                    }
                } else {
                    x3uVar = new x3u(this, yjeVar);
                }
                Object obj11 = x3uVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = x3uVar.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    tnt tntVar9 = new tnt(kmqVar, b8);
                    x3uVar.j = 1;
                    if (gmqVar.c(tntVar9, x3uVar) == wneVar11) {
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
                if (yjeVar instanceof k5u) {
                    k5uVar = (k5u) yjeVar;
                    int i23 = k5uVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        k5uVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        k5uVar = new k5u(this, yjeVar);
                    }
                } else {
                    k5uVar = new k5u(this, yjeVar);
                }
                Object obj12 = k5uVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = k5uVar.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    tnt tntVar10 = new tnt(kmqVar, b9);
                    k5uVar.j = 1;
                    if (gmqVar.c(tntVar10, k5uVar) == wneVar12) {
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
                if (yjeVar instanceof n5u) {
                    n5uVar = (n5u) yjeVar;
                    int i25 = n5uVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        n5uVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        n5uVar = new n5u(this, yjeVar);
                    }
                } else {
                    n5uVar = new n5u(this, yjeVar);
                }
                Object obj13 = n5uVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = n5uVar.j;
                if (i26 == 0) {
                    z1x.P(obj13);
                    tnt tntVar11 = new tnt(kmqVar, b11);
                    n5uVar.j = 1;
                    if (gmqVar.c(tntVar11, n5uVar) == wneVar13) {
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
                if (yjeVar instanceof x8u) {
                    x8uVar = (x8u) yjeVar;
                    int i27 = x8uVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        x8uVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        x8uVar = new x8u(this, yjeVar);
                    }
                } else {
                    x8uVar = new x8u(this, yjeVar);
                }
                Object obj14 = x8uVar.i;
                wne wneVar14 = wne.f39444a;
                int i28 = x8uVar.j;
                if (i28 == 0) {
                    z1x.P(obj14);
                    y6u y6uVar = new y6u(kmqVar, b12);
                    x8uVar.j = 1;
                    if (gmqVar.c(y6uVar, x8uVar) == wneVar14) {
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
                if (yjeVar instanceof l9u) {
                    l9uVar = (l9u) yjeVar;
                    int i29 = l9uVar.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        l9uVar.j = i29 - Integer.MIN_VALUE;
                    } else {
                        l9uVar = new l9u(this, yjeVar);
                    }
                } else {
                    l9uVar = new l9u(this, yjeVar);
                }
                Object obj15 = l9uVar.i;
                wne wneVar15 = wne.f39444a;
                int i30 = l9uVar.j;
                if (i30 == 0) {
                    z1x.P(obj15);
                    y6u y6uVar2 = new y6u(kmqVar, b10);
                    l9uVar.j = 1;
                    if (gmqVar.c(y6uVar2, l9uVar) == wneVar15) {
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
                if (yjeVar instanceof ebu) {
                    ebuVar = (ebu) yjeVar;
                    int i31 = ebuVar.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        ebuVar.j = i31 - Integer.MIN_VALUE;
                    } else {
                        ebuVar = new ebu(this, yjeVar);
                    }
                } else {
                    ebuVar = new ebu(this, yjeVar);
                }
                Object obj16 = ebuVar.i;
                wne wneVar16 = wne.f39444a;
                int i32 = ebuVar.j;
                if (i32 == 0) {
                    z1x.P(obj16);
                    y6u y6uVar3 = new y6u(kmqVar, b6);
                    ebuVar.j = 1;
                    if (gmqVar.c(y6uVar3, ebuVar) == wneVar16) {
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
                if (yjeVar instanceof olu) {
                    oluVar = (olu) yjeVar;
                    int i33 = oluVar.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        oluVar.j = i33 - Integer.MIN_VALUE;
                    } else {
                        oluVar = new olu(this, yjeVar);
                    }
                } else {
                    oluVar = new olu(this, yjeVar);
                }
                Object obj17 = oluVar.i;
                wne wneVar17 = wne.f39444a;
                int i34 = oluVar.j;
                if (i34 == 0) {
                    z1x.P(obj17);
                    y6u y6uVar4 = new y6u(kmqVar, b2);
                    oluVar.j = 1;
                    if (gmqVar.c(y6uVar4, oluVar) == wneVar17) {
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
                if (yjeVar instanceof wnu) {
                    wnuVar = (wnu) yjeVar;
                    int i35 = wnuVar.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        wnuVar.j = i35 - Integer.MIN_VALUE;
                    } else {
                        wnuVar = new wnu(this, yjeVar);
                    }
                } else {
                    wnuVar = new wnu(this, yjeVar);
                }
                Object obj18 = wnuVar.i;
                wne wneVar18 = wne.f39444a;
                int i36 = wnuVar.j;
                if (i36 == 0) {
                    z1x.P(obj18);
                    y6u y6uVar5 = new y6u(kmqVar, b3);
                    wnuVar.j = 1;
                    if (gmqVar.c(y6uVar5, wnuVar) == wneVar18) {
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
                if (yjeVar instanceof ynu) {
                    ynuVar = (ynu) yjeVar;
                    int i37 = ynuVar.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        ynuVar.j = i37 - Integer.MIN_VALUE;
                    } else {
                        ynuVar = new ynu(this, yjeVar);
                    }
                } else {
                    ynuVar = new ynu(this, yjeVar);
                }
                Object obj19 = ynuVar.i;
                wne wneVar19 = wne.f39444a;
                int i38 = ynuVar.j;
                if (i38 == 0) {
                    z1x.P(obj19);
                    y6u y6uVar6 = new y6u(kmqVar, b4);
                    ynuVar.j = 1;
                    if (gmqVar.c(y6uVar6, ynuVar) == wneVar19) {
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
                if (yjeVar instanceof aou) {
                    aouVar = (aou) yjeVar;
                    int i39 = aouVar.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        aouVar.j = i39 - Integer.MIN_VALUE;
                    } else {
                        aouVar = new aou(this, yjeVar);
                    }
                } else {
                    aouVar = new aou(this, yjeVar);
                }
                Object obj20 = aouVar.i;
                wne wneVar20 = wne.f39444a;
                int i40 = aouVar.j;
                if (i40 == 0) {
                    z1x.P(obj20);
                    y6u y6uVar7 = new y6u(kmqVar, (byte) 19);
                    aouVar.j = 1;
                    if (gmqVar.c(y6uVar7, aouVar) == wneVar20) {
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
                if (yjeVar instanceof z3v) {
                    z3vVar = (z3v) yjeVar;
                    int i41 = z3vVar.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        z3vVar.j = i41 - Integer.MIN_VALUE;
                    } else {
                        z3vVar = new z3v(this, yjeVar);
                    }
                } else {
                    z3vVar = new z3v(this, yjeVar);
                }
                Object obj21 = z3vVar.i;
                wne wneVar21 = wne.f39444a;
                int i42 = z3vVar.j;
                if (i42 == 0) {
                    z1x.P(obj21);
                    b4v b4vVar = new b4v(kmqVar, b5);
                    z3vVar.j = 1;
                    if (gmqVar.c(b4vVar, z3vVar) == wneVar21) {
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
                if (yjeVar instanceof u5v) {
                    u5vVar = (u5v) yjeVar;
                    int i43 = u5vVar.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        u5vVar.j = i43 - Integer.MIN_VALUE;
                    } else {
                        u5vVar = new u5v(this, yjeVar);
                    }
                } else {
                    u5vVar = new u5v(this, yjeVar);
                }
                Object obj22 = u5vVar.i;
                wne wneVar22 = wne.f39444a;
                int i44 = u5vVar.j;
                if (i44 == 0) {
                    z1x.P(obj22);
                    b4v b4vVar2 = new b4v(kmqVar, b10);
                    u5vVar.j = 1;
                    if (gmqVar.c(b4vVar2, u5vVar) == wneVar22) {
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
                if (yjeVar instanceof w9w) {
                    w9wVar = (w9w) yjeVar;
                    int i45 = w9wVar.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        w9wVar.j = i45 - Integer.MIN_VALUE;
                    } else {
                        w9wVar = new w9w(this, yjeVar);
                    }
                } else {
                    w9wVar = new w9w(this, yjeVar);
                }
                Object obj23 = w9wVar.i;
                wne wneVar23 = wne.f39444a;
                int i46 = w9wVar.j;
                if (i46 == 0) {
                    z1x.P(obj23);
                    b4v b4vVar3 = new b4v(kmqVar, b6);
                    w9wVar.j = 1;
                    if (gmqVar.c(b4vVar3, w9wVar) == wneVar23) {
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
                if (yjeVar instanceof mty) {
                    mtyVar = (mty) yjeVar;
                    int i47 = mtyVar.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        mtyVar.j = i47 - Integer.MIN_VALUE;
                    } else {
                        mtyVar = new mty(this, yjeVar);
                    }
                } else {
                    mtyVar = new mty(this, yjeVar);
                }
                Object obj24 = mtyVar.i;
                wne wneVar24 = wne.f39444a;
                int i48 = mtyVar.j;
                if (i48 == 0) {
                    z1x.P(obj24);
                    b4v b4vVar4 = new b4v(kmqVar, (byte) 11);
                    mtyVar.j = 1;
                    if (gmqVar.c(b4vVar4, mtyVar) == wneVar24) {
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
                if (yjeVar instanceof at00) {
                    at00Var = (at00) yjeVar;
                    int i49 = at00Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        at00Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        at00Var = new at00(this, yjeVar);
                    }
                } else {
                    at00Var = new at00(this, yjeVar);
                }
                Object obj25 = at00Var.i;
                wne wneVar25 = wne.f39444a;
                int i50 = at00Var.j;
                if (i50 == 0) {
                    z1x.P(obj25);
                    b4v b4vVar5 = new b4v(kmqVar, (byte) 16);
                    at00Var.j = 1;
                    if (gmqVar.c(b4vVar5, at00Var) == wneVar25) {
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
                if (yjeVar instanceof j020) {
                    j020Var = (j020) yjeVar;
                    int i51 = j020Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        j020Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        j020Var = new j020(this, yjeVar);
                    }
                } else {
                    j020Var = new j020(this, yjeVar);
                }
                Object obj26 = j020Var.i;
                wne wneVar26 = wne.f39444a;
                int i52 = j020Var.j;
                if (i52 == 0) {
                    z1x.P(obj26);
                    b4v b4vVar6 = new b4v(kmqVar, b7);
                    j020Var.j = 1;
                    if (gmqVar.c(b4vVar6, j020Var) == wneVar26) {
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
                if (yjeVar instanceof c220) {
                    c220Var = (c220) yjeVar;
                    int i53 = c220Var.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        c220Var.j = i53 - Integer.MIN_VALUE;
                    } else {
                        c220Var = new c220(this, yjeVar);
                    }
                } else {
                    c220Var = new c220(this, yjeVar);
                }
                Object obj27 = c220Var.i;
                wne wneVar27 = wne.f39444a;
                int i54 = c220Var.j;
                if (i54 == 0) {
                    z1x.P(obj27);
                    b4v b4vVar7 = new b4v(kmqVar, b8);
                    c220Var.j = 1;
                    if (gmqVar.c(b4vVar7, c220Var) == wneVar27) {
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
                if (yjeVar instanceof k220) {
                    k220Var = (k220) yjeVar;
                    int i55 = k220Var.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        k220Var.j = i55 - Integer.MIN_VALUE;
                    } else {
                        k220Var = new k220(this, yjeVar);
                    }
                } else {
                    k220Var = new k220(this, yjeVar);
                }
                Object obj28 = k220Var.i;
                wne wneVar28 = wne.f39444a;
                int i56 = k220Var.j;
                if (i56 == 0) {
                    z1x.P(obj28);
                    b4v b4vVar8 = new b4v(kmqVar, b9);
                    k220Var.j = 1;
                    if (gmqVar.c(b4vVar8, k220Var) == wneVar28) {
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
                if (yjeVar instanceof q220) {
                    q220Var = (q220) yjeVar;
                    int i57 = q220Var.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        q220Var.j = i57 - Integer.MIN_VALUE;
                    } else {
                        q220Var = new q220(this, yjeVar);
                    }
                } else {
                    q220Var = new q220(this, yjeVar);
                }
                Object obj29 = q220Var.i;
                wne wneVar29 = wne.f39444a;
                int i58 = q220Var.j;
                if (i58 == 0) {
                    z1x.P(obj29);
                    b4v b4vVar9 = new b4v(kmqVar, b11);
                    q220Var.j = 1;
                    if (gmqVar.c(b4vVar9, q220Var) == wneVar29) {
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
                if (yjeVar instanceof ul20) {
                    ul20Var = (ul20) yjeVar;
                    int i59 = ul20Var.j;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        ul20Var.j = i59 - Integer.MIN_VALUE;
                    } else {
                        ul20Var = new ul20(this, yjeVar);
                    }
                } else {
                    ul20Var = new ul20(this, yjeVar);
                }
                Object obj30 = ul20Var.i;
                wne wneVar30 = wne.f39444a;
                int i60 = ul20Var.j;
                if (i60 == 0) {
                    z1x.P(obj30);
                    b4v b4vVar10 = new b4v(kmqVar, (byte) 27);
                    ul20Var.j = 1;
                    if (gmqVar.c(b4vVar10, ul20Var) == wneVar30) {
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
