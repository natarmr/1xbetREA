package a;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes2.dex */
public final class pac extends zsm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26649a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pac(Object obj, byte b) {
        this.f26649a = b;
        this.b = obj;
    }

    @Override // a.zsm0
    public final void t(int i) {
        switch (this.f26649a) {
            case 0:
                break;
            default:
                r5q0 r5q0Var = (r5q0) this.b;
                r5q0Var.e = true;
                q5q0 q5q0Var = (q5q0) r5q0Var.f.get();
                if (q5q0Var != null) {
                    q5q0Var.a();
                }
                break;
        }
    }

    @Override // a.zsm0
    public final void u(Typeface typeface, boolean z) {
        byte b = this.f26649a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Chip chip = (Chip) obj;
                uac uacVar = chip.e;
                chip.setText(uacVar.o2 ? uacVar.p1 : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    r5q0 r5q0Var = (r5q0) obj;
                    r5q0Var.e = true;
                    q5q0 q5q0Var = (q5q0) r5q0Var.f.get();
                    if (q5q0Var != null) {
                        q5q0Var.a();
                    }
                    break;
                }
                break;
        }
    }

    private final void O(int i) {
    }
}
