package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferFilterTimeCustomDateValue;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;
import org.xplatform.uikit.components.chips.Chip;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes2.dex */
public final class caz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4037a;
    public Object b;

    public caz(wm40 wm40Var, cae0 cae0Var, kzj0 kzj0Var, fay fayVar) {
        this.f4037a = (byte) 14;
        this.b = wm40Var;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0408  */
    /* JADX WARN: Code duplicated, block: B:146:0x042a  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hyl gylVar;
        int i;
        char c;
        int i2;
        hyl fylVar;
        int i3;
        Object next;
        boolean zEquals;
        hyl gylVar2;
        int i4;
        String strA;
        SimpleDate simpleDate;
        SimpleDate simpleDate2;
        pzs0 pzs0VarC;
        byte b = this.f4037a;
        fa50 fa50Var = fa50.f9191a;
        boolean z = true;
        z = true;
        switch (b) {
            case 0:
                g950 g950Var = (g950) this.b;
                cr30 cr30Var = (cr30) obj;
                cr30Var.getClass();
                return cr30Var.f(g950Var, ux50.e);
            case 1:
                ucs0 ucs0Var = (ucs0) this.b;
                are0 are0Var = (are0) obj;
                are0Var.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) ucs0Var.e;
                vjj vjjVar = (vjj) ucs0Var.d;
                Integer num = (Integer) linkedHashMap.get(are0Var);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                f7u f7uVar = (f7u) ucs0Var.c;
                f7uVar.getClass();
                return new gaz(f7k.I(new f7u((v7i) f7uVar.b, ucs0Var, (a8z) f7uVar.d), vjjVar.getAnnotations()), are0Var, ucs0Var.b + iIntValue, vjjVar);
            case 2:
                pg4 pg4Var = (pg4) this.b;
                ctf0 ctf0Var = pg4Var.b;
                ypl0 ypl0Var = (ypl0) ((fee) pg4Var.p.getValue()).c();
                int iIntValue2 = ((Number) ((fee) pg4Var.h.getValue()).c()).intValue();
                xhz xhzVar = (xhz) ((fee) pg4Var.k.getValue()).d.getValue();
                qgz qgzVar = (qgz) ((fee) pg4Var.l.getValue()).d.getValue();
                long jLongValue = ((Number) ((fee) pg4Var.i.getValue()).d.getValue()).longValue();
                epe epeVar = (epe) ((fee) pg4Var.m.getValue()).d.getValue();
                Collection collection = (List) ((fee) pg4Var.n.getValue()).d.getValue();
                if (collection == null) {
                    collection = iun.f15405a;
                }
                boolean zIsEmpty = collection.isEmpty();
                boolean zBooleanValue = ((Boolean) ((fee) pg4Var.j.getValue()).c()).booleanValue();
                ypl0Var.getClass();
                ctf0Var.getClass();
                xhzVar.getClass();
                qgzVar.getClass();
                epeVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                lsm0 lsm0Var = ctf0Var.b;
                imm immVar = new imm(ilmVar, new plm(lsm0Var.a(R.string.cyber_games_chip_leaderboard, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50Var), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
                if (zBooleanValue) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    StringBuilder sb = new StringBuilder(ujn.h);
                    String str = ypl0Var.c.f19909a;
                    str.getClass();
                    if (str.length() == 0) {
                        sb.setLength(0);
                    } else {
                        if (StringsKt.O(str, ujn.h, false)) {
                            i = 0;
                        } else if (kotlin.text.c.x(str, "https://", false)) {
                            i = 0;
                        } else {
                            if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                c = '/';
                            } else {
                                c = '/';
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str, c));
                        }
                        sb.setLength(i);
                        sb.append(str);
                    }
                    n0x n0xVar = new n0x(sb.toString());
                    m0x m0xVar = new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6);
                    Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad_secondary80);
                    Boolean bool = Boolean.FALSE;
                    cyl cylVar = new cyl(n0xVar, m0xVar, numValueOf);
                    uxl uxlVar = uxl.f36445a;
                    lc00VarB.add(new lxl(1L, (dyl) cylVar, true, uxlVar, (cwl) null, 100));
                    lc00VarB.add(new lxl(2L, (dyl) new byl(lsm0Var.a(xhzVar.f40918a, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6), null, bool, 12), true, (jLongValue == 46 || jLongValue == 1) ? uxlVar : uxl.c, (cwl) null, 100));
                    int iOrdinal = xhzVar.ordinal();
                    if (iOrdinal == 0) {
                        lc00VarB.add(new lxl(3L, (dyl) new byl(iIntValue2 == 0 ? lsm0Var.a(R.string.all_time_calendar, Arrays.copyOf(new Object[0], 0)) : String.valueOf(iIntValue2), new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6), null, bool, 12), true, !zIsEmpty ? uxlVar : uxl.c, (cwl) null, 100));
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                t9f.b();
                            } else if (jLongValue == 1) {
                                lc00VarB.add(new lxl(2L, (dyl) new byl(lsm0Var.a(R.string.leaderboard_esl, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6), null, bool, 12), true, uxl.c, (cwl) null, 100));
                            } else if (jLongValue == 46) {
                                int iOrdinal2 = epeVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i2 = R.string.hltv_adwards;
                                } else if (iOrdinal2 == 1) {
                                    i2 = R.string.cs2_ranking_valve;
                                } else {
                                    t9f.b();
                                }
                                lc00VarB.add(new lxl(5L, (dyl) new byl(lsm0Var.a(i2, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6), null, bool, 12), true, uxlVar, (cwl) null, 100));
                            }
                            return null;
                        }
                        lc00VarB.add(new lxl(4L, (dyl) new byl(lsm0Var.a(qgzVar.f28710a, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6), null, bool, 12), true, uxlVar, (cwl) null, 100));
                    }
                    gylVar = new fyl(dyb.o0(kotlin.collections.a.a(lc00VarB)), null, null, null, null, 30);
                } else {
                    zcl zclVar = qmk.f28987a;
                    float f = xfn.b(ctf0Var.j()).e;
                    gylVar = new gyl(null, new lh80(f, 8.0f, f, 8.0f), 1);
                }
                return new shz(immVar, gylVar);
            case 3:
                ((c6q) this.b).e.setCurrentItem(((Number) obj).intValue());
                return Unit.f46060a;
            case 4:
                gfg gfgVar = (gfg) this.b;
                List list = (List) ((fee) gfgVar.f.getValue()).c();
                xb40 xb40Var = (xb40) ((fee) gfgVar.d.getValue()).c();
                boolean zBooleanValue2 = ((Boolean) ((fee) gfgVar.e.getValue()).c()).booleanValue();
                ctf0 ctf0Var2 = gfgVar.c;
                xb40Var.getClass();
                ctf0Var2.getClass();
                if (list == null) {
                    float f2 = ctf0Var2.j() ? 40.0f : 16.0f;
                    zcl zclVar2 = qmk.f28987a;
                    fylVar = new gyl(null, new lh80(f2, 8.0f, f2, 8.0f), 1);
                } else {
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    m0x m0xVar2 = new m0x(R.drawable.ic_sport_color_dota_97, null, 6);
                    m0x m0xVar3 = new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6);
                    Integer numValueOf2 = Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad_secondary80);
                    Boolean bool2 = Boolean.FALSE;
                    cyl cylVar2 = new cyl(m0xVar2, m0xVar3, numValueOf2);
                    uxl uxlVar2 = uxl.c;
                    lc00VarB2.add(new lxl(3L, (dyl) cylVar2, true, uxlVar2, (cwl) null, 100));
                    lsm0 lsm0Var2 = ctf0Var2.b;
                    lc00VarB2.add(new lxl(3L, (dyl) new byl(lsm0Var2.a(R.string.week, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6), null, bool2, 12), true, uxlVar2, (cwl) null, 100));
                    if (xb40Var != xb40.f40583a) {
                        int iOrdinal3 = xb40Var.ordinal();
                        if (iOrdinal3 == 1) {
                            i3 = R.string.dota_easy_position;
                        } else if (iOrdinal3 == 2) {
                            i3 = R.string.dota_middle_role;
                        } else if (iOrdinal3 == 3) {
                            i3 = R.string.dota_hard_position;
                        } else if (iOrdinal3 != 4) {
                            i3 = iOrdinal3 != 5 ? R.string.empty_str : R.string.dota_full_support_position;
                        } else {
                            i3 = R.string.dota_support_position;
                        }
                        lc00VarB2.add(new lxl(1L, (dyl) new byl(lsm0Var2.a(i3, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6), null, bool2, 12), false, zBooleanValue2 ? uxl.f36445a : uxlVar2, (cwl) null, 100));
                    }
                    fylVar = new fyl(dyb.r0(kotlin.collections.a.a(lc00VarB2)), null, null, null, null, 30);
                }
                pz40 pz40Var2 = s6t0.f31722a;
                return new zc40(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var2.b.a(R.string.meta_heroes, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50Var), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null), fylVar);
            case 5:
                zm40 zm40Var = (zm40) this.b;
                swq swqVar = (swq) obj;
                swqVar.getClass();
                zg80 zg80Var = zm40Var.g;
                eu00 eu00Var = zm40Var.d;
                ((yg80) zg80Var).getClass();
                eu00Var.getClass();
                return new gdz(zm40Var, swqVar, eu00Var);
            case 6:
                DsChip dsChip = (DsChip) obj;
                dsChip.getClass();
                mxl mxlVar = (mxl) this.b;
                dsChip.setText(mxlVar.f22560a);
                dsChip.setSelectedInternal(mxlVar.e);
                return Unit.f46060a;
            case 7:
                nw20 nw20Var = (nw20) this.b;
                swq swqVar2 = (swq) obj;
                swqVar2.getClass();
                Map map = (Map) nw20Var.f24215a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    swq swqVar3 = (swq) entry.getKey();
                    if (!swqVar2.equals(swqVar3)) {
                        swqVar3.getClass();
                        if (Intrinsics.d(swqVar2.f32934a.c() ? null : swqVar2.b(), swqVar3)) {
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 != null) {
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int length = obc.S((swq) ((Map.Entry) next).getKey(), swqVar2).f32934a.f34663a.length();
                            do {
                                Object next2 = it.next();
                                int length2 = obc.S((swq) ((Map.Entry) next2).getKey(), swqVar2).f32934a.f34663a.length();
                                if (length > length2) {
                                    next = next2;
                                    length = length2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Map.Entry entry2 = (Map.Entry) next;
                    if (entry2 != null) {
                        return entry2.getValue();
                    }
                }
                return null;
            case 8:
                w380 w380Var = (w380) obj;
                wav0 wav0Var = w380Var.f38489a;
                ((i3t0) this.b).x(w380Var);
                return Unit.f46060a;
            case 9:
                nbk0 nbk0Var = (nbk0) this.b;
                obj.getClass();
                nbk0Var.add(obj);
                return Unit.f46060a;
            case 10:
                zx80 zx80Var = (zx80) obj;
                zx80Var.getClass();
                ((Function2) this.b).invoke(zx80Var.b, zx80Var.c);
                return Unit.f46060a;
            case 11:
                ctf0 ctf0Var3 = ((lea0) this.b).c;
                ctf0Var3.getClass();
                return new eea0(ctf0Var3.b.a(R.string.player_transfers, Arrays.copyOf(new Object[0], 0)));
            case 12:
                Chip chip = (Chip) obj;
                chip.getClass();
                beo0 beo0Var = (beo0) this.b;
                chip.setText(beo0Var.f2461a);
                chip.setSelected(beo0Var.b);
                return Unit.f46060a;
            case 13:
                ctf0 ctf0Var4 = ((lea0) this.b).c;
                ctf0Var4.getClass();
                pz40 pz40Var3 = s6t0.f31722a;
                return new b9e0(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var4.b.a(R.string.statistic_info_rating, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50Var), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
            case 14:
                wm40 wm40Var = (wm40) this.b;
                ((cty) obj).getClass();
                rek.f(wm40Var);
                return null;
            case 15:
                mqe0 mqe0Var = (mqe0) this.b;
                Method method = (Method) obj;
                if (method.isSynthetic()) {
                    z = false;
                } else if (mqe0Var.f22221a.isEnum()) {
                    String name = method.getName();
                    if (Intrinsics.d(name, "values")) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (Intrinsics.d(name, "valueOf")) {
                        zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                    } else {
                        zEquals = false;
                    }
                    if (zEquals) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 16:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                jpa0 jpa0Var = (jpa0) this.b;
                if (jpa0Var != null) {
                    jpa0Var.d = zBooleanValue3;
                }
                return Unit.f46060a;
            case 17:
                k3u0 k3u0Var = (k3u0) this.b;
                mp9 mp9Var = (mp9) obj;
                mp9Var.getClass();
                wsy type = ((k3u0) mp9Var.z().get(k3u0Var.g)).getType();
                type.getClass();
                return type;
            case 18:
                Throwable th = (Throwable) obj;
                inn0 inn0Var = (inn0) this.b;
                n5a n5aVar = inn0Var.c;
                if (n5aVar != null) {
                    n5aVar.h(th);
                }
                inn0Var.c = null;
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return hfm0.t(((s7p0) this.b).b.b.a(R.string.achievements, Arrays.copyOf(new Object[0], 0)));
            case 20:
                return hfm0.t(((gfg) this.b).c.b.a(R.string.results, Arrays.copyOf(new Object[0], 0)));
            case 21:
                float[] fArr = ((ui30) obj).f35710a;
                j6z j6zVar = (j6z) this.b;
                if (j6zVar.h()) {
                    k7x.C(j6zVar).j(j6zVar, fArr);
                }
                return Unit.f46060a;
            case 22:
                DsChip dsChip2 = (DsChip) obj;
                dsChip2.getClass();
                dsChip2.setCount(null);
                dsChip2.setBackgroundActiveColor(Integer.valueOf(fbc.U(ijg.M)));
                qwr0 qwr0Var = (qwr0) this.b;
                dsChip2.setText(qwr0Var.b);
                dsChip2.setSelected(qwr0Var.c);
                return Unit.f46060a;
            case 23:
                mya myaVar = (mya) this.b;
                pks0 pks0Var = (pks0) myaVar.j;
                String str2 = pks0Var.c;
                String str3 = pks0Var.d;
                ypl0 ypl0Var2 = (ypl0) ((fee) myaVar.d.getValue()).c();
                boolean zBooleanValue4 = ((Boolean) ((fee) myaVar.e.getValue()).c()).booleanValue();
                String str4 = (String) ((fee) myaVar.f.getValue()).c();
                TransferTimeFilterUiModel transferTimeFilterUiModel = (TransferTimeFilterUiModel) ((fee) myaVar.g.getValue()).c();
                ctf0 ctf0Var5 = myaVar.b;
                str2.getClass();
                str3.getClass();
                str4.getClass();
                transferTimeFilterUiModel.getClass();
                ctf0Var5.getClass();
                lh80 lh80VarT = s5x0.t(ctf0Var5.j() ? 40.0f : 16.0f, 0.0f, 2);
                if (ypl0Var2 != null) {
                    lc00 lc00VarB3 = kotlin.collections.a.b();
                    StringBuilder sb2 = new StringBuilder(ujn.h);
                    String str5 = ypl0Var2.c.f19909a;
                    str5.getClass();
                    if (str5.length() == 0) {
                        sb2.setLength(0);
                    } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                        sb2.setLength(0);
                        sb2.append(str5);
                    } else {
                        if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                            sb2.append('/');
                        }
                        sb2.append(StringsKt.y0(str5, '/'));
                    }
                    n0x n0xVar2 = new n0x(sb2.toString());
                    m0x m0xVar4 = new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6);
                    Integer numValueOf3 = Integer.valueOf(R.drawable.ic_glyph_cyber_gamepad_secondary80);
                    Boolean bool3 = Boolean.FALSE;
                    cyl cylVar3 = new cyl(n0xVar2, m0xVar4, numValueOf3);
                    uxl uxlVar3 = uxl.f36445a;
                    lc00VarB3.add(new lxl(1L, (dyl) cylVar3, true, uxlVar3, (cwl) null, 100));
                    if (!(transferTimeFilterUiModel instanceof TransferTimeFilterUiModel.CustomTime)) {
                        if (transferTimeFilterUiModel instanceof TransferTimeFilterUiModel.SimpleTime) {
                            int iOrdinal4 = ((TransferTimeFilterUiModel.SimpleTime) transferTimeFilterUiModel).f46619a.ordinal();
                            if (iOrdinal4 == 0) {
                                i4 = R.string.all_time_calendar;
                            } else if (iOrdinal4 == 1) {
                                i4 = R.string.filter_24h;
                            } else if (iOrdinal4 == 2) {
                                i4 = R.string.filter_3d;
                            } else if (iOrdinal4 == 3) {
                                i4 = R.string.week;
                            } else if (iOrdinal4 == 4) {
                                i4 = R.string.one_month;
                            } else {
                                t9f.b();
                            }
                            strA = ctf0Var5.b.a(i4, Arrays.copyOf(new Object[0], 0));
                        } else {
                            t9f.b();
                        }
                        return null;
                    }
                    TransferTimeFilterUiModel.CustomTime customTime = (TransferTimeFilterUiModel.CustomTime) transferTimeFilterUiModel;
                    TransferFilterTimeCustomDateValue transferFilterTimeCustomDateValue = customTime.f46618a;
                    TransferFilterTimeCustomDateValue.Selected selected = transferFilterTimeCustomDateValue instanceof TransferFilterTimeCustomDateValue.Selected ? (TransferFilterTimeCustomDateValue.Selected) transferFilterTimeCustomDateValue : null;
                    String strA2 = "";
                    String strA3 = (selected == null || (simpleDate2 = selected.f46616a) == null) ? "" : als0.a(simpleDate2);
                    TransferFilterTimeCustomDateValue transferFilterTimeCustomDateValue2 = customTime.b;
                    TransferFilterTimeCustomDateValue.Selected selected2 = transferFilterTimeCustomDateValue2 instanceof TransferFilterTimeCustomDateValue.Selected ? (TransferFilterTimeCustomDateValue.Selected) transferFilterTimeCustomDateValue2 : null;
                    if (selected2 != null && (simpleDate = selected2.f46616a) != null) {
                        strA2 = als0.a(simpleDate);
                    }
                    strA = kng0.l(strA3, " - ", strA2);
                    lc00VarB3.add(new lxl(2L, (dyl) new byl(strA, new m0x(R.drawable.ic_glyph_chevron_down_small_secondary, null, 6), null, bool3, 12), true, uxlVar3, (cwl) null, 100));
                    gylVar2 = new fyl(dyb.o0(kotlin.collections.a.a(lc00VarB3)), null, null, lh80VarT, null, 22);
                } else {
                    gylVar2 = new gyl(null, lh80VarT, 1);
                }
                return new zks0(str2, zBooleanValue4, str4, str3, gylVar2);
            case 24:
                hcp0 hcp0Var = (hcp0) this.b;
                ozs0 ozs0Var = (ozs0) obj;
                hzs0 hzs0Var = ozs0Var.f26114a;
                fay fayVar = ozs0Var.b;
                Set set = fayVar.e;
                if (set != null && set.contains(hzs0Var.o1())) {
                    return hcp0Var.l(fayVar);
                }
                kzj0 kzj0VarI = hzs0Var.I();
                kzj0VarI.getClass();
                LinkedHashSet<hzs0> linkedHashSet = new LinkedHashSet();
                vsm0.p(kzj0VarI, kzj0VarI, linkedHashSet, set);
                int iA = wp20.a(r3d.q(linkedHashSet, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
                for (hzs0 hzs0Var2 : linkedHashSet) {
                    if (set == null || !set.contains(hzs0Var2)) {
                        Set set2 = fayVar.e;
                        pzs0VarC = xi70.c(hzs0Var2, fayVar, hcp0Var, hcp0Var.m(hzs0Var2, fay.a(fayVar, null, false, set2 != null ? eui0.h(set2, hzs0Var) : cui0.b(hzs0Var), null, 47)));
                    } else {
                        pzs0VarC = e0t0.l(hzs0Var2, fayVar);
                    }
                    linkedHashMap3.put(hzs0Var2.h(), pzs0VarC);
                }
                xzs0 xzs0Var = new xzs0(new r4m0(linkedHashMap3, z ? (byte) 1 : (byte) 0));
                List upperBounds = hzs0Var.getUpperBounds();
                upperBounds.getClass();
                yni0 yni0VarU = hcp0Var.u(xzs0Var, upperBounds, fayVar);
                if (yni0VarU.f42943a.isEmpty()) {
                    return hcp0Var.l(fayVar);
                }
                if (yni0VarU.f42943a.i == 1) {
                    return (wsy) CollectionsKt.u0(yni0VarU);
                }
                jf4.o("Should only be one computed upper bound if no need to intersect all bounds");
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wsy wsyVar = (wsy) this.b;
                ((ym40) obj).getClass();
                return wsyVar;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return dem0.m(((s7p0) this.b).b.b.a(R.string.about_tournament, Arrays.copyOf(new Object[0], 0)));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return dem0.m(((s7p0) this.b).b.b.a(R.string.tournament_prize_pool, Arrays.copyOf(new Object[0], 0)));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return dem0.m(((ctf0) ((ov0) this.b).e).b.a(R.string.results, Arrays.copyOf(new Object[0], 0)));
            default:
                String strA4 = ((ctf0) ((lib) this.b).f).b.a(R.string.rules_title, Arrays.copyOf(new Object[0], 0));
                pz40 pz40Var4 = s6t0.f31722a;
                return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strA4, s6t0.b().f33626a.getSecondary(), fa50Var), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
        }
    }

    public /* synthetic */ caz() {
        this.f4037a = (byte) 16;
    }

    public /* synthetic */ caz(Object obj, byte b) {
        this.f4037a = b;
        this.b = obj;
    }
}
