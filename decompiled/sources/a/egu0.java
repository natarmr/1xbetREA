package a;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class egu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7779a;
    public final Class b;
    public final byte c;
    public final byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public egu0(int i, Class cls, int i2, int i3, byte b) {
        this.e = b;
        this.f7779a = i;
        this.b = cls;
        this.d = i2;
        this.c = i3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0061. Please report as an issue. */
    public final void a(View view, Object obj) {
        Object tag;
        boolean zEquals;
        boolean z;
        int i = Build.VERSION.SDK_INT;
        byte b = this.e;
        byte b2 = this.c;
        if (i >= b2) {
            switch (b) {
                case 0:
                    mgu0.f(view, ((Boolean) obj).booleanValue());
                    break;
                case 1:
                    mgu0.e(view, (CharSequence) obj);
                    break;
                case 2:
                    ogu0.d(view, (CharSequence) obj);
                    break;
                default:
                    mgu0.d(view, ((Boolean) obj).booleanValue());
                    break;
            }
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        p6 p6Var = null;
        int i3 = this.f7779a;
        if (i2 >= b2) {
            switch (b) {
                case 0:
                    tag = Boolean.valueOf(mgu0.c(view));
                    break;
                case 1:
                    tag = mgu0.a(view);
                    break;
                case 2:
                    tag = ogu0.b(view);
                    break;
                default:
                    tag = Boolean.valueOf(mgu0.b(view));
                    break;
            }
        } else {
            tag = view.getTag(i3);
            if (!this.b.isInstance(tag)) {
                tag = null;
            }
        }
        boolean z2 = false;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) tag;
                Boolean bool2 = (Boolean) obj;
                if ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue())) {
                    z2 = true;
                }
                z = !z2;
                break;
            case 1:
                zEquals = TextUtils.equals((CharSequence) tag, (CharSequence) obj);
                z = !zEquals;
                break;
            case 2:
                zEquals = TextUtils.equals((CharSequence) tag, (CharSequence) obj);
                z = !zEquals;
                break;
            default:
                Boolean bool3 = (Boolean) tag;
                Boolean bool4 = (Boolean) obj;
                if ((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue())) {
                    z2 = true;
                }
                z = !z2;
                break;
        }
        if (z) {
            View.AccessibilityDelegate accessibilityDelegateE = rgu0.e(view);
            if (accessibilityDelegateE != null) {
                p6Var = accessibilityDelegateE instanceof o6 ? ((o6) accessibilityDelegateE).f24709a : new p6(accessibilityDelegateE);
            }
            if (p6Var == null) {
                p6Var = new p6();
            }
            rgu0.o(view, p6Var);
            view.setTag(i3, obj);
            rgu0.i(view, this.d);
        }
    }
}
