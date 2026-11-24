package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pqw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfx0 f27437a = a(16);
    public static final bfx0 b = a(32);
    public static final bfx0 c;

    static {
        c(16);
        c(32);
        c = b(16, 16);
        b(32, 32);
        zex0 zex0VarT = bfx0.t();
        h7x0 h7x0Var = urw0.f36182a;
        zex0VarT.g("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zex0VarT.h(2);
        zex0 zex0VarT2 = bfx0.t();
        h7x0 h7x0Var2 = guw0.f11951a;
        zex0VarT2.g("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zex0VarT2.h(2);
    }

    public static bfx0 a(int i) {
        gbx0 gbx0VarX = hbx0.x();
        gbx0VarX.d();
        ((hbx0) gbx0VarX.b).zze = i;
        hbx0 hbx0Var = (hbx0) gbx0VarX.c();
        zex0 zex0VarT = bfx0.t();
        zex0VarT.f(hbx0Var.a());
        h7x0 h7x0Var = lrw0.f20551a;
        zex0VarT.g("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zex0VarT.h(2);
        return (bfx0) zex0VarT.c();
    }

    public static bfx0 b(int i, int i2) {
        oax0 oax0VarW = pax0.w();
        rax0 rax0VarV = sax0.v();
        rax0VarV.d();
        ((sax0) rax0VarV.b).zze = 16;
        sax0 sax0Var = (sax0) rax0VarV.c();
        oax0VarW.d();
        pax0.v((pax0) oax0VarW.b, sax0Var);
        oax0VarW.d();
        ((pax0) oax0VarW.b).zzg = i;
        pax0 pax0Var = (pax0) oax0VarW.c();
        odx0 odx0VarY = qdx0.y();
        udx0 udx0VarX = wdx0.x();
        udx0VarX.d();
        ((wdx0) udx0VarX.b).zze = mdx0.SHA256.zza();
        udx0VarX.d();
        ((wdx0) udx0VarX.b).zzf = i2;
        wdx0 wdx0Var = (wdx0) udx0VarX.c();
        odx0VarY.d();
        qdx0.w((qdx0) odx0VarY.b, wdx0Var);
        odx0VarY.d();
        ((qdx0) odx0VarY.b).zzg = 32;
        qdx0 qdx0Var = (qdx0) odx0VarY.c();
        iax0 iax0VarT = jax0.t();
        iax0VarT.d();
        jax0.v((jax0) iax0VarT.b, pax0Var);
        iax0VarT.d();
        jax0.w((jax0) iax0VarT.b, qdx0Var);
        jax0 jax0Var = (jax0) iax0VarT.c();
        zex0 zex0VarT = bfx0.t();
        zex0VarT.f(jax0Var.a());
        h7x0 h7x0Var = wqw0.f39613a;
        zex0VarT.g("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zex0VarT.h(2);
        return (bfx0) zex0VarT.c();
    }

    public static void c(int i) {
        xax0 xax0VarX = yax0.x();
        xax0VarX.d();
        ((yax0) xax0VarX.b).zzg = i;
        abx0 abx0VarV = bbx0.v();
        abx0VarV.d();
        ((bbx0) abx0VarV.b).zze = 16;
        bbx0 bbx0Var = (bbx0) abx0VarV.c();
        xax0VarX.d();
        yax0.w((yax0) xax0VarX.b, bbx0Var);
        yax0 yax0Var = (yax0) xax0VarX.c();
        zex0 zex0VarT = bfx0.t();
        zex0VarT.f(yax0Var.a());
        h7x0 h7x0Var = irw0.f15278a;
        zex0VarT.g("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zex0VarT.h(2);
    }
}
