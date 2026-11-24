package a;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class rba0 implements ky90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f30175a;
    public final /* synthetic */ View b;

    public rba0(Function1 function1, View view) {
        this.f30175a = function1;
        this.b = view;
    }

    @Override // a.ky90
    public final void q(int i, int i2) {
        this.f30175a.invoke(this.b);
    }
}
