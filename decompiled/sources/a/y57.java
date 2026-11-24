package a;

/* JADX INFO: loaded from: classes3.dex */
public final class y57 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42033a;

    public y57(long j) {
        this.f42033a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y57) && this.f42033a == ((y57) obj).f42033a;
    }

    public final int hashCode() {
        return Integer.hashCode(90) + (Long.hashCode(this.f42033a) * 31);
    }

    public final String toString() {
        return axq.h(this.f42033a, "ShowDatesPickerMail(startDate=", ", maxPeriod=90)");
    }
}
