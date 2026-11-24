package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class n8w0 {
    public static final i8w0 Companion = new i8w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23110a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ n8w0(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f23110a = null;
        } else {
            this.f23110a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8w0)) {
            return false;
        }
        n8w0 n8w0Var = (n8w0) obj;
        return Intrinsics.d(this.f23110a, n8w0Var.f23110a) && Intrinsics.d(this.b, n8w0Var.b) && Intrinsics.d(this.c, n8w0Var.c) && Intrinsics.d(this.d, n8w0Var.d);
    }

    public final int hashCode() {
        String str = this.f23110a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoredKeyData(publicKey=");
        sb.append(this.f23110a);
        sb.append(", privateKey=");
        sb.append(this.b);
        sb.append(", encryptedPrivateKey=");
        sb.append(this.c);
        sb.append(", iv=");
        return axq.m(sb, this.d, ')');
    }

    public n8w0(String str, String str2, String str3) {
        this.f23110a = str;
        this.b = null;
        this.c = str2;
        this.d = str3;
    }
}
