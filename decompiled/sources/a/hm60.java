package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hm60 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hm60 f13292a = new hm60(1, zik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/games_list/databinding/DialogOneXGameActionBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_one_x_game_action, (ViewGroup) null, false);
        int i = R.id.divider;
        View viewF = yum0.f(viewInflate, R.id.divider);
        if (viewF != null) {
            LinearLayout linearLayout = (LinearLayout) viewInflate;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tv_action_favorite);
            if (textView != null) {
                return new zik(linearLayout, viewF, textView);
            }
            i = R.id.tv_action_favorite;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
