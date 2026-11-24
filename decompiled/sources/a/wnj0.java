package a;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class wnj0 implements ynj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f39452a;

    public wnj0(File file) {
        this.f39452a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnj0) && this.f39452a.equals(((wnj0) obj).f39452a);
    }

    public final int hashCode() {
        return (this.f39452a.hashCode() * 31) - 1773452101;
    }

    public final String toString() {
        return "Content(file=" + this.f39452a + ", applicationId=org.xbet.client1)";
    }
}
