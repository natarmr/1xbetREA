package org.xplatform.personal.impl.presentation.edit;

import a.bnn0;
import a.c0o;
import a.c2c0;
import a.d0c0;
import a.jf4;
import a.jo20;
import a.lc00;
import a.m2c0;
import a.paw;
import a.q3d;
import a.r3d;
import a.rou;
import a.sdj;
import a.t9f;
import a.v8d;
import a.vne;
import a.vzg0;
import a.w2c0;
import a.wne;
import a.wp20;
import a.yje;
import a.z1x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModel;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItem;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItemClickable;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelTitle;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends bnn0 implements Function2 {
    public v8d i;
    public boolean j;
    public final /* synthetic */ n k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, yje yjeVar) {
        super(2, yjeVar);
        this.k = nVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new j(this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:102:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:96:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01df  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e5  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        v8d v8dVarA;
        Object objA;
        boolean z;
        w2c0 w2c0Var;
        int i;
        Integer intOrNull;
        int i2;
        int iIntValue;
        ProfileEditUiModel profileEditUiModelItemClickable;
        n nVar = this.k;
        vzg0 vzg0Var = nVar.n;
        wne wneVar = wne.f39444a;
        boolean z2 = this.j;
        if (!z2) {
            z1x.P(obj);
            sdj sdjVar = n.v;
            if (nVar.B() instanceof ProfileEditViewModel$UiState.Loaded) {
                Integer num = (Integer) vzg0Var.a("ORIGINAL_UI_STATE_HASH_KEY");
                if (num != null) {
                    nVar.t = num.intValue();
                } else {
                    int iHashCode = nVar.B().hashCode();
                    nVar.t = iHashCode;
                    vzg0Var.e("ORIGINAL_UI_STATE_HASH_KEY", new Integer(iHashCode));
                }
                return Unit.f46060a;
            }
            v8dVarA = nVar.e.f3488a.a();
            rou rouVar = nVar.g;
            this.i = v8dVarA;
            this.j = true;
            objA = rouVar.a(false, this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v8d v8dVar = this.i;
            z1x.P(obj);
            v8dVarA = v8dVar;
            objA = obj;
        }
        m2c0 m2c0Var = (m2c0) objA;
        sdj sdjVar2 = n.v;
        boolean zBooleanValue = ((Boolean) nVar.o.getValue()).booleanValue();
        boolean z3 = v8dVarA.G;
        List list = v8dVarA.V;
        m2c0Var.getClass();
        list.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        String str = m2c0Var.G;
        String str2 = m2c0Var.c;
        lc00VarB.add(str);
        lc00VarB.add(m2c0Var.E);
        lc00VarB.add(m2c0Var.z);
        lc00VarB.add(m2c0Var.x);
        if (zBooleanValue) {
            lc00VarB.add(m2c0Var.H);
        }
        lc00VarB.add(m2c0Var.w);
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        if (lc00VarA != null && lc00VarA.isEmpty()) {
            z = true;
            break;
        }
        ListIterator listIterator = lc00VarA.listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                z = true;
                break;
            }
            if (((String) pawVar.next()).length() <= 0) {
                z = false;
                break;
            }
        }
        Integer intOrNull2 = StringsKt.toIntOrNull(str2);
        int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
        boolean z4 = list.isEmpty() || list.contains(Integer.valueOf(iIntValue2));
        boolean z5 = iIntValue2 == 76;
        boolean z6 = iIntValue2 == 215;
        boolean z7 = iIntValue2 == 1;
        boolean z8 = iIntValue2 == 121;
        c0o c0oVar = d0c0.c;
        int iA = wp20.a(r3d.q(c0oVar, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = c0oVar.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List list2 = ((d0c0) next).f5261a;
            boolean z9 = z3;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                String str3 = str2;
                Iterator it2 = it;
                w2c0 w2c0Var2 = (w2c0) obj2;
                if (c2c0.c(z5, z6, z4, z, zBooleanValue, m2c0Var, z7, z8, z9, w2c0Var2, c2c0.b(m2c0Var, w2c0Var2))) {
                    arrayList.add(obj2);
                }
                str2 = str3;
                it = it2;
            }
            Iterator it3 = it;
            String str4 = str2;
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            int i3 = 0;
            while (it4.hasNext()) {
                Object next2 = it4.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                w2c0 w2c0Var3 = (w2c0) next2;
                String strB = c2c0.b(m2c0Var, w2c0Var3);
                boolean z10 = i3 == 0;
                int iOrdinal = w2c0Var3.ordinal();
                Iterator it5 = it4;
                if (iOrdinal != 6 && iOrdinal != 12 && iOrdinal != 15) {
                    switch (iOrdinal) {
                        case 8:
                        case 9:
                        case 10:
                            switch (w2c0Var3.ordinal()) {
                                case 8:
                                    intOrNull = StringsKt.toIntOrNull(str4);
                                    if (intOrNull != null) {
                                        iIntValue = intOrNull.intValue();
                                        i2 = iIntValue;
                                    } else {
                                        i2 = 0;
                                    }
                                    break;
                                case 9:
                                    iIntValue = m2c0Var.g;
                                    i2 = iIntValue;
                                    break;
                                case 10:
                                    iIntValue = m2c0Var.d;
                                    i2 = iIntValue;
                                    break;
                                case 11:
                                default:
                                    iIntValue = -1;
                                    i2 = iIntValue;
                                    break;
                                case 12:
                                    iIntValue = m2c0Var.F;
                                    i2 = iIntValue;
                                    break;
                            }
                            profileEditUiModelItemClickable = new ProfileEditUiModelItemClickable(w2c0Var3, i2, strB, c2c0.c(z5, z6, z4, z, zBooleanValue, m2c0Var, z7, z8, z9, w2c0Var3, strB), c2c0.a(m2c0Var, w2c0Var3, strB), "", z10);
                            break;
                        default:
                            profileEditUiModelItemClickable = new ProfileEditUiModelItem(w2c0Var3, strB, c2c0.c(z5, z6, z4, z, zBooleanValue, m2c0Var, z7, z8, z9, w2c0Var3, strB), c2c0.a(m2c0Var, w2c0Var3, strB), "", z10);
                            break;
                    }
                } else {
                    switch (w2c0Var3.ordinal()) {
                        case 8:
                            intOrNull = StringsKt.toIntOrNull(str4);
                            if (intOrNull != null) {
                                iIntValue = intOrNull.intValue();
                                i2 = iIntValue;
                            } else {
                                i2 = 0;
                            }
                            break;
                        case 9:
                            iIntValue = m2c0Var.g;
                            i2 = iIntValue;
                            break;
                        case 10:
                            iIntValue = m2c0Var.d;
                            i2 = iIntValue;
                            break;
                        case 11:
                        default:
                            iIntValue = -1;
                            i2 = iIntValue;
                            break;
                        case 12:
                            iIntValue = m2c0Var.F;
                            i2 = iIntValue;
                            break;
                    }
                    profileEditUiModelItemClickable = new ProfileEditUiModelItemClickable(w2c0Var3, i2, strB, c2c0.c(z5, z6, z4, z, zBooleanValue, m2c0Var, z7, z8, z9, w2c0Var3, strB), c2c0.a(m2c0Var, w2c0Var3, strB), "", z10);
                }
                arrayList2.add(profileEditUiModelItemClickable);
                i3 = i4;
                it4 = it5;
            }
            linkedHashMap.put(next, arrayList2);
            str2 = str4;
            z3 = z9;
            it = it3;
        }
        jo20 jo20Var = new jo20();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            d0c0 d0c0Var = (d0c0) entry.getKey();
            List<ProfileEditUiModel> list3 = (List) entry.getValue();
            if (!list3.isEmpty()) {
                d0c0Var.getClass();
                int iOrdinal2 = d0c0Var.ordinal();
                if (iOrdinal2 == 0) {
                    w2c0Var = w2c0.b;
                } else if (iOrdinal2 == 1) {
                    w2c0Var = w2c0.c;
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    w2c0Var = w2c0.d;
                }
                int iOrdinal3 = d0c0Var.ordinal();
                if (iOrdinal3 == 0) {
                    i = R.string.basic_data;
                } else if (iOrdinal3 == 1) {
                    i = R.string.living_place;
                } else {
                    if (iOrdinal3 != 2) {
                        t9f.b();
                        return null;
                    }
                    i = R.string.document;
                }
                jo20Var.put(w2c0Var, new ProfileEditUiModelTitle(i));
                for (ProfileEditUiModel profileEditUiModel : list3) {
                    jo20Var.put(profileEditUiModel.getF46791a(), profileEditUiModel);
                }
            }
        }
        jo20 jo20VarB = jo20Var.b();
        nVar.E(new ProfileEditViewModel$UiState.Loaded(jo20VarB));
        int iHashCode2 = nVar.B().hashCode();
        nVar.t = iHashCode2;
        vzg0Var.e("ORIGINAL_UI_STATE_HASH_KEY", new Integer(iHashCode2));
        nVar.r.putAll(jo20VarB);
        return Unit.f46060a;
    }
}
