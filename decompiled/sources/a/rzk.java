package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.domino.presentation.views.DominoHandView;
import org.xplatform.domino.presentation.views.DominoTableView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rzk extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rzk f31365a = new rzk(1, szq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/domino/databinding/FragmentDominoBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.dominoView;
        View viewF = yum0.f(view, R.id.dominoView);
        if (viewF != null) {
            FrameLayout frameLayout = (FrameLayout) viewF;
            int i2 = R.id.giveUp;
            Button button = (Button) yum0.f(viewF, R.id.giveUp);
            if (button != null) {
                i2 = R.id.infoMessage;
                TextView textView = (TextView) yum0.f(viewF, R.id.infoMessage);
                if (textView != null) {
                    i2 = R.id.leftButton;
                    ImageView imageView = (ImageView) yum0.f(viewF, R.id.leftButton);
                    if (imageView != null) {
                        i2 = R.id.market;
                        TextView textView2 = (TextView) yum0.f(viewF, R.id.market);
                        if (textView2 != null) {
                            i2 = R.id.opponentHand;
                            DominoHandView dominoHandView = (DominoHandView) yum0.f(viewF, R.id.opponentHand);
                            if (dominoHandView != null) {
                                i2 = R.id.rightButton;
                                ImageView imageView2 = (ImageView) yum0.f(viewF, R.id.rightButton);
                                if (imageView2 != null) {
                                    i2 = R.id.skip;
                                    Button button2 = (Button) yum0.f(viewF, R.id.skip);
                                    if (button2 != null) {
                                        i2 = R.id.table;
                                        DominoTableView dominoTableView = (DominoTableView) yum0.f(viewF, R.id.table);
                                        if (dominoTableView != null) {
                                            i2 = R.id.take;
                                            Button button3 = (Button) yum0.f(viewF, R.id.take);
                                            if (button3 != null) {
                                                i2 = R.id.useCaseContent;
                                                LinearLayout linearLayout = (LinearLayout) yum0.f(viewF, R.id.useCaseContent);
                                                if (linearLayout != null) {
                                                    i2 = R.id.viewButton;
                                                    LinearLayout linearLayout2 = (LinearLayout) yum0.f(viewF, R.id.viewButton);
                                                    if (linearLayout2 != null) {
                                                        i2 = R.id.yourHand;
                                                        DominoHandView dominoHandView2 = (DominoHandView) yum0.f(viewF, R.id.yourHand);
                                                        if (dominoHandView2 != null) {
                                                            e0f e0fVar = new e0f(frameLayout, button, textView, imageView, textView2, dominoHandView, imageView2, button2, dominoTableView, button3, linearLayout, linearLayout2, dominoHandView2);
                                                            i = R.id.startImage;
                                                            ImageView imageView3 = (ImageView) yum0.f(view, R.id.startImage);
                                                            if (imageView3 != null) {
                                                                return new szq((ConstraintLayout) view, e0fVar, imageView3);
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
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
