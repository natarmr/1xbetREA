package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ykx implements iys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f42813a;
    public final n0o0 b;

    public ykx(LinkedHashSet linkedHashSet) {
        ays0.b.getClass();
        ays0 ays0Var = ays0.c;
        ays0Var.getClass();
        ucx.h0(f2o.a(u1o.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), ays0Var, this, iun.f15405a, false);
        this.b = maz.b(new pul(this, (byte) 18));
        this.f42813a = linkedHashSet;
    }

    @Override // a.iys0
    public final Collection b() {
        return (List) this.b.getValue();
    }

    @Override // a.iys0
    public final ary c() {
        throw null;
    }

    @Override // a.iys0
    public final List getParameters() {
        return iun.f15405a;
    }

    @Override // a.iys0
    public final foc n() {
        return null;
    }

    @Override // a.iys0
    public final boolean p() {
        return false;
    }

    public final String toString() {
        return "IntegerLiteralType".concat("[" + CollectionsKt.b0(this.f42813a, Separators.COMMA, null, null, j9x.c, 30) + ']');
    }
}
