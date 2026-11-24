package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sfc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32112a;

    public /* synthetic */ sfc(byte b) {
        this.f32112a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f32112a) {
            case 0:
                ((Integer) obj2).getClass();
                lv00.B(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 1:
                wwv0 wwv0Var = (wwv0) obj;
                wwv0Var.getClass();
                ((jgc) obj2).getClass();
                wwv0Var.c.c = ltv0.f20644a;
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                i120.A(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                whc whcVar = (whc) obj2;
                ((oyg0) obj).getClass();
                whcVar.getClass();
                List list = whcVar.e;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new u95(false, ((u95) it.next()).f35266a));
                }
                return whc.a(whcVar, 0L, null, arrayList, false, 239);
            case 4:
                ((Integer) obj).intValue();
                twm0 twm0Var = (twm0) obj2;
                twm0Var.getClass();
                return Long.valueOf(twm0Var.f34658a);
            case 5:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.vh_clear_coupon_item, viewGroup, false);
                if (viewF != null) {
                    return new mzq((DsButton) viewF, (byte) 7);
                }
                hny.u("rootView");
                return null;
            case 6:
                ((Integer) obj).getClass();
                csc cscVar = (csc) obj2;
                int i = esc.m2;
                cscVar.getClass();
                return cscVar.f4881a.name();
            case 7:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.clickable_input_item, viewGroup2, false);
                int i2 = R.id.clickableTextField;
                DsTextField dsTextField = (DsTextField) yum0.f(viewF2, R.id.clickableTextField);
                if (dsTextField != null) {
                    i2 = R.id.overlayView;
                    View viewF3 = yum0.f(viewF2, R.id.overlayView);
                    if (viewF3 != null) {
                        return new etc((ConstraintLayout) viewF2, dsTextField, viewF3);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                return null;
            case 8:
                ((Integer) obj2).getClass();
                slb.r(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 9:
                fhl fhlVar = (fhl) obj;
                nu90 nu90Var = (nu90) obj2;
                fhlVar.getClass();
                nu90Var.getClass();
                nu90Var.f24139a.e(fhlVar, fhlVar.d(), nu90Var.b, nu90Var.c);
                return Unit.f46060a;
            case 10:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.delegate_collage_item, viewGroup3, false);
                int i3 = R.id.imgPicture;
                ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF4, R.id.imgPicture);
                if (shapeableImageView != null) {
                    i3 = R.id.progressBar;
                    ImageView imageView = (ImageView) yum0.f(viewF4, R.id.progressBar);
                    if (imageView != null) {
                        return new v1k(imageView, (ConstraintLayout) viewF4, shapeableImageView);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i3)));
                return null;
            case 11:
                x2d x2dVar = (x2d) obj2;
                ((azg0) obj).getClass();
                x2dVar.getClass();
                return q3d.j(Float.valueOf(x2dVar.d.l()), Float.valueOf(x2dVar.f.l()), Float.valueOf(x2dVar.e.l()));
            case 12:
                f3d f3dVar = (f3d) obj2;
                ((azg0) obj).getClass();
                f3dVar.getClass();
                return q3d.j(Float.valueOf(f3dVar.f8856a.l()), Float.valueOf(f3dVar.d.l()), Float.valueOf(f3dVar.i));
            case 13:
                String str = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                str.getClass();
                element.getClass();
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            case 14:
                StringBuilder sb = (StringBuilder) obj;
                km40 km40Var = (km40) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(km40Var);
                return sb;
            case 15:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup4.getClass();
                return ftx.a(layoutInflater, viewGroup4);
            case 16:
                LayoutInflater layoutInflater2 = (LayoutInflater) obj;
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                layoutInflater2.getClass();
                viewGroup5.getClass();
                return ftx.a(layoutInflater2, viewGroup5);
            case 17:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_compact_grid_decorate_menu_item, viewGroup6, false);
                if (viewF5 != null) {
                    DsMenuCompactCell dsMenuCompactCell = (DsMenuCompactCell) viewF5;
                    return new etx(dsMenuCompactCell, dsMenuCompactCell);
                }
                hny.u("rootView");
                return null;
            case 18:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.item_compact_grid_decorate_menu_item, viewGroup7, false);
                if (viewF6 != null) {
                    DsMenuCompactCell dsMenuCompactCell2 = (DsMenuCompactCell) viewF6;
                    return new etx(dsMenuCompactCell2, dsMenuCompactCell2);
                }
                hny.u("rootView");
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                LayoutInflater layoutInflater3 = (LayoutInflater) obj;
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                layoutInflater3.getClass();
                viewGroup8.getClass();
                return ftx.a(layoutInflater3, viewGroup8);
            case 20:
                LayoutInflater layoutInflater4 = (LayoutInflater) obj;
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                layoutInflater4.getClass();
                viewGroup9.getClass();
                return itx.a(layoutInflater4, viewGroup9);
            case 21:
                LayoutInflater layoutInflater5 = (LayoutInflater) obj;
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                layoutInflater5.getClass();
                viewGroup10.getClass();
                return ftx.a(layoutInflater5, viewGroup10);
            case 22:
                LayoutInflater layoutInflater6 = (LayoutInflater) obj;
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                layoutInflater6.getClass();
                viewGroup11.getClass();
                return itx.a(layoutInflater6, viewGroup11);
            case 23:
                LayoutInflater layoutInflater7 = (LayoutInflater) obj;
                ViewGroup viewGroup12 = (ViewGroup) obj2;
                layoutInflater7.getClass();
                viewGroup12.getClass();
                return ftx.a(layoutInflater7, viewGroup12);
            case 24:
                ViewGroup viewGroup13 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup13, R.layout.history_compact_item_view_holder, viewGroup13, false);
                int i4 = R.id.autoSubTag;
                ImageView imageView2 = (ImageView) yum0.f(viewF7, R.id.autoSubTag);
                if (imageView2 != null) {
                    i4 = R.id.betSaleGroup;
                    Group group = (Group) yum0.f(viewF7, R.id.betSaleGroup);
                    if (group != null) {
                        i4 = R.id.betSaleTitle;
                        if (((TextView) yum0.f(viewF7, R.id.betSaleTitle)) != null) {
                            i4 = R.id.betSaleValue;
                            TextView textView = (TextView) yum0.f(viewF7, R.id.betSaleValue);
                            if (textView != null) {
                                i4 = R.id.betValueGroup;
                                Group group2 = (Group) yum0.f(viewF7, R.id.betValueGroup);
                                if (group2 != null) {
                                    i4 = R.id.betWinGroup;
                                    if (((Group) yum0.f(viewF7, R.id.betWinGroup)) != null) {
                                        i4 = R.id.dateAndTagsFlow;
                                        if (((Flow) yum0.f(viewF7, R.id.dateAndTagsFlow)) != null) {
                                            i4 = R.id.imageBell;
                                            ImageView imageView3 = (ImageView) yum0.f(viewF7, R.id.imageBell);
                                            if (imageView3 != null) {
                                                i4 = R.id.imageBellContainer;
                                                FrameLayout frameLayout = (FrameLayout) yum0.f(viewF7, R.id.imageBellContainer);
                                                if (frameLayout != null) {
                                                    i4 = R.id.imageBetStatus;
                                                    ImageView imageView4 = (ImageView) yum0.f(viewF7, R.id.imageBetStatus);
                                                    if (imageView4 != null) {
                                                        i4 = R.id.imageMore;
                                                        if (((ImageView) yum0.f(viewF7, R.id.imageMore)) != null) {
                                                            i4 = R.id.imageMoreContainer;
                                                            FrameLayout frameLayout2 = (FrameLayout) yum0.f(viewF7, R.id.imageMoreContainer);
                                                            if (frameLayout2 != null) {
                                                                i4 = R.id.payoutGroup;
                                                                Group group3 = (Group) yum0.f(viewF7, R.id.payoutGroup);
                                                                if (group3 != null) {
                                                                    i4 = R.id.payoutSum;
                                                                    TextView textView2 = (TextView) yum0.f(viewF7, R.id.payoutSum);
                                                                    if (textView2 != null) {
                                                                        i4 = R.id.payoutTitle;
                                                                        TextView textView3 = (TextView) yum0.f(viewF7, R.id.payoutTitle);
                                                                        if (textView3 != null) {
                                                                            i4 = R.id.stakeAfterTaxGroup;
                                                                            Group group4 = (Group) yum0.f(viewF7, R.id.stakeAfterTaxGroup);
                                                                            if (group4 != null) {
                                                                                i4 = R.id.taxExciseGroup;
                                                                                Group group5 = (Group) yum0.f(viewF7, R.id.taxExciseGroup);
                                                                                if (group5 != null) {
                                                                                    i4 = R.id.taxFeeGroup;
                                                                                    Group group6 = (Group) yum0.f(viewF7, R.id.taxFeeGroup);
                                                                                    if (group6 != null) {
                                                                                        i4 = R.id.tvBetCoef;
                                                                                        TextView textView4 = (TextView) yum0.f(viewF7, R.id.tvBetCoef);
                                                                                        if (textView4 != null) {
                                                                                            i4 = R.id.tvBetCoefTitle;
                                                                                            TextView textView5 = (TextView) yum0.f(viewF7, R.id.tvBetCoefTitle);
                                                                                            if (textView5 != null) {
                                                                                                i4 = R.id.tvBetCoeffType;
                                                                                                TextView textView6 = (TextView) yum0.f(viewF7, R.id.tvBetCoeffType);
                                                                                                if (textView6 != null) {
                                                                                                    i4 = R.id.tvBetCoeffTypeTitle;
                                                                                                    TextView textView7 = (TextView) yum0.f(viewF7, R.id.tvBetCoeffTypeTitle);
                                                                                                    if (textView7 != null) {
                                                                                                        i4 = R.id.tvBetStatus;
                                                                                                        TextView textView8 = (TextView) yum0.f(viewF7, R.id.tvBetStatus);
                                                                                                        if (textView8 != null) {
                                                                                                            i4 = R.id.tvBetValue;
                                                                                                            TextView textView9 = (TextView) yum0.f(viewF7, R.id.tvBetValue);
                                                                                                            if (textView9 != null) {
                                                                                                                i4 = R.id.tvBetValueTitle;
                                                                                                                TextView textView10 = (TextView) yum0.f(viewF7, R.id.tvBetValueTitle);
                                                                                                                if (textView10 != null) {
                                                                                                                    i4 = R.id.tvBetWin;
                                                                                                                    TextView textView11 = (TextView) yum0.f(viewF7, R.id.tvBetWin);
                                                                                                                    if (textView11 != null) {
                                                                                                                        i4 = R.id.tvBetWinTitle;
                                                                                                                        TextView textView12 = (TextView) yum0.f(viewF7, R.id.tvBetWinTitle);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i4 = R.id.tvDate;
                                                                                                                            TextView textView13 = (TextView) yum0.f(viewF7, R.id.tvDate);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i4 = R.id.tvEventTag;
                                                                                                                                TextView textView14 = (TextView) yum0.f(viewF7, R.id.tvEventTag);
                                                                                                                                if (textView14 != null) {
                                                                                                                                    i4 = R.id.tvLive;
                                                                                                                                    LinearLayout linearLayout = (LinearLayout) yum0.f(viewF7, R.id.tvLive);
                                                                                                                                    if (linearLayout != null) {
                                                                                                                                        i4 = R.id.tvStakeAfterTaxTitle;
                                                                                                                                        TextView textView15 = (TextView) yum0.f(viewF7, R.id.tvStakeAfterTaxTitle);
                                                                                                                                        if (textView15 != null) {
                                                                                                                                            i4 = R.id.tvStakeAfterTaxValue;
                                                                                                                                            TextView textView16 = (TextView) yum0.f(viewF7, R.id.tvStakeAfterTaxValue);
                                                                                                                                            if (textView16 != null) {
                                                                                                                                                i4 = R.id.tvTaxExciseTitle;
                                                                                                                                                TextView textView17 = (TextView) yum0.f(viewF7, R.id.tvTaxExciseTitle);
                                                                                                                                                if (textView17 != null) {
                                                                                                                                                    i4 = R.id.tvTaxExciseValue;
                                                                                                                                                    TextView textView18 = (TextView) yum0.f(viewF7, R.id.tvTaxExciseValue);
                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                        i4 = R.id.tvTaxFeeTitle;
                                                                                                                                                        TextView textView19 = (TextView) yum0.f(viewF7, R.id.tvTaxFeeTitle);
                                                                                                                                                        if (textView19 != null) {
                                                                                                                                                            i4 = R.id.tvTaxFeeValue;
                                                                                                                                                            TextView textView20 = (TextView) yum0.f(viewF7, R.id.tvTaxFeeValue);
                                                                                                                                                            if (textView20 != null) {
                                                                                                                                                                i4 = R.id.tvType;
                                                                                                                                                                TextView textView21 = (TextView) yum0.f(viewF7, R.id.tvType);
                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                    i4 = R.id.tvVatTaxTitle;
                                                                                                                                                                    TextView textView22 = (TextView) yum0.f(viewF7, R.id.tvVatTaxTitle);
                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                        i4 = R.id.tvVatTaxValue;
                                                                                                                                                                        TextView textView23 = (TextView) yum0.f(viewF7, R.id.tvVatTaxValue);
                                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                                            i4 = R.id.tvWinGrossTitle;
                                                                                                                                                                            TextView textView24 = (TextView) yum0.f(viewF7, R.id.tvWinGrossTitle);
                                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                                i4 = R.id.tvWinGrossValue;
                                                                                                                                                                                TextView textView25 = (TextView) yum0.f(viewF7, R.id.tvWinGrossValue);
                                                                                                                                                                                if (textView25 != null) {
                                                                                                                                                                                    i4 = R.id.vatTaxGroup;
                                                                                                                                                                                    Group group7 = (Group) yum0.f(viewF7, R.id.vatTaxGroup);
                                                                                                                                                                                    if (group7 != null) {
                                                                                                                                                                                        i4 = R.id.winGrossGroup;
                                                                                                                                                                                        Group group8 = (Group) yum0.f(viewF7, R.id.winGrossGroup);
                                                                                                                                                                                        if (group8 != null) {
                                                                                                                                                                                            return new pzv((MaterialCardView) viewF7, imageView2, group, textView, group2, imageView3, frameLayout, imageView4, frameLayout2, group3, textView2, textView3, group4, group5, group6, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, linearLayout, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, group7, group8);
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
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i4)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ViewGroup viewGroup14 = (ViewGroup) obj2;
                View viewF8 = rw2.f((LayoutInflater) obj, viewGroup14, R.layout.item_compact_line_menu_item, viewGroup14, false);
                if (viewF8 != null) {
                    DsMenuCompactCell dsMenuCompactCell3 = (DsMenuCompactCell) viewF8;
                    return new gtx(dsMenuCompactCell3, dsMenuCompactCell3);
                }
                hny.u("rootView");
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                LayoutInflater layoutInflater8 = (LayoutInflater) obj;
                ViewGroup viewGroup15 = (ViewGroup) obj2;
                layoutInflater8.getClass();
                viewGroup15.getClass();
                return itx.a(layoutInflater8, viewGroup15);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                LayoutInflater layoutInflater9 = (LayoutInflater) obj;
                ViewGroup viewGroup16 = (ViewGroup) obj2;
                layoutInflater9.getClass();
                viewGroup16.getClass();
                return itx.a(layoutInflater9, viewGroup16);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup17 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup17, R.layout.item_compact_menu_grid_decorate_menu_item, viewGroup17, false);
                if (viewF9 != null) {
                    DsMenuCompactCell dsMenuCompactCell4 = (DsMenuCompactCell) viewF9;
                    return new htx(dsMenuCompactCell4, dsMenuCompactCell4);
                }
                hny.u("rootView");
                return null;
            default:
                ViewGroup viewGroup18 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup18, R.layout.item_compact_menu_grid_decorate_menu_item, viewGroup18, false);
                if (viewF10 != null) {
                    DsMenuCompactCell dsMenuCompactCell5 = (DsMenuCompactCell) viewF10;
                    return new htx(dsMenuCompactCell5, dsMenuCompactCell5);
                }
                hny.u("rootView");
                return null;
        }
    }

    public /* synthetic */ sfc(int i, byte b) {
        this.f32112a = b;
    }
}
