package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.meta_heroes.presentation.dialog.MetaHeroesRoleModelParams;

/* JADX INFO: loaded from: classes4.dex */
public final class pc40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MetaHeroesRoleModelParams f26740a;

    public pc40(MetaHeroesRoleModelParams metaHeroesRoleModelParams) {
        this.f26740a = metaHeroesRoleModelParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc40) && this.f26740a.equals(((pc40) obj).f26740a);
    }

    public final int hashCode() {
        return this.f26740a.hashCode();
    }

    public final String toString() {
        return "ShowRoleDialog(params=" + this.f26740a + Separators.RPAREN;
    }
}
