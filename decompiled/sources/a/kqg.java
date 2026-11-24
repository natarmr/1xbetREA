package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f18722a = q3d.j(new kog(5), new log(6));
    public static final List b = q3d.j(new s1h(15), new r1h(16), new t1h(17));

    public static final void a(lc00 lc00Var, ctf0 ctf0Var, long j, boolean z, long j2) {
        int i;
        ctf0Var.getClass();
        if (j == 1 || j == 46) {
            i = R.color.static_white_20;
        } else {
            i = j == 2 ? R.color.cyber_lol_statistic_button_icon_bg : R.color.static_transparent;
        }
        lsm0 lsm0Var = ctf0Var.b;
        int iA = ctf0Var.a(i);
        lc00Var.add(wzb.N(2L, R.string.additional_info, ctf0Var, 16));
        if (j2 != 0 && z) {
            lc00Var.add(new yfh(4L, lsm0Var.a(R.string.stage_net, Arrays.copyOf(new Object[0], 0)), new vfh(R.drawable.ic_cyber_tournament_net, iA)));
        }
        lc00Var.add(new yfh(20L, lsm0Var.a(R.string.web_statistic, Arrays.copyOf(new Object[0], 0)), new vfh(R.drawable.ic_cyber_full_statistic, iA)));
    }

    public static final void b(lc00 lc00Var, dqg dqgVar, ctf0 ctf0Var, long j, long j2, boolean z) {
        long primary;
        lc00 lc00Var2;
        Collection collectionA;
        f2h f2hVar;
        Object obj;
        String str;
        String strA;
        dqgVar.getClass();
        ctf0Var.getClass();
        ljg ljgVar = dqgVar.f6514a;
        c2z c2zVarE = e(j, dqgVar, ctf0Var, 18L);
        if (j == 46) {
            primary = ijg.M;
        } else if (j == 1) {
            primary = kkg.m;
        } else {
            pz40 pz40Var = s6t0.f31722a;
            primary = s6t0.b().f33626a.getPrimary();
        }
        ljgVar.getClass();
        f2h f2hVar2 = ljgVar.b;
        f2h f2hVar3 = ljgVar.c;
        List list = b;
        list.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        boolean zD0 = x2x.d0(ljgVar);
        String str2 = f2hVar3.d;
        String str3 = f2hVar3.c;
        String str4 = f2hVar2.d;
        String str5 = f2hVar2.c;
        v1h v1hVar = ljgVar.d;
        List list2 = v1hVar.d;
        if (zD0) {
            lc00Var2 = lc00VarB;
            collectionA = kotlin.collections.a.a(lc00Var2);
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                u1h u1hVar = (u1h) it.next();
                if (u1hVar != null) {
                    String str6 = str2;
                    if (u1hVar instanceof s1h) {
                        if (!list2.isEmpty()) {
                            arrayList.add(u1hVar);
                        }
                    } else if (u1hVar instanceof r1h) {
                        if (!v1hVar.e.isEmpty() && str5.length() > 0) {
                            arrayList.add(u1hVar);
                        }
                    } else if (u1hVar instanceof t1h) {
                        if (!v1hVar.f.isEmpty() && str3.length() > 0) {
                            arrayList.add(u1hVar);
                        }
                    }
                    it = it2;
                    str2 = str6;
                }
                t9f.b();
                return;
            }
            String str7 = str2;
            Iterator it3 = arrayList.iterator();
            while (true) {
                Iterator it4 = it3;
                if (!it3.hasNext()) {
                    f2hVar = f2hVar2;
                    obj = null;
                    break;
                }
                Object next = it4.next();
                f2hVar = f2hVar2;
                if (((u1h) next).f34902a == j2) {
                    obj = next;
                    break;
                } else {
                    it3 = it4;
                    f2hVar2 = f2hVar;
                }
            }
            u1h u1hVar2 = (u1h) obj;
            if (u1hVar2 == null) {
                u1hVar2 = (u1h) CollectionsKt.firstOrNull(arrayList);
            }
            if (u1hVar2 == null) {
                collectionA = iun.f15405a;
            } else {
                lc00VarB.add(wzb.N(3L, R.string.cyber_last_matches, ctf0Var, 16));
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    u1h u1hVar3 = (u1h) it5.next();
                    long j3 = u1hVar3.f34902a;
                    Iterator it6 = it5;
                    if (u1hVar3 instanceof s1h) {
                        str = str4;
                        strA = ctf0Var.b.a(R.string.head_2_head_meeting, Arrays.copyOf(new Object[0], 0));
                    } else {
                        str = str4;
                        if (u1hVar3 instanceof r1h) {
                            strA = str5;
                        } else {
                            if (!(u1hVar3 instanceof t1h)) {
                                t9f.b();
                                return;
                            }
                            strA = str3;
                        }
                    }
                    arrayList2.add(new lxl(j3, (dyl) new xxl(strA), false, ((long) u1hVar3.f34902a) == ((long) u1hVar2.f34902a) ? uxl.b : uxl.f36445a, (cwl) null, 108));
                    it5 = it6;
                    str4 = str;
                }
                String str8 = str4;
                a4x a4xVarO0 = dyb.o0(arrayList2);
                lsm0 lsm0Var = ctf0Var.b;
                lc00VarB.add(new boo0("LAST_MATCHES_TAB_KEY", new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2), new jyl(new y3d(primary), null, null, 126), 6), pno0.f27299a));
                long j4 = c2zVarE.e;
                if (u1hVar2 instanceof s1h) {
                    fov fovVar = new fov(vsm0.t(str8));
                    boolean z2 = true;
                    String strA2 = lsm0Var.a(R.string.cyber_team_win_count_v2, Arrays.copyOf(new Object[]{String.valueOf(v1hVar.f36629a)}, 1));
                    hov hovVar = new hov(vsm0.t(str7));
                    String strA3 = lsm0Var.a(R.string.cyber_team_win_count_v2, Arrays.copyOf(new Object[]{String.valueOf(v1hVar.b)}, 1));
                    String str9 = c2zVarE.f3647a;
                    str9.getClass();
                    lc00VarB.add(new kov(fovVar, strA2, hovVar, strA3, str9, c2zVarE.b));
                    List listD0 = z ? CollectionsKt.D0(list2, 5) : list2;
                    int i = 0;
                    for (Iterator it7 = listD0.iterator(); it7.hasNext(); it7 = it7) {
                        Object next2 = it7.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        q1h q1hVar = (q1h) next2;
                        String str10 = q1hVar.f27952a;
                        int i3 = q1hVar.e;
                        boolean z3 = z2;
                        int i4 = q1hVar.d;
                        snv snvVar = new snv(vsm0.t(str8));
                        String strA4 = lsm0Var.a(i4 > i3 ? R.string.previous_maps_win : i4 < i3 ? R.string.previous_maps_lose : R.string.draw_game, Arrays.copyOf(new Object[0], 0));
                        int iA = ctf0Var.a(i4 > i3 ? R.color.static_games_text_victory : i4 < i3 ? R.color.cyber_game_last_matches_lose : R.color.cyber_game_last_matches_draw);
                        wnv wnvVar = new wnv(vsm0.t(str7));
                        String strA5 = lsm0Var.a(i3 > i4 ? R.string.previous_maps_win : i3 < i4 ? R.string.previous_maps_lose : R.string.draw_game, Arrays.copyOf(new Object[0], 0));
                        int iA2 = ctf0Var.a(i3 > i4 ? R.color.static_games_text_victory : i3 < i4 ? R.color.cyber_game_last_matches_lose : R.color.cyber_game_last_matches_draw);
                        String str11 = q1hVar.g;
                        vnv vnvVar = new vnv(String.valueOf(i4), String.valueOf(i3));
                        rdj rdjVar = rdj.f30294a;
                        String strF = rdj.f(new znq0(q1hVar.f), sdj.UNIVERSAL, null, 60);
                        strF.getClass();
                        lc00VarB.add(new cov(str10, snvVar, strA4, iA, wnvVar, strA5, iA2, str11, strF, vnvVar, (i != listD0.size() + (-1) || list2.size() > 5) ? R.drawable.cyber_game_last_matches_item_bg : R.drawable.cyber_game_last_matches_last_item_bg));
                        z2 = z3;
                        i = i2;
                        listD0 = listD0;
                    }
                    if (list2.size() > 5) {
                        lc00VarB.add(new b2z(z ? R.drawable.ic_glyph_chevron_down_small : R.drawable.ic_glyph_chevron_up_small, R.drawable.cyber_game_last_matches_last_item_bg, j4));
                    }
                    lc00Var2 = lc00VarB;
                } else if (u1hVar2 instanceof r1h) {
                    lc00Var2 = lc00VarB;
                    x2x.y(lc00Var2, f2hVar, c2zVarE.c, ljgVar.f20149a, v1hVar.e, z, j4);
                } else {
                    u1h u1hVar4 = u1hVar2;
                    lc00Var2 = lc00VarB;
                    if (!(u1hVar4 instanceof t1h)) {
                        t9f.b();
                        return;
                    }
                    x2x.y(lc00Var2, f2hVar3, c2zVarE.d, ljgVar.f20149a, v1hVar.f, z, j4);
                }
                collectionA = kotlin.collections.a.a(lc00Var2);
            }
        }
        lc00Var.addAll(collectionA);
    }

    /* JADX WARN: Code duplicated, block: B:127:0x033d  */
    /* JADX WARN: Code duplicated, block: B:165:0x048d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0506 A[LOOP:10: B:167:0x0500->B:169:0x0506, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:244:0x0689 A[PHI: r3 r8 r9 r10 r11 r15 r17 r18 r19 r64
  0x0689: PHI (r3v6 a.ctf0) = 
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v5 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
  (r3v4 a.ctf0)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r8v7 a.f2h) = 
  (r8v5 a.f2h)
  (r8v5 a.f2h)
  (r8v5 a.f2h)
  (r8v5 a.f2h)
  (r8v5 a.f2h)
  (r8v6 a.f2h)
  (r8v6 a.f2h)
  (r8v6 a.f2h)
  (r8v6 a.f2h)
  (r8v6 a.f2h)
  (r8v6 a.f2h)
  (r8v6 a.f2h)
  (r8v6 a.f2h)
  (r8v8 a.f2h)
  (r8v8 a.f2h)
  (r8v8 a.f2h)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r9v6 a.ljg) = 
  (r9v4 a.ljg)
  (r9v4 a.ljg)
  (r9v4 a.ljg)
  (r9v4 a.ljg)
  (r9v4 a.ljg)
  (r9v5 a.ljg)
  (r9v5 a.ljg)
  (r9v5 a.ljg)
  (r9v5 a.ljg)
  (r9v5 a.ljg)
  (r9v5 a.ljg)
  (r9v5 a.ljg)
  (r9v5 a.ljg)
  (r9v7 a.ljg)
  (r9v7 a.ljg)
  (r9v7 a.ljg)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r10v7 java.util.List) = 
  (r10v5 java.util.List)
  (r10v5 java.util.List)
  (r10v5 java.util.List)
  (r10v5 java.util.List)
  (r10v5 java.util.List)
  (r10v6 java.util.List)
  (r10v6 java.util.List)
  (r10v6 java.util.List)
  (r10v6 java.util.List)
  (r10v6 java.util.List)
  (r10v6 java.util.List)
  (r10v6 java.util.List)
  (r10v6 java.util.List)
  (r10v8 java.util.List)
  (r10v8 java.util.List)
  (r10v8 java.util.List)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r11v6 a.f2h) = 
  (r11v4 a.f2h)
  (r11v4 a.f2h)
  (r11v4 a.f2h)
  (r11v4 a.f2h)
  (r11v4 a.f2h)
  (r11v5 a.f2h)
  (r11v5 a.f2h)
  (r11v5 a.f2h)
  (r11v5 a.f2h)
  (r11v5 a.f2h)
  (r11v5 a.f2h)
  (r11v5 a.f2h)
  (r11v5 a.f2h)
  (r11v7 a.f2h)
  (r11v7 a.f2h)
  (r11v7 a.f2h)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r15v5 java.lang.String) = 
  (r15v3 java.lang.String)
  (r15v3 java.lang.String)
  (r15v3 java.lang.String)
  (r15v3 java.lang.String)
  (r15v3 java.lang.String)
  (r15v4 java.lang.String)
  (r15v4 java.lang.String)
  (r15v4 java.lang.String)
  (r15v4 java.lang.String)
  (r15v4 java.lang.String)
  (r15v4 java.lang.String)
  (r15v4 java.lang.String)
  (r15v4 java.lang.String)
  (r15v6 java.lang.String)
  (r15v6 java.lang.String)
  (r15v6 java.lang.String)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r17v5 a.s8h) = 
  (r17v3 a.s8h)
  (r17v3 a.s8h)
  (r17v3 a.s8h)
  (r17v3 a.s8h)
  (r17v3 a.s8h)
  (r17v4 a.s8h)
  (r17v4 a.s8h)
  (r17v4 a.s8h)
  (r17v4 a.s8h)
  (r17v4 a.s8h)
  (r17v4 a.s8h)
  (r17v4 a.s8h)
  (r17v4 a.s8h)
  (r17v6 a.s8h)
  (r17v6 a.s8h)
  (r17v6 a.s8h)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r18v2 a.s8h) = 
  (r18v0 a.s8h)
  (r18v0 a.s8h)
  (r18v0 a.s8h)
  (r18v0 a.s8h)
  (r18v0 a.s8h)
  (r18v1 a.s8h)
  (r18v1 a.s8h)
  (r18v1 a.s8h)
  (r18v1 a.s8h)
  (r18v1 a.s8h)
  (r18v1 a.s8h)
  (r18v1 a.s8h)
  (r18v1 a.s8h)
  (r18v3 a.s8h)
  (r18v3 a.s8h)
  (r18v3 a.s8h)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r19v4 a.lc00) = 
  (r19v2 a.lc00)
  (r19v2 a.lc00)
  (r19v2 a.lc00)
  (r19v2 a.lc00)
  (r19v2 a.lc00)
  (r19v3 a.lc00)
  (r19v3 a.lc00)
  (r19v3 a.lc00)
  (r19v3 a.lc00)
  (r19v3 a.lc00)
  (r19v3 a.lc00)
  (r19v3 a.lc00)
  (r19v3 a.lc00)
  (r19v5 a.lc00)
  (r19v5 a.lc00)
  (r19v5 a.lc00)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]
  0x0689: PHI (r64v2 java.util.Iterator) = 
  (r64v0 java.util.Iterator)
  (r64v0 java.util.Iterator)
  (r64v0 java.util.Iterator)
  (r64v0 java.util.Iterator)
  (r64v0 java.util.Iterator)
  (r64v1 java.util.Iterator)
  (r64v1 java.util.Iterator)
  (r64v1 java.util.Iterator)
  (r64v1 java.util.Iterator)
  (r64v1 java.util.Iterator)
  (r64v1 java.util.Iterator)
  (r64v1 java.util.Iterator)
  (r64v1 java.util.Iterator)
  (r64v3 java.util.Iterator)
  (r64v3 java.util.Iterator)
  (r64v3 java.util.Iterator)
 binds: [B:282:0x0761, B:284:0x0769, B:287:0x0773, B:290:0x077f, B:295:0x078a, B:246:0x06ac, B:249:0x06ba, B:251:0x06c2, B:362:0x0689, B:358:0x0689, B:275:0x0711, B:278:0x0719, B:280:0x071d, B:173:0x0573, B:176:0x057d, B:243:0x0683] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:268:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:271:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:277:0x0715  */
    /* JADX WARN: Code duplicated, block: B:358:0x0689 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x070d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:? A[LOOP:12: B:269:0x06f7->B:360:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r42v3 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v25 java.lang.Object, still in use, count: 2, list:
          (r2v25 java.lang.Object) from 0x0489: PHI (r2 I:??) = (r2v19 java.lang.Object), (r2v25 java.lang.Object) binds: [B:162:0x0487, B:351:0x0489] A[DONT_GENERATE, DONT_INLINE]
          (r2v25 java.lang.Object) from 0x0478: CHECK_CAST (a.q8h) (r2v25 java.lang.Object)
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
    public static final java.util.List c(a.dqg r46, a.ctf0 r47, long r48, long r50, boolean r52, long r53, boolean r55, long r56, a.ypl0 r58, boolean r59, int r60, long r61, long r63, long r65, a.o4i0 r67, a.hyx r68, long r69, java.util.List r71, java.util.ArrayList r72, boolean r73, java.util.List r74, boolean r75) {
        /*
            Method dump skipped, instruction units count: 2290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kqg.c(a.dqg, a.ctf0, long, long, boolean, long, boolean, long, a.ypl0, boolean, int, long, long, long, a.o4i0, a.hyx, long, java.util.List, java.util.ArrayList, boolean, java.util.List, boolean):java.util.List");
    }

    public static final boo0 d(long j, List list, ctf0 ctf0Var, long j2) {
        long primary;
        list.getClass();
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            meh mehVar = (meh) it.next();
            arrayList.add(new lxl(mehVar.f21644a, (dyl) new xxl(mehVar.b), false, mehVar.f21644a == j ? uxl.b : uxl.f36445a, (cwl) null, 108));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        lh80 lh80VarT = s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2);
        if (j2 == 1) {
            primary = kkg.m;
        } else if (j2 == 46) {
            primary = ijg.M;
        } else {
            pz40 pz40Var = s6t0.f31722a;
            primary = s6t0.b().f33626a.getPrimary();
        }
        return new boo0("STATISTIC_TAB_KEY", new fyl(a4xVarO0, null, null, lh80VarT, new jyl(new y3d(primary), null, null, 126), 6), pno0.f27299a);
    }

    public static final c2z e(long j, dqg dqgVar, ctf0 ctf0Var, long j2) {
        String strA;
        dqgVar.getClass();
        ctf0Var.getClass();
        if (j == 1) {
            return new c2z(R.drawable.cyber_game_dota_last_matches_header, R.drawable.cyber_game_dota_last_matches_header, R.drawable.cyber_game_dota_last_matches_header, j2, "");
        }
        if (j != 46) {
            return j == 2 ? new c2z(R.drawable.cybergame_lol_lastgame_radiant_bg, R.drawable.cybergame_lol_last_match_single_team_radiant_bg, R.drawable.cybergame_lol_last_match_single_team_dire_bg, j2, "") : new c2z(R.drawable.cyber_game_dota_last_matches_header, R.drawable.cyber_game_dota_last_matches_header, R.drawable.cyber_game_dota_last_matches_header, j2, "");
        }
        int i = dqgVar.f6514a.d.c;
        if (i > 0) {
            strA = ctf0Var.b.a(R.string.cs2_overtimes_v2, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
        } else {
            strA = "";
        }
        return new c2z(R.drawable.cs2_last_matches_header, R.drawable.cs2_last_matches_header, R.drawable.cs2_last_matches_header, j2, strA);
    }
}
