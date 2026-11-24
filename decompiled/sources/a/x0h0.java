package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.statistic.grand_prix.presentation.model.SeasonItemUIModel;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.DsShimmerCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40069a;

    public /* synthetic */ x0h0(byte b) {
        this.f40069a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        byte b = this.f40069a;
        int i = R.id.cell_middle;
        switch (b) {
            case 0:
                azg0 azg0Var = (azg0) obj;
                eo80 eo80Var = (eo80) obj2;
                Object objA = z0h0.a(new f2q0(eo80Var.f8127a), z0h0.q, azg0Var);
                Object objA2 = z0h0.a(new n5q0(eo80Var.b), z0h0.r, azg0Var);
                Object objA3 = z0h0.a(new daq0(eo80Var.c), z0h0.v, azg0Var);
                g8q0 g8q0Var = eo80Var.d;
                g8q0 g8q0Var2 = g8q0.c;
                Object objA4 = z0h0.a(g8q0Var, z0h0.l, azg0Var);
                Object objA5 = z0h0.a(eo80Var.e, gq80.g, azg0Var);
                m600 m600Var = eo80Var.f;
                m600 m600Var2 = m600.d;
                return q3d.e(objA, objA2, objA3, objA4, objA5, z0h0.a(m600Var, z0h0.A, azg0Var), z0h0.a(new p500(eo80Var.g), gq80.i, azg0Var), z0h0.a(new fuw(eo80Var.h), z0h0.s, azg0Var), z0h0.a(eo80Var.i, gq80.j, azg0Var));
            case 1:
                return ((cot0) obj2).f4719a;
            case 2:
                azg0 azg0Var2 = (azg0) obj;
                smk0 smk0Var = (smk0) obj2;
                y3d y3dVar = new y3d(smk0Var.f32451a.h());
                y0h0 y0h0Var = z0h0.p;
                Object objA6 = z0h0.a(y3dVar, y0h0Var, azg0Var2);
                daq0 daq0Var = new daq0(smk0Var.b);
                y0h0 y0h0Var2 = z0h0.v;
                Object objA7 = z0h0.a(daq0Var, y0h0Var2, azg0Var2);
                psq psqVar = smk0Var.c;
                psq psqVar2 = psq.b;
                Object objA8 = z0h0.a(psqVar, z0h0.m, azg0Var2);
                Object objA9 = z0h0.a(smk0Var.d, z0h0.t, azg0Var2);
                Object objA10 = z0h0.a(smk0Var.e, z0h0.u, azg0Var2);
                String str2 = smk0Var.g;
                Object objA11 = z0h0.a(new daq0(smk0Var.h), y0h0Var2, azg0Var2);
                Object objA12 = z0h0.a(smk0Var.i, z0h0.n, azg0Var2);
                Object objA13 = z0h0.a(smk0Var.j, z0h0.k, azg0Var2);
                rs00 rs00Var = smk0Var.k;
                rs00 rs00Var2 = rs00.c;
                Object objA14 = z0h0.a(rs00Var, z0h0.y, azg0Var2);
                Object objA15 = z0h0.a(new y3d(smk0Var.l), y0h0Var, azg0Var2);
                Object objA16 = z0h0.a(smk0Var.m, z0h0.j, azg0Var2);
                ljj0 ljj0Var = smk0Var.n;
                ljj0 ljj0Var2 = ljj0.d;
                return q3d.e(objA6, objA7, objA8, objA9, objA10, -1, str2, objA11, objA12, objA13, objA14, objA15, objA16, z0h0.a(ljj0Var, z0h0.o, azg0Var2));
            case 3:
                azg0 azg0Var3 = (azg0) obj;
                f9q0 f9q0Var = (f9q0) obj2;
                smk0 smk0Var2 = f9q0Var.f9167a;
                v0h0 v0h0Var = z0h0.h;
                return q3d.e(z0h0.a(smk0Var2, v0h0Var, azg0Var3), z0h0.a(f9q0Var.b, v0h0Var, azg0Var3), z0h0.a(f9q0Var.c, v0h0Var, azg0Var3), z0h0.a(f9q0Var.d, v0h0Var, azg0Var3));
            case 4:
                ew90 ew90Var = (ew90) obj2;
                Boolean boolValueOf = Boolean.valueOf(ew90Var.f8511a);
                v0h0 v0h0Var2 = z0h0.f43566a;
                return q3d.e(boolValueOf, z0h0.a(new etn(ew90Var.b), gq80.h, (azg0) obj));
            case 5:
                return Integer.valueOf(((etn) obj2).f8383a);
            case 6:
                return Integer.valueOf(((p500) obj2).f26381a);
            case 7:
                i9q0 i9q0Var = (i9q0) obj2;
                return q3d.e(z0h0.a(new h9q0(i9q0Var.f14400a), gq80.k, (azg0) obj), Boolean.valueOf(i9q0Var.b));
            case 8:
                return Integer.valueOf(((h9q0) obj2).f12690a);
            case 9:
                return Integer.valueOf(((rah0) obj2).f30133a.l());
            case 10:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(-1710742632);
                rah0 rah0Var = new rah0(0);
                fetVar.r(false);
                return rah0Var;
            case 11:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(pih0.f27043a);
                function2.invoke(new igh0((byte) 7));
                return Unit.f46060a;
            case 12:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(qih0.f28793a);
                function4.invoke(new igh0((byte) 6));
                return Unit.f46060a;
            case 13:
                ((Integer) obj).intValue();
                SeasonItemUIModel seasonItemUIModel = (SeasonItemUIModel) obj2;
                lme0 lme0Var = ljh0.m2;
                seasonItemUIModel.getClass();
                return seasonItemUIModel.f47031a;
            case 14:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 15:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.view_cell_shimmer, viewGroup, false);
                DsShimmerCell dsShimmerCell = (DsShimmerCell) yum0.f(viewF, R.id.shimmerCell);
                if (dsShimmerCell != null) {
                    return new cgu0((DsSettingsCell) viewF, dsShimmerCell);
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(R.id.shimmerCell)));
                return null;
            case 16:
                ((Integer) obj).getClass();
                ooh0 ooh0Var = (ooh0) obj2;
                ooh0Var.getClass();
                if (ooh0Var instanceof koh0) {
                    return ooh0Var.getClass();
                }
                if (ooh0Var instanceof loh0) {
                    return ((loh0) ooh0Var).f20390a;
                }
                if (ooh0Var instanceof moh0) {
                    return ((moh0) ooh0Var).f22134a;
                }
                t9f.b();
                return null;
            case 17:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.view_header_shimmer_item, viewGroup2, false);
                if (viewF2 != null) {
                    return new h2k((DsHeader) viewF2, (byte) 1);
                }
                hny.u("rootView");
                return null;
            case 18:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.view_settings_security_header, viewGroup3, false);
                if (viewF3 != null) {
                    DsHeader dsHeader = (DsHeader) viewF3;
                    return new uku0(dsHeader, dsHeader);
                }
                hny.u("rootView");
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.view_settings_security_level_design_system, viewGroup4, false);
                DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF4, R.id.cell_left);
                if (dsCellLeftIcon != null) {
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF4, R.id.cell_middle);
                    if (dsCellMiddleTitle != null) {
                        return new wku0((DsSettingsCell) viewF4, dsCellLeftIcon, dsCellMiddleTitle);
                    }
                } else {
                    i = R.id.cell_left;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i)));
                return null;
            case 20:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.view_long_lines_shimmer_item, viewGroup5, false);
                int i2 = R.id.shimmerOne;
                if (((DsShimmerView) yum0.f(viewF5, R.id.shimmerOne)) != null) {
                    i2 = R.id.shimmerTwo;
                    if (((DsShimmerView) yum0.f(viewF5, R.id.shimmerTwo)) != null) {
                        return new vhu0((DsSettingsCell) viewF5);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i2)));
                return null;
            case 21:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.view_profile_shimmer, viewGroup6, false);
                if (viewF6 != null) {
                    return new yju0((DsSettingsCell) viewF6);
                }
                hny.u("rootView");
                return null;
            case 22:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.view_settings_security_design_system_progress, viewGroup7, false);
                int i3 = R.id.bonusBackgroundView;
                View viewF8 = yum0.f(viewF7, R.id.bonusBackgroundView);
                if (viewF8 != null) {
                    i3 = R.id.bonusImageView;
                    if (((ImageView) yum0.f(viewF7, R.id.bonusImageView)) != null) {
                        i3 = R.id.description;
                        TextView textView = (TextView) yum0.f(viewF7, R.id.description);
                        if (textView != null) {
                            i3 = R.id.group;
                            Group group = (Group) yum0.f(viewF7, R.id.group);
                            if (group != null) {
                                i3 = R.id.progressBar;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) yum0.f(viewF7, R.id.progressBar);
                                if (linearProgressIndicator != null) {
                                    i3 = R.id.progress_title;
                                    TextView textView2 = (TextView) yum0.f(viewF7, R.id.progress_title);
                                    if (textView2 != null) {
                                        i3 = R.id.text_background;
                                        View viewF9 = yum0.f(viewF7, R.id.text_background);
                                        if (viewF9 != null) {
                                            return new tku0((DsSettingsCell) viewF7, viewF8, textView, group, linearProgressIndicator, textView2, viewF9);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i3)));
                return null;
            case 23:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.view_settings_security_item_design_system, viewGroup8, false);
                DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF10, R.id.cell_left);
                if (dsCellLeftIcon2 != null) {
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF10, R.id.cell_middle);
                    if (dsCellMiddleTitle2 != null) {
                        i = R.id.cell_right;
                        DsCellRightLabel dsCellRightLabel = (DsCellRightLabel) yum0.f(viewF10, R.id.cell_right);
                        if (dsCellRightLabel != null) {
                            return new vku0((DsSettingsCell) viewF10, dsCellLeftIcon2, dsCellMiddleTitle2, dsCellRightLabel);
                        }
                    }
                } else {
                    i = R.id.cell_left;
                }
                hny.u("Missing required view with ID: ".concat(viewF10.getResources().getResourceName(i)));
                return null;
            case 24:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF11 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.view_settings_security_switch_item_design_system, viewGroup9, false);
                DsCellLeftIcon dsCellLeftIcon3 = (DsCellLeftIcon) yum0.f(viewF11, R.id.cell_left);
                if (dsCellLeftIcon3 != null) {
                    DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF11, R.id.cell_middle);
                    if (dsCellMiddleTitle3 != null) {
                        i = R.id.cell_switch;
                        DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(viewF11, R.id.cell_switch);
                        if (dsCellRightSwitch != null) {
                            return new xku0((DsSettingsCell) viewF11, dsCellLeftIcon3, dsCellMiddleTitle3, dsCellRightSwitch);
                        }
                    }
                } else {
                    i = R.id.cell_left;
                }
                hny.u("Missing required view with ID: ".concat(viewF11.getResources().getResourceName(i)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue = ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                if (p6t0Var instanceof jzh0) {
                    str = ((jzh0) p6t0Var).f17413a;
                } else {
                    if (p6t0Var instanceof uzh0) {
                        return twn.m(iIntValue, ((uzh0) p6t0Var).f36535a);
                    }
                    if (!(p6t0Var instanceof ua5)) {
                        return String.valueOf(iIntValue);
                    }
                    str = ((ua5) p6t0Var).f35314a;
                }
                return rz4.h(iIntValue, str);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            default:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
        }
    }
}
