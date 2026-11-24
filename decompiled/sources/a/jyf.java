package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.list_checkbox.DsListCheckBox;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jyf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17356a;

    public /* synthetic */ jyf(int i) {
        this.f17356a = (byte) 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List listJ;
        byte b = this.f17356a;
        int i = R.id.tvDate;
        int i2 = R.id.ivSecondTeam;
        switch (b) {
            case 0:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return Unit.f46060a;
            case 1:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                o2e.y(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                upj0 upj0Var = (upj0) obj2;
                ((azg0) obj).getClass();
                upj0Var.getClass();
                f3g f3gVar = upj0Var.f36068a;
                return (f3gVar == null || (listJ = q3d.j(f3gVar.f8861a.name(), Float.valueOf(f3gVar.b), Float.valueOf(f3gVar.c))) == null) ? iun.f15405a : listJ;
            case 4:
                g3g g3gVar = (g3g) obj2;
                ((oyg0) obj).getClass();
                g3gVar.getClass();
                return g3g.a(g3gVar, null, false, false, 7);
            case 5:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.cyber_calendar_day_item, viewGroup, false);
                int i3 = R.id.container;
                FrameLayout frameLayout = (FrameLayout) yum0.f(viewF, R.id.container);
                if (frameLayout != null) {
                    i3 = R.id.ivDiscipline;
                    ImageView imageView = (ImageView) yum0.f(viewF, R.id.ivDiscipline);
                    if (imageView != null) {
                        i3 = R.id.tournamentInfoContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewF, R.id.tournamentInfoContainer);
                        if (constraintLayout != null) {
                            i3 = R.id.tvTeamsSize;
                            TextView textView = (TextView) yum0.f(viewF, R.id.tvTeamsSize);
                            if (textView != null) {
                                i3 = R.id.tvTournamentDate;
                                TextView textView2 = (TextView) yum0.f(viewF, R.id.tvTournamentDate);
                                if (textView2 != null) {
                                    i3 = R.id.tvTournamentTitle;
                                    TextView textView3 = (TextView) yum0.f(viewF, R.id.tvTournamentTitle);
                                    if (textView3 != null) {
                                        return new p5g((LinearLayout) viewF, frameLayout, imageView, constraintLayout, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i3)));
                return null;
            case 6:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 7:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 8:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.cyber_calendar_disciplines_item, viewGroup2, false);
                int i4 = R.id.cbDiscipline;
                DsListCheckBox dsListCheckBox = (DsListCheckBox) yum0.f(viewF2, R.id.cbDiscipline);
                if (dsListCheckBox != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewF2;
                    i4 = R.id.ivDisciplineIcon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewF2, R.id.ivDisciplineIcon);
                    if (appCompatImageView != null) {
                        i4 = R.id.tvDisciplineName;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(viewF2, R.id.tvDisciplineName);
                        if (appCompatTextView != null) {
                            return new k7g(constraintLayout2, dsListCheckBox, constraintLayout2, appCompatImageView, appCompatTextView);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i4)));
                return null;
            case 9:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
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
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 13:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 14:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 15:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 16:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 17:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(188295921);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case 18:
                fet fetVar2 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar2.e0(193686807);
                xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
                fetVar2.r(false);
                return xczVarA2;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new vlf((byte) 17));
                function2.invoke(new jcg((byte) 11));
                return Unit.f46060a;
            case 20:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 21:
                fet fetVar3 = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar3.e0(422677799);
                xcz xczVarA3 = ddz.a(0, 0, fetVar3, 0, 3);
                fetVar3.r(false);
                return xczVarA3;
            case 22:
                fet fetVar4 = (fet) obj;
                ((Integer) obj2).getClass();
                fetVar4.e0(-1341705280);
                xcz xczVarB = ddz.b(new uwq(), fetVar4);
                fetVar4.r(false);
                return xczVarB;
            case 23:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup3.getClass();
                return zvx.a(layoutInflater, viewGroup3);
            case 24:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.cybergame_future_games_item, viewGroup4, false);
                ImageView imageView2 = (ImageView) yum0.f(viewF3, R.id.ivEnemyTeam);
                if (imageView2 != null) {
                    TextView textView4 = (TextView) yum0.f(viewF3, R.id.tvChampName);
                    if (textView4 != null) {
                        TextView textView5 = (TextView) yum0.f(viewF3, R.id.tvDate);
                        if (textView5 != null) {
                            i = R.id.tvEnemyTeam;
                            TextView textView6 = (TextView) yum0.f(viewF3, R.id.tvEnemyTeam);
                            if (textView6 != null) {
                                i = R.id.tvTime;
                                TextView textView7 = (TextView) yum0.f(viewF3, R.id.tvTime);
                                if (textView7 != null) {
                                    return new hth((ConstraintLayout) viewF3, imageView2, textView4, textView5, textView6, textView7);
                                }
                            }
                        }
                    } else {
                        i = R.id.tvChampName;
                    }
                } else {
                    i = R.id.ivEnemyTeam;
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                yog yogVar = (yog) obj2;
                ((azg0) obj).getClass();
                yogVar.getClass();
                return Float.valueOf(yogVar.b.l());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue = ((Integer) obj).intValue();
                a2n a2nVar = (a2n) obj2;
                a2nVar.getClass();
                sgy sgyVarB = sre0.f32672a.b(a2nVar.getClass());
                StringBuilder sb = new StringBuilder();
                sb.append(sgyVarB);
                sb.append(iIntValue);
                return sb.toString();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue2 = ((Integer) obj).intValue();
                a2n a2nVar2 = (a2n) obj2;
                a2nVar2.getClass();
                sgy sgyVarB2 = sre0.f32672a.b(a2nVar2.getClass());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sgyVarB2);
                sb2.append(iIntValue2);
                return sb2.toString();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.cybergame_head_to_head_last_matches_header, viewGroup5, false);
                ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF4, R.id.ivBackground);
                if (shapeableImageView != null) {
                    ImageView imageView3 = (ImageView) yum0.f(viewF4, R.id.ivFirstTeam);
                    if (imageView3 != null) {
                        ImageView imageView4 = (ImageView) yum0.f(viewF4, R.id.ivSecondTeam);
                        if (imageView4 != null) {
                            i2 = R.id.tvAdditionalTitle;
                            TextView textView8 = (TextView) yum0.f(viewF4, R.id.tvAdditionalTitle);
                            if (textView8 != null) {
                                i2 = R.id.tvFirstTeamWins;
                                TextView textView9 = (TextView) yum0.f(viewF4, R.id.tvFirstTeamWins);
                                if (textView9 != null) {
                                    i2 = R.id.tvSecondTeamWins;
                                    TextView textView10 = (TextView) yum0.f(viewF4, R.id.tvSecondTeamWins);
                                    if (textView10 != null) {
                                        return new ith((ConstraintLayout) viewF4, shapeableImageView, imageView3, imageView4, textView8, textView9, textView10);
                                    }
                                }
                            }
                        }
                    } else {
                        i2 = R.id.ivFirstTeam;
                    }
                } else {
                    i2 = R.id.ivBackground;
                }
                hny.u("Missing required view with ID: ".concat(viewF4.getResources().getResourceName(i2)));
                return null;
            default:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.cybergame_head_to_head_last_matches_item, viewGroup6, false);
                ImageView imageView5 = (ImageView) yum0.f(viewF5, R.id.ivFirstTeam);
                if (imageView5 != null) {
                    ImageView imageView6 = (ImageView) yum0.f(viewF5, R.id.ivSecondTeam);
                    if (imageView6 != null) {
                        TextView textView11 = (TextView) yum0.f(viewF5, R.id.tvChampName);
                        if (textView11 != null) {
                            TextView textView12 = (TextView) yum0.f(viewF5, R.id.tvDate);
                            if (textView12 != null) {
                                i = R.id.tvFirstTeamWin;
                                TextView textView13 = (TextView) yum0.f(viewF5, R.id.tvFirstTeamWin);
                                if (textView13 != null) {
                                    i = R.id.tvScore;
                                    TextView textView14 = (TextView) yum0.f(viewF5, R.id.tvScore);
                                    if (textView14 != null) {
                                        i = R.id.tvSecondTeamWin;
                                        TextView textView15 = (TextView) yum0.f(viewF5, R.id.tvSecondTeamWin);
                                        if (textView15 != null) {
                                            return new jth((ConstraintLayout) viewF5, imageView5, imageView6, textView11, textView12, textView13, textView14, textView15);
                                        }
                                    }
                                }
                            }
                        } else {
                            i = R.id.tvChampName;
                        }
                    } else {
                        i = R.id.ivSecondTeam;
                    }
                } else {
                    i = R.id.ivFirstTeam;
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i)));
                return null;
        }
    }

    public /* synthetic */ jyf(byte b) {
        this.f17356a = b;
    }
}
