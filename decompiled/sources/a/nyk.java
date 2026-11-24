package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001f"}, d2 = {"La/nyk;", "", "", "name", RemoteMessageConst.DATA, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "La/ehi0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;La/ehi0;)V", "self", "La/cld;", "output", "La/ugi0;", "serialDesc", "", "write$Self$org_xplatform_secret_resolver_api", "(La/nyk;La/cld;La/ugi0;)V", "write$Self", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "getData", "getData$annotations", "Companion", "a", "b", "org.xplatform.secret.resolver:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nyk {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String data;
    private final String name;

    public static final /* synthetic */ class a implements pjt {
        public static final a INSTANCE;
        private static final ugi0 descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            zna0 zna0Var = new zna0("org.xplatform.domain.resolver.api.data.model.DomainOverHttpsAnswer", aVar, 2);
            zna0Var.j("name", true);
            zna0Var.j(RemoteMessageConst.DATA, true);
            descriptor = zna0Var;
        }

        private a() {
        }

        @Override // a.pjt
        public final jiy[] childSerializers() {
            ysm0 ysm0Var = ysm0.f43175a;
            return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
        }

        @Override // a.jiy
        public final nyk deserialize(rkj rkjVar) {
            rkjVar.getClass();
            ugi0 ugi0Var = descriptor;
            bld bldVarA = rkjVar.a(ugi0Var);
            ehi0 ehi0Var = null;
            boolean z = true;
            int i = 0;
            String str = null;
            String str2 = null;
            while (z) {
                int iF = bldVarA.f(ugi0Var);
                if (iF == -1) {
                    z = false;
                } else if (iF == 0) {
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                } else {
                    if (iF != 1) {
                        itt0.c(iF);
                        return null;
                    }
                    str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                    i |= 2;
                }
            }
            bldVarA.c(ugi0Var);
            return new nyk(i, str, str2, ehi0Var);
        }

        @Override // a.jiy
        public final ugi0 getDescriptor() {
            return descriptor;
        }

        @Override // a.jiy
        public final void serialize(bwn bwnVar, nyk nykVar) {
            bwnVar.getClass();
            nykVar.getClass();
            ugi0 ugi0Var = descriptor;
            cld cldVarA = bwnVar.a(ugi0Var);
            nyk.write$Self$org_xplatform_secret_resolver_api(nykVar, cldVarA, ugi0Var);
            cldVarA.c(ugi0Var);
        }

        @Override // a.pjt
        public /* bridge */ jiy[] typeParametersSerializers() {
            return lv00.k;
        }
    }

    public /* synthetic */ nyk(int i, String str, String str2, ehi0 ehi0Var) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.data = "";
        } else {
            this.data = str2;
        }
    }

    public static final /* synthetic */ void write$Self$org_xplatform_secret_resolver_api(nyk self, cld output, ugi0 serialDesc) {
        if (output.u(serialDesc) || !Intrinsics.d(self.name, "")) {
            output.p(serialDesc, 0, ysm0.f43175a, self.name);
        }
        if (!output.u(serialDesc) && Intrinsics.d(self.data, "")) {
            return;
        }
        output.p(serialDesc, 1, ysm0.f43175a, self.data);
    }

    public final String getData() {
        return this.data;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: a.nyk$b, reason: from kotlin metadata */
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

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nyk() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public nyk(String str, String str2) {
        this.name = str;
        this.data = str2;
    }

    public /* synthetic */ nyk(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
