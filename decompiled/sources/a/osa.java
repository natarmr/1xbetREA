package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class osa implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25773a;
    public final /* synthetic */ kmq b;

    public osa(kmq kmqVar, g45 g45Var) {
        this.f25773a = (byte) 20;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:136:0x0208  */
    /* JADX WARN: Code duplicated, block: B:155:0x0257  */
    /* JADX WARN: Code duplicated, block: B:181:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:203:0x0320  */
    /* JADX WARN: Code duplicated, block: B:233:0x0389  */
    /* JADX WARN: Code duplicated, block: B:268:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:286:0x043a  */
    /* JADX WARN: Code duplicated, block: B:304:0x0476  */
    /* JADX WARN: Code duplicated, block: B:322:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:338:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:356:0x052e  */
    /* JADX WARN: Code duplicated, block: B:372:0x056b  */
    /* JADX WARN: Code duplicated, block: B:390:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:409:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:432:0x064b  */
    /* JADX WARN: Code duplicated, block: B:450:0x0687  */
    /* JADX WARN: Code duplicated, block: B:469:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:488:0x0713  */
    /* JADX WARN: Code duplicated, block: B:506:0x0754  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:536:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:552:0x0802  */
    /* JADX WARN: Code duplicated, block: B:572:0x0853  */
    /* JADX WARN: Code duplicated, block: B:588:0x0893  */
    /* JADX WARN: Code duplicated, block: B:88:0x0159  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        nsa nsaVar;
        ssa ssaVar;
        f2b f2bVar;
        yib yibVar;
        Object objA;
        Object objA2;
        oxb oxbVar;
        tyb tybVar;
        g2c g2cVar;
        j2c j2cVar;
        unc uncVar;
        oxc oxcVar;
        Object cxcVar;
        u1d u1dVar;
        jvd jvdVar;
        lvd lvdVar;
        cyd cydVar;
        eyd eydVar;
        i1e i1eVar;
        g4e g4eVar;
        h7e h7eVar;
        v7e v7eVar;
        Object g0g0Var;
        y7e y7eVar;
        rkp pkpVar;
        a8e a8eVar;
        c8e c8eVar;
        e8e e8eVar;
        g8e g8eVar;
        l8e l8eVar;
        Object obj2;
        n8e n8eVar;
        vcs0 vcs0Var;
        dae daeVar;
        nce nceVar;
        Object hceVar;
        byte b = this.f25773a;
        int i = 0;
        int i2 = 0;
        kmq kmqVar = this.b;
        Object ecs0Var = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof nsa) {
                    nsaVar = (nsa) yjeVar;
                    int i3 = nsaVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nsaVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        nsaVar = new nsa(this, yjeVar);
                    }
                } else {
                    nsaVar = new nsa(this, yjeVar);
                }
                Object obj3 = nsaVar.i;
                Object obj4 = wne.f39444a;
                int i4 = nsaVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    Object num = new Integer(((Collection) ((Pair) obj).f46059a).size());
                    nsaVar.j = 1;
                    if (kmqVar.a(num, nsaVar) == obj4) {
                        return obj4;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof ssa) {
                    ssaVar = (ssa) yjeVar;
                    int i5 = ssaVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ssaVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        ssaVar = new ssa(this, yjeVar);
                    }
                } else {
                    ssaVar = new ssa(this, yjeVar);
                }
                Object obj5 = ssaVar.i;
                Object obj6 = wne.f39444a;
                int i6 = ssaVar.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    Object objD0 = CollectionsKt.D0((List) obj, 3);
                    ssaVar.j = 1;
                    if (kmqVar.a(objD0, ssaVar) == obj6) {
                        return obj6;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof f2b) {
                    f2bVar = (f2b) yjeVar;
                    int i7 = f2bVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        f2bVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        f2bVar = new f2b(this, yjeVar);
                    }
                } else {
                    f2bVar = new f2b(this, yjeVar);
                }
                Object obj7 = f2bVar.i;
                Object obj8 = wne.f39444a;
                int i8 = f2bVar.j;
                if (i8 == 0) {
                    z1x.P(obj7);
                    Pair pair = (Pair) obj;
                    pat patVar = (pat) pair.f46059a;
                    pat patVar2 = (pat) pair.b;
                    patVar.getClass();
                    if (!(patVar instanceof kat)) {
                        patVar2.getClass();
                        if (!(patVar2 instanceof kat)) {
                            f2bVar.j = 1;
                            if (kmqVar.a(obj, f2bVar) == obj8) {
                                return obj8;
                            }
                        }
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof yib) {
                    yibVar = (yib) yjeVar;
                    int i9 = yibVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        yibVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        yibVar = new yib(this, yjeVar);
                    }
                } else {
                    yibVar = new yib(this, yjeVar);
                }
                Object obj9 = yibVar.i;
                Object obj10 = wne.f39444a;
                int i10 = yibVar.j;
                if (i10 == 0) {
                    z1x.P(obj9);
                    Object obj11 = ((ql5) obj).g;
                    yibVar.j = 1;
                    if (kmqVar.a(obj11, yibVar) == obj10) {
                        return obj10;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 4:
                e7a e7aVar = (e7a) ((Pair) obj).f46059a;
                return ((e7aVar instanceof c7a) && (objA = kmqVar.a(((c7a) e7aVar).f3852a, yjeVar)) == wne.f39444a) ? objA : Unit.f46060a;
            case 5:
                e7a e7aVar2 = (e7a) obj;
                return ((e7aVar2 instanceof c7a) && (objA2 = kmqVar.a(((c7a) e7aVar2).f3852a, yjeVar)) == wne.f39444a) ? objA2 : Unit.f46060a;
            case 6:
                if (yjeVar instanceof oxb) {
                    oxbVar = (oxb) yjeVar;
                    int i11 = oxbVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        oxbVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        oxbVar = new oxb(this, yjeVar);
                    }
                } else {
                    oxbVar = new oxb(this, yjeVar);
                }
                Object obj12 = oxbVar.i;
                Object obj13 = wne.f39444a;
                int i12 = oxbVar.j;
                if (i12 == 0) {
                    z1x.P(obj12);
                    Object objP0 = CollectionsKt.P0((List) obj);
                    oxbVar.j = 1;
                    if (kmqVar.a(objP0, oxbVar) == obj13) {
                        return obj13;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof tyb) {
                    tybVar = (tyb) yjeVar;
                    int i13 = tybVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        tybVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        tybVar = new tyb(this, yjeVar);
                    }
                } else {
                    tybVar = new tyb(this, yjeVar);
                }
                Object obj14 = tybVar.i;
                Object obj15 = wne.f39444a;
                int i14 = tybVar.j;
                if (i14 == 0) {
                    z1x.P(obj14);
                    if (!((List) obj).isEmpty()) {
                        tybVar.j = 1;
                        if (kmqVar.a(obj, tybVar) == obj15) {
                            return obj15;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof g2c) {
                    g2cVar = (g2c) yjeVar;
                    int i15 = g2cVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        g2cVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        g2cVar = new g2c(this, yjeVar);
                    }
                } else {
                    g2cVar = new g2c(this, yjeVar);
                }
                Object obj16 = g2cVar.i;
                Object obj17 = wne.f39444a;
                int i16 = g2cVar.j;
                if (i16 == 0) {
                    z1x.P(obj16);
                    Object objValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                    g2cVar.j = 1;
                    if (kmqVar.a(objValueOf, g2cVar) == obj17) {
                        return obj17;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof j2c) {
                    j2cVar = (j2c) yjeVar;
                    int i17 = j2cVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        j2cVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        j2cVar = new j2c(this, yjeVar);
                    }
                } else {
                    j2cVar = new j2c(this, yjeVar);
                }
                Object obj18 = j2cVar.i;
                Object obj19 = wne.f39444a;
                int i18 = j2cVar.j;
                if (i18 == 0) {
                    z1x.P(obj18);
                    Object objValueOf2 = Boolean.valueOf(((Number) obj).intValue() > 0);
                    j2cVar.j = 1;
                    if (kmqVar.a(objValueOf2, j2cVar) == obj19) {
                        return obj19;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof unc) {
                    uncVar = (unc) yjeVar;
                    int i19 = uncVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        uncVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        uncVar = new unc(this, yjeVar);
                    }
                } else {
                    uncVar = new unc(this, yjeVar);
                }
                Object obj20 = uncVar.i;
                Object obj21 = wne.f39444a;
                int i20 = uncVar.j;
                if (i20 == 0) {
                    z1x.P(obj20);
                    if (obj instanceof ya50) {
                        uncVar.j = 1;
                        if (kmqVar.a(obj, uncVar) == obj21) {
                            return obj21;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof oxc) {
                    oxcVar = (oxc) yjeVar;
                    int i21 = oxcVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        oxcVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        oxcVar = new oxc(this, yjeVar);
                    }
                } else {
                    oxcVar = new oxc(this, yjeVar);
                }
                Object obj22 = oxcVar.i;
                Object obj23 = wne.f39444a;
                int i22 = oxcVar.j;
                if (i22 == 0) {
                    z1x.P(obj22);
                    yvc yvcVar = (yvc) obj;
                    yvcVar.getClass();
                    if (yvcVar.b) {
                        cxcVar = dxc.f6840a;
                    } else {
                        jkm jkmVar = yvcVar.d;
                        cxcVar = jkmVar != null ? new cxc(jkmVar, yvcVar.e) : new bxc(yvcVar.f43311a);
                    }
                    oxcVar.j = 1;
                    if (kmqVar.a(cxcVar, oxcVar) == obj23) {
                        return obj23;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof u1d) {
                    u1dVar = (u1d) yjeVar;
                    int i23 = u1dVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        u1dVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        u1dVar = new u1d(this, yjeVar);
                    }
                } else {
                    u1dVar = new u1d(this, yjeVar);
                }
                Object obj24 = u1dVar.i;
                Object obj25 = wne.f39444a;
                int i24 = u1dVar.j;
                if (i24 == 0) {
                    z1x.P(obj24);
                    Object objValueOf3 = Boolean.valueOf(((Number) obj).floatValue() > 0.5f);
                    u1dVar.j = 1;
                    if (kmqVar.a(objValueOf3, u1dVar) == obj25) {
                        return obj25;
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof jvd) {
                    jvdVar = (jvd) yjeVar;
                    int i25 = jvdVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        jvdVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        jvdVar = new jvd(this, yjeVar);
                    }
                } else {
                    jvdVar = new jvd(this, yjeVar);
                }
                Object obj26 = jvdVar.i;
                Object obj27 = wne.f39444a;
                int i26 = jvdVar.j;
                if (i26 == 0) {
                    z1x.P(obj26);
                    if (obj instanceof mr4) {
                        jvdVar.j = 1;
                        if (kmqVar.a(obj, jvdVar) == obj27) {
                            return obj27;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj26);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof lvd) {
                    lvdVar = (lvd) yjeVar;
                    int i27 = lvdVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        lvdVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        lvdVar = new lvd(this, yjeVar);
                    }
                } else {
                    lvdVar = new lvd(this, yjeVar);
                }
                Object obj28 = lvdVar.i;
                Object obj29 = wne.f39444a;
                int i28 = lvdVar.j;
                if (i28 == 0) {
                    z1x.P(obj28);
                    Object obj30 = ((mr4) obj).f22250a;
                    lvdVar.j = 1;
                    if (kmqVar.a(obj30, lvdVar) == obj29) {
                        return obj29;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof cyd) {
                    cydVar = (cyd) yjeVar;
                    int i29 = cydVar.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        cydVar.j = i29 - Integer.MIN_VALUE;
                    } else {
                        cydVar = new cyd(this, yjeVar);
                    }
                } else {
                    cydVar = new cyd(this, yjeVar);
                }
                Object obj31 = cydVar.i;
                Object obj32 = wne.f39444a;
                int i30 = cydVar.j;
                if (i30 == 0) {
                    z1x.P(obj31);
                    if (obj instanceof mr4) {
                        cydVar.j = 1;
                        if (kmqVar.a(obj, cydVar) == obj32) {
                            return obj32;
                        }
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj31);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof eyd) {
                    eydVar = (eyd) yjeVar;
                    int i31 = eydVar.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        eydVar.j = i31 - Integer.MIN_VALUE;
                    } else {
                        eydVar = new eyd(this, yjeVar);
                    }
                } else {
                    eydVar = new eyd(this, yjeVar);
                }
                Object obj33 = eydVar.i;
                Object obj34 = wne.f39444a;
                int i32 = eydVar.j;
                if (i32 == 0) {
                    z1x.P(obj33);
                    Object obj35 = ((mr4) obj).f22250a;
                    eydVar.j = 1;
                    if (kmqVar.a(obj35, eydVar) == obj34) {
                        return obj34;
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj33);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof i1e) {
                    i1eVar = (i1e) yjeVar;
                    int i33 = i1eVar.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        i1eVar.j = i33 - Integer.MIN_VALUE;
                    } else {
                        i1eVar = new i1e(this, yjeVar);
                    }
                } else {
                    i1eVar = new i1e(this, yjeVar);
                }
                Object obj36 = i1eVar.i;
                Object obj37 = wne.f39444a;
                int i34 = i1eVar.j;
                if (i34 == 0) {
                    z1x.P(obj36);
                    Object obj38 = ((Pair) obj).b;
                    if (obj38 != null) {
                        i1eVar.j = 1;
                        if (kmqVar.a(obj38, i1eVar) == obj37) {
                            return obj37;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj36);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof g4e) {
                    g4eVar = (g4e) yjeVar;
                    int i35 = g4eVar.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        g4eVar.j = i35 - Integer.MIN_VALUE;
                    } else {
                        g4eVar = new g4e(this, yjeVar);
                    }
                } else {
                    g4eVar = new g4e(this, yjeVar);
                }
                Object obj39 = g4eVar.i;
                Object obj40 = wne.f39444a;
                int i36 = g4eVar.j;
                if (i36 == 0) {
                    z1x.P(obj39);
                    if (obj instanceof v4e) {
                        g4eVar.j = 1;
                        if (kmqVar.a(obj, g4eVar) == obj40) {
                            return obj40;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj39);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof h7e) {
                    h7eVar = (h7e) yjeVar;
                    int i37 = h7eVar.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        h7eVar.j = i37 - Integer.MIN_VALUE;
                    } else {
                        h7eVar = new h7e(this, yjeVar);
                    }
                } else {
                    h7eVar = new h7e(this, yjeVar);
                }
                Object obj41 = h7eVar.i;
                Object obj42 = wne.f39444a;
                int i38 = h7eVar.j;
                if (i38 == 0) {
                    z1x.P(obj41);
                    if (((Number) obj).intValue() != 0) {
                        h7eVar.j = 1;
                        if (kmqVar.a(obj, h7eVar) == obj42) {
                            return obj42;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj41);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof v7e) {
                    v7eVar = (v7e) yjeVar;
                    int i39 = v7eVar.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        v7eVar.j = i39 - Integer.MIN_VALUE;
                    } else {
                        v7eVar = new v7e(this, yjeVar);
                    }
                } else {
                    v7eVar = new v7e(this, yjeVar);
                }
                Object obj43 = v7eVar.i;
                Object obj44 = wne.f39444a;
                int i40 = v7eVar.j;
                if (i40 == 0) {
                    z1x.P(obj43);
                    oht0 oht0Var = (oht0) obj;
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        oht0Var.getClass();
                        String str = oht0Var.f25280a;
                        if (str == null) {
                            throw new ff5(null);
                        }
                        Long l = oht0Var.b;
                        long jLongValue = l != null ? l.longValue() : 0L;
                        Boolean bool = oht0Var.c;
                        g0g0Var = new lht0(str, jLongValue, bool != null ? bool.booleanValue() : false);
                        ecs0Var = g0g0Var instanceof g0g0 ? null : g0g0Var;
                        if (ecs0Var != null) {
                            v7eVar.j = 1;
                            if (kmqVar.a(ecs0Var, v7eVar) == obj44) {
                                return obj44;
                            }
                        }
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj43);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof y7e) {
                    y7eVar = (y7e) yjeVar;
                    int i41 = y7eVar.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        y7eVar.j = i41 - Integer.MIN_VALUE;
                    } else {
                        y7eVar = new y7e(this, yjeVar);
                    }
                } else {
                    y7eVar = new y7e(this, yjeVar);
                }
                Object obj45 = y7eVar.i;
                Object obj46 = wne.f39444a;
                int i42 = y7eVar.j;
                if (i42 == 0) {
                    z1x.P(obj45);
                    fkt0 fkt0Var = (fkt0) obj;
                    fkt0Var.getClass();
                    String str2 = fkt0Var.b;
                    if (str2 == null) {
                        jf4.k(null);
                        return null;
                    }
                    ekt0 ekt0Var = fkt0Var.c;
                    if (ekt0Var != null) {
                        Byte b2 = ekt0Var.f7969a;
                        byte bByteValue = b2 != null ? b2.byteValue() : (byte) 0;
                        Boolean bool2 = ekt0Var.b;
                        pkpVar = new pkp(bByteValue, bool2 != null ? bool2.booleanValue() : false);
                    } else {
                        pkpVar = qkp.f28896a;
                    }
                    Object skpVar = new skp(str2, pkpVar);
                    y7eVar.j = 1;
                    if (kmqVar.a(skpVar, y7eVar) == obj46) {
                        return obj46;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj45);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof a8e) {
                    a8eVar = (a8e) yjeVar;
                    int i43 = a8eVar.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        a8eVar.j = i43 - Integer.MIN_VALUE;
                    } else {
                        a8eVar = new a8e(this, yjeVar);
                    }
                } else {
                    a8eVar = new a8e(this, yjeVar);
                }
                Object obj47 = a8eVar.i;
                Object obj48 = wne.f39444a;
                int i44 = a8eVar.j;
                if (i44 == 0) {
                    z1x.P(obj47);
                    alt0 alt0Var = (alt0) obj;
                    alt0Var.getClass();
                    String str3 = alt0Var.f1084a;
                    if (str3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    List list = alt0Var.b;
                    if (list == null) {
                        jf4.k(null);
                        return null;
                    }
                    Object xkt0Var = new xkt0(str3, list);
                    a8eVar.j = 1;
                    if (kmqVar.a(xkt0Var, a8eVar) == obj48) {
                        return obj48;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj47);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof c8e) {
                    c8eVar = (c8e) yjeVar;
                    int i45 = c8eVar.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        c8eVar.j = i45 - Integer.MIN_VALUE;
                    } else {
                        c8eVar = new c8e(this, yjeVar);
                    }
                } else {
                    c8eVar = new c8e(this, yjeVar);
                }
                Object obj49 = c8eVar.i;
                Object obj50 = wne.f39444a;
                int i46 = c8eVar.j;
                if (i46 == 0) {
                    z1x.P(obj49);
                    mlt0 mlt0Var = (mlt0) obj;
                    mlt0Var.getClass();
                    String str4 = mlt0Var.b;
                    if (str4 == null) {
                        jf4.k(null);
                        return null;
                    }
                    List list2 = mlt0Var.c;
                    if (list2 == null) {
                        jf4.k(null);
                        return null;
                    }
                    ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zsm0.L((kst0) it.next()));
                    }
                    Object jlt0Var = new jlt0(str4, arrayList);
                    c8eVar.j = 1;
                    if (kmqVar.a(jlt0Var, c8eVar) == obj50) {
                        return obj50;
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj49);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof e8e) {
                    e8eVar = (e8e) yjeVar;
                    int i47 = e8eVar.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        e8eVar.j = i47 - Integer.MIN_VALUE;
                    } else {
                        e8eVar = new e8e(this, yjeVar);
                    }
                } else {
                    e8eVar = new e8e(this, yjeVar);
                }
                Object obj51 = e8eVar.i;
                Object obj52 = wne.f39444a;
                int i48 = e8eVar.j;
                if (i48 == 0) {
                    z1x.P(obj51);
                    vlt0 vlt0Var = (vlt0) obj;
                    vlt0Var.getClass();
                    Boolean bool3 = vlt0Var.f37645a;
                    if (bool3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    Object slt0Var = new slt0(bool3.booleanValue());
                    e8eVar.j = 1;
                    if (kmqVar.a(slt0Var, e8eVar) == obj52) {
                        return obj52;
                    }
                } else {
                    if (i48 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj51);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof g8e) {
                    g8eVar = (g8e) yjeVar;
                    int i49 = g8eVar.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        g8eVar.j = i49 - Integer.MIN_VALUE;
                    } else {
                        g8eVar = new g8e(this, yjeVar);
                    }
                } else {
                    g8eVar = new g8e(this, yjeVar);
                }
                Object obj53 = g8eVar.i;
                Object obj54 = wne.f39444a;
                int i50 = g8eVar.j;
                if (i50 == 0) {
                    z1x.P(obj53);
                    mmt0 mmt0Var = (mmt0) obj;
                    mmt0Var.getClass();
                    Long l2 = mmt0Var.b;
                    Object jmt0Var = new jmt0(l2 != null ? l2.longValue() : 0L);
                    g8eVar.j = 1;
                    if (kmqVar.a(jmt0Var, g8eVar) == obj54) {
                        return obj54;
                    }
                } else {
                    if (i50 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj53);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof l8e) {
                    l8eVar = (l8e) yjeVar;
                    int i51 = l8eVar.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        l8eVar.j = i51 - Integer.MIN_VALUE;
                    } else {
                        l8eVar = new l8e(this, yjeVar);
                    }
                } else {
                    l8eVar = new l8e(this, yjeVar);
                }
                Object obj55 = l8eVar.i;
                Object obj56 = wne.f39444a;
                int i52 = l8eVar.j;
                if (i52 == 0) {
                    z1x.P(obj55);
                    xv80 xv80Var = ((zv80) obj).f45044a;
                    if (xv80Var != null) {
                        Object[] objArrValues = sv80.values();
                        int length = objArrValues.length;
                        while (true) {
                            if (i2 < length) {
                                obj2 = objArrValues[i2];
                                obj2.getClass();
                                if (!"SendMessageTypingAction".equals(xv80Var.f41547a)) {
                                    i2++;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 == null) {
                            jf4.k(null);
                            return null;
                        }
                        ecs0Var = obj2;
                    }
                    if (ecs0Var != null) {
                        l8eVar.j = 1;
                        if (kmqVar.a(ecs0Var, l8eVar) == obj56) {
                            return obj56;
                        }
                    }
                } else {
                    if (i52 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj55);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof n8e) {
                    n8eVar = (n8e) yjeVar;
                    int i53 = n8eVar.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        n8eVar.j = i53 - Integer.MIN_VALUE;
                    } else {
                        n8eVar = new n8e(this, yjeVar);
                    }
                } else {
                    n8eVar = new n8e(this, yjeVar);
                }
                Object obj57 = n8eVar.i;
                Object obj58 = wne.f39444a;
                int i54 = n8eVar.j;
                if (i54 == 0) {
                    z1x.P(obj57);
                    hcs0 hcs0Var = ((kcs0) obj).f18076a;
                    if (hcs0Var != null) {
                        Integer num2 = hcs0Var.f12841a;
                        if (num2 == null) {
                            jf4.k(null);
                            return null;
                        }
                        int iIntValue = num2.intValue();
                        String str5 = hcs0Var.b;
                        if (str5 == null) {
                            jf4.k(null);
                            return null;
                        }
                        Long l3 = hcs0Var.d;
                        if (l3 == null) {
                            jf4.k(null);
                            return null;
                        }
                        long millis = TimeUnit.SECONDS.toMillis(l3.longValue());
                        vcs0[] vcs0VarArrValues = vcs0.values();
                        int length2 = vcs0VarArrValues.length;
                        while (true) {
                            if (i < length2) {
                                vcs0 vcs0Var2 = vcs0VarArrValues[i];
                                vcs0Var2.getClass();
                                if ("Read".equals(hcs0Var.c)) {
                                    vcs0Var = vcs0Var2;
                                } else {
                                    i++;
                                }
                            } else {
                                vcs0Var = null;
                            }
                        }
                        if (vcs0Var == null) {
                            jf4.k(null);
                            return null;
                        }
                        ecs0Var = new ecs0(iIntValue, str5, millis, vcs0Var);
                    }
                    if (ecs0Var != null) {
                        n8eVar.j = 1;
                        if (kmqVar.a(ecs0Var, n8eVar) == obj58) {
                            return obj58;
                        }
                    }
                } else {
                    if (i54 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj57);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof dae) {
                    daeVar = (dae) yjeVar;
                    int i55 = daeVar.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        daeVar.j = i55 - Integer.MIN_VALUE;
                    } else {
                        daeVar = new dae(this, yjeVar);
                    }
                } else {
                    daeVar = new dae(this, yjeVar);
                }
                Object obj59 = daeVar.i;
                Object obj60 = wne.f39444a;
                int i56 = daeVar.j;
                if (i56 == 0) {
                    z1x.P(obj59);
                    Object obj61 = ((gxb) obj).f;
                    daeVar.j = 1;
                    if (kmqVar.a(obj61, daeVar) == obj60) {
                        return obj60;
                    }
                } else {
                    if (i56 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj59);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof nce) {
                    nceVar = (nce) yjeVar;
                    int i57 = nceVar.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        nceVar.j = i57 - Integer.MIN_VALUE;
                    } else {
                        nceVar = new nce(this, yjeVar);
                    }
                } else {
                    nceVar = new nce(this, yjeVar);
                }
                Object obj62 = nceVar.i;
                Object obj63 = wne.f39444a;
                int i58 = nceVar.j;
                if (i58 == 0) {
                    z1x.P(obj62);
                    gce gceVar = (gce) obj;
                    gceVar.getClass();
                    boolean z = gceVar.c;
                    String str6 = gceVar.f11056a;
                    if (z && str6.length() == 0) {
                        hceVar = jce.f16272a;
                    } else {
                        hceVar = str6.length() > 0 ? new hce(str6) : new ice(gceVar.b);
                    }
                    nceVar.j = 1;
                    if (kmqVar.a(hceVar, nceVar) == obj63) {
                        return obj63;
                    }
                } else {
                    if (i58 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj62);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ osa(kmq kmqVar, byte b) {
        this.f25773a = b;
        this.b = kmqVar;
    }
}
