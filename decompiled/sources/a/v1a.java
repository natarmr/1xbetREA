package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36620a;
    public final /* synthetic */ z1a b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ v1a(z1a z1aVar, List list, int i, byte b) {
        this.f36620a = b;
        this.b = z1aVar;
        this.c = list;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36620a) {
            case 0:
                z1a z1aVar = this.b;
                List list = this.c;
                int i = this.d;
                if (z1aVar.l.get() && Intrinsics.d(z1aVar.k, list)) {
                    l8x.U("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i);
                    jrs0 jrs0Var = z1aVar.h;
                    if (jrs0Var != null) {
                        jrs0Var.f();
                    }
                    z1aVar.d(i - 1, list);
                    break;
                }
                break;
            default:
                z1a z1aVar2 = this.b;
                z1aVar2.f43608a.execute(new v1a(z1aVar2, this.c, this.d, (byte) 0));
                break;
        }
    }
}
