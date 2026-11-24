package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class buk extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final buk f3234a = new buk(1, mik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/special_event/impl/databinding/DialogDisciplinePickerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_discipline_picker, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.lottie;
        DsLottieEmpty dsLottieEmpty = (DsLottieEmpty) yum0.f(viewInflate, R.id.lottie);
        if (dsLottieEmpty != null) {
            i = R.id.rvDisciplines;
            RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvDisciplines);
            if (recyclerView != null) {
                i = R.id.sfSearch;
                DsSearchField dsSearchField = (DsSearchField) yum0.f(viewInflate, R.id.sfSearch);
                if (dsSearchField != null) {
                    i = R.id.tvTitle;
                    if (((TextView) yum0.f(viewInflate, R.id.tvTitle)) != null) {
                        i = R.id.vSeparator;
                        View viewF = yum0.f(viewInflate, R.id.vSeparator);
                        if (viewF != null) {
                            return new mik(constraintLayout, dsLottieEmpty, recyclerView, dsSearchField, viewF);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
