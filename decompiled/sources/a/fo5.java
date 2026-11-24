package a;

import android.animation.ObjectAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fo5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9864a;
    public final /* synthetic */ ObjectAnimator b;

    public /* synthetic */ fo5(ObjectAnimator objectAnimator, byte b) {
        this.f9864a = b;
        this.b = objectAnimator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9864a;
        ObjectAnimator objectAnimator = this.b;
        switch (b) {
            case 0:
                if (objectAnimator.isRunning()) {
                    objectAnimator.cancel();
                }
                return Unit.f46060a;
            case 1:
                objectAnimator.cancel();
                return Boolean.FALSE;
            case 2:
                objectAnimator.cancel();
                return Unit.f46060a;
            case 3:
                if (objectAnimator.isRunning()) {
                    objectAnimator.cancel();
                }
                return Unit.f46060a;
            case 4:
                if (objectAnimator.isRunning()) {
                    objectAnimator.cancel();
                }
                return Boolean.FALSE;
            default:
                if (objectAnimator.isRunning()) {
                    objectAnimator.cancel();
                }
                return Unit.f46060a;
        }
    }
}
