package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w8n0 extends x8n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38731a;

    public w8n0(List list) {
        list.getClass();
        this.f38731a = list;
    }

    @Override // a.x8n0
    public final List a() {
        return this.f38731a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8n0) && Intrinsics.d(this.f38731a, ((w8n0) obj).f38731a);
    }

    public final int hashCode() {
        return this.f38731a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f38731a, "TopLineGamesModel(games=", Separators.RPAREN);
    }
}
