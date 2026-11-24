package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.FootballEventsView;
import org.xplatform.statistic.stage.impl.stagetable.presentation.common.NonScrollableRecyclerView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jbp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16246a;

    public /* synthetic */ jbp(byte b) {
        this.f16246a = b;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0497 A[PHI: r1
  0x0497: PHI (r1v29 int) = (r1v28 int), (r1v32 int), (r1v33 int) binds: [B:138:0x0447, B:144:0x0468, B:146:0x0475] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:180:0x056d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149 A[PHI: r1
  0x0149: PHI (r1v86 int) = (r1v85 int), (r1v87 int), (r1v88 int), (r1v90 int) binds: [B:17:0x0095, B:19:0x00a1, B:21:0x00ad, B:25:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x023d A[PHI: r1
  0x023d: PHI (r1v68 int) = (r1v67 int), (r1v69 int) binds: [B:52:0x0174, B:54:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16246a;
        byte b2 = 17;
        int i = R.id.txtTime;
        int i2 = R.id.ivTeamTwoLogo;
        boolean z = true;
        switch (b) {
            case 0:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new e4p(b2));
                function2.invoke(new r4p((byte) 18));
                return Unit.f46060a;
            case 1:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 2:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 3:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 4:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new e4p((byte) 15));
                function4.invoke(new r4p((byte) 17));
                return Unit.f46060a;
            case 5:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 6:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new e4p((byte) 23));
                function6.invoke(new dfp((byte) 0));
                return Unit.f46060a;
            case 7:
                ((Integer) obj).intValue();
                zgp zgpVar = (zgp) obj2;
                zgpVar.getClass();
                return Integer.valueOf(zgpVar.f44355a);
            case 8:
                long jLongValue = ((Long) obj).longValue();
                rbb rbbVar = (rbb) obj2;
                rbbVar.getClass();
                List list = rbbVar.d;
                if (list.isEmpty()) {
                    if (rbbVar.f30176a != jLongValue) {
                        z = false;
                    }
                } else if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((sum0) it.next()).f32829a == jLongValue) {
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                Function1 function7 = (Function1) obj;
                Function1 function8 = (Function1) obj2;
                function7.getClass();
                function8.getClass();
                function7.invoke(new e4p((byte) 29));
                function8.invoke(new dfp((byte) 9));
                return Unit.f46060a;
            case 10:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 11:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 12:
                long jLongValue2 = ((Long) obj).longValue();
                jfl0 jfl0Var = (jfl0) obj2;
                jfl0Var.getClass();
                return Boolean.valueOf(jfl0Var.f16433a == jLongValue2);
            case 13:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(-634432909);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 14:
                Function1 function9 = (Function1) obj;
                Function1 function10 = (Function1) obj2;
                function9.getClass();
                function10.getClass();
                function9.invoke(new rnp((byte) 2));
                function10.invoke(new dfp((byte) 28));
                return Unit.f46060a;
            case 15:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.delegate_file_receive_message, viewGroup, false);
                LinearLayout linearLayout = (LinearLayout) yum0.f(viewF, R.id.containerFiles);
                if (linearLayout != null) {
                    int i3 = R.id.imgAvatar;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF, R.id.imgAvatar);
                    if (shapeableImageView == null) {
                        i = i3;
                    } else {
                        ImageView imageView = (ImageView) yum0.f(viewF, R.id.imgError);
                        if (imageView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewF, R.id.messageContainer);
                            if (constraintLayout != null) {
                                i3 = R.id.txtAuthorName;
                                TextView textView = (TextView) yum0.f(viewF, R.id.txtAuthorName);
                                if (textView != null) {
                                    i3 = R.id.txtBotLabel;
                                    TextView textView2 = (TextView) yum0.f(viewF, R.id.txtBotLabel);
                                    if (textView2 != null) {
                                        FixedSelectionTextView fixedSelectionTextView = (FixedSelectionTextView) yum0.f(viewF, R.id.txtMessage);
                                        if (fixedSelectionTextView != null) {
                                            TextView textView3 = (TextView) yum0.f(viewF, R.id.txtTime);
                                            if (textView3 != null) {
                                                return new z1k((ConstraintLayout) viewF, linearLayout, shapeableImageView, imageView, constraintLayout, textView, textView2, fixedSelectionTextView, textView3);
                                            }
                                        } else {
                                            i = R.id.txtMessage;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                } else {
                                    i = i3;
                                }
                            } else {
                                i = R.id.messageContainer;
                            }
                        } else {
                            i = R.id.imgError;
                        }
                    }
                } else {
                    i = R.id.containerFiles;
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i)));
                return null;
            case 16:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.delegate_file_send_message, viewGroup2, false);
                LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewF2, R.id.containerFiles);
                if (linearLayout2 != null) {
                    ImageView imageView2 = (ImageView) yum0.f(viewF2, R.id.imgError);
                    if (imageView2 != null) {
                        ImageView imageView3 = (ImageView) yum0.f(viewF2, R.id.imgStatus);
                        if (imageView3 != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewF2, R.id.messageContainer);
                            if (constraintLayout2 != null) {
                                FixedSelectionTextView fixedSelectionTextView2 = (FixedSelectionTextView) yum0.f(viewF2, R.id.txtMessage);
                                if (fixedSelectionTextView2 != null) {
                                    TextView textView4 = (TextView) yum0.f(viewF2, R.id.txtTime);
                                    if (textView4 != null) {
                                        return new a2k((ConstraintLayout) viewF2, linearLayout2, imageView2, imageView3, constraintLayout2, fixedSelectionTextView2, textView4);
                                    }
                                } else {
                                    i = R.id.txtMessage;
                                }
                            } else {
                                i = R.id.messageContainer;
                            }
                        } else {
                            i = R.id.imgStatus;
                        }
                    } else {
                        i = R.id.imgError;
                    }
                } else {
                    i = R.id.containerFiles;
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i)));
                return null;
            case 17:
                fhl fhlVar = (fhl) obj;
                nu90 nu90Var = (nu90) obj2;
                fhlVar.getClass();
                nu90Var.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(28.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fhlVar.d() >> 32)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))) / 2.0f)) & 4294967295L);
                pz40 pz40Var = s6t0.f31722a;
                long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                long jD = fhlVar.d();
                float fW1 = fhlVar.w0(16.0f);
                fhl.o0(fhlVar, backgroundContent, 0L, jD, (((long) Float.floatToRawIntBits(fW1)) << 32) | (((long) Float.floatToRawIntBits(fW1)) & 4294967295L), null, 242);
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).A(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
                    nu90Var.f24139a.e(fhlVar, jFloatToRawIntBits, nu90Var.b, new m78(s6t0.b().f33626a.getPrimary(), 5));
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVarA0, jP);
                }
            case 18:
                ((Integer) obj2).getClass();
                xbc.w(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                mrv.L(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                mrv.a0(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                mrv.G(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 23:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 24:
                return Boolean.valueOf(Intrinsics.d(obj, obj2));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup3.getClass();
                return owx.a(layoutInflater, viewGroup3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.item_card_football_period, viewGroup4, false);
                int i4 = R.id.bTotalScore;
                if (((Barrier) yum0.f(viewF3, R.id.bTotalScore)) != null) {
                    i4 = R.id.bTotalScoreDividers;
                    if (((Barrier) yum0.f(viewF3, R.id.bTotalScoreDividers)) != null) {
                        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF3, R.id.ivTeamOneLogo);
                        if (roundCornerImageView != null) {
                            RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) yum0.f(viewF3, R.id.ivTeamTwoLogo);
                            if (roundCornerImageView2 != null) {
                                i2 = R.id.rvPeriods;
                                RecyclerView recyclerView = (RecyclerView) yum0.f(viewF3, R.id.rvPeriods);
                                if (recyclerView != null) {
                                    i2 = R.id.tvPeriodsName;
                                    if (((TextView) yum0.f(viewF3, R.id.tvPeriodsName)) != null) {
                                        i2 = R.id.tvTeamOneName;
                                        TextView textView5 = (TextView) yum0.f(viewF3, R.id.tvTeamOneName);
                                        if (textView5 != null) {
                                            i2 = R.id.tvTeamOneTotalScore;
                                            TextView textView6 = (TextView) yum0.f(viewF3, R.id.tvTeamOneTotalScore);
                                            if (textView6 != null) {
                                                i2 = R.id.tvTeamTwoName;
                                                TextView textView7 = (TextView) yum0.f(viewF3, R.id.tvTeamTwoName);
                                                if (textView7 != null) {
                                                    i2 = R.id.tvTeamTwoTotalScore;
                                                    TextView textView8 = (TextView) yum0.f(viewF3, R.id.tvTeamTwoTotalScore);
                                                    if (textView8 != null) {
                                                        i2 = R.id.tvTotalScoreName;
                                                        if (((TextView) yum0.f(viewF3, R.id.tvTotalScoreName)) != null) {
                                                            i2 = R.id.vHeaderBackground;
                                                            View viewF4 = yum0.f(viewF3, R.id.vHeaderBackground);
                                                            if (viewF4 != null) {
                                                                i2 = R.id.vTeamOneFootballEvents;
                                                                FootballEventsView footballEventsView = (FootballEventsView) yum0.f(viewF3, R.id.vTeamOneFootballEvents);
                                                                if (footballEventsView != null) {
                                                                    i2 = R.id.vTeamOneTotalScoreDivider;
                                                                    View viewF5 = yum0.f(viewF3, R.id.vTeamOneTotalScoreDivider);
                                                                    if (viewF5 != null) {
                                                                        i2 = R.id.vTeamTwoFootballEvents;
                                                                        FootballEventsView footballEventsView2 = (FootballEventsView) yum0.f(viewF3, R.id.vTeamTwoFootballEvents);
                                                                        if (footballEventsView2 != null) {
                                                                            i2 = R.id.vTeamTwoTotalScoreDivider;
                                                                            View viewF6 = yum0.f(viewF3, R.id.vTeamTwoTotalScoreDivider);
                                                                            if (viewF6 != null) {
                                                                                i2 = R.id.vTeamsDivider;
                                                                                View viewF7 = yum0.f(viewF3, R.id.vTeamsDivider);
                                                                                if (viewF7 != null) {
                                                                                    i2 = R.id.vTotalScoreNameDivider;
                                                                                    View viewF8 = yum0.f(viewF3, R.id.vTotalScoreNameDivider);
                                                                                    if (viewF8 != null) {
                                                                                        return new qsx((ConstraintLayout) viewF3, roundCornerImageView, roundCornerImageView2, recyclerView, textView5, textView6, textView7, textView8, viewF4, footballEventsView, viewF5, footballEventsView2, viewF6, viewF7, viewF8);
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
                        } else {
                            i2 = R.id.ivTeamOneLogo;
                        }
                    } else {
                        i2 = i4;
                    }
                } else {
                    i2 = i4;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i2)));
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_football_active_zones, viewGroup5, false);
                int i5 = R.id.footballField;
                if (((ImageView) yum0.f(viewF9, R.id.footballField)) != null) {
                    i5 = R.id.ivFirstTeamFavorite;
                    ImageView imageView4 = (ImageView) yum0.f(viewF9, R.id.ivFirstTeamFavorite);
                    if (imageView4 != null) {
                        i5 = R.id.ivSecondTeamFavorite;
                        ImageView imageView5 = (ImageView) yum0.f(viewF9, R.id.ivSecondTeamFavorite);
                        if (imageView5 == null) {
                            i2 = i5;
                        } else {
                            RoundCornerImageView roundCornerImageView3 = (RoundCornerImageView) yum0.f(viewF9, R.id.ivTeamOneLogo);
                            if (roundCornerImageView3 != null) {
                                i5 = R.id.ivTeamOneLogoContainer;
                                if (((FrameLayout) yum0.f(viewF9, R.id.ivTeamOneLogoContainer)) != null) {
                                    RoundCornerImageView roundCornerImageView4 = (RoundCornerImageView) yum0.f(viewF9, R.id.ivTeamTwoLogo);
                                    if (roundCornerImageView4 != null) {
                                        i2 = R.id.ivTeamTwoLogoContainer;
                                        if (((FrameLayout) yum0.f(viewF9, R.id.ivTeamTwoLogoContainer)) != null) {
                                            i2 = R.id.tvActiveZonesTitle;
                                            if (((TextView) yum0.f(viewF9, R.id.tvActiveZonesTitle)) != null) {
                                                i2 = R.id.tvCentralActionZone;
                                                TextView textView9 = (TextView) yum0.f(viewF9, R.id.tvCentralActionZone);
                                                if (textView9 != null) {
                                                    i2 = R.id.tvFirstTeamName;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(viewF9, R.id.tvFirstTeamName);
                                                    if (appCompatTextView != null) {
                                                        i2 = R.id.tvLeftActionZone;
                                                        TextView textView10 = (TextView) yum0.f(viewF9, R.id.tvLeftActionZone);
                                                        if (textView10 != null) {
                                                            i2 = R.id.tvMatchPeriodInfo;
                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(viewF9, R.id.tvMatchPeriodInfo);
                                                            if (appCompatTextView2 != null) {
                                                                i2 = R.id.tvRightActionZone;
                                                                TextView textView11 = (TextView) yum0.f(viewF9, R.id.tvRightActionZone);
                                                                if (textView11 != null) {
                                                                    i2 = R.id.tvScore;
                                                                    TextView textView12 = (TextView) yum0.f(viewF9, R.id.tvScore);
                                                                    if (textView12 != null) {
                                                                        i2 = R.id.tvSecondTeamName;
                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) yum0.f(viewF9, R.id.tvSecondTeamName);
                                                                        if (appCompatTextView3 != null) {
                                                                            return new nux((ConstraintLayout) viewF9, imageView4, imageView5, roundCornerImageView3, roundCornerImageView4, textView9, appCompatTextView, textView10, appCompatTextView2, textView11, textView12, appCompatTextView3);
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
                                } else {
                                    i2 = i5;
                                }
                            } else {
                                i2 = R.id.ivTeamOneLogo;
                            }
                        }
                    } else {
                        i2 = i5;
                    }
                } else {
                    i2 = i5;
                }
                hny.u("Missing required view with ID: ".concat(viewF9.getResources().getResourceName(i2)));
                return null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF10 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.vh_footer_list_view, viewGroup6, false);
                if (viewF10 != null) {
                    return new vcu0((NonScrollableRecyclerView) viewF10);
                }
                hny.u("rootView");
                return null;
            default:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF11 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.vh_footer_item, viewGroup7, false);
                int i6 = R.id.colorIndicator;
                View viewF12 = yum0.f(viewF11, R.id.colorIndicator);
                if (viewF12 != null) {
                    i6 = R.id.tvFooterTitle;
                    TextView textView13 = (TextView) yum0.f(viewF11, R.id.tvFooterTitle);
                    if (textView13 != null) {
                        return new ucu0((LinearLayout) viewF11, viewF12, textView13);
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF11.getResources().getResourceName(i6)));
                return null;
        }
    }

    public /* synthetic */ jbp(int i, byte b) {
        this.f16246a = b;
    }
}
