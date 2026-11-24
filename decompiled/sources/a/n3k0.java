package a;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class n3k0 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lef0 f22855a;

    public n3k0(lef0 lef0Var) {
        super("Cancelled isolated runner");
        this.f22855a = lef0Var;
    }
}
