package a;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class drw0 implements Callable {
    public static final /* synthetic */ drw0 b = new drw0(0);
    public static final /* synthetic */ drw0 c = new drw0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6586a;

    public /* synthetic */ drw0(byte b2) {
        this.f6586a = b2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6586a) {
            case 0:
                o3x0 o3x0Var = new o3x0("internal.platform", (byte) 4);
                o3x0Var.b.put("getVersion", new o3x0("getVersion", (byte) 3));
                return o3x0Var;
            default:
                return null;
        }
    }
}
