package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ewt implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8543a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ewt(Object obj, Object obj2, byte b) {
        this.f8543a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:134:0x0238  */
    /* JADX WARN: Code duplicated, block: B:150:0x0280  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:182:0x0302  */
    /* JADX WARN: Code duplicated, block: B:198:0x0343  */
    /* JADX WARN: Code duplicated, block: B:214:0x0384  */
    /* JADX WARN: Code duplicated, block: B:227:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:243:0x0403  */
    /* JADX WARN: Code duplicated, block: B:259:0x0444  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:272:0x0481  */
    /* JADX WARN: Code duplicated, block: B:288:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:301:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:317:0x0542  */
    /* JADX WARN: Code duplicated, block: B:333:0x0585  */
    /* JADX WARN: Code duplicated, block: B:349:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:362:0x0605  */
    /* JADX WARN: Code duplicated, block: B:378:0x0648  */
    /* JADX WARN: Code duplicated, block: B:394:0x068b  */
    /* JADX WARN: Code duplicated, block: B:410:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:426:0x0711  */
    /* JADX WARN: Code duplicated, block: B:439:0x074e  */
    /* JADX WARN: Code duplicated, block: B:455:0x078f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x0171  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) throws Throwable {
        cwt cwtVar;
        c3u c3uVar;
        s4u s4uVar;
        m7u m7uVar;
        o9u o9uVar;
        u9u u9uVar;
        wau wauVar;
        bbu bbuVar;
        lcu lcuVar;
        pcu pcuVar;
        pku pkuVar;
        alu aluVar;
        wuu wuuVar;
        axu axuVar;
        mzu mzuVar;
        rzu rzuVar;
        k5v k5vVar;
        j2w j2wVar;
        y9w y9wVar;
        rxy rxyVar;
        h700 h700Var;
        xp00 xp00Var;
        zw10 zw10Var;
        u120 u120Var;
        e220 e220Var;
        i220 i220Var;
        m720 m720Var;
        cf20 cf20Var;
        dl20 dl20Var;
        i430 i430Var;
        byte b = this.f8543a;
        byte b2 = 4;
        byte b3 = 5;
        byte b4 = 25;
        byte b5 = 0;
        byte b6 = 12;
        byte b7 = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        yje yjeVar2 = null;
        byte b8 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof cwt) {
                    cwtVar = (cwt) yjeVar;
                    int i = cwtVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        cwtVar.j = i - Integer.MIN_VALUE;
                    } else {
                        cwtVar = new cwt(this, yjeVar);
                    }
                } else {
                    cwtVar = new cwt(this, yjeVar);
                }
                Object obj3 = cwtVar.i;
                wne wneVar = wne.f39444a;
                int i2 = cwtVar.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    tnt tntVar = new tnt(kmqVar, (fwt) obj);
                    cwtVar.j = 1;
                    if (((i89) obj2).c(tntVar, cwtVar) == wneVar) {
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
                if (yjeVar instanceof c3u) {
                    c3uVar = (c3u) yjeVar;
                    int i3 = c3uVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c3uVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        c3uVar = new c3u(this, yjeVar);
                    }
                } else {
                    c3uVar = new c3u(this, yjeVar);
                }
                Object obj4 = c3uVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = c3uVar.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    xot xotVar = new xot(kmqVar, (List) obj, b8);
                    c3uVar.j = 1;
                    if (((fnq) obj2).c(xotVar, c3uVar) == wneVar2) {
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
                if (yjeVar instanceof s4u) {
                    s4uVar = (s4u) yjeVar;
                    int i5 = s4uVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        s4uVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        s4uVar = new s4u(this, yjeVar);
                    }
                } else {
                    s4uVar = new s4u(this, yjeVar);
                }
                Object obj5 = s4uVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = s4uVar.j;
                if (i6 != 0) {
                    if (i6 == 1) {
                        z1x.P(obj5);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj5);
                xot xotVar2 = new xot(kmqVar, (List) obj, b7);
                s4uVar.j = 1;
                ((p7m0) obj2).c(xotVar2, s4uVar);
                return wneVar3;
            case 3:
                if (yjeVar instanceof m7u) {
                    m7uVar = (m7u) yjeVar;
                    int i7 = m7uVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        m7uVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        m7uVar = new m7u(this, yjeVar);
                    }
                } else {
                    m7uVar = new m7u(this, yjeVar);
                }
                Object obj6 = m7uVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = m7uVar.j;
                if (i8 == 0) {
                    z1x.P(obj6);
                    o4m o4mVar = new o4m((Object) kmqVar, obj, (byte) 21);
                    m7uVar.j = 1;
                    if (((utb) obj2).c(o4mVar, m7uVar) == wneVar4) {
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
                if (yjeVar instanceof o9u) {
                    o9uVar = (o9u) yjeVar;
                    int i9 = o9uVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        o9uVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        o9uVar = new o9u(this, yjeVar);
                    }
                } else {
                    o9uVar = new o9u(this, yjeVar);
                }
                Object obj7 = o9uVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = o9uVar.j;
                if (i10 == 0) {
                    z1x.P(obj7);
                    o4m o4mVar2 = new o4m((Object) kmqVar, obj, (byte) 22);
                    o9uVar.j = 1;
                    if (((fnq) obj2).c(o4mVar2, o9uVar) == wneVar5) {
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
                if (yjeVar instanceof u9u) {
                    u9uVar = (u9u) yjeVar;
                    int i11 = u9uVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        u9uVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        u9uVar = new u9u(this, yjeVar);
                    }
                } else {
                    u9uVar = new u9u(this, yjeVar);
                }
                Object obj8 = u9uVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = u9uVar.j;
                if (i12 == 0) {
                    z1x.P(obj8);
                    o4m o4mVar3 = new o4m((Object) kmqVar, obj, (byte) 23);
                    u9uVar.j = 1;
                    if (((acu) obj2).c(o4mVar3, u9uVar) == wneVar6) {
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
                if (yjeVar instanceof wau) {
                    wauVar = (wau) yjeVar;
                    int i13 = wauVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        wauVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        wauVar = new wau(this, yjeVar);
                    }
                } else {
                    wauVar = new wau(this, yjeVar);
                }
                Object obj9 = wauVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = wauVar.j;
                if (i14 == 0) {
                    z1x.P(obj9);
                    o4m o4mVar4 = new o4m((Object) kmqVar, obj, (byte) 24);
                    wauVar.j = 1;
                    if (((gmq) obj2).c(o4mVar4, wauVar) == wneVar7) {
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
                if (yjeVar instanceof bbu) {
                    bbuVar = (bbu) yjeVar;
                    int i15 = bbuVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        bbuVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        bbuVar = new bbu(this, yjeVar);
                    }
                } else {
                    bbuVar = new bbu(this, yjeVar);
                }
                Object obj10 = bbuVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = bbuVar.j;
                if (i16 != 0) {
                    if (i16 == 1) {
                        z1x.P(obj10);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj10);
                o4m o4mVar5 = new o4m(kmqVar, (wbq) obj, b4);
                bbuVar.j = 1;
                ((p7m0) obj2).c(o4mVar5, bbuVar);
                return wneVar8;
            case 8:
                if (yjeVar instanceof lcu) {
                    lcuVar = (lcu) yjeVar;
                    int i17 = lcuVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        lcuVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        lcuVar = new lcu(this, yjeVar);
                    }
                } else {
                    lcuVar = new lcu(this, yjeVar);
                }
                Object obj11 = lcuVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = lcuVar.j;
                if (i18 == 0) {
                    z1x.P(obj11);
                    o4m o4mVar6 = new o4m((Object) kmqVar, obj, (byte) 26);
                    lcuVar.j = 1;
                    if (((eu4) obj2).c(o4mVar6, lcuVar) == wneVar9) {
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
                if (yjeVar instanceof pcu) {
                    pcuVar = (pcu) yjeVar;
                    int i19 = pcuVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        pcuVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        pcuVar = new pcu(this, yjeVar);
                    }
                } else {
                    pcuVar = new pcu(this, yjeVar);
                }
                Object obj12 = pcuVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = pcuVar.j;
                if (i20 == 0) {
                    z1x.P(obj12);
                    o4m o4mVar7 = new o4m((Object) kmqVar, obj, (byte) 27);
                    pcuVar.j = 1;
                    if (((eu4) obj2).c(o4mVar7, pcuVar) == wneVar10) {
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
                if (yjeVar instanceof pku) {
                    pkuVar = (pku) yjeVar;
                    int i21 = pkuVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        pkuVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        pkuVar = new pku(this, yjeVar);
                    }
                } else {
                    pkuVar = new pku(this, yjeVar);
                }
                Object obj13 = pkuVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = pkuVar.j;
                if (i22 == 0) {
                    z1x.P(obj13);
                    o4m o4mVar8 = new o4m((Object) kmqVar, obj, (byte) 29);
                    pkuVar.j = 1;
                    if (((zj2) obj2).c(o4mVar8, pkuVar) == wneVar11) {
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
                if (yjeVar instanceof alu) {
                    aluVar = (alu) yjeVar;
                    int i23 = aluVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        aluVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        aluVar = new alu(this, yjeVar);
                    }
                } else {
                    aluVar = new alu(this, yjeVar);
                }
                Object obj14 = aluVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = aluVar.j;
                if (i24 != 0) {
                    if (i24 == 1) {
                        z1x.P(obj14);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj14);
                clu cluVar = new clu(kmqVar, (abu) obj, b5);
                aluVar.j = 1;
                ((p7m0) obj2).c(cluVar, aluVar);
                return wneVar12;
            case 12:
                if (yjeVar instanceof wuu) {
                    wuuVar = (wuu) yjeVar;
                    int i25 = wuuVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        wuuVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        wuuVar = new wuu(this, yjeVar);
                    }
                } else {
                    wuuVar = new wuu(this, yjeVar);
                }
                Object obj15 = wuuVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = wuuVar.j;
                if (i26 == 0) {
                    z1x.P(obj15);
                    clu cluVar2 = new clu(kmqVar, (yuu) obj, b8);
                    wuuVar.j = 1;
                    if (((vuu) obj2).c(cluVar2, wuuVar) == wneVar13) {
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
                if (yjeVar instanceof axu) {
                    axuVar = (axu) yjeVar;
                    int i27 = axuVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        axuVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        axuVar = new axu(this, yjeVar);
                    }
                } else {
                    axuVar = new axu(this, yjeVar);
                }
                Object obj16 = axuVar.i;
                wne wneVar14 = wne.f39444a;
                int i28 = axuVar.j;
                if (i28 != 0) {
                    if (i28 == 1) {
                        z1x.P(obj16);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj16);
                clu cluVar3 = new clu(kmqVar, (uii) obj, b7);
                axuVar.j = 1;
                ((p7m0) obj2).c(cluVar3, axuVar);
                return wneVar14;
            case 14:
                if (yjeVar instanceof mzu) {
                    mzuVar = (mzu) yjeVar;
                    int i29 = mzuVar.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        mzuVar.j = i29 - Integer.MIN_VALUE;
                    } else {
                        mzuVar = new mzu(this, yjeVar);
                    }
                } else {
                    mzuVar = new mzu(this, yjeVar);
                }
                Object obj17 = mzuVar.i;
                wne wneVar15 = wne.f39444a;
                int i30 = mzuVar.j;
                if (i30 == 0) {
                    z1x.P(obj17);
                    y6u y6uVar = new y6u(kmqVar, (pzu) obj);
                    mzuVar.j = 1;
                    if (((gmq) obj2).c(y6uVar, mzuVar) == wneVar15) {
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
                if (yjeVar instanceof rzu) {
                    rzuVar = (rzu) yjeVar;
                    int i31 = rzuVar.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        rzuVar.j = i31 - Integer.MIN_VALUE;
                    } else {
                        rzuVar = new rzu(this, yjeVar);
                    }
                } else {
                    rzuVar = new rzu(this, yjeVar);
                }
                Object obj18 = rzuVar.i;
                wne wneVar16 = wne.f39444a;
                int i32 = rzuVar.j;
                if (i32 == 0) {
                    z1x.P(obj18);
                    pqu pquVar = new pqu(kmqVar, (hie0) obj, (byte) 6);
                    rzuVar.j = 1;
                    if (((a1g) obj2).c(pquVar, rzuVar) == wneVar16) {
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
                if (yjeVar instanceof k5v) {
                    k5vVar = (k5v) yjeVar;
                    int i33 = k5vVar.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        k5vVar.j = i33 - Integer.MIN_VALUE;
                    } else {
                        k5vVar = new k5v(this, yjeVar);
                    }
                } else {
                    k5vVar = new k5v(this, yjeVar);
                }
                Object obj19 = k5vVar.i;
                wne wneVar17 = wne.f39444a;
                int i34 = k5vVar.j;
                if (i34 != 0) {
                    if (i34 == 1) {
                        z1x.P(obj19);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj19);
                xot xotVar3 = new xot(kmqVar, (List) obj, b2);
                k5vVar.j = 1;
                ((qoj0) obj2).c(xotVar3, k5vVar);
                return wneVar17;
            case 17:
                if (yjeVar instanceof j2w) {
                    j2wVar = (j2w) yjeVar;
                    int i35 = j2wVar.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        j2wVar.j = i35 - Integer.MIN_VALUE;
                    } else {
                        j2wVar = new j2w(this, yjeVar);
                    }
                } else {
                    j2wVar = new j2w(this, yjeVar);
                }
                Object obj20 = j2wVar.i;
                wne wneVar18 = wne.f39444a;
                int i36 = j2wVar.j;
                if (i36 == 0) {
                    z1x.P(obj20);
                    clu cluVar4 = new clu(kmqVar, (r2w) obj, b2);
                    j2wVar.j = 1;
                    if (((gmq) obj2).c(cluVar4, j2wVar) == wneVar18) {
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
                if (yjeVar instanceof y9w) {
                    y9wVar = (y9w) yjeVar;
                    int i37 = y9wVar.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        y9wVar.j = i37 - Integer.MIN_VALUE;
                    } else {
                        y9wVar = new y9w(this, yjeVar);
                    }
                } else {
                    y9wVar = new y9w(this, yjeVar);
                }
                Object obj21 = y9wVar.i;
                wne wneVar19 = wne.f39444a;
                int i38 = y9wVar.j;
                if (i38 == 0) {
                    z1x.P(obj21);
                    clu cluVar5 = new clu(kmqVar, (naw) obj, b3);
                    y9wVar.j = 1;
                    if (((utb) obj2).c(cluVar5, y9wVar) == wneVar19) {
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
                if (yjeVar instanceof rxy) {
                    rxyVar = (rxy) yjeVar;
                    int i39 = rxyVar.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        rxyVar.j = i39 - Integer.MIN_VALUE;
                    } else {
                        rxyVar = new rxy(this, yjeVar);
                    }
                } else {
                    rxyVar = new rxy(this, yjeVar);
                }
                Object obj22 = rxyVar.i;
                wne wneVar20 = wne.f39444a;
                int i40 = rxyVar.j;
                if (i40 == 0) {
                    z1x.P(obj22);
                    b4v b4vVar = new b4v(kmqVar, (svu) obj, b6);
                    rxyVar.j = 1;
                    if (((zj2) obj2).c(b4vVar, rxyVar) == wneVar20) {
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
            case 20:
                if (yjeVar instanceof h700) {
                    h700Var = (h700) yjeVar;
                    int i41 = h700Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        h700Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        h700Var = new h700(this, yjeVar);
                    }
                } else {
                    h700Var = new h700(this, yjeVar);
                }
                Object obj23 = h700Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = h700Var.j;
                if (i42 == 0) {
                    z1x.P(obj23);
                    xot xotVar4 = new xot(kmqVar, (List) obj, b3);
                    h700Var.j = 1;
                    if (((omi0) obj2).c(xotVar4, h700Var) == wneVar21) {
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
                if (yjeVar instanceof xp00) {
                    xp00Var = (xp00) yjeVar;
                    int i43 = xp00Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        xp00Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        xp00Var = new xp00(this, yjeVar);
                    }
                } else {
                    xp00Var = new xp00(this, yjeVar);
                }
                Object obj24 = xp00Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = xp00Var.j;
                if (i44 == 0) {
                    z1x.P(obj24);
                    gmq[] gmqVarArr = (gmq[]) obj2;
                    ti3 ti3Var = new ti3(gmqVarArr, (byte) 8);
                    sot sotVar = new sot(yjeVar2, (bq00) obj, b4);
                    xp00Var.j = 1;
                    if (tdc.G(xp00Var, kmqVar, sotVar, ti3Var, gmqVarArr) == wneVar22) {
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
                if (yjeVar instanceof zw10) {
                    zw10Var = (zw10) yjeVar;
                    int i45 = zw10Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        zw10Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        zw10Var = new zw10(this, yjeVar);
                    }
                } else {
                    zw10Var = new zw10(this, yjeVar);
                }
                Object obj25 = zw10Var.i;
                wne wneVar23 = wne.f39444a;
                int i46 = zw10Var.j;
                if (i46 == 0) {
                    z1x.P(obj25);
                    clu cluVar6 = new clu(kmqVar, (cx10) obj, (byte) 10);
                    zw10Var.j = 1;
                    if (((xae0) obj2).f40549a.c(cluVar6, zw10Var) == wneVar23) {
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
                if (yjeVar instanceof u120) {
                    u120Var = (u120) yjeVar;
                    int i47 = u120Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        u120Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        u120Var = new u120(this, yjeVar);
                    }
                } else {
                    u120Var = new u120(this, yjeVar);
                }
                Object obj26 = u120Var.i;
                wne wneVar24 = wne.f39444a;
                int i48 = u120Var.j;
                if (i48 == 0) {
                    z1x.P(obj26);
                    w120 w120Var = new w120(kmqVar, (w220) obj, b5);
                    u120Var.j = 1;
                    if (((fnq) obj2).c(w120Var, u120Var) == wneVar24) {
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
                if (yjeVar instanceof e220) {
                    e220Var = (e220) yjeVar;
                    int i49 = e220Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        e220Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        e220Var = new e220(this, yjeVar);
                    }
                } else {
                    e220Var = new e220(this, yjeVar);
                }
                Object obj27 = e220Var.i;
                wne wneVar25 = wne.f39444a;
                int i50 = e220Var.j;
                if (i50 == 0) {
                    z1x.P(obj27);
                    w120 w120Var2 = new w120(kmqVar, (w220) obj, b8);
                    e220Var.j = 1;
                    if (((a1t) obj2).c(w120Var2, e220Var) == wneVar25) {
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
                if (yjeVar instanceof i220) {
                    i220Var = (i220) yjeVar;
                    int i51 = i220Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        i220Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        i220Var = new i220(this, yjeVar);
                    }
                } else {
                    i220Var = new i220(this, yjeVar);
                }
                Object obj28 = i220Var.i;
                wne wneVar26 = wne.f39444a;
                int i52 = i220Var.j;
                if (i52 != 0) {
                    if (i52 == 1) {
                        z1x.P(obj28);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj28);
                w120 w120Var3 = new w120(kmqVar, (w220) obj, b7);
                i220Var.j = 1;
                ((p7m0) obj2).c(w120Var3, i220Var);
                return wneVar26;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof m720) {
                    m720Var = (m720) yjeVar;
                    int i53 = m720Var.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        m720Var.j = i53 - Integer.MIN_VALUE;
                    } else {
                        m720Var = new m720(this, yjeVar);
                    }
                } else {
                    m720Var = new m720(this, yjeVar);
                }
                Object obj29 = m720Var.i;
                wne wneVar27 = wne.f39444a;
                int i54 = m720Var.j;
                if (i54 == 0) {
                    z1x.P(obj29);
                    pqu pquVar2 = new pqu(kmqVar, (hie0) obj, (byte) 17);
                    m720Var.j = 1;
                    if (((vae0) obj2).f37082a.c(pquVar2, m720Var) == wneVar27) {
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
                if (yjeVar instanceof cf20) {
                    cf20Var = (cf20) yjeVar;
                    int i55 = cf20Var.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        cf20Var.j = i55 - Integer.MIN_VALUE;
                    } else {
                        cf20Var = new cf20(this, yjeVar);
                    }
                } else {
                    cf20Var = new cf20(this, yjeVar);
                }
                Object obj30 = cf20Var.i;
                wne wneVar28 = wne.f39444a;
                int i56 = cf20Var.j;
                if (i56 == 0) {
                    z1x.P(obj30);
                    clu cluVar7 = new clu(kmqVar, (rg20) obj, b6);
                    cf20Var.j = 1;
                    if (((gmq) obj2).c(cluVar7, cf20Var) == wneVar28) {
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
                if (yjeVar instanceof dl20) {
                    dl20Var = (dl20) yjeVar;
                    int i57 = dl20Var.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        dl20Var.j = i57 - Integer.MIN_VALUE;
                    } else {
                        dl20Var = new dl20(this, yjeVar);
                    }
                } else {
                    dl20Var = new dl20(this, yjeVar);
                }
                Object obj31 = dl20Var.i;
                wne wneVar29 = wne.f39444a;
                int i58 = dl20Var.j;
                if (i58 == 0) {
                    z1x.P(obj31);
                    clu cluVar8 = new clu(kmqVar, (kn20) obj, (byte) 14);
                    dl20Var.j = 1;
                    if (((ewt) obj2).c(cluVar8, dl20Var) == wneVar29) {
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
                if (yjeVar instanceof i430) {
                    i430Var = (i430) yjeVar;
                    int i59 = i430Var.j;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        i430Var.j = i59 - Integer.MIN_VALUE;
                    } else {
                        i430Var = new i430(this, yjeVar);
                    }
                } else {
                    i430Var = new i430(this, yjeVar);
                }
                Object obj32 = i430Var.i;
                wne wneVar30 = wne.f39444a;
                int i60 = i430Var.j;
                if (i60 == 0) {
                    z1x.P(obj32);
                    clu cluVar9 = new clu(kmqVar, (p430) obj, (byte) 15);
                    i430Var.j = 1;
                    if (((zj2) obj2).c(cluVar9, i430Var) == wneVar30) {
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
