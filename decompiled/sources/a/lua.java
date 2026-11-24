package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f20664a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final boolean g;

    public lua(udl0 udl0Var, List list, List list2, List list3, List list4, List list5, boolean z) {
        hne.C(list, list2, list3, list4);
        this.f20664a = udl0Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = z;
    }

    public static lua a(lua luaVar, ArrayList arrayList, List list, ArrayList arrayList2, List list2, List list3, boolean z, int i) {
        List list4 = arrayList;
        udl0 udl0Var = luaVar.f20664a;
        if ((i & 2) != 0) {
            list4 = luaVar.b;
        }
        if ((i & 4) != 0) {
            list = luaVar.c;
        }
        List list5 = arrayList2;
        if ((i & 8) != 0) {
            list5 = luaVar.d;
        }
        if ((i & 16) != 0) {
            list2 = luaVar.e;
        }
        if ((i & 32) != 0) {
            list3 = luaVar.f;
        }
        if ((i & 64) != 0) {
            z = luaVar.g;
        }
        boolean z2 = z;
        luaVar.getClass();
        list4.getClass();
        list.getClass();
        list5.getClass();
        list2.getClass();
        List list6 = list3;
        List list7 = list2;
        List list8 = list5;
        return new lua(udl0Var, list4, list, list8, list7, list6, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lua)) {
            return false;
        }
        lua luaVar = (lua) obj;
        return this.f20664a == luaVar.f20664a && Intrinsics.d(this.b, luaVar.b) && Intrinsics.d(this.c, luaVar.c) && Intrinsics.d(this.d, luaVar.d) && Intrinsics.d(this.e, luaVar.e) && Intrinsics.d(this.f, luaVar.f) && this.g == luaVar.g;
    }

    public final int hashCode() {
        int iA = dw9.a(dw9.a(dw9.a(dw9.a(this.f20664a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        List list = this.f;
        return Boolean.hashCode(this.g) + ((iA + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardsInfoSettingsState(sportGameType=");
        sb.append(this.f20664a);
        sb.append(", pinnedCards=");
        sb.append(this.b);
        sb.append(", order=");
        b1j.y(", defaultOrder=", ", currentlyUsedCards=", sb, this.c, this.d);
        b1j.y(", savedOrder=", ", isSaving=", sb, this.e, this.f);
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
