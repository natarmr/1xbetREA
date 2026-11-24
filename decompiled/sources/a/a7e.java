package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.consultantchat.presentation.views.MiddleMultilineTextView;
import org.xplatform.ui_core.viewcomponents.layouts.frame.ProgressBarWithSendClock;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a7e extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a7e f364a = new a7e(1, kzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/consultantchat/impl/databinding/FragmentConsultantChatBinding;", 0);

    /* JADX WARN: Code duplicated, block: B:68:0x01ab A[PHI: r1
  0x01ab: PHI (r1v1 int) = (r1v0 int), (r1v3 int), (r1v4 int) binds: [B:3:0x0011, B:5:0x001c, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        View view = (View) obj;
        view.getClass();
        int i = R.id.attachFileSeparator;
        View viewF = yum0.f(view, R.id.attachFileSeparator);
        if (viewF != null) {
            i = R.id.btnScrollToBottom;
            ImageView imageView = (ImageView) yum0.f(view, R.id.btnScrollToBottom);
            if (imageView != null) {
                i = R.id.buttonOthersContacts;
                MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.buttonOthersContacts);
                if (materialButton != null) {
                    str = "Missing required view with ID: ";
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.criticalErrorLayout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(view, R.id.criticalErrorLayout);
                    if (constraintLayout2 != null) {
                        i = R.id.editTextMessage;
                        TextInputEditText textInputEditText = (TextInputEditText) yum0.f(view, R.id.editTextMessage);
                        if (textInputEditText != null) {
                            i = R.id.imageViewCriticalError;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.imageViewCriticalError);
                            if (appCompatImageView != null) {
                                i = R.id.imageViewPlaceholder;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) yum0.f(view, R.id.imageViewPlaceholder);
                                if (appCompatImageView2 != null) {
                                    i = R.id.imgAttachFile;
                                    ImageView imageView2 = (ImageView) yum0.f(view, R.id.imgAttachFile);
                                    if (imageView2 != null) {
                                        i = R.id.imgSendButton;
                                        ImageView imageView3 = (ImageView) yum0.f(view, R.id.imgSendButton);
                                        if (imageView3 != null) {
                                            i = R.id.imgTyping;
                                            ImageView imageView4 = (ImageView) yum0.f(view, R.id.imgTyping);
                                            if (imageView4 != null) {
                                                i = R.id.layoutAttachedFile;
                                                View viewF2 = yum0.f(view, R.id.layoutAttachedFile);
                                                if (viewF2 != null) {
                                                    int i2 = R.id.imgCancelAttach;
                                                    ImageView imageView5 = (ImageView) yum0.f(viewF2, R.id.imgCancelAttach);
                                                    if (imageView5 != null) {
                                                        i2 = R.id.imgPicture;
                                                        ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewF2, R.id.imgPicture);
                                                        if (shapeableImageView != null) {
                                                            i2 = R.id.txtFileDescription;
                                                            MiddleMultilineTextView middleMultilineTextView = (MiddleMultilineTextView) yum0.f(viewF2, R.id.txtFileDescription);
                                                            if (middleMultilineTextView != null) {
                                                                i2 = R.id.txtFileSize;
                                                                TextView textView = (TextView) yum0.f(viewF2, R.id.txtFileSize);
                                                                if (textView != null) {
                                                                    jk3 jk3Var = new jk3((ConstraintLayout) viewF2, imageView5, shapeableImageView, middleMultilineTextView, textView, (byte) 9);
                                                                    i = R.id.layoutEditMessage;
                                                                    LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.layoutEditMessage);
                                                                    if (linearLayout != null) {
                                                                        i = R.id.listAttachedImages;
                                                                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.listAttachedImages);
                                                                        if (recyclerView != null) {
                                                                            i = R.id.listMessages;
                                                                            RecyclerView recyclerView2 = (RecyclerView) yum0.f(view, R.id.listMessages);
                                                                            if (recyclerView2 != null) {
                                                                                i = R.id.lottieEmptyView;
                                                                                LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                                                                                if (lottieView != null) {
                                                                                    i = R.id.noMessagesLayout;
                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) yum0.f(view, R.id.noMessagesLayout);
                                                                                    if (constraintLayout3 != null) {
                                                                                        i = R.id.progressBar;
                                                                                        ProgressBarWithSendClock progressBarWithSendClock = (ProgressBarWithSendClock) yum0.f(view, R.id.progressBar);
                                                                                        if (progressBarWithSendClock != null) {
                                                                                            i = R.id.progressTimer;
                                                                                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) yum0.f(view, R.id.progressTimer);
                                                                                            if (circularProgressIndicator != null) {
                                                                                                i = R.id.sendMessageMenu;
                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) yum0.f(view, R.id.sendMessageMenu);
                                                                                                if (constraintLayout4 != null) {
                                                                                                    i = R.id.textCriticalDescription;
                                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(view, R.id.textCriticalDescription);
                                                                                                    if (appCompatTextView != null) {
                                                                                                        i = R.id.textCriticalTitleDescription;
                                                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) yum0.f(view, R.id.textCriticalTitleDescription);
                                                                                                        if (appCompatTextView2 != null) {
                                                                                                            i = R.id.textPlaceholder;
                                                                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) yum0.f(view, R.id.textPlaceholder);
                                                                                                            if (appCompatTextView3 != null) {
                                                                                                                i = R.id.toolbar;
                                                                                                                MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                                                                                                                if (materialToolbar != null) {
                                                                                                                    i = R.id.txtInvokeOperator;
                                                                                                                    TextView textView2 = (TextView) yum0.f(view, R.id.txtInvokeOperator);
                                                                                                                    if (textView2 != null) {
                                                                                                                        i = R.id.txtTitle;
                                                                                                                        if (((TextView) yum0.f(view, R.id.txtTitle)) != null) {
                                                                                                                            i = R.id.txtUnreadCount;
                                                                                                                            TextView textView3 = (TextView) yum0.f(view, R.id.txtUnreadCount);
                                                                                                                            if (textView3 != null) {
                                                                                                                                i = R.id.txtUserAction;
                                                                                                                                TextView textView4 = (TextView) yum0.f(view, R.id.txtUserAction);
                                                                                                                                if (textView4 != null) {
                                                                                                                                    return new kzq(constraintLayout, viewF, imageView, materialButton, constraintLayout2, textInputEditText, appCompatImageView, appCompatImageView2, imageView2, imageView3, imageView4, jk3Var, linearLayout, recyclerView, recyclerView2, lottieView, constraintLayout3, progressBarWithSendClock, circularProgressIndicator, constraintLayout4, appCompatTextView, appCompatTextView2, appCompatTextView3, materialToolbar, textView2, textView3, textView4);
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
                                                                }
                                                            }
                                                        }
                                                    }
                                                    hny.u(str.concat(viewF2.getResources().getResourceName(i2)));
                                                    return null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    str = "Missing required view with ID: ";
                }
            } else {
                str = "Missing required view with ID: ";
            }
        } else {
            str = "Missing required view with ID: ";
        }
        hny.u(str.concat(view.getResources().getResourceName(i)));
        return null;
    }
}
