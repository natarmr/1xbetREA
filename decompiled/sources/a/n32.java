package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hep0 f22828a;
    public final d32 b;
    public final c32 c;
    public final b32 d;
    public final wcb e;
    public final f32 f;
    public final i32 g;
    public final boolean h;

    public n32(hep0 hep0Var, d32 d32Var, c32 c32Var, b32 b32Var, wcb wcbVar, f32 f32Var, i32 i32Var, boolean z) {
        this.f22828a = hep0Var;
        this.b = d32Var;
        this.c = c32Var;
        this.d = b32Var;
        this.e = wcbVar;
        this.f = f32Var;
        this.g = i32Var;
        this.h = z;
    }

    public static n32 a(n32 n32Var, hep0 hep0Var, d32 d32Var, c32 c32Var, b32 b32Var, wcb wcbVar, f32 f32Var, int i) {
        if ((i & 1) != 0) {
            hep0Var = n32Var.f22828a;
        }
        hep0 hep0Var2 = hep0Var;
        if ((i & 2) != 0) {
            d32Var = n32Var.b;
        }
        d32 d32Var2 = d32Var;
        if ((i & 4) != 0) {
            c32Var = n32Var.c;
        }
        c32 c32Var2 = c32Var;
        if ((i & 8) != 0) {
            b32Var = n32Var.d;
        }
        b32 b32Var2 = b32Var;
        if ((i & 16) != 0) {
            wcbVar = n32Var.e;
        }
        wcb wcbVar2 = wcbVar;
        f32 f32Var2 = (i & 32) != 0 ? n32Var.f : f32Var;
        i32 i32Var = n32Var.g;
        boolean z = n32Var.h;
        n32Var.getClass();
        return new n32(hep0Var2, d32Var2, c32Var2, b32Var2, wcbVar2, f32Var2, i32Var, z);
    }

    public final boolean b() {
        m32 m32Var;
        m32 m32Var2 = this.d.f1881a;
        m32 m32Var3 = this.c.f3651a;
        m32 m32Var4 = this.b.f5381a;
        m32 m32Var5 = m32.b;
        if (m32Var4 == m32Var5 && m32Var3 == (m32Var = m32.c) && m32Var2 == m32Var) {
            return true;
        }
        m32 m32Var6 = m32.c;
        if (m32Var4 == m32Var6 && m32Var3 == m32Var5 && m32Var2 == m32Var6) {
            return true;
        }
        if (m32Var4 == m32Var6 && m32Var3 == m32Var6 && m32Var2 == m32Var5) {
            return true;
        }
        if (m32Var4 == m32Var6 && m32Var3 == m32Var5 && m32Var2 == m32Var5) {
            return true;
        }
        if (m32Var4 == m32Var5 && m32Var3 == m32Var6 && m32Var2 == m32Var5) {
            return true;
        }
        return m32Var4 == m32Var5 && m32Var3 == m32Var5 && m32Var2 == m32Var6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n32)) {
            return false;
        }
        n32 n32Var = (n32) obj;
        return this.f22828a.equals(n32Var.f22828a) && this.b.equals(n32Var.b) && this.c.equals(n32Var.c) && this.d.equals(n32Var.d) && Intrinsics.d(this.e, n32Var.e) && this.f.equals(n32Var.f) && this.g.equals(n32Var.g) && this.h == n32Var.h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f22828a.hashCode() * 31)) * 31)) * 31)) * 31;
        wcb wcbVar = this.e;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (wcbVar == null ? 0 : wcbVar.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AllEventGamesState(teamHasStatisticState=" + this.f22828a + ", gamesLiveSection=" + this.b + ", gamesLineSection=" + this.c + ", gamesHistorySection=" + this.d + ", champImagesHolder=" + this.e + ", lottieModel=" + this.f + ", settingsModel=" + this.g + ", rtlSupport=" + this.h + Separators.RPAREN;
    }
}
