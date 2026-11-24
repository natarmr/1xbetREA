package a;

/* JADX INFO: loaded from: classes2.dex */
public enum ddw0 implements pew0 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5918a;

    ddw0(int i) {
        this.f5918a = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f5918a);
    }

    @Override // a.pew0
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f5918a;
        }
        jf4.o("Can't get the number of an unknown enum value.");
        return 0;
    }
}
