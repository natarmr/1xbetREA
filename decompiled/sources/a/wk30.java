package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class wk30 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39290a;
    public final /* synthetic */ gmq b;

    public /* synthetic */ wk30(gmq gmqVar, byte b) {
        this.f39290a = b;
        this.b = gmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01af  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x022f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0270  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:185:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:201:0x0333  */
    /* JADX WARN: Code duplicated, block: B:222:0x0387  */
    /* JADX WARN: Code duplicated, block: B:238:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:254:0x0407  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:270:0x0446  */
    /* JADX WARN: Code duplicated, block: B:286:0x0485  */
    /* JADX WARN: Code duplicated, block: B:302:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:318:0x0503  */
    /* JADX WARN: Code duplicated, block: B:334:0x0542  */
    /* JADX WARN: Code duplicated, block: B:350:0x0581  */
    /* JADX WARN: Code duplicated, block: B:366:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:382:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:398:0x063e  */
    /* JADX WARN: Code duplicated, block: B:414:0x067f  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:430:0x06be  */
    /* JADX WARN: Code duplicated, block: B:446:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:462:0x073c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x0131  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        uk30 uk30Var;
        w240 w240Var;
        h550 h550Var;
        j550 j550Var;
        c750 c750Var;
        e750 e750Var;
        i260 i260Var;
        mb60 mb60Var;
        ze70 ze70Var;
        ot70 ot70Var;
        m980 m980Var;
        dt80 dt80Var;
        l990 l990Var;
        za90 za90Var;
        zr90 zr90Var;
        ns90 ns90Var;
        s0b0 s0b0Var;
        u0b0 u0b0Var;
        nab0 nab0Var;
        pab0 pab0Var;
        tab0 tab0Var;
        yab0 yab0Var;
        abb0 abb0Var;
        ypc0 ypc0Var;
        atc0 atc0Var;
        lwe0 lwe0Var;
        fxe0 fxe0Var;
        w3f0 w3f0Var;
        w9f0 w9f0Var;
        byte b = this.f39290a;
        byte b2 = 14;
        byte b3 = 19;
        byte b4 = 29;
        byte b5 = 7;
        byte b6 = 11;
        byte b7 = 12;
        byte b8 = 16;
        byte b9 = 8;
        byte b10 = 10;
        gmq gmqVar = this.b;
        byte b11 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof uk30) {
                    uk30Var = (uk30) yjeVar;
                    int i = uk30Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        uk30Var.j = i - Integer.MIN_VALUE;
                    } else {
                        uk30Var = new uk30(this, yjeVar);
                    }
                } else {
                    uk30Var = new uk30(this, yjeVar);
                }
                Object obj = uk30Var.i;
                wne wneVar = wne.f39444a;
                int i2 = uk30Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    b4v b4vVar = new b4v(kmqVar, b4);
                    uk30Var.j = 1;
                    if (gmqVar.c(b4vVar, uk30Var) == wneVar) {
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
                if (yjeVar instanceof w240) {
                    w240Var = (w240) yjeVar;
                    int i3 = w240Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        w240Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        w240Var = new w240(this, yjeVar);
                    }
                } else {
                    w240Var = new w240(this, yjeVar);
                }
                Object obj2 = w240Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = w240Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    nr30 nr30Var = new nr30(kmqVar, b11);
                    w240Var.j = 1;
                    if (gmqVar.c(nr30Var, w240Var) == wneVar2) {
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
                if (yjeVar instanceof h550) {
                    h550Var = (h550) yjeVar;
                    int i5 = h550Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        h550Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        h550Var = new h550(this, yjeVar);
                    }
                } else {
                    h550Var = new h550(this, yjeVar);
                }
                Object obj3 = h550Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = h550Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    nr30 nr30Var2 = new nr30(kmqVar, b5);
                    h550Var.j = 1;
                    if (gmqVar.c(nr30Var2, h550Var) == wneVar3) {
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
                if (yjeVar instanceof j550) {
                    j550Var = (j550) yjeVar;
                    int i7 = j550Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        j550Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        j550Var = new j550(this, yjeVar);
                    }
                } else {
                    j550Var = new j550(this, yjeVar);
                }
                Object obj4 = j550Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = j550Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    nr30 nr30Var3 = new nr30(kmqVar, b9);
                    j550Var.j = 1;
                    if (gmqVar.c(nr30Var3, j550Var) == wneVar4) {
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
                if (yjeVar instanceof c750) {
                    c750Var = (c750) yjeVar;
                    int i9 = c750Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c750Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        c750Var = new c750(this, yjeVar);
                    }
                } else {
                    c750Var = new c750(this, yjeVar);
                }
                Object obj5 = c750Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = c750Var.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    nr30 nr30Var4 = new nr30(kmqVar, (byte) 9);
                    c750Var.j = 1;
                    if (gmqVar.c(nr30Var4, c750Var) == wneVar5) {
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
                if (yjeVar instanceof e750) {
                    e750Var = (e750) yjeVar;
                    int i11 = e750Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        e750Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        e750Var = new e750(this, yjeVar);
                    }
                } else {
                    e750Var = new e750(this, yjeVar);
                }
                Object obj6 = e750Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = e750Var.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    nr30 nr30Var5 = new nr30(kmqVar, b10);
                    e750Var.j = 1;
                    if (gmqVar.c(nr30Var5, e750Var) == wneVar6) {
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
                if (yjeVar instanceof i260) {
                    i260Var = (i260) yjeVar;
                    int i13 = i260Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        i260Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        i260Var = new i260(this, yjeVar);
                    }
                } else {
                    i260Var = new i260(this, yjeVar);
                }
                Object obj7 = i260Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = i260Var.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    nr30 nr30Var6 = new nr30(kmqVar, b2);
                    i260Var.j = 1;
                    if (gmqVar.c(nr30Var6, i260Var) == wneVar7) {
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
                if (yjeVar instanceof mb60) {
                    mb60Var = (mb60) yjeVar;
                    int i15 = mb60Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        mb60Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        mb60Var = new mb60(this, yjeVar);
                    }
                } else {
                    mb60Var = new mb60(this, yjeVar);
                }
                Object obj8 = mb60Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = mb60Var.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    nr30 nr30Var7 = new nr30(kmqVar, b3);
                    mb60Var.j = 1;
                    if (gmqVar.c(nr30Var7, mb60Var) == wneVar8) {
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
                if (yjeVar instanceof ze70) {
                    ze70Var = (ze70) yjeVar;
                    int i17 = ze70Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ze70Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        ze70Var = new ze70(this, yjeVar);
                    }
                } else {
                    ze70Var = new ze70(this, yjeVar);
                }
                Object obj9 = ze70Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = ze70Var.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    ld60 ld60Var = new ld60(kmqVar, b9);
                    ze70Var.j = 1;
                    if (gmqVar.c(ld60Var, ze70Var) == wneVar9) {
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
                if (yjeVar instanceof ot70) {
                    ot70Var = (ot70) yjeVar;
                    int i19 = ot70Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ot70Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        ot70Var = new ot70(this, yjeVar);
                    }
                } else {
                    ot70Var = new ot70(this, yjeVar);
                }
                Object obj10 = ot70Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = ot70Var.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    ld60 ld60Var2 = new ld60(kmqVar, b10);
                    ot70Var.j = 1;
                    if (gmqVar.c(ld60Var2, ot70Var) == wneVar10) {
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
                if (yjeVar instanceof m980) {
                    m980Var = (m980) yjeVar;
                    int i21 = m980Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        m980Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        m980Var = new m980(this, yjeVar);
                    }
                } else {
                    m980Var = new m980(this, yjeVar);
                }
                Object obj11 = m980Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = m980Var.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    ld60 ld60Var3 = new ld60(kmqVar, b6);
                    m980Var.j = 1;
                    if (gmqVar.c(ld60Var3, m980Var) == wneVar11) {
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
                if (yjeVar instanceof dt80) {
                    dt80Var = (dt80) yjeVar;
                    int i23 = dt80Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        dt80Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        dt80Var = new dt80(this, yjeVar);
                    }
                } else {
                    dt80Var = new dt80(this, yjeVar);
                }
                Object obj12 = dt80Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = dt80Var.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    ld60 ld60Var4 = new ld60(kmqVar, b7);
                    dt80Var.j = 1;
                    if (gmqVar.c(ld60Var4, dt80Var) == wneVar12) {
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
                if (yjeVar instanceof l990) {
                    l990Var = (l990) yjeVar;
                    int i25 = l990Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        l990Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        l990Var = new l990(this, yjeVar);
                    }
                } else {
                    l990Var = new l990(this, yjeVar);
                }
                Object obj13 = l990Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = l990Var.j;
                if (i26 == 0) {
                    z1x.P(obj13);
                    ld60 ld60Var5 = new ld60(kmqVar, b2);
                    l990Var.j = 1;
                    if (gmqVar.c(ld60Var5, l990Var) == wneVar13) {
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
                if (yjeVar instanceof za90) {
                    za90Var = (za90) yjeVar;
                    int i27 = za90Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        za90Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        za90Var = new za90(this, yjeVar);
                    }
                } else {
                    za90Var = new za90(this, yjeVar);
                }
                Object obj14 = za90Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = za90Var.j;
                if (i28 == 0) {
                    z1x.P(obj14);
                    ld60 ld60Var6 = new ld60(kmqVar, b8);
                    za90Var.j = 1;
                    if (gmqVar.c(ld60Var6, za90Var) == wneVar14) {
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
                if (yjeVar instanceof zr90) {
                    zr90Var = (zr90) yjeVar;
                    int i29 = zr90Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        zr90Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        zr90Var = new zr90(this, yjeVar);
                    }
                } else {
                    zr90Var = new zr90(this, yjeVar);
                }
                Object obj15 = zr90Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = zr90Var.j;
                if (i30 == 0) {
                    z1x.P(obj15);
                    ld60 ld60Var7 = new ld60(kmqVar, b3);
                    zr90Var.j = 1;
                    if (gmqVar.c(ld60Var7, zr90Var) == wneVar15) {
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
                if (yjeVar instanceof ns90) {
                    ns90Var = (ns90) yjeVar;
                    int i31 = ns90Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        ns90Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        ns90Var = new ns90(this, yjeVar);
                    }
                } else {
                    ns90Var = new ns90(this, yjeVar);
                }
                Object obj16 = ns90Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = ns90Var.j;
                if (i32 == 0) {
                    z1x.P(obj16);
                    ld60 ld60Var8 = new ld60(kmqVar, (byte) 20);
                    ns90Var.j = 1;
                    if (gmqVar.c(ld60Var8, ns90Var) == wneVar16) {
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
                Object objC = gmqVar.c(new ld60(kmqVar, (byte) 21), yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
            case 17:
                if (yjeVar instanceof s0b0) {
                    s0b0Var = (s0b0) yjeVar;
                    int i33 = s0b0Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        s0b0Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        s0b0Var = new s0b0(this, yjeVar);
                    }
                } else {
                    s0b0Var = new s0b0(this, yjeVar);
                }
                Object obj17 = s0b0Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = s0b0Var.j;
                if (i34 == 0) {
                    z1x.P(obj17);
                    ld60 ld60Var9 = new ld60(kmqVar, (byte) 22);
                    s0b0Var.j = 1;
                    if (gmqVar.c(ld60Var9, s0b0Var) == wneVar17) {
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
            case 18:
                if (yjeVar instanceof u0b0) {
                    u0b0Var = (u0b0) yjeVar;
                    int i35 = u0b0Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        u0b0Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        u0b0Var = new u0b0(this, yjeVar);
                    }
                } else {
                    u0b0Var = new u0b0(this, yjeVar);
                }
                Object obj18 = u0b0Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = u0b0Var.j;
                if (i36 == 0) {
                    z1x.P(obj18);
                    ld60 ld60Var10 = new ld60(kmqVar, (byte) 23);
                    u0b0Var.j = 1;
                    if (gmqVar.c(ld60Var10, u0b0Var) == wneVar18) {
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
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof nab0) {
                    nab0Var = (nab0) yjeVar;
                    int i37 = nab0Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        nab0Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        nab0Var = new nab0(this, yjeVar);
                    }
                } else {
                    nab0Var = new nab0(this, yjeVar);
                }
                Object obj19 = nab0Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = nab0Var.j;
                if (i38 == 0) {
                    z1x.P(obj19);
                    ld60 ld60Var11 = new ld60(kmqVar, (byte) 24);
                    nab0Var.j = 1;
                    if (gmqVar.c(ld60Var11, nab0Var) == wneVar19) {
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
            case 20:
                if (yjeVar instanceof pab0) {
                    pab0Var = (pab0) yjeVar;
                    int i39 = pab0Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        pab0Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        pab0Var = new pab0(this, yjeVar);
                    }
                } else {
                    pab0Var = new pab0(this, yjeVar);
                }
                Object obj20 = pab0Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = pab0Var.j;
                if (i40 == 0) {
                    z1x.P(obj20);
                    ld60 ld60Var12 = new ld60(kmqVar, (byte) 25);
                    pab0Var.j = 1;
                    if (gmqVar.c(ld60Var12, pab0Var) == wneVar20) {
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
            case 21:
                if (yjeVar instanceof tab0) {
                    tab0Var = (tab0) yjeVar;
                    int i41 = tab0Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        tab0Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        tab0Var = new tab0(this, yjeVar);
                    }
                } else {
                    tab0Var = new tab0(this, yjeVar);
                }
                Object obj21 = tab0Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = tab0Var.j;
                if (i42 == 0) {
                    z1x.P(obj21);
                    ld60 ld60Var13 = new ld60(kmqVar, (byte) 27);
                    tab0Var.j = 1;
                    if (gmqVar.c(ld60Var13, tab0Var) == wneVar21) {
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
            case 22:
                if (yjeVar instanceof yab0) {
                    yab0Var = (yab0) yjeVar;
                    int i43 = yab0Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        yab0Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        yab0Var = new yab0(this, yjeVar);
                    }
                } else {
                    yab0Var = new yab0(this, yjeVar);
                }
                Object obj22 = yab0Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = yab0Var.j;
                if (i44 == 0) {
                    z1x.P(obj22);
                    ld60 ld60Var14 = new ld60(kmqVar, (byte) 28);
                    yab0Var.j = 1;
                    if (gmqVar.c(ld60Var14, yab0Var) == wneVar22) {
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
            case 23:
                if (yjeVar instanceof abb0) {
                    abb0Var = (abb0) yjeVar;
                    int i45 = abb0Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        abb0Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        abb0Var = new abb0(this, yjeVar);
                    }
                } else {
                    abb0Var = new abb0(this, yjeVar);
                }
                Object obj23 = abb0Var.i;
                wne wneVar23 = wne.f39444a;
                int i46 = abb0Var.j;
                if (i46 == 0) {
                    z1x.P(obj23);
                    ld60 ld60Var15 = new ld60(kmqVar, b4);
                    abb0Var.j = 1;
                    if (gmqVar.c(ld60Var15, abb0Var) == wneVar23) {
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
            case 24:
                if (yjeVar instanceof ypc0) {
                    ypc0Var = (ypc0) yjeVar;
                    int i47 = ypc0Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        ypc0Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        ypc0Var = new ypc0(this, yjeVar);
                    }
                } else {
                    ypc0Var = new ypc0(this, yjeVar);
                }
                Object obj24 = ypc0Var.i;
                wne wneVar24 = wne.f39444a;
                int i48 = ypc0Var.j;
                if (i48 == 0) {
                    z1x.P(obj24);
                    hbb0 hbb0Var = new hbb0(kmqVar, b5);
                    ypc0Var.j = 1;
                    if (gmqVar.c(hbb0Var, ypc0Var) == wneVar24) {
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
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof atc0) {
                    atc0Var = (atc0) yjeVar;
                    int i49 = atc0Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        atc0Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        atc0Var = new atc0(this, yjeVar);
                    }
                } else {
                    atc0Var = new atc0(this, yjeVar);
                }
                Object obj25 = atc0Var.i;
                wne wneVar25 = wne.f39444a;
                int i50 = atc0Var.j;
                if (i50 == 0) {
                    z1x.P(obj25);
                    hbb0 hbb0Var2 = new hbb0(kmqVar, b9);
                    atc0Var.j = 1;
                    if (gmqVar.c(hbb0Var2, atc0Var) == wneVar25) {
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
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof lwe0) {
                    lwe0Var = (lwe0) yjeVar;
                    int i51 = lwe0Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        lwe0Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        lwe0Var = new lwe0(this, yjeVar);
                    }
                } else {
                    lwe0Var = new lwe0(this, yjeVar);
                }
                Object obj26 = lwe0Var.i;
                wne wneVar26 = wne.f39444a;
                int i52 = lwe0Var.j;
                if (i52 == 0) {
                    z1x.P(obj26);
                    hbb0 hbb0Var3 = new hbb0(kmqVar, b10);
                    lwe0Var.j = 1;
                    if (gmqVar.c(hbb0Var3, lwe0Var) == wneVar26) {
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
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof fxe0) {
                    fxe0Var = (fxe0) yjeVar;
                    int i53 = fxe0Var.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        fxe0Var.j = i53 - Integer.MIN_VALUE;
                    } else {
                        fxe0Var = new fxe0(this, yjeVar);
                    }
                } else {
                    fxe0Var = new fxe0(this, yjeVar);
                }
                Object obj27 = fxe0Var.i;
                wne wneVar27 = wne.f39444a;
                int i54 = fxe0Var.j;
                if (i54 == 0) {
                    z1x.P(obj27);
                    hbb0 hbb0Var4 = new hbb0(kmqVar, b6);
                    fxe0Var.j = 1;
                    if (gmqVar.c(hbb0Var4, fxe0Var) == wneVar27) {
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
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof w3f0) {
                    w3f0Var = (w3f0) yjeVar;
                    int i55 = w3f0Var.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        w3f0Var.j = i55 - Integer.MIN_VALUE;
                    } else {
                        w3f0Var = new w3f0(this, yjeVar);
                    }
                } else {
                    w3f0Var = new w3f0(this, yjeVar);
                }
                Object obj28 = w3f0Var.i;
                wne wneVar28 = wne.f39444a;
                int i56 = w3f0Var.j;
                if (i56 == 0) {
                    z1x.P(obj28);
                    hbb0 hbb0Var5 = new hbb0(kmqVar, b7);
                    w3f0Var.j = 1;
                    if (gmqVar.c(hbb0Var5, w3f0Var) == wneVar28) {
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
            default:
                if (yjeVar instanceof w9f0) {
                    w9f0Var = (w9f0) yjeVar;
                    int i57 = w9f0Var.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        w9f0Var.j = i57 - Integer.MIN_VALUE;
                    } else {
                        w9f0Var = new w9f0(this, yjeVar);
                    }
                } else {
                    w9f0Var = new w9f0(this, yjeVar);
                }
                Object obj29 = w9f0Var.i;
                wne wneVar29 = wne.f39444a;
                int i58 = w9f0Var.j;
                if (i58 == 0) {
                    z1x.P(obj29);
                    hbb0 hbb0Var6 = new hbb0(kmqVar, b8);
                    w9f0Var.j = 1;
                    if (gmqVar.c(hbb0Var6, w9f0Var) == wneVar29) {
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
        }
    }
}
