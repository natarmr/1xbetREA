package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey;
import org.xplatform.top.impl.presentation.ui.model.TopSectionKey$Aggregator$MonthProvider;

/* JADX INFO: loaded from: classes6.dex */
public final class ayq0 implements cyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1682a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final gz8 f;
    public final a4x g;
    public final String h;

    public ayq0(String str, int i, String str2, String str3, String str4, gz8 gz8Var, a4x a4xVar, String str5) {
        str3.getClass();
        a4xVar.getClass();
        this.f1682a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = gz8Var;
        this.g = a4xVar;
        this.h = str5;
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
        if (!(obj instanceof ayq0)) {
            return false;
        }
        ayq0 ayq0Var = (ayq0) obj;
        TopSectionKey$Aggregator$MonthProvider topSectionKey$Aggregator$MonthProvider = TopSectionKey$Aggregator$MonthProvider.f47123a;
        return topSectionKey$Aggregator$MonthProvider.equals(topSectionKey$Aggregator$MonthProvider) && this.f1682a.equals(ayq0Var.f1682a) && this.b == ayq0Var.b && this.c.equals(ayq0Var.c) && Intrinsics.d(this.d, ayq0Var.d) && this.e.equals(ayq0Var.e) && this.f == ayq0Var.f && Intrinsics.d(this.g, ayq0Var.g) && this.h.equals(ayq0Var.h);
    }

    @Override // a.qdr0
    public final TopSectionKey getKey() {
        return TopSectionKey$Aggregator$MonthProvider.f47123a;
    }

    public final int hashCode() {
        return this.h.hashCode() + cs0.b(this.g, (this.f.hashCode() + ua80.b(ua80.b(ua80.b(twn.a(this.b, ua80.b(-738030014, 31, this.f1682a), 31), 31, this.c), 31, this.d), 31, this.e)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(key=");
        sb.append(TopSectionKey$Aggregator$MonthProvider.f47123a);
        sb.append(", img=");
        sb.append(this.f1682a);
        sb.append(", productId=");
        kng0.w(this.b, ", productName=", this.c, ", subtitle=", sb);
        f140.v(sb, this.d, ", description=", this.e, ", viewType=");
        sb.append(this.f);
        sb.append(", partitions=");
        sb.append(this.g);
        sb.append(", imgBanner=");
        return axq.n(sb, this.h, Separators.RPAREN);
    }
}
