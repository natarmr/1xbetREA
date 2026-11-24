package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bfi0 implements dfi0 {
    public static final afi0 Companion = new afi0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new gei0((byte) 2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2505a;
    public final List b;

    public /* synthetic */ bfi0(String str, List list, int i) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, zei0.f44254a.getDescriptor());
            throw null;
        }
        this.f2505a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfi0)) {
            return false;
        }
        bfi0 bfi0Var = (bfi0) obj;
        return Intrinsics.d(this.f2505a, bfi0Var.f2505a) && Intrinsics.d(this.b, bfi0Var.b);
    }

    public final int hashCode() {
        String str = this.f2505a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return ohs0.o("TextMessageWithAttachmentRequest(text=", this.f2505a, ", mediaId=", this.b, Separators.RPAREN);
    }

    public bfi0(String str, ArrayList arrayList) {
        this.f2505a = str;
        this.b = arrayList;
    }
}
