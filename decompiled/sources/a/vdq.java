package a;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.biometric.internal.ui.FingerprintDialogActivity;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class vdq implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37244a;
    public final /* synthetic */ FingerprintDialogActivity b;

    public /* synthetic */ vdq(FingerprintDialogActivity fingerprintDialogActivity, byte b) {
        this.f37244a = b;
        this.b = fingerprintDialogActivity;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f37244a;
        int i = 1;
        char c = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        FingerprintDialogActivity fingerprintDialogActivity = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    l5a l5aVar = l5a.b;
                    int i2 = FingerprintDialogActivity.Z;
                    fingerprintDialogActivity.r(l5aVar);
                    fingerprintDialogActivity.finish();
                }
                return Unit.f46060a;
            case 1:
                aeq aeqVar = (aeq) obj;
                int i3 = FingerprintDialogActivity.Z;
                if (fingerprintDialogActivity.t().f != aeq.f741a || aeqVar != aeq.b) {
                    c4m0 c4m0Var = fingerprintDialogActivity.w;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    fingerprintDialogActivity.w = qjj.W(x0x.Q(fingerprintDialogActivity.x()), null, null, new wdq(fingerprintDialogActivity, objArr == true ? 1 : 0, c == true ? 1 : 0), 3);
                }
                return Unit.f46060a;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue != 0) {
                    Drawable drawable = fingerprintDialogActivity.getDrawable(iIntValue);
                    ImageView imageView = fingerprintDialogActivity.x;
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                    }
                    if (((Boolean) fingerprintDialogActivity.t().n.getValue()).booleanValue() && drawable != null && (drawable instanceof AnimatedVectorDrawable)) {
                        ((AnimatedVectorDrawable) drawable).start();
                    }
                }
                return Unit.f46060a;
            case 3:
                Pair pair = (Pair) obj;
                CharSequence charSequence = (CharSequence) pair.f46059a;
                boolean zBooleanValue = ((Boolean) pair.b).booleanValue();
                TextView textView = fingerprintDialogActivity.y;
                if (!Intrinsics.d(textView != null ? textView.getText() : null, charSequence)) {
                    TextView textView2 = fingerprintDialogActivity.y;
                    if (textView2 != null) {
                        textView2.setText(charSequence);
                    }
                    TextView textView3 = fingerprintDialogActivity.y;
                    if (textView3 != null) {
                        textView3.setTextColor(zBooleanValue ? fingerprintDialogActivity.z : fingerprintDialogActivity.A);
                    }
                }
                return Unit.f46060a;
            case 4:
                CharSequence charSequence2 = (CharSequence) obj;
                if (charSequence2 != null) {
                    int i4 = FingerprintDialogActivity.Z;
                    fingerprintDialogActivity.u(charSequence2);
                }
                return Unit.f46060a;
            case 5:
                fingerprintDialogActivity.finish();
                return Unit.f46060a;
            case 6:
                fingerprintDialogActivity.finish();
                return Unit.f46060a;
            case 7:
                d58 d58Var = (d58) obj;
                int i5 = d58Var.f5492a;
                byte b2 = 8;
                switch (i5) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 20:
                    case 22:
                        i = i5;
                        break;
                    case 6:
                    case 16:
                    case 17:
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    default:
                        i = 8;
                        break;
                    case 18:
                    case 21:
                        break;
                }
                if (i == 7 || i == 9) {
                    int i6 = FingerprintDialogActivity.Z;
                    ((yzc0) fingerprintDialogActivity.s().b).getClass();
                    if (CollectionsKt.x0(iun.f15405a) != null) {
                        hny.b();
                        return null;
                    }
                }
                if (i == 5) {
                    fingerprintDialogActivity.finish();
                } else {
                    int i7 = FingerprintDialogActivity.Z;
                    if (fingerprintDialogActivity.t().c) {
                        fingerprintDialogActivity.finish();
                    } else {
                        fingerprintDialogActivity.u(d58Var.b);
                        qjj.W(x0x.Q(fingerprintDialogActivity.x()), null, null, new wdq(fingerprintDialogActivity, objArr2 == true ? 1 : 0, b2), 3);
                    }
                }
                return Unit.f46060a;
            default:
                fingerprintDialogActivity.u(fingerprintDialogActivity.getString(R.string.fingerprint_not_recognized));
                return Unit.f46060a;
        }
    }
}
