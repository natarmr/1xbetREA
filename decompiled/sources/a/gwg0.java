package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.CyberMainDisciplinesParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$stockScreen$1;
import org.xplatform.feed.linelive.presentation.dialogs.select_time_filter.params.SelectTimeFilterScreenParams;
import org.xplatform.personal.impl.navigation.PersonalScreen$EditProfileScreen;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;
import org.xplatform.security.api.domain.models.SecretQuestionModel;
import org.xplatform.security.impl.presentation.secret_question.screens.SecretQuestionScreen;
import org.xplatform.security.impl.presentation.secret_question_choice.params.SecretQuestionChoiceScreenParams;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gwg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12026a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gwg0(SelectTimeFilterScreenParams selectTimeFilterScreenParams, sqt sqtVar) {
        this.f12026a = (byte) 25;
        this.b = selectTimeFilterScreenParams;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:102:0x0205  */
    /* JADX WARN: Code duplicated, block: B:103:0x0209  */
    /* JADX WARN: Code duplicated, block: B:106:0x0227  */
    /* JADX WARN: Code duplicated, block: B:171:0x039f  */
    /* JADX WARN: Code duplicated, block: B:172:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fa  */
    private final Object a(Object obj) throws Throwable {
        m9s m9sVar;
        m9s m9sVar2;
        List list;
        Object next;
        Object next2;
        String str;
        Throwable th;
        Collection collection;
        Map linkedHashMap;
        List list2;
        List list3;
        List list4;
        String str2;
        cd6 cd6Var;
        jd6 hd6Var;
        jd6 fd6Var;
        int i;
        String strValueOf;
        int i2;
        List list5;
        List list6;
        List list7;
        cd6 cd6Var2;
        jd6 hd6Var2;
        jd6 ed6Var;
        String strValueOf2;
        int i3;
        hdn hdnVar = (hdn) this.b;
        tzh0 tzh0Var = (tzh0) obj;
        tzh0Var.getClass();
        Cnew cnew = tzh0Var.f34804a;
        long jLongValue = ((Number) ((fee) hdnVar.d.getValue()).c()).longValue();
        long jLongValue2 = ((Number) ((fee) hdnVar.e.getValue()).c()).longValue();
        List list8 = (List) ((fee) hdnVar.f.getValue()).c();
        ctf0 ctf0Var = hdnVar.b;
        edw edwVar = tzh0Var.b;
        if (edwVar != null) {
            Object obj2 = edwVar.f7640a;
            e0g0 e0g0Var = j0g0.b;
            if (obj2 instanceof g0g0) {
                obj2 = null;
            }
            m9sVar = (m9s) obj2;
        } else {
            m9sVar = null;
        }
        if (edwVar != null) {
            Object obj3 = edwVar.b;
            e0g0 e0g0Var2 = j0g0.b;
            if (obj3 instanceof g0g0) {
                obj3 = null;
            }
            m9sVar2 = (m9s) obj3;
        } else {
            m9sVar2 = null;
        }
        ctf0Var.getClass();
        list8.getClass();
        if (cnew != null && (list = cnew.b) != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((vcw) next).f37207a != jLongValue);
            vcw vcwVar = (vcw) next;
            if (vcwVar != null) {
                Iterator it2 = vcwVar.c.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((jdw) next2).f16349a != jLongValue2);
                jdw jdwVar = (jdw) next2;
                String str3 = "";
                if (jdwVar == null || (list5 = jdwVar.g) == null) {
                    str = "";
                    th = null;
                    collection = iun.f15405a;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list5) {
                        if (((odw) obj4).b.length() > 0) {
                            arrayList.add(obj4);
                        }
                    }
                    List<odw> listA0 = CollectionsKt.A0(arrayList, new mjf0((byte) 12));
                    if (listA0 != null) {
                        ArrayList arrayList2 = new ArrayList(r3d.q(listA0, 10));
                        for (odw odwVar : listA0) {
                            if (m9sVar == null || (list6 = m9sVar.H) == null) {
                                list6 = iun.f15405a;
                            }
                            if (m9sVar2 == null || (list7 = m9sVar2.H) == null) {
                                list7 = iun.f15405a;
                            }
                            odwVar.getClass();
                            String str4 = str3;
                            long j = odwVar.d;
                            list6.getClass();
                            list7.getClass();
                            int i4 = odwVar.e;
                            long j2 = odwVar.f25096a;
                            dao daoVarE = yum0.e(j, list6);
                            if (daoVarE == null) {
                                daoVarE = yum0.e(j, list7);
                            }
                            boolean zContains = list8.contains(String.valueOf(j2));
                            List list9 = odwVar.f;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list9.iterator();
                            while (it3.hasNext()) {
                                Object next3 = it3.next();
                                sdw sdwVar = (sdw) next3;
                                Iterator it4 = it3;
                                if (sdwVar.b.length() > 0 && sdwVar.f32051a.length() > 0) {
                                    arrayList3.add(next3);
                                }
                                it3 = it4;
                            }
                            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                            for (Iterator it5 = arrayList3.iterator(); it5.hasNext(); it5 = it5) {
                                sdw sdwVar2 = (sdw) it5.next();
                                arrayList4.add(new ta5(sdwVar2.f32051a, sdwVar2.b));
                            }
                            a4x a4xVarO0 = dyb.o0(arrayList4);
                            String strValueOf3 = String.valueOf(j2);
                            long j3 = odwVar.d;
                            String str5 = odwVar.c;
                            String str6 = odwVar.b;
                            if (i4 != 0) {
                                ed6Var = new gd6();
                            } else {
                                if (daoVarE == null) {
                                    ed6Var = new ed6();
                                } else if (daoVarE.h) {
                                    hd6Var2 = new fd6(xkb.O(daoVarE), daoVarE.p, daoVarE.o);
                                } else {
                                    int iOrdinal = daoVarE.n.ordinal();
                                    if (iOrdinal == 0) {
                                        cd6Var2 = cd6.SAME;
                                    } else if (iOrdinal == 1) {
                                        cd6Var2 = cd6.UPPER;
                                    } else {
                                        if (iOrdinal != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        cd6Var2 = cd6.LOWER;
                                    }
                                    hd6Var2 = new hd6(daoVarE.o, daoVarE.p, xkb.O(daoVarE), cd6Var2, daoVarE.m.f32198a);
                                }
                                if (i4 != 0) {
                                    strValueOf2 = String.valueOf(i4);
                                } else {
                                    strValueOf2 = str4;
                                }
                                if (zContains) {
                                    i3 = R.drawable.ic_glyph_chevron_up_small;
                                } else {
                                    i3 = R.drawable.ic_glyph_chevron_down_small;
                                }
                                arrayList2.add(new ua5(strValueOf3, j3, str6, str5, strValueOf2, zContains, i3, hd6Var2, a4xVarO0));
                                str3 = str4;
                            }
                            hd6Var2 = ed6Var;
                            if (i4 != 0) {
                                strValueOf2 = String.valueOf(i4);
                            } else {
                                strValueOf2 = str4;
                            }
                            if (zContains) {
                                i3 = R.drawable.ic_glyph_chevron_up_small;
                            } else {
                                i3 = R.drawable.ic_glyph_chevron_down_small;
                            }
                            arrayList2.add(new ua5(strValueOf3, j3, str6, str5, strValueOf2, zContains, i3, hd6Var2, a4xVarO0));
                            str3 = str4;
                        }
                        str = str3;
                        th = null;
                        collection = arrayList2;
                    } else {
                        str = "";
                        th = null;
                        collection = iun.f15405a;
                    }
                }
                if (jdwVar == null || (list2 = jdwVar.h) == null) {
                    linkedHashMap = lun.f20680a;
                    linkedHashMap.getClass();
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : list2) {
                        wdw wdwVar = (wdw) obj5;
                        if (wdwVar.e != -1 && wdwVar.b.length() > 0 && wdwVar.f != -1) {
                            arrayList5.add(obj5);
                        }
                    }
                    List listA1 = CollectionsKt.A0(arrayList5, new mjf0((byte) 13));
                    if (listA1 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Object obj6 : listA1) {
                            Integer numValueOf = Integer.valueOf(((wdw) obj6).e);
                            Object arrayList6 = linkedHashMap2.get(numValueOf);
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                                linkedHashMap2.put(numValueOf, arrayList6);
                            }
                            ((List) arrayList6).add(obj6);
                        }
                        TreeMap treeMapC = wp20.c(linkedHashMap2, new mjf0((byte) 11));
                        linkedHashMap = new LinkedHashMap(wp20.a(treeMapC.size()));
                        Iterator it6 = treeMapC.entrySet().iterator();
                        while (it6.hasNext()) {
                            Map.Entry entry = (Map.Entry) it6.next();
                            Object key = entry.getKey();
                            List list10 = (List) entry.getValue();
                            list10.getClass();
                            ArrayList arrayList7 = new ArrayList(r3d.q(list10, 10));
                            int i5 = 0;
                            for (Object obj7 : list10) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    q3d.p();
                                    throw th;
                                }
                                wdw wdwVar2 = (wdw) obj7;
                                if (m9sVar == null || (list3 = m9sVar.H) == null) {
                                    list3 = iun.f15405a;
                                }
                                if (m9sVar2 == null || (list4 = m9sVar2.H) == null) {
                                    list4 = iun.f15405a;
                                }
                                wdwVar2.getClass();
                                list3.getClass();
                                list4.getClass();
                                Iterator it7 = it6;
                                long j4 = wdwVar2.f38993a;
                                int i7 = wdwVar2.e;
                                m9s m9sVar3 = m9sVar2;
                                StringBuilder sb = new StringBuilder();
                                sb.append(j4);
                                sb.append(i7);
                                String string = sb.toString();
                                long j5 = wdwVar2.d;
                                dao daoVarE2 = yum0.e(j5, list3);
                                if (daoVarE2 == null) {
                                    daoVarE2 = yum0.e(j5, list4);
                                }
                                boolean zContains2 = list8.contains(string);
                                long j6 = wdwVar2.d;
                                String str7 = wdwVar2.c;
                                String str8 = wdwVar2.b;
                                if (daoVarE2 == null) {
                                    fd6Var = new gd6();
                                    str2 = string;
                                } else {
                                    str2 = string;
                                    if (daoVarE2.h) {
                                        fd6Var = new fd6(xkb.O(daoVarE2), daoVarE2.p, daoVarE2.o);
                                    } else {
                                        j6 = j6;
                                        String strO = xkb.O(daoVarE2);
                                        int iOrdinal2 = daoVarE2.n.ordinal();
                                        if (iOrdinal2 == 0) {
                                            cd6Var = cd6.SAME;
                                        } else if (iOrdinal2 == 1) {
                                            cd6Var = cd6.UPPER;
                                        } else {
                                            if (iOrdinal2 != 2) {
                                                t9f.b();
                                                return th;
                                            }
                                            cd6Var = cd6.LOWER;
                                        }
                                        hd6Var = new hd6(daoVarE2.o, daoVarE2.p, strO, cd6Var, daoVarE2.m.f32198a);
                                    }
                                    i = wdwVar2.f;
                                    if (i != 0) {
                                        strValueOf = String.valueOf(i);
                                    } else {
                                        strValueOf = str;
                                    }
                                    lak0 lak0Var = lak0.c;
                                    if (zContains2) {
                                        i2 = R.drawable.ic_glyph_chevron_up_small;
                                    } else {
                                        i2 = R.drawable.ic_glyph_chevron_down_small;
                                    }
                                    arrayList7.add(new ua5(str2, j6, str8, str7, strValueOf, zContains2, i2, hd6Var, lak0Var));
                                    i5 = i6;
                                    it6 = it7;
                                    m9sVar2 = m9sVar3;
                                }
                                hd6Var = fd6Var;
                                i = wdwVar2.f;
                                if (i != 0) {
                                    strValueOf = String.valueOf(i);
                                } else {
                                    strValueOf = str;
                                }
                                lak0 lak0Var2 = lak0.c;
                                if (zContains2) {
                                    i2 = R.drawable.ic_glyph_chevron_up_small;
                                } else {
                                    i2 = R.drawable.ic_glyph_chevron_down_small;
                                }
                                arrayList7.add(new ua5(str2, j6, str8, str7, strValueOf, zContains2, i2, hd6Var, lak0Var2));
                                i5 = i6;
                                it6 = it7;
                                m9sVar2 = m9sVar3;
                            }
                            linkedHashMap.put(key, arrayList7);
                        }
                    } else {
                        linkedHashMap = lun.f20680a;
                        linkedHashMap.getClass();
                    }
                }
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.addAll(collection);
                if (!linkedHashMap.isEmpty()) {
                    lsm0 lsm0Var = ctf0Var.b;
                    lc00VarB.add(new jzh0(new hjm(lsm0Var.a(R.string.previous_years, Arrays.copyOf(new Object[0], 0)), new ljm(), new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), null, null, null, false, null, null, false, null, null, 8184), lsm0Var.a(R.string.previous_years, Arrays.copyOf(new Object[0], 0))));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        Integer num = (Integer) entry2.getKey();
                        List list11 = (List) entry2.getValue();
                        lc00VarB.add(new uzh0(String.valueOf(num)));
                        lc00VarB.addAll(list11);
                    }
                }
                return kotlin.collections.a.a(lc00VarB);
            }
        }
        return iun.f15405a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        djz djzVar;
        String string;
        byte b = this.f12026a;
        PersonalScreen$EditProfileScreen personalScreen$EditProfileScreen = PersonalScreen$EditProfileScreen.f46780a;
        byte b2 = 3;
        byte b3 = 2;
        yje yjeVar = null;
        boolean z = true;
        char c = 1;
        byte b4 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                cxg0 cxg0Var = (cxg0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                cxg0Var.F(false);
                if (th instanceof zhi0) {
                    cxg0Var.i.b(th, new cwg0(cxg0Var, z ? (byte) 1 : (byte) 0));
                    i1w0 i1w0Var = cxg0Var.h;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    cxg0Var.y(th);
                }
                return Unit.f46060a;
            case 1:
                fzg0 fzg0Var = ((czg0) obj2).c;
                return Boolean.valueOf(fzg0Var != null ? fzg0Var.d(obj) : true);
            case 2:
                ((bzg0) obj2).c(obj);
                return Unit.f46060a;
            case 3:
                ((ngk0) obj2).remove(obj);
                return Unit.f46060a;
            case 4:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                ArrayList arrayList = ((fos) obj2).e;
                hczVar.f(arrayList.size(), null, new j13(arrayList, (byte) 27, objArr == true ? 1 : 0), new ugd(802480018, true, new wyl0(arrayList, z ? (byte) 1 : (byte) 0)));
                return Unit.f46060a;
            case 5:
                w6h0 w6h0Var = (w6h0) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                w6h0Var.w(th2);
                w6h0Var.x(new q6h0(false));
                return Unit.f46060a;
            case 6:
                rah0 rah0Var = (rah0) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                cgk0 cgk0Var = rah0Var.f30133a;
                float fL = cgk0Var.l() + fFloatValue + rah0Var.g;
                float fC = l1e0.c(fL, 0.0f, rah0Var.f.l());
                char c2 = fL != fC ? (char) 0 : (char) 1;
                float fL2 = fC - cgk0Var.l();
                int iRound = Math.round(fL2);
                cgk0Var.m(cgk0Var.l() + iRound);
                rah0Var.g = fL2 - iRound;
                if (c2 == 0) {
                    fFloatValue = fL2;
                }
                return Float.valueOf(fFloatValue);
            case 7:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                long j = ((mbh0) obj2).b;
                long jD = fhlVar.d();
                float fW0 = fhlVar.w0(0.0f);
                fhl.o0(fhlVar, j, 0L, jD, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), null, 242);
                return Unit.f46060a;
            case 8:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                long j2 = ((nbh0) obj2).b;
                long jD2 = fhlVar2.d();
                float fW1 = fhlVar2.w0(0.0f);
                fhl.o0(fhlVar2, j2, 0L, jD2, (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fW1)) & 4294967295L), null, 242);
                return Unit.f46060a;
            case 9:
                sch0 sch0Var = (sch0) obj2;
                return new ne60(sch0Var.d(sch0Var.k, ((ne60) obj).f23370a, sch0Var.j));
            case 10:
                ljh0 ljh0Var = (ljh0) obj2;
                hcz hczVar2 = (hcz) obj;
                lme0 lme0Var = ljh0.m2;
                hczVar2.getClass();
                List listN = ljh0Var.k2.n(ljh0Var, ljh0.n2[0]);
                hczVar2.f(listN.size(), new pwe0(new x0h0((byte) 13), listN, (byte) 14), new d1c0(listN, (byte) 18), new ugd(2039820996, true, new xe4(listN, ljh0Var, (byte) 16)));
                return Unit.f46060a;
            case 11:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((mjh0) obj2).q.b(th3, new x0h0((byte) 14));
                return Unit.f46060a;
            case 12:
                xkh0 xkh0Var = (xkh0) obj2;
                dlh0 dlh0Var = (dlh0) obj;
                gne0 gne0Var = xkh0.n2;
                dlh0Var.getClass();
                if (dlh0Var instanceof clh0) {
                    SecretQuestionModel secretQuestionModel = ((clh0) dlh0Var).f4560a;
                    String str = ((SecretQuestionChoiceScreenParams) xkh0Var.m2.n(xkh0Var, xkh0.o2[0])).f46958a;
                    vcc.f0(i120.V(new Pair(str, secretQuestionModel)), xkh0Var, str);
                    xkh0Var.y0();
                } else {
                    if (!(dlh0Var instanceof blh0)) {
                        t9f.b();
                        return null;
                    }
                    xkh0Var.y0();
                }
                xkh0Var.P0().x(qkh0.f28885a);
                return Unit.f46060a;
            case 13:
                SecretQuestionModel secretQuestionModel2 = (SecretQuestionModel) obj;
                cge0 cge0Var = slh0.O1;
                secretQuestionModel2.getClass();
                ((slh0) obj2).G0().x(new kkh0(secretQuestionModel2));
                return Unit.f46060a;
            case 14:
                noh0 noh0Var = (noh0) obj;
                eke0 eke0Var = joh0.N1;
                noh0Var.getClass();
                iph0 iph0VarH0 = ((joh0) obj2).H0();
                i1w0 i1w0Var2 = iph0VarH0.A;
                zg zgVar = iph0VarH0.m;
                pek0 pek0Var = pek0.f26859a;
                ol60 ol60Var = iph0VarH0.J;
                ctf0 ctf0Var = iph0VarH0.v;
                mne mneVar = iph0VarH0.s;
                int iOrdinal = noh0Var.t().ordinal();
                if (iOrdinal == 0) {
                    boolean zS = noh0Var.s();
                    bby bbyVar = iph0VarH0.H;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        if (zS) {
                            ol60Var.f(new woh0(pek0Var, ctf0Var.f(R.string.security_phone_saved, new Object[0])));
                        } else {
                            iph0VarH0.H = sac.V(jiu0.a(iph0VarH0), new jjh0(1, iph0VarH0, iph0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, mneVar.f22085a, new fph0(iph0VarH0, yjeVar, b2), 10);
                        }
                    }
                } else if (iOrdinal == 1) {
                    bby bbyVar2 = iph0VarH0.H;
                    if (bbyVar2 == null || !bbyVar2.isActive()) {
                        zgVar.f();
                        iph0VarH0.H = sac.V(jiu0.a(iph0VarH0), new jjh0(1, iph0VarH0, iph0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, mneVar.f22085a, new fph0(iph0VarH0, yjeVar, b3), 10);
                    }
                } else if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        bby bbyVar3 = iph0VarH0.H;
                        if (bbyVar3 == null || !bbyVar3.isActive()) {
                            iph0VarH0.H = sac.V(jiu0.a(iph0VarH0), new jjh0(1, iph0VarH0, iph0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, mneVar.f22085a, new fph0(iph0VarH0, yjeVar, (byte) 5), 10);
                        }
                    } else if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            t9f.b();
                            return null;
                        }
                        bby bbyVar4 = iph0VarH0.F;
                        if (bbyVar4 == null || !bbyVar4.isActive()) {
                            p7m0 p7m0Var = iph0VarH0.D;
                            Boolean bool = Boolean.TRUE;
                            p7m0Var.getClass();
                            p7m0Var.o(null, bool);
                            iph0VarH0.F = sac.V(jiu0.a(iph0VarH0), new dff0(iph0VarH0, noh0Var, (byte) 26), null, mneVar.f22085a, new zye0(iph0VarH0, noh0Var, yjeVar, (byte) 19), 10);
                        }
                    } else if (noh0Var.s()) {
                        ol60Var.f(new woh0(pek0Var, ctf0Var.f(R.string.personal_data_is_filling, new Object[0])));
                    } else {
                        zgVar.g("acc_safety");
                        iph0VarH0.C.l("acc_safety");
                        i1w0Var2.getClass();
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        iph0VarH0.p.getClass();
                        if (personalScreen$EditProfileScreen instanceof DialogScreen) {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) personalScreen$EditProfileScreen)));
                        } else {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(personalScreen$EditProfileScreen)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var2, copyOnWriteArrayList, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO;
                            if (pawVar2.hasNext()) {
                                i1w0Var2.a((oe50) pawVar2.next());
                            }
                        }
                    }
                } else if (noh0Var.s()) {
                    ol60Var.f(new woh0(pek0Var, ctf0Var.f(R.string.security_secret_question_saved, new Object[0])));
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                    iph0VarH0.z.getClass();
                    SecretQuestionScreen secretQuestionScreen = new SecretQuestionScreen();
                    if (secretQuestionScreen instanceof DialogScreen) {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) secretQuestionScreen)));
                    } else {
                        copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(secretQuestionScreen)));
                    }
                    ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO2;
                        if (pawVar3.hasNext()) {
                            i1w0Var2.a((oe50) pawVar3.next());
                        }
                    }
                }
                iph0VarH0.l.f(w9x.F(noh0Var.t()));
                return Unit.f46060a;
            case 15:
                dth0 dth0Var = (dth0) obj;
                gle0 gle0Var = oph0.Q1;
                dth0Var.getClass();
                zuh0 zuh0VarI0 = ((oph0) obj2).I0();
                au0 au0Var = zuh0VarI0.C;
                zg zgVar2 = zuh0VarI0.l;
                mne mneVar2 = zuh0VarI0.q;
                int iOrdinal2 = dth0Var.t().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        zgVar2.f();
                        au0Var.f1455a.a(cui0.b(new j1p("acc_safety", (byte) 0)), 3240L);
                        sac.V(jiu0.a(zuh0VarI0), new jjh0(1, zuh0VarI0, zuh0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, mneVar2.f22085a, new xuh0(zuh0VarI0, yjeVar, b3), 10);
                    } else if (iOrdinal2 == 2) {
                        zuh0VarI0.z(dth0Var.s());
                    } else if (iOrdinal2 == 3) {
                        zuh0VarI0.A();
                    } else if (iOrdinal2 != 4) {
                        if (iOrdinal2 != 5) {
                            t9f.b();
                            return null;
                        }
                        bby bbyVar5 = zuh0VarI0.K;
                        if (bbyVar5 == null || !bbyVar5.isActive()) {
                            p7m0 p7m0Var2 = zuh0VarI0.F;
                            Boolean bool2 = Boolean.TRUE;
                            p7m0Var2.getClass();
                            p7m0Var2.o(null, bool2);
                            zuh0VarI0.K = sac.V(jiu0.a(zuh0VarI0), new huh0(zuh0VarI0, dth0Var, objArr2 == true ? 1 : 0), null, mneVar2.f22085a, new zye0(zuh0VarI0, dth0Var, yjeVar, (byte) 21), 10);
                        }
                    } else if (dth0Var.s()) {
                        zuh0VarI0.w(jiu0.a(zuh0VarI0), new uuh0(zuh0VarI0, yjeVar, z ? (byte) 1 : (byte) 0));
                    } else {
                        zgVar2.g("acc_safety");
                        au0Var.l("acc_safety");
                        i1w0 i1w0Var3 = zuh0VarI0.z;
                        CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                        zuh0VarI0.o.getClass();
                        if (personalScreen$EditProfileScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) personalScreen$EditProfileScreen)));
                        } else {
                            copyOnWriteArrayListQ3.add(new c8d(y7d.f42146a, new w0w0(personalScreen$EditProfileScreen)));
                        }
                        ListIterator listIteratorO3 = b1j.o(i1w0Var3, copyOnWriteArrayListQ3, 0);
                        while (true) {
                            paw pawVar4 = (paw) listIteratorO3;
                            if (pawVar4.hasNext()) {
                                i1w0Var3.a((oe50) pawVar4.next());
                            }
                        }
                    }
                } else if (dth0Var.s()) {
                    zuh0VarI0.w(jiu0.a(zuh0VarI0), new uuh0(zuh0VarI0, yjeVar, b3));
                } else {
                    sac.V(jiu0.a(zuh0VarI0), new jjh0(1, zuh0VarI0, zuh0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, mneVar2.f22085a, new xuh0(zuh0VarI0, yjeVar, b2), 10);
                }
                if (dth0Var.t() != ssh0.f) {
                    b1j.v(w9x.F(dth0Var.t()), zuh0VarI0.B.f14907a, 3247L);
                }
                zuh0VarI0.k.f(w9x.F(dth0Var.t()));
                return Unit.f46060a;
            case 16:
                hqh0 hqh0Var = (hqh0) obj;
                gne0 gne0Var2 = cqh0.N1;
                hqh0Var.getClass();
                irh0 irh0VarH0 = ((cqh0) obj2).H0();
                i1w0 i1w0Var4 = irh0VarH0.z;
                zg zgVar3 = irh0VarH0.l;
                mne mneVar3 = irh0VarH0.r;
                int iOrdinal3 = hqh0Var.t().ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        zgVar3.f();
                        sac.V(jiu0.a(irh0VarH0), new jjh0(1, irh0VarH0, irh0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, mneVar3.f22085a, new frh0(irh0VarH0, yjeVar, b3), 10);
                    } else if (iOrdinal3 != 2) {
                        if (iOrdinal3 == 3) {
                            sac.V(jiu0.a(irh0VarH0), new jjh0(1, irh0VarH0, irh0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 22), null, mneVar3.f22085a, new frh0(irh0VarH0, yjeVar, (byte) 5), 10);
                        } else if (iOrdinal3 != 4) {
                            if (iOrdinal3 != 5) {
                                t9f.b();
                                return null;
                            }
                            bby bbyVar6 = irh0VarH0.F;
                            if (bbyVar6 == null || !bbyVar6.isActive()) {
                                p7m0 p7m0Var3 = irh0VarH0.D;
                                Boolean bool3 = Boolean.TRUE;
                                p7m0Var3.getClass();
                                p7m0Var3.o(null, bool3);
                                irh0VarH0.F = sac.V(jiu0.a(irh0VarH0), new dff0(irh0VarH0, hqh0Var, (byte) 28), null, mneVar3.f22085a, new zye0(irh0VarH0, hqh0Var, yjeVar, (byte) 20), 10);
                            }
                        } else if (hqh0Var.s()) {
                            irh0VarH0.w(jiu0.a(irh0VarH0), new hrh0(irh0VarH0, yjeVar, b4));
                        } else {
                            zgVar3.g("acc_safety");
                            irh0VarH0.C.l("acc_safety");
                            i1w0Var4.getClass();
                            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                            irh0VarH0.p.getClass();
                            if (personalScreen$EditProfileScreen instanceof DialogScreen) {
                                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) personalScreen$EditProfileScreen)));
                            } else {
                                copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(personalScreen$EditProfileScreen)));
                            }
                            ListIterator listIteratorO4 = b1j.o(i1w0Var4, copyOnWriteArrayList2, 0);
                            while (true) {
                                paw pawVar5 = (paw) listIteratorO4;
                                if (pawVar5.hasNext()) {
                                    i1w0Var4.a((oe50) pawVar5.next());
                                }
                            }
                        }
                    } else if (hqh0Var.s()) {
                        irh0VarH0.w(jiu0.a(irh0VarH0), new hrh0(irh0VarH0, yjeVar, b3));
                    } else {
                        CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var4);
                        irh0VarH0.y.getClass();
                        SecretQuestionScreen secretQuestionScreen2 = new SecretQuestionScreen();
                        if (secretQuestionScreen2 instanceof DialogScreen) {
                            copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) secretQuestionScreen2)));
                        } else {
                            copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(secretQuestionScreen2)));
                        }
                        ListIterator listIteratorO5 = b1j.o(i1w0Var4, copyOnWriteArrayListQ4, 0);
                        while (true) {
                            paw pawVar6 = (paw) listIteratorO5;
                            if (pawVar6.hasNext()) {
                                i1w0Var4.a((oe50) pawVar6.next());
                            }
                        }
                    }
                } else if (hqh0Var.s()) {
                    irh0VarH0.w(jiu0.a(irh0VarH0), new hrh0(irh0VarH0, yjeVar, z ? (byte) 1 : (byte) 0));
                } else {
                    sac.V(jiu0.a(irh0VarH0), new jjh0(1, irh0VarH0, irh0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, mneVar3.f22085a, new frh0(irh0VarH0, yjeVar, b2), 10);
                }
                if (hqh0Var.t() != ssh0.f) {
                    b1j.v(w9x.F(hqh0Var.t()), irh0VarH0.B.f14907a, 3247L);
                }
                irh0VarH0.k.f(w9x.F(hqh0Var.t()));
                return Unit.f46060a;
            case 17:
                c8d c8dVar = (c8d) ((k0w0) obj).h(svs0.c(((zuh0) obj2).x)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 18:
                c5h c5hVar = (c5h) obj2;
                hzg hzgVar = c5hVar.d;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 1) {
                    ((uzg) hzgVar).b(new CyberCalendarParams(0, 0, iun.f15405a, false));
                } else if (iIntValue == 2) {
                    c5hVar.o.f44833a.a(xun.f41520a, 3350L);
                    c5hVar.i.f14765a.c("cybersport_actions_call");
                    CyberGamesPage cyberGamesPage = ((CyberMainDisciplinesParams.Disciplines) c5hVar.b).f46560a;
                    uzg uzgVar = (uzg) hzgVar;
                    uzgVar.getClass();
                    cyberGamesPage.getClass();
                    i1w0 i1w0VarC = uzgVar.f36533a.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0VarC);
                    CyberGamesScreenFactoryImpl$stockScreen$1 cyberGamesScreenFactoryImpl$stockScreen$1 = new CyberGamesScreenFactoryImpl$stockScreen$1(uzgVar.b, cyberGamesPage);
                    if (cyberGamesScreenFactoryImpl$stockScreen$1 instanceof DialogScreen) {
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) cyberGamesScreenFactoryImpl$stockScreen$1)));
                    } else {
                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(cyberGamesScreenFactoryImpl$stockScreen$1)));
                    }
                    ListIterator listIteratorO6 = b1j.o(i1w0VarC, copyOnWriteArrayListQ5, 0);
                    while (true) {
                        paw pawVar7 = (paw) listIteratorO6;
                        if (pawVar7.hasNext()) {
                            i1w0VarC.a((oe50) pawVar7.next());
                        }
                    }
                } else if (iIntValue == 3) {
                    p7m0 p7m0Var4 = c5hVar.q;
                    p7m0Var4.o(null, l120.a((l120) p7m0Var4.getValue(), null, false, false, false, false, 191));
                    c5hVar.h.g(wgh0.CYBER_SPORT_POPULAR);
                    c5hVar.n.C("cybersport_popular");
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str2 = (String) obj;
                str2.getClass();
                ((x6f) obj2).invoke(str2);
                return Unit.f46060a;
            case 20:
                fzh0 fzh0Var = (fzh0) obj;
                lme0 lme0Var2 = izh0.S1;
                fzh0Var.getClass();
                ((izh0) obj2).G0().x(fzh0Var);
                return Unit.f46060a;
            case 21:
                return a(obj);
            case 22:
                iqt0 iqt0Var = (iqt0) obj;
                gne0 gne0Var3 = n0i0.R1;
                iqt0Var.getClass();
                ((nxh0) obj2).invoke(new b0i0(iqt0Var));
                return Unit.f46060a;
            case 23:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                gle0 gle0Var2 = ((g1i0) obj2).q;
                RuleData ruleData = new RuleData("rule_cashback_percent", 14, (Map) null, (String) null);
                gle0Var2.getClass();
                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, true, false, false));
                return Unit.f46060a;
            case 24:
                SimpleDate simpleDate = (SimpleDate) obj;
                zie0 zie0Var = x1i0.n2;
                simpleDate.getClass();
                ((x1i0) obj2).Q0().x(new t1i0(simpleDate));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                SelectTimeFilterScreenParams selectTimeFilterScreenParams = (SelectTimeFilterScreenParams) obj2;
                ((vzg0) obj).getClass();
                ygq0 ygq0Var = selectTimeFilterScreenParams.f46663a;
                long j3 = selectTimeFilterScreenParams.c;
                byte b5 = ygq0Var.f42598a;
                long j4 = selectTimeFilterScreenParams.b;
                mfj lfjVar = kfj.f18198a;
                mfj lfjVar2 = j4 <= 0 ? lfjVar : new lfj(new Date(j4));
                if (j3 > 0) {
                    lfjVar = new lfj(new Date(j3));
                }
                return new m3i0(b5, lfjVar2, lfjVar, sqt.f(selectTimeFilterScreenParams.h));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cgx0 cgx0Var = (cgx0) obj2;
                dpa0 dpa0Var = (dpa0) obj;
                long j5 = dpa0Var.c;
                k7q0 k7q0Var = (k7q0) cgx0Var.d;
                if (!k7q0Var.i() || k7q0Var.l().f440a.b.length() == 0 || (djzVar = k7q0Var.d) == null || djzVar.d() == null) {
                    c = 0;
                } else {
                    cgx0Var.x(k7q0Var.l(), j5, false, m2a.g1);
                }
                if (c != 0) {
                    dpa0Var.a();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                m9i0 m9i0Var = (m9i0) obj2;
                eke0 eke0Var2 = m9i0.S1;
                ((View) obj).getClass();
                if (m9i0Var.L1) {
                    Context contextD = m9i0Var.D();
                    if (contextD != null) {
                        TypedValue typedValue = j5d.f15927a;
                        String hexString = Integer.toHexString(j5d.a(contextD, R.attr.uikitSecondary, false));
                        hexString.getClass();
                        String strSubstring = hexString.substring(2);
                        String strH = m9i0Var.H(R.string.self_limit_set_dialog_confirm_message);
                        zie0 zie0Var2 = g9i0.b;
                        g9i0 g9i0Var = m9i0Var.K1;
                        zie0Var2.getClass();
                        g9i0Var.getClass();
                        int iOrdinal4 = g9i0Var.ordinal();
                        if (iOrdinal4 == 0) {
                            string = contextD.getString(R.string.limit_for_24h);
                            string.getClass();
                        } else if (iOrdinal4 == 1) {
                            string = contextD.getString(R.string.limit_for_7d);
                            string.getClass();
                        } else if (iOrdinal4 == 2) {
                            string = contextD.getString(R.string.limit_for_30d);
                            string.getClass();
                        } else {
                            if (iOrdinal4 != 3) {
                                t9f.b();
                                return null;
                            }
                            string = contextD.getString(R.string.limit_for_90d);
                            string.getClass();
                        }
                        String strQ = w6x.q(strH, Separators.SP, string);
                        String strH2 = m9i0Var.H(R.string.self_limit_set_dialog_confirm_description);
                        strH2.getClass();
                        StringBuilder sb = new StringBuilder(strQ);
                        sb.append("<br/><br/><small><font color=#");
                        sb.append(strSubstring);
                        sb.append(Separators.GREATER_THAN);
                        String strN = axq.n(sb, strH2, "</font><small/>");
                        ii iiVar = m9i0Var.N1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH3 = m9i0Var.H(R.string.caution);
                        Spanned spannedFromHtml = Html.fromHtml(strN, 0);
                        spannedFromHtml.getClass();
                        SpannableString spannableString = new SpannableString(spannedFromHtml);
                        String strH4 = m9i0Var.H(R.string.yes);
                        strH4.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) spannableString, (CharSequence) strH4, m9i0Var.H(R.string.cancel), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = m9i0Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    }
                } else {
                    ii iiVar2 = m9i0Var.N1;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH5 = m9i0Var.H(R.string.caution);
                    String strH6 = m9i0Var.H(R.string.change_the_limit_question);
                    strH6.getClass();
                    Spanned spannedFromHtml2 = Html.fromHtml(strH6, 0);
                    spannedFromHtml2.getClass();
                    SpannableString spannableString2 = new SpannableString(spannedFromHtml2);
                    String strH7 = m9i0Var.H(R.string.yes);
                    strH7.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) spannableString2, (CharSequence) strH7, m9i0Var.H(R.string.no), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC2 = m9i0Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                t9i0 t9i0Var = (t9i0) obj2;
                iiy[] iiyVarArr = t9i0.Q1;
                ((View) obj).getClass();
                ii iiVar3 = t9i0Var.L1;
                if (iiVar3 == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH8 = t9i0Var.H(R.string.caution);
                String strH9 = t9i0Var.H(R.string.change_the_limit_question);
                strH9.getClass();
                Spanned spannedFromHtml3 = Html.fromHtml(strH9, 0);
                spannedFromHtml3.getClass();
                SpannableString spannableString3 = new SpannableString(spannedFromHtml3);
                String strH10 = t9i0Var.H(R.string.yes);
                strH10.getClass();
                DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) spannableString3, (CharSequence) strH10, t9i0Var.H(R.string.cancel), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC3 = t9i0Var.C();
                eVarC3.getClass();
                iiVar3.d(dialogFields3, eVarC3);
                return Unit.f46060a;
            default:
                cai0 cai0Var = (cai0) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                cai0Var.f.b(th4, new uph0((Object) cai0Var, (byte) 11));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ gwg0(Object obj, byte b) {
        this.f12026a = b;
        this.b = obj;
    }
}
