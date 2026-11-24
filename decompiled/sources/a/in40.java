package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class in40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15056a;
    public final rqm b;

    public in40(String str, rqm rqmVar) {
        this.f15056a = str;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in40)) {
            return false;
        }
        in40 in40Var = (in40) obj;
        return this.f15056a.equals(in40Var.f15056a) && this.b.equals(in40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15056a.hashCode() * 31);
    }

    public final String toString() {
        return "ModuleInfoUiModel(id=" + this.f15056a + ", dsSettingCellStyle=" + this.b + Separators.RPAREN;
    }
}
