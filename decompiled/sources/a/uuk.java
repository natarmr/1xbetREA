package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uuk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36304a;
    public final String b;

    public uuk(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f36304a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuk)) {
            return false;
        }
        uuk uukVar = (uuk) obj;
        return Intrinsics.d(this.f36304a, uukVar.f36304a) && Intrinsics.d(this.b, uukVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36304a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("DiscordKeys(clientDiscordId=", this.f36304a, ", discordCallbackUrl=", this.b, Separators.RPAREN);
    }
}
