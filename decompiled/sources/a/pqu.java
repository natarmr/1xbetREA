package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes4.dex */
public final class pqu implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27433a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ hie0 c;

    public pqu(hie0 hie0Var, kmq kmqVar) {
        this.f27433a = (byte) 21;
        this.c = hie0Var;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:129:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:148:0x0222  */
    /* JADX WARN: Code duplicated, block: B:164:0x025e  */
    /* JADX WARN: Code duplicated, block: B:183:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:199:0x02de  */
    /* JADX WARN: Code duplicated, block: B:215:0x031a  */
    /* JADX WARN: Code duplicated, block: B:231:0x0356  */
    /* JADX WARN: Code duplicated, block: B:247:0x0392  */
    /* JADX WARN: Code duplicated, block: B:263:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:279:0x040a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:298:0x044e  */
    /* JADX WARN: Code duplicated, block: B:317:0x0492  */
    /* JADX WARN: Code duplicated, block: B:333:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:349:0x050a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x0120  */
    /* JADX WARN: Code duplicated, block: B:94:0x015c  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        oqu oquVar;
        vqu vquVar;
        esu esuVar;
        wxu wxuVar;
        iun iunVar;
        zxu zxuVar;
        lzu lzuVar;
        szu szuVar;
        yzu yzuVar;
        g0v g0vVar;
        l0v l0vVar;
        n0v n0vVar;
        t0v t0vVar;
        m1v m1vVar;
        o1v o1vVar;
        a2v a2vVar;
        c2v c2vVar;
        arx arxVar;
        n720 n720Var;
        va60 va60Var;
        cb60 cb60Var;
        hb60 hb60Var;
        byte b = this.f27433a;
        hie0 hie0Var = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof oqu) {
                    oquVar = (oqu) yjeVar;
                    int i = oquVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oquVar.j = i - Integer.MIN_VALUE;
                    } else {
                        oquVar = new oqu(this, yjeVar);
                    }
                } else {
                    oquVar = new oqu(this, yjeVar);
                }
                Object obj2 = oquVar.i;
                wne wneVar = wne.f39444a;
                int i2 = oquVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    hie0Var.f13108a = false;
                    oquVar.j = 1;
                    if (kmqVar.a(null, oquVar) == wneVar) {
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
                if (yjeVar instanceof vqu) {
                    vquVar = (vqu) yjeVar;
                    int i3 = vquVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vquVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        vquVar = new vqu(this, yjeVar);
                    }
                } else {
                    vquVar = new vqu(this, yjeVar);
                }
                Object obj3 = vquVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = vquVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    hie0Var.f13108a = false;
                    vquVar.j = 1;
                    if (kmqVar.a(null, vquVar) == wneVar2) {
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
                if (yjeVar instanceof esu) {
                    esuVar = (esu) yjeVar;
                    int i5 = esuVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        esuVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        esuVar = new esu(this, yjeVar);
                    }
                } else {
                    esuVar = new esu(this, yjeVar);
                }
                Object obj4 = esuVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = esuVar.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    hie0Var.f13108a = false;
                    esuVar.j = 1;
                    if (kmqVar.a(null, esuVar) == wneVar3) {
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
                if (yjeVar instanceof wxu) {
                    wxuVar = (wxu) yjeVar;
                    int i7 = wxuVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        wxuVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        wxuVar = new wxu(this, yjeVar);
                    }
                } else {
                    wxuVar = new wxu(this, yjeVar);
                }
                Object obj5 = wxuVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = wxuVar.j;
                if (i8 == 0) {
                    z1x.P(obj5);
                    hie0Var.f13108a = false;
                    iunVar = ((List) obj).isEmpty() ? iun.f15405a : null;
                    wxuVar.j = 1;
                    if (kmqVar.a(iunVar, wxuVar) == wneVar4) {
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
                if (yjeVar instanceof zxu) {
                    zxuVar = (zxu) yjeVar;
                    int i9 = zxuVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        zxuVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        zxuVar = new zxu(this, yjeVar);
                    }
                } else {
                    zxuVar = new zxu(this, yjeVar);
                }
                Object obj6 = zxuVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = zxuVar.j;
                if (i10 == 0) {
                    z1x.P(obj6);
                    hie0Var.f13108a = false;
                    iunVar = ((List) obj).isEmpty() ? iun.f15405a : null;
                    zxuVar.j = 1;
                    if (kmqVar.a(iunVar, zxuVar) == wneVar5) {
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
                if (yjeVar instanceof lzu) {
                    lzuVar = (lzu) yjeVar;
                    int i11 = lzuVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        lzuVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        lzuVar = new lzu(this, yjeVar);
                    }
                } else {
                    lzuVar = new lzu(this, yjeVar);
                }
                Object obj7 = lzuVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = lzuVar.j;
                if (i12 == 0) {
                    z1x.P(obj7);
                    hie0Var.f13108a = false;
                    lzuVar.j = 1;
                    if (kmqVar.a(null, lzuVar) == wneVar6) {
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
                if (yjeVar instanceof szu) {
                    szuVar = (szu) yjeVar;
                    int i13 = szuVar.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        szuVar.j = i13 - Integer.MIN_VALUE;
                    } else {
                        szuVar = new szu(this, yjeVar);
                    }
                } else {
                    szuVar = new szu(this, yjeVar);
                }
                Object obj8 = szuVar.i;
                wne wneVar7 = wne.f39444a;
                int i14 = szuVar.j;
                if (i14 == 0) {
                    z1x.P(obj8);
                    hie0Var.f13108a = false;
                    szuVar.j = 1;
                    if (kmqVar.a(null, szuVar) == wneVar7) {
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
                if (yjeVar instanceof yzu) {
                    yzuVar = (yzu) yjeVar;
                    int i15 = yzuVar.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        yzuVar.j = i15 - Integer.MIN_VALUE;
                    } else {
                        yzuVar = new yzu(this, yjeVar);
                    }
                } else {
                    yzuVar = new yzu(this, yjeVar);
                }
                Object obj9 = yzuVar.i;
                wne wneVar8 = wne.f39444a;
                int i16 = yzuVar.j;
                if (i16 == 0) {
                    z1x.P(obj9);
                    hie0Var.f13108a = false;
                    yzuVar.j = 1;
                    if (kmqVar.a(null, yzuVar) == wneVar8) {
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
                if (yjeVar instanceof g0v) {
                    g0vVar = (g0v) yjeVar;
                    int i17 = g0vVar.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        g0vVar.j = i17 - Integer.MIN_VALUE;
                    } else {
                        g0vVar = new g0v(this, yjeVar);
                    }
                } else {
                    g0vVar = new g0v(this, yjeVar);
                }
                Object obj10 = g0vVar.i;
                wne wneVar9 = wne.f39444a;
                int i18 = g0vVar.j;
                if (i18 == 0) {
                    z1x.P(obj10);
                    hie0Var.f13108a = false;
                    g0vVar.j = 1;
                    if (kmqVar.a(null, g0vVar) == wneVar9) {
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
                if (yjeVar instanceof l0v) {
                    l0vVar = (l0v) yjeVar;
                    int i19 = l0vVar.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        l0vVar.j = i19 - Integer.MIN_VALUE;
                    } else {
                        l0vVar = new l0v(this, yjeVar);
                    }
                } else {
                    l0vVar = new l0v(this, yjeVar);
                }
                Object obj11 = l0vVar.i;
                wne wneVar10 = wne.f39444a;
                int i20 = l0vVar.j;
                if (i20 == 0) {
                    z1x.P(obj11);
                    hie0Var.f13108a = false;
                    l0vVar.j = 1;
                    if (kmqVar.a(null, l0vVar) == wneVar10) {
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
                if (yjeVar instanceof n0v) {
                    n0vVar = (n0v) yjeVar;
                    int i21 = n0vVar.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        n0vVar.j = i21 - Integer.MIN_VALUE;
                    } else {
                        n0vVar = new n0v(this, yjeVar);
                    }
                } else {
                    n0vVar = new n0v(this, yjeVar);
                }
                Object obj12 = n0vVar.i;
                wne wneVar11 = wne.f39444a;
                int i22 = n0vVar.j;
                if (i22 == 0) {
                    z1x.P(obj12);
                    hie0Var.f13108a = false;
                    n0vVar.j = 1;
                    if (kmqVar.a(null, n0vVar) == wneVar11) {
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
                if (yjeVar instanceof t0v) {
                    t0vVar = (t0v) yjeVar;
                    int i23 = t0vVar.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        t0vVar.j = i23 - Integer.MIN_VALUE;
                    } else {
                        t0vVar = new t0v(this, yjeVar);
                    }
                } else {
                    t0vVar = new t0v(this, yjeVar);
                }
                Object obj13 = t0vVar.i;
                wne wneVar12 = wne.f39444a;
                int i24 = t0vVar.j;
                if (i24 == 0) {
                    z1x.P(obj13);
                    hie0Var.f13108a = false;
                    iunVar = ((List) obj).isEmpty() ? iun.f15405a : null;
                    t0vVar.j = 1;
                    if (kmqVar.a(iunVar, t0vVar) == wneVar12) {
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
                if (yjeVar instanceof m1v) {
                    m1vVar = (m1v) yjeVar;
                    int i25 = m1vVar.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        m1vVar.j = i25 - Integer.MIN_VALUE;
                    } else {
                        m1vVar = new m1v(this, yjeVar);
                    }
                } else {
                    m1vVar = new m1v(this, yjeVar);
                }
                Object obj14 = m1vVar.i;
                wne wneVar13 = wne.f39444a;
                int i26 = m1vVar.j;
                if (i26 == 0) {
                    z1x.P(obj14);
                    hie0Var.f13108a = false;
                    m1vVar.j = 1;
                    if (kmqVar.a(null, m1vVar) == wneVar13) {
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
                if (yjeVar instanceof o1v) {
                    o1vVar = (o1v) yjeVar;
                    int i27 = o1vVar.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        o1vVar.j = i27 - Integer.MIN_VALUE;
                    } else {
                        o1vVar = new o1v(this, yjeVar);
                    }
                } else {
                    o1vVar = new o1v(this, yjeVar);
                }
                Object obj15 = o1vVar.i;
                wne wneVar14 = wne.f39444a;
                int i28 = o1vVar.j;
                if (i28 == 0) {
                    z1x.P(obj15);
                    IndexedValue indexedValue = (IndexedValue) obj;
                    int i29 = indexedValue.f46061a;
                    List list = (List) indexedValue.b;
                    hie0Var.f13108a = i29 > 0;
                    o1vVar.j = 1;
                    if (kmqVar.a(list, o1vVar) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof a2v) {
                    a2vVar = (a2v) yjeVar;
                    int i30 = a2vVar.j;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        a2vVar.j = i30 - Integer.MIN_VALUE;
                    } else {
                        a2vVar = new a2v(this, yjeVar);
                    }
                } else {
                    a2vVar = new a2v(this, yjeVar);
                }
                Object obj16 = a2vVar.i;
                wne wneVar15 = wne.f39444a;
                int i31 = a2vVar.j;
                if (i31 == 0) {
                    z1x.P(obj16);
                    hie0Var.f13108a = false;
                    a2vVar.j = 1;
                    if (kmqVar.a(null, a2vVar) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (i31 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof c2v) {
                    c2vVar = (c2v) yjeVar;
                    int i32 = c2vVar.j;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        c2vVar.j = i32 - Integer.MIN_VALUE;
                    } else {
                        c2vVar = new c2v(this, yjeVar);
                    }
                } else {
                    c2vVar = new c2v(this, yjeVar);
                }
                Object obj17 = c2vVar.i;
                wne wneVar16 = wne.f39444a;
                int i33 = c2vVar.j;
                if (i33 == 0) {
                    z1x.P(obj17);
                    IndexedValue indexedValue2 = (IndexedValue) obj;
                    int i34 = indexedValue2.f46061a;
                    List list2 = (List) indexedValue2.b;
                    hie0Var.f13108a = i34 > 0;
                    c2vVar.j = 1;
                    if (kmqVar.a(list2, c2vVar) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (i33 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof arx) {
                    arxVar = (arx) yjeVar;
                    int i35 = arxVar.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        arxVar.j = i35 - Integer.MIN_VALUE;
                    } else {
                        arxVar = new arx(this, yjeVar);
                    }
                } else {
                    arxVar = new arx(this, yjeVar);
                }
                Object obj18 = arxVar.i;
                wne wneVar17 = wne.f39444a;
                int i36 = arxVar.j;
                if (i36 == 0) {
                    z1x.P(obj18);
                    hie0Var.f13108a = false;
                    arxVar.j = 1;
                    if (kmqVar.a((List) obj, arxVar) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof n720) {
                    n720Var = (n720) yjeVar;
                    int i37 = n720Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        n720Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        n720Var = new n720(this, yjeVar);
                    }
                } else {
                    n720Var = new n720(this, yjeVar);
                }
                Object obj19 = n720Var.i;
                wne wneVar18 = wne.f39444a;
                int i38 = n720Var.j;
                if (i38 == 0) {
                    z1x.P(obj19);
                    jg7 jg7Var = (jg7) obj;
                    if (hie0Var.f13108a) {
                        hie0Var.f13108a = false;
                    }
                    n720Var.j = 1;
                    if (kmqVar.a(jg7Var, n720Var) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj19);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof va60) {
                    va60Var = (va60) yjeVar;
                    int i39 = va60Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        va60Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        va60Var = new va60(this, yjeVar);
                    }
                } else {
                    va60Var = new va60(this, yjeVar);
                }
                Object obj20 = va60Var.i;
                wne wneVar19 = wne.f39444a;
                int i40 = va60Var.j;
                if (i40 == 0) {
                    z1x.P(obj20);
                    hie0Var.f13108a = false;
                    va60Var.j = 1;
                    if (kmqVar.a(null, va60Var) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof cb60) {
                    cb60Var = (cb60) yjeVar;
                    int i41 = cb60Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        cb60Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        cb60Var = new cb60(this, yjeVar);
                    }
                } else {
                    cb60Var = new cb60(this, yjeVar);
                }
                Object obj21 = cb60Var.i;
                wne wneVar20 = wne.f39444a;
                int i42 = cb60Var.j;
                if (i42 == 0) {
                    z1x.P(obj21);
                    hie0Var.f13108a = false;
                    cb60Var.j = 1;
                    if (kmqVar.a(null, cb60Var) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof hb60) {
                    hb60Var = (hb60) yjeVar;
                    int i43 = hb60Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        hb60Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        hb60Var = new hb60(this, yjeVar);
                    }
                } else {
                    hb60Var = new hb60(this, yjeVar);
                }
                Object obj22 = hb60Var.i;
                wne wneVar21 = wne.f39444a;
                int i44 = hb60Var.j;
                if (i44 == 0) {
                    z1x.P(obj22);
                    hie0Var.f13108a = false;
                    hb60Var.j = 1;
                    if (kmqVar.a(null, hb60Var) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            default:
                return b(((Number) obj).intValue(), yjeVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(int i, yje yjeVar) {
        l6m0 l6m0Var;
        if (yjeVar instanceof l6m0) {
            l6m0Var = (l6m0) yjeVar;
            int i2 = l6m0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l6m0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                l6m0Var = new l6m0(this, yjeVar);
            }
        } else {
            l6m0Var = new l6m0(this, yjeVar);
        }
        Object obj = l6m0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = l6m0Var.k;
        if (i3 == 0) {
            z1x.P(obj);
            if (i > 0) {
                hie0 hie0Var = this.c;
                if (!hie0Var.f13108a) {
                    hie0Var.f13108a = true;
                    jpj0 jpj0Var = jpj0.f16905a;
                    l6m0Var.k = 1;
                    if (this.b.a(jpj0Var, l6m0Var) == wneVar) {
                        return wneVar;
                    }
                }
            }
            return Unit.f46060a;
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        return Unit.f46060a;
    }

    public /* synthetic */ pqu(kmq kmqVar, hie0 hie0Var, byte b) {
        this.f27433a = b;
        this.b = kmqVar;
        this.c = hie0Var;
    }
}
