package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ofv0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25187a;
    public final /* synthetic */ kmq b;

    public /* synthetic */ ofv0(kmq kmqVar, byte b) {
        this.f25187a = b;
        this.b = kmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:137:0x0247  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:91:0x015e  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        nfv0 nfv0Var;
        jgv0 jgv0Var;
        qpv0 qpv0Var;
        ivv0 ivv0Var;
        wyv0 wyv0Var;
        lzv0 lzv0Var;
        pzv0 pzv0Var;
        v6w0 v6w0Var;
        byte b = this.f25187a;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof nfv0) {
                    nfv0Var = (nfv0) yjeVar;
                    int i = nfv0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nfv0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        nfv0Var = new nfv0(this, yjeVar);
                    }
                } else {
                    nfv0Var = new nfv0(this, yjeVar);
                }
                Object obj2 = nfv0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = nfv0Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    if (((Number) obj).longValue() > 0) {
                        nfv0Var.j = 1;
                        if (kmqVar.a(obj, nfv0Var) == wneVar) {
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
                if (yjeVar instanceof jgv0) {
                    jgv0Var = (jgv0) yjeVar;
                    int i3 = jgv0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jgv0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        jgv0Var = new jgv0(this, yjeVar);
                    }
                } else {
                    jgv0Var = new jgv0(this, yjeVar);
                }
                Object obj3 = jgv0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = jgv0Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    Pair pair = (Pair) obj;
                    List list = (List) pair.f46059a;
                    String str = (String) pair.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        pbv pbvVar = (pbv) obj4;
                        String str2 = pbvVar.c;
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        String lowerCase = str2.toLowerCase(locale);
                        lowerCase.getClass();
                        Locale locale2 = Locale.getDefault();
                        locale2.getClass();
                        String lowerCase2 = str.toLowerCase(locale2);
                        lowerCase2.getClass();
                        boolean zO = StringsKt.O(lowerCase, lowerCase2, false);
                        if (str.length() == 0 || zO) {
                            if (pbvVar.q) {
                                arrayList.add(obj4);
                            }
                        }
                    }
                    jgv0Var.j = 1;
                    if (kmqVar.a(arrayList, jgv0Var) == wneVar2) {
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
                if (yjeVar instanceof qpv0) {
                    qpv0Var = (qpv0) yjeVar;
                    int i5 = qpv0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qpv0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        qpv0Var = new qpv0(this, yjeVar);
                    }
                } else {
                    qpv0Var = new qpv0(this, yjeVar);
                }
                Object obj5 = qpv0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = qpv0Var.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    List list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((opv0) it.next()).a());
                    }
                    qpv0Var.j = 1;
                    if (kmqVar.a(arrayList2, qpv0Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof ivv0) {
                    ivv0Var = (ivv0) yjeVar;
                    int i7 = ivv0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        ivv0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        ivv0Var = new ivv0(this, yjeVar);
                    }
                } else {
                    ivv0Var = new ivv0(this, yjeVar);
                }
                Object obj6 = ivv0Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = ivv0Var.j;
                if (i8 == 0) {
                    z1x.P(obj6);
                    kvv0 kvv0Var = ((gvv0) obj).c;
                    ivv0Var.j = 1;
                    if (kmqVar.a(kvv0Var, ivv0Var) == wneVar4) {
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
                if (yjeVar instanceof wyv0) {
                    wyv0Var = (wyv0) yjeVar;
                    int i9 = wyv0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        wyv0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        wyv0Var = new wyv0(this, yjeVar);
                    }
                } else {
                    wyv0Var = new wyv0(this, yjeVar);
                }
                Object obj7 = wyv0Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = wyv0Var.j;
                if (i10 == 0) {
                    z1x.P(obj7);
                    if (((Boolean) obj).booleanValue()) {
                        wyv0Var.j = 1;
                        if (kmqVar.a(obj, wyv0Var) == wneVar5) {
                            return wneVar5;
                        }
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
                if (yjeVar instanceof lzv0) {
                    lzv0Var = (lzv0) yjeVar;
                    int i11 = lzv0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        lzv0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        lzv0Var = new lzv0(this, yjeVar);
                    }
                } else {
                    lzv0Var = new lzv0(this, yjeVar);
                }
                Object obj8 = lzv0Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = lzv0Var.j;
                if (i12 == 0) {
                    z1x.P(obj8);
                    Object obj9 = ((Pair) obj).f46059a;
                    lzv0Var.j = 1;
                    if (kmqVar.a(obj9, lzv0Var) == wneVar6) {
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
                if (yjeVar instanceof pzv0) {
                    pzv0Var = (pzv0) yjeVar;
                    int i13 = pzv0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        pzv0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        pzv0Var = new pzv0(this, yjeVar);
                    }
                } else {
                    pzv0Var = new pzv0(this, yjeVar);
                }
                Object obj10 = pzv0Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = pzv0Var.j;
                if (i14 == 0) {
                    z1x.P(obj10);
                    String lowerCase3 = StringsKt.u0((String) obj).toString().toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    pzv0Var.j = 1;
                    if (kmqVar.a(lowerCase3, pzv0Var) == wneVar7) {
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
            default:
                if (yjeVar instanceof v6w0) {
                    v6w0Var = (v6w0) yjeVar;
                    int i15 = v6w0Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        v6w0Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        v6w0Var = new v6w0(this, yjeVar);
                    }
                } else {
                    v6w0Var = new v6w0(this, yjeVar);
                }
                Object obj11 = v6w0Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = v6w0Var.j;
                if (i16 == 0) {
                    z1x.P(obj11);
                    String str3 = ((iqt0) obj).f15226a;
                    v6w0Var.j = 1;
                    if (kmqVar.a(str3, v6w0Var) == wneVar8) {
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
        }
    }
}
