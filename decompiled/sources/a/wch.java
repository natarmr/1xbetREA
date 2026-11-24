package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wch implements cdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38924a;

    public wch(String str) {
        this.f38924a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wch) && this.f38924a.equals(((wch) obj).f38924a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.cybergame_cs2_pick_ban_placeholder) + (this.f38924a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.drawable.cybergame_cs2_pick_ban_placeholder, "MapBackground(background=", this.f38924a, ", backgroundPlaceholder=", Separators.RPAREN);
    }
}
