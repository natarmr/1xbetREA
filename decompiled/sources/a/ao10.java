package a;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes3.dex */
public final class ao10 extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bo10 f1179a;
    public final /* synthetic */ qn10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao10(bo10 bo10Var, qn10 qn10Var, long j) {
        super(j, 1000L);
        this.f1179a = bo10Var;
        this.b = qn10Var;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.f1179a.A(c8h0.f3914a, true);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.b.invoke(Long.valueOf(j));
    }
}
