package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y6u implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42118a;
    public final /* synthetic */ kmq b;

    public y6u(kmq kmqVar, pzu pzuVar) {
        this.f42118a = (byte) 26;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:166:0x026e  */
    /* JADX WARN: Code duplicated, block: B:184:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:216:0x0326  */
    /* JADX WARN: Code duplicated, block: B:232:0x036b  */
    /* JADX WARN: Code duplicated, block: B:248:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:262:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:264:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:272:0x0403  */
    /* JADX WARN: Code duplicated, block: B:290:0x0446  */
    /* JADX WARN: Code duplicated, block: B:315:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:340:0x0504  */
    /* JADX WARN: Code duplicated, block: B:365:0x0563  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:415:0x0621  */
    /* JADX WARN: Code duplicated, block: B:440:0x0680  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:465:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:483:0x0726  */
    /* JADX WARN: Code duplicated, block: B:499:0x0767  */
    /* JADX WARN: Code duplicated, block: B:515:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:531:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:547:0x082b  */
    /* JADX WARN: Code duplicated, block: B:563:0x0869  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x0161  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) throws Throwable {
        x6u x6uVar;
        Object cqk0Var;
        y8u y8uVar;
        h9u h9uVar;
        m9u m9uVar;
        dau dauVar;
        hau hauVar;
        fbu fbuVar;
        kiu kiuVar;
        bju bjuVar;
        Object cqk0Var2;
        eju ejuVar;
        Object cqk0Var3;
        hju hjuVar;
        Object cqk0Var4;
        kju kjuVar;
        Object cqk0Var5;
        nju njuVar;
        Object cqk0Var6;
        qju qjuVar;
        Object cqk0Var7;
        plu pluVar;
        qlu qluVar;
        xrt0 xrt0Var;
        xnu xnuVar;
        znu znuVar;
        bou bouVar;
        yqu yquVar;
        lru lruVar;
        ltu ltuVar;
        ruu ruuVar;
        swu swuVar;
        iyu iyuVar;
        nzu nzuVar;
        c0v c0vVar;
        x0v x0vVar;
        s3v s3vVar;
        byte b = this.f42118a;
        kmq kmqVar = this.b;
        Object next = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof x6u) {
                    x6uVar = (x6u) yjeVar;
                    int i = x6uVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        x6uVar.j = i - Integer.MIN_VALUE;
                    } else {
                        x6uVar = new x6u(this, yjeVar);
                    }
                } else {
                    x6uVar = new x6u(this, yjeVar);
                }
                Object obj2 = x6uVar.i;
                wne wneVar = wne.f39444a;
                int i2 = x6uVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    dqk0 dqk0Var = (dqk0) obj;
                    if (dqk0Var != null) {
                        if (dqk0Var instanceof bqk0) {
                            cqk0Var = new bqk0(((bqk0) dqk0Var).f3036a);
                        } else if (dqk0Var instanceof cqk0) {
                            cqk0Var = new cqk0(((b5l) ((cqk0) dqk0Var).f4798a).d);
                        }
                        x6uVar.j = 1;
                        if (kmqVar.a(cqk0Var, x6uVar) == wneVar) {
                            return wneVar;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj2);
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof y8u) {
                    y8uVar = (y8u) yjeVar;
                    int i3 = y8uVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        y8uVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        y8uVar = new y8u(this, yjeVar);
                    }
                } else {
                    y8uVar = new y8u(this, yjeVar);
                }
                Object obj3 = y8uVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = y8uVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    List listT0 = CollectionsKt.t0((List) obj);
                    y8uVar.j = 1;
                    if (kmqVar.a(listT0, y8uVar) == wneVar2) {
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
                if (yjeVar instanceof h9u) {
                    h9uVar = (h9u) yjeVar;
                    int i5 = h9uVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        h9uVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        h9uVar = new h9u(this, yjeVar);
                    }
                } else {
                    h9uVar = new h9u(this, yjeVar);
                }
                Object obj4 = h9uVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = h9uVar.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    List listA0 = CollectionsKt.A0((List) obj, new vvt((byte) 11));
                    h9uVar.j = 1;
                    if (kmqVar.a(listA0, h9uVar) == wneVar3) {
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
                if (yjeVar instanceof m9u) {
                    m9uVar = (m9u) yjeVar;
                    int i7 = m9uVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        m9uVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        m9uVar = new m9u(this, yjeVar);
                    }
                } else {
                    m9uVar = new m9u(this, yjeVar);
                }
                Object obj5 = m9uVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = m9uVar.j;
                if (i8 == 0) {
                    z1x.P(obj5);
                    List listT1 = CollectionsKt.t0((List) obj);
                    m9uVar.j = 1;
                    if (kmqVar.a(listT1, m9uVar) == wneVar4) {
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
                if (yjeVar instanceof dau) {
                    dauVar = (dau) yjeVar;
                    int i9 = dauVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        dauVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        dauVar = new dau(this, yjeVar);
                    }
                } else {
                    dauVar = new dau(this, yjeVar);
                }
                Object obj6 = dauVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = dauVar.j;
                if (i10 == 0) {
                    z1x.P(obj6);
                    Long l = new Long(((ql5) obj).e);
                    dauVar.j = 1;
                    if (kmqVar.a(l, dauVar) == wneVar5) {
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
                if (yjeVar instanceof hau) {
                    hauVar = (hau) yjeVar;
                    int i11 = hauVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        hauVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        hauVar = new hau(this, yjeVar);
                    }
                } else {
                    hauVar = new hau(this, yjeVar);
                }
                Object obj7 = hauVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = hauVar.j;
                if (i12 == 0) {
                    z1x.P(obj7);
                    Long l2 = new Long(((ql5) obj).e);
                    hauVar.j = 1;
                    if (kmqVar.a(l2, hauVar) == wneVar6) {
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
                if (yjeVar instanceof fbu) {
                    fbuVar = (fbu) yjeVar;
                    int i13 = fbuVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        fbuVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        fbuVar = new fbu(this, yjeVar);
                    }
                } else {
                    fbuVar = new fbu(this, yjeVar);
                }
                Object obj8 = fbuVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = fbuVar.j;
                if (i14 == 0) {
                    z1x.P(obj8);
                    if (!Intrinsics.d((gxb) obj, gxb.k)) {
                        fbuVar.j = 1;
                        if (kmqVar.a(obj, fbuVar) == wneVar7) {
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
            case 7:
                Object objA = kmqVar.a((edw) obj, yjeVar);
                return objA == wne.f39444a ? objA : Unit.f46060a;
            case 8:
                if (yjeVar instanceof kiu) {
                    kiuVar = (kiu) yjeVar;
                    int i15 = kiuVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        kiuVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        kiuVar = new kiu(this, yjeVar);
                    }
                } else {
                    kiuVar = new kiu(this, yjeVar);
                }
                Object obj9 = kiuVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = kiuVar.j;
                if (i16 == 0) {
                    z1x.P(obj9);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        w3d.u(arrayList, ((b4r0) it.next()).e);
                    }
                    kiuVar.j = 1;
                    if (kmqVar.a(arrayList, kiuVar) == wneVar8) {
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
            case 9:
                if (yjeVar instanceof bju) {
                    bjuVar = (bju) yjeVar;
                    int i17 = bjuVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        bjuVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        bjuVar = new bju(this, yjeVar);
                    }
                } else {
                    bjuVar = new bju(this, yjeVar);
                }
                Object obj10 = bjuVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = bjuVar.j;
                if (i18 == 0) {
                    z1x.P(obj10);
                    dqk0 dqk0Var2 = (dqk0) obj;
                    if (dqk0Var2 != null) {
                        if (dqk0Var2 instanceof bqk0) {
                            cqk0Var2 = new bqk0(((bqk0) dqk0Var2).f3036a);
                        } else if (dqk0Var2 instanceof cqk0) {
                            cqk0Var2 = new cqk0(((s010) ((cqk0) dqk0Var2).f4798a).f31390a);
                        }
                        bjuVar.j = 1;
                        if (kmqVar.a(cqk0Var2, bjuVar) == wneVar9) {
                            return wneVar9;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i18 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj10);
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof eju) {
                    ejuVar = (eju) yjeVar;
                    int i19 = ejuVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        ejuVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        ejuVar = new eju(this, yjeVar);
                    }
                } else {
                    ejuVar = new eju(this, yjeVar);
                }
                Object obj11 = ejuVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = ejuVar.j;
                if (i20 == 0) {
                    z1x.P(obj11);
                    dqk0 dqk0Var3 = (dqk0) obj;
                    if (dqk0Var3 != null) {
                        if (dqk0Var3 instanceof bqk0) {
                            cqk0Var3 = new bqk0(((bqk0) dqk0Var3).f3036a);
                        } else if (dqk0Var3 instanceof cqk0) {
                            cqk0Var3 = new cqk0(((s010) ((cqk0) dqk0Var3).f4798a).f);
                        }
                        ejuVar.j = 1;
                        if (kmqVar.a(cqk0Var3, ejuVar) == wneVar10) {
                            return wneVar10;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i20 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj11);
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof hju) {
                    hjuVar = (hju) yjeVar;
                    int i21 = hjuVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        hjuVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        hjuVar = new hju(this, yjeVar);
                    }
                } else {
                    hjuVar = new hju(this, yjeVar);
                }
                Object obj12 = hjuVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = hjuVar.j;
                if (i22 == 0) {
                    z1x.P(obj12);
                    dqk0 dqk0Var4 = (dqk0) obj;
                    if (dqk0Var4 != null) {
                        if (dqk0Var4 instanceof bqk0) {
                            cqk0Var4 = new bqk0(((bqk0) dqk0Var4).f3036a);
                        } else if (dqk0Var4 instanceof cqk0) {
                            cqk0Var4 = new cqk0(((s010) ((cqk0) dqk0Var4).f4798a).b);
                        }
                        hjuVar.j = 1;
                        if (kmqVar.a(cqk0Var4, hjuVar) == wneVar11) {
                            return wneVar11;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i22 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj12);
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof kju) {
                    kjuVar = (kju) yjeVar;
                    int i23 = kjuVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        kjuVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        kjuVar = new kju(this, yjeVar);
                    }
                } else {
                    kjuVar = new kju(this, yjeVar);
                }
                Object obj13 = kjuVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = kjuVar.j;
                if (i24 == 0) {
                    z1x.P(obj13);
                    dqk0 dqk0Var5 = (dqk0) obj;
                    if (dqk0Var5 != null) {
                        if (dqk0Var5 instanceof bqk0) {
                            cqk0Var5 = new bqk0(((bqk0) dqk0Var5).f3036a);
                        } else if (dqk0Var5 instanceof cqk0) {
                            cqk0Var5 = new cqk0(((s010) ((cqk0) dqk0Var5).f4798a).c);
                        }
                        kjuVar.j = 1;
                        if (kmqVar.a(cqk0Var5, kjuVar) == wneVar12) {
                            return wneVar12;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i24 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj13);
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof nju) {
                    njuVar = (nju) yjeVar;
                    int i25 = njuVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        njuVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        njuVar = new nju(this, yjeVar);
                    }
                } else {
                    njuVar = new nju(this, yjeVar);
                }
                Object obj14 = njuVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = njuVar.j;
                if (i26 == 0) {
                    z1x.P(obj14);
                    dqk0 dqk0Var6 = (dqk0) obj;
                    if (dqk0Var6 != null) {
                        if (dqk0Var6 instanceof bqk0) {
                            cqk0Var6 = new bqk0(((bqk0) dqk0Var6).f3036a);
                        } else if (dqk0Var6 instanceof cqk0) {
                            cqk0Var6 = new cqk0(((s010) ((cqk0) dqk0Var6).f4798a).e);
                        }
                        njuVar.j = 1;
                        if (kmqVar.a(cqk0Var6, njuVar) == wneVar13) {
                            return wneVar13;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i26 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj14);
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof qju) {
                    qjuVar = (qju) yjeVar;
                    int i27 = qjuVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        qjuVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        qjuVar = new qju(this, yjeVar);
                    }
                } else {
                    qjuVar = new qju(this, yjeVar);
                }
                Object obj15 = qjuVar.i;
                wne wneVar14 = wne.f39444a;
                int i28 = qjuVar.j;
                if (i28 == 0) {
                    z1x.P(obj15);
                    dqk0 dqk0Var7 = (dqk0) obj;
                    if (dqk0Var7 != null) {
                        if (dqk0Var7 instanceof bqk0) {
                            cqk0Var7 = new bqk0(((bqk0) dqk0Var7).f3036a);
                        } else if (dqk0Var7 instanceof cqk0) {
                            cqk0Var7 = new cqk0(((s010) ((cqk0) dqk0Var7).f4798a).d);
                        }
                        qjuVar.j = 1;
                        if (kmqVar.a(cqk0Var7, qjuVar) == wneVar14) {
                            return wneVar14;
                        }
                    }
                    t9f.b();
                    return null;
                }
                if (i28 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj15);
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof plu) {
                    pluVar = (plu) yjeVar;
                    int i29 = pluVar.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        pluVar.j = i29 - Integer.MIN_VALUE;
                    } else {
                        pluVar = new plu(this, yjeVar);
                    }
                } else {
                    pluVar = new plu(this, yjeVar);
                }
                Object obj16 = pluVar.i;
                wne wneVar15 = wne.f39444a;
                int i30 = pluVar.j;
                if (i30 == 0) {
                    z1x.P(obj16);
                    if (!Intrinsics.d((gxb) obj, gxb.k)) {
                        pluVar.j = 1;
                        if (kmqVar.a(obj, pluVar) == wneVar15) {
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
            case 16:
                if (yjeVar instanceof qlu) {
                    qluVar = (qlu) yjeVar;
                    int i31 = qluVar.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        qluVar.j = i31 - Integer.MIN_VALUE;
                    } else {
                        qluVar = new qlu(this, yjeVar);
                    }
                } else {
                    qluVar = new qlu(this, yjeVar);
                }
                Object obj17 = qluVar.i;
                wne wneVar16 = wne.f39444a;
                int i32 = qluVar.j;
                if (i32 == 0) {
                    z1x.P(obj17);
                    for (Object obj18 : ((gxb) obj).i) {
                        if (((xrt0) obj18) instanceof srt0) {
                            next = obj18;
                            xrt0Var = (xrt0) next;
                            if (xrt0Var != null) {
                                qluVar.j = 1;
                                if (kmqVar.a((srt0) xrt0Var, qluVar) == wneVar16) {
                                    return wneVar16;
                                }
                            }
                        }
                    }
                    xrt0Var = (xrt0) next;
                    if (xrt0Var != null) {
                        qluVar.j = 1;
                        if (kmqVar.a((srt0) xrt0Var, qluVar) == wneVar16) {
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
            case 17:
                if (yjeVar instanceof xnu) {
                    xnuVar = (xnu) yjeVar;
                    int i33 = xnuVar.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        xnuVar.j = i33 - Integer.MIN_VALUE;
                    } else {
                        xnuVar = new xnu(this, yjeVar);
                    }
                } else {
                    xnuVar = new xnu(this, yjeVar);
                }
                Object obj19 = xnuVar.i;
                wne wneVar17 = wne.f39444a;
                int i34 = xnuVar.j;
                if (i34 == 0) {
                    z1x.P(obj19);
                    Boolean boolValueOf = Boolean.valueOf(((sw00) obj).f32897a);
                    xnuVar.j = 1;
                    if (kmqVar.a(boolValueOf, xnuVar) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof znu) {
                    znuVar = (znu) yjeVar;
                    int i35 = znuVar.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        znuVar.j = i35 - Integer.MIN_VALUE;
                    } else {
                        znuVar = new znu(this, yjeVar);
                    }
                } else {
                    znuVar = new znu(this, yjeVar);
                }
                Object obj20 = znuVar.i;
                wne wneVar18 = wne.f39444a;
                int i36 = znuVar.j;
                if (i36 == 0) {
                    z1x.P(obj20);
                    List listA1 = CollectionsKt.A0((List) obj, new vvt((byte) 19));
                    znuVar.j = 1;
                    if (kmqVar.a(listA1, znuVar) == wneVar18) {
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
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof bou) {
                    bouVar = (bou) yjeVar;
                    int i37 = bouVar.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        bouVar.j = i37 - Integer.MIN_VALUE;
                    } else {
                        bouVar = new bou(this, yjeVar);
                    }
                } else {
                    bouVar = new bou(this, yjeVar);
                }
                Object obj21 = bouVar.i;
                wne wneVar19 = wne.f39444a;
                int i38 = bouVar.j;
                if (i38 == 0) {
                    z1x.P(obj21);
                    Boolean boolValueOf2 = Boolean.valueOf(((sw00) obj).f32897a);
                    bouVar.j = 1;
                    if (kmqVar.a(boolValueOf2, bouVar) == wneVar19) {
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
            case 20:
                if (yjeVar instanceof yqu) {
                    yquVar = (yqu) yjeVar;
                    int i39 = yquVar.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        yquVar.j = i39 - Integer.MIN_VALUE;
                    } else {
                        yquVar = new yqu(this, yjeVar);
                    }
                } else {
                    yquVar = new yqu(this, yjeVar);
                }
                Object obj22 = yquVar.i;
                wne wneVar20 = wne.f39444a;
                int i40 = yquVar.j;
                if (i40 == 0) {
                    z1x.P(obj22);
                    List list = ((xqj0) obj).l;
                    yquVar.j = 1;
                    if (kmqVar.a(list, yquVar) == wneVar20) {
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
            case 21:
                if (yjeVar instanceof lru) {
                    lruVar = (lru) yjeVar;
                    int i41 = lruVar.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        lruVar.j = i41 - Integer.MIN_VALUE;
                    } else {
                        lruVar = new lru(this, yjeVar);
                    }
                } else {
                    lruVar = new lru(this, yjeVar);
                }
                Object obj23 = lruVar.i;
                wne wneVar21 = wne.f39444a;
                int i42 = lruVar.j;
                if (i42 == 0) {
                    z1x.P(obj23);
                    if (obj instanceof k9s) {
                        lruVar.j = 1;
                        if (kmqVar.a(obj, lruVar) == wneVar21) {
                            return wneVar21;
                        }
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof ltu) {
                    ltuVar = (ltu) yjeVar;
                    int i43 = ltuVar.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        ltuVar.j = i43 - Integer.MIN_VALUE;
                    } else {
                        ltuVar = new ltu(this, yjeVar);
                    }
                } else {
                    ltuVar = new ltu(this, yjeVar);
                }
                Object obj24 = ltuVar.i;
                wne wneVar22 = wne.f39444a;
                int i44 = ltuVar.j;
                if (i44 == 0) {
                    z1x.P(obj24);
                    Iterator it2 = ((Map) obj).values().iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            Date dateA = ((rei0) next).a();
                            do {
                                Object next2 = it2.next();
                                Date dateA2 = ((rei0) next2).a();
                                if (dateA.compareTo(dateA2) < 0) {
                                    next = next2;
                                    dateA = dateA2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    ltuVar.j = 1;
                    if (kmqVar.a(next, ltuVar) == wneVar22) {
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
            case 23:
                if (yjeVar instanceof ruu) {
                    ruuVar = (ruu) yjeVar;
                    int i45 = ruuVar.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        ruuVar.j = i45 - Integer.MIN_VALUE;
                    } else {
                        ruuVar = new ruu(this, yjeVar);
                    }
                } else {
                    ruuVar = new ruu(this, yjeVar);
                }
                Object obj25 = ruuVar.i;
                wne wneVar23 = wne.f39444a;
                int i46 = ruuVar.j;
                if (i46 == 0) {
                    z1x.P(obj25);
                    y52 y52Var = (y52) obj;
                    if (!Intrinsics.d(y52Var, w52.f38565a)) {
                        if (y52Var instanceof v52) {
                            throw ((v52) y52Var).f36808a;
                        }
                        if (!(y52Var instanceof x52)) {
                            t9f.b();
                            return null;
                        }
                        next = ((x52) y52Var).f40292a;
                    }
                    ruuVar.j = 1;
                    if (kmqVar.a(next, ruuVar) == wneVar23) {
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
            case 24:
                if (yjeVar instanceof swu) {
                    swuVar = (swu) yjeVar;
                    int i47 = swuVar.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        swuVar.j = i47 - Integer.MIN_VALUE;
                    } else {
                        swuVar = new swu(this, yjeVar);
                    }
                } else {
                    swuVar = new swu(this, yjeVar);
                }
                Object obj26 = swuVar.i;
                wne wneVar24 = wne.f39444a;
                int i48 = swuVar.j;
                if (i48 == 0) {
                    z1x.P(obj26);
                    v8n0 v8n0Var = new v8n0((List) obj);
                    swuVar.j = 1;
                    if (kmqVar.a(v8n0Var, swuVar) == wneVar24) {
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
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof iyu) {
                    iyuVar = (iyu) yjeVar;
                    int i49 = iyuVar.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        iyuVar.j = i49 - Integer.MIN_VALUE;
                    } else {
                        iyuVar = new iyu(this, yjeVar);
                    }
                } else {
                    iyuVar = new iyu(this, yjeVar);
                }
                Object obj27 = iyuVar.i;
                wne wneVar25 = wne.f39444a;
                int i50 = iyuVar.j;
                if (i50 == 0) {
                    z1x.P(obj27);
                    j0g0 j0g0Var = new j0g0((List) obj);
                    iyuVar.j = 1;
                    if (kmqVar.a(j0g0Var, iyuVar) == wneVar25) {
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
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof nzu) {
                    nzuVar = (nzu) yjeVar;
                    int i51 = nzuVar.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        nzuVar.j = i51 - Integer.MIN_VALUE;
                    } else {
                        nzuVar = new nzu(this, yjeVar);
                    }
                } else {
                    nzuVar = new nzu(this, yjeVar);
                }
                Object obj28 = nzuVar.i;
                wne wneVar26 = wne.f39444a;
                int i52 = nzuVar.j;
                if (i52 == 0) {
                    z1x.P(obj28);
                    List list2 = (List) obj;
                    next = list2 != null ? pzu.C(list2) : null;
                    nzuVar.j = 1;
                    if (kmqVar.a(next, nzuVar) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (i52 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof c0v) {
                    c0vVar = (c0v) yjeVar;
                    int i53 = c0vVar.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        c0vVar.j = i53 - Integer.MIN_VALUE;
                    } else {
                        c0vVar = new c0v(this, yjeVar);
                    }
                } else {
                    c0vVar = new c0v(this, yjeVar);
                }
                Object obj29 = c0vVar.i;
                wne wneVar27 = wne.f39444a;
                int i54 = c0vVar.j;
                if (i54 == 0) {
                    z1x.P(obj29);
                    List listD0 = CollectionsKt.D0((List) obj, 5);
                    c0vVar.j = 1;
                    if (kmqVar.a(listD0, c0vVar) == wneVar27) {
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
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof x0v) {
                    x0vVar = (x0v) yjeVar;
                    int i55 = x0vVar.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        x0vVar.j = i55 - Integer.MIN_VALUE;
                    } else {
                        x0vVar = new x0v(this, yjeVar);
                    }
                } else {
                    x0vVar = new x0v(this, yjeVar);
                }
                Object obj30 = x0vVar.i;
                wne wneVar28 = wne.f39444a;
                int i56 = x0vVar.j;
                if (i56 == 0) {
                    z1x.P(obj30);
                    d0t d0tVar = (d0t) CollectionsKt.firstOrNull((List) obj);
                    if (d0tVar == null) {
                        jf4.k(null);
                        return null;
                    }
                    x0vVar.j = 1;
                    if (kmqVar.a(d0tVar, x0vVar) == wneVar28) {
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
            default:
                if (yjeVar instanceof s3v) {
                    s3vVar = (s3v) yjeVar;
                    int i57 = s3vVar.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        s3vVar.j = i57 - Integer.MIN_VALUE;
                    } else {
                        s3vVar = new s3v(this, yjeVar);
                    }
                } else {
                    s3vVar = new s3v(this, yjeVar);
                }
                Object obj31 = s3vVar.i;
                wne wneVar29 = wne.f39444a;
                int i58 = s3vVar.j;
                if (i58 == 0) {
                    z1x.P(obj31);
                    j0g0 j0g0Var2 = new j0g0((d1s0) obj);
                    s3vVar.j = 1;
                    if (kmqVar.a(j0g0Var2, s3vVar) == wneVar29) {
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
        }
    }

    public /* synthetic */ y6u(kmq kmqVar, byte b) {
        this.f42118a = b;
        this.b = kmqVar;
    }
}
