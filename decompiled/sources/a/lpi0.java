package a;

import android.content.res.Resources;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lpi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8u f20445a;
    public final u8u b;
    public final noc c;
    public final wgu d;
    public final o470 e;
    public final eyg0 f;
    public final noc g;
    public final vgu h;
    public final ugf0 i;

    public lpi0(b8u b8uVar, u8u u8uVar, noc nocVar, wgu wguVar, o470 o470Var, eyg0 eyg0Var, noc nocVar2, vgu vguVar, ugf0 ugf0Var) {
        wguVar.getClass();
        this.f20445a = b8uVar;
        this.b = u8uVar;
        this.c = nocVar;
        this.d = wguVar;
        this.e = o470Var;
        this.f = eyg0Var;
        this.g = nocVar2;
        this.h = vguVar;
        this.i = ugf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0287  */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(zje zjeVar) {
        kpi0 kpi0Var;
        boolean z;
        muy muyVar;
        Object next;
        Object obj;
        Object next2;
        String str;
        String language;
        Object next3;
        muy muyVar2;
        String script;
        muy muyVar3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object next4;
        Object next5;
        if (zjeVar instanceof kpi0) {
            kpi0Var = (kpi0) zjeVar;
            int i = kpi0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kpi0Var.k = i - Integer.MIN_VALUE;
            } else {
                kpi0Var = new kpi0(this, zjeVar);
            }
        } else {
            kpi0Var = new kpi0(this, zjeVar);
        }
        Object objV = kpi0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kpi0Var.k;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objV);
            u8u u8uVar = this.b;
            kpi0Var.k = 1;
            objV = u8uVar.v(kpi0Var);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        List list = (List) objV;
        String string = this.g.f23861a.c.a().getString("ISO_CODE_TO_CHANGE", "");
        if (string == null) {
            string = "";
        }
        String strA = this.d.a();
        int i3 = 0;
        if (string.length() > 0) {
            z = true;
        } else {
            q7d0 q7d0Var = this.h.f37399a.c;
            Boolean boolValueOf = q7d0Var.a().contains("LANGUAGE_SELECTED_BY_USER") ? Boolean.valueOf(q7d0Var.a().getBoolean("LANGUAGE_SELECTED_BY_USER", false)) : null;
            if (boolValueOf != null ? boolValueOf.booleanValue() : strA.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        if (string.length() > 0) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it.next();
            } while (!((muy) next5).c.equals(string));
            muyVar = (muy) next5;
        } else if (!z || strA.length() <= 0) {
            muyVar = null;
        } else {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((muy) next).c.equals(strA));
            muyVar = (muy) next;
        }
        if (muyVar == null) {
            b8u b8uVar = this.f20445a;
            list.getClass();
            Locale locale = (Locale) CollectionsKt.firstOrNull(art.a());
            if (Intrinsics.d(locale != null ? locale.getLanguage() : null, Locale.CHINESE.getLanguage())) {
                String str7 = rzt.f31378a;
                String str8 = rzt.b;
                ArrayList arrayListA = art.a();
                int size = arrayListA.size();
                while (true) {
                    obj = obj2;
                    if (i3 >= size) {
                        str4 = str7;
                        str5 = str8;
                        Locale locale2 = Locale.getDefault();
                        locale2.getClass();
                        String country = locale2.getCountry();
                        if (country != null) {
                            if ((r6 = country.hashCode()) != 2307) {
                            }
                        }
                        str6 = str5;
                        break;
                    }
                    Locale locale3 = (Locale) arrayListA.get(i3);
                    String script2 = locale3.getScript();
                    str4 = str7;
                    if (!Intrinsics.d(script2, "Hans")) {
                        if (!Intrinsics.d(script2, "Hant")) {
                            String country2 = locale3.getCountry();
                            if (country2 != null) {
                                int iHashCode = country2.hashCode();
                                str5 = str8;
                                if (iHashCode == 2155) {
                                    if (country2.equals("CN")) {
                                        str6 = str5;
                                        break;
                                    }
                                } else if (iHashCode != 2307) {
                                    if (iHashCode != 2466) {
                                        if (iHashCode == 2644) {
                                            if (country2.equals("SG")) {
                                                str6 = str5;
                                                break;
                                            }
                                        } else if (iHashCode == 2691 && country2.equals("TW")) {
                                        }
                                    } else if (!country2.equals("MO")) {
                                    }
                                } else if (!country2.equals("HK")) {
                                }
                            } else {
                                str5 = str8;
                            }
                            i3++;
                            obj2 = obj;
                            str8 = str5;
                            str7 = str4;
                        }
                        str6 = str4;
                        break;
                    }
                    str6 = str8;
                    break;
                }
                Iterator it3 = list.iterator();
                do {
                    if (!it3.hasNext()) {
                        next4 = obj;
                        break;
                    }
                    next4 = it3.next();
                } while (!((muy) next4).f22433a.contains(str6));
                muyVar2 = (muy) next4;
            } else {
                obj = null;
                ArrayList arrayListA2 = art.a();
                Locale locale4 = (Locale) CollectionsKt.firstOrNull(arrayListA2);
                Locale locale5 = (Locale) CollectionsKt.firstOrNull(arrayListA2);
                if (locale5 != null) {
                    String country3 = locale5.getCountry();
                    country3.getClass();
                    if (country3.length() == 0) {
                        locale5 = (Locale) CollectionsKt.W(1, arrayListA2);
                    }
                } else {
                    locale5 = null;
                }
                Iterator it4 = ((ArrayList) tx3.z(new Locale[]{locale4, locale5})).iterator();
                do {
                    if (!it4.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    script = ((Locale) next2).getScript();
                    script.getClass();
                } while (script.length() <= 0);
                Locale locale6 = (Locale) next2;
                if (locale6 != null) {
                    String country4 = locale6.getCountry();
                    country4.getClass();
                    Locale locale7 = country4.length() > 0 ? locale6 : null;
                    if (locale7 != null) {
                        str = locale7.getLanguage() + BundleUtil.UNDERLINE_TAG + locale7.getScript() + BundleUtil.UNDERLINE_TAG + locale7.getCountry();
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                String strQ = locale6 != null ? w6x.q(locale6.getLanguage(), BundleUtil.UNDERLINE_TAG, locale6.getScript()) : null;
                String strQ2 = locale5 != null ? w6x.q(locale5.getLanguage(), BundleUtil.UNDERLINE_TAG, locale5.getCountry()) : null;
                String languageTag = locale5 != null ? locale5.toLanguageTag() : null;
                String language2 = locale4 != null ? locale4.getLanguage() : null;
                Locale locale8 = Resources.getSystem().getConfiguration().getLocales().get(0);
                if (locale8 == null || (language = locale8.getLanguage()) == null) {
                    language = "en";
                }
                List listZ = tx3.z(new String[]{str, strQ, strQ2, languageTag, language2, language});
                ArrayList arrayList = new ArrayList(r3d.q(listZ, 10));
                for (String str9 : (ArrayList) listZ) {
                    str9.getClass();
                    Locale locale9 = Locale.ROOT;
                    locale9.getClass();
                    String lowerCase = str9.toLowerCase(locale9);
                    lowerCase.getClass();
                    String strReplace = lowerCase.replace('-', '_');
                    strReplace.getClass();
                    arrayList.add(strReplace);
                }
                rx3 rx3VarS0 = CollectionsKt.S0(CollectionsKt.L0(CollectionsKt.O0(arrayList)));
                int iA = wp20.a(r3d.q(rx3VarS0, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                Iterator it5 = rx3VarS0.iterator();
                while (true) {
                    iil iilVar = (iil) it5;
                    if (!iilVar.b.hasNext()) {
                        break;
                    }
                    IndexedValue indexedValue = (IndexedValue) iilVar.next();
                    linkedHashMap.put((String) indexedValue.b, Integer.valueOf(indexedValue.f46061a));
                }
                b5q b5qVar = new b5q(pgi0.q(new sx3(list, (byte) 1), new kno(linkedHashMap, (byte) 1)));
                if (b5qVar.hasNext()) {
                    next3 = b5qVar.next();
                    if (b5qVar.hasNext()) {
                        int iIntValue = ((Number) ((Pair) next3).f46059a).intValue();
                        do {
                            Object next6 = b5qVar.next();
                            int iIntValue2 = ((Number) ((Pair) next6).f46059a).intValue();
                            if (iIntValue > iIntValue2) {
                                next3 = next6;
                                iIntValue = iIntValue2;
                            }
                        } while (b5qVar.hasNext());
                    }
                } else {
                    next3 = null;
                }
                Pair pair = (Pair) next3;
                muyVar2 = pair != null ? (muy) pair.b : null;
            }
            if (muyVar2 == null) {
                Iterator it6 = list.iterator();
                do {
                    if (!it6.hasNext()) {
                        v4i0.o("Collection contains no element matching the predicate.");
                        return obj;
                    }
                    muyVar3 = (muy) it6.next();
                    str2 = muyVar3.c;
                    jtj jtjVar = (jtj) b8uVar.f2175a;
                    vff0 vff0Var = (vff0) jtjVar.b;
                    rhi0 rhi0VarB = ((j1q0) jtjVar.c).b();
                    boolean zQ = ((j1q0) jtjVar.c).f15748a.q();
                    vff0Var.getClass();
                    str3 = vff0Var.p;
                    if (str3 == null) {
                        str3 = vff0Var.c(vff0Var.b(rhi0VarB), zQ).S;
                        vff0Var.p = str3;
                    }
                } while (!str2.equals(str3));
                muyVar = muyVar3;
            } else {
                muyVar = muyVar2;
            }
        }
        vff0 vff0Var2 = this.c.f23861a;
        vff0Var2.getClass();
        vff0Var2.c.g("ISO_CODE_TO_CHANGE", "");
        ((vff0) this.i.f35622a).c.d("LANGUAGE_SELECTED_BY_USER", z);
        o470 o470Var = this.e;
        String str10 = muyVar.c;
        kuy kuyVar = (kuy) ((yox) o470Var.f24619a).f43005a;
        kuyVar.getClass();
        kuyVar.b = str10;
        kuyVar.f18934a.g("ISO_CODE_KEY", str10);
        eyg0 eyg0Var = this.f;
        String str11 = (String) CollectionsKt.firstOrNull(muyVar.f22433a);
        if (str11 == null) {
            str11 = muyVar.c;
        }
        kuy kuyVar2 = (kuy) ((yox) eyg0Var.b).f43005a;
        kuyVar2.getClass();
        kuyVar2.c = str11;
        kuyVar2.f18934a.g("LANGUAGE_LOCALE_NAME", str11);
        return Unit.f46060a;
    }
}
