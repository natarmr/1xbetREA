package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.presentation.team_statistic.view.TeamStatisticView;
import org.xplatform.tile_matching.presentation.views.TileMatchingGameFieldView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zgp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44356a;

    public /* synthetic */ zgp0(byte b) {
        this.f44356a = b;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
  0x00db: PHI (r1v83 int) = (r1v82 int), (r1v84 int) binds: [B:32:0x00a4, B:34:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0180 A[PHI: r1
  0x0180: PHI (r1v70 int) = (r1v69 int), (r1v71 int), (r1v73 int), (r1v74 int), (r1v75 int), (r1v76 int), (r1v78 int) binds: [B:48:0x0103, B:50:0x010f, B:54:0x0124, B:56:0x0130, B:58:0x013d, B:60:0x014a, B:64:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44356a;
        int i = R.id.txtTime;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                uc9.E(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                u4n0.g(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                ny9.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.dota_team_statistic_item_view, viewGroup, false);
                if (viewF != null) {
                    TeamStatisticView teamStatisticView = (TeamStatisticView) viewF;
                    return new eal(teamStatisticView, teamStatisticView);
                }
                hny.u("rootView");
                return null;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                ((zhs0) obj2).getClass();
                sgy sgyVarB = sre0.f32672a.b(zhs0.class);
                StringBuilder sb = new StringBuilder();
                sb.append(sgyVarB);
                sb.append(iIntValue);
                return sb.toString();
            case 6:
                ((Integer) obj2).getClass();
                p8a.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                return Unit.f46060a;
            case 8:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF2 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.delegate_selector_team, viewGroup2, false);
                int i2 = R.id.cellLeft;
                SportCellLeftView sportCellLeftView = (SportCellLeftView) yum0.f(viewF2, R.id.cellLeft);
                if (sportCellLeftView != null) {
                    i2 = R.id.cellMiddle;
                    SportCellMiddleView sportCellMiddleView = (SportCellMiddleView) yum0.f(viewF2, R.id.cellMiddle);
                    if (sportCellMiddleView != null) {
                        i2 = R.id.cellRight;
                        SportCellRightView sportCellRightView = (SportCellRightView) yum0.f(viewF2, R.id.cellRight);
                        if (sportCellRightView != null) {
                            return new a3k((DsSportCell) viewF2, sportCellLeftView, sportCellMiddleView, sportCellRightView);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                return null;
            case 9:
                ((Integer) obj2).getClass();
                ofm0.b(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 10:
                return Unit.f46060a;
            case 11:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.bet_constructor_item_teams_header, viewGroup3, false);
                int i3 = R.id.guideline;
                if (((Guideline) yum0.f(viewF3, R.id.guideline)) != null) {
                    i3 = R.id.ivExpand;
                    ImageView imageView = (ImageView) yum0.f(viewF3, R.id.ivExpand);
                    if (imageView != null) {
                        i3 = R.id.ivFirstTeam;
                        if (((ImageView) yum0.f(viewF3, R.id.ivFirstTeam)) != null) {
                            i3 = R.id.ivSecondTeam;
                            if (((ImageView) yum0.f(viewF3, R.id.ivSecondTeam)) != null) {
                                i3 = R.id.toggleView;
                                View viewF4 = yum0.f(viewF3, R.id.toggleView);
                                if (viewF4 != null) {
                                    i3 = R.id.tvFirstTeamTitle;
                                    if (((TextView) yum0.f(viewF3, R.id.tvFirstTeamTitle)) != null) {
                                        i3 = R.id.tvSecondTeamTitle;
                                        if (((TextView) yum0.f(viewF3, R.id.tvSecondTeamTitle)) != null) {
                                            return new es6((ConstraintLayout) viewF3, imageView, viewF4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF3.getResources().getResourceName(i3)));
                return null;
            case 12:
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup4, R.layout.bet_constructor_item_teams_players_content, viewGroup4, false);
                int i4 = R.id.llTeamsGroup;
                if (((LinearLayout) yum0.f(viewF5, R.id.llTeamsGroup)) != null) {
                    i4 = R.id.rvFirstTeamPlayers;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(viewF5, R.id.rvFirstTeamPlayers);
                    if (recyclerView != null) {
                        i4 = R.id.rvSecondTeamPlayers;
                        RecyclerView recyclerView2 = (RecyclerView) yum0.f(viewF5, R.id.rvSecondTeamPlayers);
                        if (recyclerView2 != null) {
                            return new fs6((ConstraintLayout) viewF5, recyclerView, recyclerView2);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i4)));
                return null;
            case 13:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 14:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                q8a.t(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 16:
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                osm0.b(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 18:
                fzp0 fzp0Var = (fzp0) obj2;
                ((oyg0) obj).getClass();
                fzp0Var.getClass();
                return fzp0.a(fzp0Var, false, true, false, null, false, null, 124);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                tke.D(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 20:
                s3q0 s3q0Var = (s3q0) obj2;
                ((oyg0) obj).getClass();
                s3q0Var.getClass();
                return s3q0.a(s3q0Var, false, false, true, 0, null, null, null, 121);
            case 21:
                d7q0 d7q0Var = (d7q0) obj2;
                return q3d.j(Float.valueOf(d7q0Var.f5606a.l()), Boolean.valueOf(((ma80) ((hgk0) d7q0Var.f).getValue()) == ma80.f21447a));
            case 22:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.input_text_item, viewGroup5, false);
                if (viewF6 != null) {
                    DsTextField dsTextField = (DsTextField) viewF6;
                    return new ifx(dsTextField, dsTextField);
                }
                hny.u("rootView");
                return null;
            case 23:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.delegate_text_receive_message, viewGroup6, false);
                int i5 = R.id.buttonGroup;
                LinearLayout linearLayout = (LinearLayout) yum0.f(viewF7, R.id.buttonGroup);
                if (linearLayout != null) {
                    i5 = R.id.imgAvatar;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF7, R.id.imgAvatar);
                    if (shapeableImageView == null) {
                        i = i5;
                    } else {
                        ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewF7, R.id.messageContainer);
                        if (constraintLayout != null) {
                            i5 = R.id.replyContainer;
                            FrameLayout frameLayout = (FrameLayout) yum0.f(viewF7, R.id.replyContainer);
                            if (frameLayout != null) {
                                i5 = R.id.replyGroup;
                                Group group = (Group) yum0.f(viewF7, R.id.replyGroup);
                                if (group != null) {
                                    i5 = R.id.txtAuthorName;
                                    TextView textView = (TextView) yum0.f(viewF7, R.id.txtAuthorName);
                                    if (textView != null) {
                                        i5 = R.id.txtBotLabel;
                                        TextView textView2 = (TextView) yum0.f(viewF7, R.id.txtBotLabel);
                                        if (textView2 == null) {
                                            i = i5;
                                        } else {
                                            FixedSelectionTextView fixedSelectionTextView = (FixedSelectionTextView) yum0.f(viewF7, R.id.txtMessage);
                                            if (fixedSelectionTextView != null) {
                                                i5 = R.id.txtRows;
                                                TextView textView3 = (TextView) yum0.f(viewF7, R.id.txtRows);
                                                if (textView3 != null) {
                                                    TextView textView4 = (TextView) yum0.f(viewF7, R.id.txtTime);
                                                    if (textView4 != null) {
                                                        i = R.id.viewReplySeparator;
                                                        View viewF8 = yum0.f(viewF7, R.id.viewReplySeparator);
                                                        if (viewF8 != null) {
                                                            return new c3k((LinearLayout) viewF7, linearLayout, shapeableImageView, constraintLayout, frameLayout, group, textView, textView2, fixedSelectionTextView, textView3, textView4, viewF8);
                                                        }
                                                    }
                                                } else {
                                                    i = i5;
                                                }
                                            } else {
                                                i = R.id.txtMessage;
                                            }
                                        }
                                    } else {
                                        i = i5;
                                    }
                                } else {
                                    i = i5;
                                }
                            } else {
                                i = i5;
                            }
                        } else {
                            i = R.id.messageContainer;
                        }
                    }
                } else {
                    i = i5;
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i)));
                return null;
            case 24:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF9 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.delegate_text_send_message, viewGroup7, false);
                int i6 = R.id.imgError;
                ImageView imageView2 = (ImageView) yum0.f(viewF9, R.id.imgError);
                if (imageView2 != null) {
                    i6 = R.id.imgStatus;
                    ImageView imageView3 = (ImageView) yum0.f(viewF9, R.id.imgStatus);
                    if (imageView3 != null) {
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewF9, R.id.messageContainer);
                        if (constraintLayout2 != null) {
                            FixedSelectionTextView fixedSelectionTextView2 = (FixedSelectionTextView) yum0.f(viewF9, R.id.txtMessage);
                            if (fixedSelectionTextView2 != null) {
                                TextView textView5 = (TextView) yum0.f(viewF9, R.id.txtTime);
                                if (textView5 != null) {
                                    return new d3k((LinearLayout) viewF9, imageView2, imageView3, constraintLayout2, fixedSelectionTextView2, textView5);
                                }
                            } else {
                                i = R.id.txtMessage;
                            }
                        } else {
                            i = R.id.messageContainer;
                        }
                    } else {
                        i = i6;
                    }
                } else {
                    i = i6;
                }
                hny.u("Missing required view with ID: ".concat(viewF9.getResources().getResourceName(i)));
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof dcq0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue2 = num != null ? num.intValue() : 1;
                return iIntValue2 == 0 ? element : Integer.valueOf(iIntValue2 + 1);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dcq0 dcq0Var = (dcq0) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                if (dcq0Var != null) {
                    return dcq0Var;
                }
                if (element2 instanceof dcq0) {
                    return (dcq0) element2;
                }
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lcq0 lcq0Var = (lcq0) obj;
                CoroutineContext.Element element3 = (CoroutineContext.Element) obj2;
                if (element3 instanceof dcq0) {
                    dcq0 dcq0Var2 = (dcq0) element3;
                    CoroutineContext coroutineContext = lcq0Var.f19812a;
                    Object objN = dcq0Var2.n();
                    Object[] objArr = lcq0Var.b;
                    int i7 = lcq0Var.d;
                    objArr[i7] = objN;
                    dcq0[] dcq0VarArr = lcq0Var.c;
                    lcq0Var.d = i7 + 1;
                    dcq0VarArr[i7] = dcq0Var2;
                }
                return lcq0Var;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                int i8 = TileMatchingGameFieldView.h;
                return Unit.f46060a;
            default:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ zgp0(int i, byte b) {
        this.f44356a = b;
    }
}
