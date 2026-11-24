package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightDragAndDropAndButton;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gcl0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11069a;

    public /* synthetic */ gcl0(byte b) {
        this.f11069a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = 1;
        switch (this.f11069a) {
            case 0:
                return Unit.f46060a;
            case 1:
                return Unit.f46060a;
            case 2:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.my_special_event_sport_game_filter_selection_item, viewGroup, false);
                int i = R.id.cellLeft;
                SportCellLeftView sportCellLeftView = (SportCellLeftView) yum0.f(viewF, R.id.cellLeft);
                if (sportCellLeftView != null) {
                    i = R.id.cellMiddle;
                    SportCellMiddleView sportCellMiddleView = (SportCellMiddleView) yum0.f(viewF, R.id.cellMiddle);
                    if (sportCellMiddleView != null) {
                        i = R.id.cellRight;
                        SportCellRightView sportCellRightView = (SportCellRightView) yum0.f(viewF, R.id.cellRight);
                        if (sportCellRightView != null) {
                            return new t850((DsSportCell) viewF, sportCellLeftView, sportCellMiddleView, sportCellRightView);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 3:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                a2n a2nVar = (a2n) obj2;
                a2nVar.getClass();
                if (a2nVar instanceof q56) {
                    return Long.valueOf(((q56) a2nVar).a());
                }
                if (a2nVar instanceof w56) {
                    return Long.valueOf(((w56) a2nVar).a());
                }
                if (a2nVar instanceof v1o0) {
                    return Long.valueOf(((v1o0) a2nVar).a());
                }
                if (a2nVar instanceof b2o0) {
                    return Long.valueOf(((b2o0) a2nVar).a());
                }
                StringBuilder sb = new StringBuilder();
                sb.append(a2nVar);
                sb.append(iIntValue);
                return sb.toString();
            case 5:
                int iIntValue2 = ((Integer) obj).intValue();
                a2n a2nVar2 = (a2n) obj2;
                a2nVar2.getClass();
                if (a2nVar2 instanceof q56) {
                    return Long.valueOf(((q56) a2nVar2).a());
                }
                if (a2nVar2 instanceof w56) {
                    return Long.valueOf(((w56) a2nVar2).a());
                }
                if (a2nVar2 instanceof v1o0) {
                    return Long.valueOf(((v1o0) a2nVar2).a());
                }
                if (a2nVar2 instanceof b2o0) {
                    return Long.valueOf(((b2o0) a2nVar2).a());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a2nVar2);
                sb2.append(iIntValue2);
                return sb2.toString();
            case 6:
                ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 7:
                ((Integer) obj).intValue();
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var2.getClass();
                return p6t0Var2.getKey();
            case 8:
                ((Integer) obj).intValue();
                p6t0 p6t0Var3 = (p6t0) obj2;
                p6t0Var3.getClass();
                return p6t0Var3.getKey();
            case 9:
                ((Integer) obj).intValue();
                p6t0 p6t0Var4 = (p6t0) obj2;
                p6t0Var4.getClass();
                return p6t0Var4.getKey();
            case 10:
                ((Integer) obj).intValue();
                p6t0 p6t0Var5 = (p6t0) obj2;
                p6t0Var5.getClass();
                return p6t0Var5.getKey();
            case 11:
                ((Integer) obj2).intValue();
                ((mxl) obj).getClass();
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).intValue();
                ((mxl) obj).getClass();
                return Unit.f46060a;
            case 13:
                ((Integer) obj).intValue();
                p6t0 p6t0Var6 = (p6t0) obj2;
                p6t0Var6.getClass();
                return p6t0Var6.getKey();
            case 14:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new f8l0(b));
                function2.invoke(new fzk0((byte) 13));
                return Unit.f46060a;
            case 15:
                ((Integer) obj).intValue();
                msl0 msl0Var = (msl0) obj2;
                msl0Var.getClass();
                return Long.valueOf(msl0Var.f22327a);
            case 16:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.app_start_sportsman_item, viewGroup2, false);
                if (viewF2 != null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) viewF2;
                    return new ih3(appCompatImageView, appCompatImageView);
                }
                hny.u("rootView");
                return null;
            case 17:
                fhl fhlVar = (fhl) obj;
                nu90 nu90Var = (nu90) obj2;
                fhlVar.getClass();
                nu90Var.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(88.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) / 2.0f;
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).A(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                    pm80 pm80Var = nu90Var.f24139a;
                    float f = nu90Var.b;
                    pz40 pz40Var = s6t0.f31722a;
                    pm80Var.e(fhlVar, jFloatToRawIntBits, f, new m78(s6t0.b().f33626a.getSecondary60(), 5));
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVarA0, jP);
                }
            case 18:
                ((Integer) obj).getClass();
                a9x a9xVar = (a9x) obj2;
                a9xVar.getClass();
                return a9xVar.f497a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj).getClass();
                ojc ojcVar = (ojc) obj2;
                ojcVar.getClass();
                return ojcVar.f25351a;
            case 20:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_card_stadium, viewGroup3, false);
                ConstraintLayout constraintLayout = (ConstraintLayout) viewF3;
                int i2 = R.id.ivFullScreen;
                ImageView imageView = (ImageView) yum0.f(viewF3, R.id.ivFullScreen);
                if (imageView != null) {
                    i2 = R.id.ivMain;
                    RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF3, R.id.ivMain);
                    if (roundCornerImageView != null) {
                        i2 = R.id.ivMainPlaceholder;
                        ImageView imageView2 = (ImageView) yum0.f(viewF3, R.id.ivMainPlaceholder);
                        if (imageView2 != null) {
                            i2 = R.id.ivOne;
                            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF3, R.id.ivOne);
                            if (roundCornerImageView2 != null) {
                                i2 = R.id.ivOnePlaceholder;
                                ImageView imageView3 = (ImageView) yum0.f(viewF3, R.id.ivOnePlaceholder);
                                if (imageView3 != null) {
                                    i2 = R.id.ivThree;
                                    RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) yum0.f(viewF3, R.id.ivThree);
                                    if (roundCornerImageView3 != null) {
                                        i2 = R.id.ivThreePlaceholder;
                                        ImageView imageView4 = (ImageView) yum0.f(viewF3, R.id.ivThreePlaceholder);
                                        if (imageView4 != null) {
                                            i2 = R.id.ivTwo;
                                            RoundCornerImageView roundCornerImageView4 = (RoundCornerImageView) yum0.f(viewF3, R.id.ivTwo);
                                            if (roundCornerImageView4 != null) {
                                                i2 = R.id.ivTwoPlaceholder;
                                                ImageView imageView5 = (ImageView) yum0.f(viewF3, R.id.ivTwoPlaceholder);
                                                if (imageView5 != null) {
                                                    i2 = R.id.recyclerView;
                                                    RecyclerView recyclerView = (RecyclerView) yum0.f(viewF3, R.id.recyclerView);
                                                    if (recyclerView != null) {
                                                        i2 = R.id.tvImageCount;
                                                        TextView textView = (TextView) yum0.f(viewF3, R.id.tvImageCount);
                                                        if (textView != null) {
                                                            return new xsx(constraintLayout, imageView, roundCornerImageView, imageView2, roundCornerImageView2, imageView3, roundCornerImageView3, imageView4, roundCornerImageView4, imageView5, recyclerView, textView);
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
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i2)));
                return null;
            case 21:
                ((Integer) obj).intValue();
                pwl0 pwl0Var = (pwl0) obj2;
                pwl0Var.getClass();
                return pwl0Var.f27716a;
            case 22:
                ((Integer) obj).intValue();
                swl0 swl0Var = (swl0) obj2;
                swl0Var.getClass();
                return swl0Var.f32927a;
            case 23:
                ((Integer) obj2).getClass();
                q5x.y(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 24:
                txl0 txl0Var = (txl0) obj2;
                ((oyg0) obj).getClass();
                txl0Var.getClass();
                return txl0.a(txl0Var, false, false, null, null, 8);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                txl0 txl0Var2 = (txl0) obj2;
                ((oyg0) obj).getClass();
                txl0Var2.getClass();
                return txl0.a(txl0Var2, false, true, null, null, 12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wwv0 wwv0Var = (wwv0) obj;
                wwv0Var.getClass();
                ((d0m0) obj2).getClass();
                wwv0Var.c.c = ltv0.f20644a;
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                wha0.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                l1m0 l1m0Var = (l1m0) obj2;
                ((oyg0) obj).getClass();
                l1m0Var.getClass();
                return l1m0.a(l1m0Var, false, true, null, null, null, null, null, 249);
            default:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.statistic_block_item, viewGroup4, false);
                int i3 = R.id.rightCellBlock;
                DsCellRightDragAndDropAndButton dsCellRightDragAndDropAndButton = (DsCellRightDragAndDropAndButton) yum0.f(viewF4, R.id.rightCellBlock);
                if (dsCellRightDragAndDropAndButton != null) {
                    DsSettingsCell dsSettingsCell = (DsSettingsCell) viewF4;
                    DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF4, R.id.title);
                    if (dsCellMiddleTitle != null) {
                        return new v9m0(dsSettingsCell, dsCellRightDragAndDropAndButton, dsSettingsCell, dsCellMiddleTitle);
                    }
                    i3 = R.id.title;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i3)));
                return null;
        }
    }

    public /* synthetic */ gcl0(int i, byte b) {
        this.f11069a = b;
    }
}
