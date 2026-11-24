package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class wiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39240a;
    public final ajy b;
    public final String c;
    public final bjy d;

    public wiy(String str, ajy ajyVar, String str2, bjy bjyVar) {
        this.f39240a = str;
        this.b = ajyVar;
        this.c = str2;
        this.d = bjyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wiy)) {
            return false;
        }
        wiy wiyVar = (wiy) obj;
        return this.f39240a.equals(wiyVar.f39240a) && this.b == wiyVar.b && this.c.equals(wiyVar.c) && this.d.equals(wiyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f39240a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "KabaddiPlayerModel(playerId=" + this.f39240a + ", type=" + this.b + ", image=" + this.c + ", statistics=" + this.d + Separators.RPAREN;
    }
}
