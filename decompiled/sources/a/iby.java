package a;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class iby implements u4x {
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u460 f14512a;

    static {
        Unsafe unsafe = defpackage.a.f0a;
        c = unsafe.objectFieldOffset(iby.class.getDeclaredField("_isCompleting$volatile"));
        d = unsafe.objectFieldOffset(iby.class.getDeclaredField("_rootCause$volatile"));
        b = unsafe.objectFieldOffset(iby.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public iby(u460 u460Var, Throwable th) {
        this.f14512a = u460Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thB = b();
        if (thB == null) {
            defpackage.a.f0a.putObjectVolatile(this, d, th);
            return;
        }
        if (th == thB) {
            return;
        }
        Unsafe unsafe = defpackage.a.f0a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                udk.e(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    public final Throwable b() {
        return (Throwable) defpackage.a.f0a.getObjectVolatile(this, d);
    }

    @Override // a.u4x
    public final u460 c() {
        return this.f14512a;
    }

    public final boolean d() {
        return b() != null;
    }

    public final boolean e() {
        return defpackage.a.f0a.getIntVolatile(this, c) == 1;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = defpackage.a.f0a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                udk.e(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thB = b();
        if (thB != null) {
            arrayList.add(0, thB);
        }
        if (th != null && !th.equals(thB)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, qby.e);
        return arrayList;
    }

    @Override // a.u4x
    public final boolean isActive() {
        return b() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + b() + ", exceptions=" + defpackage.a.f0a.getObjectVolatile(this, b) + ", list=" + this.f14512a + ']';
    }
}
