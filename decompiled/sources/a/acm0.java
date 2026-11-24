package a;

import android.gov.nist.core.Separators;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;
import org.xplatform.ui_core.viewcomponents.views.SwipeBackLayout;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightCounter;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class acm0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f635a;

    public /* synthetic */ acm0(int i) {
        this.f635a = (byte) 6;
    }

    /* JADX WARN: Code duplicated, block: B:513:0x0ba8 A[PHI: r2
  0x0ba8: PHI (r2v29 int) = (r2v0 int), (r2v35 int), (r2v38 int), (r2v40 int), (r2v43 int) binds: [B:451:0x0a48, B:477:0x0acd, B:481:0x0ae3, B:485:0x0afd, B:489:0x0b13] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        evq0 evq0Var;
        byte b = this.f635a;
        int i = R.id.champLabel;
        int i2 = R.id.cardGradient;
        byte b2 = 0;
        switch (b) {
            case 0:
                ((Integer) obj).getClass();
                tdb tdbVar = (tdb) obj2;
                tdbVar.getClass();
                return tdbVar.f33760a;
            case 1:
                ViewGroup viewGroup = (ViewGroup) obj2;
                View viewF = rw2.f((LayoutInflater) obj, viewGroup, R.layout.cybergames_item_stock_banner, viewGroup, false);
                int i3 = R.id.fireBadge;
                View viewF2 = yum0.f(viewF, R.id.fireBadge);
                if (viewF2 != null) {
                    if (((ImageView) yum0.f(viewF2, R.id.ivStartIcon)) == null) {
                        hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(R.id.ivStartIcon)));
                        return null;
                    }
                    auh auhVar = new auh((FrameLayout) viewF2, (byte) 0);
                    i3 = R.id.ivBanner;
                    RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewF, R.id.ivBanner);
                    if (roundCornerImageView != null) {
                        i3 = R.id.tvSubtitle;
                        TextView textView = (TextView) yum0.f(viewF, R.id.tvSubtitle);
                        if (textView != null) {
                            i3 = R.id.tvTitle;
                            TextView textView2 = (TextView) yum0.f(viewF, R.id.tvTitle);
                            if (textView2 != null) {
                                return new zth((ConstraintLayout) viewF, auhVar, roundCornerImageView, textView, textView2);
                            }
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i3)));
                return null;
            case 2:
                ViewGroup viewGroup2 = (ViewGroup) obj2;
                View viewF3 = rw2.f((LayoutInflater) obj, viewGroup2, R.layout.item_sub_game_filter, viewGroup2, false);
                if (viewF3 != null) {
                    TextView textView3 = (TextView) viewF3;
                    return new iyx(textView3, textView3);
                }
                hny.u("rootView");
                return null;
            case 3:
                ((Integer) obj).intValue();
                mxm0 mxm0Var = (mxm0) obj2;
                mxm0Var.getClass();
                return Long.valueOf(mxm0Var.f22563a);
            case 4:
                Function1 function1 = (Function1) obj;
                Function1 function2 = (Function1) obj2;
                function1.getClass();
                function2.getClass();
                function1.invoke(new f8l0((byte) 28));
                function2.invoke(new a7n0((byte) 10));
                return Unit.f46060a;
            case 5:
                Function1 function3 = (Function1) obj;
                Function1 function4 = (Function1) obj2;
                function3.getClass();
                function4.getClass();
                function3.invoke(new f8l0((byte) 29));
                function4.invoke(new a7n0((byte) 13));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                cem0.f(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 7:
                ViewGroup viewGroup3 = (ViewGroup) obj2;
                View viewF4 = rw2.f((LayoutInflater) obj, viewGroup3, R.layout.item_support_menu_compact, viewGroup3, false);
                if (viewF4 != null) {
                    DsMenuCompactCell dsMenuCompactCell = (DsMenuCompactCell) viewF4;
                    return new kyx(dsMenuCompactCell, dsMenuCompactCell);
                }
                hny.u("rootView");
                return null;
            case 8:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup4 = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup4.getClass();
                return itx.a(layoutInflater, viewGroup4);
            case 9:
                ViewGroup viewGroup5 = (ViewGroup) obj2;
                View viewF5 = rw2.f((LayoutInflater) obj, viewGroup5, R.layout.item_menu_cell_support, viewGroup5, false);
                DsMenuCell dsMenuCell = (DsMenuCell) viewF5;
                int i4 = R.id.counter;
                DsCellRightCounter dsCellRightCounter = (DsCellRightCounter) yum0.f(viewF5, R.id.counter);
                if (dsCellRightCounter != null) {
                    i4 = R.id.icon;
                    DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewF5, R.id.icon);
                    if (dsCellLeftIcon != null) {
                        i4 = R.id.title;
                        DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewF5, R.id.title);
                        if (dsCellMiddleTitle != null) {
                            return new kwx(dsMenuCell, dsCellRightCounter, dsCellLeftIcon, dsCellMiddleTitle);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF5.getResources().getResourceName(i4)));
                return null;
            case 10:
                ViewGroup viewGroup6 = (ViewGroup) obj2;
                View viewF6 = rw2.f((LayoutInflater) obj, viewGroup6, R.layout.item_support_menu, viewGroup6, false);
                DsMenuCell dsMenuCell2 = (DsMenuCell) viewF6;
                int i5 = R.id.counter;
                DsCellRightCounter dsCellRightCounter2 = (DsCellRightCounter) yum0.f(viewF6, R.id.counter);
                if (dsCellRightCounter2 != null) {
                    i5 = R.id.icon;
                    DsCellLeftIcon dsCellLeftIcon2 = (DsCellLeftIcon) yum0.f(viewF6, R.id.icon);
                    if (dsCellLeftIcon2 != null) {
                        i5 = R.id.title;
                        DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) yum0.f(viewF6, R.id.title);
                        if (dsCellMiddleTitle2 != null) {
                            return new jyx(dsMenuCell2, dsCellRightCounter2, dsCellLeftIcon2, dsCellMiddleTitle2);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF6.getResources().getResourceName(i5)));
                return null;
            case 11:
                ((Integer) obj).getClass();
                wnn0 wnn0Var = (wnn0) obj2;
                j6m0 j6m0Var = snn0.n2;
                wnn0Var.getClass();
                return wnn0Var.f39458a.getClass().getSimpleName();
            case 12:
                non0 non0Var = (non0) obj2;
                ((oyg0) obj).getClass();
                non0Var.getClass();
                yvl yvlVar = non0Var.b;
                int iOrdinal = yvlVar.f43325a.ordinal();
                if (iOrdinal == 0) {
                    evq0Var = evq0.b;
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    evq0Var = evq0.f8484a;
                }
                yvl yvlVar2 = new yvl(evq0Var, yvlVar.b, yvlVar.c);
                String str = non0Var.f23876a;
                str.getClass();
                return new non0(str, yvlVar2);
            case 13:
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                int i6 = SwipeBackLayout.q;
                return Unit.f46060a;
            case 14:
                ViewGroup viewGroup7 = (ViewGroup) obj2;
                View viewF7 = rw2.f((LayoutInflater) obj, viewGroup7, R.layout.swipex_card_multi_team_item, viewGroup7, false);
                ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF7, R.id.backgroundImage);
                if (shapeableImageView != null) {
                    View viewF8 = yum0.f(viewF7, R.id.border);
                    if (viewF8 != null) {
                        View viewF9 = yum0.f(viewF7, R.id.cardGradient);
                        if (viewF9 == null) {
                            i = i2;
                        } else {
                            TextView textView4 = (TextView) yum0.f(viewF7, R.id.champLabel);
                            if (textView4 != null) {
                                if (((LinearLayout) yum0.f(viewF7, R.id.coefContainer)) == null) {
                                    i = R.id.coefContainer;
                                } else if (((ImageView) yum0.f(viewF7, R.id.coefIcon)) == null) {
                                    i = R.id.coefIcon;
                                } else if (((TextView) yum0.f(viewF7, R.id.coefLabel)) != null) {
                                    TextView textView5 = (TextView) yum0.f(viewF7, R.id.coefValue);
                                    if (textView5 != null) {
                                        i = R.id.firstTeamFirstIcon;
                                        DsTeamLogo dsTeamLogo = (DsTeamLogo) yum0.f(viewF7, R.id.firstTeamFirstIcon);
                                        if (dsTeamLogo != null) {
                                            i = R.id.firstTeamName;
                                            TextView textView6 = (TextView) yum0.f(viewF7, R.id.firstTeamName);
                                            if (textView6 != null) {
                                                i = R.id.firstTeamSecondIcon;
                                                DsTeamLogo dsTeamLogo2 = (DsTeamLogo) yum0.f(viewF7, R.id.firstTeamSecondIcon);
                                                if (dsTeamLogo2 != null) {
                                                    if (((LinearLayout) yum0.f(viewF7, R.id.infoContainer)) == null) {
                                                        i = R.id.infoContainer;
                                                    } else if (((ImageView) yum0.f(viewF7, R.id.infoIcon)) == null) {
                                                        i = R.id.infoIcon;
                                                    } else if (((TextView) yum0.f(viewF7, R.id.infoLabel)) != null) {
                                                        i = R.id.infoText;
                                                        TextView textView7 = (TextView) yum0.f(viewF7, R.id.infoText);
                                                        if (textView7 != null) {
                                                            i2 = R.id.infoValue;
                                                            TextView textView8 = (TextView) yum0.f(viewF7, R.id.infoValue);
                                                            if (textView8 != null) {
                                                                i = R.id.marketContainer;
                                                                if (((LinearLayout) yum0.f(viewF7, R.id.marketContainer)) != null) {
                                                                    i2 = R.id.marketIcon;
                                                                    if (((ImageView) yum0.f(viewF7, R.id.marketIcon)) != null) {
                                                                        i = R.id.marketLabel;
                                                                        TextView textView9 = (TextView) yum0.f(viewF7, R.id.marketLabel);
                                                                        if (textView9 != null) {
                                                                            i2 = R.id.marketValue;
                                                                            TextView textView10 = (TextView) yum0.f(viewF7, R.id.marketValue);
                                                                            if (textView10 != null) {
                                                                                i = R.id.possibleWin;
                                                                                if (((TextView) yum0.f(viewF7, R.id.possibleWin)) != null) {
                                                                                    i2 = R.id.possibleWinContainer;
                                                                                    if (((LinearLayout) yum0.f(viewF7, R.id.possibleWinContainer)) != null) {
                                                                                        i = R.id.possibleWinIcon;
                                                                                        if (((ImageView) yum0.f(viewF7, R.id.possibleWinIcon)) != null) {
                                                                                            i = R.id.possibleWinValue;
                                                                                            TextView textView11 = (TextView) yum0.f(viewF7, R.id.possibleWinValue);
                                                                                            if (textView11 != null) {
                                                                                                i = R.id.secondTeamFirstIcon;
                                                                                                DsTeamLogo dsTeamLogo3 = (DsTeamLogo) yum0.f(viewF7, R.id.secondTeamFirstIcon);
                                                                                                if (dsTeamLogo3 != null) {
                                                                                                    i = R.id.secondTeamName;
                                                                                                    TextView textView12 = (TextView) yum0.f(viewF7, R.id.secondTeamName);
                                                                                                    if (textView12 != null) {
                                                                                                        i = R.id.secondTeamSecondIcon;
                                                                                                        DsTeamLogo dsTeamLogo4 = (DsTeamLogo) yum0.f(viewF7, R.id.secondTeamSecondIcon);
                                                                                                        if (dsTeamLogo4 != null) {
                                                                                                            i = R.id.sportIcon;
                                                                                                            ImageView imageView = (ImageView) yum0.f(viewF7, R.id.sportIcon);
                                                                                                            if (imageView != null) {
                                                                                                                i = R.id.sportImageGradient;
                                                                                                                View viewF10 = yum0.f(viewF7, R.id.sportImageGradient);
                                                                                                                if (viewF10 != null) {
                                                                                                                    i = R.id.sportLabel;
                                                                                                                    TextView textView13 = (TextView) yum0.f(viewF7, R.id.sportLabel);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i = R.id.timer;
                                                                                                                        DsTimer dsTimer = (DsTimer) yum0.f(viewF7, R.id.timer);
                                                                                                                        if (dsTimer != null) {
                                                                                                                            i = R.id.timerLabel;
                                                                                                                            if (((TextView) yum0.f(viewF7, R.id.timerLabel)) != null) {
                                                                                                                                i = R.id.vs;
                                                                                                                                SportScore sportScore = (SportScore) yum0.f(viewF7, R.id.vs);
                                                                                                                                if (sportScore != null) {
                                                                                                                                    return new tsn0((ConstraintLayout) viewF7, shapeableImageView, viewF8, viewF9, textView4, textView5, dsTeamLogo, textView6, dsTeamLogo2, textView7, textView8, textView9, textView10, textView11, dsTeamLogo3, textView12, dsTeamLogo4, imageView, viewF10, textView13, dsTimer, sportScore);
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
                                                                                        i = i2;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i = i2;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i = i2;
                                                                    }
                                                                }
                                                            } else {
                                                                i = i2;
                                                            }
                                                        }
                                                    } else {
                                                        i = R.id.infoLabel;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i = R.id.coefValue;
                                    }
                                } else {
                                    i = R.id.coefLabel;
                                }
                            }
                        }
                    } else {
                        i = R.id.border;
                    }
                } else {
                    i = R.id.backgroundImage;
                }
                hny.u("Missing required view with ID: ".concat(viewF7.getResources().getResourceName(i)));
                return null;
            case 15:
                ViewGroup viewGroup8 = (ViewGroup) obj2;
                View viewF11 = rw2.f((LayoutInflater) obj, viewGroup8, R.layout.swipex_card_single_team_item, viewGroup8, false);
                ShapeableImageView shapeableImageView2 = (ShapeableImageView) yum0.f(viewF11, R.id.backgroundImage);
                if (shapeableImageView2 != null) {
                    View viewF12 = yum0.f(viewF11, R.id.border);
                    if (viewF12 != null) {
                        View viewF13 = yum0.f(viewF11, R.id.cardGradient);
                        if (viewF13 != null) {
                            TextView textView14 = (TextView) yum0.f(viewF11, R.id.champLabel);
                            if (textView14 != null) {
                                if (((LinearLayout) yum0.f(viewF11, R.id.coefContainer)) == null) {
                                    i = R.id.coefContainer;
                                } else if (((ImageView) yum0.f(viewF11, R.id.coefIcon)) == null) {
                                    i = R.id.coefIcon;
                                } else if (((TextView) yum0.f(viewF11, R.id.coefLabel)) != null) {
                                    TextView textView15 = (TextView) yum0.f(viewF11, R.id.coefValue);
                                    if (textView15 == null) {
                                        i = R.id.coefValue;
                                    } else if (((LinearLayout) yum0.f(viewF11, R.id.infoContainer)) == null) {
                                        i = R.id.infoContainer;
                                    } else if (((ImageView) yum0.f(viewF11, R.id.infoIcon)) == null) {
                                        i = R.id.infoIcon;
                                    } else if (((TextView) yum0.f(viewF11, R.id.infoLabel)) == null) {
                                        i = R.id.infoLabel;
                                    } else if (((TextView) yum0.f(viewF11, R.id.infoText)) != null) {
                                        TextView textView16 = (TextView) yum0.f(viewF11, R.id.infoValue);
                                        if (textView16 == null) {
                                            i = R.id.infoValue;
                                        } else if (((LinearLayout) yum0.f(viewF11, R.id.marketContainer)) == null) {
                                            i = R.id.marketContainer;
                                        } else if (((ImageView) yum0.f(viewF11, R.id.marketIcon)) != null) {
                                            TextView textView17 = (TextView) yum0.f(viewF11, R.id.marketLabel);
                                            if (textView17 != null) {
                                                TextView textView18 = (TextView) yum0.f(viewF11, R.id.marketValue);
                                                if (textView18 == null) {
                                                    i = R.id.marketValue;
                                                } else if (((TextView) yum0.f(viewF11, R.id.possibleWin)) == null) {
                                                    i = R.id.possibleWin;
                                                } else if (((LinearLayout) yum0.f(viewF11, R.id.possibleWinContainer)) != null) {
                                                    i = R.id.possibleWinIcon;
                                                    if (((ImageView) yum0.f(viewF11, R.id.possibleWinIcon)) != null) {
                                                        i = R.id.possibleWinValue;
                                                        TextView textView19 = (TextView) yum0.f(viewF11, R.id.possibleWinValue);
                                                        if (textView19 != null) {
                                                            i = R.id.sportIcon;
                                                            ImageView imageView2 = (ImageView) yum0.f(viewF11, R.id.sportIcon);
                                                            if (imageView2 != null) {
                                                                i = R.id.sportImageGradient;
                                                                View viewF14 = yum0.f(viewF11, R.id.sportImageGradient);
                                                                if (viewF14 != null) {
                                                                    i = R.id.sportLabel;
                                                                    TextView textView20 = (TextView) yum0.f(viewF11, R.id.sportLabel);
                                                                    if (textView20 != null) {
                                                                        i = R.id.timer;
                                                                        DsTimer dsTimer2 = (DsTimer) yum0.f(viewF11, R.id.timer);
                                                                        if (dsTimer2 != null) {
                                                                            i = R.id.timerLabel;
                                                                            if (((TextView) yum0.f(viewF11, R.id.timerLabel)) != null) {
                                                                                i = R.id.vs;
                                                                                TextView textView21 = (TextView) yum0.f(viewF11, R.id.vs);
                                                                                if (textView21 != null) {
                                                                                    return new jtn0((ConstraintLayout) viewF11, shapeableImageView2, viewF12, viewF13, textView14, textView15, textView16, textView17, textView18, textView19, imageView2, viewF14, textView20, dsTimer2, textView21);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i = R.id.possibleWinContainer;
                                                }
                                            } else {
                                                i = R.id.marketLabel;
                                            }
                                        } else {
                                            i = R.id.marketIcon;
                                        }
                                    } else {
                                        i = R.id.infoText;
                                    }
                                } else {
                                    i = R.id.coefLabel;
                                }
                            }
                        } else {
                            i = R.id.cardGradient;
                        }
                    } else {
                        i = R.id.border;
                    }
                } else {
                    i = R.id.backgroundImage;
                }
                hny.u("Missing required view with ID: ".concat(viewF11.getResources().getResourceName(i)));
                return null;
            case 16:
                ViewGroup viewGroup9 = (ViewGroup) obj2;
                View viewF15 = rw2.f((LayoutInflater) obj, viewGroup9, R.layout.swipex_card_two_team_item, viewGroup9, false);
                ShapeableImageView shapeableImageView3 = (ShapeableImageView) yum0.f(viewF15, R.id.backgroundImage);
                if (shapeableImageView3 != null) {
                    View viewF16 = yum0.f(viewF15, R.id.border);
                    if (viewF16 != null) {
                        View viewF17 = yum0.f(viewF15, R.id.cardGradient);
                        if (viewF17 != null) {
                            TextView textView22 = (TextView) yum0.f(viewF15, R.id.champLabel);
                            if (textView22 != null) {
                                if (((LinearLayout) yum0.f(viewF15, R.id.coefContainer)) == null) {
                                    i = R.id.coefContainer;
                                } else if (((ImageView) yum0.f(viewF15, R.id.coefIcon)) == null) {
                                    i = R.id.coefIcon;
                                } else if (((TextView) yum0.f(viewF15, R.id.coefLabel)) != null) {
                                    TextView textView23 = (TextView) yum0.f(viewF15, R.id.coefValue);
                                    if (textView23 != null) {
                                        i = R.id.firstTeamIcon;
                                        DsTeamLogo dsTeamLogo5 = (DsTeamLogo) yum0.f(viewF15, R.id.firstTeamIcon);
                                        if (dsTeamLogo5 != null) {
                                            i = R.id.firstTeamName;
                                            TextView textView24 = (TextView) yum0.f(viewF15, R.id.firstTeamName);
                                            if (textView24 != null) {
                                                if (((LinearLayout) yum0.f(viewF15, R.id.infoContainer)) == null) {
                                                    i = R.id.infoContainer;
                                                } else if (((ImageView) yum0.f(viewF15, R.id.infoIcon)) == null) {
                                                    i = R.id.infoIcon;
                                                } else if (((TextView) yum0.f(viewF15, R.id.infoLabel)) != null) {
                                                    TextView textView25 = (TextView) yum0.f(viewF15, R.id.infoText);
                                                    if (textView25 != null) {
                                                        TextView textView26 = (TextView) yum0.f(viewF15, R.id.infoValue);
                                                        if (textView26 == null) {
                                                            i = R.id.infoValue;
                                                        } else if (((LinearLayout) yum0.f(viewF15, R.id.marketContainer)) == null) {
                                                            i = R.id.marketContainer;
                                                        } else if (((ImageView) yum0.f(viewF15, R.id.marketIcon)) != null) {
                                                            TextView textView27 = (TextView) yum0.f(viewF15, R.id.marketLabel);
                                                            if (textView27 != null) {
                                                                TextView textView28 = (TextView) yum0.f(viewF15, R.id.marketValue);
                                                                if (textView28 == null) {
                                                                    i = R.id.marketValue;
                                                                } else if (((TextView) yum0.f(viewF15, R.id.possibleWin)) == null) {
                                                                    i = R.id.possibleWin;
                                                                } else if (((LinearLayout) yum0.f(viewF15, R.id.possibleWinContainer)) != null) {
                                                                    i = R.id.possibleWinIcon;
                                                                    if (((ImageView) yum0.f(viewF15, R.id.possibleWinIcon)) != null) {
                                                                        i = R.id.possibleWinValue;
                                                                        TextView textView29 = (TextView) yum0.f(viewF15, R.id.possibleWinValue);
                                                                        if (textView29 != null) {
                                                                            i = R.id.secondTeamIcon;
                                                                            DsTeamLogo dsTeamLogo6 = (DsTeamLogo) yum0.f(viewF15, R.id.secondTeamIcon);
                                                                            if (dsTeamLogo6 != null) {
                                                                                i = R.id.secondTeamName;
                                                                                TextView textView30 = (TextView) yum0.f(viewF15, R.id.secondTeamName);
                                                                                if (textView30 != null) {
                                                                                    i = R.id.sportIcon;
                                                                                    ImageView imageView3 = (ImageView) yum0.f(viewF15, R.id.sportIcon);
                                                                                    if (imageView3 != null) {
                                                                                        i = R.id.sportImageGradient;
                                                                                        View viewF18 = yum0.f(viewF15, R.id.sportImageGradient);
                                                                                        if (viewF18 != null) {
                                                                                            i = R.id.sportLabel;
                                                                                            TextView textView31 = (TextView) yum0.f(viewF15, R.id.sportLabel);
                                                                                            if (textView31 != null) {
                                                                                                i = R.id.timer;
                                                                                                DsTimer dsTimer3 = (DsTimer) yum0.f(viewF15, R.id.timer);
                                                                                                if (dsTimer3 != null) {
                                                                                                    i = R.id.timerLabel;
                                                                                                    if (((TextView) yum0.f(viewF15, R.id.timerLabel)) != null) {
                                                                                                        i = R.id.vs;
                                                                                                        SportScore sportScore2 = (SportScore) yum0.f(viewF15, R.id.vs);
                                                                                                        if (sportScore2 != null) {
                                                                                                            return new ktn0((ConstraintLayout) viewF15, shapeableImageView3, viewF16, viewF17, textView22, textView23, dsTeamLogo5, textView24, textView25, textView26, textView27, textView28, textView29, dsTeamLogo6, textView30, imageView3, viewF18, textView31, dsTimer3, sportScore2);
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
                                                                    i = R.id.possibleWinContainer;
                                                                }
                                                            } else {
                                                                i = R.id.marketLabel;
                                                            }
                                                        } else {
                                                            i = R.id.marketIcon;
                                                        }
                                                    } else {
                                                        i = R.id.infoText;
                                                    }
                                                } else {
                                                    i = R.id.infoLabel;
                                                }
                                            }
                                        }
                                    } else {
                                        i = R.id.coefValue;
                                    }
                                } else {
                                    i = R.id.coefLabel;
                                }
                            }
                        } else {
                            i = R.id.cardGradient;
                        }
                    } else {
                        i = R.id.border;
                    }
                } else {
                    i = R.id.backgroundImage;
                }
                hny.u("Missing required view with ID: ".concat(viewF15.getResources().getResourceName(i)));
                return null;
            case 17:
                int iIntValue = ((Integer) obj).intValue();
                p6t0 p6t0Var = (p6t0) obj2;
                p6t0Var.getClass();
                if (!(p6t0Var instanceof t3q)) {
                    if (p6t0Var instanceof i3q) {
                        return ((i3q) p6t0Var).f14108a;
                    }
                    if (!(p6t0Var instanceof b3q)) {
                        return String.valueOf(iIntValue);
                    }
                    b3q b3qVar = (b3q) p6t0Var;
                    return dw9.m(b3qVar.f1920a, Separators.SP, b3qVar.b);
                }
                t3q t3qVar = (t3q) p6t0Var;
                return t3qVar.f33281a + Separators.SP + t3qVar.b;
            case 18:
                ViewGroup viewGroup10 = (ViewGroup) obj2;
                View viewF19 = rw2.f((LayoutInflater) obj, viewGroup10, R.layout.swipex_mini_card_multi_team_item, viewGroup10, false);
                ShapeableImageView shapeableImageView4 = (ShapeableImageView) yum0.f(viewF19, R.id.backgroundImage);
                if (shapeableImageView4 != null) {
                    View viewF20 = yum0.f(viewF19, R.id.border);
                    if (viewF20 != null) {
                        View viewF21 = yum0.f(viewF19, R.id.cardGradient);
                        if (viewF21 != null) {
                            TextView textView32 = (TextView) yum0.f(viewF19, R.id.champLabel);
                            if (textView32 != null) {
                                if (((LinearLayout) yum0.f(viewF19, R.id.coefContainer)) == null) {
                                    i = R.id.coefContainer;
                                } else if (((ImageView) yum0.f(viewF19, R.id.coefIcon)) == null) {
                                    i = R.id.coefIcon;
                                } else if (((TextView) yum0.f(viewF19, R.id.coefLabel)) != null) {
                                    TextView textView33 = (TextView) yum0.f(viewF19, R.id.coefValue);
                                    if (textView33 != null) {
                                        i = R.id.firstTeamFirstIcon;
                                        DsTeamLogo dsTeamLogo7 = (DsTeamLogo) yum0.f(viewF19, R.id.firstTeamFirstIcon);
                                        if (dsTeamLogo7 != null) {
                                            i = R.id.firstTeamName;
                                            TextView textView34 = (TextView) yum0.f(viewF19, R.id.firstTeamName);
                                            if (textView34 != null) {
                                                i = R.id.firstTeamSecondIcon;
                                                DsTeamLogo dsTeamLogo8 = (DsTeamLogo) yum0.f(viewF19, R.id.firstTeamSecondIcon);
                                                if (dsTeamLogo8 != null) {
                                                    if (((LinearLayout) yum0.f(viewF19, R.id.infoContainer)) == null) {
                                                        i = R.id.infoContainer;
                                                    } else if (((ImageView) yum0.f(viewF19, R.id.infoIcon)) == null) {
                                                        i = R.id.infoIcon;
                                                    } else if (((TextView) yum0.f(viewF19, R.id.infoLabel)) != null) {
                                                        TextView textView35 = (TextView) yum0.f(viewF19, R.id.infoText);
                                                        if (textView35 != null) {
                                                            TextView textView36 = (TextView) yum0.f(viewF19, R.id.infoValue);
                                                            if (textView36 == null) {
                                                                i = R.id.infoValue;
                                                            } else if (((LinearLayout) yum0.f(viewF19, R.id.marketContainer)) == null) {
                                                                i = R.id.marketContainer;
                                                            } else if (((ImageView) yum0.f(viewF19, R.id.marketIcon)) != null) {
                                                                TextView textView37 = (TextView) yum0.f(viewF19, R.id.marketLabel);
                                                                if (textView37 != null) {
                                                                    TextView textView38 = (TextView) yum0.f(viewF19, R.id.marketValue);
                                                                    if (textView38 == null) {
                                                                        i = R.id.marketValue;
                                                                    } else if (((TextView) yum0.f(viewF19, R.id.possibleWin)) == null) {
                                                                        i = R.id.possibleWin;
                                                                    } else if (((LinearLayout) yum0.f(viewF19, R.id.possibleWinContainer)) != null) {
                                                                        i = R.id.possibleWinIcon;
                                                                        if (((ImageView) yum0.f(viewF19, R.id.possibleWinIcon)) != null) {
                                                                            i = R.id.possibleWinValue;
                                                                            TextView textView39 = (TextView) yum0.f(viewF19, R.id.possibleWinValue);
                                                                            if (textView39 != null) {
                                                                                i = R.id.secondTeamFirstIcon;
                                                                                DsTeamLogo dsTeamLogo9 = (DsTeamLogo) yum0.f(viewF19, R.id.secondTeamFirstIcon);
                                                                                if (dsTeamLogo9 != null) {
                                                                                    i = R.id.secondTeamName;
                                                                                    TextView textView40 = (TextView) yum0.f(viewF19, R.id.secondTeamName);
                                                                                    if (textView40 != null) {
                                                                                        i = R.id.secondTeamSecondIcon;
                                                                                        DsTeamLogo dsTeamLogo10 = (DsTeamLogo) yum0.f(viewF19, R.id.secondTeamSecondIcon);
                                                                                        if (dsTeamLogo10 != null) {
                                                                                            i = R.id.sportIcon;
                                                                                            ImageView imageView4 = (ImageView) yum0.f(viewF19, R.id.sportIcon);
                                                                                            if (imageView4 != null) {
                                                                                                i = R.id.sportImageGradient;
                                                                                                View viewF22 = yum0.f(viewF19, R.id.sportImageGradient);
                                                                                                if (viewF22 != null) {
                                                                                                    i = R.id.sportLabel;
                                                                                                    TextView textView41 = (TextView) yum0.f(viewF19, R.id.sportLabel);
                                                                                                    if (textView41 != null) {
                                                                                                        i = R.id.timer;
                                                                                                        DsTimer dsTimer4 = (DsTimer) yum0.f(viewF19, R.id.timer);
                                                                                                        if (dsTimer4 != null) {
                                                                                                            i = R.id.timerLabel;
                                                                                                            if (((TextView) yum0.f(viewF19, R.id.timerLabel)) != null) {
                                                                                                                i = R.id.vs;
                                                                                                                SportScore sportScore3 = (SportScore) yum0.f(viewF19, R.id.vs);
                                                                                                                if (sportScore3 != null) {
                                                                                                                    return new zvn0((ConstraintLayout) viewF19, shapeableImageView4, viewF20, viewF21, textView32, textView33, dsTeamLogo7, textView34, dsTeamLogo8, textView35, textView36, textView37, textView38, textView39, dsTeamLogo9, textView40, dsTeamLogo10, imageView4, viewF22, textView41, dsTimer4, sportScore3);
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
                                                                        i = R.id.possibleWinContainer;
                                                                    }
                                                                } else {
                                                                    i = R.id.marketLabel;
                                                                }
                                                            } else {
                                                                i = R.id.marketIcon;
                                                            }
                                                        } else {
                                                            i = R.id.infoText;
                                                        }
                                                    } else {
                                                        i = R.id.infoLabel;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i = R.id.coefValue;
                                    }
                                } else {
                                    i = R.id.coefLabel;
                                }
                            }
                        } else {
                            i = R.id.cardGradient;
                        }
                    } else {
                        i = R.id.border;
                    }
                } else {
                    i = R.id.backgroundImage;
                }
                hny.u("Missing required view with ID: ".concat(viewF19.getResources().getResourceName(i)));
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ViewGroup viewGroup11 = (ViewGroup) obj2;
                View viewF23 = rw2.f((LayoutInflater) obj, viewGroup11, R.layout.swipex_mini_card_single_team_item, viewGroup11, false);
                ShapeableImageView shapeableImageView5 = (ShapeableImageView) yum0.f(viewF23, R.id.backgroundImage);
                if (shapeableImageView5 != null) {
                    View viewF24 = yum0.f(viewF23, R.id.border);
                    if (viewF24 != null) {
                        View viewF25 = yum0.f(viewF23, R.id.cardGradient);
                        if (viewF25 != null) {
                            TextView textView42 = (TextView) yum0.f(viewF23, R.id.champLabel);
                            if (textView42 != null) {
                                if (((LinearLayout) yum0.f(viewF23, R.id.coefContainer)) == null) {
                                    i = R.id.coefContainer;
                                } else if (((ImageView) yum0.f(viewF23, R.id.coefIcon)) == null) {
                                    i = R.id.coefIcon;
                                } else if (((TextView) yum0.f(viewF23, R.id.coefLabel)) != null) {
                                    TextView textView43 = (TextView) yum0.f(viewF23, R.id.coefValue);
                                    if (textView43 == null) {
                                        i = R.id.coefValue;
                                    } else if (((LinearLayout) yum0.f(viewF23, R.id.infoContainer)) == null) {
                                        i = R.id.infoContainer;
                                    } else if (((ImageView) yum0.f(viewF23, R.id.infoIcon)) == null) {
                                        i = R.id.infoIcon;
                                    } else if (((TextView) yum0.f(viewF23, R.id.infoLabel)) == null) {
                                        i = R.id.infoLabel;
                                    } else if (((TextView) yum0.f(viewF23, R.id.infoText)) != null) {
                                        TextView textView44 = (TextView) yum0.f(viewF23, R.id.infoValue);
                                        if (textView44 == null) {
                                            i = R.id.infoValue;
                                        } else if (((LinearLayout) yum0.f(viewF23, R.id.marketContainer)) == null) {
                                            i = R.id.marketContainer;
                                        } else if (((ImageView) yum0.f(viewF23, R.id.marketIcon)) != null) {
                                            TextView textView45 = (TextView) yum0.f(viewF23, R.id.marketLabel);
                                            if (textView45 != null) {
                                                TextView textView46 = (TextView) yum0.f(viewF23, R.id.marketValue);
                                                if (textView46 == null) {
                                                    i = R.id.marketValue;
                                                } else if (((TextView) yum0.f(viewF23, R.id.possibleWin)) == null) {
                                                    i = R.id.possibleWin;
                                                } else if (((LinearLayout) yum0.f(viewF23, R.id.possibleWinContainer)) != null) {
                                                    i = R.id.possibleWinIcon;
                                                    if (((ImageView) yum0.f(viewF23, R.id.possibleWinIcon)) != null) {
                                                        i = R.id.possibleWinValue;
                                                        TextView textView47 = (TextView) yum0.f(viewF23, R.id.possibleWinValue);
                                                        if (textView47 != null) {
                                                            i = R.id.sportIcon;
                                                            ImageView imageView5 = (ImageView) yum0.f(viewF23, R.id.sportIcon);
                                                            if (imageView5 != null) {
                                                                i = R.id.sportImageGradient;
                                                                View viewF26 = yum0.f(viewF23, R.id.sportImageGradient);
                                                                if (viewF26 != null) {
                                                                    i = R.id.sportLabel;
                                                                    TextView textView48 = (TextView) yum0.f(viewF23, R.id.sportLabel);
                                                                    if (textView48 != null) {
                                                                        i = R.id.timer;
                                                                        DsTimer dsTimer5 = (DsTimer) yum0.f(viewF23, R.id.timer);
                                                                        if (dsTimer5 != null) {
                                                                            i = R.id.timerLabel;
                                                                            if (((TextView) yum0.f(viewF23, R.id.timerLabel)) != null) {
                                                                                i = R.id.vs;
                                                                                TextView textView49 = (TextView) yum0.f(viewF23, R.id.vs);
                                                                                if (textView49 != null) {
                                                                                    return new nwn0((ConstraintLayout) viewF23, shapeableImageView5, viewF24, viewF25, textView42, textView43, textView44, textView45, textView46, textView47, imageView5, viewF26, textView48, dsTimer5, textView49);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i = R.id.possibleWinContainer;
                                                }
                                            } else {
                                                i = R.id.marketLabel;
                                            }
                                        } else {
                                            i = R.id.marketIcon;
                                        }
                                    } else {
                                        i = R.id.infoText;
                                    }
                                } else {
                                    i = R.id.coefLabel;
                                }
                            }
                        } else {
                            i = R.id.cardGradient;
                        }
                    } else {
                        i = R.id.border;
                    }
                } else {
                    i = R.id.backgroundImage;
                }
                hny.u("Missing required view with ID: ".concat(viewF23.getResources().getResourceName(i)));
                return null;
            case 20:
                ViewGroup viewGroup12 = (ViewGroup) obj2;
                View viewF27 = rw2.f((LayoutInflater) obj, viewGroup12, R.layout.swipex_mini_card_two_team_item, viewGroup12, false);
                ShapeableImageView shapeableImageView6 = (ShapeableImageView) yum0.f(viewF27, R.id.backgroundImage);
                if (shapeableImageView6 != null) {
                    View viewF28 = yum0.f(viewF27, R.id.border);
                    if (viewF28 != null) {
                        View viewF29 = yum0.f(viewF27, R.id.cardGradient);
                        if (viewF29 != null) {
                            TextView textView50 = (TextView) yum0.f(viewF27, R.id.champLabel);
                            if (textView50 != null) {
                                if (((LinearLayout) yum0.f(viewF27, R.id.coefContainer)) == null) {
                                    i = R.id.coefContainer;
                                } else if (((ImageView) yum0.f(viewF27, R.id.coefIcon)) == null) {
                                    i = R.id.coefIcon;
                                } else if (((TextView) yum0.f(viewF27, R.id.coefLabel)) != null) {
                                    TextView textView51 = (TextView) yum0.f(viewF27, R.id.coefValue);
                                    if (textView51 != null) {
                                        i = R.id.firstTeamIcon;
                                        DsTeamLogo dsTeamLogo11 = (DsTeamLogo) yum0.f(viewF27, R.id.firstTeamIcon);
                                        if (dsTeamLogo11 != null) {
                                            i = R.id.firstTeamName;
                                            TextView textView52 = (TextView) yum0.f(viewF27, R.id.firstTeamName);
                                            if (textView52 != null) {
                                                if (((LinearLayout) yum0.f(viewF27, R.id.infoContainer)) == null) {
                                                    i = R.id.infoContainer;
                                                } else if (((ImageView) yum0.f(viewF27, R.id.infoIcon)) == null) {
                                                    i = R.id.infoIcon;
                                                } else if (((TextView) yum0.f(viewF27, R.id.infoLabel)) != null) {
                                                    TextView textView53 = (TextView) yum0.f(viewF27, R.id.infoText);
                                                    if (textView53 != null) {
                                                        TextView textView54 = (TextView) yum0.f(viewF27, R.id.infoValue);
                                                        if (textView54 == null) {
                                                            i = R.id.infoValue;
                                                        } else if (((LinearLayout) yum0.f(viewF27, R.id.marketContainer)) == null) {
                                                            i = R.id.marketContainer;
                                                        } else if (((ImageView) yum0.f(viewF27, R.id.marketIcon)) != null) {
                                                            TextView textView55 = (TextView) yum0.f(viewF27, R.id.marketLabel);
                                                            if (textView55 != null) {
                                                                TextView textView56 = (TextView) yum0.f(viewF27, R.id.marketValue);
                                                                if (textView56 == null) {
                                                                    i = R.id.marketValue;
                                                                } else if (((TextView) yum0.f(viewF27, R.id.possibleWin)) == null) {
                                                                    i = R.id.possibleWin;
                                                                } else if (((LinearLayout) yum0.f(viewF27, R.id.possibleWinContainer)) != null) {
                                                                    i = R.id.possibleWinIcon;
                                                                    if (((ImageView) yum0.f(viewF27, R.id.possibleWinIcon)) != null) {
                                                                        i = R.id.possibleWinValue;
                                                                        TextView textView57 = (TextView) yum0.f(viewF27, R.id.possibleWinValue);
                                                                        if (textView57 != null) {
                                                                            i = R.id.secondTeamIcon;
                                                                            DsTeamLogo dsTeamLogo12 = (DsTeamLogo) yum0.f(viewF27, R.id.secondTeamIcon);
                                                                            if (dsTeamLogo12 != null) {
                                                                                i = R.id.secondTeamName;
                                                                                TextView textView58 = (TextView) yum0.f(viewF27, R.id.secondTeamName);
                                                                                if (textView58 != null) {
                                                                                    i = R.id.sportIcon;
                                                                                    ImageView imageView6 = (ImageView) yum0.f(viewF27, R.id.sportIcon);
                                                                                    if (imageView6 != null) {
                                                                                        i = R.id.sportImageGradient;
                                                                                        View viewF30 = yum0.f(viewF27, R.id.sportImageGradient);
                                                                                        if (viewF30 != null) {
                                                                                            i = R.id.sportLabel;
                                                                                            TextView textView59 = (TextView) yum0.f(viewF27, R.id.sportLabel);
                                                                                            if (textView59 != null) {
                                                                                                i = R.id.timer;
                                                                                                DsTimer dsTimer6 = (DsTimer) yum0.f(viewF27, R.id.timer);
                                                                                                if (dsTimer6 != null) {
                                                                                                    i = R.id.timerLabel;
                                                                                                    if (((TextView) yum0.f(viewF27, R.id.timerLabel)) != null) {
                                                                                                        i = R.id.vs;
                                                                                                        SportScore sportScore4 = (SportScore) yum0.f(viewF27, R.id.vs);
                                                                                                        if (sportScore4 != null) {
                                                                                                            return new own0((ConstraintLayout) viewF27, shapeableImageView6, viewF28, viewF29, textView50, textView51, dsTeamLogo11, textView52, textView53, textView54, textView55, textView56, textView57, dsTeamLogo12, textView58, imageView6, viewF30, textView59, dsTimer6, sportScore4);
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
                                                                    i = R.id.possibleWinContainer;
                                                                }
                                                            } else {
                                                                i = R.id.marketLabel;
                                                            }
                                                        } else {
                                                            i = R.id.marketIcon;
                                                        }
                                                    } else {
                                                        i = R.id.infoText;
                                                    }
                                                } else {
                                                    i = R.id.infoLabel;
                                                }
                                            }
                                        }
                                    } else {
                                        i = R.id.coefValue;
                                    }
                                } else {
                                    i = R.id.coefLabel;
                                }
                            }
                        } else {
                            i = R.id.cardGradient;
                        }
                    } else {
                        i = R.id.border;
                    }
                } else {
                    i = R.id.backgroundImage;
                }
                hny.u("Missing required view with ID: ".concat(viewF27.getResources().getResourceName(i)));
                return null;
            case 21:
                vxn0 vxn0Var = (vxn0) obj2;
                ((oyg0) obj).getClass();
                vxn0Var.getClass();
                return vxn0.a(vxn0Var, null, null, false, false, false, false, false, true, null, null, null, null, null, false, false, false, null, 130831);
            case 22:
                vxn0 vxn0Var2 = (vxn0) obj2;
                ((oyg0) obj).getClass();
                vxn0Var2.getClass();
                return vxn0.a(vxn0Var2, null, null, false, false, false, false, false, false, null, null, null, null, null, false, false, true, null, 98303);
            case 23:
                ViewGroup viewGroup13 = (ViewGroup) obj2;
                View viewF31 = rw2.f((LayoutInflater) obj, viewGroup13, R.layout.item_switch, viewGroup13, false);
                int i7 = R.id.cmTitle;
                DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) yum0.f(viewF31, R.id.cmTitle);
                if (dsCellMiddleTitle3 != null) {
                    i7 = R.id.crSwitch;
                    DsCellRightSwitch dsCellRightSwitch = (DsCellRightSwitch) yum0.f(viewF31, R.id.crSwitch);
                    if (dsCellRightSwitch != null) {
                        i7 = R.id.separator;
                        if (((DsSeparator) yum0.f(viewF31, R.id.separator)) != null) {
                            return new lyx((DsSettingsCell) viewF31, dsCellMiddleTitle3, dsCellRightSwitch);
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF31.getResources().getResourceName(i7)));
                return null;
            case 24:
                fet fetVar = (fet) obj;
                ((Integer) obj2).intValue();
                fetVar.e0(93582145);
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
                return xczVarA;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ViewGroup viewGroup14 = (ViewGroup) obj2;
                View viewF32 = rw2.f((LayoutInflater) obj, viewGroup14, R.layout.delegate_system_message, viewGroup14, false);
                FixedSelectionTextView fixedSelectionTextView = (FixedSelectionTextView) yum0.f(viewF32, R.id.txtMessage);
                if (fixedSelectionTextView != null) {
                    return new b3k((LinearLayout) viewF32, fixedSelectionTextView);
                }
                hny.u("Missing required view with ID: ".concat(viewF32.getResources().getResourceName(R.id.txtMessage)));
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                glb0 glb0Var = (glb0) obj2;
                ((oyg0) obj).getClass();
                glb0Var.getClass();
                return glb0.a(glb0Var, false, false, null, null, null, null, null, new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), new nn00(), null, null, false, 29368319);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Function1 function5 = (Function1) obj;
                Function1 function6 = (Function1) obj2;
                function5.getClass();
                function6.getClass();
                function5.invoke(new rgn0((byte) 26));
                function6.invoke(new dco0(b2));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Function1 function7 = (Function1) obj;
                Function1 function8 = (Function1) obj2;
                function7.getClass();
                function8.getClass();
                function7.invoke(new rgn0((byte) 27));
                function8.invoke(new dco0((byte) 1));
                return Unit.f46060a;
            default:
                Function1 function9 = (Function1) obj;
                Function1 function10 = (Function1) obj2;
                function9.getClass();
                function10.getClass();
                function9.invoke(nco0.f23305a);
                function10.invoke(new a7n0((byte) 29));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ acm0(byte b) {
        this.f635a = b;
    }
}
