package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class mof0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f22132a;
    public Function0 b;
    public lof0 c;
    public final ObjectAnimator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mof0(Context context) {
        super(context, null, 0, 0);
        context.getClass();
        this.f22132a = maz.a(wez.b, new sue0(this, this, (byte) 3));
        this.b = new b4f0((byte) 13);
        lof0 lof0Var = lof0.c;
        this.c = lof0Var;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getBinding().b, (Property<ImageView, Float>) View.TRANSLATION_Y, 0.0f, -1000.0f);
        objectAnimatorOfFloat.setDuration(2000L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.d = objectAnimatorOfFloat;
        a(lof0Var, false);
    }

    private final jku0 getBinding() {
        return (jku0) this.f22132a.getValue();
    }

    public final void a(lof0 lof0Var, boolean z) {
        int i;
        if (this.c == lof0Var) {
            this.b.invoke();
            return;
        }
        this.c = lof0Var;
        ImageView imageView = getBinding().c;
        int iOrdinal = lof0Var.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.ic_resident_door_opened_win;
        } else if (iOrdinal == 1) {
            i = R.drawable.ic_resident_door_opened_loose;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            i = R.drawable.ic_resident_door_closed;
        }
        imageView.setImageResource(i);
        if (!z) {
            getBinding().b.setVisibility(8);
            this.b.invoke();
            return;
        }
        getBinding().b.setVisibility(0);
        ObjectAnimator objectAnimator = this.d;
        objectAnimator.getClass();
        objectAnimator.addListener(new r9g(this, (byte) 9));
        objectAnimator.start();
    }

    public final void setOnDoorAppliedListener(Function0<Unit> function0) {
        function0.getClass();
        this.b = function0;
    }
}
