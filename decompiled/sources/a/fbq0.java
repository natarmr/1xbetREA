package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetSpacing;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fbq0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fbq0 f9274a = new fbq0(1, pjk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/callback/impl/databinding/DialogThemeSelectorBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_theme_selector, (ViewGroup) null, false);
        int i = R.id.rvThemes;
        RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvThemes);
        if (recyclerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            if (((DsPresetSpacing) yum0.f(viewInflate, R.id.topSpacing)) != null) {
                return new pjk(constraintLayout, recyclerView);
            }
            i = R.id.topSpacing;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
