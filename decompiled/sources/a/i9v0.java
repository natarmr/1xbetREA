package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.cells.right.DsCellRightButton;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i9v0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14407a;

    public /* synthetic */ i9v0(byte b) {
        this.f14407a = b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0332  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1 A[PHI: r3
  0x00d1: PHI (r3v24 int) = (r3v23 int), (r3v25 int), (r3v26 int), (r3v27 int) binds: [B:15:0x0098, B:17:0x00a4, B:19:0x00b0, B:21:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0206  */
    /* JADX WARN: Code duplicated, block: B:73:0x0209  */
    /* JADX WARN: Code duplicated, block: B:75:0x0211  */
    /* JADX WARN: Code duplicated, block: B:78:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x024c  */
    /* JADX WARN: Code duplicated, block: B:81:0x024f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0251  */
    /* JADX WARN: Code duplicated, block: B:83:0x0256  */
    /* JADX WARN: Code duplicated, block: B:84:0x0259  */
    /* JADX WARN: Code duplicated, block: B:87:0x0272  */
    /* JADX WARN: Code duplicated, block: B:88:0x0275  */
    /* JADX WARN: Code duplicated, block: B:90:0x027d  */
    /* JADX WARN: Code duplicated, block: B:93:0x029b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x029d  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x032a  */
    /* JADX WARN: Code duplicated, block: B:99:0x032e  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        qtv0 qtv0Var;
        String strH;
        lxv0 lxv0VarD;
        String str5;
        int iOrdinal;
        String str6;
        ntv0 ntv0Var;
        String str7;
        int iOrdinal2;
        String str8;
        long j;
        byte b = this.f14407a;
        int i = R.id.title;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 1:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.header_category_item, viewGroup, false);
                if (viewF != null) {
                    DsHeader dsHeader = (DsHeader) viewF;
                    return new cqv(dsHeader, dsHeader);
                }
                hny.u("rootView");
                return null;
            case 3:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.widget_sections_item, viewGroup2, false);
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF2, R.id.cellLeftIcon);
                if (dsCellLeftIcon != null) {
                    DsSettingsCell dsSettingsCell = (DsSettingsCell) viewF2;
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF2, R.id.title);
                    if (dsCellMiddleTitle != null) {
                        return new mev0(dsSettingsCell, dsSettingsCell, dsCellLeftIcon, dsCellMiddleTitle);
                    }
                } else {
                    i = R.id.cellLeftIcon;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case 4:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.history_item_win_back_banner, viewGroup3, false);
                int i2 = R.id.cellMiddleTitle;
                DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF3, R.id.cellMiddleTitle);
                if (dsCellMiddleTitle2 != null) {
                    i2 = R.id.cellRighyBanner;
                    DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewF3, R.id.cellRighyBanner);
                    if (dsCellRightBanner != null) {
                        return new q3w((DsMenuCell) viewF3, dsCellMiddleTitle2, dsCellRightBanner);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i2)));
                return null;
            case 5:
                ((Integer) obj2).getClass();
                hhm0.d(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ju70.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                ohm0.b(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 8:
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                gq80.E(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                gq80.J(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 11:
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                wha0.y(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 13:
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                tnq0.f(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 15:
                ywv0 ywv0Var = (ywv0) obj2;
                ((azg0) obj).getClass();
                ywv0Var.getClass();
                h0q0 h0q0Var = ywv0Var.b;
                bsv0 bsv0VarL = h0q0Var.l();
                bsv0VarL.getClass();
                esv0 esv0Var = bsv0VarL.f3152a;
                boolean z = esv0Var instanceof dsv0;
                csv0 csv0Var = csv0.f4909a;
                if (z) {
                    str = "REST:" + ((dsv0) esv0Var).f6633a;
                } else {
                    if (!esv0Var.equals(csv0Var)) {
                        t9f.b();
                        return null;
                    }
                    str = "REST:CONTENT";
                }
                esv0 esv0Var2 = bsv0VarL.b;
                if (esv0Var2 == null) {
                    str2 = "EXPAND:NONE";
                } else if (esv0Var2 instanceof dsv0) {
                    str2 = "EXPAND:" + ((dsv0) esv0Var2).f6633a;
                } else {
                    if (!esv0Var2.equals(csv0Var)) {
                        t9f.b();
                        return null;
                    }
                    str2 = "EXPAND:CONTENT";
                }
                Pair pair = new Pair("KEY_ANCHOR_MODEL", CollectionsKt.b0(q3d.j(str, str2), HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, null, 62));
                lsv0 lsv0Var = h0q0Var.p().c;
                if (!(lsv0Var instanceof isv0)) {
                    if (lsv0Var.equals(ksv0.f18834a)) {
                        str3 = "SHADOW_ONLY";
                    } else {
                        if (!lsv0Var.equals(jsv0.f17072a)) {
                            t9f.b();
                            return null;
                        }
                        str3 = "NONE";
                        str4 = str3;
                    }
                    Pair pair2 = new Pair("KEY_BACKDROP", str3);
                    Pair pair3 = new Pair("KEY_SHEET_BACKGROUND_COLOR", Long.valueOf(h0q0Var.p().f3395a.f5144a));
                    qtv0Var = h0q0Var.p().b.f17122a;
                    if (qtv0Var instanceof ptv0) {
                        j = ((ptv0) qtv0Var).f27584a;
                        if (j != 16) {
                            strH = h97.h(j, "THEME:");
                        } else {
                            strH = "THEME";
                        }
                    } else if (Intrinsics.d(qtv0Var, otv0.f25849a)) {
                        strH = "STATIC";
                    } else {
                        if (qtv0Var == null) {
                            t9f.b();
                            return null;
                        }
                        strH = str4;
                    }
                    Pair pair4 = new Pair("KEY_DRAG_HANDLE_STYLE", strH);
                    Pair pair5 = new Pair("KEY_SCRIM_COLOR", Long.valueOf(h0q0Var.p().d));
                    lxv0VarD = ywv0Var.d.d();
                    lxv0VarD.getClass();
                    if (lxv0VarD.equals(jxv0.f17330a)) {
                        str5 = "SHEET_VALUE_HIDDEN_TAG";
                    } else if (lxv0VarD.equals(kxv0.f19078a)) {
                        str5 = "SHEET_VALUE_REST_TAG";
                    } else {
                        if (lxv0VarD.equals(ixv0.f15562a)) {
                            t9f.b();
                            return null;
                        }
                        str5 = "SHEET_VALUE_EXPAND_TAG";
                    }
                    Pair pair6 = new Pair("KEY_CURRENT_VALUE", str5);
                    Pair pair7 = new Pair("KEY_HORIZONTAL_SWIPE_ENABLED", Boolean.valueOf(h0q0Var.p().e));
                    Pair pair8 = new Pair("KEY_DRAG_HANDLE_BACKGROUND_COLOR", Long.valueOf(h0q0Var.p().b.b));
                    iOrdinal = h0q0Var.p().f.ordinal();
                    if (iOrdinal != 0) {
                        str6 = "FREE";
                    } else if (iOrdinal != 1) {
                        str6 = "ANCHORS_ONLY";
                    } else {
                        if (iOrdinal == 2) {
                            t9f.b();
                            return null;
                        }
                        str6 = str4;
                    }
                    Pair pair9 = new Pair("KEY_DRAG_MODE", str6);
                    ntv0Var = h0q0Var.p().b.c;
                    if (ntv0Var.equals(mtv0.f22387a)) {
                        str7 = "STACKED";
                    } else {
                        if (ntv0Var.equals(ltv0.f20644a)) {
                            t9f.b();
                            return null;
                        }
                        str7 = "OVERLAY";
                    }
                    Pair pair10 = new Pair("KEY_DRAG_HANDLE_PLACEMENT", str7);
                    ssv0 ssv0Var = (ssv0) ((hgk0) ((pz40) h0q0Var.c)).getValue();
                    ssv0Var.getClass();
                    iOrdinal2 = ssv0Var.ordinal();
                    if (iOrdinal2 != 0) {
                        str8 = "LIFT";
                    } else {
                        if (iOrdinal2 == 1) {
                            t9f.b();
                            return null;
                        }
                        str8 = "STAY_UNDER_KEYBOARD";
                    }
                    return xp20.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair("KEY_BOTTOM_KEYBOARD_PLACEMENT", str8), new Pair("KEY_SHEET_CORNER_RADIUS", Float.valueOf(h0q0Var.p().f3395a.b)), new Pair("KEY_DRAG_HANDLE_SIZE_WIDTH", Float.valueOf(bdl.b(h0q0Var.p().b.e))), new Pair("KEY_DRAG_HANDLE_SIZE_HEIGHT", Float.valueOf(bdl.a(h0q0Var.p().b.e))), new Pair("KEY_DRAG_HANDLE_ZONE_HEIGHT", Float.valueOf(h0q0Var.p().b.d)), new Pair("KEY_MAX_BOUNCE_DISTANCE", Float.valueOf(h0q0Var.m().f22342a)));
                }
                str3 = ((isv0) lsv0Var).f15325a ? "DIM_BEHIND_DISMISS_TRUE" : "DIM_BEHIND_DISMISS_FALSE";
                str4 = "NONE";
                Pair pair11 = new Pair("KEY_BACKDROP", str3);
                Pair pair12 = new Pair("KEY_SHEET_BACKGROUND_COLOR", Long.valueOf(h0q0Var.p().f3395a.f5144a));
                qtv0Var = h0q0Var.p().b.f17122a;
                if (qtv0Var instanceof ptv0) {
                    j = ((ptv0) qtv0Var).f27584a;
                    if (j != 16) {
                        strH = h97.h(j, "THEME:");
                    } else {
                        strH = "THEME";
                    }
                } else if (Intrinsics.d(qtv0Var, otv0.f25849a)) {
                    strH = "STATIC";
                } else {
                    if (qtv0Var == null) {
                        t9f.b();
                        return null;
                    }
                    strH = str4;
                }
                Pair pair13 = new Pair("KEY_DRAG_HANDLE_STYLE", strH);
                Pair pair14 = new Pair("KEY_SCRIM_COLOR", Long.valueOf(h0q0Var.p().d));
                lxv0VarD = ywv0Var.d.d();
                lxv0VarD.getClass();
                if (lxv0VarD.equals(jxv0.f17330a)) {
                    str5 = "SHEET_VALUE_HIDDEN_TAG";
                } else if (lxv0VarD.equals(kxv0.f19078a)) {
                    str5 = "SHEET_VALUE_REST_TAG";
                } else {
                    if (lxv0VarD.equals(ixv0.f15562a)) {
                        t9f.b();
                        return null;
                    }
                    str5 = "SHEET_VALUE_EXPAND_TAG";
                }
                Pair pair15 = new Pair("KEY_CURRENT_VALUE", str5);
                Pair pair16 = new Pair("KEY_HORIZONTAL_SWIPE_ENABLED", Boolean.valueOf(h0q0Var.p().e));
                Pair pair17 = new Pair("KEY_DRAG_HANDLE_BACKGROUND_COLOR", Long.valueOf(h0q0Var.p().b.b));
                iOrdinal = h0q0Var.p().f.ordinal();
                if (iOrdinal != 0) {
                    str6 = "FREE";
                } else if (iOrdinal != 1) {
                    str6 = "ANCHORS_ONLY";
                } else {
                    if (iOrdinal == 2) {
                        t9f.b();
                        return null;
                    }
                    str6 = str4;
                }
                Pair pair18 = new Pair("KEY_DRAG_MODE", str6);
                ntv0Var = h0q0Var.p().b.c;
                if (ntv0Var.equals(mtv0.f22387a)) {
                    str7 = "STACKED";
                } else {
                    if (ntv0Var.equals(ltv0.f20644a)) {
                        t9f.b();
                        return null;
                    }
                    str7 = "OVERLAY";
                }
                Pair pair19 = new Pair("KEY_DRAG_HANDLE_PLACEMENT", str7);
                ssv0 ssv0Var2 = (ssv0) ((hgk0) ((pz40) h0q0Var.c)).getValue();
                ssv0Var2.getClass();
                iOrdinal2 = ssv0Var2.ordinal();
                if (iOrdinal2 != 0) {
                    str8 = "LIFT";
                } else {
                    if (iOrdinal2 == 1) {
                        t9f.b();
                        return null;
                    }
                    str8 = "STAY_UNDER_KEYBOARD";
                }
                return xp20.f(pair, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, new Pair("KEY_BOTTOM_KEYBOARD_PLACEMENT", str8), new Pair("KEY_SHEET_CORNER_RADIUS", Float.valueOf(h0q0Var.p().f3395a.b)), new Pair("KEY_DRAG_HANDLE_SIZE_WIDTH", Float.valueOf(bdl.b(h0q0Var.p().b.e))), new Pair("KEY_DRAG_HANDLE_SIZE_HEIGHT", Float.valueOf(bdl.a(h0q0Var.p().b.e))), new Pair("KEY_DRAG_HANDLE_ZONE_HEIGHT", Float.valueOf(h0q0Var.p().b.d)), new Pair("KEY_MAX_BOUNCE_DISTANCE", Float.valueOf(h0q0Var.m().f22342a)));
            case 16:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_x_games_scrollable_compact_menu_item, viewGroup4, false);
                int i3 = R.id.cell;
                DsMenuCell dsMenuCell = (DsMenuCell) yum0.f(viewF4, R.id.cell);
                if (dsMenuCell != null) {
                    i3 = R.id.gameCollection;
                    WebGamesGameCollection webGamesGameCollection = (WebGamesGameCollection) yum0.f(viewF4, R.id.gameCollection);
                    if (webGamesGameCollection != null) {
                        i3 = R.id.icon;
                        DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF4, R.id.icon);
                        if (dsCellLeftIcon2 != null) {
                            i3 = R.id.moreButton;
                            DsCellRightButton dsCellRightButton = (DsCellRightButton) yum0.f(viewF4, R.id.moreButton);
                            if (dsCellRightButton != null) {
                                DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF4, R.id.title);
                                if (dsCellMiddleTitle3 != null) {
                                    return new azx((LinearLayout) viewF4, dsMenuCell, webGamesGameCollection, dsCellLeftIcon2, dsCellRightButton, dsCellMiddleTitle3);
                                }
                            } else {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                } else {
                    i = i3;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i)));
                return null;
            case 17:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup5.getClass();
                return bzx.a(layoutInflater, viewGroup5);
            case 18:
                i8z i8zVar = (i8z) obj;
                int iIntValue = ((Integer) obj2).intValue();
                i8zVar.getClass();
                i8z.d(i8zVar, new uli0(iIntValue, (byte) 8), xf0.q);
                uzb.U(i8zVar, new gtr(true), null, null, null, 14);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new ejv0((byte) 21));
                function2.invoke(new y9v0((byte) 14));
                return Unit.f46060a;
            default:
                q3u0 q3u0Var = (q3u0) obj;
                return q3u0Var == null ? s1w0.f31475a : q3u0Var;
        }
    }

    public /* synthetic */ i9v0(int i, byte b) {
        this.f14407a = b;
    }
}
