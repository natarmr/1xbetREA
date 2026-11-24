package a;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class yb3 implements ub3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f42323a;
    public Function0 b;
    public Function0 c;
    public Function0 d;
    public Function1 e;
    public xb3 f;
    public int g;

    @Override // a.ub3
    public final void a(AppBarLayout appBarLayout, int i) {
        this.e.invoke(Integer.valueOf(i));
        if (i == 0) {
            xb3 xb3Var = this.f;
            xb3 xb3Var2 = xb3.f40580a;
            if (xb3Var != xb3Var2) {
                this.f42323a.invoke();
            }
            this.g = i;
            this.f = xb3Var2;
            return;
        }
        if (Math.abs(i) >= appBarLayout.getTotalScrollRange()) {
            xb3 xb3Var3 = this.f;
            xb3 xb3Var4 = xb3.b;
            if (xb3Var3 != xb3Var4) {
                this.b.invoke();
            }
            this.g = i;
            this.f = xb3Var4;
            return;
        }
        if (this.g > i) {
            this.f = xb3.c;
            this.c.invoke();
        } else {
            this.f = xb3.d;
            this.d.invoke();
        }
        this.g = i;
    }
}
