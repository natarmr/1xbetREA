package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fl7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9724a;
    public final String b;

    public fl7(String str, ArrayList arrayList) {
        str.getClass();
        this.f9724a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl7)) {
            return false;
        }
        fl7 fl7Var = (fl7) obj;
        return this.f9724a.equals(fl7Var.f9724a) && Intrinsics.d(this.b, fl7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9724a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMenuItem(historyMenuItemUiModelList=" + this.f9724a + ", betId=" + this.b + Separators.RPAREN;
    }
}
