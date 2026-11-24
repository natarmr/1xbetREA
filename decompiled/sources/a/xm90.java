package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.PicCodeEditField;

/* JADX INFO: loaded from: classes.dex */
public final class xm90 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41114a;
    public final /* synthetic */ PicCodeEditField b;

    public /* synthetic */ xm90(PicCodeEditField picCodeEditField, byte b) {
        this.f41114a = b;
        this.b = picCodeEditField;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.f41114a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.f41114a;
        PicCodeEditField picCodeEditField = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = picCodeEditField.g;
                if (animatorSet != null && Intrinsics.d(animatorSet, animator)) {
                    picCodeEditField.g = null;
                    Function1 function1 = picCodeEditField.h;
                    if (function1 != null) {
                        function1.invoke(picCodeEditField.getStringBuilder().toString());
                    }
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = picCodeEditField.g;
                if (animatorSet2 != null && Intrinsics.d(animatorSet2, animator)) {
                    picCodeEditField.g = null;
                }
                Function1 function2 = picCodeEditField.h;
                if (function2 != null) {
                    function2.invoke(picCodeEditField.getStringBuilder().toString());
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.f41114a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.f41114a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }
}
