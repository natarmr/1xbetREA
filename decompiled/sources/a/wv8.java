package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wv8 implements zv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39828a;
    public final cv8 b;
    public final rqm c;

    public wv8(String str, cv8 cv8Var, rqm rqmVar) {
        this.f39828a = str;
        this.b = cv8Var;
        this.c = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv8)) {
            return false;
        }
        wv8 wv8Var = (wv8) obj;
        return this.f39828a.equals(wv8Var.f39828a) && this.b.equals(wv8Var.b) && this.c.equals(wv8Var.c);
    }

    @Override // a.zv8
    public final String getId() {
        return this.f39828a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f39828a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SettingsCell(id=" + this.f39828a + ", position=" + this.b + ", dsSettingCellStyle=" + this.c + Separators.RPAREN;
    }
}
