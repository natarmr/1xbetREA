package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yuf0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yuf0 f43266a = new yuf0(1, avf0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/responsible_game_impl/databinding/ResponsibleGameDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.responsible_game_dialog, (ViewGroup) null, false);
        int i = R.id.content;
        if (((TextView) yum0.f(viewInflate, R.id.content)) != null) {
            i = R.id.moreButton;
            MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.moreButton);
            if (materialButton != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                MaterialButton materialButton2 = (MaterialButton) yum0.f(viewInflate, R.id.skipButton);
                if (materialButton2 != null) {
                    return new avf0(linearLayout, materialButton, materialButton2);
                }
                i = R.id.skipButton;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
