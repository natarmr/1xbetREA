package a;

import android.view.View;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes5.dex */
public final class cb10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DSLottieEmptyContainer f4040a;
    public final DSLottieEmptyContainer b;

    public cb10(DSLottieEmptyContainer dSLottieEmptyContainer, DSLottieEmptyContainer dSLottieEmptyContainer2) {
        this.f4040a = dSLottieEmptyContainer;
        this.b = dSLottieEmptyContainer2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4040a;
    }
}
