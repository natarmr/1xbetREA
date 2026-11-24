package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39964a;
    public final int b;
    public final String c;

    public wya(ArrayList arrayList, int i, int i2) {
        this((String) null, (i2 & 1) != 0 ? iun.f15405a : arrayList, (i2 & 2) != 0 ? 0 : i);
    }

    public static wya a(wya wyaVar, ArrayList arrayList, int i, String str, int i2) {
        List list = arrayList;
        if ((i2 & 1) != 0) {
            list = wyaVar.f39964a;
        }
        if ((i2 & 2) != 0) {
            i = wyaVar.b;
        }
        if ((i2 & 4) != 0) {
            str = wyaVar.c;
        }
        wyaVar.getClass();
        list.getClass();
        return new wya(str, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wya)) {
            return false;
        }
        wya wyaVar = (wya) obj;
        return Intrinsics.d(this.f39964a, wyaVar.f39964a) && this.b == wyaVar.b && Intrinsics.d(this.c, wyaVar.c);
    }

    public final int hashCode() {
        int iA = twn.a(this.b, this.f39964a.hashCode() * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewState(games=");
        sb.append(this.f39964a);
        sb.append(", selectedGamesCount=");
        sb.append(this.b);
        sb.append(", searchQuery=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }

    public wya(String str, List list, int i) {
        list.getClass();
        this.f39964a = list;
        this.b = i;
        this.c = str;
    }
}
