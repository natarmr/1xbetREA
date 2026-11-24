package a;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ukz extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ukz(String str, byte b) {
        super(str);
        this.f35849a = b;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f35849a) {
            case 1:
                setStackTrace(q8a.g);
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
