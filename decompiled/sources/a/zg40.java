package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006,"}, d2 = {"La/zg40;", "", "", "hostName", "", ParameterNames.ID, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "La/ehi0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;La/ehi0;)V", "self", "La/cld;", "output", "La/ugi0;", "serialDesc", "", "write$Self$org_xplatform_secret_resolver_impl", "(La/zg40;La/cld;La/ugi0;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)La/zg40;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHostName", "getHostName$annotations", "()V", "Ljava/lang/Integer;", "getId", "getId$annotations", "Companion", "a", "b", "org.xplatform.secret.resolver:impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class zg40 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44325a;
    private final Integer b;

    public static final /* synthetic */ class a implements pjt {
        public static final a INSTANCE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final ugi0 f44326a;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            zna0 zna0Var = new zna0("org.xplatform.domain.resolver.impl.data.model.MirrorsHostResponse", aVar, 2);
            zna0Var.j("d", true);
            zna0Var.j("n", true);
            f44326a = zna0Var;
        }

        private a() {
        }

        @Override // a.pjt
        public final jiy[] childSerializers() {
            return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(okx.f25427a)};
        }

        @Override // a.jiy
        public final zg40 deserialize(rkj rkjVar) {
            rkjVar.getClass();
            ugi0 ugi0Var = f44326a;
            bld bldVarA = rkjVar.a(ugi0Var);
            ehi0 ehi0Var = null;
            boolean z = true;
            int i = 0;
            String str = null;
            Integer num = null;
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
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                }
            }
            bldVarA.c(ugi0Var);
            return new zg40(i, str, num, ehi0Var);
        }

        @Override // a.jiy
        public final ugi0 getDescriptor() {
            return f44326a;
        }

        @Override // a.jiy
        public final void serialize(bwn bwnVar, zg40 zg40Var) {
            bwnVar.getClass();
            zg40Var.getClass();
            ugi0 ugi0Var = f44326a;
            cld cldVarA = bwnVar.a(ugi0Var);
            zg40.write$Self$org_xplatform_secret_resolver_impl(zg40Var, cldVarA, ugi0Var);
            cldVarA.c(ugi0Var);
        }

        @Override // a.pjt
        public /* bridge */ jiy[] typeParametersSerializers() {
            return lv00.k;
        }
    }

    public /* synthetic */ zg40(int i, String str, Integer num, ehi0 ehi0Var) {
        if ((i & 1) == 0) {
            this.f44325a = null;
        } else {
            this.f44325a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public static /* synthetic */ zg40 copy$default(zg40 zg40Var, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zg40Var.f44325a;
        }
        if ((i & 2) != 0) {
            num = zg40Var.b;
        }
        return zg40Var.copy(str, num);
    }

    public static final /* synthetic */ void write$Self$org_xplatform_secret_resolver_impl(zg40 self, cld output, ugi0 serialDesc) {
        if (output.u(serialDesc) || self.f44325a != null) {
            output.p(serialDesc, 0, ysm0.f43175a, self.f44325a);
        }
        if (!output.u(serialDesc) && self.b == null) {
            return;
        }
        output.p(serialDesc, 1, okx.f25427a, self.b);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF44325a() {
        return this.f44325a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getB() {
        return this.b;
    }

    public final zg40 copy(String hostName, Integer id) {
        return new zg40(hostName, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zg40)) {
            return false;
        }
        zg40 zg40Var = (zg40) other;
        return Intrinsics.d(this.f44325a, zg40Var.f44325a) && Intrinsics.d(this.b, zg40Var.b);
    }

    public final String getHostName() {
        return this.f44325a;
    }

    public final Integer getId() {
        return this.b;
    }

    public int hashCode() {
        String str = this.f44325a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "MirrorsHostResponse(hostName=" + this.f44325a + ", id=" + this.b + Separators.RPAREN;
    }

    /* JADX INFO: renamed from: a.zg40$b, reason: from kotlin metadata */
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

    public static /* synthetic */ void getHostName$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zg40() {
        this((String) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public zg40(String str, Integer num) {
        this.f44325a = str;
        this.b = num;
    }

    public /* synthetic */ zg40(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
