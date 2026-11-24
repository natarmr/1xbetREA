package a;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cby extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient bby f4083a;

    public cby(String str, Throwable th, bby bbyVar) {
        super(str);
        this.f4083a = bbyVar;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cby)) {
            return false;
        }
        cby cbyVar = (cby) obj;
        if (!Intrinsics.d(cbyVar.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = cbyVar.f4083a;
        if (obj2 == null) {
            obj2 = z560.b;
        }
        Object obj3 = this.f4083a;
        if (obj3 == null) {
            obj3 = z560.b;
        }
        return Intrinsics.d(obj2, obj3) && Intrinsics.d(cbyVar.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f4083a;
        if (obj == null) {
            obj = z560.b;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f4083a;
        if (obj == null) {
            obj = z560.b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
