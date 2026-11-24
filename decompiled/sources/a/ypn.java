package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ypn extends Throwable {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43039a;

    public ypn(List list) {
        list.getClass();
        this.f43039a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypn) && Intrinsics.d(this.f43039a, ((ypn) obj).f43039a);
    }

    public final int hashCode() {
        return this.f43039a.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return twn.r(this.f43039a, "EditProfileErrorFormModel(editProfileErrorModelList=", Separators.RPAREN);
    }
}
