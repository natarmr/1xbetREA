package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class hbb0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12762a;
    public final /* synthetic */ kmq b;

    public /* synthetic */ hbb0(kmq kmqVar, byte b) {
        this.f12762a = b;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:145:0x0234  */
    /* JADX WARN: Code duplicated, block: B:163:0x0275  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:181:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:217:0x0333  */
    /* JADX WARN: Code duplicated, block: B:235:0x036f  */
    /* JADX WARN: Code duplicated, block: B:253:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:271:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:289:0x042d  */
    /* JADX WARN: Code duplicated, block: B:307:0x046e  */
    /* JADX WARN: Code duplicated, block: B:323:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:341:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:373:0x055b  */
    /* JADX WARN: Code duplicated, block: B:391:0x0597  */
    /* JADX WARN: Code duplicated, block: B:416:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:439:0x063b  */
    /* JADX WARN: Code duplicated, block: B:457:0x0677  */
    /* JADX WARN: Code duplicated, block: B:80:0x0130  */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        gbb0 gbb0Var;
        nbb0 nbb0Var;
        fgb0 fgb0Var;
        Object bfeVar;
        lmb0 lmb0Var;
        nmb0 nmb0Var;
        Object objA;
        Object objA2;
        zpc0 zpc0Var;
        btc0 btc0Var;
        gxd0 gxd0Var;
        mwe0 mwe0Var;
        gxe0 gxe0Var;
        x3f0 x3f0Var;
        r6f0 r6f0Var;
        u6f0 u6f0Var;
        b7f0 b7f0Var;
        x9f0 x9f0Var;
        paf0 paf0Var;
        saf0 saf0Var;
        Object objA3;
        Object objA4;
        i4g0 i4g0Var;
        s5g0 s5g0Var;
        hph0 hph0Var;
        Object objA5;
        Object objA6;
        nmi0 nmi0Var;
        Object objA7;
        qxi0 qxi0Var;
        Object objA8;
        byte b = this.f12762a;
        skb0 skb0Var = null;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof gbb0) {
                    gbb0Var = (gbb0) yjeVar;
                    int i = gbb0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gbb0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        gbb0Var = new gbb0(this, yjeVar);
                    }
                } else {
                    gbb0Var = new gbb0(this, yjeVar);
                }
                Object obj2 = gbb0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = gbb0Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    if (((sw00) obj).f32897a) {
                        gbb0Var.j = 1;
                        if (kmqVar.a(obj, gbb0Var) == wneVar) {
                            return wneVar;
                        }
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
                if (yjeVar instanceof nbb0) {
                    nbb0Var = (nbb0) yjeVar;
                    int i3 = nbb0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nbb0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        nbb0Var = new nbb0(this, yjeVar);
                    }
                } else {
                    nbb0Var = new nbb0(this, yjeVar);
                }
                Object obj3 = nbb0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = nbb0Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    if (obj instanceof bb50) {
                        nbb0Var.j = 1;
                        if (kmqVar.a(obj, nbb0Var) == wneVar2) {
                            return wneVar2;
                        }
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
                if (yjeVar instanceof fgb0) {
                    fgb0Var = (fgb0) yjeVar;
                    int i5 = fgb0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        fgb0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        fgb0Var = new fgb0(this, yjeVar);
                    }
                } else {
                    fgb0Var = new fgb0(this, yjeVar);
                }
                Object obj4 = fgb0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = fgb0Var.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    zeb0 zeb0Var = (zeb0) obj;
                    if (zeb0Var instanceof xeb0) {
                        bfeVar = new bfe(zeb0Var);
                    } else {
                        if (!Intrinsics.d(zeb0Var, yeb0.f42478a)) {
                            t9f.b();
                            return null;
                        }
                        bfeVar = zee.f44245a;
                    }
                    fgb0Var.j = 1;
                    if (kmqVar.a(bfeVar, fgb0Var) == wneVar3) {
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
                if (yjeVar instanceof lmb0) {
                    lmb0Var = (lmb0) yjeVar;
                    int i7 = lmb0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        lmb0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        lmb0Var = new lmb0(this, yjeVar);
                    }
                } else {
                    lmb0Var = new lmb0(this, yjeVar);
                }
                Object obj5 = lmb0Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = lmb0Var.j;
                if (i8 == 0) {
                    z1x.P(obj5);
                    tk60 tk60Var = (tk60) obj;
                    if (!Intrinsics.d(tk60Var, qk60.f28870a)) {
                        if (!(tk60Var instanceof rk60)) {
                            t9f.b();
                            return null;
                        }
                        skb0 skb0Var2 = ((rk60) tk60Var).b;
                        if (skb0Var2 != null) {
                            skb0Var = skb0Var2;
                        }
                    }
                    lmb0Var.j = 1;
                    if (kmqVar.a(skb0Var, lmb0Var) == wneVar4) {
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
                if (yjeVar instanceof nmb0) {
                    nmb0Var = (nmb0) yjeVar;
                    int i9 = nmb0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        nmb0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        nmb0Var = new nmb0(this, yjeVar);
                    }
                } else {
                    nmb0Var = new nmb0(this, yjeVar);
                }
                Object obj6 = nmb0Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = nmb0Var.j;
                if (i10 == 0) {
                    z1x.P(obj6);
                    if (obj instanceof bb50) {
                        nmb0Var.j = 1;
                        if (kmqVar.a(obj, nmb0Var) == wneVar5) {
                            return wneVar5;
                        }
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
                e7a e7aVar = (e7a) obj;
                return ((e7aVar instanceof c7a) && (objA = kmqVar.a(((c7a) e7aVar).f3852a, yjeVar)) == wne.f39444a) ? objA : Unit.f46060a;
            case 6:
                e7a e7aVar2 = (e7a) obj;
                return ((e7aVar2 instanceof c7a) && (objA2 = kmqVar.a(((c7a) e7aVar2).f3852a, yjeVar)) == wne.f39444a) ? objA2 : Unit.f46060a;
            case 7:
                if (yjeVar instanceof zpc0) {
                    zpc0Var = (zpc0) yjeVar;
                    int i11 = zpc0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        zpc0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        zpc0Var = new zpc0(this, yjeVar);
                    }
                } else {
                    zpc0Var = new zpc0(this, yjeVar);
                }
                Object obj7 = zpc0Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = zpc0Var.j;
                if (i12 == 0) {
                    z1x.P(obj7);
                    if (((Boolean) obj).booleanValue()) {
                        zpc0Var.j = 1;
                        if (kmqVar.a(obj, zpc0Var) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof btc0) {
                    btc0Var = (btc0) yjeVar;
                    int i13 = btc0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        btc0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        btc0Var = new btc0(this, yjeVar);
                    }
                } else {
                    btc0Var = new btc0(this, yjeVar);
                }
                Object obj8 = btc0Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = btc0Var.j;
                if (i14 == 0) {
                    z1x.P(obj8);
                    if (((Boolean) obj).booleanValue()) {
                        btc0Var.j = 1;
                        if (kmqVar.a(obj, btc0Var) == wneVar7) {
                            return wneVar7;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof gxd0) {
                    gxd0Var = (gxd0) yjeVar;
                    int i15 = gxd0Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        gxd0Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        gxd0Var = new gxd0(this, yjeVar);
                    }
                } else {
                    gxd0Var = new gxd0(this, yjeVar);
                }
                Object obj9 = gxd0Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = gxd0Var.j;
                if (i16 == 0) {
                    z1x.P(obj9);
                    cqr cqrVarO0 = kpb.o0((bqr) obj, false);
                    gxd0Var.j = 1;
                    if (kmqVar.a(cqrVarO0, gxd0Var) == wneVar8) {
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
            case 10:
                if (yjeVar instanceof mwe0) {
                    mwe0Var = (mwe0) yjeVar;
                    int i17 = mwe0Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        mwe0Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        mwe0Var = new mwe0(this, yjeVar);
                    }
                } else {
                    mwe0Var = new mwe0(this, yjeVar);
                }
                Object obj10 = mwe0Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = mwe0Var.j;
                if (i18 == 0) {
                    z1x.P(obj10);
                    if (((Boolean) obj).booleanValue()) {
                        mwe0Var.j = 1;
                        if (kmqVar.a(obj, mwe0Var) == wneVar9) {
                            return wneVar9;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof gxe0) {
                    gxe0Var = (gxe0) yjeVar;
                    int i19 = gxe0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        gxe0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        gxe0Var = new gxe0(this, yjeVar);
                    }
                } else {
                    gxe0Var = new gxe0(this, yjeVar);
                }
                Object obj11 = gxe0Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = gxe0Var.j;
                if (i20 == 0) {
                    z1x.P(obj11);
                    if (!((Boolean) obj).booleanValue()) {
                        gxe0Var.j = 1;
                        if (kmqVar.a(obj, gxe0Var) == wneVar10) {
                            return wneVar10;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof x3f0) {
                    x3f0Var = (x3f0) yjeVar;
                    int i21 = x3f0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        x3f0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        x3f0Var = new x3f0(this, yjeVar);
                    }
                } else {
                    x3f0Var = new x3f0(this, yjeVar);
                }
                Object obj12 = x3f0Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = x3f0Var.j;
                if (i22 == 0) {
                    z1x.P(obj12);
                    if (((Boolean) obj).booleanValue()) {
                        x3f0Var.j = 1;
                        if (kmqVar.a(obj, x3f0Var) == wneVar11) {
                            return wneVar11;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof r6f0) {
                    r6f0Var = (r6f0) yjeVar;
                    int i23 = r6f0Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        r6f0Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        r6f0Var = new r6f0(this, yjeVar);
                    }
                } else {
                    r6f0Var = new r6f0(this, yjeVar);
                }
                Object obj13 = r6f0Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = r6f0Var.j;
                if (i24 == 0) {
                    z1x.P(obj13);
                    if (obj instanceof mm4) {
                        r6f0Var.j = 1;
                        if (kmqVar.a(obj, r6f0Var) == wneVar12) {
                            return wneVar12;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof u6f0) {
                    u6f0Var = (u6f0) yjeVar;
                    int i25 = u6f0Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        u6f0Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        u6f0Var = new u6f0(this, yjeVar);
                    }
                } else {
                    u6f0Var = new u6f0(this, yjeVar);
                }
                Object obj14 = u6f0Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = u6f0Var.j;
                if (i26 == 0) {
                    z1x.P(obj14);
                    if (obj instanceof qm4) {
                        u6f0Var.j = 1;
                        if (kmqVar.a(obj, u6f0Var) == wneVar13) {
                            return wneVar13;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof b7f0) {
                    b7f0Var = (b7f0) yjeVar;
                    int i27 = b7f0Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        b7f0Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        b7f0Var = new b7f0(this, yjeVar);
                    }
                } else {
                    b7f0Var = new b7f0(this, yjeVar);
                }
                Object obj15 = b7f0Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = b7f0Var.j;
                if (i28 == 0) {
                    z1x.P(obj15);
                    if (obj instanceof c7a) {
                        b7f0Var.j = 1;
                        if (kmqVar.a(obj, b7f0Var) == wneVar14) {
                            return wneVar14;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof x9f0) {
                    x9f0Var = (x9f0) yjeVar;
                    int i29 = x9f0Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        x9f0Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        x9f0Var = new x9f0(this, yjeVar);
                    }
                } else {
                    x9f0Var = new x9f0(this, yjeVar);
                }
                Object obj16 = x9f0Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = x9f0Var.j;
                if (i30 == 0) {
                    z1x.P(obj16);
                    if (((Boolean) obj).booleanValue()) {
                        x9f0Var.j = 1;
                        if (kmqVar.a(obj, x9f0Var) == wneVar15) {
                            return wneVar15;
                        }
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof paf0) {
                    paf0Var = (paf0) yjeVar;
                    int i31 = paf0Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        paf0Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        paf0Var = new paf0(this, yjeVar);
                    }
                } else {
                    paf0Var = new paf0(this, yjeVar);
                }
                Object obj17 = paf0Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = paf0Var.j;
                if (i32 == 0) {
                    z1x.P(obj17);
                    if (!((Boolean) obj).booleanValue()) {
                        paf0Var.j = 1;
                        if (kmqVar.a(obj, paf0Var) == wneVar16) {
                            return wneVar16;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof saf0) {
                    saf0Var = (saf0) yjeVar;
                    int i33 = saf0Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        saf0Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        saf0Var = new saf0(this, yjeVar);
                    }
                } else {
                    saf0Var = new saf0(this, yjeVar);
                }
                Object obj18 = saf0Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = saf0Var.j;
                if (i34 == 0) {
                    z1x.P(obj18);
                    if (((Boolean) obj).booleanValue()) {
                        saf0Var.j = 1;
                        if (kmqVar.a(obj, saf0Var) == wneVar17) {
                            return wneVar17;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                e7a e7aVar3 = (e7a) obj;
                return ((e7aVar3 instanceof c7a) && (objA3 = kmqVar.a(((c7a) e7aVar3).f3852a, yjeVar)) == wne.f39444a) ? objA3 : Unit.f46060a;
            case 20:
                e7a e7aVar4 = (e7a) obj;
                return ((e7aVar4 instanceof c7a) && (objA4 = kmqVar.a(((c7a) e7aVar4).f3852a, yjeVar)) == wne.f39444a) ? objA4 : Unit.f46060a;
            case 21:
                if (yjeVar instanceof i4g0) {
                    i4g0Var = (i4g0) yjeVar;
                    int i35 = i4g0Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        i4g0Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        i4g0Var = new i4g0(this, yjeVar);
                    }
                } else {
                    i4g0Var = new i4g0(this, yjeVar);
                }
                Object obj19 = i4g0Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = i4g0Var.j;
                if (i36 == 0) {
                    z1x.P(obj19);
                    String string = StringsKt.u0((String) obj).toString();
                    i4g0Var.j = 1;
                    if (kmqVar.a(string, i4g0Var) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof s5g0) {
                    s5g0Var = (s5g0) yjeVar;
                    int i37 = s5g0Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        s5g0Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        s5g0Var = new s5g0(this, yjeVar);
                    }
                } else {
                    s5g0Var = new s5g0(this, yjeVar);
                }
                Object obj20 = s5g0Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = s5g0Var.j;
                if (i38 == 0) {
                    z1x.P(obj20);
                    Long l = new Long(((v5g0) obj).f36824a);
                    s5g0Var.j = 1;
                    if (kmqVar.a(l, s5g0Var) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof hph0) {
                    hph0Var = (hph0) yjeVar;
                    int i39 = hph0Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        hph0Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        hph0Var = new hph0(this, yjeVar);
                    }
                } else {
                    hph0Var = new hph0(this, yjeVar);
                }
                Object obj21 = hph0Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = hph0Var.j;
                if (i40 == 0) {
                    z1x.P(obj21);
                    Object objA9 = (dph0) obj;
                    if (objA9 instanceof aph0) {
                        aph0 aph0Var = (aph0) objA9;
                        objA9 = aph0.a(aph0Var, dyb.o0(CollectionsKt.A0(aph0Var.b, new mjf0((byte) 9))));
                    }
                    hph0Var.j = 1;
                    if (kmqVar.a(objA9, hph0Var) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case 24:
                e7a e7aVar5 = (e7a) obj;
                return ((e7aVar5 instanceof c7a) && (objA5 = kmqVar.a(((c7a) e7aVar5).f3852a, yjeVar)) == wne.f39444a) ? objA5 : Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                e7a e7aVar6 = (e7a) ((Pair) obj).f46059a;
                return ((e7aVar6 instanceof c7a) && (objA6 = kmqVar.a(((c7a) e7aVar6).f3852a, yjeVar)) == wne.f39444a) ? objA6 : Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof nmi0) {
                    nmi0Var = (nmi0) yjeVar;
                    int i41 = nmi0Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        nmi0Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        nmi0Var = new nmi0(this, yjeVar);
                    }
                } else {
                    nmi0Var = new nmi0(this, yjeVar);
                }
                Object obj22 = nmi0Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = nmi0Var.j;
                if (i42 == 0) {
                    z1x.P(obj22);
                    long jLongValue = ((Number) obj).longValue();
                    String strValueOf = String.valueOf(jLongValue / 3600);
                    long j = jLongValue % 3600;
                    String strValueOf2 = String.valueOf(j / 60);
                    String strValueOf3 = String.valueOf(j % 60);
                    if (strValueOf.length() == 1) {
                        strValueOf = "0".concat(strValueOf);
                    }
                    if (strValueOf2.length() == 1) {
                        strValueOf2 = "0".concat(strValueOf2);
                    }
                    if (strValueOf3.length() == 1) {
                        strValueOf3 = "0".concat(strValueOf3);
                    }
                    String strK = b1j.k(strValueOf, Separators.COLON, strValueOf2, Separators.COLON, strValueOf3);
                    nmi0Var.j = 1;
                    if (kmqVar.a(strK, nmi0Var) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                e7a e7aVar7 = (e7a) obj;
                return ((e7aVar7 instanceof c7a) && (objA7 = kmqVar.a(((c7a) e7aVar7).f3852a, yjeVar)) == wne.f39444a) ? objA7 : Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof qxi0) {
                    qxi0Var = (qxi0) yjeVar;
                    int i43 = qxi0Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        qxi0Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        qxi0Var = new qxi0(this, yjeVar);
                    }
                } else {
                    qxi0Var = new qxi0(this, yjeVar);
                }
                Object obj23 = qxi0Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = qxi0Var.j;
                if (i44 == 0) {
                    z1x.P(obj23);
                    if (obj instanceof tm4) {
                        qxi0Var.j = 1;
                        if (kmqVar.a(obj, qxi0Var) == wneVar22) {
                            return wneVar22;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            default:
                e7a e7aVar8 = (e7a) obj;
                return ((e7aVar8 instanceof c7a) && (objA8 = kmqVar.a(((c7a) e7aVar8).f3852a, yjeVar)) == wne.f39444a) ? objA8 : Unit.f46060a;
        }
    }

    public /* synthetic */ hbb0(kmq kmqVar, Object obj, byte b) {
        this.f12762a = b;
        this.b = kmqVar;
    }
}
