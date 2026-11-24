package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bzv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3492a;
    public final h9p b;
    public final qdt c;
    public final boolean d;
    public final List e;
    public final boolean f;

    public bzv0(String str, h9p h9pVar, qdt qdtVar, boolean z, List list, boolean z2) {
        this.f3492a = str;
        this.b = h9pVar;
        this.c = qdtVar;
        this.d = z;
        this.e = list;
        this.f = z2;
    }

    public static bzv0 a(bzv0 bzv0Var, String str, h9p h9pVar, qdt qdtVar, boolean z, List list, boolean z2, int i) {
        if ((i & 1) != 0) {
            str = bzv0Var.f3492a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            h9pVar = bzv0Var.b;
        }
        h9p h9pVar2 = h9pVar;
        if ((i & 4) != 0) {
            qdtVar = bzv0Var.c;
        }
        qdt qdtVar2 = qdtVar;
        if ((i & 8) != 0) {
            z = bzv0Var.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            list = bzv0Var.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            z2 = bzv0Var.f;
        }
        bzv0Var.getClass();
        str2.getClass();
        return new bzv0(str2, h9pVar2, qdtVar2, z3, list2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzv0)) {
            return false;
        }
        bzv0 bzv0Var = (bzv0) obj;
        return this.f3492a.equals(bzv0Var.f3492a) && this.b.equals(bzv0Var.b) && this.c.equals(bzv0Var.c) && this.d == bzv0Var.d && Intrinsics.d(this.e, bzv0Var.e) && this.f == bzv0Var.f;
    }

    public final int hashCode() {
        int iE = brm0.e((this.c.hashCode() + ((this.b.hashCode() + (this.f3492a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        List list = this.e;
        return Boolean.hashCode(this.f) + ((iE + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return "XGamesSearchState(query=" + this.f3492a + ", favoriteGamesState=" + this.b + ", gamesState=" + this.c + ", useRemoteSearch=" + this.d + ", remoteSearchGames=" + this.e + ", remoteSearchFailed=" + this.f + Separators.RPAREN;
    }
}
