package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class snj0 implements vnj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f32497a;
    public final pmj0 b;
    public final boolean c;

    public snj0(File file, pmj0 pmj0Var, boolean z) {
        file.getClass();
        this.f32497a = file;
        this.b = pmj0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snj0)) {
            return false;
        }
        snj0 snj0Var = (snj0) obj;
        return Intrinsics.d(this.f32497a, snj0Var.f32497a) && this.b.equals(snj0Var.b) && this.c == snj0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f32497a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(couponFile=");
        sb.append(this.f32497a);
        sb.append(", buttonsUiModel=");
        sb.append(this.b);
        sb.append(", isLoaderVisible=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
