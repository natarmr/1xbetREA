package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.games_mania.presentation.views.GamesManiaDice;
import org.xplatform.games_mania.presentation.views.GamesManiaMapView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y7t extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y7t f42169a = new y7t(1, c8t.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_mania/databinding/GamesManiaGameFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.backgroundImage;
        if (((AppCompatImageView) yum0.f(view, R.id.backgroundImage)) != null) {
            i = R.id.bonusText;
            TextView textView = (TextView) yum0.f(view, R.id.bonusText);
            if (textView != null) {
                i = R.id.dialogBonus;
                LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.dialogBonus);
                if (linearLayout != null) {
                    i = R.id.dialogContainer;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.dialogContainer);
                    if (frameLayout != null) {
                        i = R.id.dialogDefault;
                        FrameLayout frameLayout2 = (FrameLayout) yum0.f(view, R.id.dialogDefault);
                        if (frameLayout2 != null) {
                            i = R.id.diceContainer;
                            GamesManiaDice gamesManiaDice = (GamesManiaDice) yum0.f(view, R.id.diceContainer);
                            if (gamesManiaDice != null) {
                                i = R.id.gamesManiaContainer;
                                if (((ConstraintLayout) yum0.f(view, R.id.gamesManiaContainer)) != null) {
                                    i = R.id.gamesManiaTable;
                                    GamesManiaMapView gamesManiaMapView = (GamesManiaMapView) yum0.f(view, R.id.gamesManiaTable);
                                    if (gamesManiaMapView != null) {
                                        i = R.id.guideline3;
                                        if (((Guideline) yum0.f(view, R.id.guideline3)) != null) {
                                            i = R.id.guideline4;
                                            if (((Guideline) yum0.f(view, R.id.guideline4)) != null) {
                                                i = R.id.guideline5;
                                                if (((Guideline) yum0.f(view, R.id.guideline5)) != null) {
                                                    i = R.id.guideline6;
                                                    if (((Guideline) yum0.f(view, R.id.guideline6)) != null) {
                                                        i = R.id.imageBonus;
                                                        ImageView imageView = (ImageView) yum0.f(view, R.id.imageBonus);
                                                        if (imageView != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                            i = R.id.pazzle;
                                                            ImageView imageView2 = (ImageView) yum0.f(view, R.id.pazzle);
                                                            if (imageView2 != null) {
                                                                i = R.id.progress;
                                                                FrameLayout frameLayout3 = (FrameLayout) yum0.f(view, R.id.progress);
                                                                if (frameLayout3 != null) {
                                                                    i = R.id.puzzleDialog;
                                                                    View viewF = yum0.f(view, R.id.puzzleDialog);
                                                                    if (viewF != null) {
                                                                        int i2 = R.id.fifthPuzzleStartLineVertical;
                                                                        if (((Guideline) yum0.f(viewF, R.id.fifthPuzzleStartLineVertical)) != null) {
                                                                            i2 = R.id.fifthPuzzleStartSecondLineVertical;
                                                                            if (((Guideline) yum0.f(viewF, R.id.fifthPuzzleStartSecondLineVertical)) != null) {
                                                                                i2 = R.id.firstLineConvexPuzzleHorizontal;
                                                                                if (((Guideline) yum0.f(viewF, R.id.firstLineConvexPuzzleHorizontal)) != null) {
                                                                                    i2 = R.id.firstPuzzleEndLineVertical;
                                                                                    if (((Guideline) yum0.f(viewF, R.id.firstPuzzleEndLineVertical)) != null) {
                                                                                        i2 = R.id.firstPuzzleEndSecondLineVertical;
                                                                                        if (((Guideline) yum0.f(viewF, R.id.firstPuzzleEndSecondLineVertical)) != null) {
                                                                                            i2 = R.id.fourthPuzzleEndLineVertical;
                                                                                            if (((Guideline) yum0.f(viewF, R.id.fourthPuzzleEndLineVertical)) != null) {
                                                                                                i2 = R.id.fourthPuzzleStartLineVertical;
                                                                                                if (((Guideline) yum0.f(viewF, R.id.fourthPuzzleStartLineVertical)) != null) {
                                                                                                    i2 = R.id.gamesManiaFirstLineFifthPuzzle;
                                                                                                    ImageView imageView3 = (ImageView) yum0.f(viewF, R.id.gamesManiaFirstLineFifthPuzzle);
                                                                                                    if (imageView3 != null) {
                                                                                                        i2 = R.id.gamesManiaFirstLineFirstPuzzle;
                                                                                                        ImageView imageView4 = (ImageView) yum0.f(viewF, R.id.gamesManiaFirstLineFirstPuzzle);
                                                                                                        if (imageView4 != null) {
                                                                                                            i2 = R.id.gamesManiaFirstLineFourthPuzzle;
                                                                                                            ImageView imageView5 = (ImageView) yum0.f(viewF, R.id.gamesManiaFirstLineFourthPuzzle);
                                                                                                            if (imageView5 != null) {
                                                                                                                i2 = R.id.gamesManiaFirstLineSecondPuzzle;
                                                                                                                ImageView imageView6 = (ImageView) yum0.f(viewF, R.id.gamesManiaFirstLineSecondPuzzle);
                                                                                                                if (imageView6 != null) {
                                                                                                                    i2 = R.id.gamesManiaFirstLineThirdPuzzle;
                                                                                                                    ImageView imageView7 = (ImageView) yum0.f(viewF, R.id.gamesManiaFirstLineThirdPuzzle);
                                                                                                                    if (imageView7 != null) {
                                                                                                                        i2 = R.id.gamesManiaOk;
                                                                                                                        Button button = (Button) yum0.f(viewF, R.id.gamesManiaOk);
                                                                                                                        if (button != null) {
                                                                                                                            i2 = R.id.gamesManiaSecondLineFifthPuzzle;
                                                                                                                            ImageView imageView8 = (ImageView) yum0.f(viewF, R.id.gamesManiaSecondLineFifthPuzzle);
                                                                                                                            if (imageView8 != null) {
                                                                                                                                i2 = R.id.gamesManiaSecondLineFirstPuzzle;
                                                                                                                                ImageView imageView9 = (ImageView) yum0.f(viewF, R.id.gamesManiaSecondLineFirstPuzzle);
                                                                                                                                if (imageView9 != null) {
                                                                                                                                    i2 = R.id.gamesManiaSecondLineFourthPuzzle;
                                                                                                                                    ImageView imageView10 = (ImageView) yum0.f(viewF, R.id.gamesManiaSecondLineFourthPuzzle);
                                                                                                                                    if (imageView10 != null) {
                                                                                                                                        i2 = R.id.gamesManiaSecondLineSecondPuzzle;
                                                                                                                                        ImageView imageView11 = (ImageView) yum0.f(viewF, R.id.gamesManiaSecondLineSecondPuzzle);
                                                                                                                                        if (imageView11 != null) {
                                                                                                                                            i2 = R.id.gamesManiaSecondLineThirdPuzzle;
                                                                                                                                            ImageView imageView12 = (ImageView) yum0.f(viewF, R.id.gamesManiaSecondLineThirdPuzzle);
                                                                                                                                            if (imageView12 != null) {
                                                                                                                                                i2 = R.id.gamesManiaThirdLineFifthPuzzle;
                                                                                                                                                ImageView imageView13 = (ImageView) yum0.f(viewF, R.id.gamesManiaThirdLineFifthPuzzle);
                                                                                                                                                if (imageView13 != null) {
                                                                                                                                                    i2 = R.id.gamesManiaThirdLineFirstPuzzle;
                                                                                                                                                    if (((ImageView) yum0.f(viewF, R.id.gamesManiaThirdLineFirstPuzzle)) != null) {
                                                                                                                                                        i2 = R.id.gamesManiaThirdLineFourthPuzzle;
                                                                                                                                                        ImageView imageView14 = (ImageView) yum0.f(viewF, R.id.gamesManiaThirdLineFourthPuzzle);
                                                                                                                                                        if (imageView14 != null) {
                                                                                                                                                            i2 = R.id.gamesManiaThirdLineSecondPuzzle;
                                                                                                                                                            ImageView imageView15 = (ImageView) yum0.f(viewF, R.id.gamesManiaThirdLineSecondPuzzle);
                                                                                                                                                            if (imageView15 != null) {
                                                                                                                                                                i2 = R.id.gamesManiaThirdLineThirdPuzzle;
                                                                                                                                                                ImageView imageView16 = (ImageView) yum0.f(viewF, R.id.gamesManiaThirdLineThirdPuzzle);
                                                                                                                                                                if (imageView16 != null) {
                                                                                                                                                                    i2 = R.id.lineBottom;
                                                                                                                                                                    if (((Guideline) yum0.f(viewF, R.id.lineBottom)) != null) {
                                                                                                                                                                        i2 = R.id.lineConcavePuzzleHorizontal;
                                                                                                                                                                        if (((Guideline) yum0.f(viewF, R.id.lineConcavePuzzleHorizontal)) != null) {
                                                                                                                                                                            i2 = R.id.linePuzzleBottom;
                                                                                                                                                                            if (((Guideline) yum0.f(viewF, R.id.linePuzzleBottom)) != null) {
                                                                                                                                                                                i2 = R.id.linePuzzleEnd;
                                                                                                                                                                                if (((Guideline) yum0.f(viewF, R.id.linePuzzleEnd)) != null) {
                                                                                                                                                                                    i2 = R.id.linePuzzleStart;
                                                                                                                                                                                    if (((Guideline) yum0.f(viewF, R.id.linePuzzleStart)) != null) {
                                                                                                                                                                                        i2 = R.id.linePuzzleTop;
                                                                                                                                                                                        if (((Guideline) yum0.f(viewF, R.id.linePuzzleTop)) != null) {
                                                                                                                                                                                            i2 = R.id.lineTop;
                                                                                                                                                                                            if (((Guideline) yum0.f(viewF, R.id.lineTop)) != null) {
                                                                                                                                                                                                i2 = R.id.puzzleTextviewFirstLine;
                                                                                                                                                                                                if (((TextView) yum0.f(viewF, R.id.puzzleTextviewFirstLine)) != null) {
                                                                                                                                                                                                    i2 = R.id.puzzleTextviewSecondLine;
                                                                                                                                                                                                    if (((TextView) yum0.f(viewF, R.id.puzzleTextviewSecondLine)) != null) {
                                                                                                                                                                                                        i2 = R.id.puzzleView;
                                                                                                                                                                                                        if (((ConstraintLayout) yum0.f(viewF, R.id.puzzleView)) != null) {
                                                                                                                                                                                                            i2 = R.id.secondLineConcavePuzzleHorizontalBottom;
                                                                                                                                                                                                            if (((Guideline) yum0.f(viewF, R.id.secondLineConcavePuzzleHorizontalBottom)) != null) {
                                                                                                                                                                                                                i2 = R.id.secondLineConcavePuzzleHorizontalTop;
                                                                                                                                                                                                                if (((Guideline) yum0.f(viewF, R.id.secondLineConcavePuzzleHorizontalTop)) != null) {
                                                                                                                                                                                                                    i2 = R.id.secondLineConvexPuzzleHorizontalBottom;
                                                                                                                                                                                                                    if (((Guideline) yum0.f(viewF, R.id.secondLineConvexPuzzleHorizontalBottom)) != null) {
                                                                                                                                                                                                                        i2 = R.id.secondPuzzleEndLineVertical;
                                                                                                                                                                                                                        if (((Guideline) yum0.f(viewF, R.id.secondPuzzleEndLineVertical)) != null) {
                                                                                                                                                                                                                            i2 = R.id.secondPuzzleStartLineVertical;
                                                                                                                                                                                                                            if (((Guideline) yum0.f(viewF, R.id.secondPuzzleStartLineVertical)) != null) {
                                                                                                                                                                                                                                i2 = R.id.thirdLineConvexPuzzleHorizontalTop;
                                                                                                                                                                                                                                if (((Guideline) yum0.f(viewF, R.id.thirdLineConvexPuzzleHorizontalTop)) != null) {
                                                                                                                                                                                                                                    i2 = R.id.thirdPuzzleEndLineVertical;
                                                                                                                                                                                                                                    if (((Guideline) yum0.f(viewF, R.id.thirdPuzzleEndLineVertical)) != null) {
                                                                                                                                                                                                                                        i2 = R.id.thirdPuzzleEndSecondLineVertical;
                                                                                                                                                                                                                                        if (((Guideline) yum0.f(viewF, R.id.thirdPuzzleEndSecondLineVertical)) != null) {
                                                                                                                                                                                                                                            i2 = R.id.thirdPuzzleStartLineVertical;
                                                                                                                                                                                                                                            if (((Guideline) yum0.f(viewF, R.id.thirdPuzzleStartLineVertical)) != null) {
                                                                                                                                                                                                                                                i2 = R.id.thirdPuzzleStartSecondLineVertical;
                                                                                                                                                                                                                                                if (((Guideline) yum0.f(viewF, R.id.thirdPuzzleStartSecondLineVertical)) != null) {
                                                                                                                                                                                                                                                    jbo jboVar = new jbo((ConstraintLayout) viewF, imageView3, imageView4, imageView5, imageView6, imageView7, button, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16);
                                                                                                                                                                                                                                                    i = R.id.win_text;
                                                                                                                                                                                                                                                    TextView textView2 = (TextView) yum0.f(view, R.id.win_text);
                                                                                                                                                                                                                                                    if (textView2 != null) {
                                                                                                                                                                                                                                                        i = R.id.winTextBonus;
                                                                                                                                                                                                                                                        TextView textView3 = (TextView) yum0.f(view, R.id.winTextBonus);
                                                                                                                                                                                                                                                        if (textView3 != null) {
                                                                                                                                                                                                                                                            return new c8t(constraintLayout, textView, linearLayout, frameLayout, frameLayout2, gamesManiaDice, gamesManiaMapView, imageView, imageView2, frameLayout3, jboVar, textView2, textView3);
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
                                                                            }
                                                                        }
                                                                        hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                                                                        return null;
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
