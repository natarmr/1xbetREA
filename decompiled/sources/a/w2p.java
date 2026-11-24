package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38461a;
    public final boolean b;
    public final boolean c;
    public final mdm d;
    public final mdm e;
    public final List f;
    public final wcb g;

    public w2p(boolean z, boolean z2, boolean z3, mdm mdmVar, mdm mdmVar2, List list, wcb wcbVar) {
        list.getClass();
        this.f38461a = z;
        this.b = z2;
        this.c = z3;
        this.d = mdmVar;
        this.e = mdmVar2;
        this.f = list;
        this.g = wcbVar;
    }

    public static w2p a(w2p w2pVar, boolean z, boolean z2, boolean z3, List list, wcb wcbVar, int i) {
        if ((i & 1) != 0) {
            z = w2pVar.f38461a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = w2pVar.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = w2pVar.c;
        }
        boolean z6 = z3;
        mdm mdmVar = w2pVar.d;
        mdm mdmVar2 = w2pVar.e;
        if ((i & 32) != 0) {
            list = w2pVar.f;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            wcbVar = w2pVar.g;
        }
        w2pVar.getClass();
        list2.getClass();
        return new w2p(z4, z5, z6, mdmVar, mdmVar2, list2, wcbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2p)) {
            return false;
        }
        w2p w2pVar = (w2p) obj;
        return this.f38461a == w2pVar.f38461a && this.b == w2pVar.b && this.c == w2pVar.c && this.d.equals(w2pVar.d) && this.e.equals(w2pVar.e) && Intrinsics.d(this.f, w2pVar.f) && Intrinsics.d(this.g, w2pVar.g);
    }

    public final int hashCode() {
        int iA = dw9.a(f140.d(this.e, f140.d(this.d, brm0.e(brm0.e(Boolean.hashCode(this.f38461a) * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f);
        wcb wcbVar = this.g;
        return iA + (wcbVar == null ? 0 : wcbVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FavoriteAltChampsState(isLoading=", ", isConnected=", ", isShowError=", this.f38461a, this.b);
        sbQ.append(this.c);
        sbQ.append(", configErrorGetData=");
        sbQ.append(this.d);
        sbQ.append(", configEmptyData=");
        sbQ.append(this.e);
        sbQ.append(", champs=");
        sbQ.append(this.f);
        sbQ.append(", champImagesHolder=");
        sbQ.append(this.g);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
