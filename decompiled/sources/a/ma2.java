package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21440a;

    public /* synthetic */ ma2(byte b) {
        this.f21440a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = 12;
        byte b2 = 3;
        int i = 0;
        switch (this.f21440a) {
            case 0:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(-1426129468);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 1:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new dj1((byte) 29));
                function2.invoke(new t32(b2));
                return Unit.f46060a;
            case 2:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).printStackTrace();
                return Unit.f46060a;
            case 4:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(-1958003230);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case 5:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new xd2((byte) 2));
                function4.invoke(new t32((byte) 5));
                return Unit.f46060a;
            case 6:
                ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 7:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new xd2((byte) 3));
                function6.invoke(new t32((byte) 7));
                return Unit.f46060a;
            case 8:
                Function1 function7 = (Function1) obj;
                Function1 function8 = (Function1) obj2;
                function7.getClass();
                function8.getClass();
                function7.invoke(new xd2((byte) 4));
                function8.invoke(new t32((byte) 8));
                return Unit.f46060a;
            case 9:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 10:
                return Integer.valueOf(((xcp) obj).c.compareTo(((xcp) obj2).c));
            case 11:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 12:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 13:
                int iIntValue = ((Integer) obj).intValue();
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var2.getClass();
                return rz4.h(iIntValue, p6t0Var2.getKey());
            case 14:
                Function1 function9 = (Function1) obj;
                Function1 function10 = (Function1) obj2;
                function9.getClass();
                function10.getClass();
                function9.invoke(new xd2((byte) 12));
                function10.invoke(new t32((byte) 10));
                return Unit.f46060a;
            case 15:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 16:
                on2 on2Var = (on2) obj2;
                ((x8z) obj).getClass();
                on2Var.getClass();
                return new pgv(q8x.e(on2Var.a()));
            case 17:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 18:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Function1 function11 = (Function1) obj;
                Function1 function12 = (Function1) obj2;
                function11.getClass();
                function12.getClass();
                function11.invoke(new xd2((byte) 16));
                function12.invoke(new t32(b));
                return Unit.f46060a;
            case 20:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.history_alternative_info_item, viewGroup, false);
                int i2 = R.id.containerOppNumberOne;
                FrameLayout frameLayout = (FrameLayout) yum0.f(viewF, R.id.containerOppNumberOne);
                if (frameLayout != null) {
                    i2 = R.id.containerOppNumberTwo;
                    FrameLayout frameLayout2 = (FrameLayout) yum0.f(viewF, R.id.containerOppNumberTwo);
                    if (frameLayout2 != null) {
                        i2 = R.id.ivChamp;
                        ImageView imageView = (ImageView) yum0.f(viewF, R.id.ivChamp);
                        if (imageView != null) {
                            i2 = R.id.ivFirstTeam;
                            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF, R.id.ivFirstTeam);
                            if (roundCornerImageView != null) {
                                i2 = R.id.ivSecondTeam;
                                RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF, R.id.ivSecondTeam);
                                if (roundCornerImageView2 != null) {
                                    i2 = R.id.lineTwo;
                                    if (((Guideline) yum0.f(viewF, R.id.lineTwo)) != null) {
                                        i2 = R.id.tvChampName;
                                        TextView textView = (TextView) yum0.f(viewF, R.id.tvChampName);
                                        if (textView != null) {
                                            i2 = R.id.tvFirstTeamName;
                                            TextView textView2 = (TextView) yum0.f(viewF, R.id.tvFirstTeamName);
                                            if (textView2 != null) {
                                                i2 = R.id.tvOppNumberFirst;
                                                TextView textView3 = (TextView) yum0.f(viewF, R.id.tvOppNumberFirst);
                                                if (textView3 != null) {
                                                    i2 = R.id.tvOppNumberSecond;
                                                    TextView textView4 = (TextView) yum0.f(viewF, R.id.tvOppNumberSecond);
                                                    if (textView4 != null) {
                                                        i2 = R.id.tvScore;
                                                        TextView textView5 = (TextView) yum0.f(viewF, R.id.tvScore);
                                                        if (textView5 != null) {
                                                            i2 = R.id.tvSecondTeamName;
                                                            TextView textView6 = (TextView) yum0.f(viewF, R.id.tvSecondTeamName);
                                                            if (textView6 != null) {
                                                                i2 = R.id.tvTimeInfo;
                                                                TextView textView7 = (TextView) yum0.f(viewF, R.id.tvTimeInfo);
                                                                if (textView7 != null) {
                                                                    return new xyv((ConstraintLayout) viewF, frameLayout, frameLayout2, imageView, roundCornerImageView, roundCornerImageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                return null;
            case 21:
                dwi0.O((e7z) obj).setDensity((w6k) obj2);
                return Unit.f46060a;
            case 22:
                dwi0.O((e7z) obj).setLifecycleOwner((clz) obj2);
                return Unit.f46060a;
            case 23:
                dwi0.O((e7z) obj).setSavedStateRegistryOwner((i0h0) obj2);
                return Unit.f46060a;
            case 24:
                bhu0 bhu0VarO = dwi0.O((e7z) obj);
                int iOrdinal = ((k6z) obj2).ordinal();
                if (iOrdinal != 0) {
                    i = 1;
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                }
                bhu0VarO.setLayoutDirection(i);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                dwi0.O((e7z) obj).setResetBlock((Function1) obj2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dwi0.O((e7z) obj).setUpdateBlock((Function1) obj2);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                dwi0.O((e7z) obj).setReleaseBlock((Function1) obj2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                dwi0.O((e7z) obj).setUpdateBlock((Function1) obj2);
                return Unit.f46060a;
            default:
                dwi0.O((e7z) obj).setReleaseBlock((Function1) obj2);
                return Unit.f46060a;
        }
    }
}
