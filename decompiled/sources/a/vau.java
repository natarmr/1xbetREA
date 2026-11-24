package a;

import android.gov.nist.core.Separators;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.PromotedCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.ProviderUIModel;
import org.xplatform.aggregator.impl.category.presentation.models.SortingOptionUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class vau extends bnn0 implements ydr {
    public /* synthetic */ mi1 i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;
    public final /* synthetic */ long l;
    public final /* synthetic */ qgd m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vau(long j, qgd qgdVar, yje yjeVar) {
        super(4, yjeVar);
        this.l = j;
        this.m = qgdVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object next2;
        String str;
        List list;
        ep0 ep0Var;
        List list2;
        String str2;
        String str3;
        x2q x2qVar;
        w3q w3qVar;
        ArrayList arrayList;
        boolean z;
        String string;
        Parcelable filterUiModel;
        List list3;
        Object obj2;
        List list4;
        Object next3;
        Object obj3;
        List list5;
        Object next4;
        mi1 mi1Var = this.i;
        List list6 = this.j;
        List list7 = this.k;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        qgd qgdVar = this.m;
        pru pruVar = (pru) qgdVar.f;
        int i = 10;
        ArrayList<PromotedCategoryUiModel> arrayList2 = new ArrayList(r3d.q(list7, 10));
        Iterator it = list7.iterator();
        while (it.hasNext()) {
            arrayList2.add(l7x.c0((ezc0) it.next(), cjx.X(pruVar.a().b.s)));
        }
        int i2 = 0;
        if (mi1Var.b.isEmpty()) {
            iun iunVar = iun.f15405a;
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            for (PromotedCategoryUiModel promotedCategoryUiModel : arrayList2) {
                promotedCategoryUiModel.getClass();
                arrayList3.add(PromotedCategoryUiModel.a(promotedCategoryUiModel, false));
            }
            return new AggregatorProvidersFiltersUiModel(this.l, iunVar, arrayList3);
        }
        Iterator it2 = list6.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            x2q x2qVar2 = (x2q) next;
            if (x2qVar2.c == w3q.d && !x2qVar2.d.isEmpty()) {
                break;
            }
        }
        x2q x2qVar3 = (x2q) next;
        List list8 = mi1Var.b;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list8) {
            if (((x2q) obj4).c != w3q.d) {
                arrayList4.add(obj4);
            }
        }
        mi1 mi1VarA = mi1.a(mi1Var, CollectionsKt.q0(arrayList4, q3d.k(x2qVar3)));
        ep0 ep0Var2 = (ep0) qgdVar.e;
        rh1 rh1VarD0 = aad.d0(pruVar.a().b.v);
        long j = mi1VarA.f21823a;
        List list9 = mi1VarA.b;
        ArrayList arrayList5 = new ArrayList(r3d.q(list9, 10));
        int i3 = 0;
        for (Object obj5 : list9) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            x2q x2qVar4 = (x2q) obj5;
            Iterator it3 = list6.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!Intrinsics.d(((x2q) next2).f40181a, x2qVar4.f40181a));
            x2q x2qVar5 = (x2q) next2;
            Iterator it4 = list9.iterator();
            int i5 = i2;
            while (true) {
                if (!it4.hasNext()) {
                    str = null;
                    i5 = -1;
                    break;
                }
                str = null;
                if (((x2q) it4.next()).c == w3q.f38514a) {
                    break;
                }
                i5++;
            }
            Iterable iterableQ0 = i3 == i5 ? CollectionsKt.q0(x2qVar4.d, kotlin.collections.a.c(new o3q("0", ""))) : x2qVar4.d;
            boolean z2 = i3 == i5 && ep0Var2 != ep0.SMALL_HEADER;
            String str4 = x2qVar4.f40181a;
            w3q w3qVar2 = x2qVar4.c;
            String str5 = x2qVar4.b;
            ArrayList arrayList6 = new ArrayList(r3d.q(iterableQ0, i));
            Iterator it5 = iterableQ0.iterator();
            while (it5.hasNext()) {
                l3q l3qVar = (l3q) it5.next();
                if (w3qVar2 == w3q.b && (l3qVar instanceof s5d0)) {
                    if (x2qVar5 == null || (list5 = x2qVar5.d) == null) {
                        list = list9;
                        obj3 = str;
                    } else {
                        Iterator it6 = list5.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                list = list9;
                                next4 = str;
                                break;
                            }
                            next4 = it6.next();
                            list = list9;
                            if (Intrinsics.d(((l3q) next4).getId(), ((s5d0) l3qVar).f31650a)) {
                                break;
                            }
                            list9 = list;
                        }
                        obj3 = (l3q) next4;
                    }
                    s5d0 s5d0Var = (s5d0) l3qVar;
                    x2qVar = x2qVar5;
                    str2 = str4;
                    list2 = list6;
                    arrayList = arrayList6;
                    ep0Var = ep0Var2;
                    str3 = str5;
                    w3qVar = w3qVar2;
                    filterUiModel = new ProviderUIModel(s5d0Var.f31650a, s5d0Var.b, obj3 != null, null, s5d0Var.c, s5d0Var.d, false, rh1VarD0);
                    it5 = it5;
                } else {
                    list = list9;
                    ep0Var = ep0Var2;
                    list2 = list6;
                    str2 = str4;
                    str3 = str5;
                    x2qVar = x2qVar5;
                    w3qVar = w3qVar2;
                    arrayList = arrayList6;
                    if (w3qVar == w3q.d && (l3qVar instanceof slk0)) {
                        if (x2qVar == null || (list4 = x2qVar.d) == null) {
                            obj2 = str;
                        } else {
                            Iterator it7 = list4.iterator();
                            do {
                                if (!it7.hasNext()) {
                                    next3 = str;
                                    break;
                                }
                                next3 = it7.next();
                            } while (!Intrinsics.d(((l3q) next3).getId(), ((slk0) l3qVar).f32404a));
                            obj2 = (l3q) next3;
                        }
                        slk0 slk0Var = (slk0) l3qVar;
                        it5 = it5;
                        filterUiModel = new SortingOptionUiModel(slk0Var.f32404a, slk0Var.b, null, slk0Var.c, slk0Var.d, obj2 != null);
                    } else {
                        String id = l3qVar.getId();
                        String name = l3qVar.getName();
                        if (x2qVar != null && (list3 = x2qVar.d) != null && !list3.isEmpty()) {
                            Iterator it8 = list3.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    z = false;
                                    break;
                                }
                                if (Intrinsics.d(((l3q) it8.next()).getId(), l3qVar.getId())) {
                                    z = true;
                                    break;
                                }
                            }
                        } else {
                            z = false;
                            break;
                        }
                        String id2 = l3qVar.getId();
                        if (z2) {
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String str6 = String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/filter_screen_style/%s.svg", Arrays.copyOf(new Object[]{id2}, 1));
                            if (str6.length() == 0) {
                                sb.setLength(0);
                            } else {
                                int i6 = 0;
                                if (StringsKt.O(str6, ujn.h, false)) {
                                    sb.setLength(i6);
                                    sb.append(str6);
                                } else if (kotlin.text.c.x(str6, "https://", false)) {
                                    i6 = 0;
                                    sb.setLength(i6);
                                    sb.append(str6);
                                } else {
                                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0(str6, '/'));
                                }
                            }
                            string = sb.toString();
                        } else {
                            string = str;
                        }
                        filterUiModel = new FilterUiModel(id, name, string, z);
                    }
                }
                arrayList.add(filterUiModel);
                str4 = str2;
                str5 = str3;
                arrayList6 = arrayList;
                w3qVar2 = w3qVar;
                x2qVar5 = x2qVar;
                it5 = it5;
                list9 = list;
                ep0Var2 = ep0Var;
                list6 = list2;
            }
            arrayList5.add(new FilterCategoryUiModel(str4, str5, w3qVar2, arrayList6));
            i3 = i4;
            list9 = list9;
            ep0Var2 = ep0Var2;
            list6 = list6;
            i = 10;
            i2 = 0;
        }
        new AggregatorProvidersFiltersUiModel(j, arrayList5, iun.f15405a);
        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList2, 10));
        for (PromotedCategoryUiModel promotedCategoryUiModel2 : arrayList2) {
            promotedCategoryUiModel2.getClass();
            arrayList7.add(PromotedCategoryUiModel.a(promotedCategoryUiModel2, false));
        }
        return new AggregatorProvidersFiltersUiModel(j, arrayList5, arrayList7);
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        vau vauVar = new vau(this.l, this.m, (yje) obj4);
        vauVar.i = (mi1) obj;
        vauVar.j = (List) obj2;
        vauVar.k = (List) obj3;
        return vauVar.invokeSuspend(Unit.f46060a);
    }
}
