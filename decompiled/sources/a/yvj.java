package a;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class yvj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f43322a;

    public yvj(byte b) {
        switch (b) {
            case 1:
                this.f43322a = new AtomicInteger();
                break;
            default:
                this.f43322a = new AtomicInteger(0);
                break;
        }
    }
}
