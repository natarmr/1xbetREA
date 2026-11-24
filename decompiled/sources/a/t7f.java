package a;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t7f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33462a;
    public final /* synthetic */ u7f b;
    public final /* synthetic */ Timer c;

    public /* synthetic */ t7f(u7f u7fVar, Timer timer, byte b) {
        this.f33462a = b;
        this.b = u7fVar;
        this.c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f33462a;
        Timer timer = this.c;
        u7f u7fVar = this.b;
        switch (b) {
            case 0:
                y7f y7fVarB = u7fVar.b(timer);
                if (y7fVarB != null) {
                    u7fVar.f35181a.add(y7fVarB);
                }
                break;
            default:
                y7f y7fVarB2 = u7fVar.b(timer);
                if (y7fVarB2 != null) {
                    u7fVar.f35181a.add(y7fVarB2);
                }
                break;
        }
    }
}
