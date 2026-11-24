package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zmq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44639a;

    public zmq0(long j) {
        this.f44639a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmq0) && this.f44639a == ((zmq0) obj).f44639a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44639a);
    }

    public final String toString() {
        return axq.h(this.f44639a, "TimerLeftModel(timeLeft=", Separators.RPAREN);
    }
}
