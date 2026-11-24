package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mao implements zdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21468a;
    public final String b;
    public final String c;
    public final String d;

    public mao(String str, String str2, String str3, String str4) {
        str2.getClass();
        str3.getClass();
        this.f21468a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // a.zdo
    public final String a() {
        return this.f21468a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mao)) {
            return false;
        }
        mao maoVar = (mao) obj;
        return this.f21468a.equals(maoVar.f21468a) && Intrinsics.d(this.b, maoVar.b) && Intrinsics.d(this.c, maoVar.c) && this.d.equals(maoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f21468a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("EventBlockItemUiModel(eventKey=", this.f21468a, ", title=", this.b, ", sumValue="), this.c, ", currency=", this.d, Separators.RPAREN);
    }
}
