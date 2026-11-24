package a;

import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wtc extends w46 {
    public final ctf0 b;
    public final i1w0 c;
    public final p7m0 d;
    public final ol60 e;

    public wtc(fhj fhjVar, ctf0 ctf0Var, i1w0 i1w0Var) {
        String string;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = i1w0Var;
        sff0 sff0VarA = ((pru) fhjVar.b).a();
        f3c0 f3c0Var = sff0VarA.k;
        es esVar = (es) fhjVar.f9543a;
        fsd fsdVar = (fsd) esVar.b;
        zdf zdfVar = (zdf) fsdVar.b.c.getValue();
        int i = fsdVar.a().f36976a;
        ((peg0) esVar.f8305a).i();
        boolean z = zdfVar.d;
        boolean z2 = zdfVar.f44210a;
        boolean z3 = zdfVar.b;
        boolean z4 = zdfVar.c;
        boolean z5 = zdfVar.e;
        ptc ptcVar = (ptc) ((lrc) esVar.c).b;
        Signature[] signatureArrC = ptcVar.c();
        int length = signatureArrC.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                string = "";
                break;
            }
            try {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signatureArrC[i2].toByteArray()));
                certificateGenerateCertificate.getClass();
                string = ((X509Certificate) certificateGenerateCertificate).getSerialNumber().toString();
                string.getClass();
                break;
            } catch (CertificateException e) {
                e.printStackTrace();
                i2++;
            }
        }
        String strA = ptcVar.a("SHA-256");
        String strA2 = ptcVar.a("SHA-1");
        boolean z6 = f3c0Var.i;
        boolean z7 = f3c0Var.k;
        boolean z8 = f3c0Var.m;
        boolean z9 = f3c0Var.l;
        boolean z10 = f3c0Var.j;
        boolean z11 = f3c0Var.n;
        boolean z12 = f3c0Var.o;
        boolean z13 = f3c0Var.p;
        boolean z14 = f3c0Var.q;
        boolean z15 = f3c0Var.r;
        String str = sff0VarA.d.f27973a.b;
        String str2 = sff0VarA.f32117a.f;
        ctf0 ctf0Var2 = this.b;
        ctf0Var2.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        lsm0 lsm0Var = ctf0Var2.b;
        lc00VarB.add(new qsv(ctf0Var2.f(R.string.test_project_identificator, new Object[0])));
        lc00VarB.add(new euy(String.valueOf(i), R.attr.uikitSecondary, ctf0Var2.f(R.string.app_name, new Object[0]), uwx.d));
        lc00VarB.add(new qsv(ctf0Var2.f(R.string.test_apps_flyer_key, new Object[0])));
        lc00VarB.add(new xrq0());
        lc00VarB.add(new qsv(ctf0Var2.f(R.string.test_referral_link, new Object[0])));
        lc00VarB.add(new jsq0(ctf0Var2.f(R.string.appsflyer_host, new Object[0])));
        lc00VarB.add(new qsv(ctf0Var2.f(R.string.test_certificate_serial_number, new Object[0])));
        lc00VarB.add(new zrq0(string));
        lc00VarB.add(new qsv(lsm0Var.a(R.string.test_certificate_sha256, Arrays.copyOf(new Object[0], 0))));
        lc00VarB.add(new zrq0(strA));
        lc00VarB.add(new qsv(lsm0Var.a(R.string.test_certificate_sha1, Arrays.copyOf(new Object[0], 0))));
        lc00VarB.add(new zrq0(strA2));
        lc00VarB.add(new qsv(ctf0Var2.f(R.string.social_networks, new Object[0])));
        String strJ = bfb.J(ctf0Var2, z6);
        int i3 = R.attr.uikitStaticRed;
        int i4 = z6 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed;
        String strF = ctf0Var2.f(R.string.social_vk, new Object[0]);
        uwx uwxVar = uwx.f36413a;
        lc00VarB.add(new euy(strJ, i4, strF, uwxVar));
        String strJ2 = bfb.J(ctf0Var2, z10);
        int i5 = z10 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed;
        String strF2 = ctf0Var2.f(R.string.social_google, new Object[0]);
        uwx uwxVar2 = uwx.b;
        lc00VarB.add(new euy(strJ2, i5, strF2, uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z13), z13 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, ctf0Var2.f(R.string.social_x_com, new Object[0]), uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z14), z14 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, ctf0Var2.f(R.string.social_discord, new Object[0]), uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z8), z8 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, ctf0Var2.f(R.string.social_yandex, new Object[0]), uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z9), z9 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, ctf0Var2.f(R.string.social_mailru_label_new, new Object[0]), uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z7), z7 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, ctf0Var2.f(R.string.social_ok, new Object[0]), uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z11), z11 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, ctf0Var2.f(R.string.social_telegram, new Object[0]), uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z12), z12 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, ctf0Var2.f(R.string.social_apple_id, new Object[0]), uwxVar2));
        String strJ3 = bfb.J(ctf0Var2, z15);
        int i6 = z15 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed;
        String strF3 = ctf0Var2.f(R.string.social_its_me, new Object[0]);
        uwx uwxVar3 = uwx.c;
        lc00VarB.add(new euy(strJ3, i6, strF3, uwxVar3));
        lc00VarB.add(new qsv(ctf0Var2.f(R.string.test_macros, new Object[0])));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z), z ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, StringsKt.W(str) ? ctf0Var2.f(R.string.top_games, new Object[0]) : str, uwxVar));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z2), z2 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, StringsKt.W(str2) ? ctf0Var2.f(R.string.toto_name, new Object[0]) : str2, uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z3), z3 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, ctf0Var2.f(R.string.betconstructor, new Object[0]), uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z4), z4 ? R.attr.uikitStaticGreen : R.attr.uikitStaticRed, ctf0Var2.f(R.string.finance_bets, new Object[0]), uwxVar2));
        lc00VarB.add(new euy(bfb.J(ctf0Var2, z5), z5 ? R.attr.uikitStaticGreen : i3, ctf0Var2.f(R.string.casino, new Object[0]), uwxVar3));
        this.d = q7m0.a(kotlin.collections.a.a(lc00VarB));
        this.e = new ol60(3);
    }
}
