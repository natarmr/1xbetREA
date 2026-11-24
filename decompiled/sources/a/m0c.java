package a;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0003\u0010\u0015¨\u0006\u001b"}, d2 = {"La/m0c;", "", "", "isAvailable", "<init>", "(Ljava/lang/Boolean;)V", "", "seen0", "La/ehi0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;La/ehi0;)V", "self", "La/cld;", "output", "La/ugi0;", "serialDesc", "", "write$Self$org_xplatform_secret_resolver_api", "(La/m0c;La/cld;La/ugi0;)V", "write$Self", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isAvailable$annotations", "()V", "Companion", "a", "b", "org.xplatform.secret.resolver:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m0c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean isAvailable;

    public /* synthetic */ m0c(int i, Boolean bool, ehi0 ehi0Var) {
        if ((i & 1) == 0) {
            this.isAvailable = Boolean.FALSE;
        } else {
            this.isAvailable = bool;
        }
    }

    public static final /* synthetic */ void write$Self$org_xplatform_secret_resolver_api(m0c self, cld output, ugi0 serialDesc) {
        if (!output.u(serialDesc) && Intrinsics.d(self.isAvailable, Boolean.FALSE)) {
            return;
        }
        output.p(serialDesc, 0, sm8.f32432a, self.isAvailable);
    }

    /* JADX INFO: renamed from: isAvailable, reason: from getter */
    public final Boolean getIsAvailable() {
        return this.isAvailable;
    }

    /* JADX INFO: renamed from: a.m0c$b, reason: from kotlin metadata */
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
    public m0c() {
        this((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public m0c(Boolean bool) {
        this.isAvailable = bool;
    }

    public /* synthetic */ m0c(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }

    public static /* synthetic */ void isAvailable$annotations() {
    }
}
