package a;

import android.animation.ObjectAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eo5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8124a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ ObjectAnimator c;

    public /* synthetic */ eo5(cp cpVar, ObjectAnimator objectAnimator, byte b) {
        this.f8124a = b;
        this.b = cpVar;
        this.c = objectAnimator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f8124a;
        ObjectAnimator objectAnimator = this.c;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                if (((do5) cpVar.u()).f6400a) {
                    objectAnimator.start();
                } else {
                    objectAnimator.cancel();
                }
                break;
            default:
                if (((rtl0) cpVar.u()).f31085a) {
                    objectAnimator.start();
                }
                break;
        }
        return Unit.f46060a;
    }
}
