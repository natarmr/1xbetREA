package a;

import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public final class qfh0 implements sfh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qfh0 f28634a = new qfh0();

    @Override // a.sfh0
    public final long a(fet fetVar) {
        fetVar.e0(1119672372);
        long inputBackground60 = ((ThemeColors) fetVar.k(zaq0.b)).getInputBackground60();
        fetVar.r(false);
        return inputBackground60;
    }

    @Override // a.sfh0
    public final long b(fet fetVar) {
        fetVar.e0(1783587442);
        long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
        fetVar.r(false);
        return textPrimary;
    }

    @Override // a.sfh0
    public final y9q0 c(fet fetVar) {
        fetVar.e0(2048781131);
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        y9q0 y9q0VarA = y9q0.a(g1t0.k(), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
        fetVar.r(false);
        return y9q0VarA;
    }

    @Override // a.sfh0
    public final long d(fet fetVar) {
        fetVar.e0(-1133959116);
        long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
        fetVar.r(false);
        return secondary;
    }

    @Override // a.sfh0
    public final long e(fet fetVar) {
        fetVar.e0(-1683977598);
        long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
        fetVar.r(false);
        return secondary;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qfh0);
    }

    @Override // a.sfh0
    public final y9q0 f(fet fetVar) {
        fetVar.e0(-897361129);
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        y9q0 y9q0VarA = y9q0.a(g1t0.k(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
        fetVar.r(false);
        return y9q0VarA;
    }

    public final int hashCode() {
        return 1027554449;
    }

    public final String toString() {
        return "Default";
    }
}
