package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class aox extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z3 f1223a;

    public aox(String str) {
        super(str);
        this.f1223a = null;
    }

    public static aox a() {
        return new aox("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
