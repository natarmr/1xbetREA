package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfx0 f7059a;

    static {
        byte[] bArr = new byte[0];
        bfx0 bfx0Var = pqw0.f27437a;
        ecx0 ecx0Var = ecx0.UNCOMPRESSED;
        f7059a = a(ecx0Var, bfx0Var, 2, bArr);
        a(ecx0.COMPRESSED, bfx0Var, 4, bArr);
        a(ecx0Var, pqw0.c, 2, bArr);
    }

    public static bfx0 a(ecx0 ecx0Var, bfx0 bfx0Var, int i, byte[] bArr) {
        gcx0 gcx0VarT = hcx0.t();
        vcx0 vcx0VarT = xcx0.t();
        vcx0VarT.d();
        ((xcx0) vcx0VarT.b).zze = ddx0.NIST_P256.zza();
        vcx0VarT.d();
        ((xcx0) vcx0VarT.b).zzf = mdx0.SHA256.zza();
        vjw0 vjw0VarH = sjw0.h(bArr, 0, bArr.length);
        vcx0VarT.d();
        xcx0.u((xcx0) vcx0VarT.b, vjw0VarH);
        xcx0 xcx0Var = (xcx0) vcx0VarT.c();
        ccx0 ccx0VarT = dcx0.t();
        ccx0VarT.d();
        dcx0.u((dcx0) ccx0VarT.b, bfx0Var);
        dcx0 dcx0Var = (dcx0) ccx0VarT.c();
        kcx0 kcx0VarY = mcx0.y();
        kcx0VarY.d();
        mcx0.w((mcx0) kcx0VarY.b, xcx0Var);
        kcx0VarY.d();
        mcx0.u((mcx0) kcx0VarY.b, dcx0Var);
        kcx0VarY.d();
        ((mcx0) kcx0VarY.b).zzh = ecx0Var.zza();
        mcx0 mcx0Var = (mcx0) kcx0VarY.c();
        gcx0VarT.d();
        hcx0.v((hcx0) gcx0VarT.b, mcx0Var);
        hcx0 hcx0Var = (hcx0) gcx0VarT.c();
        zex0 zex0VarT = bfx0.t();
        h7x0 h7x0Var = rzw0.f31382a;
        zex0VarT.g("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zex0VarT.h(i);
        zex0VarT.f(hcx0Var.a());
        return (bfx0) zex0VarT.c();
    }
}
