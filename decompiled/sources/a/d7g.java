package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTitle;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d7g extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d7g f5590a = new d7g(1, b7g.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDisciplinesDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cyber_calendar_disciplines_dialog, (ViewGroup) null, false);
        int i = R.id.buttonApply;
        DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.buttonApply);
        if (dsButton != null) {
            i = R.id.buttonFrame;
            if (((FrameLayout) yum0.f(viewInflate, R.id.buttonFrame)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                i = R.id.lottieEmptyView;
                DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(viewInflate, R.id.lottieEmptyView);
                if (dSLottieEmptyContainer != null) {
                    i = R.id.rvDisciplines;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvDisciplines);
                    if (recyclerView != null) {
                        i = R.id.searchView;
                        DsSearchField dsSearchField = (DsSearchField) yum0.f(viewInflate, R.id.searchView);
                        if (dsSearchField != null) {
                            i = R.id.tvTitle;
                            if (((DsPresetTitle) yum0.f(viewInflate, R.id.tvTitle)) != null) {
                                return new b7g(constraintLayout, dsButton, dSLottieEmptyContainer, recyclerView, dsSearchField);
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
