package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.video.GameVideoView;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vws extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vws f38168a = new vws(1, e0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/game_broadcasting/impl/databinding/FragmentGameVideoLayoutBinding;", 0);

    /* JADX WARN: Code duplicated, block: B:50:0x0129 A[PHI: r2
  0x0129: PHI (r2v2 int) = (r2v1 int), (r2v3 int), (r2v4 int) binds: [B:11:0x004a, B:13:0x0056, B:15:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.activatePhoneContainer;
        View viewF = yum0.f(view, R.id.activatePhoneContainer);
        if (viewF != null) {
            int i2 = R.id.btnActivate;
            DsButton dsButton = (DsButton) yum0.f(viewF, R.id.btnActivate);
            if (dsButton != null) {
                i2 = R.id.ivLock;
                ImageView imageView = (ImageView) yum0.f(viewF, R.id.ivLock);
                if (imageView != null) {
                    TextView textView = (TextView) yum0.f(viewF, R.id.tvMessage);
                    if (textView != null) {
                        qk qkVar = new qk((ConstraintLayout) viewF, dsButton, imageView, textView, (byte) 0);
                        int i3 = R.id.alertTextView;
                        TextView textView2 = (TextView) yum0.f(view, R.id.alertTextView);
                        if (textView2 != null) {
                            i3 = R.id.authButton;
                            DsButton dsButton2 = (DsButton) yum0.f(view, R.id.authButton);
                            if (dsButton2 != null) {
                                i3 = R.id.bindPhoneContainer;
                                View viewF2 = yum0.f(view, R.id.bindPhoneContainer);
                                if (viewF2 != null) {
                                    DsButton dsButton3 = (DsButton) yum0.f(viewF2, R.id.btnBind);
                                    if (dsButton3 != null) {
                                        ImageView imageView2 = (ImageView) yum0.f(viewF2, R.id.ivLock);
                                        if (imageView2 != null) {
                                            TextView textView3 = (TextView) yum0.f(viewF2, R.id.tvMessage);
                                            if (textView3 != null) {
                                                qk qkVar2 = new qk((ConstraintLayout) viewF2, dsButton3, imageView2, textView3, (byte) 1);
                                                i = R.id.errorBackground;
                                                View viewF3 = yum0.f(view, R.id.errorBackground);
                                                if (viewF3 != null) {
                                                    i = R.id.fAccessMessage;
                                                    Flow flow = (Flow) yum0.f(view, R.id.fAccessMessage);
                                                    if (flow != null) {
                                                        i = R.id.fAuthButtons;
                                                        if (((Flow) yum0.f(view, R.id.fAuthButtons)) != null) {
                                                            i = R.id.fAuthMessage;
                                                            if (((Flow) yum0.f(view, R.id.fAuthMessage)) != null) {
                                                                i = R.id.gameVideoView;
                                                                GameVideoView gameVideoView = (GameVideoView) yum0.f(view, R.id.gameVideoView);
                                                                if (gameVideoView != null) {
                                                                    i = R.id.grAuthContainer;
                                                                    Group group = (Group) yum0.f(view, R.id.grAuthContainer);
                                                                    if (group != null) {
                                                                        i = R.id.lockImageView;
                                                                        ImageView imageView3 = (ImageView) yum0.f(view, R.id.lockImageView);
                                                                        if (imageView3 != null) {
                                                                            i = R.id.registerButton;
                                                                            DsButton dsButton4 = (DsButton) yum0.f(view, R.id.registerButton);
                                                                            if (dsButton4 != null) {
                                                                                i = R.id.tvErrorMessage;
                                                                                TextView textView4 = (TextView) yum0.f(view, R.id.tvErrorMessage);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.vBackground;
                                                                                    View viewF4 = yum0.f(view, R.id.vBackground);
                                                                                    if (viewF4 != null) {
                                                                                        i = R.id.vSizeContainer;
                                                                                        View viewF5 = yum0.f(view, R.id.vSizeContainer);
                                                                                        if (viewF5 != null) {
                                                                                            return new e0r((ConstraintLayout) view, qkVar, textView2, dsButton2, qkVar2, viewF3, flow, gameVideoView, group, imageView3, dsButton4, textView4, viewF4, viewF5);
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
                                            } else {
                                                i2 = R.id.tvMessage;
                                            }
                                        }
                                    } else {
                                        i2 = R.id.btnBind;
                                    }
                                    hny.u("Missing required view with ID: ".concat(viewF2.getResources().getResourceName(i2)));
                                    return null;
                                }
                                i = i3;
                            } else {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        i2 = R.id.tvMessage;
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
