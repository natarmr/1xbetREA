package a;

import android.util.Log;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ld60 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19835a;
    public final /* synthetic */ kmq b;

    public /* synthetic */ ld60(kmq kmqVar, byte b) {
        this.f19835a = b;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0172  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x0209  */
    /* JADX WARN: Code duplicated, block: B:162:0x0264  */
    /* JADX WARN: Code duplicated, block: B:188:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:206:0x0316  */
    /* JADX WARN: Code duplicated, block: B:224:0x0355  */
    /* JADX WARN: Code duplicated, block: B:242:0x0396  */
    /* JADX WARN: Code duplicated, block: B:258:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:276:0x040e  */
    /* JADX WARN: Code duplicated, block: B:292:0x044a  */
    /* JADX WARN: Code duplicated, block: B:317:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:335:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:353:0x0520  */
    /* JADX WARN: Code duplicated, block: B:371:0x055c  */
    /* JADX WARN: Code duplicated, block: B:403:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:421:0x0617  */
    /* JADX WARN: Code duplicated, block: B:439:0x065c  */
    /* JADX WARN: Code duplicated, block: B:459:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:479:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:499:0x074f  */
    /* JADX WARN: Code duplicated, block: B:519:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:539:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:557:0x082d  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0136  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        kd60 kd60Var;
        nd60 nd60Var;
        rr60 rr60Var;
        yr60 yr60Var;
        zu60 zu60Var;
        yx60 yx60Var;
        l270 l270Var;
        e670 e670Var;
        af70 af70Var;
        xq70 xq70Var;
        Object er70Var;
        pt70 pt70Var;
        n980 n980Var;
        et80 et80Var;
        Object objA;
        m990 m990Var;
        o990 o990Var;
        ab90 ab90Var;
        cb90 cb90Var;
        wp90 wp90Var;
        as90 as90Var;
        os90 os90Var;
        ju90 ju90Var;
        h0a h0aVarH;
        t0b0 t0b0Var;
        v0b0 v0b0Var;
        oab0 oab0Var;
        qab0 qab0Var;
        sab0 sab0Var;
        uab0 uab0Var;
        zab0 zab0Var;
        bbb0 bbb0Var;
        byte b = this.f19835a;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof kd60) {
                    kd60Var = (kd60) yjeVar;
                    int i = kd60Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kd60Var.j = i - Integer.MIN_VALUE;
                    } else {
                        kd60Var = new kd60(this, yjeVar);
                    }
                } else {
                    kd60Var = new kd60(this, yjeVar);
                }
                Object obj2 = kd60Var.i;
                wne wneVar = wne.f39444a;
                int i2 = kd60Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    if (!((List) obj).isEmpty()) {
                        kd60Var.j = 1;
                        if (kmqVar.a(obj, kd60Var) == wneVar) {
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
                if (yjeVar instanceof nd60) {
                    nd60Var = (nd60) yjeVar;
                    int i3 = nd60Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nd60Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        nd60Var = new nd60(this, yjeVar);
                    }
                } else {
                    nd60Var = new nd60(this, yjeVar);
                }
                Object obj3 = nd60Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = nd60Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    if (obj instanceof zos) {
                        nd60Var.j = 1;
                        if (kmqVar.a(obj, nd60Var) == wneVar2) {
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
                if (yjeVar instanceof rr60) {
                    rr60Var = (rr60) yjeVar;
                    int i5 = rr60Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rr60Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        rr60Var = new rr60(this, yjeVar);
                    }
                } else {
                    rr60Var = new rr60(this, yjeVar);
                }
                Object obj4 = rr60Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = rr60Var.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    Pair pair = (Pair) obj;
                    pat patVar = (pat) pair.f46059a;
                    pat patVar2 = (pat) pair.b;
                    patVar.getClass();
                    if (!(patVar instanceof kat)) {
                        patVar2.getClass();
                        if (!(patVar2 instanceof kat)) {
                            rr60Var.j = 1;
                            if (kmqVar.a(obj, rr60Var) == wneVar3) {
                                return wneVar3;
                            }
                        }
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
                if (yjeVar instanceof yr60) {
                    yr60Var = (yr60) yjeVar;
                    int i7 = yr60Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        yr60Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        yr60Var = new yr60(this, yjeVar);
                    }
                } else {
                    yr60Var = new yr60(this, yjeVar);
                }
                Object obj5 = yr60Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = yr60Var.j;
                if (i8 == 0) {
                    z1x.P(obj5);
                    Pair pair2 = (Pair) obj;
                    pat patVar3 = (pat) pair2.f46059a;
                    pat patVar4 = (pat) pair2.b;
                    patVar3.getClass();
                    if (!(patVar3 instanceof kat)) {
                        patVar4.getClass();
                        if (!(patVar4 instanceof kat)) {
                            yr60Var.j = 1;
                            if (kmqVar.a(obj, yr60Var) == wneVar4) {
                                return wneVar4;
                            }
                        }
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
                if (yjeVar instanceof zu60) {
                    zu60Var = (zu60) yjeVar;
                    int i9 = zu60Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        zu60Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        zu60Var = new zu60(this, yjeVar);
                    }
                } else {
                    zu60Var = new zu60(this, yjeVar);
                }
                Object obj6 = zu60Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = zu60Var.j;
                if (i10 == 0) {
                    z1x.P(obj6);
                    Pair pair3 = (Pair) obj;
                    pat patVar5 = (pat) pair3.f46059a;
                    pat patVar6 = (pat) pair3.b;
                    patVar5.getClass();
                    if (!(patVar5 instanceof kat)) {
                        patVar6.getClass();
                        if (!(patVar6 instanceof kat)) {
                            zu60Var.j = 1;
                            if (kmqVar.a(obj, zu60Var) == wneVar5) {
                                return wneVar5;
                            }
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
                if (yjeVar instanceof yx60) {
                    yx60Var = (yx60) yjeVar;
                    int i11 = yx60Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        yx60Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        yx60Var = new yx60(this, yjeVar);
                    }
                } else {
                    yx60Var = new yx60(this, yjeVar);
                }
                Object obj7 = yx60Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = yx60Var.j;
                if (i12 == 0) {
                    z1x.P(obj7);
                    Pair pair4 = (Pair) obj;
                    pat patVar7 = (pat) pair4.f46059a;
                    pat patVar8 = (pat) pair4.b;
                    patVar7.getClass();
                    if (!(patVar7 instanceof kat)) {
                        patVar8.getClass();
                        if (!(patVar8 instanceof kat)) {
                            yx60Var.j = 1;
                            if (kmqVar.a(obj, yx60Var) == wneVar6) {
                                return wneVar6;
                            }
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
            case 6:
                if (yjeVar instanceof l270) {
                    l270Var = (l270) yjeVar;
                    int i13 = l270Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        l270Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        l270Var = new l270(this, yjeVar);
                    }
                } else {
                    l270Var = new l270(this, yjeVar);
                }
                Object obj8 = l270Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = l270Var.j;
                if (i14 == 0) {
                    z1x.P(obj8);
                    Pair pair5 = (Pair) obj;
                    pat patVar9 = (pat) pair5.f46059a;
                    pat patVar10 = (pat) pair5.b;
                    patVar9.getClass();
                    if (!(patVar9 instanceof kat)) {
                        patVar10.getClass();
                        if (!(patVar10 instanceof kat)) {
                            l270Var.j = 1;
                            if (kmqVar.a(obj, l270Var) == wneVar7) {
                                return wneVar7;
                            }
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
                if (yjeVar instanceof e670) {
                    e670Var = (e670) yjeVar;
                    int i15 = e670Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        e670Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        e670Var = new e670(this, yjeVar);
                    }
                } else {
                    e670Var = new e670(this, yjeVar);
                }
                Object obj9 = e670Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = e670Var.j;
                if (i16 == 0) {
                    z1x.P(obj9);
                    if (((Boolean) ((prs0) obj).f27482a).booleanValue()) {
                        e670Var.j = 1;
                        if (kmqVar.a(obj, e670Var) == wneVar8) {
                            return wneVar8;
                        }
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
                if (yjeVar instanceof af70) {
                    af70Var = (af70) yjeVar;
                    int i17 = af70Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        af70Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        af70Var = new af70(this, yjeVar);
                    }
                } else {
                    af70Var = new af70(this, yjeVar);
                }
                Object obj10 = af70Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = af70Var.j;
                if (i18 == 0) {
                    z1x.P(obj10);
                    if (((Boolean) obj).booleanValue()) {
                        af70Var.j = 1;
                        if (kmqVar.a(obj, af70Var) == wneVar9) {
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
            case 9:
                if (yjeVar instanceof xq70) {
                    xq70Var = (xq70) yjeVar;
                    int i19 = xq70Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        xq70Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        xq70Var = new xq70(this, yjeVar);
                    }
                } else {
                    xq70Var = new xq70(this, yjeVar);
                }
                Object obj11 = xq70Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = xq70Var.j;
                if (i20 == 0) {
                    z1x.P(obj11);
                    g6k0 g6k0Var = (g6k0) obj;
                    g6k0Var.getClass();
                    if (g6k0Var.equals(e6k0.f7289a)) {
                        er70Var = dr70.f6544a;
                    } else if (g6k0Var.equals(c6k0.f3821a)) {
                        er70Var = ar70.f1332a;
                    } else if (g6k0Var.equals(b6k0.f2059a)) {
                        er70Var = zq70.f44794a;
                    } else if (g6k0Var.equals(d6k0.f5553a)) {
                        er70Var = br70.f3065a;
                    } else {
                        if (!(g6k0Var instanceof f6k0)) {
                            t9f.b();
                            return null;
                        }
                        er70Var = new er70(((f6k0) g6k0Var).f9016a);
                    }
                    xq70Var.j = 1;
                    if (kmqVar.a(er70Var, xq70Var) == wneVar10) {
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
                if (yjeVar instanceof pt70) {
                    pt70Var = (pt70) yjeVar;
                    int i21 = pt70Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        pt70Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        pt70Var = new pt70(this, yjeVar);
                    }
                } else {
                    pt70Var = new pt70(this, yjeVar);
                }
                Object obj12 = pt70Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = pt70Var.j;
                if (i22 == 0) {
                    z1x.P(obj12);
                    if (obj instanceof ar70) {
                        pt70Var.j = 1;
                        if (kmqVar.a(obj, pt70Var) == wneVar11) {
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
            case 11:
                if (yjeVar instanceof n980) {
                    n980Var = (n980) yjeVar;
                    int i23 = n980Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        n980Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        n980Var = new n980(this, yjeVar);
                    }
                } else {
                    n980Var = new n980(this, yjeVar);
                }
                Object obj13 = n980Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = n980Var.j;
                if (i24 == 0) {
                    z1x.P(obj13);
                    if (!(((w880) obj) instanceof q880)) {
                        n980Var.j = 1;
                        if (kmqVar.a(obj, n980Var) == wneVar12) {
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
            case 12:
                if (yjeVar instanceof et80) {
                    et80Var = (et80) yjeVar;
                    int i25 = et80Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        et80Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        et80Var = new et80(this, yjeVar);
                    }
                } else {
                    et80Var = new et80(this, yjeVar);
                }
                Object obj14 = et80Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = et80Var.j;
                if (i26 == 0) {
                    z1x.P(obj14);
                    if (((Boolean) obj).booleanValue()) {
                        et80Var.j = 1;
                        if (kmqVar.a(obj, et80Var) == wneVar13) {
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
            case 13:
                e7a e7aVar = (e7a) ((Pair) obj).f46059a;
                return ((e7aVar instanceof c7a) && (objA = kmqVar.a(((c7a) e7aVar).f3852a, yjeVar)) == wne.f39444a) ? objA : Unit.f46060a;
            case 14:
                if (yjeVar instanceof m990) {
                    m990Var = (m990) yjeVar;
                    int i27 = m990Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        m990Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        m990Var = new m990(this, yjeVar);
                    }
                } else {
                    m990Var = new m990(this, yjeVar);
                }
                Object obj15 = m990Var.i;
                wne wneVar14 = wne.f39444a;
                int i28 = m990Var.j;
                if (i28 == 0) {
                    z1x.P(obj15);
                    if (obj instanceof mr4) {
                        m990Var.j = 1;
                        if (kmqVar.a(obj, m990Var) == wneVar14) {
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
            case 15:
                if (yjeVar instanceof o990) {
                    o990Var = (o990) yjeVar;
                    int i29 = o990Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        o990Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        o990Var = new o990(this, yjeVar);
                    }
                } else {
                    o990Var = new o990(this, yjeVar);
                }
                Object obj16 = o990Var.i;
                wne wneVar15 = wne.f39444a;
                int i30 = o990Var.j;
                if (i30 == 0) {
                    z1x.P(obj16);
                    String str = ((mr4) obj).f22250a;
                    o990Var.j = 1;
                    if (kmqVar.a(str, o990Var) == wneVar15) {
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
            case 16:
                if (yjeVar instanceof ab90) {
                    ab90Var = (ab90) yjeVar;
                    int i31 = ab90Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        ab90Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        ab90Var = new ab90(this, yjeVar);
                    }
                } else {
                    ab90Var = new ab90(this, yjeVar);
                }
                Object obj17 = ab90Var.i;
                wne wneVar16 = wne.f39444a;
                int i32 = ab90Var.j;
                if (i32 == 0) {
                    z1x.P(obj17);
                    if (obj instanceof mr4) {
                        ab90Var.j = 1;
                        if (kmqVar.a(obj, ab90Var) == wneVar16) {
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
                if (yjeVar instanceof cb90) {
                    cb90Var = (cb90) yjeVar;
                    int i33 = cb90Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        cb90Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        cb90Var = new cb90(this, yjeVar);
                    }
                } else {
                    cb90Var = new cb90(this, yjeVar);
                }
                Object obj18 = cb90Var.i;
                wne wneVar17 = wne.f39444a;
                int i34 = cb90Var.j;
                if (i34 == 0) {
                    z1x.P(obj18);
                    String str2 = ((mr4) obj).f22250a;
                    cb90Var.j = 1;
                    if (kmqVar.a(str2, cb90Var) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof wp90) {
                    wp90Var = (wp90) yjeVar;
                    int i35 = wp90Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        wp90Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        wp90Var = new wp90(this, yjeVar);
                    }
                } else {
                    wp90Var = new wp90(this, yjeVar);
                }
                Object obj19 = wp90Var.i;
                wne wneVar18 = wne.f39444a;
                int i36 = wp90Var.j;
                if (i36 == 0) {
                    z1x.P(obj19);
                    if (!((List) obj).isEmpty()) {
                        wp90Var.j = 1;
                        if (kmqVar.a(obj, wp90Var) == wneVar18) {
                            return wneVar18;
                        }
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof as90) {
                    as90Var = (as90) yjeVar;
                    int i37 = as90Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        as90Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        as90Var = new as90(this, yjeVar);
                    }
                } else {
                    as90Var = new as90(this, yjeVar);
                }
                Object obj20 = as90Var.i;
                wne wneVar19 = wne.f39444a;
                int i38 = as90Var.j;
                if (i38 == 0) {
                    z1x.P(obj20);
                    if (!(((op90) obj) instanceof np90)) {
                        as90Var.j = 1;
                        if (kmqVar.a(obj, as90Var) == wneVar19) {
                            return wneVar19;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof os90) {
                    os90Var = (os90) yjeVar;
                    int i39 = os90Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        os90Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        os90Var = new os90(this, yjeVar);
                    }
                } else {
                    os90Var = new os90(this, yjeVar);
                }
                Object obj21 = os90Var.i;
                wne wneVar20 = wne.f39444a;
                int i40 = os90Var.j;
                if (i40 == 0) {
                    z1x.P(obj21);
                    if (((Boolean) obj).booleanValue()) {
                        os90Var.j = 1;
                        if (kmqVar.a(obj, os90Var) == wneVar20) {
                            return wneVar20;
                        }
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof ju90) {
                    ju90Var = (ju90) yjeVar;
                    int i41 = ju90Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        ju90Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        ju90Var = new ju90(this, yjeVar);
                    }
                } else {
                    ju90Var = new ju90(this, yjeVar);
                }
                Object obj22 = ju90Var.i;
                wne wneVar21 = wne.f39444a;
                int i42 = ju90Var.j;
                if (i42 == 0) {
                    z1x.P(obj22);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        String str3 = ((g0a) it.next()).f10449a;
                        try {
                            h0aVarH = xf0.H(str3, null, null);
                        } catch (Exception e) {
                            Log.w("PipePresenceSrc", "Failed to create CameraIdentifier for pipeId: " + str3, e);
                            h0aVarH = null;
                        }
                        if (h0aVarH != null) {
                            arrayList.add(h0aVarH);
                        }
                        break;
                    }
                    ju90Var.j = 1;
                    if (kmqVar.a(arrayList, ju90Var) == wneVar21) {
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
            case 22:
                if (yjeVar instanceof t0b0) {
                    t0b0Var = (t0b0) yjeVar;
                    int i43 = t0b0Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        t0b0Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        t0b0Var = new t0b0(this, yjeVar);
                    }
                } else {
                    t0b0Var = new t0b0(this, yjeVar);
                }
                Object obj23 = t0b0Var.i;
                wne wneVar22 = wne.f39444a;
                int i44 = t0b0Var.j;
                if (i44 == 0) {
                    z1x.P(obj23);
                    List list = (List) obj;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(hew0.W((uvc) it2.next()));
                    }
                    t0b0Var.j = 1;
                    if (kmqVar.a(arrayList2, t0b0Var) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof v0b0) {
                    v0b0Var = (v0b0) yjeVar;
                    int i45 = v0b0Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        v0b0Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        v0b0Var = new v0b0(this, yjeVar);
                    }
                } else {
                    v0b0Var = new v0b0(this, yjeVar);
                }
                Object obj24 = v0b0Var.i;
                wne wneVar23 = wne.f39444a;
                int i46 = v0b0Var.j;
                if (i46 == 0) {
                    z1x.P(obj24);
                    List list2 = (List) obj;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(hew0.V((kr5) it3.next()));
                    }
                    v0b0Var.j = 1;
                    if (kmqVar.a(arrayList3, v0b0Var) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
            case 24:
                if (yjeVar instanceof oab0) {
                    oab0Var = (oab0) yjeVar;
                    int i47 = oab0Var.j;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        oab0Var.j = i47 - Integer.MIN_VALUE;
                    } else {
                        oab0Var = new oab0(this, yjeVar);
                    }
                } else {
                    oab0Var = new oab0(this, yjeVar);
                }
                Object obj25 = oab0Var.i;
                wne wneVar24 = wne.f39444a;
                int i48 = oab0Var.j;
                if (i48 == 0) {
                    z1x.P(obj25);
                    dr5 dr5Var = ((n7b0) obj).b;
                    oab0Var.j = 1;
                    if (kmqVar.a(dr5Var, oab0Var) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (i48 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj25);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                if (yjeVar instanceof qab0) {
                    qab0Var = (qab0) yjeVar;
                    int i49 = qab0Var.j;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        qab0Var.j = i49 - Integer.MIN_VALUE;
                    } else {
                        qab0Var = new qab0(this, yjeVar);
                    }
                } else {
                    qab0Var = new qab0(this, yjeVar);
                }
                Object obj26 = qab0Var.i;
                wne wneVar25 = wne.f39444a;
                int i50 = qab0Var.j;
                if (i50 == 0) {
                    z1x.P(obj26);
                    oz60 oz60Var = ((n7b0) obj).c;
                    qab0Var.j = 1;
                    if (kmqVar.a(oz60Var, qab0Var) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (i50 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj26);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (yjeVar instanceof sab0) {
                    sab0Var = (sab0) yjeVar;
                    int i51 = sab0Var.j;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        sab0Var.j = i51 - Integer.MIN_VALUE;
                    } else {
                        sab0Var = new sab0(this, yjeVar);
                    }
                } else {
                    sab0Var = new sab0(this, yjeVar);
                }
                Object obj27 = sab0Var.i;
                wne wneVar26 = wne.f39444a;
                int i52 = sab0Var.j;
                if (i52 == 0) {
                    z1x.P(obj27);
                    if (!(((y7b0) obj) instanceof v7b0)) {
                        sab0Var.j = 1;
                        if (kmqVar.a(obj, sab0Var) == wneVar26) {
                            return wneVar26;
                        }
                    }
                } else {
                    if (i52 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj27);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (yjeVar instanceof uab0) {
                    uab0Var = (uab0) yjeVar;
                    int i53 = uab0Var.j;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        uab0Var.j = i53 - Integer.MIN_VALUE;
                    } else {
                        uab0Var = new uab0(this, yjeVar);
                    }
                } else {
                    uab0Var = new uab0(this, yjeVar);
                }
                Object obj28 = uab0Var.i;
                wne wneVar27 = wne.f39444a;
                int i54 = uab0Var.j;
                if (i54 == 0) {
                    z1x.P(obj28);
                    jdb0 jdb0Var = (jdb0) obj;
                    jdb0Var.getClass();
                    boolean z = jdb0Var.e;
                    Object obj29 = v7b0.f36916a;
                    if (z) {
                        if (jdb0Var.f16321a) {
                            obj29 = x7b0.f40405a;
                        } else if (jdb0Var.c) {
                            obj29 = u7b0.f35177a;
                        } else if (jdb0Var.d) {
                            obj29 = t7b0.f33459a;
                        } else if (jdb0Var.b) {
                            obj29 = w7b0.f38664a;
                        }
                    }
                    uab0Var.j = 1;
                    if (kmqVar.a(obj29, uab0Var) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (i54 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (yjeVar instanceof zab0) {
                    zab0Var = (zab0) yjeVar;
                    int i55 = zab0Var.j;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        zab0Var.j = i55 - Integer.MIN_VALUE;
                    } else {
                        zab0Var = new zab0(this, yjeVar);
                    }
                } else {
                    zab0Var = new zab0(this, yjeVar);
                }
                Object obj30 = zab0Var.i;
                wne wneVar28 = wne.f39444a;
                int i56 = zab0Var.j;
                if (i56 == 0) {
                    z1x.P(obj30);
                    td00 td00Var = ((n7b0) obj).d;
                    zab0Var.j = 1;
                    if (kmqVar.a(td00Var, zab0Var) == wneVar28) {
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
                if (yjeVar instanceof bbb0) {
                    bbb0Var = (bbb0) yjeVar;
                    int i57 = bbb0Var.j;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        bbb0Var.j = i57 - Integer.MIN_VALUE;
                    } else {
                        bbb0Var = new bbb0(this, yjeVar);
                    }
                } else {
                    bbb0Var = new bbb0(this, yjeVar);
                }
                Object obj31 = bbb0Var.i;
                wne wneVar29 = wne.f39444a;
                int i58 = bbb0Var.j;
                if (i58 == 0) {
                    z1x.P(obj31);
                    b9l0 b9l0Var = ((n7b0) obj).f23033a;
                    bbb0Var.j = 1;
                    if (kmqVar.a(b9l0Var, bbb0Var) == wneVar29) {
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
}
