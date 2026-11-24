package a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ubf implements o5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35378a;
    public final Object b;

    public /* synthetic */ ubf(Object obj, byte b) {
        this.f35378a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f35378a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new cu((Context) ((ubf) obj).b, new uxs0((byte) 10), new bzs0((byte) 3), (byte) 13);
            default:
                return obj;
        }
    }
}
