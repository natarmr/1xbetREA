package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f36860a;
    public final String b;

    public v67(String str, ArrayList arrayList) {
        str.getClass();
        this.f36860a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v67)) {
            return false;
        }
        v67 v67Var = (v67) obj;
        return this.f36860a.equals(v67Var.f36860a) && Intrinsics.d(this.b, v67Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36860a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMenuItem(historyMenuItemUiModelList=" + this.f36860a + ", betId=" + this.b + Separators.RPAREN;
    }
}
