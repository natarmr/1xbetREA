package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cd1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4138a;

    public cd1(long j) {
        this.f4138a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd1) && this.f4138a == ((cd1) obj).f4138a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4138a);
    }

    public final String toString() {
        return axq.h(this.f4138a, "OnDailyTasksButtonClick(taskId=", Separators.RPAREN);
    }
}
