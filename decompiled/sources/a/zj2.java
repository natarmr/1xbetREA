package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class zj2 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44466a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public zj2(vzg0 vzg0Var, String str, Object obj) {
        this.f44466a = (byte) 16;
        this.c = vzg0Var;
        this.d = str;
        this.b = maz.b(new g8l(vzg0Var, str, obj, (byte) 26));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:121:0x020a  */
    /* JADX WARN: Code duplicated, block: B:134:0x024b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0290  */
    /* JADX WARN: Code duplicated, block: B:166:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:182:0x0318  */
    /* JADX WARN: Code duplicated, block: B:198:0x035d  */
    /* JADX WARN: Code duplicated, block: B:214:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:256:0x045c  */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:272:0x049f  */
    /* JADX WARN: Code duplicated, block: B:288:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:304:0x0528  */
    /* JADX WARN: Code duplicated, block: B:320:0x0571  */
    /* JADX WARN: Code duplicated, block: B:336:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x013a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        wj2 wj2Var;
        dua duaVar;
        e8d e8dVar;
        hbf hbfVar;
        tbp tbpVar;
        vpp vppVar;
        v3u v3uVar;
        j4u j4uVar;
        ueu ueuVar;
        ufu ufuVar;
        liu liuVar;
        bwu bwuVar;
        s5v s5vVar;
        w230 w230Var;
        sz40 sz40Var;
        zb60 zb60Var;
        fc60 fc60Var;
        ax70 ax70Var;
        adm0 adm0Var;
        vqn0 vqn0Var;
        qyn0 qyn0Var;
        byte b = this.f44466a;
        byte b2 = 15;
        byte b3 = 11;
        byte b4 = 0;
        byte b5 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        byte b6 = 1;
        yje yjeVar2 = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof wj2) {
                    wj2Var = (wj2) yjeVar;
                    int i = wj2Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wj2Var.j = i - Integer.MIN_VALUE;
                    } else {
                        wj2Var = new wj2(this, yjeVar);
                    }
                } else {
                    wj2Var = new wj2(this, yjeVar);
                }
                Object obj4 = wj2Var.i;
                wne wneVar = wne.f39444a;
                int i2 = wj2Var.j;
                if (i2 == 0) {
                    z1x.P(obj4);
                    yj2 yj2Var = new yj2(kmqVar, (fk2) obj2, (Throwable) obj, b4);
                    wj2Var.j = 1;
                    if (((utb) obj3).c(yj2Var, wj2Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof dua) {
                    duaVar = (dua) yjeVar;
                    int i3 = duaVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        duaVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        duaVar = new dua(this, yjeVar);
                    }
                } else {
                    duaVar = new dua(this, yjeVar);
                }
                Object obj5 = duaVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = duaVar.j;
                if (i4 == 0) {
                    z1x.P(obj5);
                    yj2 yj2Var2 = new yj2(kmqVar, (fua) obj2, (udl0) obj, b5);
                    duaVar.j = 1;
                    if (((xae0) obj3).f40549a.c(yj2Var2, duaVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof e8d) {
                    e8dVar = (e8d) yjeVar;
                    int i5 = e8dVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        e8dVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        e8dVar = new e8d(this, yjeVar);
                    }
                } else {
                    e8dVar = new e8d(this, yjeVar);
                }
                Object obj6 = e8dVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = e8dVar.j;
                if (i6 == 0) {
                    z1x.P(obj6);
                    gmq[] gmqVarArr = (gmq[]) obj3;
                    ti3 ti3Var = new ti3(gmqVarArr, (byte) 1);
                    fe0 fe0Var = new fe0(yjeVar2, obj2, obj, (byte) 3);
                    e8dVar.j = 1;
                    if (tdc.G(e8dVar, kmqVar, fe0Var, ti3Var, gmqVarArr) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof hbf) {
                    hbfVar = (hbf) yjeVar;
                    int i7 = hbfVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        hbfVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        hbfVar = new hbf(this, yjeVar);
                    }
                } else {
                    hbfVar = new hbf(this, yjeVar);
                }
                Object obj7 = hbfVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = hbfVar.j;
                if (i8 == 0) {
                    z1x.P(obj7);
                    yj2 yj2Var3 = new yj2((Object) kmqVar, obj2, obj, (byte) 5);
                    hbfVar.j = 1;
                    if (((gmq) obj3).c(yj2Var3, hbfVar) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof tbp) {
                    tbpVar = (tbp) yjeVar;
                    int i9 = tbpVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        tbpVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        tbpVar = new tbp(this, yjeVar);
                    }
                } else {
                    tbpVar = new tbp(this, yjeVar);
                }
                Object obj8 = tbpVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = tbpVar.j;
                if (i10 == 0) {
                    z1x.P(obj8);
                    yj2 yj2Var4 = new yj2((Object) kmqVar, obj2, obj, (byte) 9);
                    tbpVar.j = 1;
                    if (((p6d) obj3).c(yj2Var4, tbpVar) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof vpp) {
                    vppVar = (vpp) yjeVar;
                    int i11 = vppVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        vppVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        vppVar = new vpp(this, yjeVar);
                    }
                } else {
                    vppVar = new vpp(this, yjeVar);
                }
                Object obj9 = vppVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = vppVar.j;
                if (i12 == 0) {
                    z1x.P(obj9);
                    yj2 yj2Var5 = new yj2(kmqVar, (sgs) obj2, (tzi) obj, b3);
                    vppVar.j = 1;
                    if (((utb) obj3).c(yj2Var5, vppVar) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 6:
                Object objC = ((gmq) obj3).c(new yj2(kmqVar, (zdg0) obj2, (Function2) obj, b2), yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
            case 7:
                Object objC2 = ((gmq) obj3).c(new yj2((Object) kmqVar, obj2, obj, (byte) 16), yjeVar);
                return objC2 == wne.f39444a ? objC2 : Unit.f46060a;
            case 8:
                if (yjeVar instanceof v3u) {
                    v3uVar = (v3u) yjeVar;
                    int i13 = v3uVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        v3uVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        v3uVar = new v3u(this, yjeVar);
                    }
                } else {
                    v3uVar = new v3u(this, yjeVar);
                }
                Object obj10 = v3uVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = v3uVar.j;
                if (i14 == 0) {
                    z1x.P(obj10);
                    yj2 yj2Var6 = new yj2((Object) kmqVar, obj2, obj, (byte) 18);
                    v3uVar.j = 1;
                    if (((acu) obj3).c(yj2Var6, v3uVar) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof j4u) {
                    j4uVar = (j4u) yjeVar;
                    int i15 = j4uVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        j4uVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        j4uVar = new j4u(this, yjeVar);
                    }
                } else {
                    j4uVar = new j4u(this, yjeVar);
                }
                Object obj11 = j4uVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = j4uVar.j;
                if (i16 == 0) {
                    z1x.P(obj11);
                    yj2 yj2Var7 = new yj2((Object) kmqVar, obj2, obj, (byte) 19);
                    j4uVar.j = 1;
                    if (((fnq) obj3).c(yj2Var7, j4uVar) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof ueu) {
                    ueuVar = (ueu) yjeVar;
                    int i17 = ueuVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ueuVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        ueuVar = new ueu(this, yjeVar);
                    }
                } else {
                    ueuVar = new ueu(this, yjeVar);
                }
                Object obj12 = ueuVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = ueuVar.j;
                if (i18 == 0) {
                    z1x.P(obj12);
                    yj2 yj2Var8 = new yj2((Object) kmqVar, obj2, obj, (byte) 20);
                    ueuVar.j = 1;
                    if (((zj2) obj3).c(yj2Var8, ueuVar) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof ufu) {
                    ufuVar = (ufu) yjeVar;
                    int i19 = ufuVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ufuVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        ufuVar = new ufu(this, yjeVar);
                    }
                } else {
                    ufuVar = new ufu(this, yjeVar);
                }
                Object obj13 = ufuVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = ufuVar.j;
                if (i20 == 0) {
                    z1x.P(obj13);
                    yj2 yj2Var9 = new yj2((Object) kmqVar, obj2, obj, (byte) 21);
                    ufuVar.j = 1;
                    if (((acu) obj3).c(yj2Var9, ufuVar) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof liu) {
                    liuVar = (liu) yjeVar;
                    int i21 = liuVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        liuVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        liuVar = new liu(this, yjeVar);
                    }
                } else {
                    liuVar = new liu(this, yjeVar);
                }
                Object obj14 = liuVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = liuVar.j;
                if (i22 == 0) {
                    z1x.P(obj14);
                    o4m o4mVar = new o4m(kmqVar, (ywq0) obj2, (hhq0) obj);
                    liuVar.j = 1;
                    if (((vsg0) obj3).c(o4mVar, liuVar) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof bwu) {
                    bwuVar = (bwu) yjeVar;
                    int i23 = bwuVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        bwuVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        bwuVar = new bwu(this, yjeVar);
                    }
                } else {
                    bwuVar = new bwu(this, yjeVar);
                }
                Object obj15 = bwuVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = bwuVar.j;
                if (i24 == 0) {
                    z1x.P(obj15);
                    yj2 yj2Var10 = new yj2((Object) kmqVar, obj2, obj, (byte) 22);
                    bwuVar.j = 1;
                    if (((qz40) obj3).c(yj2Var10, bwuVar) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof s5v) {
                    s5vVar = (s5v) yjeVar;
                    int i25 = s5vVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        s5vVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        s5vVar = new s5v(this, yjeVar);
                    }
                } else {
                    s5vVar = new s5v(this, yjeVar);
                }
                Object obj16 = s5vVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = s5vVar.j;
                if (i26 == 0) {
                    z1x.P(obj16);
                    yj2 yj2Var11 = new yj2((Object) kmqVar, obj2, obj, (byte) 23);
                    s5vVar.j = 1;
                    if (((acu) obj3).c(yj2Var11, s5vVar) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof w230) {
                    w230Var = (w230) yjeVar;
                    int i27 = w230Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        w230Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        w230Var = new w230(this, yjeVar);
                    }
                } else {
                    w230Var = new w230(this, yjeVar);
                }
                Object obj17 = w230Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = w230Var.j;
                if (i28 != 0) {
                    if (i28 == 1) {
                        z1x.P(obj17);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj17);
                yj2 yj2Var12 = new yj2((Object) kmqVar, obj2, obj, (byte) 26);
                w230Var.j = 1;
                ((p7m0) obj3).c(yj2Var12, w230Var);
                return wneVar14;
            case 16:
                if (yjeVar instanceof sz40) {
                    sz40Var = (sz40) yjeVar;
                    int i29 = sz40Var.k;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        sz40Var.k = i29 - Integer.MIN_VALUE;
                    } else {
                        sz40Var = new sz40(this, yjeVar);
                    }
                } else {
                    sz40Var = new sz40(this, yjeVar);
                }
                Object obj18 = sz40Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = sz40Var.k;
                if (i30 == 0) {
                    z1x.P(obj18);
                    n7m0 n7m0Var = (n7m0) ((n0o0) obj3).getValue();
                    sz40Var.k = 1;
                    if (n7m0Var.c(kmqVar, sz40Var) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                csj.b();
                return null;
            case 17:
                if (yjeVar instanceof zb60) {
                    zb60Var = (zb60) yjeVar;
                    int i31 = zb60Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        zb60Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        zb60Var = new zb60(this, yjeVar);
                    }
                } else {
                    zb60Var = new zb60(this, yjeVar);
                }
                Object obj19 = zb60Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = zb60Var.j;
                if (i32 == 0) {
                    z1x.P(obj19);
                    gmq[] gmqVarArr2 = (gmq[]) obj3;
                    ti3 ti3Var2 = new ti3(gmqVarArr2, (byte) 11);
                    fe0 fe0Var2 = new fe0(yjeVar2, (j910) obj2, (List) obj, b2);
                    zb60Var.j = 1;
                    if (tdc.G(zb60Var, kmqVar, fe0Var2, ti3Var2, gmqVarArr2) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof fc60) {
                    fc60Var = (fc60) yjeVar;
                    int i33 = fc60Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        fc60Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        fc60Var = new fc60(this, yjeVar);
                    }
                } else {
                    fc60Var = new fc60(this, yjeVar);
                }
                Object obj20 = fc60Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = fc60Var.j;
                if (i34 == 0) {
                    z1x.P(obj20);
                    yj2 yj2Var13 = new yj2((Object) kmqVar, obj2, obj, (byte) 28);
                    fc60Var.j = 1;
                    if (((vae0) obj3).f37082a.c(yj2Var13, fc60Var) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof ax70) {
                    ax70Var = (ax70) yjeVar;
                    int i35 = ax70Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        ax70Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        ax70Var = new ax70(this, yjeVar);
                    }
                } else {
                    ax70Var = new ax70(this, yjeVar);
                }
                Object obj21 = ax70Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = ax70Var.j;
                if (i36 == 0) {
                    z1x.P(obj21);
                    yj2 yj2Var14 = new yj2((Object) kmqVar, obj2, obj, (byte) 29);
                    ax70Var.j = 1;
                    if (((xae0) obj3).f40549a.c(yj2Var14, ax70Var) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof adm0) {
                    adm0Var = (adm0) yjeVar;
                    int i37 = adm0Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        adm0Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        adm0Var = new adm0(this, yjeVar);
                    }
                } else {
                    adm0Var = new adm0(this, yjeVar);
                }
                Object obj22 = adm0Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = adm0Var.j;
                if (i38 == 0) {
                    z1x.P(obj22);
                    cdm0 cdm0Var = new cdm0(kmqVar, (ddm0) obj2, (String) obj, b4);
                    adm0Var.j = 1;
                    if (((vae0) obj3).f37082a.c(cdm0Var, adm0Var) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof vqn0) {
                    vqn0Var = (vqn0) yjeVar;
                    int i39 = vqn0Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        vqn0Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        vqn0Var = new vqn0(this, yjeVar);
                    }
                } else {
                    vqn0Var = new vqn0(this, yjeVar);
                }
                Object obj23 = vqn0Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = vqn0Var.j;
                if (i40 == 0) {
                    z1x.P(obj23);
                    cdm0 cdm0Var2 = new cdm0(kmqVar, (jsn0) obj2, (arn0) obj, b6);
                    vqn0Var.j = 1;
                    if (((gmq) obj3).c(cdm0Var2, vqn0Var) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof qyn0) {
                    qyn0Var = (qyn0) yjeVar;
                    int i41 = qyn0Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        qyn0Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        qyn0Var = new qyn0(this, yjeVar);
                    }
                } else {
                    qyn0Var = new qyn0(this, yjeVar);
                }
                Object obj24 = qyn0Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = qyn0Var.j;
                if (i42 == 0) {
                    z1x.P(obj24);
                    cdm0 cdm0Var3 = new cdm0(kmqVar, (jsn0) obj2, (zyn0) obj, b5);
                    qyn0Var.j = 1;
                    if (((gmq) obj3).c(cdm0Var3, qyn0Var) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
        }
    }

    public void f(Object obj) {
        ((vzg0) this.c).e((String) this.d, obj);
    }

    public Object getValue() {
        return ((n7m0) ((n0o0) this.b).getValue()).getValue();
    }

    public /* synthetic */ zj2(Object obj, Object obj2, Object obj3, byte b) {
        this.f44466a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
