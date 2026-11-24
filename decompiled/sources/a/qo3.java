package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class qo3 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29052a;
    public final /* synthetic */ kmq b;

    public qo3(kmq kmqVar, cge0 cge0Var) {
        this.f29052a = (byte) 9;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object b(yje yjeVar, Object obj) {
        nj9 nj9Var;
        if (yjeVar instanceof nj9) {
            nj9Var = (nj9) yjeVar;
            int i = nj9Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj9Var.j = i - Integer.MIN_VALUE;
            } else {
                nj9Var = new nj9(this, yjeVar);
            }
        } else {
            nj9Var = new nj9(this, yjeVar);
        }
        Object obj2 = nj9Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nj9Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            List data = ((hj9) obj).getData();
            nj9Var.j = 1;
            if (this.b.a(data, nj9Var) == wneVar) {
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object c(yje yjeVar, Object obj) {
        zj9 zj9Var;
        if (yjeVar instanceof zj9) {
            zj9Var = (zj9) yjeVar;
            int i = zj9Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                zj9Var.j = i - Integer.MIN_VALUE;
            } else {
                zj9Var = new zj9(this, yjeVar);
            }
        } else {
            zj9Var = new zj9(this, yjeVar);
        }
        Object obj2 = zj9Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zj9Var.j;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(obj2);
            jx40 jx40Var = (jx40) obj;
            dnq dnqVar = new dnq(new fnq((vsg0) jx40Var.b.e, new z210(jx40Var, yjeVar2, (byte) 15)), new gbv(jx40Var, yjeVar2, (byte) 9), (byte) 0);
            fl80 fl80Var = jx40Var.f17285a;
            fl80 fl80Var2 = new fl80(dnqVar, fl80Var.b, fl80Var.c, new np30(jx40Var, (byte) 16));
            zj9Var.j = 1;
            if (this.b.a(fl80Var2, zj9Var) == wneVar) {
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object d(yje yjeVar, Object obj) {
        rl9 rl9Var;
        if (yjeVar instanceof rl9) {
            rl9Var = (rl9) yjeVar;
            int i = rl9Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                rl9Var.j = i - Integer.MIN_VALUE;
            } else {
                rl9Var = new rl9(this, yjeVar);
            }
        } else {
            rl9Var = new rl9(this, yjeVar);
        }
        Object obj2 = rl9Var.i;
        wne wneVar = wne.f39444a;
        int i2 = rl9Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            HashMap map = new HashMap();
            for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                Object key = entry.getKey();
                Iterable<ofj> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                for (ofj ofjVar : iterable) {
                    ofjVar.getClass();
                    arrayList.add(new ftk0(ofjVar.f25173a, ofjVar.b));
                }
                map.put(key, CollectionsKt.P0(arrayList));
            }
            rl9Var.j = 1;
            if (this.b.a(map, rl9Var) == wneVar) {
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object e(yje yjeVar, Object obj) {
        s4a s4aVar;
        if (yjeVar instanceof s4a) {
            s4aVar = (s4a) yjeVar;
            int i = s4aVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                s4aVar.j = i - Integer.MIN_VALUE;
            } else {
                s4aVar = new s4a(this, yjeVar);
            }
        } else {
            s4aVar = new s4a(this, yjeVar);
        }
        Object obj2 = s4aVar.i;
        wne wneVar = wne.f39444a;
        int i2 = s4aVar.j;
        if (i2 == 0) {
            z1x.P(obj2);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (List) obj) {
                ql5 ql5Var = (ql5) obj3;
                if (ql5Var.i.e() || (ql5Var.i == txs0.e && ql5Var.l)) {
                    arrayList.add(obj3);
                }
            }
            Boolean boolValueOf = Boolean.valueOf(arrayList.size() > 1);
            s4aVar.j = 1;
            if (this.b.a(boolValueOf, s4aVar) == wneVar) {
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(yje yjeVar, Object obj) {
        q5a q5aVar;
        if (yjeVar instanceof q5a) {
            q5aVar = (q5a) yjeVar;
            int i = q5aVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                q5aVar.k = i - Integer.MIN_VALUE;
            } else {
                q5aVar = new q5a(this, yjeVar);
            }
        } else {
            q5aVar = new q5a(this, yjeVar);
        }
        Object obj2 = q5aVar.i;
        wne wneVar = wne.f39444a;
        int i2 = q5aVar.k;
        if (i2 == 0) {
            z1x.P(obj2);
            zvw.O(q5aVar.getContext());
            q5aVar.k = 1;
            if (this.b.a(obj, q5aVar) == wneVar) {
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
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:132:0x0246  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:190:0x033d  */
    /* JADX WARN: Code duplicated, block: B:206:0x0381  */
    /* JADX WARN: Code duplicated, block: B:232:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:258:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:276:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:294:0x053d  */
    /* JADX WARN: Code duplicated, block: B:312:0x057b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:408:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:426:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:444:0x0728  */
    /* JADX WARN: Code duplicated, block: B:462:0x0766  */
    /* JADX WARN: Code duplicated, block: B:480:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:498:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:515:0x0833  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:533:0x087a  */
    /* JADX WARN: Code duplicated, block: B:597:0x0968  */
    /* JADX WARN: Code duplicated, block: B:642:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:665:0x0b00  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        po3 po3Var;
        Object obj2;
        Collection collectionD0;
        String strQ0;
        boolean z;
        Collection collectionD1;
        rr3 rr3Var;
        erq erqVar;
        ms3 ms3Var;
        wu3 wu3Var;
        j64 j64Var;
        ec4 ec4Var;
        ah4 ah4Var;
        ek4 ek4Var;
        gl4 gl4Var;
        is4 is4Var;
        kkk0 kkk0Var;
        lkk0 lkk0Var;
        Integer num;
        Integer num2;
        dt4 dt4Var;
        du4 du4Var;
        vu5 vu5Var;
        m36 m36Var;
        u36 u36Var;
        wj6 wj6Var;
        dv6 dv6Var;
        v87 v87Var;
        e29 e29Var;
        g29 g29Var;
        j69 j69Var;
        h89 h89Var;
        Object d89Var;
        jj9 jj9Var;
        lj9 lj9Var;
        ksa ksaVar;
        byte b = this.f29052a;
        int i = 0;
        kmq kmqVar = this.b;
        int i2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof po3) {
                    po3Var = (po3) yjeVar;
                    int i3 = po3Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        po3Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        po3Var = new po3(this, yjeVar);
                    }
                } else {
                    po3Var = new po3(this, yjeVar);
                }
                Object obj3 = po3Var.i;
                wne wneVar = wne.f39444a;
                int i4 = po3Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        d0t d0tVar = (d0t) it.next();
                        d0tVar.getClass();
                        long jI0 = qzb.i0(d0tVar);
                        long j = d0tVar.v;
                        f0t f0tVar = d0tVar.r;
                        f0t f0tVar2 = d0tVar.q;
                        rqs rqsVar = d0tVar.p;
                        String str = rqsVar.c;
                        String str2 = rqsVar.i;
                        long j2 = d0tVar.u;
                        Long lValueOf = Long.valueOf(d0tVar.f5282a);
                        boolean z2 = d0tVar.C;
                        long j3 = d0tVar.v;
                        String strA0 = d0tVar.o;
                        if (strA0.length() <= 0) {
                            strA0 = null;
                        }
                        if (strA0 == null) {
                            strA0 = sj3.a0(d0tVar);
                        }
                        String str3 = strA0;
                        long j4 = d0tVar.n;
                        Iterator it2 = it;
                        unp0 unp0Var = new unp0(f0tVar2.f8731a, qzb.c0(d0tVar), f0tVar2.d);
                        unp0 unp0Var2 = new unp0(f0tVar.f8731a, qzb.r0(d0tVar), f0tVar.d);
                        Iterator it3 = xkb.P().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                yxg yxgVar = (yxg) next;
                                Iterator it4 = it3;
                                if (j == yxgVar.b) {
                                    long j5 = d0tVar.u;
                                    if (j5 == yxgVar.f43419a || j5 == 0) {
                                        obj2 = next;
                                    }
                                }
                                it3 = it4;
                            } else {
                                obj2 = null;
                            }
                        }
                        if (obj2 != null) {
                            if (str2.length() > 0) {
                                List listI = new Regex(Separators.COMMA).i(str2);
                                if (listI.isEmpty()) {
                                    collectionD1 = iun.f15405a;
                                } else {
                                    ListIterator listIterator = listI.listIterator(listI.size());
                                    while (true) {
                                        if (!listIterator.hasPrevious()) {
                                            collectionD1 = iun.f15405a;
                                        } else if (((String) listIterator.previous()).length() != 0) {
                                            collectionD1 = CollectionsKt.D0(listI, listIterator.nextIndex() + 1);
                                        }
                                    }
                                }
                                String[] strArr = (String[]) collectionD1.toArray(new String[0]);
                                if (strArr.length != 0) {
                                    strQ0 = Pattern.compile("(\\d*)\\s*-\\s*(\\d*)").matcher((String) tx3.O(strArr)).matches() ? (String) tx3.O(strArr) : qzb.q0(d0tVar, false);
                                }
                            }
                        } else if (j == 66) {
                            strQ0 = qzb.q0(d0tVar, false);
                        } else if (str.length() > 0) {
                            List listI2 = new Regex(Separators.COMMA).i(str);
                            if (listI2.isEmpty()) {
                                collectionD0 = iun.f15405a;
                            } else {
                                ListIterator listIterator2 = listI2.listIterator(listI2.size());
                                while (true) {
                                    if (!listIterator2.hasPrevious()) {
                                        collectionD0 = iun.f15405a;
                                    } else if (((String) listIterator2.previous()).length() != 0) {
                                        collectionD0 = CollectionsKt.D0(listI2, listIterator2.nextIndex() + 1);
                                    }
                                }
                            }
                            String[] strArr2 = (String[]) collectionD0.toArray(new String[0]);
                            if (strArr2.length != 0) {
                                strQ0 = Pattern.compile("(\\d*)\\s*-\\s*(\\d*)").matcher((String) tx3.O(strArr2)).matches() ? (String) tx3.O(strArr2) : qzb.q0(d0tVar, false);
                            }
                        }
                        if (strQ0.length() == 0) {
                            strQ0 = "VS";
                        }
                        if (strQ0.length() > 7) {
                            z = false;
                            strQ0 = kotlin.text.c.u(strQ0, "-", "-\n", false);
                        } else {
                            z = false;
                        }
                        arrayList.add(new xdv0(jI0, j, j2, lValueOf, z2, j3, str3, j4, unp0Var, unp0Var2, strQ0, d0tVar.E, Long.valueOf(d0tVar.s)));
                        it = it2;
                    }
                    List listA0 = CollectionsKt.A0(arrayList, new s7f((byte) 17));
                    po3Var.j = 1;
                    if (kmqVar.a(listA0, po3Var) == wneVar) {
                        return wneVar;
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
                p50 p50Var = p50.g;
                p50 p50Var2 = p50.h;
                if (yjeVar instanceof rr3) {
                    rr3Var = (rr3) yjeVar;
                    int i5 = rr3Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rr3Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        rr3Var = new rr3(this, yjeVar);
                    }
                } else {
                    rr3Var = new rr3(this, yjeVar);
                }
                Object obj4 = rr3Var.i;
                wne wneVar2 = wne.f39444a;
                int i6 = rr3Var.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    List list2 = ((jjv0) obj).f16636a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : list2) {
                        if (obj5 instanceof tmv) {
                            arrayList2.add(obj5);
                        }
                    }
                    tmv tmvVar = (tmv) CollectionsKt.firstOrNull(arrayList2);
                    if (tmvVar != null) {
                        m60 m60Var = tmvVar.c;
                        drq drqVar = drq.c;
                        drq drqVar2 = drq.d;
                        m60 m60Var2 = m60.g;
                        tq8 tq8Var = tmvVar.f34213a;
                        brq brqVar = (m60Var == m60.f || m60Var != m60Var2) ? brq.f3090a : brq.b;
                        p50 p50Var3 = tq8Var.b() > tq8Var.a() ? p50Var2 : p50Var;
                        wxv wxvVar = p50Var3 != p50Var2 ? p50Var3 != p50Var ? wxv.b : wxv.b : wxv.f39948a;
                        y60 y60Var = tmvVar.b;
                        boolean z3 = y60Var == y60.g || (y60Var == y60.f && m60Var == m60Var2);
                        drq drqVar3 = (tq8Var.b() == 0 || tq8Var.a() == 0) ? drqVar : drqVar2;
                        le60 le60Var = (drqVar3 == drqVar || drqVar3 != drqVar2) ? le60.f19885a : le60.b;
                        erqVar = new erq(brqVar, wxvVar, z3, le60Var, new wqq(tq8Var.c().left, tq8Var.c().top, tq8Var.c().right, tq8Var.c().bottom));
                    } else {
                        erqVar = null;
                    }
                    rr3Var.j = 1;
                    if (kmqVar.a(erqVar, rr3Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof ms3) {
                    ms3Var = (ms3) yjeVar;
                    int i7 = ms3Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ms3Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        ms3Var = new ms3(this, yjeVar);
                    }
                } else {
                    ms3Var = new ms3(this, yjeVar);
                }
                Object obj6 = ms3Var.i;
                wne wneVar3 = wne.f39444a;
                int i8 = ms3Var.j;
                if (i8 == 0) {
                    z1x.P(obj6);
                    if (!((Boolean) obj).booleanValue()) {
                        ms3Var.j = 1;
                        if (kmqVar.a(obj, ms3Var) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof wu3) {
                    wu3Var = (wu3) yjeVar;
                    int i9 = wu3Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        wu3Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        wu3Var = new wu3(this, yjeVar);
                    }
                } else {
                    wu3Var = new wu3(this, yjeVar);
                }
                Object obj7 = wu3Var.i;
                wne wneVar4 = wne.f39444a;
                int i10 = wu3Var.j;
                if (i10 == 0) {
                    z1x.P(obj7);
                    mjj mjjVar = (mjj) obj;
                    mjjVar.getClass();
                    kjj kjjVar = new kjj(mjjVar.f21897a, dyb.o0(mjjVar.b));
                    wu3Var.j = 1;
                    if (kmqVar.a(kjjVar, wu3Var) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof j64) {
                    j64Var = (j64) yjeVar;
                    int i11 = j64Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        j64Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        j64Var = new j64(this, yjeVar);
                    }
                } else {
                    j64Var = new j64(this, yjeVar);
                }
                Object obj8 = j64Var.i;
                wne wneVar5 = wne.f39444a;
                int i12 = j64Var.j;
                if (i12 == 0) {
                    z1x.P(obj8);
                    if (!(((e64) obj) instanceof d64)) {
                        j64Var.j = 1;
                        if (kmqVar.a(obj, j64Var) == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof ec4) {
                    ec4Var = (ec4) yjeVar;
                    int i13 = ec4Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        ec4Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        ec4Var = new ec4(this, yjeVar);
                    }
                } else {
                    ec4Var = new ec4(this, yjeVar);
                }
                Object obj9 = ec4Var.i;
                wne wneVar6 = wne.f39444a;
                int i14 = ec4Var.j;
                if (i14 == 0) {
                    z1x.P(obj9);
                    if (obj instanceof mm4) {
                        ec4Var.j = 1;
                        if (kmqVar.a(obj, ec4Var) == wneVar6) {
                            return wneVar6;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof ah4) {
                    ah4Var = (ah4) yjeVar;
                    int i15 = ah4Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        ah4Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        ah4Var = new ah4(this, yjeVar);
                    }
                } else {
                    ah4Var = new ah4(this, yjeVar);
                }
                Object obj10 = ah4Var.i;
                wne wneVar7 = wne.f39444a;
                int i16 = ah4Var.j;
                if (i16 == 0) {
                    z1x.P(obj10);
                    if (obj instanceof mm4) {
                        ah4Var.j = 1;
                        if (kmqVar.a(obj, ah4Var) == wneVar7) {
                            return wneVar7;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof ek4) {
                    ek4Var = (ek4) yjeVar;
                    int i17 = ek4Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ek4Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        ek4Var = new ek4(this, yjeVar);
                    }
                } else {
                    ek4Var = new ek4(this, yjeVar);
                }
                Object obj11 = ek4Var.i;
                wne wneVar8 = wne.f39444a;
                int i18 = ek4Var.j;
                if (i18 == 0) {
                    z1x.P(obj11);
                    if (obj instanceof mm4) {
                        ek4Var.j = 1;
                        if (kmqVar.a(obj, ek4Var) == wneVar8) {
                            return wneVar8;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof gl4) {
                    gl4Var = (gl4) yjeVar;
                    int i19 = gl4Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        gl4Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        gl4Var = new gl4(this, yjeVar);
                    }
                } else {
                    gl4Var = new gl4(this, yjeVar);
                }
                Object obj12 = gl4Var.i;
                wne wneVar9 = wne.f39444a;
                int i20 = gl4Var.j;
                if (i20 == 0) {
                    z1x.P(obj12);
                    if (((cl4) obj).f4538a != null) {
                        gl4Var.j = 1;
                        if (kmqVar.a(obj, gl4Var) == wneVar9) {
                            return wneVar9;
                        }
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof is4) {
                    is4Var = (is4) yjeVar;
                    int i21 = is4Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        is4Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        is4Var = new is4(this, yjeVar);
                    }
                } else {
                    is4Var = new is4(this, yjeVar);
                }
                Object obj13 = is4Var.i;
                wne wneVar10 = wne.f39444a;
                int i22 = is4Var.j;
                if (i22 == 0) {
                    z1x.P(obj13);
                    ikk0 ikk0Var = (ikk0) obj;
                    ikk0Var.getClass();
                    hkk0 hkk0Var = ikk0Var.d;
                    String str4 = hkk0Var != null ? hkk0Var.f13214a : null;
                    String str5 = str4 == null ? "" : str4;
                    String str6 = hkk0Var != null ? hkk0Var.b : null;
                    String str7 = str6 == null ? "" : str6;
                    String str8 = hkk0Var != null ? hkk0Var.c : null;
                    String str9 = str8 == null ? "" : str8;
                    int iIntValue = (hkk0Var == null || (num2 = hkk0Var.d) == null) ? 0 : num2.intValue();
                    zie0 zie0Var = kkk0.f18445a;
                    String str10 = ikk0Var.c;
                    if (str10 == null) {
                        str10 = "";
                    }
                    zie0Var.getClass();
                    if (StringsKt.O(str10, "passwordrepairrequestcreated", false)) {
                        kkk0Var = kkk0.c;
                    } else if (StringsKt.O(str10, "operationapprovalconfirmed", false)) {
                        kkk0Var = kkk0.d;
                    } else if (StringsKt.O(str10, "operationapprovaldeclined", false)) {
                        kkk0Var = kkk0.e;
                    } else if (StringsKt.O(str10, "pushwasresent", false)) {
                        kkk0Var = kkk0.h;
                    } else if (StringsKt.O(str10, "operationapprovalcreationfailed", false)) {
                        kkk0Var = kkk0.g;
                    } else if (StringsKt.O(str10, "newplaceauthrequestfailed", false)) {
                        kkk0Var = kkk0.k;
                    } else if (StringsKt.O(str10, "passwordrepairrequestfailed", false)) {
                        kkk0Var = kkk0.j;
                    } else if (StringsKt.O(str10, "operationapprovalcreated", false) || StringsKt.O(str10, "newplaceauthrequestcreated", false)) {
                        kkk0Var = kkk0.f;
                    } else {
                        bkk0[] bkk0VarArr = bkk0.f2753a;
                        kkk0Var = str10.equals("http://company.com/Feeds/System/AuthResponse.json?v=2") ? kkk0.i : kkk0.b;
                    }
                    kkk0 kkk0Var2 = kkk0Var;
                    if (hkk0Var == null || (num = hkk0Var.f) == null) {
                        lkk0Var = lkk0.Unknown;
                    } else {
                        int iIntValue2 = num.intValue();
                        lkk0.b.getClass();
                        lkk0[] lkk0VarArrValues = lkk0.values();
                        int length = lkk0VarArrValues.length;
                        while (true) {
                            if (i < length) {
                                lkk0Var = lkk0VarArrValues[i];
                                if (lkk0Var.f20205a != iIntValue2) {
                                    i++;
                                }
                            } else {
                                lkk0Var = null;
                            }
                        }
                        if (lkk0Var == null) {
                            lkk0Var = lkk0.Unknown;
                        }
                    }
                    String str11 = hkk0Var != null ? hkk0Var.e : null;
                    jkk0 jkk0Var = new jkk0(str5, str7, str9, iIntValue, kkk0Var2, lkk0Var, str11 == null ? "" : str11);
                    is4Var.j = 1;
                    if (kmqVar.a(jkk0Var, is4Var) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof dt4) {
                    dt4Var = (dt4) yjeVar;
                    int i23 = dt4Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        dt4Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        dt4Var = new dt4(this, yjeVar);
                    }
                } else {
                    dt4Var = new dt4(this, yjeVar);
                }
                Object obj14 = dt4Var.i;
                wne wneVar11 = wne.f39444a;
                int i24 = dt4Var.j;
                if (i24 == 0) {
                    z1x.P(obj14);
                    if (obj instanceof ikk0) {
                        dt4Var.j = 1;
                        if (kmqVar.a(obj, dt4Var) == wneVar11) {
                            return wneVar11;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj14);
                }
                return Unit.f46060a;
            case 11:
                if (yjeVar instanceof du4) {
                    du4Var = (du4) yjeVar;
                    int i25 = du4Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        du4Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        du4Var = new du4(this, yjeVar);
                    }
                } else {
                    du4Var = new du4(this, yjeVar);
                }
                Object obj15 = du4Var.i;
                wne wneVar12 = wne.f39444a;
                int i26 = du4Var.j;
                if (i26 == 0) {
                    z1x.P(obj15);
                    if (((Boolean) obj).booleanValue()) {
                        du4Var.j = 1;
                        if (kmqVar.a(obj, du4Var) == wneVar12) {
                            return wneVar12;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj15);
                }
                return Unit.f46060a;
            case 12:
                if (yjeVar instanceof vu5) {
                    vu5Var = (vu5) yjeVar;
                    int i27 = vu5Var.j;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        vu5Var.j = i27 - Integer.MIN_VALUE;
                    } else {
                        vu5Var = new vu5(this, yjeVar);
                    }
                } else {
                    vu5Var = new vu5(this, yjeVar);
                }
                Object obj16 = vu5Var.i;
                wne wneVar13 = wne.f39444a;
                int i28 = vu5Var.j;
                if (i28 == 0) {
                    z1x.P(obj16);
                    if (!(((pu5) obj) instanceof nu5)) {
                        vu5Var.j = 1;
                        if (kmqVar.a(obj, vu5Var) == wneVar13) {
                            return wneVar13;
                        }
                    }
                } else {
                    if (i28 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj16);
                }
                return Unit.f46060a;
            case 13:
                if (yjeVar instanceof m36) {
                    m36Var = (m36) yjeVar;
                    int i29 = m36Var.j;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        m36Var.j = i29 - Integer.MIN_VALUE;
                    } else {
                        m36Var = new m36(this, yjeVar);
                    }
                } else {
                    m36Var = new m36(this, yjeVar);
                }
                Object obj17 = m36Var.i;
                wne wneVar14 = wne.f39444a;
                int i30 = m36Var.j;
                if (i30 == 0) {
                    z1x.P(obj17);
                    List list3 = (List) obj;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                    Iterator it5 = list3.iterator();
                    while (it5.hasNext()) {
                        d0t d0tVar2 = (d0t) it5.next();
                        d0tVar2.getClass();
                        long j6 = d0tVar2.f5282a;
                        f0t f0tVar3 = d0tVar2.r;
                        f0t f0tVar4 = d0tVar2.q;
                        long j7 = d0tVar2.v;
                        long j8 = d0tVar2.u;
                        boolean z4 = d0tVar2.C;
                        String strA1 = d0tVar2.o;
                        if (strA1.length() <= 0) {
                            strA1 = null;
                        }
                        if (strA1 == null) {
                            strA1 = sj3.a0(d0tVar2);
                        }
                        arrayList3.add(new xdv0(j6, j7, j8, null, z4, j7, strA1, d0tVar2.n, new unp0(f0tVar4.f8731a, qzb.c0(d0tVar2), f0tVar4.d), new unp0(f0tVar3.f8731a, qzb.r0(d0tVar2), f0tVar3.d), "VS", d0tVar2.E, Long.valueOf(d0tVar2.s)));
                        it5 = it5;
                        i2 = 1;
                    }
                    m36Var.j = i2;
                    if (kmqVar.a(arrayList3, m36Var) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (i30 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj17);
                }
                return Unit.f46060a;
            case 14:
                if (yjeVar instanceof u36) {
                    u36Var = (u36) yjeVar;
                    int i31 = u36Var.j;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        u36Var.j = i31 - Integer.MIN_VALUE;
                    } else {
                        u36Var = new u36(this, yjeVar);
                    }
                } else {
                    u36Var = new u36(this, yjeVar);
                }
                Object obj18 = u36Var.i;
                wne wneVar15 = wne.f39444a;
                int i32 = u36Var.j;
                if (i32 == 0) {
                    z1x.P(obj18);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj19 : (List) obj) {
                        if (((d0t) obj19).C) {
                            arrayList4.add(obj19);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                    Iterator it6 = arrayList4.iterator();
                    while (it6.hasNext()) {
                        arrayList5.add(mym0.r((d0t) it6.next()));
                    }
                    u36Var.j = 1;
                    if (kmqVar.a(arrayList5, u36Var) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (i32 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj18);
                }
                return Unit.f46060a;
            case 15:
                if (yjeVar instanceof wj6) {
                    wj6Var = (wj6) yjeVar;
                    int i33 = wj6Var.j;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        wj6Var.j = i33 - Integer.MIN_VALUE;
                    } else {
                        wj6Var = new wj6(this, yjeVar);
                    }
                } else {
                    wj6Var = new wj6(this, yjeVar);
                }
                Object obj20 = wj6Var.i;
                wne wneVar16 = wne.f39444a;
                int i34 = wj6Var.j;
                if (i34 == 0) {
                    z1x.P(obj20);
                    Boolean boolValueOf = Boolean.valueOf(((l9s) obj).e());
                    wj6Var.j = 1;
                    if (kmqVar.a(boolValueOf, wj6Var) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (i34 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj20);
                }
                return Unit.f46060a;
            case 16:
                if (yjeVar instanceof dv6) {
                    dv6Var = (dv6) yjeVar;
                    int i35 = dv6Var.j;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        dv6Var.j = i35 - Integer.MIN_VALUE;
                    } else {
                        dv6Var = new dv6(this, yjeVar);
                    }
                } else {
                    dv6Var = new dv6(this, yjeVar);
                }
                Object obj21 = dv6Var.i;
                wne wneVar17 = wne.f39444a;
                int i36 = dv6Var.j;
                if (i36 == 0) {
                    z1x.P(obj21);
                    List list4 = (List) obj;
                    ArrayList arrayList6 = new ArrayList(r3d.q(list4, 10));
                    Iterator it7 = list4.iterator();
                    while (it7.hasNext()) {
                        arrayList6.add(oja0.a0((pu6) it7.next()));
                    }
                    dv6Var.j = 1;
                    if (kmqVar.a(arrayList6, dv6Var) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (i36 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj21);
                }
                return Unit.f46060a;
            case 17:
                if (yjeVar instanceof v87) {
                    v87Var = (v87) yjeVar;
                    int i37 = v87Var.j;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        v87Var.j = i37 - Integer.MIN_VALUE;
                    } else {
                        v87Var = new v87(this, yjeVar);
                    }
                } else {
                    v87Var = new v87(this, yjeVar);
                }
                Object obj22 = v87Var.i;
                wne wneVar18 = wne.f39444a;
                int i38 = v87Var.j;
                if (i38 == 0) {
                    z1x.P(obj22);
                    if (obj instanceof za50) {
                        v87Var.j = 1;
                        if (kmqVar.a(obj, v87Var) == wneVar18) {
                            return wneVar18;
                        }
                    }
                } else {
                    if (i38 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj22);
                }
                return Unit.f46060a;
            case 18:
                if (yjeVar instanceof e29) {
                    e29Var = (e29) yjeVar;
                    int i39 = e29Var.j;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        e29Var.j = i39 - Integer.MIN_VALUE;
                    } else {
                        e29Var = new e29(this, yjeVar);
                    }
                } else {
                    e29Var = new e29(this, yjeVar);
                }
                Object obj23 = e29Var.i;
                wne wneVar19 = wne.f39444a;
                int i40 = e29Var.j;
                if (i40 == 0) {
                    z1x.P(obj23);
                    List list5 = (List) obj;
                    ArrayList arrayList7 = new ArrayList(r3d.q(list5, 10));
                    Iterator it8 = list5.iterator();
                    while (it8.hasNext()) {
                        arrayList7.add(hew0.W((uvc) it8.next()));
                    }
                    e29Var.j = 1;
                    if (kmqVar.a(arrayList7, e29Var) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (i40 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj23);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (yjeVar instanceof g29) {
                    g29Var = (g29) yjeVar;
                    int i41 = g29Var.j;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        g29Var.j = i41 - Integer.MIN_VALUE;
                    } else {
                        g29Var = new g29(this, yjeVar);
                    }
                } else {
                    g29Var = new g29(this, yjeVar);
                }
                Object obj24 = g29Var.i;
                wne wneVar20 = wne.f39444a;
                int i42 = g29Var.j;
                if (i42 == 0) {
                    z1x.P(obj24);
                    List list6 = (List) obj;
                    ArrayList arrayList8 = new ArrayList(r3d.q(list6, 10));
                    Iterator it9 = list6.iterator();
                    while (it9.hasNext()) {
                        arrayList8.add(hew0.V((kr5) it9.next()));
                    }
                    g29Var.j = 1;
                    if (kmqVar.a(arrayList8, g29Var) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (i42 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj24);
                }
                return Unit.f46060a;
            case 20:
                if (yjeVar instanceof j69) {
                    j69Var = (j69) yjeVar;
                    int i43 = j69Var.j;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        j69Var.j = i43 - Integer.MIN_VALUE;
                    } else {
                        j69Var = new j69(this, yjeVar);
                    }
                } else {
                    j69Var = new j69(this, yjeVar);
                }
                Object obj25 = j69Var.i;
                wne wneVar21 = wne.f39444a;
                int i44 = j69Var.j;
                if (i44 == 0) {
                    z1x.P(obj25);
                    if (((Boolean) obj).booleanValue()) {
                        j69Var.j = 1;
                        if (kmqVar.a(obj, j69Var) == wneVar21) {
                            return wneVar21;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj25);
                }
                return Unit.f46060a;
            case 21:
                if (yjeVar instanceof h89) {
                    h89Var = (h89) yjeVar;
                    int i45 = h89Var.j;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        h89Var.j = i45 - Integer.MIN_VALUE;
                    } else {
                        h89Var = new h89(this, yjeVar);
                    }
                } else {
                    h89Var = new h89(this, yjeVar);
                }
                Object obj26 = h89Var.i;
                wne wneVar22 = wne.f39444a;
                int i46 = h89Var.j;
                if (i46 == 0) {
                    z1x.P(obj26);
                    b89 b89Var = (b89) obj;
                    b89Var.getClass();
                    boolean z5 = b89Var.i;
                    int i47 = b89Var.c;
                    boolean z6 = b89Var.j;
                    if (z5) {
                        d89Var = new c89(z6);
                    } else if (b89Var.h || !b89Var.f) {
                        Locale locale = Locale.ENGLISH;
                        Long lValueOf2 = Long.valueOf(b89Var.b);
                        Integer numValueOf = Integer.valueOf(i47);
                        String upperCase = b89Var.k.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        d89Var = new d89(String.format(locale, "javascript:startGameZone(%d, \"%d\", \"%s\")", Arrays.copyOf(new Object[]{lValueOf2, numValueOf, upperCase}, 3)), String.format(locale, "javascript:changeViewZone(\"%d\")", Arrays.copyOf(new Object[]{Integer.valueOf(i47)}, 1)), b89Var.f, b89Var.j, b89Var.l, b89Var.m);
                    } else {
                        d89Var = new e89(b89Var.e, z6);
                    }
                    h89Var.j = 1;
                    if (kmqVar.a(d89Var, h89Var) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (i46 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj26);
                }
                return Unit.f46060a;
            case 22:
                if (yjeVar instanceof jj9) {
                    jj9Var = (jj9) yjeVar;
                    int i48 = jj9Var.j;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        jj9Var.j = i48 - Integer.MIN_VALUE;
                    } else {
                        jj9Var = new jj9(this, yjeVar);
                    }
                } else {
                    jj9Var = new jj9(this, yjeVar);
                }
                Object obj27 = jj9Var.i;
                wne wneVar23 = wne.f39444a;
                int i49 = jj9Var.j;
                if (i49 == 0) {
                    z1x.P(obj27);
                    if (obj instanceof gj9) {
                        jj9Var.j = 1;
                        if (kmqVar.a(obj, jj9Var) == wneVar23) {
                            return wneVar23;
                        }
                    }
                } else {
                    if (i49 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj27);
                }
                return Unit.f46060a;
            case 23:
                if (yjeVar instanceof lj9) {
                    lj9Var = (lj9) yjeVar;
                    int i50 = lj9Var.j;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        lj9Var.j = i50 - Integer.MIN_VALUE;
                    } else {
                        lj9Var = new lj9(this, yjeVar);
                    }
                } else {
                    lj9Var = new lj9(this, yjeVar);
                }
                Object obj28 = lj9Var.i;
                wne wneVar24 = wne.f39444a;
                int i51 = lj9Var.j;
                if (i51 == 0) {
                    z1x.P(obj28);
                    List list7 = ((gj9) obj).f11385a;
                    lj9Var.j = 1;
                    if (kmqVar.a(list7, lj9Var) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (i51 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj28);
                }
                return Unit.f46060a;
            case 24:
                return b(yjeVar, obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return c(yjeVar, obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return d(yjeVar, obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return e(yjeVar, obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return f(yjeVar, obj);
            default:
                if (yjeVar instanceof ksa) {
                    ksaVar = (ksa) yjeVar;
                    int i52 = ksaVar.j;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        ksaVar.j = i52 - Integer.MIN_VALUE;
                    } else {
                        ksaVar = new ksa(this, yjeVar);
                    }
                } else {
                    ksaVar = new ksa(this, yjeVar);
                }
                Object obj29 = ksaVar.i;
                wne wneVar25 = wne.f39444a;
                int i53 = ksaVar.j;
                if (i53 == 0) {
                    z1x.P(obj29);
                    Integer num3 = new Integer(((List) obj).size());
                    ksaVar.j = 1;
                    if (kmqVar.a(num3, ksaVar) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (i53 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj29);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ qo3(kmq kmqVar, byte b) {
        this.f29052a = b;
        this.b = kmqVar;
    }
}
