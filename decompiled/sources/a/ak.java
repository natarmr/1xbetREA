package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ak extends nk {
    public final String b;

    public ak(String str) {
        str.getClass();
        this.b = str;
    }

    @Override // a.nk
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak) && Intrinsics.d(this.b, ((ak) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(R.drawable.ic_glyph_bet_on_player) * 31);
    }

    public final String toString() {
        return defpackage.c.b(R.drawable.ic_glyph_bet_on_player, "BetsOnPlayersUiModel(imageId=", ", actionName=", this.b, Separators.RPAREN);
    }
}
