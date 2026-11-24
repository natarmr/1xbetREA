package a;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gb8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11004a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gb8(int i, List list, w6k w6kVar, int i2, HashMap map, boolean z, sso0 sso0Var) {
        this.b = i;
        this.f = list;
        this.d = w6kVar;
        this.c = i2;
        this.g = map;
        this.e = z;
        this.h = sso0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Integer numValueOf;
        long j;
        long jB;
        int i;
        ArrayList arrayList;
        boolean z;
        byte b = this.f11004a;
        int i2 = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.d;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dj8.l(this.b, (List) obj6, (String) obj5, (String) obj4, (cb8) obj3, this.e, (fet) obj, x8x.L(i2 | 1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                feb.H((mm40) obj6, (d280) obj4, this.b, this.c, (String) obj5, (j83) obj3, (fet) obj, x8x.L(1), this.e ? 1 : 0);
                return Unit.f46060a;
            case 2:
                List list = (List) obj6;
                w6k w6kVar = (w6k) obj5;
                sso0 sso0Var = (sso0) obj3;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                final int i3 = p4e.i(p4eVar.f26347a);
                long jB2 = p4e.b(p4eVar.f26347a, 0, 0, 0, Integer.MAX_VALUE, 2);
                boolean z2 = this.e;
                c6n c6nVar = new c6n((HashMap) obj4, z2, c5n0Var, jB2, sso0Var);
                List listK = c5n0Var.k("ALL_TAGS_MEASURE", new ugd(1733387148, true, new d0n((Object) list, (Object) sso0Var, (byte) 15)));
                ArrayList arrayList2 = new ArrayList(r3d.q(listK, 10));
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((pj30) it.next()).S(jB2).f27604a));
                }
                final int i4 = this.b;
                ArrayList arrayList3 = f7k.B(i3, i4, 0, arrayList2).f13404a;
                int size = arrayList3.size();
                mie0 mie0Var = new mie0();
                mie0Var.f21842a = f7k.B(i3, i4, size, arrayList2).f13404a;
                kie0 kie0Var = new kie0();
                int size2 = list.size() - (((List) mie0Var.f21842a).size() + arrayList3.size());
                kie0Var.f18333a = size2 < 0 ? 0 : size2;
                int i5 = 0;
                boolean z3 = false;
                while (i5 < 3) {
                    int i6 = kie0Var.f18333a;
                    if (i6 > 0) {
                        int iIntValue = i3 - ((Number) c6nVar.invoke(Integer.valueOf(i6))).intValue();
                        int i7 = iIntValue - i4;
                        ArrayList arrayList4 = f7k.B(i7 < 0 ? 0 : i7, i4, size, arrayList2).f13404a;
                        if (!arrayList4.isEmpty() || size >= arrayList2.size()) {
                            arrayList = arrayList4;
                        } else {
                            arrayList = f7k.B(iIntValue < 0 ? 0 : iIntValue, i4, size, arrayList2).f13404a;
                        }
                        i = i5;
                        if (!arrayList.isEmpty() || size >= arrayList2.size()) {
                            mie0Var.f21842a = arrayList;
                            z = false;
                        } else {
                            mie0Var.f21842a = kotlin.collections.a.c(Integer.valueOf(size));
                            z = true;
                        }
                        z3 = z;
                        int size3 = list.size() - (((List) mie0Var.f21842a).size() + arrayList3.size());
                        if (size3 < 0) {
                            size3 = 0;
                        }
                        if (size3 != kie0Var.f18333a) {
                            kie0Var.f18333a = size3;
                        }
                    } else {
                        i = i5;
                    }
                    i5 = i + 1;
                }
                List listK2 = c5n0Var.k("FIRST_LINE", new ugd(-1595441905, true, new d8m((Object) arrayList3, (Object) list, (Object) sso0Var, (byte) 21)));
                final ArrayList arrayList5 = new ArrayList(r3d.q(listK2, 10));
                Iterator it2 = listK2.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((pj30) it2.next()).S(jB2));
                }
                int i8 = kie0Var.f18333a;
                int iIntValue2 = (i3 - (i8 > 0 ? ((Number) c6nVar.invoke(Integer.valueOf(i8))).intValue() : 0)) - i4;
                int i9 = iIntValue2 < 0 ? 0 : iIntValue2;
                List listK3 = c5n0Var.k("SECOND_LINE", new ugd(-1691423368, true, new ip0(mie0Var, kie0Var, z2, sso0Var, list)));
                final ArrayList arrayList6 = new ArrayList(r3d.q(listK3, 10));
                Iterator it3 = listK3.iterator();
                int i10 = 0;
                while (true) {
                    Integer num = null;
                    if (!it3.hasNext()) {
                        Iterator it4 = arrayList5.iterator();
                        if (it4.hasNext()) {
                            numValueOf = Integer.valueOf(((pu90) it4.next()).b);
                            while (it4.hasNext()) {
                                Integer numValueOf2 = Integer.valueOf(((pu90) it4.next()).b);
                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                    numValueOf = numValueOf2;
                                }
                            }
                        } else {
                            numValueOf = null;
                        }
                        final int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
                        Iterator it5 = arrayList6.iterator();
                        if (it5.hasNext()) {
                            Integer numValueOf3 = Integer.valueOf(((pu90) it5.next()).b);
                            while (true) {
                                num = numValueOf3;
                                while (true) {
                                    if (it5.hasNext()) {
                                        numValueOf3 = Integer.valueOf(((pu90) it5.next()).b);
                                        if (num.compareTo(numValueOf3) < 0) {
                                        }
                                    }
                                }
                            }
                        }
                        int iIntValue4 = num != null ? num.intValue() : 0;
                        boolean zIsEmpty = arrayList6.isEmpty();
                        final boolean z4 = !zIsEmpty;
                        zcl zclVar = qmk.f28987a;
                        final int iT = w6kVar.T(zIsEmpty ? 16.0f : 12.0f);
                        final int i11 = this.c;
                        return vj30.x(c5n0Var, i3, r4e.f((iT * 2) + iIntValue3 + (!zIsEmpty ? iIntValue4 + i11 : 0), p4eVar.f26347a), new Function1() { // from class: a.d6n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i12;
                                int i13;
                                ou90 ou90Var = (ou90) obj7;
                                ou90Var.getClass();
                                ArrayList arrayList7 = arrayList5;
                                int size4 = arrayList7.size() - 1;
                                int i14 = i3;
                                int i15 = i14;
                                while (true) {
                                    i12 = iT;
                                    i13 = i4;
                                    if (-1 >= size4) {
                                        break;
                                    }
                                    pu90 pu90Var = (pu90) arrayList7.get(size4);
                                    i15 -= pu90Var.f27604a;
                                    ou90Var.m(pu90Var, i15, i12, 0.0f);
                                    if (size4 != 0) {
                                        i15 -= i13;
                                    }
                                    size4--;
                                }
                                if (z4) {
                                    int i16 = iIntValue3 + i11 + i12;
                                    ArrayList arrayList8 = arrayList6;
                                    for (int size5 = arrayList8.size() - 1; -1 < size5; size5--) {
                                        pu90 pu90Var2 = (pu90) arrayList8.get(size5);
                                        i14 -= pu90Var2.f27604a;
                                        ou90Var.m(pu90Var2, i14, i16, 0.0f);
                                        if (size5 != 0) {
                                            i14 -= i13;
                                        }
                                    }
                                }
                                return Unit.f46060a;
                            }
                        });
                    }
                    Object next = it3.next();
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pj30 pj30Var = (pj30) next;
                    if (z3 && kie0Var.f18333a > 0 && ((List) mie0Var.f21842a).size() == 1 && i10 == 0) {
                        j = jB2;
                        jB = p4e.b(j, 0, i9, 0, 0, 13);
                    } else {
                        j = jB2;
                        jB = j;
                    }
                    arrayList6.add(pj30Var.S(jB));
                    i10 = i12;
                    jB2 = j;
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                qxw.m((Fragment) obj6, (RuleData) obj5, (mm40) obj4, this.b, (Integer) obj3, this.e, (fet) obj, x8x.L(i2 | 1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                l8x.e((u1m) obj6, this.b, (yb) obj5, this.e, (mm40) obj4, (Function1) obj3, (fet) obj, x8x.L(i2 | 1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                l8x.j((mm40) obj6, (ope) obj5, this.b, (zb) obj4, this.e, (Function1) obj3, (fet) obj, x8x.L(i2 | 1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ gb8(int i, List list, String str, String str2, cb8 cb8Var, boolean z, int i2) {
        this.b = i;
        this.f = list;
        this.d = str;
        this.g = str2;
        this.h = cb8Var;
        this.e = z;
        this.c = i2;
    }

    public /* synthetic */ gb8(u1m u1mVar, int i, yb ybVar, boolean z, mm40 mm40Var, Function1 function1, int i2) {
        this.f = u1mVar;
        this.b = i;
        this.d = ybVar;
        this.e = z;
        this.g = mm40Var;
        this.h = function1;
        this.c = i2;
    }

    public /* synthetic */ gb8(mm40 mm40Var, ope opeVar, int i, zb zbVar, boolean z, Function1 function1, int i2) {
        this.f = mm40Var;
        this.d = opeVar;
        this.b = i;
        this.g = zbVar;
        this.e = z;
        this.h = function1;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gb8(mm40 mm40Var, d280 d280Var, int i, int i2, String str, j83 j83Var, int i3, int i4) {
        this.f = mm40Var;
        this.g = d280Var;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.h = j83Var;
        this.e = i4;
    }

    public /* synthetic */ gb8(Fragment fragment, RuleData ruleData, mm40 mm40Var, int i, Integer num, boolean z, int i2) {
        this.f = fragment;
        this.d = ruleData;
        this.g = mm40Var;
        this.b = i;
        this.h = num;
        this.e = z;
        this.c = i2;
    }
}
