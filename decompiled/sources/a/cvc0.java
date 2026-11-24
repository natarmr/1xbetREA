package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cvc0 implements fvc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d7v f5024a;

    public cvc0(d7v d7vVar) {
        this.f5024a = d7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvc0) && this.f5024a == ((cvc0) obj).f5024a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + twn.a(0, this.f5024a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Prizes(giftType=" + this.f5024a + ", bonusesCount=0, freeSpinsCount=0)";
    }
}
