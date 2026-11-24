package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes4.dex */
public final class h85 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12610a;
    public final LimitTypeEnum b;
    public final List c;
    public final String d;

    public h85(String str, LimitTypeEnum limitTypeEnum, List list, String str2) {
        list.getClass();
        this.f12610a = str;
        this.b = limitTypeEnum;
        this.c = list;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h85)) {
            return false;
        }
        h85 h85Var = (h85) obj;
        return this.f12610a.equals(h85Var.f12610a) && this.b == h85Var.b && Intrinsics.d(this.c, h85Var.c) && this.d.equals(h85Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a((this.b.hashCode() + (this.f12610a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "AvailableLimitsModel(group=" + this.f12610a + ", type=" + this.b + ", availableValues=" + this.c + ", measure=" + this.d + Separators.RPAREN;
    }
}
