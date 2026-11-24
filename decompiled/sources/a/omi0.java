package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class omi0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25506a;
    public final /* synthetic */ gmq b;
    public final /* synthetic */ Object c;

    public /* synthetic */ omi0(gmq gmqVar, Object obj, byte b) {
        this.f25506a = b;
        this.b = gmqVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:118:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:134:0x022c  */
    /* JADX WARN: Code duplicated, block: B:150:0x026b  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:198:0x032e  */
    /* JADX WARN: Code duplicated, block: B:214:0x0373  */
    /* JADX WARN: Code duplicated, block: B:230:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:246:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        mmi0 mmi0Var;
        vej0 vej0Var;
        wwj0 wwj0Var;
        qyj0 qyj0Var;
        mbl0 mbl0Var;
        pbl0 pbl0Var;
        njl0 njl0Var;
        tsl0 tsl0Var;
        z8n0 z8n0Var;
        qco0 qco0Var;
        u1q0 u1q0Var;
        c2q0 c2q0Var;
        emr0 emr0Var;
        b3t0 b3t0Var;
        e3t0 e3t0Var;
        tcv0 tcv0Var;
        byte b = this.f25506a;
        byte b2 = 26;
        byte b3 = 0;
        Object obj = this.c;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof mmi0) {
                    mmi0Var = (mmi0) yjeVar;
                    int i = mmi0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        mmi0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        mmi0Var = new mmi0(this, yjeVar);
                    }
                } else {
                    mmi0Var = new mmi0(this, yjeVar);
                }
                Object obj2 = mmi0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = mmi0Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    hbb0 hbb0Var = new hbb0(kmqVar, (pmi0) obj, b2);
                    mmi0Var.j = 1;
                    if (gmqVar.c(hbb0Var, mmi0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof vej0) {
                    vej0Var = (vej0) yjeVar;
                    int i3 = vej0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vej0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        vej0Var = new vej0(this, yjeVar);
                    }
                } else {
                    vej0Var = new vej0(this, yjeVar);
                }
                Object obj3 = vej0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = vej0Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    r980 r980Var = new r980(kmqVar, (org.xplatform.settings.impl.presentation.a) obj, (byte) 20);
                    vej0Var.j = 1;
                    if (gmqVar.c(r980Var, vej0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof wwj0) {
                    wwj0Var = (wwj0) yjeVar;
                    int i5 = wwj0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        wwj0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        wwj0Var = new wwj0(this, yjeVar);
                    }
                } else {
                    wwj0Var = new wwj0(this, yjeVar);
                }
                Object obj4 = wwj0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = wwj0Var.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    r980 r980Var2 = new r980(kmqVar, (yxj0) obj, (byte) 21);
                    wwj0Var.j = 1;
                    if (gmqVar.c(r980Var2, wwj0Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof qyj0) {
                    qyj0Var = (qyj0) yjeVar;
                    int i7 = qyj0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        qyj0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        qyj0Var = new qyj0(this, yjeVar);
                    }
                } else {
                    qyj0Var = new qyj0(this, yjeVar);
                }
                Object obj5 = qyj0Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = qyj0Var.j;
                if (i8 == 0) {
                    z1x.P(obj5);
                    r980 r980Var3 = new r980(kmqVar, (wyj0) obj, (byte) 22);
                    qyj0Var.j = 1;
                    if (((xae0) gmqVar).f40549a.c(r980Var3, qyj0Var) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof mbl0) {
                    mbl0Var = (mbl0) yjeVar;
                    int i9 = mbl0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        mbl0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        mbl0Var = new mbl0(this, yjeVar);
                    }
                } else {
                    mbl0Var = new mbl0(this, yjeVar);
                }
                Object obj6 = mbl0Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = mbl0Var.j;
                if (i10 == 0) {
                    z1x.P(obj6);
                    obl0 obl0Var = new obl0(kmqVar, (ncl0) obj, (byte) 0);
                    mbl0Var.j = 1;
                    if (gmqVar.c(obl0Var, mbl0Var) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof pbl0) {
                    pbl0Var = (pbl0) yjeVar;
                    int i11 = pbl0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        pbl0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        pbl0Var = new pbl0(this, yjeVar);
                    }
                } else {
                    pbl0Var = new pbl0(this, yjeVar);
                }
                Object obj7 = pbl0Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = pbl0Var.j;
                if (i12 == 0) {
                    z1x.P(obj7);
                    obl0 obl0Var2 = new obl0(kmqVar, (ncl0) obj, (byte) 1);
                    pbl0Var.j = 1;
                    if (((i89) gmqVar).c(obl0Var2, pbl0Var) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof njl0) {
                    njl0Var = (njl0) yjeVar;
                    int i13 = njl0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        njl0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        njl0Var = new njl0(this, yjeVar);
                    }
                } else {
                    njl0Var = new njl0(this, yjeVar);
                }
                Object obj8 = njl0Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = njl0Var.j;
                if (i14 == 0) {
                    z1x.P(obj8);
                    r980 r980Var4 = new r980(kmqVar, (sjl0) obj, (byte) 24);
                    njl0Var.j = 1;
                    if (((zj2) gmqVar).c(r980Var4, njl0Var) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof tsl0) {
                    tsl0Var = (tsl0) yjeVar;
                    int i15 = tsl0Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        tsl0Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        tsl0Var = new tsl0(this, yjeVar);
                    }
                } else {
                    tsl0Var = new tsl0(this, yjeVar);
                }
                Object obj9 = tsl0Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = tsl0Var.j;
                if (i16 == 0) {
                    z1x.P(obj9);
                    r980 r980Var5 = new r980(kmqVar, (vsl0) obj, b2);
                    tsl0Var.j = 1;
                    if (gmqVar.c(r980Var5, tsl0Var) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof z8n0) {
                    z8n0Var = (z8n0) yjeVar;
                    int i17 = z8n0Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        z8n0Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        z8n0Var = new z8n0(this, yjeVar);
                    }
                } else {
                    z8n0Var = new z8n0(this, yjeVar);
                }
                Object obj10 = z8n0Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = z8n0Var.j;
                if (i18 == 0) {
                    z1x.P(obj10);
                    r980 r980Var6 = new r980(kmqVar, (yuu) obj, (byte) 28);
                    z8n0Var.j = 1;
                    if (gmqVar.c(r980Var6, z8n0Var) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof qco0) {
                    qco0Var = (qco0) yjeVar;
                    int i19 = qco0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        qco0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        qco0Var = new qco0(this, yjeVar);
                    }
                } else {
                    qco0Var = new qco0(this, yjeVar);
                }
                Object obj11 = qco0Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = qco0Var.j;
                if (i20 == 0) {
                    z1x.P(obj11);
                    sco0 sco0Var = new sco0(kmqVar, (sh60) obj, b3);
                    qco0Var.j = 1;
                    if (((xae0) gmqVar).f40549a.c(sco0Var, qco0Var) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof u1q0) {
                    u1q0Var = (u1q0) yjeVar;
                    int i21 = u1q0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        u1q0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        u1q0Var = new u1q0(this, yjeVar);
                    }
                } else {
                    u1q0Var = new u1q0(this, yjeVar);
                }
                Object obj12 = u1q0Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = u1q0Var.j;
                if (i22 == 0) {
                    z1x.P(obj12);
                    sco0 sco0Var2 = new sco0(kmqVar, (x1q0) obj, (byte) 2);
                    u1q0Var.j = 1;
                    if (((omi0) gmqVar).c(sco0Var2, u1q0Var) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof c2q0) {
                    c2q0Var = (c2q0) yjeVar;
                    int i23 = c2q0Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        c2q0Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        c2q0Var = new c2q0(this, yjeVar);
                    }
                } else {
                    c2q0Var = new c2q0(this, yjeVar);
                }
                Object obj13 = c2q0Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = c2q0Var.j;
                if (i24 == 0) {
                    z1x.P(obj13);
                    d8n0 d8n0Var = new d8n0(kmqVar, (j6m0) obj);
                    c2q0Var.j = 1;
                    if (((eu4) gmqVar).c(d8n0Var, c2q0Var) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof emr0) {
                    emr0Var = (emr0) yjeVar;
                    int i25 = emr0Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        emr0Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        emr0Var = new emr0(this, yjeVar);
                    }
                } else {
                    emr0Var = new emr0(this, yjeVar);
                }
                Object obj14 = emr0Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = emr0Var.j;
                if (i26 == 0) {
                    z1x.P(obj14);
                    sco0 sco0Var3 = new sco0(kmqVar, (gmr0) obj, (byte) 4);
                    emr0Var.j = 1;
                    if (((i89) gmqVar).c(sco0Var3, emr0Var) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof b3t0) {
                    b3t0Var = (b3t0) yjeVar;
                    int i27 = b3t0Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        b3t0Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        b3t0Var = new b3t0(this, yjeVar);
                    }
                } else {
                    b3t0Var = new b3t0(this, yjeVar);
                }
                Object obj15 = b3t0Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = b3t0Var.j;
                if (i28 != 0) {
                    if (i28 == 1) {
                        z1x.P(obj15);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj15);
                d3t0 d3t0Var = new d3t0(kmqVar, (Function1) obj, (byte) 0);
                b3t0Var.j = 1;
                ((p7m0) gmqVar).c(d3t0Var, b3t0Var);
                return wneVar14;
            case 14:
                if (yjeVar instanceof e3t0) {
                    e3t0Var = (e3t0) yjeVar;
                    int i29 = e3t0Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        e3t0Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        e3t0Var = new e3t0(this, yjeVar);
                    }
                } else {
                    e3t0Var = new e3t0(this, yjeVar);
                }
                Object obj16 = e3t0Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = e3t0Var.j;
                if (i30 == 0) {
                    z1x.P(obj16);
                    d3t0 d3t0Var2 = new d3t0(kmqVar, (Function1) obj, (byte) 1);
                    e3t0Var.j = 1;
                    if (((p6d) gmqVar).c(d3t0Var2, e3t0Var) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof tcv0) {
                    tcv0Var = (tcv0) yjeVar;
                    int i31 = tcv0Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        tcv0Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        tcv0Var = new tcv0(this, yjeVar);
                    }
                } else {
                    tcv0Var = new tcv0(this, yjeVar);
                }
                Object obj17 = tcv0Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = tcv0Var.j;
                if (i32 == 0) {
                    z1x.P(obj17);
                    sco0 sco0Var4 = new sco0(kmqVar, (vcv0) obj, (byte) 5);
                    tcv0Var.j = 1;
                    if (((rwk) gmqVar).c(sco0Var4, tcv0Var) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
        }
    }
}
