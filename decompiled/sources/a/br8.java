package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class br8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3066a;
    public long b;
    public long c;

    public br8() {
        this.f3066a = (byte) 4;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public String toString() {
        switch (this.f3066a) {
            case 3:
                return this.b + Separators.SLASH + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ br8(byte b, long j, long j2) {
        this.f3066a = b;
        this.b = j;
        this.c = j2;
    }

    public br8(int i, long j, long j2) {
        this.f3066a = (byte) 2;
        this.b = j;
        this.c = j2;
    }
}
