package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class wqn {
    public static final vqn Companion = new vqn();
    public static final a8z[] d = {maz.a(wez.f39042a, new dcn(28)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrn f39599a;
    public final String b;
    public final String c;

    public /* synthetic */ wqn(int i, hrn hrnVar, String str, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, uqn.f36127a.getDescriptor());
            throw null;
        }
        this.f39599a = hrnVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqn)) {
            return false;
        }
        wqn wqnVar = (wqn) obj;
        return Intrinsics.d(this.f39599a, wqnVar.f39599a) && Intrinsics.d(this.b, wqnVar.b) && Intrinsics.d(this.c, wqnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f39599a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditProfileSettingsRequest(data=");
        sb.append(this.f39599a);
        sb.append(", imageText=");
        sb.append(this.b);
        sb.append(", captchaId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }

    public wqn(hrn hrnVar, String str, String str2) {
        this.f39599a = hrnVar;
        this.b = str;
        this.c = str2;
    }
}
