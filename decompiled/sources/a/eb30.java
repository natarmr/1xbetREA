package a;

import android.os.CountDownTimer;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.components.search_field.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class eb30 extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7501a = 0;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb30(TextInputLayout textInputLayout) {
        super(0L, 200L);
        this.b = textInputLayout;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        ViewParent parent;
        switch (this.f7501a) {
            case 0:
                ((Function0) this.b).invoke();
                break;
            default:
                AppCompatTextView errorText$uikit = ((TextInputLayout) this.b).getErrorText$uikit();
                ViewParent parent2 = (errorText$uikit == null || (parent = errorText$uikit.getParent()) == null) ? null : parent.getParent();
                ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                if (viewGroup != null) {
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingBottom(), viewGroup.getPaddingRight(), 0);
                    viewGroup.setTranslationY(0.0f);
                }
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        byte b = this.f7501a;
    }

    public /* synthetic */ eb30(long j, long j2) {
        super(j, j2);
    }

    private final void a(long j) {
    }

    private final void b(long j) {
    }
}
