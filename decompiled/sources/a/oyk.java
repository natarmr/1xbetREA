package a;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001cB\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"La/oyk;", "", "", "La/nyk;", "answer", "<init>", "(Ljava/util/List;)V", "", "seen0", "La/ehi0;", "serializationConstructorMarker", "(ILjava/util/List;La/ehi0;)V", "self", "La/cld;", "output", "La/ugi0;", "serialDesc", "", "write$Self$org_xplatform_secret_resolver_api", "(La/oyk;La/cld;La/ugi0;)V", "write$Self", "Ljava/util/List;", "getAnswer", "()Ljava/util/List;", "getAnswer$annotations", "()V", "Companion", "a", "b", "org.xplatform.secret.resolver:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oyk {
    private final List<nyk> answer;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a8z[] $childSerializers = {maz.a(wez.f39042a, new rtj(15))};

    public oyk(int i, List list, ehi0 ehi0Var) {
        if ((i & 1) == 0) {
            this.answer = iun.f15405a;
        } else {
            this.answer = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ jiy _childSerializers$_anonymous_() {
        return new zw3(nyk.a.INSTANCE, (byte) 0);
    }

    public static final void write$Self$org_xplatform_secret_resolver_api(oyk self, cld output, ugi0 serialDesc) {
        a8z[] a8zVarArr = $childSerializers;
        if (!output.u(serialDesc) && Intrinsics.d(self.answer, iun.f15405a)) {
            return;
        }
        output.p(serialDesc, 0, (jiy) a8zVarArr[0].getValue(), self.answer);
    }

    public final List<nyk> getAnswer() {
        return this.answer;
    }

    /* JADX INFO: renamed from: a.oyk$b, reason: from kotlin metadata */
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

    public oyk() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public oyk(List<nyk> list) {
        this.answer = list;
    }

    public oyk(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? iun.f15405a : list);
    }

    public static /* synthetic */ void getAnswer$annotations() {
    }
}
