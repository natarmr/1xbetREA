package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.check_box.old.DsCheckBoxOld;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u6w extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u6w f35156a = new u6w(1, c1w.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bethistory/impl/databinding/HistoryFilterDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.history_filter_dialog, (ViewGroup) null, false);
        int i = R.id.btnApplyFilter;
        MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.btnApplyFilter);
        if (materialButton != null) {
            i = R.id.filterAll;
            View viewF = yum0.f(viewInflate, R.id.filterAll);
            if (viewF != null) {
                int i2 = R.id.checkboxItem;
                DsCheckBoxOld dsCheckBoxOld = (DsCheckBoxOld) yum0.f(viewF, R.id.checkboxItem);
                if (dsCheckBoxOld != null) {
                    i2 = R.id.checkbox_item_text;
                    TextView textView = (TextView) yum0.f(viewF, R.id.checkbox_item_text);
                    if (textView != null) {
                        i2 = R.id.divider;
                        View viewF2 = yum0.f(viewF, R.id.divider);
                        if (viewF2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewF;
                            jk3 jk3Var = new jk3(constraintLayout, dsCheckBoxOld, textView, viewF2, constraintLayout, (byte) 7);
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                            RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.recyclerView);
                            if (recyclerView != null) {
                                return new c1w(constraintLayout2, materialButton, jk3Var, recyclerView);
                            }
                            i = R.id.recyclerView;
                        }
                    }
                }
                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                return null;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
