package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.password_requirement.DsBulletList;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b4u0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1976a;

    public /* synthetic */ b4u0(byte b) {
        this.f1976a = b;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0355 A[PHI: r2
  0x0355: PHI (r2v4 int) = (r2v0 int), (r2v5 int) binds: [B:102:0x0329, B:104:0x0334] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x0357 A[PHI: r3
  0x0357: PHI (r3v8 int) = (r3v7 int), (r3v9 int) binds: [B:98:0x0317, B:100:0x0320] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1976a;
        int i = R.id.title;
        int i2 = R.id.icon;
        switch (b) {
            case 0:
                wgv wgvVar = (wgv) obj;
                wgvVar.n = ((Float) obj2).floatValue();
                wgvVar.s = true;
                wgvVar.c();
                return Unit.f46060a;
            case 1:
                wgv wgvVar2 = (wgv) obj;
                wgvVar2.o = ((Float) obj2).floatValue();
                wgvVar2.s = true;
                wgvVar2.c();
                return Unit.f46060a;
            case 2:
                wgv wgvVar3 = (wgv) obj;
                wgvVar3.p = ((Float) obj2).floatValue();
                wgvVar3.s = true;
                wgvVar3.c();
                return Unit.f46060a;
            case 3:
                wgv wgvVar4 = (wgv) obj;
                wgvVar4.q = ((Float) obj2).floatValue();
                wgvVar4.s = true;
                wgvVar4.c();
                return Unit.f46060a;
            case 4:
                wgv wgvVar5 = (wgv) obj;
                wgvVar5.r = ((Float) obj2).floatValue();
                wgvVar5.s = true;
                wgvVar5.c();
                return Unit.f46060a;
            case 5:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.venue_item, viewGroup, false);
                int i3 = R.id.blDescription;
                DsBulletList dsBulletList = (DsBulletList) yum0.f(viewF, R.id.blDescription);
                if (dsBulletList != null) {
                    i3 = R.id.cellLeft;
                    if (((SportCellLeftView) yum0.f(viewF, R.id.cellLeft)) != null) {
                        i3 = R.id.cellMiddle;
                        SportCellMiddleView sportCellMiddleView = (SportCellMiddleView) yum0.f(viewF, R.id.cellMiddle);
                        if (sportCellMiddleView != null) {
                            i3 = R.id.vClickableArea;
                            View viewF2 = yum0.f(viewF, R.id.vClickableArea);
                            if (viewF2 != null) {
                                i3 = R.id.venueLocationTitleContainer;
                                if (((DsSportCell) yum0.f(viewF, R.id.venueLocationTitleContainer)) != null) {
                                    return new m6u0((ConstraintLayout) viewF, dsBulletList, sportCellMiddleView, viewF2);
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i3)));
                return null;
            case 6:
                ((Integer) obj2).getClass();
                kc5.c0(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.verification_option_item, viewGroup2, false);
                int i4 = R.id.cardBody;
                TextView textView = (TextView) yum0.f(viewF3, R.id.cardBody);
                if (textView != null) {
                    i4 = R.id.divider;
                    View viewF4 = yum0.f(viewF3, R.id.divider);
                    if (viewF4 != null) {
                        ImageView imageView = (ImageView) yum0.f(viewF3, R.id.icon);
                        if (imageView != null) {
                            i2 = R.id.openVerificationScreen;
                            if (((ImageView) yum0.f(viewF3, R.id.openVerificationScreen)) != null) {
                                TextView textView2 = (TextView) yum0.f(viewF3, R.id.title);
                                if (textView2 != null) {
                                    i = R.id.titleBody;
                                    TextView textView3 = (TextView) yum0.f(viewF3, R.id.titleBody);
                                    if (textView3 != null) {
                                        return new b8u0((MaterialCardView) viewF3, textView, viewF4, imageView, textView2, textView3);
                                    }
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = i2;
                        }
                    } else {
                        i = i4;
                    }
                } else {
                    i = i4;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i)));
                return null;
            case 8:
                ((Integer) obj2).getClass();
                j47.Z(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 9:
                fet fetVar = (fet) obj;
                ((Integer) obj2).getClass();
                kys0 kys0Var = gau0.P1;
                fetVar.e0(-333475714);
                WeakHashMap weakHashMap = djv0.w;
                q33 q33Var = zcm0.i(fetVar).g;
                fetVar.r(false);
                return q33Var;
            case 10:
                ((Integer) obj2).getClass();
                jd8.H(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 11:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup3.getClass();
                return zvx.a(layoutInflater, viewGroup3);
            case 12:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_decorated_tint_virtual_menu_item, viewGroup4, false);
                DsMenuCell dsMenuCell = (DsMenuCell) viewF5;
                DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewF5, R.id.decorIcon);
                if (dsCellRightBanner != null) {
                    DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF5, R.id.icon);
                    if (dsCellLeftIcon != null) {
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF5, R.id.title);
                        if (dsCellMiddleTitle != null) {
                            return new aux(dsMenuCell, dsMenuCell, dsCellRightBanner, dsCellLeftIcon, dsCellMiddleTitle);
                        }
                    } else {
                        i = R.id.icon;
                    }
                } else {
                    i = R.id.decorIcon;
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i)));
                return null;
            case 13:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_decorated_tint_small_virtual_menu_item, viewGroup5, false);
                if (viewF6 != null) {
                    DsMenuCompactCell dsMenuCompactCell = (DsMenuCompactCell) viewF6;
                    return new ztx(dsMenuCompactCell, dsMenuCompactCell);
                }
                hny.u("rootView");
                return null;
            case 14:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(765052506);
                xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA;
            case 15:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 16:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(944068402);
                xcz xczVarA2 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA2;
            case 17:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new d4u0((byte) 12));
                function2.invoke(new o1u0((byte) 17));
                return Unit.f46060a;
            case 18:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fet fetVar4 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar4.e0(-419326681);
                xcz xczVarA3 = ddz.a(0, 0, fetVar4, 0, 3);
                fetVar4.r(false);
                return xczVarA3;
            case 20:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 21:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_virtual_simple_menu_item, viewGroup6, false);
                int i5 = R.id.left;
                DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF7, R.id.left);
                if (dsCellLeftIcon2 != null) {
                    i5 = R.id.middle;
                    DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF7, R.id.middle);
                    if (dsCellMiddleTitle2 != null) {
                        return new yyx((DsMenuCell) viewF7, dsCellLeftIcon2, dsCellMiddleTitle2);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i5)));
                return null;
            case 22:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.item_compact_virtual_small_simple_item, viewGroup7, false);
                if (viewF8 != null) {
                    DsMenuCompactCell dsMenuCompactCell2 = (DsMenuCompactCell) viewF8;
                    return new jtx(dsMenuCompactCell2, dsMenuCompactCell2);
                }
                hny.u("rootView");
                return null;
            case 23:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 24:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.item_card_weather, viewGroup8, false);
                int i6 = R.id.fHumidity;
                Flow flow = (Flow) yum0.f(viewF9, R.id.fHumidity);
                if (flow != null) {
                    i6 = R.id.fPressure;
                    Flow flow2 = (Flow) yum0.f(viewF9, R.id.fPressure);
                    if (flow2 != null) {
                        i6 = R.id.fTemperature;
                        Flow flow3 = (Flow) yum0.f(viewF9, R.id.fTemperature);
                        if (flow3 != null) {
                            i6 = R.id.fWeatherContainer;
                            if (((Flow) yum0.f(viewF9, R.id.fWeatherContainer)) != null) {
                                i6 = R.id.fWind;
                                Flow flow4 = (Flow) yum0.f(viewF9, R.id.fWind);
                                if (flow4 != null) {
                                    i6 = R.id.ivHumidity;
                                    if (((ImageView) yum0.f(viewF9, R.id.ivHumidity)) != null) {
                                        i6 = R.id.ivPressure;
                                        if (((ImageView) yum0.f(viewF9, R.id.ivPressure)) != null) {
                                            i6 = R.id.ivTemperature;
                                            ImageView imageView2 = (ImageView) yum0.f(viewF9, R.id.ivTemperature);
                                            if (imageView2 != null) {
                                                i6 = R.id.ivWind;
                                                if (((ImageView) yum0.f(viewF9, R.id.ivWind)) != null) {
                                                    i6 = R.id.tvHumidity;
                                                    TextView textView4 = (TextView) yum0.f(viewF9, R.id.tvHumidity);
                                                    if (textView4 != null) {
                                                        i6 = R.id.tvLocation;
                                                        TextView textView5 = (TextView) yum0.f(viewF9, R.id.tvLocation);
                                                        if (textView5 != null) {
                                                            i6 = R.id.tvPressure;
                                                            TextView textView6 = (TextView) yum0.f(viewF9, R.id.tvPressure);
                                                            if (textView6 != null) {
                                                                i6 = R.id.tvTemperature;
                                                                TextView textView7 = (TextView) yum0.f(viewF9, R.id.tvTemperature);
                                                                if (textView7 != null) {
                                                                    i6 = R.id.tvWind;
                                                                    TextView textView8 = (TextView) yum0.f(viewF9, R.id.tvWind);
                                                                    if (textView8 != null) {
                                                                        return new zsx((ConstraintLayout) viewF9, flow, flow2, flow3, flow4, imageView2, textView4, textView5, textView6, textView7, textView8);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF9.getResources().getResourceName(i6)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                knx.C(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            default:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ b4u0(int i, byte b) {
        this.f1976a = b;
    }
}
