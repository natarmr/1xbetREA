package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class miy implements fhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21868a;
    public final a8z b;

    public miy(oiy oiyVar) {
        oiyVar.getClass();
        this.f21868a = oiyVar;
        this.b = maz.a(wez.f39042a, new y2x(this, (byte) 17));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof miy)) {
            return false;
        }
        miy miyVar = (miy) obj;
        return Intrinsics.d(((niy) this).d, ((niy) miyVar).d) && Intrinsics.d(this.f21868a, miyVar.f21868a);
    }

    public abstract List getUpperBounds();

    public final int hashCode() {
        return ((niy) this).d.hashCode() + (this.f21868a.hashCode() * 31);
    }

    public final String toString() {
        lzs0.c.getClass();
        StringBuilder sb = new StringBuilder();
        niy niyVar = (niy) this;
        int iOrdinal = niyVar.e.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(niyVar.d);
        return sb.toString();
    }
}
