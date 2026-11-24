package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class qdp implements tdp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28546a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;

    public qdp(long j, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2) {
        cs0.x(str2, str3, str4, str5);
        this.f28546a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        this.h = z2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdp)) {
            return false;
        }
        qdp qdpVar = (qdp) obj;
        if (this.f28546a != qdpVar.f28546a || !this.b.equals(qdpVar.b) || !Intrinsics.d(this.c, qdpVar.c) || !Intrinsics.d(this.d, qdpVar.d) || !Intrinsics.d(this.e, qdpVar.e) || this.f != qdpVar.f) {
            return false;
        }
        hro0 hro0Var = hro0.f13541a;
        return hro0Var.equals(hro0Var) && Intrinsics.d(this.g, qdpVar.g) && this.h == qdpVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.sport_new) + twn.a(R.drawable.sport_new, brm0.e(ua80.b((((Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f28546a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31) + 161727629) * 31, 31, this.g), 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28546a, "EventCard(id=", ", champImageUrl=", this.b);
        f140.v(sbO, ", champLabel=", this.c, ", opponentsString=", this.d);
        w6x.z(", infoLabel=", this.e, ", isShowTagLive=", sbO, this.f);
        sbO.append(", tagStyle=");
        sbO.append(hro0.f13541a);
        sbO.append(", status=");
        sbO.append(this.g);
        cs0.v(R.drawable.sport_new, ", rtlSupport=", ", placeholder=", sbO, this.h);
        return vqd.p(sbO, ", errorRes=", R.drawable.sport_new, Separators.RPAREN);
    }
}
