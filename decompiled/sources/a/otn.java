package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.api.presentation.models.TokenRestoreData;

/* JADX INFO: loaded from: classes5.dex */
public final class otn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TokenRestoreData f25837a;
    public final List b;

    public otn(TokenRestoreData tokenRestoreData, List list) {
        list.getClass();
        this.f25837a = tokenRestoreData;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otn)) {
            return false;
        }
        otn otnVar = (otn) obj;
        return this.f25837a.equals(otnVar.f25837a) && Intrinsics.d(this.b, otnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25837a.hashCode() * 31);
    }

    public final String toString() {
        return "EmptyAccountsUiModel(tokenRestoreData=" + this.f25837a + ", accountsList=" + this.b + Separators.RPAREN;
    }
}
