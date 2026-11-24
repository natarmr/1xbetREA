package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u4g extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u4g f35046a = new u4g(1, w4g.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarChampInfoDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cyber_calendar_champ_info_dialog, (ViewGroup) null, false);
        int i = R.id.btnSelect;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.btnSelect);
        if (dsButton != null) {
            i = R.id.buttonContainer;
            if (((ConstraintLayout) yum0.f(viewInflate, R.id.buttonContainer)) != null) {
                i = R.id.champDateTitle;
                if (((TextView) yum0.f(viewInflate, R.id.champDateTitle)) != null) {
                    i = R.id.datesContainer;
                    ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewInflate, R.id.datesContainer);
                    if (constraintLayout != null) {
                        i = R.id.disciplineContainer;
                        if (((ConstraintLayout) yum0.f(viewInflate, R.id.disciplineContainer)) != null) {
                            i = R.id.disciplineTitle;
                            if (((TextView) yum0.f(viewInflate, R.id.disciplineTitle)) != null) {
                                i = R.id.ivDiscipline;
                                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivDiscipline);
                                if (imageView != null) {
                                    i = R.id.locationContainer;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewInflate, R.id.locationContainer);
                                    if (constraintLayout2 != null) {
                                        i = R.id.locationTitle;
                                        if (((TextView) yum0.f(viewInflate, R.id.locationTitle)) != null) {
                                            i = R.id.prizePoolContainer;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) yum0.f(viewInflate, R.id.prizePoolContainer);
                                            if (constraintLayout3 != null) {
                                                i = R.id.prizePoolTitle;
                                                if (((TextView) yum0.f(viewInflate, R.id.prizePoolTitle)) != null) {
                                                    i = R.id.tvChampDates;
                                                    TextView textView = (TextView) yum0.f(viewInflate, R.id.tvChampDates);
                                                    if (textView != null) {
                                                        i = R.id.tv_disciplineName;
                                                        TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tv_disciplineName);
                                                        if (textView2 != null) {
                                                            i = R.id.tvLocation;
                                                            TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvLocation);
                                                            if (textView3 != null) {
                                                                i = R.id.tvPrizePool;
                                                                TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvPrizePool);
                                                                if (textView4 != null) {
                                                                    i = R.id.tvTitle;
                                                                    DsPresetTitle dsPresetTitle = (DsPresetTitle) yum0.f(viewInflate, R.id.tvTitle);
                                                                    if (dsPresetTitle != null) {
                                                                        return new w4g((LinearLayout) viewInflate, dsButton, constraintLayout, imageView, constraintLayout2, constraintLayout3, textView, textView2, textView3, textView4, dsPresetTitle);
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
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
