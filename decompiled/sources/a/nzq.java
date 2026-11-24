package a;

import android.content.Context;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nzq implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24385a;
    public FragmentContainerView b;

    public nzq(int i) {
        this.f24385a = i;
    }

    public final FragmentContainerView a() {
        FragmentContainerView fragmentContainerView = this.b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        c99.v(ua80.e(this.f24385a, "AndroidView has not created a container for ", " yet"));
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView((Context) obj);
        fragmentContainerView.setId(this.f24385a);
        this.b = fragmentContainerView;
        return fragmentContainerView;
    }
}
