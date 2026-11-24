package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.StickyHeaderLayoutManager;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.cyber.section.api.home.CyberHomeParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$homeScreen$1;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hfg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12972a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hfg(Object obj, byte b) {
        this.f12972a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Object value;
        y3d y3dVar;
        Iterator it;
        List list;
        g3l0 e3l0Var;
        Object value2;
        Object value3;
        byte b = this.f12972a;
        byte b2 = 3;
        byte b3 = 10;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        byte b4 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((jfg) obj2).s.b(th, new jyf((byte) 20));
                return Unit.f46060a;
            case 1:
                sfg sfgVar = (sfg) obj;
                kud kudVar = zfg.S1;
                sfgVar.getClass();
                ((zfg) obj2).G0().x(sfgVar);
                return Unit.f46060a;
            case 2:
                lib libVar = (lib) obj2;
                egg eggVar = (egg) obj;
                eggVar.getClass();
                vdg vdgVar = eggVar.d;
                Integer num = eggVar.b;
                int iIntValue = num != null ? num.intValue() : 0;
                v5l0 v5l0Var = eggVar.g.g.y;
                ctf0 ctf0Var = (ctf0) libVar.f;
                boolean z2 = eggVar.h;
                if (vdgVar == null) {
                    return iun.f15405a;
                }
                q0s q0sVar = q0s.f27918a;
                ctf0Var.getClass();
                ArrayList arrayList = vdgVar.b;
                if (vdgVar.f37230a.isEmpty() || arrayList.isEmpty()) {
                    return iun.f15405a;
                }
                ArrayList<x0g0> arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(pzw.Z((icg) it2.next(), q0sVar, v5l0Var, ctf0Var));
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                for (x0g0 x0g0Var : arrayList2) {
                    arrayList3.add(new agg(ua80.e(iIntValue, "RESULTS", x0g0Var.getKey()), x0g0Var, z2));
                }
                return dyb.o0(arrayList3);
            case 3:
                igg iggVar = (igg) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = iggVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    iggVar.f.getClass();
                } while (!p7m0Var.m(value, egg.a((egg) value, false, null, null, null, false, 215)));
                return Unit.f46060a;
            case 4:
                CyberChampsMainParams cyberChampsMainParams = (CyberChampsMainParams) obj2;
                ((vzg0) obj).getClass();
                return new whg(cyberChampsMainParams, cyberChampsMainParams.c ? bnb.f2874a : anb.f1141a, "", false, false, new hhq0(ygq0.NOT, -1L, -1L), false, 192);
            case 5:
                xig xigVar = (xig) obj2;
                xigVar.G(new rig(xigVar.q.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            case 6:
                lig ligVar = (lig) obj;
                ligVar.getClass();
                List list2 = ligVar.f20103a;
                wcb wcbVar = ligVar.b;
                CyberGamesPage cyberGamesPage = ((sig) obj2).f32262a.f46548a;
                List list3 = ligVar.c;
                String str = ligVar.d;
                boolean z3 = ligVar.e;
                List list4 = ligVar.f;
                boolean z4 = ligVar.g;
                Map map = ligVar.h;
                list2.getClass();
                cyberGamesPage.getClass();
                list3.getClass();
                list4.getClass();
                if (!StringsKt.W(str)) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (StringsKt.O(((eeb) obj3).b, str, true)) {
                            arrayList4.add(obj3);
                        }
                    }
                    list2 = arrayList4;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : list2) {
                    eeb eebVar = (eeb) obj4;
                    Long lValueOf = Long.valueOf(cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE) ? eebVar.g : eebVar.i);
                    Object arrayList5 = linkedHashMap.get(lValueOf);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(lValueOf, arrayList5);
                    }
                    ((List) arrayList5).add(obj4);
                    list3 = list3;
                }
                List list5 = list3;
                lc00 lc00VarB = kotlin.collections.a.b();
                Iterator it3 = linkedHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    List list6 = (List) entry.getValue();
                    list6.getClass();
                    eeb eebVar2 = (eeb) CollectionsKt.firstOrNull(list6);
                    String strA = (String) map.get(Long.valueOf(jLongValue));
                    if (strA == null) {
                        strA = wcbVar.a(eebVar2 != null ? eebVar2.i : 0L, eebVar2 != null ? eebVar2.g : 0L);
                    }
                    String strH = h97.h(jLongValue, "CHAMP_HEADER_KEY");
                    String str2 = eebVar2 != null ? eebVar2.c : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    lc00VarB.add(new ncg(strH, new hjm(str2, new ojm(127), null, new n0x(strA), null, new m0x(R.drawable.ic_glyph_cyber_gamepad, null, 6), false, null, null, false, null, null, 7636)));
                    ArrayList arrayList6 = new ArrayList(r3d.q(list6, 10));
                    for (Iterator it4 = list6.iterator(); it4.hasNext(); it4 = it) {
                        eeb eebVar3 = (eeb) it4.next();
                        long j = eebVar3.f7663a;
                        boolean zContains = list4.contains(Long.valueOf(j));
                        String strH2 = h97.h(j, "CHAMP_CELL_KEY");
                        long j2 = eebVar3.f7663a;
                        Map map2 = map;
                        String str3 = eebVar3.b;
                        pz40 pz40Var = s6t0.f31722a;
                        Iterator it5 = it3;
                        wcb wcbVar2 = wcbVar;
                        a2l0 a2l0Var = new a2l0(str3, s6t0.b().f33626a.getTextPrimary());
                        p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
                        y3d y3dVar2 = new y3d(s6t0.b().f33626a.getSecondary());
                        String string = eebVar3.e;
                        if (StringsKt.W(string)) {
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String str4 = eebVar3.f;
                            if (str4.length() == 0) {
                                y3dVar = y3dVar2;
                                sb.setLength(0);
                                it = it4;
                            } else {
                                y3dVar = y3dVar2;
                                it = it4;
                                int i = 0;
                                if (StringsKt.O(str4, ujn.h, false)) {
                                    sb.setLength(i);
                                    sb.append(str4);
                                } else if (kotlin.text.c.x(str4, "https://", false)) {
                                    i = 0;
                                    sb.setLength(i);
                                    sb.append(str4);
                                } else {
                                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0(str4, '/'));
                                }
                            }
                            string = sb.toString();
                        } else {
                            y3dVar = y3dVar2;
                            it = it4;
                        }
                        t1l0 t1l0Var = new t1l0(p1l0Var, y3dVar, string, null, null, eebVar3.j == pgb.b ? new pf5(3, null) : null, 216);
                        zcl zclVar = qmk.f28987a;
                        zrm zrmVar = new zrm(a2l0Var, t1l0Var, (g3l0) null, (d4d) null, new l3l0(16.0f), 44);
                        long j3 = eebVar3.d;
                        if (z3) {
                            list = list5;
                            e3l0Var = new u2l0(new kpe(), (int) j3, zContains, !z4 || zContains, null);
                        } else {
                            kpe kpeVar = new kpe();
                            int i2 = (int) j3;
                            Long lValueOf2 = Long.valueOf(j);
                            list = list5;
                            e3l0Var = new e3l0(i2, kpeVar, list.contains(lValueOf2) ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive, null);
                        }
                        arrayList6.add(new zbg(strH2, j2, zrmVar, e3l0Var));
                        list5 = list;
                        map = map2;
                        it3 = it5;
                        wcbVar = wcbVar2;
                    }
                    lc00VarB.addAll(arrayList6);
                    it3 = it3;
                    wcbVar = wcbVar;
                }
                return dyb.o0(kotlin.collections.a.a(lc00VarB));
            case 7:
                ulg ulgVar = (ulg) obj2;
                ulgVar.g(new vlg(ulgVar.r.b.a(((Integer) obj).intValue(), Arrays.copyOf(new Object[0], 0))));
                return Unit.f46060a;
            case 8:
                return Boolean.valueOf(!(((jpg) obj2).e.f.get(((Integer) obj).intValue()) instanceof uls));
            case 9:
                Bitmap bitmap = (Bitmap) obj;
                cgx0 cgx0Var = ((upg) obj2).N1;
                cgx0Var.getClass();
                bitmap.getClass();
                StickyHeaderLayoutManager stickyHeaderLayoutManager = (StickyHeaderLayoutManager) cgx0Var.d;
                if (stickyHeaderLayoutManager != null) {
                    stickyHeaderLayoutManager.k1 = bitmap;
                    stickyHeaderLayoutManager.F1();
                }
                return Unit.f46060a;
            case 10:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(new CyberGamesScreenFactoryImpl$homeScreen$1(((uzg) obj2).b, new CyberHomeParams(CyberGamesPage.Virtual.INSTANCE, CyberGamesParentSectionModel.FromMain.INSTANCE)));
                return Unit.f46060a;
            case 11:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.f40887a.setLayoutDirection(0);
                mth mthVar = (mth) cpVar.u;
                ImageView imageView = mthVar.b;
                TypedValue typedValue = j5d.f15927a;
                Context context = cpVar.w;
                context.getClass();
                imageView.setColorFilter(context.getColor(R.color.static_white));
                FrameLayout frameLayout = mthVar.f22370a;
                frameLayout.getClass();
                dyb.O(frameLayout, new v4f((ppg) obj2, cpVar, (byte) 25));
                cpVar.t(new rn5(cpVar, (byte) 28));
                return Unit.f46060a;
            case 12:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((m5h) obj2).f21218a;
                hczVar.f(a4xVar.size(), new vtf(new p1h((byte) 2), a4xVar, b2), new wl0(a4xVar, (byte) 20), new ugd(2039820996, true, new zd1(a4xVar, b2)));
                return Unit.f46060a;
            case 13:
                h7h h7hVar = (h7h) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                return h7hVar.f12573a + BundleUtil.UNDERLINE_TAG + iIntValue2 + BundleUtil.UNDERLINE_TAG + ((b7h) h7hVar.g.get(iIntValue2)).f2108a;
            case 14:
                eu6 eu6Var = (eu6) obj2;
                dao daoVar = (dao) obj;
                daoVar.getClass();
                if (daoVar.f5759a == eu6Var.f8403a && daoVar.b == eu6Var.b && daoVar.e == eu6Var.c && daoVar.f == eu6Var.d && daoVar.q == eu6Var.e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                a8h a8hVar = (a8h) obj2;
                g7h g7hVar = (g7h) obj;
                g7hVar.getClass();
                p7m0 p7m0Var2 = a8hVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    a8hVar.f.getClass();
                } while (!p7m0Var2.m(value2, g7hVar));
                return Unit.f46060a;
            case 16:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((dch) obj2).x(new hbh(th2));
                return Unit.f46060a;
            case 17:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ConstraintLayout constraintLayout = ((tfh) cpVar2.u).f33865a;
                constraintLayout.getClass();
                dyb.O(constraintLayout, new v4f((opg) obj2, cpVar2, (byte) 29));
                cpVar2.t(new ok(cpVar2, cpVar2, (byte) 27));
                return Unit.f46060a;
            case 18:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                ConstraintLayout constraintLayout2 = ((lgh) cpVar3.u).f20008a;
                constraintLayout2.getClass();
                dyb.c0(constraintLayout2, new ngh((z9f) obj2, cpVar3, z ? (byte) 1 : (byte) 0));
                cpVar3.t(new kgh(cpVar3, b4));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sih sihVar = (sih) obj;
                std stdVar = mjh.Q1;
                sihVar.getClass();
                ((k3t0) ((mjh) obj2).M1.getValue()).x(sihVar);
                return Unit.f46060a;
            case 20:
                zjh zjhVar = (zjh) obj;
                zjhVar.getClass();
                return new Pair(((glh) obj2).f11490a, zjhVar);
            case 21:
                lmh lmhVar = (lmh) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                if (lmhVar.z && !lmhVar.o.e) {
                    lmhVar.N();
                    return Unit.f46060a;
                }
                p7m0 p7m0Var3 = lmhVar.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    lmhVar.f.getClass();
                    e0g0 e0g0Var = j0g0.b;
                } while (!p7m0Var3.m(value3, fmh.a((fmh) value3, null, new j0g0(new g0g0(th3)), null, null, 27)));
                th3.printStackTrace();
                return Unit.f46060a;
            case 22:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = ((knh) obj2).f18586a;
                hczVar2.f(a4xVar2.size(), new vtf(new p1h((byte) 23), a4xVar2, b3), new wl0(a4xVar2, (byte) 23), new ugd(2039820996, true, new zd1(a4xVar2, (byte) 4)));
                return Unit.f46060a;
            case 23:
                kxh kxhVar = (kxh) obj2;
                TableViewImpl tableViewImpl = (TableViewImpl) obj;
                tableViewImpl.getClass();
                k5 adapter = tableViewImpl.getAdapter();
                jxh jxhVar = adapter instanceof jxh ? (jxh) adapter : null;
                if (jxhVar != null) {
                    jxhVar.q(kxhVar.b, kxhVar.c, kxhVar.f19055a, kxhVar.d);
                }
                tableViewImpl.b(false, true);
                tableViewImpl.getColumnHeaderRecyclerView().y0(0);
                tableViewImpl.getRowHeaderRecyclerView().y0(0);
                tableViewImpl.getCellRecyclerView().y0(0);
                return Unit.f46060a;
            case 24:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                if (((ezh) obj2).e) {
                    StaticColors staticColors = StaticColors.INSTANCE;
                    e900 e900VarN = yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m75getBlack600d7_KjU())), 0.0f, Float.POSITIVE_INFINITY, 8);
                    zcl zclVar2 = qmk.f28987a;
                    float fW0 = fhlVar.w0(16.0f);
                    fhl.f(fhlVar, e900VarN, 0L, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), l0q.f19214a, 214);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((fhl) obj).getClass();
                ((i0i) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.c(abi0Var, ((rx30) obj2).d);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                yai0.h(abi0Var2, ((z3i) obj2).f43719a.name());
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                yai0.h(abi0Var3, ((x3i) obj2).f40219a.name());
                return Unit.f46060a;
            default:
                ((ViewPager2) ((mii0) obj2).c).e(((Integer) obj).intValue(), true);
                return Unit.f46060a;
        }
    }
}
