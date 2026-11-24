package a;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class dw90 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6786a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dw90(String str, byte b) {
        super(str);
        this.f6786a = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f6786a) {
            case 0:
                setStackTrace(ny9.m);
                break;
            case 1:
                setStackTrace(y9a.g);
                break;
            default:
                setStackTrace(p8a.k);
                break;
        }
        return this;
    }
}
