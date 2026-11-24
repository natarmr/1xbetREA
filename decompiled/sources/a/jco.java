package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class jco implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16286a;
    public final CyberGamesPage b;
    public final zmh c;

    public jco(String str, CyberGamesPage cyberGamesPage, zmh zmhVar) {
        cyberGamesPage.getClass();
        this.f16286a = str;
        this.b = cyberGamesPage;
        this.c = zmhVar;
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
        if (!(obj instanceof jco)) {
            return false;
        }
        jco jcoVar = (jco) obj;
        if (!this.f16286a.equals(jcoVar.f16286a) || !Intrinsics.d(this.b, jcoVar.b) || !this.c.equals(jcoVar.c)) {
            return false;
        }
        k3g k3gVar = k3g.f17616a;
        return k3gVar.equals(k3gVar);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f16286a;
    }

    public final int hashCode() {
        return ((this.c.f44626a.hashCode() + ((this.b.hashCode() + (this.f16286a.hashCode() * 31)) * 31)) * 31) + 217771776;
    }

    public final String toString() {
        return "EventFocusTournamentsListUiModel(key=" + this.f16286a + ", cyberGamesPage=" + this.b + ", tournamentList=" + this.c + ", buttonBlockState=" + k3g.f17616a + Separators.RPAREN;
    }
}
