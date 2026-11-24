package a;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nnj0 implements qnj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f23825a;

    public nnj0(File file) {
        file.getClass();
        this.f23825a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnj0) && Intrinsics.d(this.f23825a, ((nnj0) obj).f23825a);
    }

    public final int hashCode() {
        return (this.f23825a.hashCode() * 31) - 1773452101;
    }

    public final String toString() {
        return "ShareCoupon(file=" + this.f23825a + ", applicationId=org.xbet.client1)";
    }
}
