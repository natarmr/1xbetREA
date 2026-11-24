package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qxo0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qxo0 f29495a = new qxo0(1, ojk.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/bet_constructor/impl/databinding/DialogTeamActionBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_team_action, (ViewGroup) null, false);
        int i = R.id.delete_container;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) yum0.f(viewInflate, R.id.delete_container);
        if (linearLayoutCompat != null) {
            i = R.id.move_container;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) yum0.f(viewInflate, R.id.move_container);
            if (linearLayoutCompat2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i = R.id.second_divider;
                View viewF = yum0.f(viewInflate, R.id.second_divider);
                if (viewF != null) {
                    i = R.id.tv_delete_team;
                    if (((TextView) yum0.f(viewInflate, R.id.tv_delete_team)) != null) {
                        i = R.id.tv_move;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tv_move);
                        if (textView != null) {
                            return new ojk(linearLayout, linearLayoutCompat, linearLayoutCompat2, viewF, textView);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
