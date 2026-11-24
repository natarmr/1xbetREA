package a;

import android.view.View;
import org.xplatform.ui_core.AnimatedCoefficientView;

/* JADX INFO: loaded from: classes6.dex */
public final class m43 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0d f21147a;
    public final /* synthetic */ AnimatedCoefficientView b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public m43(l0d l0dVar, AnimatedCoefficientView animatedCoefficientView, boolean z, boolean z2) {
        this.f21147a = l0dVar;
        this.b = animatedCoefficientView;
        this.c = z;
        this.d = z2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        int iOrdinal = this.f21147a.ordinal();
        AnimatedCoefficientView animatedCoefficientView = this.b;
        if (iOrdinal == 0) {
            int i9 = AnimatedCoefficientView.j1;
            animatedCoefficientView.g(this.d);
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            int i10 = AnimatedCoefficientView.j1;
            animatedCoefficientView.h();
            animatedCoefficientView.a();
            animatedCoefficientView.l();
            return;
        }
        if (iOrdinal == 3) {
            int i11 = AnimatedCoefficientView.j1;
            animatedCoefficientView.a();
            animatedCoefficientView.j();
            animatedCoefficientView.h();
            animatedCoefficientView.b.setAlpha(0);
            return;
        }
        if (iOrdinal == 4) {
            int i12 = AnimatedCoefficientView.j1;
            animatedCoefficientView.f(this.c);
        } else {
            if (iOrdinal != 5) {
                t9f.b();
                return;
            }
            int i13 = AnimatedCoefficientView.j1;
            animatedCoefficientView.h();
            animatedCoefficientView.f47180a.setAlpha(0);
            animatedCoefficientView.a();
            animatedCoefficientView.k();
        }
    }
}
