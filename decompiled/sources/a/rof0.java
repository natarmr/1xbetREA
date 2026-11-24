package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.resident.presentation.views.ResidentDoorLineView;
import org.xplatform.resident.presentation.views.ResidentPersonView;
import org.xplatform.resident.presentation.views.ResidentSafeLineView;
import org.xplatform.resident.presentation.views.ResidentSmokeView;
import org.xplatform.resident.presentation.views.ResidentTagView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rof0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rof0 f30833a = new rof0(1, e4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/resident/databinding/FragmentResidentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnTakeMoney;
        AppCompatButton appCompatButton = (AppCompatButton) yum0.f(view, R.id.btnTakeMoney);
        if (appCompatButton != null) {
            i = R.id.guideDoorsBottom;
            if (((Guideline) yum0.f(view, R.id.guideDoorsBottom)) != null) {
                i = R.id.guideExtinguisherBottom;
                if (((Guideline) yum0.f(view, R.id.guideExtinguisherBottom)) != null) {
                    i = R.id.guideExtinguisherEnd;
                    if (((Guideline) yum0.f(view, R.id.guideExtinguisherEnd)) != null) {
                        i = R.id.guideExtinguisherStart;
                        if (((Guideline) yum0.f(view, R.id.guideExtinguisherStart)) != null) {
                            i = R.id.guideExtinguisherTop;
                            if (((Guideline) yum0.f(view, R.id.guideExtinguisherTop)) != null) {
                                i = R.id.guidePersonEnd;
                                if (((Guideline) yum0.f(view, R.id.guidePersonEnd)) != null) {
                                    i = R.id.guidePersonStart;
                                    if (((Guideline) yum0.f(view, R.id.guidePersonStart)) != null) {
                                        i = R.id.guidePersonTop;
                                        if (((Guideline) yum0.f(view, R.id.guidePersonTop)) != null) {
                                            i = R.id.guideSafesBottom;
                                            if (((Guideline) yum0.f(view, R.id.guideSafesBottom)) != null) {
                                                i = R.id.guideSmokeBottom;
                                                if (((Guideline) yum0.f(view, R.id.guideSmokeBottom)) != null) {
                                                    i = R.id.guideSmokeTop;
                                                    if (((Guideline) yum0.f(view, R.id.guideSmokeTop)) != null) {
                                                        i = R.id.guideStepsBottom;
                                                        if (((Guideline) yum0.f(view, R.id.guideStepsBottom)) != null) {
                                                            i = R.id.guideTagBottom;
                                                            if (((Guideline) yum0.f(view, R.id.guideTagBottom)) != null) {
                                                                i = R.id.guideTagEnd;
                                                                if (((Guideline) yum0.f(view, R.id.guideTagEnd)) != null) {
                                                                    i = R.id.guideTagStart;
                                                                    if (((Guideline) yum0.f(view, R.id.guideTagStart)) != null) {
                                                                        i = R.id.guideTagTop;
                                                                        if (((Guideline) yum0.f(view, R.id.guideTagTop)) != null) {
                                                                            i = R.id.ivExtinguisher;
                                                                            if (((ImageView) yum0.f(view, R.id.ivExtinguisher)) != null) {
                                                                                i = R.id.residentDoorLineView;
                                                                                ResidentDoorLineView residentDoorLineView = (ResidentDoorLineView) yum0.f(view, R.id.residentDoorLineView);
                                                                                if (residentDoorLineView != null) {
                                                                                    i = R.id.residentPersonView;
                                                                                    ResidentPersonView residentPersonView = (ResidentPersonView) yum0.f(view, R.id.residentPersonView);
                                                                                    if (residentPersonView != null) {
                                                                                        i = R.id.residentSafeLineView;
                                                                                        ResidentSafeLineView residentSafeLineView = (ResidentSafeLineView) yum0.f(view, R.id.residentSafeLineView);
                                                                                        if (residentSafeLineView != null) {
                                                                                            i = R.id.residentSmokeView;
                                                                                            ResidentSmokeView residentSmokeView = (ResidentSmokeView) yum0.f(view, R.id.residentSmokeView);
                                                                                            if (residentSmokeView != null) {
                                                                                                i = R.id.residentTagView;
                                                                                                ResidentTagView residentTagView = (ResidentTagView) yum0.f(view, R.id.residentTagView);
                                                                                                if (residentTagView != null) {
                                                                                                    i = R.id.tvCurrentBet;
                                                                                                    TextView textView = (TextView) yum0.f(view, R.id.tvCurrentBet);
                                                                                                    if (textView != null) {
                                                                                                        i = R.id.tvDescription;
                                                                                                        TextView textView2 = (TextView) yum0.f(view, R.id.tvDescription);
                                                                                                        if (textView2 != null) {
                                                                                                            i = R.id.vSecondLife;
                                                                                                            Group group = (Group) yum0.f(view, R.id.vSecondLife);
                                                                                                            if (group != null) {
                                                                                                                return new e4r((ConstraintLayout) view, appCompatButton, residentDoorLineView, residentPersonView, residentSafeLineView, residentSmokeView, residentTagView, textView, textView2, group);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
