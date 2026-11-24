package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getContactsFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ys8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ boolean k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys8(rzj rzjVar, yje yjeVar, boolean z, LinkedHashSet linkedHashSet) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.l = rzjVar;
        this.k = z;
        this.m = linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x029d  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:178:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:181:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:187:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:188:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:190:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:194:0x02f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:195:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:197:0x02fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:198:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:199:0x0317  */
    /* JADX WARN: Code duplicated, block: B:201:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x031d  */
    /* JADX WARN: Code duplicated, block: B:203:0x0323  */
    /* JADX WARN: Code duplicated, block: B:204:0x0325  */
    /* JADX WARN: Code duplicated, block: B:206:0x032d  */
    /* JADX WARN: Code duplicated, block: B:208:0x033f  */
    /* JADX WARN: Code duplicated, block: B:209:0x0351  */
    /* JADX WARN: Code duplicated, block: B:213:0x036d A[LOOP:5: B:211:0x0364->B:213:0x036d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:214:0x0377  */
    /* JADX WARN: Code duplicated, block: B:242:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x038c A[SYNTHETIC] */
    private final Object l(Object obj) {
        l9x l9xVar;
        Object next;
        y9x y9xVar;
        Iterator it;
        Object next2;
        y9x y9xVar2;
        String str;
        int iHashCode;
        lax laxVar;
        int iOrdinal;
        CopyOnWriteArrayList copyOnWriteArrayListQ;
        FragmentScreen rulesScreenFactoryImpl$getContactsFragmentScreen$1;
        ListIterator listIteratorO;
        paw pawVar;
        int i;
        int i2;
        y9x y9xVar3;
        int i3;
        int i4;
        tax taxVar = (tax) this.m;
        i1w0 i1w0Var = taxVar.b;
        db9 db9Var = taxVar.m;
        pru pruVar = taxVar.j;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            l9x l9xVar2 = pruVar.a().g.g;
            qoj0 qoj0Var = taxVar.w;
            this.l = l9xVar2;
            this.j = true;
            if (qoj0Var.a(l9xVar2, this) == wneVar) {
                return wneVar;
            }
            l9xVar = l9xVar2;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l9xVar = (l9x) this.l;
            z1x.P(obj);
        }
        o9x o9xVar = pruVar.a().m;
        boolean zJ = taxVar.i.j();
        l9xVar.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        if (o9xVar.b && !zJ) {
            lc00VarB.add(y9x.INFO_ABOUT);
        }
        if (o9xVar.m) {
            lc00VarB.add(y9x.INFO_RESPONSIBLE_GAMING);
        }
        if (o9xVar.c && !zJ) {
            lc00VarB.add(y9x.INFO_SOCIAL);
        }
        if (o9xVar.d && !zJ) {
            lc00VarB.add(y9x.INFO_CONTACT);
        }
        if (o9xVar.j && !zJ) {
            lc00VarB.add(y9x.INFO_RULES);
        }
        if (o9xVar.I && this.k) {
            lc00VarB.add(y9x.INFO_USER_AGREEMENT_HISTORY);
        }
        if (!StringsKt.W(o9xVar.k) && !zJ) {
            lc00VarB.add(y9x.INFO_PARTNERS_PROGRAM);
        }
        if (!StringsKt.W(o9xVar.l) && !zJ) {
            lc00VarB.add(y9x.INFO_AGENTS_PROGRAM);
        }
        if (o9xVar.e) {
            lc00VarB.add(y9x.INFO_LICENCE);
        }
        if (o9xVar.f) {
            lc00VarB.add(y9x.INFO_AWARDS);
        }
        if (o9xVar.g && !zJ) {
            lc00VarB.add(y9x.INFO_PAYMENTS);
        }
        if (o9xVar.h && !zJ) {
            lc00VarB.add(y9x.INFO_QUESTION);
        }
        if (!StringsKt.W(o9xVar.x) && !zJ) {
            lc00VarB.add(y9x.INFO_NEWS);
        }
        if (o9xVar.i) {
            lc00VarB.add(y9x.INFO_PARTNER);
        }
        if (o9xVar.n) {
            lc00VarB.add(y9x.INFO_BETTING_PROCEDURES);
        }
        if (o9xVar.o) {
            lc00VarB.add(y9x.INFO_REQUEST_POLICY);
        }
        if (o9xVar.p && !zJ) {
            lc00VarB.add(y9x.INFO_PRIVACY_POLICY);
        }
        if (o9xVar.G) {
            lc00VarB.add(y9x.INFO_POLITICALLY_EXPOSED_PERSON);
        }
        if (o9xVar.E) {
            lc00VarB.add(y9x.INFO_PAYMENT_CARD_SECURITY);
        }
        if (!StringsKt.W(o9xVar.D) && !zJ) {
            lc00VarB.add(y9x.INFO_GAMBLING_PROBLEM_ORGANISATION);
        }
        if (o9xVar.q && !zJ) {
            lc00VarB.add(y9x.INFO_STOP_LIST_WAGERING);
        }
        if (o9xVar.r) {
            lc00VarB.add(y9x.INFO_PERSONAL_DATA_POLICY);
        }
        if (o9xVar.B.length() > 0) {
            lc00VarB.add(y9x.INFO_USSD_INSTRUCTIONS);
        }
        if (o9xVar.C) {
            lc00VarB.add(y9x.INFO_MARKETS);
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        ArrayList<cax> arrayList = new ArrayList(r3d.q(lc00VarA, 10));
        ListIterator listIterator = lc00VarA.listIterator(0);
        while (true) {
            paw pawVar2 = (paw) listIterator;
            if (!pawVar2.hasNext()) {
                p7m0 p7m0Var = taxVar.v;
                p7m0Var.getClass();
                p7m0Var.o(null, arrayList);
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (cax caxVar : arrayList) {
                    sqt sqtVar = y9x.b;
                    int i5 = caxVar.f4035a;
                    sqtVar.getClass();
                    y9x[] y9xVarArrValues = y9x.values();
                    int length = y9xVarArrValues.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            y9xVar3 = y9xVarArrValues[i6];
                            if (y9xVar3.f42269a != i5) {
                                i6++;
                            }
                        } else {
                            y9xVar3 = null;
                        }
                    }
                    if (y9xVar3 == null) {
                        y9xVar3 = y9x.INFO_DEFAULT;
                    }
                    arrayList2.add(y9xVar3);
                }
                Iterator it2 = arrayList2.iterator();
                do {
                    if (it2.hasNext()) {
                        next = it2.next();
                        i2 = ((y9x) next).f42269a;
                        sqt sqtVar2 = y9x.b;
                    } else {
                        next = null;
                    }
                    y9xVar = (y9x) next;
                    it = arrayList2.iterator();
                    do {
                        if (it.hasNext()) {
                            next2 = it.next();
                            i = ((y9x) next2).f42269a;
                            sqt sqtVar3 = y9x.b;
                        } else {
                            next2 = null;
                        }
                        y9xVar2 = (y9x) next2;
                        tqt tqtVar = lax.f19728a;
                        str = taxVar.c;
                        tqtVar.getClass();
                        str.getClass();
                        iHashCode = str.hashCode();
                        if (iHashCode != -1405038154) {
                            if (iHashCode != -567451565) {
                                if (iHashCode != 110250375 && str.equals("terms")) {
                                    laxVar = lax.d;
                                } else {
                                    laxVar = lax.b;
                                }
                            } else if (str.equals("contacts")) {
                                laxVar = lax.c;
                            } else {
                                laxVar = lax.b;
                            }
                        } else if (str.equals("awards")) {
                            laxVar = lax.e;
                        } else {
                            laxVar = lax.b;
                        }
                        iOrdinal = laxVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2) {
                                    if (iOrdinal == 3) {
                                        t9f.b();
                                        return null;
                                    }
                                    y9x y9xVar4 = y9x.INFO_AWARDS;
                                    ((knf0) db9Var.f5792a.b).getClass();
                                    i1w0Var.d(new kax(taxVar, y9xVar4.a(), y9xVar4));
                                } else if (y9xVar2 != null) {
                                    taxVar.w(y9xVar2, taxVar.d);
                                }
                            } else if (y9xVar != null) {
                                if (pruVar.a().A0) {
                                    copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                    taxVar.r.getClass();
                                    rulesScreenFactoryImpl$getContactsFragmentScreen$1 = new RulesScreenFactoryImpl$getContactsFragmentScreen$1(true);
                                    if (rulesScreenFactoryImpl$getContactsFragmentScreen$1 instanceof DialogScreen) {
                                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) rulesScreenFactoryImpl$getContactsFragmentScreen$1)));
                                    } else {
                                        copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(rulesScreenFactoryImpl$getContactsFragmentScreen$1)));
                                    }
                                    listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                                    while (true) {
                                        pawVar = (paw) listIteratorO;
                                        if (pawVar.hasNext()) {
                                            i1w0Var.a((oe50) pawVar.next());
                                        }
                                    }
                                } else {
                                    ((knf0) db9Var.f5792a.b).getClass();
                                    i1w0Var.d(new kax(taxVar, y9xVar.a(), y9xVar));
                                }
                            }
                        }
                        taxVar.c = "";
                        return Unit.f46060a;
                    } while (i != 4);
                    y9xVar2 = (y9x) next2;
                    tqt tqtVar2 = lax.f19728a;
                    str = taxVar.c;
                    tqtVar2.getClass();
                    str.getClass();
                    iHashCode = str.hashCode();
                    if (iHashCode != -1405038154) {
                        if (iHashCode != -567451565) {
                            if (iHashCode != 110250375) {
                                laxVar = lax.b;
                            } else {
                                laxVar = lax.d;
                            }
                        } else if (str.equals("contacts")) {
                            laxVar = lax.c;
                        } else {
                            laxVar = lax.b;
                        }
                    } else if (str.equals("awards")) {
                        laxVar = lax.b;
                    } else {
                        laxVar = lax.e;
                    }
                    iOrdinal = laxVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    t9f.b();
                                    return null;
                                }
                                y9x y9xVar5 = y9x.INFO_AWARDS;
                                ((knf0) db9Var.f5792a.b).getClass();
                                i1w0Var.d(new kax(taxVar, y9xVar5.a(), y9xVar5));
                            } else if (y9xVar2 != null) {
                                taxVar.w(y9xVar2, taxVar.d);
                            }
                        } else if (y9xVar != null) {
                            if (pruVar.a().A0) {
                                copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                taxVar.r.getClass();
                                rulesScreenFactoryImpl$getContactsFragmentScreen$1 = new RulesScreenFactoryImpl$getContactsFragmentScreen$1(true);
                                if (rulesScreenFactoryImpl$getContactsFragmentScreen$1 instanceof DialogScreen) {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) rulesScreenFactoryImpl$getContactsFragmentScreen$1)));
                                } else {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(rulesScreenFactoryImpl$getContactsFragmentScreen$1)));
                                }
                                listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                                while (true) {
                                    pawVar = (paw) listIteratorO;
                                    if (pawVar.hasNext()) {
                                        i1w0Var.a((oe50) pawVar.next());
                                    }
                                }
                            } else {
                                ((knf0) db9Var.f5792a.b).getClass();
                                i1w0Var.d(new kax(taxVar, y9xVar.a(), y9xVar));
                            }
                        }
                    }
                    taxVar.c = "";
                    return Unit.f46060a;
                } while (i2 != 3);
                y9xVar = (y9x) next;
                it = arrayList2.iterator();
                do {
                    if (it.hasNext()) {
                        next2 = it.next();
                        i = ((y9x) next2).f42269a;
                        sqt sqtVar4 = y9x.b;
                    } else {
                        next2 = null;
                    }
                    y9xVar2 = (y9x) next2;
                    tqt tqtVar3 = lax.f19728a;
                    str = taxVar.c;
                    tqtVar3.getClass();
                    str.getClass();
                    iHashCode = str.hashCode();
                    if (iHashCode != -1405038154) {
                        if (iHashCode != -567451565) {
                            if (iHashCode != 110250375) {
                                laxVar = lax.b;
                            } else {
                                laxVar = lax.d;
                            }
                        } else if (str.equals("contacts")) {
                            laxVar = lax.c;
                        } else {
                            laxVar = lax.b;
                        }
                    } else if (str.equals("awards")) {
                        laxVar = lax.b;
                    } else {
                        laxVar = lax.e;
                    }
                    iOrdinal = laxVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    t9f.b();
                                    return null;
                                }
                                y9x y9xVar6 = y9x.INFO_AWARDS;
                                ((knf0) db9Var.f5792a.b).getClass();
                                i1w0Var.d(new kax(taxVar, y9xVar6.a(), y9xVar6));
                            } else if (y9xVar2 != null) {
                                taxVar.w(y9xVar2, taxVar.d);
                            }
                        } else if (y9xVar != null) {
                            if (pruVar.a().A0) {
                                copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                taxVar.r.getClass();
                                rulesScreenFactoryImpl$getContactsFragmentScreen$1 = new RulesScreenFactoryImpl$getContactsFragmentScreen$1(true);
                                if (rulesScreenFactoryImpl$getContactsFragmentScreen$1 instanceof DialogScreen) {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) rulesScreenFactoryImpl$getContactsFragmentScreen$1)));
                                } else {
                                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(rulesScreenFactoryImpl$getContactsFragmentScreen$1)));
                                }
                                listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                                while (true) {
                                    pawVar = (paw) listIteratorO;
                                    if (pawVar.hasNext()) {
                                        i1w0Var.a((oe50) pawVar.next());
                                    }
                                }
                            } else {
                                ((knf0) db9Var.f5792a.b).getClass();
                                i1w0Var.d(new kax(taxVar, y9xVar.a(), y9xVar));
                            }
                        }
                    }
                    taxVar.c = "";
                    return Unit.f46060a;
                } while (i != 4);
                y9xVar2 = (y9x) next2;
                tqt tqtVar4 = lax.f19728a;
                str = taxVar.c;
                tqtVar4.getClass();
                str.getClass();
                iHashCode = str.hashCode();
                if (iHashCode != -1405038154) {
                    if (iHashCode != -567451565) {
                        if (iHashCode != 110250375) {
                            laxVar = lax.b;
                        } else {
                            laxVar = lax.d;
                        }
                    } else if (str.equals("contacts")) {
                        laxVar = lax.c;
                    } else {
                        laxVar = lax.b;
                    }
                } else if (str.equals("awards")) {
                    laxVar = lax.b;
                } else {
                    laxVar = lax.e;
                }
                iOrdinal = laxVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                t9f.b();
                                return null;
                            }
                            y9x y9xVar7 = y9x.INFO_AWARDS;
                            ((knf0) db9Var.f5792a.b).getClass();
                            i1w0Var.d(new kax(taxVar, y9xVar7.a(), y9xVar7));
                        } else if (y9xVar2 != null) {
                            taxVar.w(y9xVar2, taxVar.d);
                        }
                    } else if (y9xVar != null) {
                        if (pruVar.a().A0) {
                            copyOnWriteArrayListQ = b1j.q(i1w0Var);
                            taxVar.r.getClass();
                            rulesScreenFactoryImpl$getContactsFragmentScreen$1 = new RulesScreenFactoryImpl$getContactsFragmentScreen$1(true);
                            if (rulesScreenFactoryImpl$getContactsFragmentScreen$1 instanceof DialogScreen) {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) rulesScreenFactoryImpl$getContactsFragmentScreen$1)));
                            } else {
                                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(rulesScreenFactoryImpl$getContactsFragmentScreen$1)));
                            }
                            listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                            while (true) {
                                pawVar = (paw) listIteratorO;
                                if (pawVar.hasNext()) {
                                    i1w0Var.a((oe50) pawVar.next());
                                }
                            }
                        } else {
                            ((knf0) db9Var.f5792a.b).getClass();
                            i1w0Var.d(new kax(taxVar, y9xVar.a(), y9xVar));
                        }
                    }
                }
                taxVar.c = "";
                return Unit.f46060a;
            }
            y9x y9xVar8 = (y9x) pawVar2.next();
            int i7 = y9xVar8.f42269a;
            switch (y9xVar8.ordinal()) {
                case 0:
                    i3 = R.string.info_about;
                    break;
                case 1:
                    i3 = R.string.info_social_title;
                    break;
                case 2:
                    i3 = R.string.info_contact;
                    break;
                case 3:
                    i3 = R.string.rules;
                    break;
                case 4:
                    i3 = R.string.info_payment;
                    break;
                case 5:
                    i3 = R.string.info_question;
                    break;
                case 6:
                    i3 = R.string.partners;
                    break;
                case 7:
                    i3 = R.string.info_licence;
                    break;
                case 8:
                    i3 = R.string.info_awards;
                    break;
                case 9:
                    i3 = R.string.info_privacy_policy;
                    break;
                case 10:
                    i3 = R.string.info_responsible_gaming;
                    break;
                case 11:
                    i3 = R.string.info_betting_procedures;
                    break;
                case 12:
                    i3 = R.string.info_request_policy;
                    break;
                case 13:
                    i3 = R.string.info_personal_data_policy;
                    break;
                case 14:
                    i3 = R.string.stop_list_wagering;
                    break;
                case 15:
                case 16:
                default:
                    i3 = 0;
                    break;
                case 17:
                    i3 = R.string.info_ussd_instructions;
                    break;
                case 18:
                    i3 = R.string.info_markets;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    i3 = R.string.info_partner_programm;
                    break;
                case 20:
                    i3 = R.string.info_agent_programm;
                    break;
                case 21:
                    i3 = R.string.info_gambling_problem_organisation;
                    break;
                case 22:
                    i3 = R.string.info_news;
                    break;
                case 23:
                    i3 = R.string.info_payment_card_security;
                    break;
                case 24:
                    i3 = R.string.info_politically_exposed_person;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    i3 = R.string.info_user_agreement_history;
                    break;
            }
            switch (y9xVar8.ordinal()) {
                case 0:
                    i4 = R.drawable.ic_glyph_info;
                    break;
                case 1:
                    i4 = R.drawable.ic_glyph_social_network;
                    break;
                case 2:
                    i4 = R.drawable.ic_glyph_phone;
                    break;
                case 3:
                case 9:
                case 11:
                case 12:
                case 13:
                case 17:
                case 18:
                case 23:
                case 24:
                    i4 = R.drawable.ic_glyph_rules;
                    break;
                case 4:
                    i4 = R.drawable.ic_glyph_wallet;
                    break;
                case 5:
                    i4 = R.drawable.ic_glyph_question;
                    break;
                case 6:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    i4 = R.drawable.ic_glyph_partners;
                    break;
                case 7:
                    i4 = R.drawable.ic_glyph_license;
                    break;
                case 8:
                    i4 = R.drawable.ic_glyph_tournaments;
                    break;
                case 10:
                    i4 = R.drawable.ic_glyph_responsible_gambling;
                    break;
                case 14:
                    i4 = R.drawable.ic_glyph_gift_coin;
                    break;
                case 15:
                case 16:
                default:
                    i4 = 0;
                    break;
                case 20:
                    i4 = R.drawable.ic_info_agent;
                    break;
                case 21:
                    i4 = R.drawable.ic_glyph_gambling_problem;
                    break;
                case 22:
                    i4 = R.drawable.ic_glyph_chat;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    i4 = R.drawable.ic_glyph_search_info;
                    break;
            }
            arrayList.add(new cax(i7, i3, i4, l9xVar));
        }
    }

    private final Object m(Object obj) {
        kmq kmqVar = (kmq) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            if (this.k && ((c260) ((v360) this.m).D()).m) {
                this.l = null;
                this.j = true;
                if (kmqVar.a(mz50.f22637a, this) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0084  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0104 A[RETURN] */
    private final Object o(Object obj) {
        Object objL;
        p7m0 p7m0Var;
        Object value;
        p7m0 p7m0Var2;
        Object value2;
        Object value3;
        Object value4;
        bs60 bs60Var = (bs60) this.m;
        ocj ocjVar = bs60Var.i;
        Pair pair = (Pair) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            pat patVar = (pat) pair.f46059a;
            pat patVar2 = (pat) pair.b;
            if (((w370) bs60Var.D()).i) {
                patVar.getClass();
                if (!(patVar instanceof oat)) {
                    patVar2.getClass();
                    if (!(patVar2 instanceof oat)) {
                        if (((w370) bs60Var.D()).i) {
                            patVar.getClass();
                            if (patVar instanceof nat) {
                                patVar2.getClass();
                                if (patVar2 instanceof lat) {
                                    p7m0Var2 = ocjVar.f25029a;
                                    do {
                                        value2 = p7m0Var2.getValue();
                                        value2.getClass();
                                    } while (!p7m0Var2.m(value2, w370.a((w370) value2, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                                    bs60Var.Z();
                                } else {
                                    if (((w370) bs60Var.D()).i) {
                                        patVar.getClass();
                                        if (!(patVar instanceof mat)) {
                                            patVar2.getClass();
                                            if (patVar2 instanceof mat) {
                                            }
                                        }
                                        p7m0Var = ocjVar.f25029a;
                                        do {
                                            value = p7m0Var.getValue();
                                            value.getClass();
                                        } while (!p7m0Var.m(value, w370.a((w370) value, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                                        bs60Var.Y();
                                    }
                                    jtj jtjVar = bs60Var.S;
                                    this.l = null;
                                    this.j = true;
                                    objL = jtj.l(jtjVar, this);
                                    if (objL == wneVar) {
                                        return wneVar;
                                    }
                                }
                            } else {
                                if (((w370) bs60Var.D()).i) {
                                    patVar.getClass();
                                    if (!(patVar instanceof mat)) {
                                        patVar2.getClass();
                                        if (patVar2 instanceof mat) {
                                        }
                                    }
                                    p7m0Var = ocjVar.f25029a;
                                    do {
                                        value = p7m0Var.getValue();
                                        value.getClass();
                                    } while (!p7m0Var.m(value, w370.a((w370) value, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                                    bs60Var.Y();
                                }
                                jtj jtjVar2 = bs60Var.S;
                                this.l = null;
                                this.j = true;
                                objL = jtj.l(jtjVar2, this);
                                if (objL == wneVar) {
                                    return wneVar;
                                }
                            }
                        } else {
                            if (((w370) bs60Var.D()).i) {
                                patVar.getClass();
                                if (!(patVar instanceof mat)) {
                                    patVar2.getClass();
                                    if (patVar2 instanceof mat) {
                                    }
                                }
                                p7m0Var = ocjVar.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                } while (!p7m0Var.m(value, w370.a((w370) value, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                                bs60Var.Y();
                            }
                            jtj jtjVar3 = bs60Var.S;
                            this.l = null;
                            this.j = true;
                            objL = jtj.l(jtjVar3, this);
                            if (objL == wneVar) {
                                return wneVar;
                            }
                        }
                    }
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, w370.a((w370) value3, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                bs60Var.a0();
            } else if (((w370) bs60Var.D()).i) {
                patVar.getClass();
                if (patVar instanceof nat) {
                    patVar2.getClass();
                    if (patVar2 instanceof lat) {
                        p7m0Var2 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                        } while (!p7m0Var2.m(value2, w370.a((w370) value2, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                        bs60Var.Z();
                    } else {
                        if (((w370) bs60Var.D()).i) {
                            patVar.getClass();
                            if (!(patVar instanceof mat)) {
                                patVar2.getClass();
                                if (patVar2 instanceof mat) {
                                }
                            }
                            p7m0Var = ocjVar.f25029a;
                            do {
                                value = p7m0Var.getValue();
                                value.getClass();
                            } while (!p7m0Var.m(value, w370.a((w370) value, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                            bs60Var.Y();
                        }
                        jtj jtjVar4 = bs60Var.S;
                        this.l = null;
                        this.j = true;
                        objL = jtj.l(jtjVar4, this);
                        if (objL == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (((w370) bs60Var.D()).i) {
                        patVar.getClass();
                        if (!(patVar instanceof mat)) {
                            patVar2.getClass();
                            if (patVar2 instanceof mat) {
                            }
                        }
                        p7m0Var = ocjVar.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                        } while (!p7m0Var.m(value, w370.a((w370) value, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                        bs60Var.Y();
                    }
                    jtj jtjVar5 = bs60Var.S;
                    this.l = null;
                    this.j = true;
                    objL = jtj.l(jtjVar5, this);
                    if (objL == wneVar) {
                        return wneVar;
                    }
                }
            } else {
                if (((w370) bs60Var.D()).i) {
                    patVar.getClass();
                    if (!(patVar instanceof mat)) {
                        patVar2.getClass();
                        if (patVar2 instanceof mat) {
                        }
                    }
                    p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, w370.a((w370) value, false, false, null, null, null, null, null, false, false, false, false, 16382)));
                    bs60Var.Y();
                }
                jtj jtjVar6 = bs60Var.S;
                this.l = null;
                this.j = true;
                objL = jtj.l(jtjVar6, this);
                if (objL == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        objL = obj;
        List list = (List) objL;
        int iB = bs60Var.G.b();
        lxl lxlVar = new lxl(0L, (dyl) new xxl(bs60Var.B.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), false, ((long) iB) == 0 ? uxl.b : uxl.f36445a, (cwl) null, 108);
        ArrayList<f8b> arrayList = new ArrayList();
        for (Object obj2 : list) {
            String strValueOf = String.valueOf(((f8b) obj2).f9097a);
            nek nekVar = y4t.c;
            if (!Intrinsics.d(strValueOf, "160291")) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (f8b f8bVar : arrayList) {
            arrayList2.add(new lxl(f8bVar.f9097a, (dyl) new xxl(f8bVar.b), false, f8bVar.f9097a == iB ? uxl.b : uxl.f36445a, (cwl) null, 108));
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(kotlin.collections.a.c(lxlVar), arrayList2);
        if (arrayListQ0.size() <= 1) {
            bs60Var.W(false);
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value4 = p7m0Var4.getValue();
                value4.getClass();
            } while (!p7m0Var4.m(value4, w370.a((w370) value4, false, false, null, null, null, null, null, false, false, false, false, 16382)));
        } else {
            bs60Var.V(iB, arrayListQ0, this.k);
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        kmq kmqVar = (kmq) this.l;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            if (this.k) {
                opt optVar = ((gz70) this.m).k;
                i89 i89Var = new i89(sj3.S(((i7e) optVar.f25659a.c).j, 100L), (byte) 8);
                gc1 gc1Var = new gc1((Object) optVar, yjeVar, (byte) 19);
                this.l = null;
                this.j = true;
                f7k.J(kmqVar);
                Object objC = i89Var.c(new vnq(kmqVar, gc1Var, (byte) 2), this);
                if (objC != wneVar) {
                    objC = Unit.f46060a;
                }
                if (objC != wneVar) {
                    objC = Unit.f46060a;
                }
                if (objC == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            if (this.k) {
                d9z d9zVar = (d9z) this.l;
                this.j = true;
                if (d9zVar.l(0, 0, this) == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        ((Function0) this.m).invoke();
        return Unit.f46060a;
    }

    private final Object t(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            o3c o3cVar = ((kgb0) this.l).D;
            this.j = true;
            if (o3c.p(o3cVar, this.k, this, 2) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        ((ssa0) this.m).invoke();
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.k;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 0);
            case 1:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 1);
            case 2:
                return new ys8(this.k, this.l, obj2, yjeVar, (byte) 2);
            case 3:
                return new ys8((rzj) this.l, yjeVar, z, (LinkedHashSet) obj2);
            case 4:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 4);
            case 5:
                return new ys8(this.l, this.k, obj2, yjeVar, (byte) 5);
            case 6:
                return new ys8(this.l, this.k, obj2, yjeVar, (byte) 6);
            case 7:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 7);
            case 8:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 8);
            case 9:
                return new ys8(this.l, this.k, obj2, yjeVar, (byte) 9);
            case 10:
                ys8 ys8Var = new ys8(obj2, z, yjeVar, (byte) 10);
                ys8Var.l = obj;
                return ys8Var;
            case 11:
                ys8 ys8Var2 = new ys8(z, obj2, yjeVar, (byte) 11);
                ys8Var2.l = obj;
                return ys8Var2;
            case 12:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 12);
            case 13:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 13);
            case 14:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 14);
            case 15:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 15);
            case 16:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 16);
            case 17:
                return new ys8(obj2, z, yjeVar, (byte) 17);
            case 18:
                return new ys8(this.l, this.k, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 19);
            case 20:
                return new ys8(obj2, z, yjeVar, (byte) 20);
            case 21:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 21);
            case 22:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 22);
            case 23:
                return new ys8(this.l, this.k, obj2, yjeVar, (byte) 23);
            case 24:
                ys8 ys8Var3 = new ys8(z, obj2, yjeVar, (byte) 24);
                ys8Var3.l = obj;
                return ys8Var3;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ys8 ys8Var4 = new ys8(obj2, z, yjeVar, (byte) 25);
                ys8Var4.l = obj;
                return ys8Var4;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ys8 ys8Var5 = new ys8(z, obj2, yjeVar, (byte) 26);
                ys8Var5.l = obj;
                return ys8Var5;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ys8(this.k, this.l, obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new ys8(this.l, this.k, obj2, yjeVar, (byte) 28);
            default:
                return new ys8(this.l, obj2, this.k, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ys8) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ys8) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ys8) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ys8) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ys8) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ys8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:23:0x00af A[LOOP:0: B:21:0x00a6->B:23:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:466:0x0b30  */
    /* JADX WARN: Code duplicated, block: B:469:0x0b3c  */
    /* JADX WARN: Code duplicated, block: B:499:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v5 java.lang.Object, still in use, count: 2, list:
          (r4v5 java.lang.Object) from 0x0b2c: PHI (r4 I:??) = (r4v2 java.lang.Object), (r4v5 java.lang.Object) binds: [B:463:0x0b2b, B:541:0x0b2c] A[DONT_GENERATE, DONT_INLINE]
          (r4v5 java.lang.Object) from 0x0b22: CHECK_CAST (a.qhj) (r4v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 3072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ys8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys8(Object obj, Object obj2, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys8(Object obj, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys8(Object obj, boolean z, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = z;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys8(boolean z, Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys8(boolean z, Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = obj;
        this.m = obj2;
    }
}
