package a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class h1q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12297a;
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    private volatile /* synthetic */ Object _value$volatile = null;
    private volatile /* synthetic */ Object exceptionWhenReading$volatile;
    private volatile /* synthetic */ Object reader$volatile;
    private volatile /* synthetic */ int readers$volatile;
    private volatile /* synthetic */ Object writer$volatile;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        d = unsafe.objectFieldOffset(h1q0.class.getDeclaredField("reader$volatile"));
        f12297a = AtomicIntegerFieldUpdater.newUpdater(h1q0.class, "readers$volatile");
        e = unsafe.objectFieldOffset(h1q0.class.getDeclaredField("writer$volatile"));
        c = unsafe.objectFieldOffset(h1q0.class.getDeclaredField("exceptionWhenReading$volatile"));
        b = unsafe.objectFieldOffset(h1q0.class.getDeclaredField("_value$volatile"));
    }
}
