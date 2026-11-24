package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.text.BidiFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.favorites.impl.presentation.screen.category_image_header.models.CategoryImageHeaderTab;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes4.dex */
public final class m72 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21298a;
    public final ctf0 b;

    public m72(ctf0 ctf0Var, byte b) {
        this.f21298a = b;
        ctf0Var.getClass();
        switch (b) {
            case 1:
                this.b = ctf0Var;
                break;
            case 2:
                this.b = ctf0Var;
                break;
            case 3:
                this.b = ctf0Var;
                break;
            case 4:
                this.b = ctf0Var;
                break;
            case 5:
                this.b = ctf0Var;
                break;
            case 6:
                this.b = ctf0Var;
                break;
            case 7:
                this.b = ctf0Var;
                break;
            case 8:
                this.b = ctf0Var;
                break;
            case 9:
                this.b = ctf0Var;
                break;
            case 10:
                this.b = ctf0Var;
                break;
            case 11:
                this.b = ctf0Var;
                break;
            case 12:
                this.b = ctf0Var;
                break;
            case 13:
                this.b = ctf0Var;
                break;
            case 14:
                this.b = ctf0Var;
                break;
            case 15:
                this.b = ctf0Var;
                break;
            case 16:
                this.b = ctf0Var;
                break;
            case 17:
                this.b = ctf0Var;
                break;
            case 18:
                this.b = ctf0Var;
                break;
            default:
                this.b = ctf0Var;
                break;
        }
    }

    public static l0l0 A(v5l0 v5l0Var) {
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            return g0l0.f10465a;
        }
        if (iOrdinal == 1) {
            return k0l0.f17474a;
        }
        if (iOrdinal == 2) {
            return j0l0.f15687a;
        }
        if (iOrdinal == 3) {
            return i0l0.f13953a;
        }
        if (iOrdinal == 4) {
            return h0l0.f12241a;
        }
        t9f.b();
        return null;
    }

    public static ArrayList a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d0t d0tVar = (d0t) obj;
            if (StringsKt.O(d0tVar.i, str, true) || StringsKt.O(d0tVar.J, str, true) || StringsKt.O(d0tVar.I, str, true) || StringsKt.O(d0tVar.q.b, str, true) || StringsKt.O(d0tVar.r.b, str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    public static ArrayList b(z4b z4bVar) {
        CategoryImageHeaderTab[] categoryImageHeaderTabArrValues = CategoryImageHeaderTab.values();
        ArrayList arrayList = new ArrayList();
        for (CategoryImageHeaderTab categoryImageHeaderTab : categoryImageHeaderTabArrValues) {
            int iOrdinal = categoryImageHeaderTab.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2 || ((z4bVar != null && z4bVar.d) || (z4bVar != null && z4bVar.e))) {
                    arrayList.add(categoryImageHeaderTab);
                }
            } else if (z4bVar != null && z4bVar.c) {
                arrayList.add(categoryImageHeaderTab);
            }
        }
        return arrayList;
    }

    public static gmm c(w6r0 w6r0Var) {
        a8z a8zVarA = maz.a(wez.b, new joq0((byte) 13));
        m7r0 m7r0Var = w6r0Var.d;
        Boolean bool = w6r0Var.k;
        boolean z = w6r0Var.c;
        if (m7r0Var != m7r0.b) {
            boolean z2 = w6r0Var.b;
            int i = z2 ? R.drawable.ic_glyph_video_active : R.drawable.ic_glyph_video_inactive;
            boolean z3 = w6r0Var.n;
            pz40 pz40Var = s6t0.f31722a;
            wkm wkmVar = new wkm(1, i, z3, ra50.f30118a, z2 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary());
            if (z && Intrinsics.d(bool, Boolean.TRUE)) {
                return new dmm(new ta50(wkmVar));
            }
            if (!z) {
                return Intrinsics.d(bool, Boolean.TRUE) ? new dmm(new va50((wkm) a8zVarA.getValue(), wkmVar)) : new dmm(new ta50((wkm) a8zVarA.getValue()));
            }
        } else if (!z) {
            return new dmm(new ta50((wkm) a8zVarA.getValue()));
        }
        return fmm.f9790a;
    }

    public static int d(w6r0 w6r0Var) {
        int iOrdinal = w6r0Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return 1;
            }
            t9f.b();
        }
        return 0;
    }

    public static a4x e() {
        ArrayList arrayList = new ArrayList(15);
        for (int i = 0; i < 15; i++) {
            arrayList.add(new wjp0(String.valueOf(i)));
        }
        return dyb.o0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x012b  */
    /* JADX WARN: Code duplicated, block: B:51:0x012e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0148  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:72:0x018b  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a2  */
    public static a4x f(hg2 hg2Var) {
        lc00 lc00VarB;
        boolean z;
        boolean z2;
        boolean z3;
        lc00 lc00VarA;
        int i;
        boolean z4;
        int i2;
        boolean z5;
        ull0 ull0Var;
        boolean z6 = hg2Var != null ? hg2Var.i : false;
        v5l0 v5l0Var = hg2Var != null ? hg2Var.f12998a : v5l0.MEDIUM_CARD_SMALL_TEAM_LOGO;
        if (hg2Var != null) {
            boolean z7 = hg2Var.k;
            if (hg2Var.e) {
                lc00 lc00VarB2 = kotlin.collections.a.b();
                lc00VarB2.add(new hsv("KEY_LIVE", new ijm()));
                if (z6) {
                    lc00VarB2.add(new bws(new x56(A(v5l0Var)), z7, z6));
                    lc00VarB2.add(new bws(new x56(A(v5l0Var)), z7, z6));
                } else {
                    lc00VarB2.add(new bws(new x56(A(v5l0Var)), z7, z6));
                }
                lc00VarB2.add(new hsv("KEY_LINE", new ijm()));
                if (z6) {
                    lc00VarB2.add(new bws(new x56(A(v5l0Var)), z7, z6));
                    lc00VarB2.add(new bws(new x56(A(v5l0Var)), z7, z6));
                } else {
                    lc00VarB2.add(new bws(new x56(A(v5l0Var)), z7, z6));
                }
                lc00VarB2.add(new hsv("KEY_RESULTS", new ijm()));
                int iOrdinal = v5l0Var.ordinal();
                if (iOrdinal == 0) {
                    ull0Var = pll0.f27189a;
                } else if (iOrdinal == 1) {
                    ull0Var = tll0.f34152a;
                } else if (iOrdinal == 2) {
                    ull0Var = sll0.f32406a;
                } else if (iOrdinal == 3) {
                    ull0Var = rll0.f30703a;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    ull0Var = qll0.f28940a;
                }
                lc00VarB2.add(new bws(new mla(ull0Var), z7, false));
                lc00VarA = kotlin.collections.a.a(lc00VarB2);
            } else {
                lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(new hsv("KEY_LIVE", new ijm()));
                if (z6) {
                    for (i2 = 0; i2 < 4; i2++) {
                        x56 x56Var = new x56(A(v5l0Var));
                        if (hg2Var == null && hg2Var.k) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        lc00VarB.add(new bws(x56Var, z5, z6));
                    }
                } else {
                    x56 x56Var2 = new x56(A(v5l0Var));
                    if (hg2Var != null) {
                        z = hg2Var.k;
                    } else {
                        z = false;
                    }
                    lc00VarB.add(new bws(x56Var2, z, z6));
                    x56 x56Var3 = new x56(A(v5l0Var));
                    if (hg2Var == null && hg2Var.k) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    lc00VarB.add(new bws(x56Var3, z2, z6));
                }
                lc00VarB.add(new hsv("KEY_LINE", new ijm()));
                if (z6) {
                    for (i = 0; i < 4; i++) {
                        x56 x56Var4 = new x56(A(v5l0Var));
                        if (hg2Var == null && hg2Var.k) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        lc00VarB.add(new bws(x56Var4, z4, z6));
                    }
                } else {
                    x56 x56Var5 = new x56(A(v5l0Var));
                    if (hg2Var != null) {
                        z3 = hg2Var.k;
                    } else {
                        z3 = false;
                    }
                    lc00VarB.add(new bws(x56Var5, z3, z6));
                    lc00VarB.add(new bws(new x56(A(v5l0Var)), hg2Var != null ? hg2Var.k : false, z6));
                }
                lc00VarA = kotlin.collections.a.a(lc00VarB);
            }
        } else {
            lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(new hsv("KEY_LIVE", new ijm()));
            if (z6) {
                while (i2 < 4) {
                    x56 x56Var6 = new x56(A(v5l0Var));
                    if (hg2Var == null) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    lc00VarB.add(new bws(x56Var6, z5, z6));
                }
            } else {
                x56 x56Var7 = new x56(A(v5l0Var));
                if (hg2Var != null) {
                    z = hg2Var.k;
                } else {
                    z = false;
                }
                lc00VarB.add(new bws(x56Var7, z, z6));
                x56 x56Var8 = new x56(A(v5l0Var));
                if (hg2Var == null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                lc00VarB.add(new bws(x56Var8, z2, z6));
            }
            lc00VarB.add(new hsv("KEY_LINE", new ijm()));
            if (z6) {
                while (i < 4) {
                    x56 x56Var9 = new x56(A(v5l0Var));
                    if (hg2Var == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    lc00VarB.add(new bws(x56Var9, z4, z6));
                }
            } else {
                x56 x56Var10 = new x56(A(v5l0Var));
                if (hg2Var != null) {
                    z3 = hg2Var.k;
                } else {
                    z3 = false;
                }
                lc00VarB.add(new bws(x56Var10, z3, z6));
                lc00VarB.add(new bws(new x56(A(v5l0Var)), hg2Var != null ? hg2Var.k : false, z6));
            }
            lc00VarA = kotlin.collections.a.a(lc00VarB);
        }
        return dyb.o0(lc00VarA);
    }

    public static a4x g(xte xteVar) {
        ArrayList arrayList = new ArrayList(15);
        for (int i = 0; i < 15; i++) {
            arrayList.add(new rbs0(String.valueOf(i), new s7p(xteVar)));
        }
        return dyb.o0(arrayList);
    }

    public static a4x h() {
        ArrayList arrayList = new ArrayList(15);
        for (int i = 0; i < 15; i++) {
            arrayList.add(new n5s0(String.valueOf(i)));
        }
        return dyb.o0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:221:0x0e1e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0e53 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x0e55  */
    /* JADX WARN: Code duplicated, block: B:229:0x0e6a  */
    /* JADX WARN: Code duplicated, block: B:231:0x0e6e  */
    /* JADX WARN: Code duplicated, block: B:236:0x0e7b  */
    /* JADX WARN: Code duplicated, block: B:238:0x0e7f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0f0b  */
    /* JADX WARN: Code duplicated, block: B:244:0x0f0f  */
    /* JADX WARN: Code duplicated, block: B:245:0x0f2f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0117  */
    private final Object k(Object obj) {
        ug2 ug2Var;
        boolean z;
        boolean z2;
        lde jdeVar;
        lde edeVar;
        lde jdeVar2;
        Throwable th;
        int i;
        int i2;
        v5l0 v5l0Var;
        lc00 lc00Var;
        hg2 hg2Var;
        Iterator it;
        Object next;
        ctf0 ctf0Var;
        ArrayList arrayList;
        List list;
        a2n glaVar;
        a2n klaVar;
        a2n glaVar2;
        boolean z3;
        boolean z4;
        ctf0 ctf0Var2;
        wcb wcbVar;
        a2n klaVar2;
        kla klaVar3;
        a2n hlaVar;
        ug2 ug2Var2 = (ug2) obj;
        ug2Var2.getClass();
        String str = ug2Var2.j;
        hat hatVar = ug2Var2.c;
        boolean z5 = ug2Var2.b;
        boolean z6 = hatVar instanceof eat;
        boolean z7 = z6 && !aad.Q((eat) hatVar);
        boolean z8 = z5 && z6 && !aad.Q((eat) hatVar);
        boolean z9 = ug2Var2.k;
        boolean z10 = z6 && !aad.Q((eat) hatVar);
        boolean z11 = z5 && z6 && !aad.Q((eat) hatVar);
        pz40 pz40Var = s6t0.f31722a;
        long secondary = s6t0.b().f33626a.getSecondary();
        ra50 ra50Var = ra50.f30118a;
        wkm wkmVar = new wkm(0, R.drawable.ic_glyph_search, z10, ra50Var, secondary);
        wkm wkmVar2 = new wkm(1, R.drawable.ic_glyph_trash, z11, ra50Var, s6t0.b().f33626a.getSecondary());
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        ctf0 ctf0Var3 = this.b;
        imm immVar = new imm(ilmVar, (z9 && z10) ? new nlm(new hmm(2, str, ctf0Var3.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), true)) : new plm(ctf0Var3.b.a(R.string.events, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(!z9 ? new va50(wkmVar, wkmVar2) : new ta50(wkmVar2)), s6t0.b().f33626a.getBackgroundContent(), true, null);
        hg2 hg2Var2 = ug2Var2.f35602a;
        if (hg2Var2 != null) {
            v5l0 v5l0Var2 = hg2Var2.f12998a;
            if (hatVar instanceof fat) {
                ug2Var = ug2Var2;
                z = z7;
                z2 = z8;
                jdeVar = new jde(f(hg2Var2));
            } else if (z6) {
                eat eatVar = (eat) hatVar;
                Set set = ug2Var2.h;
                ArrayList arrayListA = a(str, eatVar.f7485a);
                ArrayList arrayListA2 = a(str, eatVar.b);
                List list2 = eatVar.c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    l2g0 l2g0Var = (l2g0) obj2;
                    if (StringsKt.O(l2g0Var.g, str, true) || StringsKt.O(l2g0Var.l, str, true) || StringsKt.O(l2g0Var.m, str, true)) {
                        arrayList2.add(obj2);
                    }
                }
                lc00 lc00VarB = kotlin.collections.a.b();
                if (arrayListA.isEmpty()) {
                    v5l0Var = v5l0Var2;
                } else {
                    lc00VarB.add(new hsv("KEY_LIVE", new hjm(ctf0Var3.b.a(R.string.live_games_new, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, true, null, null, false, null, null, 8126)));
                    v5l0Var = v5l0Var2;
                    lc00VarB.addAll(z(arrayListA, hg2Var2.g, this.b, hg2Var2.d, hg2Var2.b, v5l0Var, hg2Var2.f, hg2Var2.h, hg2Var2.i, hg2Var2.k));
                }
                if (!arrayListA2.isEmpty()) {
                    lc00VarB.add(new hsv("KEY_LINE", new hjm(ctf0Var3.b.a(R.string.line_games, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                    lc00VarB.addAll(z(arrayListA2, hg2Var2.g, this.b, hg2Var2.d, hg2Var2.b, v5l0Var, hg2Var2.f, hg2Var2.h, hg2Var2.i, hg2Var2.k));
                }
                if (arrayList2.isEmpty() || !hg2Var2.e) {
                    ug2Var = ug2Var2;
                    lc00Var = lc00VarB;
                    hg2Var = hg2Var2;
                    z = z7;
                    z2 = z8;
                } else {
                    lc00VarB.add(new hsv("KEY_RESULTS", new hjm(ctf0Var3.b.a(R.string.results, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                    List list3 = hg2Var2.h;
                    wcb wcbVar2 = hg2Var2.g;
                    boolean z12 = hg2Var2.k;
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        l2g0 l2g0Var2 = (l2g0) it2.next();
                        Iterator it3 = list3.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                it = it2;
                                next = null;
                                break;
                            }
                            next = it3.next();
                            it = it2;
                            if (((lok0) next).f20396a == l2g0Var2.w) {
                                break;
                            }
                            it2 = it;
                        }
                        lok0 lok0Var = (lok0) next;
                        boolean z13 = z7;
                        boolean z14 = z8;
                        long j = l2g0Var2.f19307a;
                        String str2 = l2g0Var2.m;
                        boolean zContains = set.contains(Long.valueOf(j));
                        boolean z15 = lok0Var != null ? lok0Var.p : false;
                        wcbVar2.getClass();
                        ctf0Var3.getClass();
                        boolean z16 = l2g0Var2.v;
                        Set set2 = set;
                        List list4 = l2g0Var2.o;
                        List list5 = l2g0Var2.n;
                        String str3 = l2g0Var2.l;
                        ug2 ug2Var3 = ug2Var2;
                        String str4 = l2g0Var2.u;
                        hg2 hg2Var3 = hg2Var2;
                        String str5 = l2g0Var2.p;
                        boolean z17 = z12;
                        long j2 = l2g0Var2.c;
                        lc00 lc00Var2 = lc00VarB;
                        if (str2.length() == 0) {
                            int iOrdinal = v5l0Var.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    ctf0 ctf0Var4 = ctf0Var3;
                                    boolean z18 = z15;
                                    ctf0Var = ctf0Var4;
                                    glaVar2 = new kla(idx.C(l2g0Var2, list3, wcbVar2, zContains, z18), new oma(str3, new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.S(l2g0Var2, zContains), l2g0Var2.f19307a);
                                    wcbVar2 = wcbVar2;
                                    arrayList = arrayList3;
                                } else if (iOrdinal == 2) {
                                    ctf0 ctf0Var5 = ctf0Var3;
                                    boolean z19 = z15;
                                    ctf0Var = ctf0Var5;
                                    hlaVar = new jla(idx.B(l2g0Var2, list3, wcbVar2, zContains, z19), new ima(str3, thb.A(l2g0Var2, ctf0Var), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.Q(l2g0Var2, zContains), l2g0Var2.f19307a);
                                } else if (iOrdinal == 3) {
                                    String strO = thb.O(l2g0Var2, list3, wcbVar2);
                                    long j3 = l2g0Var2.f19307a;
                                    ctf0 ctf0Var6 = ctf0Var3;
                                    vma vmaVarA = idx.A(l2g0Var2, list3, wcbVar2, zContains, ctf0Var6, z15);
                                    ctf0Var = ctf0Var6;
                                    ila ilaVar = new ila(j3, x9x.O(l2g0Var2, zContains), vmaVarA, new cma(str3, new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), new n0x(strO));
                                    wcbVar2 = wcbVar2;
                                    arrayList = arrayList3;
                                    glaVar2 = ilaVar;
                                } else {
                                    if (iOrdinal != 4) {
                                        t9f.b();
                                        return null;
                                    }
                                    hlaVar = new hla(idx.z(l2g0Var2, list3, wcbVar2, zContains, z15), new wla(str3, thb.A(l2g0Var2, ctf0Var3), new jwm(zjb.x(j2, ctf0Var3, str5, str4)), null), x9x.N(l2g0Var2, zContains), l2g0Var2.f19307a);
                                    arrayList = arrayList3;
                                    ctf0Var = ctf0Var3;
                                }
                                list = list3;
                                ArrayList arrayList4 = arrayList;
                                arrayList4.add(new bws(glaVar2, z17, false));
                                z12 = z17;
                                arrayList3 = arrayList4;
                                list3 = list;
                                ctf0Var3 = ctf0Var;
                                wcbVar2 = wcbVar2;
                                it2 = it;
                                set = set2;
                                hg2Var2 = hg2Var3;
                                lc00VarB = lc00Var2;
                                z7 = z13;
                                z8 = z14;
                                ug2Var2 = ug2Var3;
                            } else {
                                ctf0 ctf0Var7 = ctf0Var3;
                                boolean z20 = z15;
                                ctf0Var = ctf0Var7;
                                hlaVar = new gla(idx.y(l2g0Var2, list3, wcbVar2, z20), new qla(str3, new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.M(l2g0Var2, ctf0Var, zContains), l2g0Var2.f19307a);
                            }
                            arrayList = arrayList3;
                        } else {
                            ctf0 ctf0Var8 = ctf0Var3;
                            boolean z21 = z15;
                            ctf0Var = ctf0Var8;
                            if (66 == j2 || 99 == j2) {
                                arrayList = arrayList3;
                                wcb wcbVar3 = wcbVar2;
                                list = list3;
                                int iOrdinal2 = v5l0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 == 1) {
                                        ctf0Var = ctf0Var;
                                        wcbVar2 = wcbVar3;
                                        klaVar = new kla(idx.C(l2g0Var2, list, wcbVar2, zContains, z21), new mma(new vzm(str3, thb.E(l2g0Var2)), new vzm(str2, thb.K(l2g0Var2)), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.S(l2g0Var2, zContains), l2g0Var2.f19307a);
                                    } else if (iOrdinal2 == 2) {
                                        ctf0Var = ctf0Var;
                                        wcbVar2 = wcbVar3;
                                        long j4 = l2g0Var2.f19307a;
                                        wma wmaVarB = idx.B(l2g0Var2, list, wcbVar2, zContains, z21);
                                        d280 d280VarM = thb.M(list5, z16);
                                        d280 d280VarN = thb.N(list4, z16);
                                        String str6 = l2g0Var2.l;
                                        String strE = thb.E(l2g0Var2);
                                        String strK = thb.K(l2g0Var2);
                                        pz40 pz40Var2 = s6t0.f31722a;
                                        klaVar = new jla(wmaVarB, new gma(d280VarM, d280VarN, str6, strE, s6t0.b().f33626a.getTextPrimary(), str2, strK, s6t0.b().f33626a.getTextPrimary(), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.Q(l2g0Var2, zContains), j4);
                                    } else if (iOrdinal2 == 3) {
                                        String strO2 = thb.O(l2g0Var2, list, wcbVar3);
                                        long j5 = l2g0Var2.f19307a;
                                        vma vmaVarA2 = idx.A(l2g0Var2, list, wcbVar3, zContains, ctf0Var, z21);
                                        wcbVar2 = wcbVar3;
                                        ctf0Var = ctf0Var;
                                        d280 d280VarM2 = thb.M(list5, z16);
                                        d280 d280VarN2 = thb.N(list4, z16);
                                        String str7 = l2g0Var2.l;
                                        String strE2 = thb.E(l2g0Var2);
                                        String strK2 = thb.K(l2g0Var2);
                                        pz40 pz40Var3 = s6t0.f31722a;
                                        glaVar = new ila(j5, x9x.O(l2g0Var2, zContains), vmaVarA2, new ama(d280VarM2, d280VarN2, str7, strE2, s6t0.b().f33626a.getTextPrimary(), str2, strK2, s6t0.b().f33626a.getTextPrimary(), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), new n0x(strO2));
                                    } else {
                                        if (iOrdinal2 != 4) {
                                            t9f.b();
                                            return null;
                                        }
                                        long j6 = l2g0Var2.f19307a;
                                        uma umaVarZ = idx.z(l2g0Var2, list, wcbVar3, zContains, z21);
                                        d280 d280VarM3 = thb.M(list5, z16);
                                        d280 d280VarN3 = thb.N(list4, z16);
                                        String str8 = l2g0Var2.l;
                                        String strE3 = thb.E(l2g0Var2);
                                        String strK3 = thb.K(l2g0Var2);
                                        pz40 pz40Var4 = s6t0.f31722a;
                                        klaVar = new hla(umaVarZ, new ula(d280VarM3, d280VarN3, str8, strE3, s6t0.b().f33626a.getTextPrimary(), str2, strK3, s6t0.b().f33626a.getTextPrimary(), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.N(l2g0Var2, zContains), j6);
                                        wcbVar2 = wcbVar3;
                                        ctf0Var = ctf0Var;
                                    }
                                    glaVar2 = klaVar;
                                } else {
                                    ctf0Var = ctf0Var;
                                    wcbVar2 = wcbVar3;
                                    long j7 = l2g0Var2.f19307a;
                                    tma tmaVarY = idx.y(l2g0Var2, list, wcbVar2, z21);
                                    d280 d280VarM4 = thb.M(list5, z16);
                                    d280 d280VarN4 = thb.N(list4, z16);
                                    String str9 = l2g0Var2.l;
                                    String strE4 = thb.E(l2g0Var2);
                                    String strK4 = thb.K(l2g0Var2);
                                    pz40 pz40Var5 = s6t0.f31722a;
                                    glaVar = new gla(tmaVarY, new ola(d280VarM4, d280VarN4, str9, strE4, s6t0.b().f33626a.getTextPrimary(), str2, strK4, s6t0.b().f33626a.getTextPrimary(), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.M(l2g0Var2, ctf0Var, zContains), j7);
                                }
                                glaVar2 = glaVar;
                            } else {
                                if (z16) {
                                    z3 = z21;
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = arrayList3;
                                    if (list5.size() == 2 && list4.size() == 2) {
                                        int iOrdinal3 = v5l0Var.ordinal();
                                        if (iOrdinal3 == 0) {
                                            ctf0Var = ctf0Var;
                                            List list6 = list3;
                                            glaVar2 = new gla(idx.y(l2g0Var2, list6, wcbVar2, z21), new sla(new w1n(str3, (d280) thb.I(list5, z16).f46059a, (d280) thb.I(list5, z16).b), new w1n(str2, (d280) thb.J(list4, z16).f46059a, (d280) thb.J(list4, z16).b), new t1n(thb.E(l2g0Var2), thb.K(l2g0Var2)), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.M(l2g0Var2, ctf0Var, zContains), l2g0Var2.f19307a);
                                            list = list6;
                                        } else if (iOrdinal3 == 1) {
                                            ctf0Var = ctf0Var;
                                            list3 = list3;
                                            klaVar3 = new kla(idx.C(l2g0Var2, list3, wcbVar2, zContains, z21), new qma(new vzm(str3, thb.E(l2g0Var2)), new vzm(str2, thb.K(l2g0Var2)), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.S(l2g0Var2, zContains), l2g0Var2.f19307a);
                                            list = list3;
                                            glaVar2 = klaVar3;
                                        } else if (iOrdinal3 == 2) {
                                            ctf0Var = ctf0Var;
                                            List list7 = list3;
                                            list3 = list7;
                                            klaVar = new jla(idx.B(l2g0Var2, list3, wcbVar2, zContains, z21), new kma(new wzm(str3, null, thb.E(l2g0Var2)), new wzm(str2, null, thb.K(l2g0Var2)), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.Q(l2g0Var2, zContains), l2g0Var2.f19307a);
                                            wcbVar2 = wcbVar2;
                                            list = list3;
                                            ctf0Var = ctf0Var;
                                            glaVar2 = klaVar;
                                        } else if (iOrdinal3 == 3) {
                                            glaVar = new ila(l2g0Var2.f19307a, x9x.O(l2g0Var2, zContains), idx.A(l2g0Var2, list3, wcbVar2, zContains, ctf0Var, z21), new ema(new w1n(str3, (d280) thb.I(list5, z16).f46059a, (d280) thb.I(list5, z16).b), new w1n(str2, (d280) thb.J(list4, z16).f46059a, (d280) thb.J(list4, z16).b), new u1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), thb.E(l2g0Var2), thb.K(l2g0Var2)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), new n0x(thb.O(l2g0Var2, list3, wcbVar2)));
                                            wcbVar2 = wcbVar2;
                                            ctf0Var = ctf0Var;
                                            list = list3;
                                            glaVar2 = glaVar;
                                        } else {
                                            if (iOrdinal3 != 4) {
                                                t9f.b();
                                                return null;
                                            }
                                            hlaVar = new hla(idx.z(l2g0Var2, list3, wcbVar2, zContains, z21), new yla(new w1n(str3, (d280) thb.I(list5, z16).f46059a, (d280) thb.I(list5, z16).b), new w1n(str2, (d280) thb.J(list4, z16).f46059a, (d280) thb.J(list4, z16).b), new v1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), thb.E(l2g0Var2), thb.K(l2g0Var2)), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.N(l2g0Var2, zContains), l2g0Var2.f19307a);
                                        }
                                        ctf0Var = ctf0Var;
                                    } else {
                                        z3 = z21;
                                    }
                                }
                                int size = list5.size();
                                opm opmVar = opm.f25648a;
                                if (size <= 2 || list4.size() <= 2) {
                                    wcb wcbVar4 = wcbVar2;
                                    int iOrdinal4 = v5l0Var.ordinal();
                                    if (iOrdinal4 != 0) {
                                        if (iOrdinal4 != 1) {
                                            if (iOrdinal4 == 2) {
                                                list = list3;
                                                ctf0Var2 = ctf0Var;
                                                boolean z22 = z3;
                                                wcbVar = wcbVar4;
                                                long j8 = l2g0Var2.f19307a;
                                                wma wmaVarB2 = idx.B(l2g0Var2, list, wcbVar, zContains, z22);
                                                wzm wzmVar = new wzm(str3, thb.M(list5, z16), thb.E(l2g0Var2));
                                                wzm wzmVar2 = new wzm(str2, thb.N(list4, z16), thb.K(l2g0Var2));
                                                jwm jwmVar = new jwm(thb.A(l2g0Var2, ctf0Var2));
                                                jwm jwmVar2 = new jwm(zjb.x(j2, ctf0Var2, str5, str4));
                                                String strA = ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                                                uso0 uso0Var = uso0.f36223a;
                                                klaVar2 = new jla(wmaVarB2, new jma(wzmVar, wzmVar2, strA, jwmVar, jwmVar2, null), x9x.Q(l2g0Var2, zContains), j8);
                                            } else if (iOrdinal4 == 3) {
                                                String strO3 = thb.O(l2g0Var2, list3, wcbVar4);
                                                List list8 = list3;
                                                long j9 = l2g0Var2.f19307a;
                                                vma vmaVarA3 = idx.A(l2g0Var2, list8, wcbVar4, zContains, ctf0Var, z3);
                                                list = list8;
                                                ctf0Var2 = ctf0Var;
                                                xzm xzmVar = new xzm(str3, thb.M(list5, z16));
                                                xzm xzmVar2 = new xzm(str2, thb.N(list4, z16));
                                                a2m a2mVarZ = thb.z(l2g0Var2);
                                                jwm jwmVar3 = new jwm(zjb.x(j2, ctf0Var2, str5, str4));
                                                uso0 uso0Var2 = uso0.f36223a;
                                                ila ilaVar2 = new ila(j9, x9x.O(l2g0Var2, zContains), vmaVarA3, new dma(xzmVar, xzmVar2, a2mVarZ, jwmVar3, null), new n0x(strO3));
                                                wcbVar2 = wcbVar4;
                                                glaVar2 = ilaVar2;
                                            } else {
                                                if (iOrdinal4 != 4) {
                                                    t9f.b();
                                                    return null;
                                                }
                                                long j10 = l2g0Var2.f19307a;
                                                wcbVar2 = wcbVar4;
                                                uma umaVarZ2 = idx.z(l2g0Var2, list3, wcbVar2, zContains, z3);
                                                yzm yzmVar = new yzm(str3, thb.M(list5, z16));
                                                yzm yzmVar2 = new yzm(str2, thb.N(list4, z16));
                                                a2m a2mVarZ2 = thb.z(l2g0Var2);
                                                String strA2 = thb.A(l2g0Var2, ctf0Var);
                                                jwm jwmVar4 = new jwm(zjb.x(j2, ctf0Var, str5, str4));
                                                uso0 uso0Var3 = uso0.f36223a;
                                                klaVar = new hla(umaVarZ2, new xla(yzmVar, yzmVar2, a2mVarZ2, strA2, jwmVar4, null), x9x.N(l2g0Var2, zContains), j10);
                                                wcbVar2 = wcbVar2;
                                                list = list3;
                                                ctf0Var = ctf0Var;
                                                glaVar2 = klaVar;
                                            }
                                            ctf0Var = ctf0Var2;
                                        } else {
                                            list = list3;
                                            ctf0Var2 = ctf0Var;
                                            boolean z23 = z3;
                                            wcbVar = wcbVar4;
                                            long j11 = l2g0Var2.f19307a;
                                            xma xmaVarC = idx.C(l2g0Var2, list, wcbVar, zContains, z23);
                                            vzm vzmVar = new vzm(str3, thb.E(l2g0Var2));
                                            vzm vzmVar2 = new vzm(str2, thb.K(l2g0Var2));
                                            jwm jwmVar5 = new jwm(thb.A(l2g0Var2, ctf0Var2));
                                            jwm jwmVar6 = new jwm(zjb.x(j2, ctf0Var2, str5, str4));
                                            uso0 uso0Var4 = uso0.f36223a;
                                            klaVar2 = new kla(xmaVarC, new pma(vzmVar, vzmVar2, jwmVar5, jwmVar6, null), x9x.S(l2g0Var2, zContains), j11);
                                        }
                                        wcbVar2 = wcbVar;
                                        glaVar2 = klaVar2;
                                        ctf0Var = ctf0Var2;
                                    } else {
                                        list = list3;
                                        long j12 = l2g0Var2.f19307a;
                                        tma tmaVarY2 = idx.y(l2g0Var2, list, wcbVar4, z3);
                                        uzm uzmVar = new uzm(str3, thb.M(list5, z16));
                                        uzm uzmVar2 = new uzm(str2, thb.N(list4, z16));
                                        t480 t480VarH = thb.H(l2g0Var2);
                                        List listP = xkb.P();
                                        if (listP != null && listP.isEmpty()) {
                                            z4 = false;
                                            break;
                                        }
                                        Iterator it4 = listP.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                z4 = false;
                                                break;
                                            }
                                            if (((yxg) it4.next()).b == j2) {
                                                z4 = true;
                                                break;
                                            }
                                        }
                                        mpm lpmVar = (t480VarH == null && z4) ? new lpm(opmVar, new hpm(0L, 3)) : new kpm(opmVar, new hpm(0L, 3), d5c.O(thb.E(l2g0Var2), thb.K(l2g0Var2), false, false, new hpm(0L, 3)));
                                        jwm jwmVar7 = new jwm(thb.A(l2g0Var2, ctf0Var));
                                        jwm jwmVar8 = new jwm(zjb.x(j2, ctf0Var, str5, str4));
                                        uso0 uso0Var5 = uso0.f36223a;
                                        glaVar2 = new gla(tmaVarY2, new rla(uzmVar, uzmVar2, lpmVar, jwmVar7, jwmVar8, null), x9x.M(l2g0Var2, ctf0Var, zContains), j12);
                                        ctf0Var = ctf0Var;
                                        wcbVar2 = wcbVar4;
                                    }
                                } else {
                                    int iOrdinal5 = v5l0Var.ordinal();
                                    if (iOrdinal5 == 0) {
                                        wcb wcbVar5 = wcbVar2;
                                        glaVar2 = new gla(idx.y(l2g0Var2, list3, wcbVar2, z3), new pla(new uzm(str3, null), new uzm(str2, null), new kpm(opmVar, new hpm(0L, 3), d5c.O(thb.E(l2g0Var2), thb.K(l2g0Var2), false, false, new hpm(0L, 3))), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.M(l2g0Var2, ctf0Var, zContains), l2g0Var2.f19307a);
                                        list = list3;
                                        ctf0Var = ctf0Var;
                                        wcbVar2 = wcbVar5;
                                    } else if (iOrdinal5 != 1) {
                                        if (iOrdinal5 == 2) {
                                            klaVar = new jla(idx.B(l2g0Var2, list3, wcbVar2, zContains, z3), new hma(new wzm(str3, null, thb.E(l2g0Var2)), new wzm(str2, null, thb.K(l2g0Var2)), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.Q(l2g0Var2, zContains), l2g0Var2.f19307a);
                                        } else if (iOrdinal5 == 3) {
                                            glaVar = new ila(l2g0Var2.f19307a, x9x.O(l2g0Var2, zContains), idx.A(l2g0Var2, list3, wcbVar2, zContains, ctf0Var, z3), new bma(new w1n(str3, null, null), new w1n(str2, null, null), new u1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), thb.E(l2g0Var2), thb.K(l2g0Var2)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), new n0x(thb.O(l2g0Var2, list3, wcbVar2)));
                                            wcbVar2 = wcbVar2;
                                            list = list3;
                                            ctf0Var = ctf0Var;
                                            glaVar2 = glaVar;
                                        } else {
                                            if (iOrdinal5 != 4) {
                                                t9f.b();
                                                return null;
                                            }
                                            klaVar = new hla(idx.z(l2g0Var2, list3, wcbVar2, zContains, z3), new vla(new w1n(str3, null, null), new w1n(str2, null, null), new v1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), thb.E(l2g0Var2), thb.K(l2g0Var2)), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.N(l2g0Var2, zContains), l2g0Var2.f19307a);
                                        }
                                        wcbVar2 = wcbVar2;
                                        list = list3;
                                        ctf0Var = ctf0Var;
                                        glaVar2 = klaVar;
                                    } else {
                                        klaVar3 = new kla(idx.C(l2g0Var2, list3, wcbVar2, zContains, z3), new nma(new vzm(str3, thb.E(l2g0Var2)), new vzm(str2, thb.K(l2g0Var2)), new jwm(thb.A(l2g0Var2, ctf0Var)), new jwm(zjb.x(j2, ctf0Var, str5, str4)), null), x9x.S(l2g0Var2, zContains), l2g0Var2.f19307a);
                                        list = list3;
                                        glaVar2 = klaVar3;
                                        ctf0Var = ctf0Var;
                                    }
                                }
                            }
                            ArrayList arrayList5 = arrayList;
                            arrayList5.add(new bws(glaVar2, z17, false));
                            z12 = z17;
                            arrayList3 = arrayList5;
                            list3 = list;
                            ctf0Var3 = ctf0Var;
                            wcbVar2 = wcbVar2;
                            it2 = it;
                            set = set2;
                            hg2Var2 = hg2Var3;
                            lc00VarB = lc00Var2;
                            z7 = z13;
                            z8 = z14;
                            ug2Var2 = ug2Var3;
                        }
                        glaVar2 = hlaVar;
                        list = list3;
                        ArrayList arrayList6 = arrayList;
                        arrayList6.add(new bws(glaVar2, z17, false));
                        z12 = z17;
                        arrayList3 = arrayList6;
                        list3 = list;
                        ctf0Var3 = ctf0Var;
                        wcbVar2 = wcbVar2;
                        it2 = it;
                        set = set2;
                        hg2Var2 = hg2Var3;
                        lc00VarB = lc00Var2;
                        z7 = z13;
                        z8 = z14;
                        ug2Var2 = ug2Var3;
                    }
                    ug2Var = ug2Var2;
                    lc00Var = lc00VarB;
                    hg2Var = hg2Var2;
                    z = z7;
                    z2 = z8;
                    lc00Var.addAll(arrayList3);
                }
                a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00Var));
                if (a4xVarO0.isEmpty()) {
                    jdeVar2 = new ade(g2v.b(hg2Var.j, pb10.e, null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                    edeVar = jdeVar2;
                } else {
                    jdeVar = new ede(a4xVarO0);
                }
            } else {
                ug2Var = ug2Var2;
                z = z7;
                z2 = z8;
                boolean z24 = hatVar instanceof gat;
                if (z24) {
                    gat gatVar = (gat) hatVar;
                    if (!gatVar.f10986a.isEmpty() || gatVar.b == null) {
                        if (!z24 && ((gat) hatVar).f10986a.isEmpty()) {
                            jdeVar2 = new vce(new xfe0(g2v.b(hg2Var2.j, pb10.g, pdm.b, null, R.drawable.ic_glyph_circle_multievent, R.string.empty_favorites_games_title, R.string.empty_favorites_games, 0, 0, 0L, 0L, 964)));
                        } else if (z24) {
                            gat gatVar2 = (gat) hatVar;
                            lc00 lc00VarB2 = kotlin.collections.a.b();
                            g2v g2vVar = hg2Var2.j;
                            pb10 pb10Var = pb10.g;
                            pdm pdmVar = pdm.b;
                            th = gatVar2.b;
                            if (th == null && !(th instanceof oqt0)) {
                                i = R.string.empty_str;
                            } else {
                                i = R.string.empty_favorites_games_title;
                            }
                            int i3 = i;
                            if (th == null && !(th instanceof oqt0)) {
                                i2 = R.string.error_get_data;
                            } else {
                                i2 = R.string.empty_favorites_games;
                            }
                            lc00VarB2.add(new xfe0(g2v.b(g2vVar, pb10Var, pdmVar, null, R.drawable.ic_glyph_circle_multievent, i3, i2, 0, 0, 0L, 0L, 964)));
                            lc00VarB2.add(new hsv("KEY_RECOMMENDS", new hjm(ctf0Var3.b.a(R.string.recommend, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                            edeVar = new ede(cs0.f(lc00VarB2, lc00VarB2, z(gatVar2.f10986a, hg2Var2.g, this.b, hg2Var2.d, hg2Var2.b, v5l0Var2, hg2Var2.f, hg2Var2.h, hg2Var2.i, hg2Var2.k)));
                        } else if (hatVar instanceof dat) {
                            jdeVar = new ade(g2v.b(hg2Var2.j, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        } else {
                            jdeVar2 = new jde(f(hg2Var2));
                        }
                        edeVar = jdeVar2;
                    } else {
                        jdeVar = new ade(g2v.b(hg2Var2.j, pb10.g, pdm.b, null, R.drawable.ic_glyph_circle_multievent, 0, R.string.data_retrieval_error, 0, 0, 0L, 0L, 980));
                    }
                } else if (!z24) {
                    if (z24) {
                        gat gatVar3 = (gat) hatVar;
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        g2v g2vVar2 = hg2Var2.j;
                        pb10 pb10Var2 = pb10.g;
                        pdm pdmVar2 = pdm.b;
                        th = gatVar3.b;
                        if (th == null) {
                            i = R.string.empty_favorites_games_title;
                        } else {
                            i = R.string.empty_str;
                        }
                        int i4 = i;
                        if (th == null) {
                            i2 = R.string.empty_favorites_games;
                        } else {
                            i2 = R.string.error_get_data;
                        }
                        lc00VarB3.add(new xfe0(g2v.b(g2vVar2, pb10Var2, pdmVar2, null, R.drawable.ic_glyph_circle_multievent, i4, i2, 0, 0, 0L, 0L, 964)));
                        lc00VarB3.add(new hsv("KEY_RECOMMENDS", new hjm(ctf0Var3.b.a(R.string.recommend, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                        edeVar = new ede(cs0.f(lc00VarB3, lc00VarB3, z(gatVar3.f10986a, hg2Var2.g, this.b, hg2Var2.d, hg2Var2.b, v5l0Var2, hg2Var2.f, hg2Var2.h, hg2Var2.i, hg2Var2.k)));
                    } else if (hatVar instanceof dat) {
                        jdeVar = new ade(g2v.b(hg2Var2.j, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    } else {
                        jdeVar2 = new jde(f(hg2Var2));
                        edeVar = jdeVar2;
                    }
                } else if (z24) {
                    gat gatVar4 = (gat) hatVar;
                    lc00 lc00VarB4 = kotlin.collections.a.b();
                    g2v g2vVar3 = hg2Var2.j;
                    pb10 pb10Var3 = pb10.g;
                    pdm pdmVar3 = pdm.b;
                    th = gatVar4.b;
                    if (th == null) {
                        i = R.string.empty_favorites_games_title;
                    } else {
                        i = R.string.empty_str;
                    }
                    int i5 = i;
                    if (th == null) {
                        i2 = R.string.empty_favorites_games;
                    } else {
                        i2 = R.string.error_get_data;
                    }
                    lc00VarB4.add(new xfe0(g2v.b(g2vVar3, pb10Var3, pdmVar3, null, R.drawable.ic_glyph_circle_multievent, i5, i2, 0, 0, 0L, 0L, 964)));
                    lc00VarB4.add(new hsv("KEY_RECOMMENDS", new hjm(ctf0Var3.b.a(R.string.recommend, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                    edeVar = new ede(cs0.f(lc00VarB4, lc00VarB4, z(gatVar4.f10986a, hg2Var2.g, this.b, hg2Var2.d, hg2Var2.b, v5l0Var2, hg2Var2.f, hg2Var2.h, hg2Var2.i, hg2Var2.k)));
                } else if (hatVar instanceof dat) {
                    jdeVar = new ade(g2v.b(hg2Var2.j, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                } else {
                    jdeVar2 = new jde(f(hg2Var2));
                    edeVar = jdeVar2;
                }
            }
            edeVar = jdeVar;
        } else {
            ug2Var = ug2Var2;
            z = z7;
            z2 = z8;
            jdeVar = new jde(f(hg2Var2));
            edeVar = jdeVar;
        }
        ug2 ug2Var4 = ug2Var;
        return new vg2(immVar, edeVar, ug2Var4.e, ug2Var4.d, new zpv(z, z2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v0 a.fi2, still in use, count: 4, list:
          (r6v0 a.fi2) from 0x00be: MOVE (r35v0 a.fi2) = (r6v0 a.fi2) (LINE:191)
          (r6v0 a.fi2) from 0x02a8: MOVE (r35v3 a.fi2) = (r6v0 a.fi2) (LINE:681)
          (r6v0 a.fi2) from 0x024a: MOVE (r35v5 a.fi2) = (r6v0 a.fi2) (LINE:587)
          (r6v0 a.fi2) from 0x0154: PHI (r6v18 a.fi2) = (r6v0 a.fi2), (r6v23 a.fi2) binds: [B:38:0x0150, B:55:0x0234] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object l(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m72.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v0 a.qj2, still in use, count: 3, list:
          (r5v0 a.qj2) from 0x00b8: MOVE (r24v0 a.qj2) = (r5v0 a.qj2) (LINE:185)
          (r5v0 a.qj2) from 0x021e: MOVE (r24v2 a.qj2) = (r5v0 a.qj2) (LINE:543)
          (r5v0 a.qj2) from 0x00d9: PHI (r5v5 a.qj2) = (r5v0 a.qj2), (r5v13 a.qj2) binds: [B:26:0x00c2, B:53:0x016f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object m(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m72.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ea  */
    private final Object n(Object obj) {
        nl2 nl2Var;
        boolean z;
        imm immVar;
        ode ideVar;
        xte xteVar;
        nl2 nl2Var2;
        ode ddeVar;
        Iterator it;
        Object next;
        ode uceVar;
        nl2 nl2Var3 = (nl2) obj;
        nl2Var3.getClass();
        boolean z2 = nl2Var3.b;
        gds0 gds0Var = nl2Var3.d;
        boolean z3 = z2 && (gds0Var instanceof fds0) && !((fds0) gds0Var).f9372a.isEmpty();
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        ctf0 ctf0Var = this.b;
        plm plmVar = new plm(ctf0Var.b.a(R.string.tracked, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
        boolean z4 = gds0Var instanceof fds0;
        fds0 fds0Var = z4 ? (fds0) gds0Var : null;
        imm immVar2 = new imm(ilmVar, plmVar, new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_trash, fds0Var != null && (fds0Var.f9372a.isEmpty() ^ true), ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, null);
        yk2 yk2Var = nl2Var3.f23707a;
        if (yk2Var != null) {
            boolean z5 = yk2Var.j;
            if (gds0Var instanceof dds0) {
                nl2Var = nl2Var3;
                z = z3;
                immVar = immVar2;
                if (yk2Var != null || (xteVar = yk2Var.k) == null) {
                    xteVar = xte.COEF_WITH_BIG_ACCENT_TEAM;
                }
                ideVar = new ide(g(xteVar));
            } else {
                if (z4) {
                    fds0 fds0Var2 = (fds0) gds0Var;
                    lc00 lc00VarB = kotlin.collections.a.b();
                    List list = fds0Var2.f9372a;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(bcm0.z((qbs0) it2.next(), fds0Var2.b, yk2Var.f, this.b, yk2Var.k, yk2Var.l));
                    }
                    uceVar = new dde(cs0.f(lc00VarB, lc00VarB, arrayList), false, z5);
                } else {
                    boolean z6 = gds0Var instanceof eds0;
                    if (z6 && ((eds0) gds0Var).f7633a.isEmpty()) {
                        uceVar = new uce(new hds0(g2v.b(yk2Var.i, pb10.g, pdm.b, null, R.drawable.ic_glyph_circle_view, R.string.track_list_is_empty_title, R.string.track_list_is_empty_subtitle, 0, 0, 0L, 0L, 964)));
                    } else if (z6) {
                        eds0 eds0Var = (eds0) gds0Var;
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        Throwable th = eds0Var.b;
                        lc00VarB2.add(new hds0(g2v.b(yk2Var.i, pb10.g, pdm.b, null, R.drawable.ic_glyph_circle_view, (th == null || (th instanceof oqt0)) ? R.string.track_list_is_empty_title : R.string.empty_str, (th == null || (th instanceof oqt0)) ? R.string.track_list_is_empty_subtitle : R.string.error_get_data, 0, 0, 0L, 0L, 964)));
                        lc00VarB2.add(new bds0(new hjm(ctf0Var.b.a(R.string.recommend, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
                        List list2 = eds0Var.f7633a;
                        wcb wcbVar = yk2Var.f;
                        boolean z7 = yk2Var.d;
                        boolean z8 = yk2Var.b;
                        v5l0 v5l0Var = yk2Var.f42767a;
                        y78 y78Var = yk2Var.e;
                        List list3 = yk2Var.g;
                        immVar = immVar2;
                        boolean z9 = yk2Var.j;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            d0t d0tVar = (d0t) it3.next();
                            Iterator it4 = list3.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    it = it3;
                                    next = null;
                                    break;
                                }
                                next = it4.next();
                                it = it3;
                                if (((lok0) next).f20396a == d0tVar.O) {
                                    break;
                                }
                                it3 = it;
                            }
                            lok0 lok0Var = (lok0) next;
                            boolean z10 = z8;
                            v5l0 v5l0Var2 = v5l0Var;
                            nl2 nl2Var4 = nl2Var3;
                            boolean z11 = z3;
                            String strA = wcbVar.a(d0tVar.v, d0tVar.u);
                            ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add(Integer.valueOf(((lok0) it5.next()).f20396a));
                            }
                            boolean z12 = lok0Var != null ? lok0Var.n : false;
                            boolean z13 = lok0Var != null ? lok0Var.p : false;
                            m5l0 m5l0Var = d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a;
                            String str = lok0Var != null ? lok0Var.u : null;
                            if (str == null) {
                                str = "";
                            }
                            arrayList2.add(new ads0(wwb.V(d0tVar, this.b, y78Var, z7, z10, strA, false, arrayList3, z12, z13, false, v5l0Var2, m5l0Var, str, z9)));
                            nl2Var3 = nl2Var4;
                            z8 = z10;
                            v5l0Var = v5l0Var2;
                            it3 = it;
                            z3 = z11;
                        }
                        z = z3;
                        nl2Var2 = nl2Var3;
                        ddeVar = new dde(cs0.f(lc00VarB2, lc00VarB2, arrayList2), yk2Var.h, z5);
                    } else {
                        nl2Var = nl2Var3;
                        z = z3;
                        immVar = immVar2;
                        ideVar = gds0Var instanceof cds0 ? new yce(g2v.b(yk2Var.i, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)) : new ide(g(yk2Var.k));
                    }
                }
                nl2Var2 = nl2Var3;
                z = z3;
                ddeVar = uceVar;
                immVar = immVar2;
            }
            nl2Var2 = nl2Var;
            ddeVar = ideVar;
        } else {
            nl2Var = nl2Var3;
            z = z3;
            immVar = immVar2;
            if (yk2Var != null) {
                xteVar = xte.COEF_WITH_BIG_ACCENT_TEAM;
            } else {
                xteVar = xte.COEF_WITH_BIG_ACCENT_TEAM;
            }
            ideVar = new ide(g(xteVar));
            nl2Var2 = nl2Var;
            ddeVar = ideVar;
        }
        return new ol2(immVar, ddeVar, nl2Var2.f, nl2Var2.e, nl2Var2.c, new zpv(false, z));
    }

    private final Object o(Object obj) {
        String strA;
        zl2 zl2Var = (zl2) obj;
        zl2Var.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        List<ih2> list = zl2Var.f44560a;
        ih2 ih2Var = zl2Var.b;
        for (ih2 ih2Var2 : list) {
            long j = ih2Var2.f14760a;
            int iOrdinal = ih2Var2.ordinal();
            ctf0 ctf0Var = this.b;
            if (iOrdinal == 0) {
                strA = ctf0Var.b.a(R.string.favorite_games_title, Arrays.copyOf(new Object[0], 0));
            } else if (iOrdinal == 1) {
                strA = ctf0Var.b.a(R.string.favorites_teams, Arrays.copyOf(new Object[0], 0));
            } else if (iOrdinal == 2) {
                strA = ctf0Var.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0));
            } else if (iOrdinal == 3) {
                strA = ctf0Var.b.a(R.string.tracked, Arrays.copyOf(new Object[0], 0));
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                strA = ctf0Var.b.a(R.string.viewed_name, Arrays.copyOf(new Object[0], 0));
            }
            lc00VarB.add(new lxl(j, (dyl) new xxl(strA), false, ih2Var == ih2Var2 ? uxl.b : uxl.f36445a, (cwl) null, 108));
        }
        return new am2(new fyl(dyb.o0(kotlin.collections.a.a(lc00VarB)), null, null, s5x0.t(12.0f, 0.0f, 2), null, 22), ih2Var);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0248  */
    /* JADX WARN: Code duplicated, block: B:104:0x0250  */
    /* JADX WARN: Code duplicated, block: B:105:0x0253  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:111:0x026b A[LOOP:2: B:109:0x0265->B:111:0x026b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0285  */
    /* JADX WARN: Code duplicated, block: B:118:0x0294 A[LOOP:3: B:113:0x027f->B:118:0x0294, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:133:0x0322  */
    /* JADX WARN: Code duplicated, block: B:138:0x0336  */
    /* JADX WARN: Code duplicated, block: B:141:0x033e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0341  */
    /* JADX WARN: Code duplicated, block: B:145:0x0350  */
    /* JADX WARN: Code duplicated, block: B:147:0x0353  */
    /* JADX WARN: Code duplicated, block: B:148:0x0360  */
    /* JADX WARN: Code duplicated, block: B:151:0x037a  */
    /* JADX WARN: Code duplicated, block: B:156:0x038c  */
    /* JADX WARN: Code duplicated, block: B:158:0x0390  */
    /* JADX WARN: Code duplicated, block: B:159:0x0393  */
    /* JADX WARN: Code duplicated, block: B:162:0x039f  */
    /* JADX WARN: Code duplicated, block: B:164:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:165:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:168:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:169:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:176:0x040b  */
    /* JADX WARN: Code duplicated, block: B:178:0x0410  */
    /* JADX WARN: Code duplicated, block: B:181:0x0423  */
    /* JADX WARN: Code duplicated, block: B:184:0x0432  */
    /* JADX WARN: Code duplicated, block: B:186:0x0437  */
    /* JADX WARN: Code duplicated, block: B:189:0x043c  */
    /* JADX WARN: Code duplicated, block: B:193:0x0445 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0449  */
    /* JADX WARN: Code duplicated, block: B:196:0x044c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0450  */
    /* JADX WARN: Code duplicated, block: B:203:0x0481  */
    /* JADX WARN: Code duplicated, block: B:205:0x048f  */
    /* JADX WARN: Code duplicated, block: B:207:0x0494  */
    /* JADX WARN: Code duplicated, block: B:216:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0143  */
    /* JADX WARN: Code duplicated, block: B:67:0x0177  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:80:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0206  */
    /* JADX WARN: Code duplicated, block: B:91:0x020a  */
    /* JADX WARN: Code duplicated, block: B:92:0x020c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0215 A[LOOP:0: B:94:0x0213->B:95:0x0215, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0233  */
    private final Object p(Object obj) {
        sd sdVar;
        String str;
        ee eeVar;
        chm chmVar;
        chm chmVar2;
        boolean z;
        int i;
        chm chmVar3;
        tlm plmVar;
        llm ilmVar;
        dmm dmmVar;
        wa50 ta50Var;
        tlm tlmVar;
        llm llmVar;
        String str2;
        dmm dmmVar2;
        int i2;
        a4x a4xVarG0;
        a4x a4xVarO0;
        ArrayList arrayList;
        int i3;
        Iterator it;
        d0t d0tVar;
        List list;
        ArrayList arrayList2;
        Iterator it2;
        Iterator it3;
        Object obj2;
        lok0 lok0Var;
        int i4;
        f0t f0tVar;
        boolean z2;
        f0t f0tVar2;
        List list2;
        List list3;
        boolean z3;
        boolean z4;
        String strG;
        BetGroupZip betGroupZip;
        String strM;
        String str3;
        String str4;
        String str5;
        d280 c280Var;
        BetGroupZip betGroupZip2;
        int i5;
        String strM2;
        String str6;
        String str7;
        d280 c280Var2;
        int iV;
        String string;
        int iV2;
        long secondary;
        String strA;
        String str8;
        wcb wcbVar;
        List list4;
        BetZip betZip;
        List list5;
        BetZip betZip2;
        Object next;
        int i6;
        ArrayList arrayList3;
        int i7;
        gsa gsaVar = (gsa) obj;
        gsaVar.getClass();
        ctf0 ctf0Var = this.b;
        lsm0 lsm0Var = ctf0Var.b;
        lsm0 lsm0Var2 = ctf0Var.b;
        String strA2 = lsm0Var.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0));
        dta dtaVar = gsaVar.h;
        List list6 = gsaVar.e;
        boolean z5 = gsaVar.j;
        boolean z6 = gsaVar.k;
        rra rraVar = gsaVar.f11820a;
        boolean z7 = dtaVar.a().b;
        pz40 pz40Var = s6t0.f31722a;
        long secondary2 = s6t0.b().f33626a.getSecondary();
        ra50 ra50Var = ra50.f30118a;
        wkm wkmVar = new wkm(0, R.drawable.ic_glyph_trash, z7, ra50Var, secondary2);
        wkm wkmVar2 = new wkm(1, R.drawable.ic_glyph_search, dtaVar.a().f44779a, ra50Var, s6t0.b().f33626a.getSecondary());
        boolean z8 = z5 && ((dtaVar instanceof ysa) || ((dtaVar instanceof zsa) && rraVar != null && rraVar.j));
        boolean z9 = dtaVar.a().b;
        if (!z6 || !z8) {
            om5 om5Var = gsaVar.b;
            if (om5Var instanceof dm5) {
                pn40 pn40Var = pn40.f27267a;
                dm5 dm5Var = (dm5) om5Var;
                z9 = z9;
                ctf0Var = ctf0Var;
                sdVar = new sd(pn40.c(dm5Var.f6307a.b, p3u0.c), dm5Var.b, lsm0Var2.a(R.string.replenish, Arrays.copyOf(new Object[0], 0)));
            } else if (!om5Var.equals(hm5.f13289a)) {
                t9f.b();
                return null;
            }
            boolean z10 = gsaVar.c;
            if (rraVar != null) {
                str = rraVar.f;
            } else {
                str = null;
            }
            eeVar = yd.f42407a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1624642178:
                        if (str.equals("quaternary")) {
                            eeVar = zd.f44189a;
                        }
                        break;
                    case -1174796206:
                        if (str.equals("tertiary")) {
                            eeVar = de.f5922a;
                        }
                        break;
                    case -905965428:
                        if (str.equals("senary")) {
                            eeVar = ce.f4189a;
                        }
                        break;
                    case -817598092:
                        if (str.equals("secondary")) {
                            eeVar = be.f2424a;
                        }
                        break;
                    case -314765822:
                        str.equals("primary");
                        break;
                    case 658655103:
                        if (str.equals("quinary")) {
                            eeVar = ae.f704a;
                        }
                        break;
                }
            }
            ee eeVar2 = eeVar;
            if (rraVar == null && rraVar.b) {
                chmVar = new chm(new m0x(R.drawable.ic_glyph_games, null, 6), gsaVar.g, rraVar.c);
            } else {
                chmVar = null;
            }
            int i8 = gsaVar.f;
            if (rraVar == null && rraVar.d) {
                chmVar2 = chmVar;
                z = z8;
                chmVar3 = new chm(new m0x(R.drawable.ic_glyph_cards, null, 6), i8, lsm0Var2.a(R.string.cases_casino, Arrays.copyOf(new Object[0], 0)));
                i = 0;
            } else {
                chmVar2 = chmVar;
                z = z8;
                if (rraVar == null && rraVar.e) {
                    i = 0;
                    chmVar3 = new chm(new m0x(R.drawable.ic_glyph_virtual, null, 6), i8, lsm0Var2.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)));
                } else {
                    i = 0;
                    chmVar3 = null;
                }
            }
            if (z6 == 0 && z) {
                plmVar = new nlm(new hmm(2, gsaVar.l, lsm0Var2.a(R.string.search, Arrays.copyOf(new Object[i], i)), true));
            } else {
                plmVar = new plm(strA2, s6t0.b().f33626a.getSecondary(), fa50.f9191a);
            }
            if (z6 == 0 && z5) {
                ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
            } else {
                ilmVar = klm.f18497a;
            }
            if (z6 && z) {
                ta50Var = new va50(wkmVar2, wkmVar);
            } else {
                ta50Var = new ta50(wkmVar);
            }
            dmmVar = new dmm(ta50Var);
            if (gsaVar.c) {
                if (gsaVar.i) {
                    i6 = 5;
                } else {
                    i6 = 1;
                }
                arrayList3 = new ArrayList(i6);
                for (i7 = 0; i7 < i6; i7++) {
                    arrayList3.add(fhm.f9548a);
                }
                a4xVarO0 = dyb.o0(arrayList3);
                tlmVar = plmVar;
                llmVar = ilmVar;
                str2 = strA2;
                dmmVar2 = dmmVar;
            } else {
                if (list6.isEmpty()) {
                    tlmVar = plmVar;
                    llmVar = ilmVar;
                    str2 = strA2;
                    dmmVar2 = dmmVar;
                    if (gsaVar.d) {
                        i2 = R.string.data_retrieval_error;
                    } else {
                        i2 = R.string.express_events_no_events;
                    }
                    a4xVarG0 = dyb.g0(new ehm(lsm0Var2.a(i2, Arrays.copyOf(new Object[0], 0))));
                } else {
                    i3 = 10;
                    arrayList = new ArrayList(r3d.q(list6, 10));
                    it = list6.iterator();
                    while (it.hasNext()) {
                        d0tVar = (d0t) it.next();
                        if (rraVar != null) {
                            list = rraVar.m;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        arrayList2 = new ArrayList(r3d.q(list, i3));
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Integer.valueOf(((lok0) it2.next()).f20396a));
                        }
                        it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (((lok0) next).f20396a == d0tVar.O) {
                                    obj2 = next;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        lok0Var = (lok0) obj2;
                        i4 = d0tVar.O;
                        f0tVar = d0tVar.r;
                        z2 = d0tVar.B;
                        tlm tlmVar2 = plmVar;
                        f0tVar2 = d0tVar.q;
                        llm llmVar2 = ilmVar;
                        list2 = d0tVar.K;
                        if (arrayList2.contains(Integer.valueOf(i4)) || lok0Var == null) {
                            list3 = list2;
                        } else {
                            list3 = list2;
                            boolean z11 = lok0Var.n;
                            if (rraVar != null) {
                                z3 = rraVar.n;
                            } else {
                                z3 = false;
                            }
                            z4 = z11;
                            String strA3 = jeb.K(d0tVar.O, d0tVar.v, arrayList2, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a();
                            rdj rdjVar = rdj.f30294a;
                            dmm dmmVar3 = dmmVar;
                            Iterator it4 = it;
                            strG = rdj.g(new znq0(d0tVar.s), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                            long j = d0tVar.f5282a;
                            betGroupZip = (BetGroupZip) CollectionsKt.firstOrNull(list3);
                            if (betGroupZip != null || (list5 = betGroupZip.f) == null || (betZip2 = (BetZip) CollectionsKt.firstOrNull(list5)) == null) {
                                strM = null;
                            } else {
                                strM = ju70.M(betZip2, false);
                            }
                            str3 = "";
                            if (strM == null) {
                                str4 = "";
                            } else {
                                str4 = strM;
                            }
                            String str9 = strA2;
                            str5 = (String) CollectionsKt.W(0, f0tVar2.d);
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (z2) {
                                c280Var = new b280(R.drawable.ic_home);
                            } else {
                                c280Var = new c280(vsm0.s(f0tVar2.f8731a, str5), R.drawable.ic_glyph_placeholder_player);
                            }
                            betGroupZip2 = (BetGroupZip) CollectionsKt.firstOrNull(list3);
                            if (betGroupZip2 != null || (list4 = betGroupZip2.f) == null || (betZip = (BetZip) CollectionsKt.f0(list4)) == null) {
                                i5 = 0;
                                strM2 = null;
                            } else {
                                i5 = 0;
                                strM2 = ju70.M(betZip, false);
                            }
                            if (strM2 == null) {
                                str6 = "";
                            } else {
                                str6 = strM2;
                            }
                            str7 = (String) CollectionsKt.W(i5, f0tVar.d);
                            if (str7 == null) {
                                str7 = "";
                            }
                            if (z2) {
                                c280Var2 = new b280(R.drawable.ic_away);
                            } else {
                                c280Var2 = new c280(vsm0.s(f0tVar.f8731a, str7), R.drawable.ic_glyph_placeholder_player);
                            }
                            strG.getClass();
                            iV = StringsKt.V(strG, Separators.SP, 0, false, 6);
                            if (iV == -1) {
                                string = strG;
                            } else {
                                string = StringsKt.h0(strG, iV + 1, strG.length(), "").toString();
                            }
                            String string2 = StringsKt.u0(string).toString();
                            iV2 = StringsKt.V(strG, Separators.SP, 0, false, 6);
                            if (iV2 != -1) {
                                strG = StringsKt.h0(strG, 0, iV2, "").toString();
                            }
                            String string3 = StringsKt.u0(strG).toString();
                            lpm lpmVar = new lpm(opm.f25648a, new hpm(0L, 3));
                            if (z4) {
                                secondary = y3d.g;
                            } else {
                                pz40 pz40Var2 = s6t0.f31722a;
                                secondary = s6t0.b().f33626a.getSecondary();
                            }
                            long j2 = secondary;
                            int i9 = d0tVar.O;
                            if (rraVar != null || (wcbVar = rraVar.l) == null) {
                                strA = null;
                            } else {
                                strA = wcbVar.a(d0tVar.v, d0tVar.u);
                            }
                            if (strA == null) {
                                strA = "";
                            }
                            boolean z12 = lok0Var == 0 && lok0Var.n;
                            if (lok0Var != null) {
                                str8 = lok0Var.u;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                str3 = str8;
                            }
                            arrayList.add(new dhm(j, str4, c280Var, str6, c280Var2, string2, string3, lpmVar, z3, strA3, j2, new n0x(dtb.L(i9, strA, str3, arrayList2, z12))));
                            plmVar = tlmVar2;
                            ilmVar = llmVar2;
                            dmmVar = dmmVar3;
                            it = it4;
                            strA2 = str9;
                            i3 = 10;
                        }
                        if (rraVar != null) {
                            z3 = rraVar.n;
                        } else {
                            z3 = false;
                        }
                        z4 = z11;
                        String strA4 = jeb.K(d0tVar.O, d0tVar.v, arrayList2, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a();
                        rdj rdjVar2 = rdj.f30294a;
                        dmm dmmVar4 = dmmVar;
                        Iterator it5 = it;
                        strG = rdj.g(new znq0(d0tVar.s), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                        long j3 = d0tVar.f5282a;
                        betGroupZip = (BetGroupZip) CollectionsKt.firstOrNull(list3);
                        if (betGroupZip != null) {
                            strM = null;
                        } else {
                            strM = null;
                        }
                        str3 = "";
                        if (strM == null) {
                            str4 = "";
                        } else {
                            str4 = strM;
                        }
                        String str10 = strA2;
                        str5 = (String) CollectionsKt.W(0, f0tVar2.d);
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (z2) {
                            c280Var = new b280(R.drawable.ic_home);
                        } else {
                            c280Var = new c280(vsm0.s(f0tVar2.f8731a, str5), R.drawable.ic_glyph_placeholder_player);
                        }
                        betGroupZip2 = (BetGroupZip) CollectionsKt.firstOrNull(list3);
                        if (betGroupZip2 != null) {
                            i5 = 0;
                            strM2 = null;
                        } else {
                            i5 = 0;
                            strM2 = null;
                        }
                        if (strM2 == null) {
                            str6 = "";
                        } else {
                            str6 = strM2;
                        }
                        str7 = (String) CollectionsKt.W(i5, f0tVar.d);
                        if (str7 == null) {
                            str7 = "";
                        }
                        if (z2) {
                            c280Var2 = new b280(R.drawable.ic_away);
                        } else {
                            c280Var2 = new c280(vsm0.s(f0tVar.f8731a, str7), R.drawable.ic_glyph_placeholder_player);
                        }
                        strG.getClass();
                        iV = StringsKt.V(strG, Separators.SP, 0, false, 6);
                        if (iV == -1) {
                            string = strG;
                        } else {
                            string = StringsKt.h0(strG, iV + 1, strG.length(), "").toString();
                        }
                        String string4 = StringsKt.u0(string).toString();
                        iV2 = StringsKt.V(strG, Separators.SP, 0, false, 6);
                        if (iV2 != -1) {
                            strG = StringsKt.h0(strG, 0, iV2, "").toString();
                        }
                        String string5 = StringsKt.u0(strG).toString();
                        lpm lpmVar2 = new lpm(opm.f25648a, new hpm(0L, 3));
                        if (z4) {
                            secondary = y3d.g;
                        } else {
                            pz40 pz40Var3 = s6t0.f31722a;
                            secondary = s6t0.b().f33626a.getSecondary();
                        }
                        long j4 = secondary;
                        int i10 = d0tVar.O;
                        if (rraVar != null) {
                            strA = null;
                        } else {
                            strA = null;
                        }
                        if (strA == null) {
                            strA = "";
                        }
                        if (lok0Var == 0) {
                        }
                        if (lok0Var != null) {
                            str8 = lok0Var.u;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            str3 = str8;
                        }
                        arrayList.add(new dhm(j3, str4, c280Var, str6, c280Var2, string4, string5, lpmVar2, z3, strA4, j4, new n0x(dtb.L(i10, strA, str3, arrayList2, z12))));
                        plmVar = tlmVar2;
                        ilmVar = llmVar2;
                        dmmVar = dmmVar4;
                        it = it5;
                        strA2 = str10;
                        i3 = 10;
                    }
                    tlmVar = plmVar;
                    llmVar = ilmVar;
                    str2 = strA2;
                    dmmVar2 = dmmVar;
                    a4xVarG0 = dyb.o0(arrayList);
                }
                a4xVarO0 = a4xVarG0;
            }
            return new bra(new uhm(str2, z9, z10, llmVar, dmmVar2, tlmVar, eeVar2, chmVar2, chmVar3, sdVar, a4xVarO0));
        }
        sdVar = null;
        boolean z13 = gsaVar.c;
        if (rraVar != null) {
            str = rraVar.f;
        } else {
            str = null;
        }
        eeVar = yd.f42407a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1624642178:
                    if (str.equals("quaternary")) {
                        eeVar = zd.f44189a;
                    }
                    break;
                case -1174796206:
                    if (str.equals("tertiary")) {
                        eeVar = de.f5922a;
                    }
                    break;
                case -905965428:
                    if (str.equals("senary")) {
                        eeVar = ce.f4189a;
                    }
                    break;
                case -817598092:
                    if (str.equals("secondary")) {
                        eeVar = be.f2424a;
                    }
                    break;
                case -314765822:
                    str.equals("primary");
                    break;
                case 658655103:
                    if (str.equals("quinary")) {
                        eeVar = ae.f704a;
                    }
                    break;
            }
        }
        ee eeVar3 = eeVar;
        if (rraVar == null) {
            chmVar = null;
        } else {
            chmVar = null;
        }
        int i11 = gsaVar.f;
        if (rraVar == null) {
            chmVar2 = chmVar;
            z = z8;
            if (rraVar == null) {
                i = 0;
                chmVar3 = null;
            } else {
                i = 0;
                chmVar3 = null;
            }
        } else {
            chmVar2 = chmVar;
            z = z8;
            if (rraVar == null) {
                i = 0;
                chmVar3 = null;
            } else {
                i = 0;
                chmVar3 = null;
            }
        }
        if (z6 == 0) {
            plmVar = new plm(strA2, s6t0.b().f33626a.getSecondary(), fa50.f9191a);
        } else {
            plmVar = new plm(strA2, s6t0.b().f33626a.getSecondary(), fa50.f9191a);
        }
        if (z6 == 0) {
            ilmVar = klm.f18497a;
        } else {
            ilmVar = klm.f18497a;
        }
        if (z6) {
            ta50Var = new ta50(wkmVar);
        } else {
            ta50Var = new ta50(wkmVar);
        }
        dmmVar = new dmm(ta50Var);
        if (gsaVar.c) {
            if (gsaVar.i) {
                i6 = 5;
            } else {
                i6 = 1;
            }
            arrayList3 = new ArrayList(i6);
            while (i7 < i6) {
                arrayList3.add(fhm.f9548a);
            }
            a4xVarO0 = dyb.o0(arrayList3);
            tlmVar = plmVar;
            llmVar = ilmVar;
            str2 = strA2;
            dmmVar2 = dmmVar;
        } else {
            if (list6.isEmpty()) {
                i3 = 10;
                arrayList = new ArrayList(r3d.q(list6, 10));
                it = list6.iterator();
                while (it.hasNext()) {
                    d0tVar = (d0t) it.next();
                    if (rraVar != null) {
                        list = rraVar.m;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    arrayList2 = new ArrayList(r3d.q(list, i3));
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((lok0) it2.next()).f20396a));
                    }
                    it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (((lok0) next).f20396a == d0tVar.O) {
                                obj2 = next;
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    lok0Var = (lok0) obj2;
                    i4 = d0tVar.O;
                    f0tVar = d0tVar.r;
                    z2 = d0tVar.B;
                    tlm tlmVar3 = plmVar;
                    f0tVar2 = d0tVar.q;
                    llm llmVar3 = ilmVar;
                    list2 = d0tVar.K;
                    if (arrayList2.contains(Integer.valueOf(i4))) {
                        list3 = list2;
                    } else {
                        list3 = list2;
                    }
                    if (rraVar != null) {
                        z3 = rraVar.n;
                    } else {
                        z3 = false;
                    }
                    z4 = z11;
                    String strA5 = jeb.K(d0tVar.O, d0tVar.v, arrayList2, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a();
                    rdj rdjVar3 = rdj.f30294a;
                    dmm dmmVar5 = dmmVar;
                    Iterator it6 = it;
                    strG = rdj.g(new znq0(d0tVar.s), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                    long j5 = d0tVar.f5282a;
                    betGroupZip = (BetGroupZip) CollectionsKt.firstOrNull(list3);
                    if (betGroupZip != null) {
                        strM = null;
                    } else {
                        strM = null;
                    }
                    str3 = "";
                    if (strM == null) {
                        str4 = "";
                    } else {
                        str4 = strM;
                    }
                    String str11 = strA2;
                    str5 = (String) CollectionsKt.W(0, f0tVar2.d);
                    if (str5 == null) {
                        str5 = "";
                    }
                    if (z2) {
                        c280Var = new b280(R.drawable.ic_home);
                    } else {
                        c280Var = new c280(vsm0.s(f0tVar2.f8731a, str5), R.drawable.ic_glyph_placeholder_player);
                    }
                    betGroupZip2 = (BetGroupZip) CollectionsKt.firstOrNull(list3);
                    if (betGroupZip2 != null) {
                        i5 = 0;
                        strM2 = null;
                    } else {
                        i5 = 0;
                        strM2 = null;
                    }
                    if (strM2 == null) {
                        str6 = "";
                    } else {
                        str6 = strM2;
                    }
                    str7 = (String) CollectionsKt.W(i5, f0tVar.d);
                    if (str7 == null) {
                        str7 = "";
                    }
                    if (z2) {
                        c280Var2 = new b280(R.drawable.ic_away);
                    } else {
                        c280Var2 = new c280(vsm0.s(f0tVar.f8731a, str7), R.drawable.ic_glyph_placeholder_player);
                    }
                    strG.getClass();
                    iV = StringsKt.V(strG, Separators.SP, 0, false, 6);
                    if (iV == -1) {
                        string = strG;
                    } else {
                        string = StringsKt.h0(strG, iV + 1, strG.length(), "").toString();
                    }
                    String string6 = StringsKt.u0(string).toString();
                    iV2 = StringsKt.V(strG, Separators.SP, 0, false, 6);
                    if (iV2 != -1) {
                        strG = StringsKt.h0(strG, 0, iV2, "").toString();
                    }
                    String string7 = StringsKt.u0(strG).toString();
                    lpm lpmVar3 = new lpm(opm.f25648a, new hpm(0L, 3));
                    if (z4) {
                        secondary = y3d.g;
                    } else {
                        pz40 pz40Var4 = s6t0.f31722a;
                        secondary = s6t0.b().f33626a.getSecondary();
                    }
                    long j6 = secondary;
                    int i12 = d0tVar.O;
                    if (rraVar != null) {
                        strA = null;
                    } else {
                        strA = null;
                    }
                    if (strA == null) {
                        strA = "";
                    }
                    if (lok0Var == 0) {
                    }
                    if (lok0Var != null) {
                        str8 = lok0Var.u;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        str3 = str8;
                    }
                    arrayList.add(new dhm(j5, str4, c280Var, str6, c280Var2, string6, string7, lpmVar3, z3, strA5, j6, new n0x(dtb.L(i12, strA, str3, arrayList2, z12))));
                    plmVar = tlmVar3;
                    ilmVar = llmVar3;
                    dmmVar = dmmVar5;
                    it = it6;
                    strA2 = str11;
                    i3 = 10;
                }
                tlmVar = plmVar;
                llmVar = ilmVar;
                str2 = strA2;
                dmmVar2 = dmmVar;
                a4xVarG0 = dyb.o0(arrayList);
            } else {
                tlmVar = plmVar;
                llmVar = ilmVar;
                str2 = strA2;
                dmmVar2 = dmmVar;
                if (gsaVar.d) {
                    i2 = R.string.data_retrieval_error;
                } else {
                    i2 = R.string.express_events_no_events;
                }
                a4xVarG0 = dyb.g0(new ehm(lsm0Var2.a(i2, Arrays.copyOf(new Object[0], 0))));
            }
            a4xVarO0 = a4xVarG0;
        }
        return new bra(new uhm(str2, z9, z13, llmVar, dmmVar2, tlmVar, eeVar3, chmVar2, chmVar3, sdVar, a4xVarO0));
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object q(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r46v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    private final Object r(Object obj) {
        sd sdVar;
        sd sdVar2;
        onc oncVar = (onc) obj;
        oncVar.getClass();
        vcp vcpVar = vcp.Classic;
        ctf0 ctf0Var = this.b;
        lsm0 lsm0Var = ctf0Var.b;
        lsm0 lsm0Var2 = ctf0Var.b;
        String strA = lsm0Var.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0));
        zpv zpvVar = oncVar.e;
        ymc ymcVar = oncVar.f25540a;
        ClassicFavoriteTab classicFavoriteTab = oncVar.b;
        boolean z = oncVar.g;
        boolean z2 = zpvVar.b;
        pz40 pz40Var = s6t0.f31722a;
        long secondary = s6t0.b().f33626a.getSecondary();
        ra50 ra50Var = ra50.f30118a;
        wkm wkmVar = new wkm(1, R.drawable.ic_glyph_trash, z2, ra50Var, secondary);
        wkm wkmVar2 = new wkm(0, R.drawable.ic_glyph_search, zpvVar.f44779a, ra50Var, s6t0.b().f33626a.getSecondary());
        boolean z3 = oncVar.f && classicFavoriteTab == ClassicFavoriteTab.f46639a;
        boolean z4 = zpvVar.b;
        String str = ymcVar != null ? ymcVar.c : null;
        ee eeVar = yd.f42407a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1624642178:
                    if (str.equals("quaternary")) {
                        eeVar = zd.f44189a;
                    }
                    break;
                case -1174796206:
                    if (str.equals("tertiary")) {
                        eeVar = de.f5922a;
                    }
                    break;
                case -905965428:
                    if (str.equals("senary")) {
                        eeVar = ce.f4189a;
                    }
                    break;
                case -817598092:
                    if (str.equals("secondary")) {
                        eeVar = be.f2424a;
                    }
                    break;
                case -314765822:
                    str.equals("primary");
                    break;
                case 658655103:
                    if (str.equals("quinary")) {
                        eeVar = ae.f704a;
                    }
                    break;
            }
        }
        ee eeVar2 = eeVar;
        if (z) {
            wkmVar2 = wkmVar2;
            sdVar2 = null;
        } else {
            kmc kmcVar = oncVar.c;
            if (kmcVar instanceof imc) {
                pn40 pn40Var = pn40.f27267a;
                imc imcVar = (imc) kmcVar;
                sdVar = new sd(pn40.c(imcVar.f15017a.b, p3u0.c), imcVar.b, lsm0Var2.a(R.string.replenish, Arrays.copyOf(new Object[0], 0)));
            } else {
                if (!kmcVar.equals(jmc.f16757a)) {
                    t9f.b();
                    return null;
                }
                sdVar = null;
            }
            sdVar2 = sdVar;
        }
        vhm vhmVar = new vhm(strA, z4, (z && z3) ? new ilm(s6t0.b().f33626a.getSecondary()) : klm.f18497a, new dmm((z || !z3) ? new ta50(wkmVar) : new va50(wkmVar2, wkmVar)), (z && z3) ? new nlm(new hmm(2, oncVar.h, lsm0Var2.a(R.string.search, Arrays.copyOf(new Object[0], 0)), true)) : new plm(strA, s6t0.b().f33626a.getSecondary(), fa50.f9191a), sdVar2, eeVar2);
        lc00 lc00VarB = kotlin.collections.a.b();
        Iterator it = ClassicFavoriteTab.f.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((ClassicFavoriteTab) it.next()).ordinal();
            if (iOrdinal == 0) {
                lc00VarB.add(new s4i(lsm0Var2.a(R.string.favorite_games_title, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_multievent, null, false, 12));
            } else if (iOrdinal == 1) {
                lc00VarB.add(new s4i(lsm0Var2.a(R.string.other_favorite_title, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_nav_favorites, null, false, 12));
            } else if (iOrdinal == 2) {
                lc00VarB.add(new s4i(lsm0Var2.a(R.string.tracked, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_show, Integer.valueOf(oncVar.d), false, 8));
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                lc00VarB.add(new s4i(lsm0Var2.a(R.string.viewed_name, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_book, null, false, 12));
            }
        }
        a4x a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
        int iIndexOf = ClassicFavoriteTab.f.indexOf(classicFavoriteTab);
        s9m0 s9m0Var = aoo0.f1212a;
        String str2 = ymcVar != null ? ymcVar.d : null;
        if (str2 == null) {
            str2 = "";
        }
        s9m0Var.getClass();
        return new pnc(vhmVar, a4xVarO0, s9m0.g(str2), iIndexOf, classicFavoriteTab);
    }

    private final Object s(Object obj) {
        csc cscVar;
        hsc hscVar = (hsc) obj;
        hscVar.getClass();
        List<pif0> list = hscVar.f13574a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (pif0 pif0Var : list) {
            pif0Var.getClass();
            ctf0 ctf0Var = this.b;
            ctf0Var.getClass();
            lsm0 lsm0Var = ctf0Var.b;
            long jD = fbc.d(ctf0Var.a(R.color.static_red));
            int iOrdinal = pif0Var.ordinal();
            if (iOrdinal == 0) {
                tui0 tui0Var = new tui0(lsm0Var.a(R.string.team_first, Arrays.copyOf(new Object[0], 0)), null);
                pz40 pz40Var = s6t0.f31722a;
                long secondary = s6t0.b().f33626a.getSecondary();
                cscVar = new csc(pif0Var, new rqm((vui0) tui0Var, (pui0) new oui0(Integer.valueOf(R.drawable.ic_first_team), (y3d) null, new m0x(R.drawable.ic_first_team, null, 6), new y3d(secondary), 18), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508));
            } else if (iOrdinal == 1) {
                tui0 tui0Var2 = new tui0(lsm0Var.a(R.string.team_sec, Arrays.copyOf(new Object[0], 0)), null);
                pz40 pz40Var2 = s6t0.f31722a;
                long secondary2 = s6t0.b().f33626a.getSecondary();
                cscVar = new csc(pif0Var, new rqm((vui0) tui0Var2, (pui0) new oui0(Integer.valueOf(R.drawable.ic_second_team), (y3d) null, new m0x(R.drawable.ic_second_team, null, 6), new y3d(secondary2), 18), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508));
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                cscVar = new csc(pif0Var, new rqm((vui0) new tui0(lsm0Var.a(R.string.clear_all_track, Arrays.copyOf(new Object[0], 0)), new y3d(jD)), (pui0) new oui0(Integer.valueOf(R.drawable.ic_delete_basket_new), new y3d(jD), new m0x(R.drawable.ic_delete_basket_new, null, 6), new y3d(jD), 16), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508));
            }
            arrayList.add(cscVar);
        }
        return new jsc(dyb.o0(arrayList));
    }

    private final Object t(Object obj) {
        dmm dmmVar;
        List listC;
        Object obj2;
        cnb cnbVar;
        cnb cnbVar2;
        whg whgVar = (whg) obj;
        whgVar.getClass();
        String str = whgVar.c;
        hhq0 hhq0Var = whgVar.f;
        boolean z = whgVar.d;
        cnb cnbVar3 = whgVar.b;
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        boolean z2 = whgVar.h;
        tlm nlmVar = z2 ? new nlm(new hmm(10, str, ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
        boolean z3 = cnbVar3 instanceof bnb;
        ra50 ra50Var = ra50.f30118a;
        if (z3) {
            dmmVar = new dmm(z2 ? new ta50(acb.Y(z)) : new va50(new wkm(1001, R.drawable.ic_glyph_search, true, ra50Var, s6t0.b().f33626a.getSecondary()), acb.Y(z)));
        } else {
            boolean z4 = hhq0Var.f13078a != ygq0.NOT;
            dmmVar = new dmm(z2 ? new ta50(acb.Z(z4)) : new va50(new wkm(1001, R.drawable.ic_glyph_search, true, ra50Var, s6t0.b().f33626a.getSecondary()), acb.Z(z4)));
        }
        imm immVar = new imm(ilmVar, nlmVar, dmmVar, s6t0.b().f33626a.getBackgroundContent(), false, null);
        CyberChampsMainParams cyberChampsMainParams = whgVar.f39166a;
        boolean zD = Intrinsics.d(cyberChampsMainParams.f46548a, CyberGamesPage.Real.INSTANCE);
        bnb bnbVar = bnb.f2874a;
        i4 i4VarG0 = !zD ? dyb.g0(bnbVar) : dyb.g0(bnbVar, anb.f1141a);
        i4VarG0.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(i4VarG0, 10));
        ListIterator listIterator = i4VarG0.listIterator(0);
        while (listIterator.hasNext()) {
            cnb cnbVar4 = (cnb) listIterator.next();
            arrayList.add(new Pair(cnbVar4, new ajg(Intrinsics.d(cnbVar4, bnbVar) ? sip.c : sip.b)));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        CyberGamesPage cyberGamesPage = cyberChampsMainParams.f46548a;
        cyberGamesPage.getClass();
        if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
            listC = q3d.j(new kwh0(twh0.f34649a, R.string.cyber_champ_live), new kwh0(twh0.b, R.string.line));
        } else {
            if (!cyberGamesPage.equals(CyberGamesPage.Virtual.INSTANCE) && !cyberGamesPage.equals(CyberGamesPage.OneXCyber.INSTANCE)) {
                t9f.b();
                return null;
            }
            listC = kotlin.collections.a.c(new kwh0(twh0.f34649a, R.string.cyber_champ_live));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList2.add(ctf0Var.b.a(((kwh0) it.next()).b, Arrays.copyOf(new Object[0], 0)));
        }
        a4x a4xVarO1 = dyb.o0(arrayList2);
        a4xVarO0.getClass();
        Iterator<E> it2 = a4xVarO0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            Object next = it2.next();
            if (((ajg) ((Pair) next).b).f974a == sip.c) {
                obj2 = next;
                break;
            }
        }
        Pair pair = (Pair) obj2;
        if (pair == null || (cnbVar2 = (cnb) pair.f46059a) == null) {
            Pair pair2 = (Pair) CollectionsKt.firstOrNull(a4xVarO0);
            cnb cnbVar5 = bnbVar;
            if (pair2 != null) {
                cnbVar5 = (cnb) pair2.f46059a;
            }
            cnbVar = cnbVar5;
        } else {
            cnbVar = cnbVar2;
        }
        return new xhg(immVar, new bjg(i4VarG0, a4xVarO1, a4xVarO0, cnbVar, i4VarG0.indexOf(cnbVar3)), new pgg(z, whgVar.e, hhq0Var), str);
    }

    private final Object u(Object obj) {
        ak60 ak60Var;
        sk60 sk60Var = (sk60) obj;
        sk60Var.getClass();
        xkb0 xkb0Var = sk60Var.f32332a;
        ak60 ak60Var2 = null;
        if (xkb0Var != null) {
            ctf0 ctf0Var = this.b;
            ctf0Var.getClass();
            if (xkb0Var instanceof tkb0) {
                skb0 skb0Var = skb0.ShowGameCard;
                lsm0 lsm0Var = ctf0Var.b;
                ak60Var = new ak60("ShowGameCard", lsm0Var.a(R.string.onboarding_popular_sport_tab_show_game_card_desc, Arrays.copyOf(new Object[0], 0)), dyb.g0(vzb.m0(((tkb0) xkb0Var).f34087a)), lsm0Var.a(R.string.skip, Arrays.copyOf(new Object[0], 0)), new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.next, Arrays.copyOf(new Object[0], 0))), true, false, true), new yu9(xkb0Var.a(), skb0Var), null, 128);
            } else if (xkb0Var instanceof ukb0) {
                skb0 skb0Var2 = skb0.ShowGameCardMarkets;
                lsm0 lsm0Var2 = ctf0Var.b;
                ak60Var = new ak60("ShowGameCardMarkets", lsm0Var2.a(R.string.onboarding_popular_sport_tab_show_game_card_markets_desc, Arrays.copyOf(new Object[0], 0)), dyb.g0(vzb.m0(((ukb0) xkb0Var).f35821a)), lsm0Var2.a(R.string.skip, Arrays.copyOf(new Object[0], 0)), new wul(lul.e, oe9.f25112a, new ue9(lsm0Var2.a(R.string.next, Arrays.copyOf(new Object[0], 0))), true, false, true), new yu9(xkb0Var.a(), skb0Var2), null, 384);
            } else if (xkb0Var instanceof vkb0) {
                vkb0 vkb0Var = (vkb0) xkb0Var;
                skb0 skb0Var3 = skb0.ShowSports;
                lsm0 lsm0Var3 = ctf0Var.b;
                String strA = lsm0Var3.a(R.string.onboarding_popular_sport_tab_show_sports_desc, Arrays.copyOf(new Object[0], 0));
                lc00 lc00VarB = kotlin.collections.a.b();
                ArrayList arrayList = vkb0Var.f37565a;
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(vzb.m0((egd) it.next()));
                }
                lc00VarB.addAll(arrayList2);
                egd egdVar = vkb0Var.b;
                if (egdVar != null) {
                    lc00VarB.add(vzb.m0(egdVar));
                }
                egd egdVar2 = vkb0Var.c;
                if (egdVar2 != null) {
                    lc00VarB.add(vzb.m0(egdVar2));
                }
                ak60Var2 = new ak60("ShowSports", strA, dyb.r0(kotlin.collections.a.a(lc00VarB)), lsm0Var3.a(R.string.skip, Arrays.copyOf(new Object[0], 0)), new wul(lul.e, oe9.f25112a, new ue9(lsm0Var3.a(R.string.next, Arrays.copyOf(new Object[0], 0))), true, false, true), new yu9(xkb0Var.a(), skb0.ShowSports), null, 384);
            } else {
                if (!(xkb0Var instanceof wkb0)) {
                    t9f.b();
                    return null;
                }
                skb0 skb0Var4 = skb0.ShowSports;
                lsm0 lsm0Var4 = ctf0Var.b;
                ak60Var = new ak60("TopUpBalance", lsm0Var4.a(R.string.onboarding_popular_sport_tab_show_balance_desc, Arrays.copyOf(new Object[0], 0)), dyb.g0(vzb.m0(((wkb0) xkb0Var).f39300a)), lsm0Var4.a(R.string.to_complete, Arrays.copyOf(new Object[0], 0)), new wul(iul.e, oe9.f25112a, new ve9(lsm0Var4.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_plus_small), true, false, true), new zu9(xkb0Var.a()), new zu9(xkb0Var.a()), 256);
            }
            ak60Var2 = ak60Var;
        }
        return new vk60(xkb0Var, ak60Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [a.lc00, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Collection] */
    private final Object v(Object obj) {
        ?? arrayList;
        List list;
        swa0 swa0Var = (swa0) obj;
        swa0Var.getClass();
        qwa0 qwa0Var = swa0Var.f32913a;
        String str = swa0Var.b;
        pwa0 pwa0Var = qwa0Var.f;
        y3d y3dVar = null;
        int i = 0;
        if (pwa0Var == null || (list = pwa0Var.f27703a) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jwa0 jwa0Var = (jwa0) it.next();
                Integer numValueOf = Integer.valueOf(i);
                tui0 tui0Var = new tui0(jwa0Var.b, y3dVar);
                Integer numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_bonus);
                pz40 pz40Var = s6t0.f31722a;
                arrayList.add(new lwa0(new kvl(numValueOf, tui0Var, new oui0(numValueOf2, new y3d(s6t0.b().f33626a.getSecondary()), new n0x(ohs0.n(str, jwa0Var.f17242a)), new y3d(s6t0.b().f33626a.getSecondary()), 16), null, null, Response.SERVER_TIMEOUT)));
                it = it;
                y3dVar = null;
                i = 0;
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        i4 i4VarG0 = dyb.g0(new pr5(new n0x(ohs0.n(str, "/static/img/android/casino/bonus_message/Onboard.webp")), null, null, Integer.valueOf(R.drawable.onboarding_placeholder)));
        ?? B = kotlin.collections.a.b();
        B.add(new nwa0(qwa0Var.d));
        String str2 = qwa0Var.b;
        ro8 ro8Var = ro8.f30824a;
        B.add(new kwa0(str2));
        long j = pwa0Var != null ? pwa0Var.b : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        gx1 gx1Var = gx1.f12054a;
        ctf0 ctf0Var = this.b;
        lsm0 lsm0Var = ctf0Var.b;
        lsm0 lsm0Var2 = ctf0Var.b;
        long j2 = (j * 1000) - jCurrentTimeMillis;
        B.add(new mwa0(new yrl(lsm0Var.a(R.string.pop_up_bonus_timer_title, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.day_short, Arrays.copyOf(new Object[0], 0)), "", "", "", j2 < 0 ? 0L : j2)));
        B.addAll(arrayList);
        i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(B));
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        return new twa0(i4VarG0, i4VarR0, new wul(lulVar, oe9Var, new ue9(lsm0Var2.a(R.string.tournaments_more, Arrays.copyOf(new Object[0], 0))), true, false, true), new wul(nul.e, oe9Var, new ue9(lsm0Var2.a(R.string.later, Arrays.copyOf(new Object[0], 0))), true, false, true));
    }

    private final Object w(Object obj) {
        String str;
        f0j0 f0j0Var = (f0j0) obj;
        f0j0Var.getClass();
        List<jvn> list = f0j0Var.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (jvn jvnVar : list) {
            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
            jvnVar.getClass();
            int iOrdinal = jvnVar.ordinal();
            boolean z = true;
            if (iOrdinal == 0) {
                str = "+120";
            } else if (iOrdinal == 1) {
                str = "6/5";
            } else if (iOrdinal != 2) {
                str = "1.2";
                if (iOrdinal != 3 && iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        t9f.b();
                        return null;
                    }
                    str = "-0.834";
                }
            } else {
                str = "2.2";
            }
            String strUnicodeWrap = bidiFormatter.unicodeWrap(str);
            strUnicodeWrap.getClass();
            rui0 rui0Var = new rui0(strUnicodeWrap, null, this.b.b.a(lgb.W(jvnVar), Arrays.copyOf(new Object[0], 0)), null, 58);
            if (jvnVar != f0j0Var.f8720a) {
                z = false;
            }
            arrayList.add(new pzc(jvnVar, new rqm((vui0) rui0Var, (pui0) null, (pvi0) new nvi0(z), (d4d) null, (tvi0) null, wui0.f39793a, false, (e900) null, 442)));
        }
        return new g0j0(dyb.o0(arrayList));
    }

    private final Object x(Object obj) {
        int i;
        int i2;
        vnn0 vnn0Var = (vnn0) obj;
        vnn0Var.getClass();
        boolean z = vnn0Var.c < 5;
        lc00 lc00VarB = kotlin.collections.a.b();
        ctf0 ctf0Var = this.b;
        if (z) {
            wdn wdnVar = vnn0Var.b;
            ctf0Var.getClass();
            int iOrdinal = wdnVar.ordinal();
            if (iOrdinal == 0) {
                i = R.drawable.ic_glyph_second_team;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                i = R.drawable.ic_glyph_first_team;
            }
            pz40 pz40Var = s6t0.f31722a;
            long secondary = s6t0.b().f33626a.getSecondary();
            int iOrdinal2 = wdnVar.ordinal();
            if (iOrdinal2 == 0) {
                wdn wdnVar2 = wdn.c;
                i2 = 2;
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return null;
                }
                wdn wdnVar3 = wdn.c;
                i2 = 1;
            }
            lc00VarB.add(new wnn0(qnn0.f29039a, new rqm((vui0) new tui0(ctf0Var.b.a(R.string.players_duel_swap_to_team_number, Arrays.copyOf(new Object[]{String.valueOf(i2)}, 1)), null), (pui0) new oui0(Integer.valueOf(i), new y3d(secondary), new m0x(i, null, 6), new y3d(secondary), 16), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508)));
        }
        ctf0Var.getClass();
        long jD = fbc.d(ctf0Var.a(R.color.static_red));
        lc00VarB.add(new wnn0(pnn0.f27298a, new rqm((vui0) new tui0(ctf0Var.b.a(R.string.remove, Arrays.copyOf(new Object[0], 0)), new y3d(jD)), (pui0) new oui0(Integer.valueOf(R.drawable.ic_glyph_trash), new y3d(jD), new m0x(R.drawable.ic_glyph_trash, null, 6), new y3d(jD), 16), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508)));
        return new xnn0(dyb.o0(kotlin.collections.a.a(lc00VarB)));
    }

    private final Object y(Object obj) {
        dxh0 dxh0Var;
        String str;
        qim oimVar;
        List list;
        ibo0 ibo0Var;
        zdo0 zdo0VarB;
        boolean z;
        qim limVar;
        emm emmVar;
        gmm emmVar2;
        w6r0 w6r0Var = (w6r0) obj;
        w6r0Var.getClass();
        String str2 = w6r0Var.m;
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.y6r0
            public final /* synthetic */ m72 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                m72 m72Var = this.b;
                switch (b2) {
                    case 0:
                        lc00 lc00VarB = kotlin.collections.a.b();
                        ctf0 ctf0Var = m72Var.b;
                        lc00VarB.add(ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)));
                        lc00VarB.add(ctf0Var.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)));
                        return dyb.o0(kotlin.collections.a.a(lc00VarB));
                    default:
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        ctf0 ctf0Var2 = m72Var.b;
                        lc00VarB2.add(new pim(R.drawable.ic_glyph_live, ctf0Var2.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0))));
                        lc00VarB2.add(new pim(R.drawable.ic_glyph_line, ctf0Var2.b.a(R.string.line, Arrays.copyOf(new Object[0], 0))));
                        return dyb.o0(kotlin.collections.a.a(lc00VarB2));
                }
            }
        };
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, function0);
        final byte b2 = 1;
        a8z a8zVarA2 = maz.a(wezVar, new Function0(this) { // from class: a.y6r0
            public final /* synthetic */ m72 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                m72 m72Var = this.b;
                switch (b3) {
                    case 0:
                        lc00 lc00VarB = kotlin.collections.a.b();
                        ctf0 ctf0Var = m72Var.b;
                        lc00VarB.add(ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)));
                        lc00VarB.add(ctf0Var.b.a(R.string.line, Arrays.copyOf(new Object[0], 0)));
                        return dyb.o0(kotlin.collections.a.a(lc00VarB));
                    default:
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        ctf0 ctf0Var2 = m72Var.b;
                        lc00VarB2.add(new pim(R.drawable.ic_glyph_live, ctf0Var2.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0))));
                        lc00VarB2.add(new pim(R.drawable.ic_glyph_line, ctf0Var2.b.a(R.string.line, Arrays.copyOf(new Object[0], 0))));
                        return dyb.o0(kotlin.collections.a.a(lc00VarB2));
                }
            }
        });
        h8l0 h8l0Var = w6r0Var.e;
        m7r0 m7r0Var = w6r0Var.d;
        int iOrdinal = h8l0Var.ordinal();
        ctf0 ctf0Var = this.b;
        if (iOrdinal == 0) {
            String strA = ctf0Var.b.a(R.string.feed_title_game_list, Arrays.copyOf(new Object[0], 0));
            boolean z2 = w6r0Var.c;
            String strA2 = ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
            gmm gmmVarC = c(w6r0Var);
            int iD = d(w6r0Var);
            a4x a4xVar = (a4x) a8zVarA.getValue();
            int iOrdinal2 = w6r0Var.u.ordinal();
            if (iOrdinal2 == 0) {
                dxh0Var = axh0.f1625a;
            } else if (iOrdinal2 == 1) {
                dxh0Var = zwh0.f45106a;
            } else if (iOrdinal2 == 2) {
                dxh0Var = cxh0.f5122a;
            } else {
                if (iOrdinal2 != 3) {
                    t9f.b();
                    return null;
                }
                dxh0Var = bxh0.f3376a;
            }
            str = str2;
            oimVar = new oim(strA, z2, strA2, str2, true, gmmVarC, iD, a4xVar, dxh0Var, null);
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                str = str2;
                limVar = new lim(d(w6r0Var), c(w6r0Var), (a4x) a8zVarA2.getValue(), ctf0Var.b.a(R.string.feed_title_game_list, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), str, null, w6r0Var.c, true);
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                String strA3 = ctf0Var.b.a(R.string.feed_title_game_list, Arrays.copyOf(new Object[0], 0));
                boolean z3 = w6r0Var.c;
                String strA4 = ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
                a8z a8zVarA3 = maz.a(wezVar, new joq0((byte) 14));
                boolean z4 = w6r0Var.c;
                if (m7r0Var != m7r0.b) {
                    skm skmVar = new skm(1, w6r0Var.b ? R.drawable.ic_glyph_video_active : R.drawable.ic_glyph_video_inactive, w6r0Var.n, (y3d) null, 48);
                    if (z4) {
                        emmVar2 = new emm(new la50(skmVar));
                    } else {
                        emmVar = new emm(new na50((skm) a8zVarA3.getValue(), skmVar));
                        emmVar2 = emmVar;
                    }
                } else if (z4) {
                    emmVar2 = fmm.f9790a;
                } else {
                    emmVar = new emm(new la50((skm) a8zVarA3.getValue()));
                    emmVar2 = emmVar;
                }
                str = str2;
                limVar = new nim(d(w6r0Var), emmVar2, (a4x) a8zVarA2.getValue(), strA3, strA4, str, null, z3, true);
            }
            oimVar = limVar;
        } else {
            oimVar = new mim(c(w6r0Var), w6r0Var.c, ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), str2, true, d(w6r0Var), (a4x) a8zVarA.getValue(), (String) null, 384);
            str = str2;
        }
        on00 on00Var = w6r0Var.p;
        Boolean bool = w6r0Var.j;
        Boolean bool2 = w6r0Var.k;
        hn00 hn00Var = on00Var instanceof hn00 ? (hn00) on00Var : null;
        if (hn00Var == null || (list = (List) hn00Var.f13329a) == null) {
            list = iun.f15405a;
        }
        List list2 = list;
        if (w6r0Var.h == null || bool2 == null || bool == null || w6r0Var.i == null) {
            ibo0Var = null;
        } else {
            ibo0Var = new ibo0(StringsKt.u0(str).toString(), w6r0Var.n, w6r0Var.f38639a, w6r0Var.d, w6r0Var.i, w6r0Var.g, list2, w6r0Var.h, bool.booleanValue(), bool2.booleanValue(), w6r0Var.v);
        }
        int iOrdinal3 = m7r0Var.ordinal();
        if (iOrdinal3 == 0) {
            zdo0VarB = B(w6r0Var.q, ibo0Var);
        } else {
            if (iOrdinal3 != 1) {
                t9f.b();
                return null;
            }
            zdo0VarB = B(w6r0Var.r, ibo0Var);
        }
        zdo0 zdo0Var = zdo0VarB;
        boolean z5 = w6r0Var.o;
        int iD2 = d(w6r0Var);
        int iOrdinal4 = m7r0Var.ordinal();
        if (iOrdinal4 == 0) {
            z = w6r0Var.s;
        } else {
            if (iOrdinal4 != 1) {
                t9f.b();
                return null;
            }
            z = w6r0Var.t;
        }
        return new x6r0(oimVar, h8l0Var == h8l0.SMALL_HEADER_MEDIUM_TABS_BACKGROUND, z, h8l0Var == h8l0.NO_HEADER_LARGE_TABS || h8l0Var == h8l0.LARGE_HEADER_MEDIUM_TABS, z5, iD2, zdo0Var);
    }

    public static ArrayList z(List list, wcb wcbVar, ctf0 ctf0Var, boolean z, boolean z2, v5l0 v5l0Var, y78 y78Var, List list2, boolean z3, boolean z4) {
        Object next;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0t d0tVar = (d0t) it.next();
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((lok0) next).f20396a != d0tVar.O);
            lok0 lok0Var = (lok0) next;
            String strA = wcbVar.a(d0tVar.v, d0tVar.u);
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((lok0) it3.next()).f20396a));
            }
            boolean z5 = lok0Var != null ? lok0Var.n : false;
            boolean z6 = lok0Var != null ? lok0Var.p : false;
            m5l0 m5l0Var = d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a;
            String str = lok0Var != null ? lok0Var.u : null;
            if (str == null) {
                str = "";
            }
            arrayList.add(new bws(wwb.V(d0tVar, ctf0Var, y78Var, z, z2, strA, false, arrayList2, z5, z6, false, v5l0Var, m5l0Var, str, z4), z4, z3));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v27 a.xdo0, still in use, count: 2, list:
          (r1v27 a.xdo0) from 0x01ef: MOVE (r26v0 a.xdo0) = (r1v27 a.xdo0) (LINE:496)
          (r1v27 a.xdo0) from 0x0120: PHI (r1v31 a.xdo0) = (r1v27 a.xdo0), (r1v36 a.xdo0) binds: [B:42:0x0113, B:73:0x01b8] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public a.zdo0 B(a.odt r30, a.ibo0 r31) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m72.B(a.odt, a.ibo0):a.zdo0");
    }

    public String C(b9g0 b9g0Var) {
        int iOrdinal = b9g0Var.ordinal();
        ctf0 ctf0Var = this.b;
        if (iOrdinal == 0) {
            return ctf0Var.b.a(R.string.history, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 1) {
            return ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 2) {
            return ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
        }
        t9f.b();
        return null;
    }

    public a4x i() {
        c0o c0oVar = b9g0.f;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            arrayList.add(C((b9g0) y2Var.next()));
        }
        return dyb.o0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x016d  */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        qim qimVar;
        boolean z;
        boolean z2;
        afb zebVar;
        qim qimVar2;
        boolean z3;
        List list;
        Iterator it;
        Set set;
        i8l0 i8l0Var;
        String str;
        Iterable iterableC;
        long j;
        boolean z4;
        int i;
        char c;
        b8l0 t6l0Var;
        int i2;
        char c2;
        int i3;
        char c3;
        n3l0 l3l0Var;
        hhv hhvVar;
        List list2;
        hhv hhvVar2;
        String str2;
        long j2;
        boolean z5;
        int i4;
        char c4;
        b8l0 t6l0Var2;
        n3l0 k3l0Var;
        int i5;
        char c5;
        String string;
        qim qimVar3;
        boolean z6;
        boolean z7;
        afb zebVar2;
        qim qimVar4;
        List list3;
        Iterator it2;
        boolean z8;
        boolean z9;
        String str3;
        Iterable iterableC2;
        long j3;
        boolean z10;
        b8l0 u7l0Var;
        int i6;
        char c6;
        hhv hhvVar3;
        boolean z11;
        hhv hhvVar4;
        boolean z12;
        b8l0 u7l0Var2;
        boolean z13;
        String strA;
        gmm dmmVar;
        dxh0 dxh0Var;
        qim oimVar;
        Date time;
        byte b = this.f21298a;
        String str4 = "";
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                g72 g72Var = (g72) obj;
                g72Var.getClass();
                j8l0 j8l0Var = g72Var.e;
                boolean z14 = g72Var.l;
                Set set2 = g72Var.r;
                Set set3 = g72Var.p;
                List list4 = g72Var.q;
                boolean z15 = g72Var.o;
                String str5 = g72Var.f10792a;
                int i7 = g72Var.m;
                f72 f72Var = g72Var.d;
                boolean z16 = g72Var.k;
                int iOrdinal = j8l0Var.ordinal();
                if (iOrdinal == 0) {
                    return nnw0.M(g72Var, ctf0Var);
                }
                if (iOrdinal == 1) {
                    return hmw0.g0(g72Var, ctf0Var);
                }
                if (iOrdinal == 2) {
                    return hmw0.g0(g72Var, ctf0Var);
                }
                String str6 = Separators.SLASH;
                j3l0 j3l0Var = j3l0.f15840a;
                if (iOrdinal == 3) {
                    boolean z17 = z14;
                    boolean z18 = z16;
                    String str7 = Separators.SLASH;
                    ctf0Var.getClass();
                    qim qimVarX = hew0.X(g72Var, ctf0Var);
                    boolean z19 = f72Var instanceof d72;
                    List listP = z19 ? vbw0.P(str5, ((d72) f72Var).f5574a) : iun.f15405a;
                    if (f72Var instanceof e72) {
                        zebVar = new zeb(14);
                    } else if (f72Var instanceof c72) {
                        xuz xuzVar = pb10.c;
                        pb10 pb10Var = pb10.g;
                        xuzVar.getClass();
                        zebVar = new yeb(new mdm(xuz.a(pb10Var, i7), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    } else {
                        if (!z19 || !((d72) f72Var).f5574a.isEmpty()) {
                            if (z19 && listP.isEmpty()) {
                                xuz xuzVar2 = pb10.c;
                                pb10 pb10Var2 = pb10.e;
                                xuzVar2.getClass();
                                zebVar = new yeb(new mdm(xuz.a(pb10Var2, i7), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                            } else if (z19) {
                                i8l0 i8l0Var2 = g72Var.h;
                                ArrayList arrayList = new ArrayList();
                                Iterator it3 = listP.iterator();
                                int i8 = 0;
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    String str8 = str4;
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    odb odbVar = (odb) next;
                                    hhv hhvVarX = vbw0.X((odb) CollectionsKt.W(i8 - 1, listP), (odb) CollectionsKt.W(i9, listP));
                                    if (odbVar != null) {
                                        if (odbVar instanceof ndb) {
                                            ndb ndbVar = (ndb) odbVar;
                                            it = it3;
                                            long j4 = ndbVar.f23331a;
                                            list = listP;
                                            String strValueOf = String.valueOf(j4);
                                            String str9 = ndbVar.b;
                                            qimVar2 = qimVarX;
                                            String str10 = i8l0Var2.f14345a;
                                            z3 = z18;
                                            if (j4 != 0) {
                                                bzu bzuVarE = rz4.e("static", "svg", "sports_v3", str10);
                                                rz4.s(j4, ".svg", bzuVarE);
                                                string = ((StringBuilder) bzuVarE.b).toString();
                                            } else {
                                                string = str8;
                                            }
                                            iterableC = kotlin.collections.a.c(new gsv(new hjm(str9, new ojm(127), null, new n0x(string), null, new m0x(R.drawable.ic_glyph_category_new, null, 6), false, null, null, i8l0Var2 == i8l0.MONOCHROME, null, null, 7636), strValueOf));
                                            set = set2;
                                            i8l0Var = i8l0Var2;
                                            str = str7;
                                        } else {
                                            qimVar2 = qimVarX;
                                            z3 = z18;
                                            xeb xebVar = xebVar;
                                            list = listP;
                                            it = it3;
                                            z17 = z17;
                                            if (odbVar instanceof kdb) {
                                                kdb kdbVar = (kdb) odbVar;
                                                long j5 = kdbVar.f18097a;
                                                List list5 = kdbVar.g;
                                                boolean zContains = set2.contains(Long.valueOf(j5));
                                                long j6 = kdbVar.f18097a;
                                                long j7 = kdbVar.c;
                                                hhv hhvVar5 = hhvVarX;
                                                long j8 = kdbVar.d;
                                                Integer intOrNull = StringsKt.toIntOrNull(kdbVar.f);
                                                int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                                                int size = list5.size();
                                                String str11 = kdbVar.b;
                                                pz40 pz40Var = s6t0.f31722a;
                                                set = set2;
                                                long textPrimary = s6t0.b().f33626a.getTextPrimary();
                                                Object[] objArr = {Integer.valueOf(iIntValue)};
                                                i8l0Var = i8l0Var2;
                                                lsm0 lsm0Var = ctf0Var.b;
                                                y1l0 y1l0Var = new y1l0(textPrimary, str11, lsm0Var.a(R.string.history_events_v2, Arrays.copyOf(objArr, 1)));
                                                StringBuilder sb = new StringBuilder(ujn.h);
                                                String str12 = kdbVar.e;
                                                if (str12.length() == 0) {
                                                    sb.setLength(0);
                                                    str = str7;
                                                } else {
                                                    if (StringsKt.O(str12, ujn.h, false)) {
                                                        i3 = 0;
                                                    } else if (kotlin.text.c.x(str12, "https://", false)) {
                                                        i3 = 0;
                                                    } else {
                                                        if (sb.length() > 0) {
                                                            str = str7;
                                                            c3 = '/';
                                                            if (!StringsKt.S(sb, str)) {
                                                                sb.append('/');
                                                            }
                                                        } else {
                                                            str = str7;
                                                            c3 = '/';
                                                        }
                                                        sb.append(StringsKt.y0(str12, c3));
                                                    }
                                                    str = str7;
                                                    sb.setLength(i3);
                                                    sb.append(str12);
                                                }
                                                s6l0 s6l0Var = new s6l0(y1l0Var, sb.toString(), null, null, null, zContains, Integer.valueOf(size), 28);
                                                if (zContains) {
                                                    zcl zclVar = qmk.f28987a;
                                                    l3l0Var = new m3l0();
                                                } else {
                                                    zcl zclVar2 = qmk.f28987a;
                                                    l3l0Var = new l3l0(16.0f);
                                                }
                                                n3l0 n3l0Var = l3l0Var;
                                                d4d d4dVar = d4d.BACKGROUND_CONTENT;
                                                sfl0 sfl0Var = zContains ? sfl0.b : sfl0.c;
                                                if (zContains) {
                                                    hhv hhvVar6 = hhv.f13084a;
                                                    if (hhvVar5 != hhvVar6 && hhvVar5 != hhv.d) {
                                                        hhvVar6 = hhv.b;
                                                    }
                                                    hhvVar = hhvVar6;
                                                } else {
                                                    hhvVar = hhvVar5;
                                                }
                                                fql0 fql0Var = new fql0(j6, j7, j8, s6l0Var, d4dVar, n3l0Var, sfl0Var, false, hhvVar);
                                                if (zContains) {
                                                    List listC = kotlin.collections.a.c(fql0Var);
                                                    ArrayList arrayList2 = new ArrayList(r3d.q(list5, 10));
                                                    Iterator it4 = list5.iterator();
                                                    int i10 = 0;
                                                    while (it4.hasNext()) {
                                                        Object next2 = it4.next();
                                                        int i11 = i10 + 1;
                                                        if (i10 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        mdb mdbVar = (mdb) next2;
                                                        boolean z20 = i10 == list5.size() + (-1);
                                                        if (z20) {
                                                            hhvVar2 = hhv.c;
                                                            list2 = list5;
                                                            if (hhvVar5 != hhvVar2 && hhvVar5 != hhv.d) {
                                                                hhvVar2 = hhv.b;
                                                            }
                                                        } else {
                                                            list2 = list5;
                                                            hhvVar2 = hhv.b;
                                                        }
                                                        Iterator it5 = it4;
                                                        hhv hhvVar7 = hhvVar2;
                                                        boolean z21 = z20;
                                                        long j9 = mdbVar.f21587a;
                                                        String str13 = mdbVar.b;
                                                        String str14 = mdbVar.f;
                                                        String str15 = mdbVar.g;
                                                        hhv hhvVar8 = hhvVar5;
                                                        long j10 = mdbVar.c;
                                                        long j11 = mdbVar.d;
                                                        if (list4 == null || !list4.isEmpty()) {
                                                            Iterator it6 = list4.iterator();
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    str2 = str15;
                                                                    i5p i5pVar = (i5p) it6.next();
                                                                    j2 = j11;
                                                                    if (i5pVar.f14203a == j9 && i5pVar.b == mdbVar.c && i5pVar.c == mdbVar.d) {
                                                                        z5 = true;
                                                                    } else {
                                                                        str15 = str2;
                                                                        j11 = j2;
                                                                    }
                                                                } else {
                                                                    str2 = str15;
                                                                    j2 = j11;
                                                                    z5 = false;
                                                                }
                                                            }
                                                        } else {
                                                            str2 = str15;
                                                            j2 = j11;
                                                            z5 = false;
                                                        }
                                                        if (z15) {
                                                            boolean zContains2 = set3.contains(Long.valueOf(j9));
                                                            pz40 pz40Var2 = s6t0.f31722a;
                                                            long textPrimary2 = s6t0.b().f33626a.getTextPrimary();
                                                            Integer intOrNull2 = StringsKt.toIntOrNull(str2);
                                                            y1l0 y1l0Var2 = new y1l0(textPrimary2, str13, lsm0Var.a(R.string.history_events_v2, Arrays.copyOf(new Object[]{Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0)}, 1)));
                                                            boolean z22 = zContains2 || set3.size() < 10;
                                                            StringBuilder sb2 = new StringBuilder(ujn.h);
                                                            if (str14.length() == 0) {
                                                                sb2.setLength(0);
                                                            } else {
                                                                if (StringsKt.O(str14, ujn.h, false)) {
                                                                    i5 = 0;
                                                                } else if (kotlin.text.c.x(str14, "https://", false)) {
                                                                    i5 = 0;
                                                                } else {
                                                                    if (sb2.length() <= 0 || StringsKt.S(sb2, str)) {
                                                                        c5 = '/';
                                                                    } else {
                                                                        c5 = '/';
                                                                        sb2.append('/');
                                                                    }
                                                                    sb2.append(StringsKt.y0(str14, c5));
                                                                }
                                                                sb2.setLength(i5);
                                                                sb2.append(str14);
                                                            }
                                                            t6l0Var2 = new u6l0(y1l0Var2, sb2.toString(), null, zContains2, z22, 28);
                                                        } else {
                                                            pz40 pz40Var3 = s6t0.f31722a;
                                                            long textPrimary3 = s6t0.b().f33626a.getTextPrimary();
                                                            Integer intOrNull3 = StringsKt.toIntOrNull(str2);
                                                            boolean z23 = z5;
                                                            y1l0 y1l0Var3 = new y1l0(textPrimary3, str13, lsm0Var.a(R.string.history_events_v2, Arrays.copyOf(new Object[]{Integer.valueOf(intOrNull3 != null ? intOrNull3.intValue() : 0)}, 1)));
                                                            StringBuilder sb3 = new StringBuilder(ujn.h);
                                                            if (str14.length() == 0) {
                                                                sb3.setLength(0);
                                                            } else {
                                                                if (StringsKt.O(str14, ujn.h, false)) {
                                                                    i4 = 0;
                                                                } else if (kotlin.text.c.x(str14, "https://", false)) {
                                                                    i4 = 0;
                                                                } else {
                                                                    if (sb3.length() <= 0 || StringsKt.S(sb3, str)) {
                                                                        c4 = '/';
                                                                    } else {
                                                                        c4 = '/';
                                                                        sb3.append('/');
                                                                    }
                                                                    sb3.append(StringsKt.y0(str14, c4));
                                                                }
                                                                sb3.setLength(i4);
                                                                sb3.append(str14);
                                                            }
                                                            t6l0Var2 = new t6l0(y1l0Var3, z23 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, sb3.toString(), null, 56);
                                                        }
                                                        boolean z24 = !z21;
                                                        if (z21 != 0) {
                                                            zcl zclVar3 = qmk.f28987a;
                                                            k3l0Var = new k3l0();
                                                        } else {
                                                            k3l0Var = j3l0Var;
                                                        }
                                                        arrayList2.add(new fql0(j9, j10, j2, t6l0Var2, d4d.BACKGROUND_CONTENT, k3l0Var, z21 ? sfl0.e : sfl0.d, z24, hhvVar7));
                                                        list5 = list2;
                                                        it4 = it5;
                                                        i10 = i11;
                                                        hhvVar5 = hhvVar8;
                                                    }
                                                    iterableC = CollectionsKt.q0(listC, arrayList2);
                                                } else {
                                                    iterableC = kotlin.collections.a.c(fql0Var);
                                                }
                                            } else {
                                                set = set2;
                                                i8l0Var = i8l0Var2;
                                                str = str7;
                                                if (odbVar instanceof ldb) {
                                                    ldb ldbVar = (ldb) odbVar;
                                                    String str16 = ldbVar.b;
                                                    long j12 = ldbVar.f19842a;
                                                    String str17 = ldbVar.e;
                                                    String str18 = ldbVar.f;
                                                    long j13 = ldbVar.c;
                                                    long j14 = ldbVar.d;
                                                    if (list4 == null || !list4.isEmpty()) {
                                                        Iterator it7 = list4.iterator();
                                                        while (true) {
                                                            if (it7.hasNext()) {
                                                                i5p i5pVar2 = (i5p) it7.next();
                                                                j = j14;
                                                                if (i5pVar2.f14203a == j12 && i5pVar2.b == ldbVar.c && i5pVar2.c == ldbVar.d) {
                                                                    z4 = true;
                                                                } else {
                                                                    j14 = j;
                                                                }
                                                            } else {
                                                                j = j14;
                                                                z4 = false;
                                                            }
                                                        }
                                                    } else {
                                                        j = j14;
                                                        z4 = false;
                                                    }
                                                    if (z15) {
                                                        boolean zContains3 = set3.contains(Long.valueOf(j12));
                                                        pz40 pz40Var4 = s6t0.f31722a;
                                                        long textPrimary4 = s6t0.b().f33626a.getTextPrimary();
                                                        Integer intOrNull4 = StringsKt.toIntOrNull(str18);
                                                        y1l0 y1l0Var4 = new y1l0(textPrimary4, str16, ctf0Var.b.a(R.string.history_events_v2, Arrays.copyOf(new Object[]{Integer.valueOf(intOrNull4 != null ? intOrNull4.intValue() : 0)}, 1)));
                                                        boolean z25 = zContains3 || set3.size() < 10;
                                                        StringBuilder sb4 = new StringBuilder(ujn.h);
                                                        if (str17.length() == 0) {
                                                            sb4.setLength(0);
                                                        } else {
                                                            if (StringsKt.O(str17, ujn.h, false)) {
                                                                i2 = 0;
                                                            } else if (kotlin.text.c.x(str17, "https://", false)) {
                                                                i2 = 0;
                                                            } else {
                                                                if (sb4.length() <= 0 || StringsKt.S(sb4, str)) {
                                                                    c2 = '/';
                                                                } else {
                                                                    c2 = '/';
                                                                    sb4.append('/');
                                                                }
                                                                sb4.append(StringsKt.y0(str17, c2));
                                                            }
                                                            sb4.setLength(i2);
                                                            sb4.append(str17);
                                                        }
                                                        t6l0Var = new u6l0(y1l0Var4, sb4.toString(), null, zContains3, z25, 28);
                                                    } else {
                                                        pz40 pz40Var5 = s6t0.f31722a;
                                                        long textPrimary5 = s6t0.b().f33626a.getTextPrimary();
                                                        Integer intOrNull5 = StringsKt.toIntOrNull(str18);
                                                        boolean z26 = z4;
                                                        y1l0 y1l0Var5 = new y1l0(textPrimary5, str16, ctf0Var.b.a(R.string.history_events_v2, Arrays.copyOf(new Object[]{Integer.valueOf(intOrNull5 != null ? intOrNull5.intValue() : 0)}, 1)));
                                                        StringBuilder sb5 = new StringBuilder(ujn.h);
                                                        if (str17.length() == 0) {
                                                            sb5.setLength(0);
                                                        } else {
                                                            if (StringsKt.O(str17, ujn.h, false)) {
                                                                i = 0;
                                                            } else if (kotlin.text.c.x(str17, "https://", false)) {
                                                                i = 0;
                                                            } else {
                                                                if (sb5.length() <= 0 || StringsKt.S(sb5, str)) {
                                                                    c = '/';
                                                                } else {
                                                                    c = '/';
                                                                    sb5.append('/');
                                                                }
                                                                sb5.append(StringsKt.y0(str17, c));
                                                            }
                                                            sb5.setLength(i);
                                                            sb5.append(str17);
                                                        }
                                                        t6l0Var = new t6l0(y1l0Var5, z26 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, sb5.toString(), null, 56);
                                                    }
                                                    zcl zclVar4 = qmk.f28987a;
                                                    iterableC = kotlin.collections.a.c(new fql0(j12, j13, j, t6l0Var, d4d.BACKGROUND_CONTENT, new l3l0(16.0f), sfl0.f32124a, false, hhvVarX));
                                                } else if (odbVar instanceof mdb) {
                                                    iterableC = iun.f15405a;
                                                }
                                            }
                                            w3d.u(arrayList, iterableC);
                                            str7 = str;
                                            str4 = str8;
                                            it3 = it;
                                            i8 = i9;
                                            listP = list;
                                            qimVarX = qimVar2;
                                            z17 = z17;
                                            xebVar = xebVar;
                                            set2 = set;
                                            i8l0Var2 = i8l0Var;
                                            z18 = z3;
                                        }
                                        w3d.u(arrayList, iterableC);
                                        str7 = str;
                                        str4 = str8;
                                        it3 = it;
                                        i8 = i9;
                                        listP = list;
                                        qimVarX = qimVar2;
                                        z17 = z17;
                                        xebVar = xebVar;
                                        set2 = set;
                                        i8l0Var2 = i8l0Var;
                                        z18 = z3;
                                    }
                                    t9f.b();
                                }
                                qimVar = qimVarX;
                                z = z18;
                                z2 = z17;
                                zebVar = new xeb(dyb.o0(arrayList), i4w0.Q(g72Var, ctf0Var));
                            } else {
                                qimVar = qimVarX;
                                z = z18;
                                z2 = z17;
                                zebVar = new zeb(14);
                            }
                            return new h72(qimVar, zebVar, z, z2);
                        }
                        xuz xuzVar3 = pb10.c;
                        pb10 pb10Var3 = pb10.g;
                        xuzVar3.getClass();
                        zebVar = new yeb(new mdm(xuz.a(pb10Var3, i7), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    }
                    qimVar = qimVarX;
                    z = z18;
                    z2 = z17;
                    return new h72(qimVar, zebVar, z, z2);
                }
                if (iOrdinal == 4) {
                    ctf0Var.getClass();
                    qim qimVarX2 = hew0.X(g72Var, ctf0Var);
                    boolean z27 = f72Var instanceof d72;
                    List listP2 = z27 ? vbw0.P(str5, ((d72) f72Var).f5574a) : iun.f15405a;
                    if (f72Var instanceof e72) {
                        zebVar2 = new zeb(30);
                    } else if (f72Var instanceof c72) {
                        xuz xuzVar4 = pb10.c;
                        pb10 pb10Var4 = pb10.g;
                        xuzVar4.getClass();
                        zebVar2 = new yeb(new mdm(xuz.a(pb10Var4, i7), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    } else {
                        if (!z27 || !((d72) f72Var).f5574a.isEmpty()) {
                            if (z27 && listP2.isEmpty()) {
                                xuz xuzVar5 = pb10.c;
                                pb10 pb10Var5 = pb10.e;
                                xuzVar5.getClass();
                                zebVar2 = new yeb(new mdm(xuz.a(pb10Var5, i7), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990));
                            } else if (z27) {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it8 = listP2.iterator();
                                int i12 = 0;
                                while (it8.hasNext()) {
                                    Object next3 = it8.next();
                                    List list6 = list4;
                                    int i13 = i12 + 1;
                                    if (i12 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    boolean z28 = z15;
                                    odb odbVar2 = (odb) next3;
                                    hhv hhvVarX2 = vbw0.X((odb) CollectionsKt.W(i12 - 1, listP2), (odb) CollectionsKt.W(i13, listP2));
                                    if (odbVar2 != null) {
                                        if (odbVar2 instanceof ndb) {
                                            ndb ndbVar2 = (ndb) odbVar2;
                                            qimVar4 = qimVarX2;
                                            iterableC2 = kotlin.collections.a.c(new gsv(new hjm(ndbVar2.b, new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), String.valueOf(ndbVar2.f23331a)));
                                            list3 = listP2;
                                            it2 = it8;
                                            z8 = z16;
                                            z9 = z14;
                                            str3 = str6;
                                        } else {
                                            qimVar4 = qimVarX2;
                                            boolean z29 = z14;
                                            if (odbVar2 instanceof kdb) {
                                                kdb kdbVar2 = (kdb) odbVar2;
                                                long j15 = kdbVar2.f18097a;
                                                List list7 = kdbVar2.g;
                                                boolean zContains4 = set2.contains(Long.valueOf(j15));
                                                it2 = it8;
                                                long j16 = kdbVar2.f18097a;
                                                long j17 = kdbVar2.c;
                                                long j18 = kdbVar2.d;
                                                z8 = z16;
                                                Integer intOrNull6 = StringsKt.toIntOrNull(kdbVar2.f);
                                                int iIntValue2 = intOrNull6 != null ? intOrNull6.intValue() : 0;
                                                int size2 = list7.size();
                                                list3 = listP2;
                                                String str19 = kdbVar2.b;
                                                pz40 pz40Var6 = s6t0.f31722a;
                                                c2l0 c2l0Var = new c2l0(str19, s6t0.b().f33626a.getTextPrimary());
                                                StringBuilder sb6 = new StringBuilder(ujn.h);
                                                String str20 = kdbVar2.e;
                                                if (str20.length() == 0) {
                                                    sb6.setLength(0);
                                                } else {
                                                    if (StringsKt.O(str20, ujn.h, false)) {
                                                        i6 = 0;
                                                    } else if (kotlin.text.c.x(str20, "https://", false)) {
                                                        i6 = 0;
                                                    } else {
                                                        if (sb6.length() <= 0 || StringsKt.S(sb6, str6)) {
                                                            c6 = '/';
                                                        } else {
                                                            sb6.append('/');
                                                            c6 = '/';
                                                        }
                                                        sb6.append(StringsKt.y0(str20, c6));
                                                    }
                                                    sb6.setLength(i6);
                                                    sb6.append(str20);
                                                }
                                                t7l0 t7l0Var = new t7l0(c2l0Var, iIntValue2, sb6.toString(), null, zContains4, Integer.valueOf(size2), null, 312);
                                                d4d d4dVar2 = d4d.BACKGROUND_CONTENT;
                                                sfl0 sfl0Var2 = zContains4 ? sfl0.b : sfl0.c;
                                                if (zContains4) {
                                                    hhv hhvVar9 = hhv.f13084a;
                                                    if (hhvVarX2 != hhvVar9 && hhvVarX2 != hhv.d) {
                                                        hhvVar9 = hhv.b;
                                                    }
                                                    hhvVar3 = hhvVar9;
                                                } else {
                                                    hhvVar3 = hhvVarX2;
                                                }
                                                fql0 fql0Var2 = new fql0(j16, j17, j18, t7l0Var, d4dVar2, j3l0Var, sfl0Var2, false, hhvVar3);
                                                if (zContains4) {
                                                    List listC2 = kotlin.collections.a.c(fql0Var2);
                                                    ArrayList arrayList4 = new ArrayList(r3d.q(list7, 10));
                                                    Iterator it9 = list7.iterator();
                                                    int i14 = 0;
                                                    while (it9.hasNext()) {
                                                        Object next4 = it9.next();
                                                        int i15 = i14 + 1;
                                                        if (i14 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        mdb mdbVar2 = (mdb) next4;
                                                        List list8 = list7;
                                                        boolean z30 = i14 == list7.size() + (-1);
                                                        if (z30) {
                                                            hhvVar4 = hhv.c;
                                                            z11 = z30;
                                                            if (hhvVarX2 != hhvVar4 && hhvVarX2 != hhv.d) {
                                                                hhvVar4 = hhv.b;
                                                            }
                                                        } else {
                                                            z11 = z30;
                                                            hhvVar4 = hhv.b;
                                                        }
                                                        hhv hhvVar10 = hhvVar4;
                                                        boolean z31 = z29;
                                                        String str21 = str6;
                                                        long j19 = mdbVar2.f21587a;
                                                        long j20 = mdbVar2.c;
                                                        long j21 = mdbVar2.d;
                                                        Integer intOrNull7 = StringsKt.toIntOrNull(mdbVar2.g);
                                                        int iIntValue3 = intOrNull7 != null ? intOrNull7.intValue() : 0;
                                                        hhv hhvVar11 = hhvVarX2;
                                                        Iterator it10 = it9;
                                                        String str22 = mdbVar2.b;
                                                        pz40 pz40Var7 = s6t0.f31722a;
                                                        c2l0 c2l0Var2 = new c2l0(str22, s6t0.b().f33626a.getTextPrimary());
                                                        if (list6 == null || !list6.isEmpty()) {
                                                            Iterator it11 = list6.iterator();
                                                            while (true) {
                                                                if (it11.hasNext()) {
                                                                    i5p i5pVar3 = (i5p) it11.next();
                                                                    if (i5pVar3.f14203a == j19 && i5pVar3.b == mdbVar2.c && i5pVar3.c == mdbVar2.d) {
                                                                        z12 = true;
                                                                    }
                                                                } else {
                                                                    z12 = false;
                                                                }
                                                            }
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        boolean zContains5 = set3.contains(Long.valueOf(j19));
                                                        if (z28) {
                                                            u7l0Var2 = new x7l0(c2l0Var2, iIntValue3, zContains5, zContains5 || set3.size() < 10);
                                                        } else {
                                                            u7l0Var2 = new u7l0(c2l0Var2, iIntValue3, z12 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, null);
                                                        }
                                                        arrayList4.add(new fql0(j19, j20, j21, u7l0Var2, d4d.BACKGROUND_CONTENT, j3l0Var, z11 ? sfl0.e : sfl0.d, !z11, hhvVar10));
                                                        i14 = i15;
                                                        list7 = list8;
                                                        str6 = str21;
                                                        hhvVarX2 = hhvVar11;
                                                        it9 = it10;
                                                        z29 = z31;
                                                    }
                                                    z9 = z29;
                                                    str3 = str6;
                                                    iterableC2 = CollectionsKt.q0(listC2, arrayList4);
                                                } else {
                                                    z9 = z29;
                                                    str3 = str6;
                                                    iterableC2 = kotlin.collections.a.c(fql0Var2);
                                                }
                                            } else {
                                                list3 = listP2;
                                                it2 = it8;
                                                z8 = z16;
                                                z9 = z29;
                                                str3 = str6;
                                                if (odbVar2 instanceof ldb) {
                                                    ldb ldbVar2 = (ldb) odbVar2;
                                                    long j22 = ldbVar2.f19842a;
                                                    long j23 = ldbVar2.c;
                                                    long j24 = ldbVar2.d;
                                                    Integer intOrNull8 = StringsKt.toIntOrNull(ldbVar2.f);
                                                    int iIntValue4 = intOrNull8 != null ? intOrNull8.intValue() : 0;
                                                    boolean zContains6 = set3.contains(Long.valueOf(j22));
                                                    String str23 = ldbVar2.b;
                                                    pz40 pz40Var8 = s6t0.f31722a;
                                                    c2l0 c2l0Var3 = new c2l0(str23, s6t0.b().f33626a.getTextPrimary());
                                                    if (list6 == null || !list6.isEmpty()) {
                                                        Iterator it12 = list6.iterator();
                                                        while (true) {
                                                            if (it12.hasNext()) {
                                                                i5p i5pVar4 = (i5p) it12.next();
                                                                j3 = j24;
                                                                if (i5pVar4.f14203a == j22 && i5pVar4.b == ldbVar2.c && i5pVar4.c == ldbVar2.d) {
                                                                    z10 = true;
                                                                } else {
                                                                    j24 = j3;
                                                                }
                                                            } else {
                                                                j3 = j24;
                                                                z10 = false;
                                                            }
                                                        }
                                                    } else {
                                                        j3 = j24;
                                                        z10 = false;
                                                    }
                                                    if (z28) {
                                                        u7l0Var = new x7l0(c2l0Var3, iIntValue4, zContains6, zContains6 || set3.size() < 10);
                                                    } else {
                                                        u7l0Var = new u7l0(c2l0Var3, iIntValue4, z10 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, null);
                                                    }
                                                    iterableC2 = kotlin.collections.a.c(new fql0(j22, j23, j3, u7l0Var, d4d.BACKGROUND_CONTENT, j3l0Var, sfl0.f32124a, false, hhvVarX2));
                                                } else if (odbVar2 instanceof mdb) {
                                                    iterableC2 = iun.f15405a;
                                                }
                                            }
                                        }
                                        w3d.u(arrayList3, iterableC2);
                                        qimVarX2 = qimVar4;
                                        list4 = list6;
                                        i12 = i13;
                                        z15 = z28;
                                        it8 = it2;
                                        z16 = z8;
                                        listP2 = list3;
                                        str6 = str3;
                                        z14 = z9;
                                    }
                                    t9f.b();
                                }
                                qimVar3 = qimVarX2;
                                z6 = z14;
                                z7 = z16;
                                zebVar2 = new xeb(dyb.o0(arrayList3), i4w0.Q(g72Var, ctf0Var));
                            } else {
                                qimVar3 = qimVarX2;
                                z6 = z14;
                                z7 = z16;
                                zebVar2 = new zeb(30);
                            }
                            return new k72(qimVar3, zebVar2, z7, z6);
                        }
                        xuz xuzVar6 = pb10.c;
                        pb10 pb10Var6 = pb10.g;
                        xuzVar6.getClass();
                        zebVar2 = new yeb(new mdm(xuz.a(pb10Var6, i7), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    }
                    qimVar3 = qimVarX2;
                    z6 = z14;
                    z7 = z16;
                    return new k72(qimVar3, zebVar2, z7, z6);
                }
                t9f.b();
                return null;
            case 1:
                jf2 jf2Var = (jf2) obj;
                jf2Var.getClass();
                Map map = jf2Var.e;
                b9g0 b9g0Var = jf2Var.f16404a;
                boolean z32 = jf2Var.g;
                Calendar calendar = jf2Var.h;
                h8l0 h8l0Var = jf2Var.b;
                boolean z33 = jf2Var.f;
                if (calendar != null) {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.getClass();
                    if (calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2) && calendar2.get(5) == calendar.get(5)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                } else {
                    z13 = true;
                }
                a8z a8zVarA = maz.a(wez.b, new lf2(jf2Var, z13, ctf0Var, (byte) 0));
                boolean z34 = z33 || b9g0Var == b9g0.d;
                int iOrdinal2 = b9g0Var.ordinal();
                if (iOrdinal2 == 0) {
                    strA = ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 == 2) {
                            strA = ctf0Var.b.a(R.string.search_all_result, Arrays.copyOf(new Object[0], 0));
                        } else {
                            t9f.b();
                        }
                        return null;
                    }
                    strA = ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
                }
                String str24 = strA;
                String str25 = (String) map.get(b9g0Var);
                String str26 = str25 == null ? "" : str25;
                int iOrdinal3 = b9g0Var.ordinal();
                pz40 pz40Var9 = s6t0.f31722a;
                int iOrdinal4 = b9g0Var.ordinal();
                ra50 ra50Var = ra50.f30118a;
                if (iOrdinal4 != 0) {
                    dmmVar = fmm.f9790a;
                    if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            t9f.b();
                        }
                        return null;
                    }
                    if (mf2.f21677a[h8l0Var.ordinal()] == 4) {
                        skm skmVar = new skm(2, R.drawable.ic_glyph_search, true, (y3d) null, 48);
                        if (!z33) {
                            dmmVar = new emm(new la50(skmVar));
                        }
                    } else {
                        wkm wkmVar = new wkm(2, R.drawable.ic_glyph_search, true, ra50Var, s6t0.b().f33626a.getSecondary());
                        if (!z33) {
                            dmmVar = new dmm(new ta50(wkmVar));
                        }
                    }
                } else {
                    int i16 = (calendar == null || z13) ? R.drawable.ic_glyph_calendar_inactive : R.drawable.ic_glyph_calendar_active;
                    if (mf2.f21677a[h8l0Var.ordinal()] == 4) {
                        skm skmVar2 = new skm(2, R.drawable.ic_glyph_search, true, (y3d) null, 48);
                        skm skmVar3 = new skm(1, i16, true, (y3d) null, 48);
                        dmmVar = z33 ? new emm(new la50(skmVar3)) : new emm(new na50(skmVar2, skmVar3));
                    } else {
                        long secondary = (calendar == null || z13) ? s6t0.b().f33626a.getSecondary() : s6t0.b().f33626a.getPrimary();
                        wkm wkmVar2 = new wkm(2, R.drawable.ic_glyph_search, true, ra50Var, s6t0.b().f33626a.getSecondary());
                        wkm wkmVar3 = new wkm(1, i16, true, ra50Var, secondary);
                        dmmVar = z33 ? new dmm(new ta50(wkmVar3)) : new dmm(new va50(wkmVar2, wkmVar3));
                    }
                }
                int iOrdinal5 = h8l0Var.ordinal();
                if (iOrdinal5 != 0) {
                    if (iOrdinal5 == 1) {
                        oimVar = new mim(iOrdinal3, dmmVar, i(), str24, str26, ctf0Var.b.a(R.string.results, Arrays.copyOf(new Object[0], 0)), (String) a8zVarA.getValue(), z34, true);
                    } else if (iOrdinal5 == 2) {
                        oimVar = new lim(iOrdinal3, dmmVar, j(), ctf0Var.b.a(R.string.results, Arrays.copyOf(new Object[0], 0)), str24, str26, (String) a8zVarA.getValue(), z34, true);
                    } else {
                        if (iOrdinal5 != 3) {
                            t9f.b();
                            return null;
                        }
                        oimVar = new nim(iOrdinal3, dmmVar, j(), ctf0Var.b.a(R.string.results, Arrays.copyOf(new Object[0], 0)), str24, str26, (String) a8zVarA.getValue(), z34, true);
                    }
                    qim qimVar5 = oimVar;
                    if (calendar != null) {
                        time = calendar.getTime();
                    } else {
                        time = null;
                    }
                    return new kf2(b9g0Var, z32, qimVar5, map, time);
                }
                String strA2 = ctf0Var.b.a(R.string.results, Arrays.copyOf(new Object[0], 0));
                a4x a4xVarI = i();
                int iOrdinal6 = jf2Var.d.ordinal();
                if (iOrdinal6 == 0) {
                    dxh0Var = axh0.f1625a;
                } else if (iOrdinal6 == 1) {
                    dxh0Var = zwh0.f45106a;
                } else if (iOrdinal6 == 2) {
                    dxh0Var = cxh0.f5122a;
                } else {
                    if (iOrdinal6 != 3) {
                        t9f.b();
                        return null;
                    }
                    dxh0Var = bxh0.f3376a;
                }
                oimVar = new oim(strA2, z34, str24, str26, true, dmmVar, iOrdinal3, a4xVarI, dxh0Var, (String) a8zVarA.getValue());
                qim qimVar6 = oimVar;
                if (calendar != null) {
                    time = calendar.getTime();
                } else {
                    time = null;
                }
                return new kf2(b9g0Var, z32, qimVar6, map, time);
            case 2:
                return k(obj);
            case 3:
                return l(obj);
            case 4:
                return m(obj);
            case 5:
                return n(obj);
            case 6:
                return o(obj);
            case 7:
                ((er4) obj).getClass();
                wq4 wq4Var = new wq4(new kvl("auth_history", new tui0(ctf0Var.b.a(R.string.active_sessions_authenticator, Arrays.copyOf(new Object[0], 0)), null), null, null, wui0.b, 444), yq4.f43058a);
                String strA3 = ctf0Var.b.a(R.string.disable_authenticator, Arrays.copyOf(new Object[0], 0));
                pz40 pz40Var10 = s6t0.f31722a;
                return new fr4(dyb.o0(q3d.j(wq4Var, new wq4(new kvl("disable_auth", new tui0(strA3, new y3d(s6t0.b().f33626a.getWarning())), new oui0((Integer) null, (y3d) null, new m0x(R.drawable.ic_glyph_power, null, 6), new y3d(s6t0.b().f33626a.getWarning()), 19), null, wui0.d, 440), yq4.b))));
            case 8:
                return p(obj);
            case 9:
                return q(obj);
            case 10:
                return r(obj);
            case 11:
                return s(obj);
            case 12:
                return t(obj);
            case 13:
                return u(obj);
            case 14:
                return v(obj);
            case 15:
                return w(obj);
            case 16:
                return x(obj);
            case 17:
                return y(obj);
            default:
                ((swu0) obj).getClass();
                String strA4 = ctf0Var.b.a(R.string.select_action, Arrays.copyOf(new Object[0], 0));
                lsm0 lsm0Var2 = ctf0Var.b;
                return new twu0(strA4, lsm0Var2.a(R.string.refill_account, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.pay_out_from_account, Arrays.copyOf(new Object[0], 0)));
        }
    }

    public a4x j() {
        int i;
        c0o c0oVar = b9g0.f;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            b9g0 b9g0Var = (b9g0) y2Var.next();
            int iOrdinal = b9g0Var.ordinal();
            if (iOrdinal == 0) {
                i = R.drawable.ic_glyph_history;
            } else if (iOrdinal == 1) {
                i = R.drawable.ic_glyph_live;
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                i = R.drawable.ic_glyph_search_info;
            }
            arrayList.add(new pim(i, C(b9g0Var)));
        }
        return dyb.o0(arrayList);
    }
}
