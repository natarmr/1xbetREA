package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"La/k85;", "", "", "La/zg40;", "result", "<init>", "(Ljava/util/List;)V", "", "seen0", "La/ehi0;", "serializationConstructorMarker", "(ILjava/util/List;La/ehi0;)V", "self", "La/cld;", "output", "La/ugi0;", "serialDesc", "", "write$Self$org_xplatform_secret_resolver_impl", "(La/k85;La/cld;La/ugi0;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)La/k85;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getResult", "getResult$annotations", "()V", "Companion", "a", "b", "org.xplatform.secret.resolver:impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class k85 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a8z[] b = {maz.a(wez.f39042a, new a04(28))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<zg40> f17855a;

    public /* synthetic */ k85(int i, List list, ehi0 ehi0Var) {
        if ((i & 1) == 0) {
            this.f17855a = null;
        } else {
            this.f17855a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ jiy a() {
        return new zw3(zg40.a.INSTANCE, (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k85 copy$default(k85 k85Var, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = k85Var.f17855a;
        }
        return k85Var.copy(list);
    }

    public static final /* synthetic */ void write$Self$org_xplatform_secret_resolver_impl(k85 self, cld output, ugi0 serialDesc) {
        a8z[] a8zVarArr = b;
        if (!output.u(serialDesc) && self.f17855a == null) {
            return;
        }
        output.p(serialDesc, 0, (jiy) a8zVarArr[0].getValue(), self.f17855a);
    }

    public final List<zg40> component1() {
        return this.f17855a;
    }

    public final k85 copy(List<zg40> result) {
        return new k85(result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof k85) && Intrinsics.d(this.f17855a, ((k85) other).f17855a);
    }

    public final List<zg40> getResult() {
        return this.f17855a;
    }

    public int hashCode() {
        List<zg40> list = this.f17855a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return twn.r(this.f17855a, "AvailableMirrorsResponse(result=", Separators.RPAREN);
    }

    /* JADX INFO: renamed from: a.k85$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jiy serializer() {
            return a.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k85() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public k85(List<zg40> list) {
        this.f17855a = list;
    }

    public /* synthetic */ k85(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public static /* synthetic */ void getResult$annotations() {
    }
}
