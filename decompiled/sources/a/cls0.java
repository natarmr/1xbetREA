package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cls0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4576a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ g2v c;

    public /* synthetic */ cls0(g2v g2vVar, ctf0 ctf0Var, byte b) {
        this.f4576a = b;
        this.c = g2vVar;
        this.b = ctf0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s8u0 p8u0Var;
        boolean z;
        y3d y3dVar;
        bau0 y9u0Var;
        int i;
        byte b = this.f4576a;
        g2v g2vVar = this.c;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                pks0 pks0Var = (pks0) obj;
                pks0Var.getClass();
                return new mya(pks0Var, g2vVar, ctf0Var);
            case 1:
                s5t0 s5t0Var = (s5t0) obj;
                s5t0Var.getClass();
                return new by8(s5t0Var, ctf0Var, g2vVar);
            case 2:
                aat0 aat0Var = (aat0) obj;
                aat0Var.getClass();
                return new s7p0(aat0Var, ctf0Var, g2vVar);
            case 3:
                wat0 wat0Var = (wat0) obj;
                wat0Var.getClass();
                return new s7p0(wat0Var, ctf0Var, g2vVar);
            case 4:
                ubt0 ubt0Var = (ubt0) obj;
                ubt0Var.getClass();
                return new ov0(ubt0Var, ctf0Var, g2vVar);
            case 5:
                b0u0 b0u0Var = (b0u0) obj;
                b0u0Var.getClass();
                return new v6o(b0u0Var, ctf0Var, g2vVar);
            case 6:
                n9u0 n9u0Var = (n9u0) obj;
                n9u0Var.getClass();
                ctf0Var.getClass();
                pz40 pz40Var = s6t0.f31722a;
                imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.verification, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
                o8u0 o8u0Var = n9u0Var.b;
                List<c8u0> list = n9u0Var.f23158a;
                int iOrdinal = o8u0Var.ordinal();
                if (iOrdinal != 0) {
                    g2v g2vVar2 = this.c;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        p8u0Var = new q8u0(g2v.b(g2vVar2, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    } else if (list.isEmpty()) {
                        p8u0Var = new q8u0(g2v.b(g2vVar2, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                    } else {
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (c8u0 c8u0Var : list) {
                            c8u0Var.getClass();
                            int i2 = c8u0Var.f3933a.f21524a;
                            String str = c8u0Var.e;
                            uui0 uui0Var = new uui0(c8u0Var.b, null, c8u0Var.c, null, null, 58);
                            StringBuilder sb = new StringBuilder(ujn.h);
                            String str2 = c8u0Var.d;
                            if (str2.length() == 0) {
                                sb.setLength(0);
                                z = true;
                            } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                                z = true;
                                sb.setLength(0);
                                sb.append(str2);
                            } else {
                                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                    sb.append('/');
                                }
                                z = true;
                                sb.append(StringsKt.y0(str2, '/'));
                            }
                            n0x n0xVar = new n0x(sb.toString());
                            if (StringsKt.O(str2, "/glyph/", false) || str2.length() == 0) {
                                pz40 pz40Var2 = s6t0.f31722a;
                                y3dVar = new y3d(s6t0.b().f33626a.getPrimary());
                            } else {
                                y3dVar = null;
                            }
                            arrayList.add(new s7u0(i2, str, new rqm((vui0) uui0Var, (pui0) new nui0(Integer.valueOf(R.drawable.verification_option_default_logo), null, n0xVar, y3dVar, null, null, 0.0f, 242), (pvi0) new fvi0(null), (d4d) null, (tvi0) null, wui0.b, true, (e900) null, 312)));
                        }
                        p8u0Var = new p8u0(dyb.o0(arrayList));
                    }
                } else {
                    p8u0Var = r8u0.f30046a;
                }
                return new o9u0(immVar, p8u0Var);
            case 7:
                ebu0 ebu0Var = (ebu0) obj;
                ebu0Var.getClass();
                ctf0Var.getClass();
                pz40 pz40Var3 = s6t0.f31722a;
                imm immVar2 = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ebu0Var.f7536a, ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                boolean z2 = ebu0Var.d;
                lxw lxwVar = ebu0Var.e;
                x9u0 x9u0Var = ebu0Var.c;
                cau0 cau0Var = ebu0Var.b;
                int iOrdinal2 = x9u0Var.ordinal();
                if (iOrdinal2 == 0) {
                    y9u0Var = aau0.f549a;
                } else if (iOrdinal2 == 1) {
                    switch (cau0Var.ordinal()) {
                        case 0:
                        case 1:
                        case 5:
                        case 8:
                            i = R.drawable.ic_required_verification_status;
                            break;
                        case 2:
                            i = R.drawable.ic_accepted_verification_status;
                            break;
                        case 3:
                            i = R.drawable.ic_in_progress_verification_status;
                            break;
                        case 4:
                        case 7:
                            i = R.drawable.ic_denied_verification_status;
                            break;
                        case 6:
                            i = R.drawable.ic_complete_verification_status;
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                    Integer numV = rsm0.v(cau0Var);
                    String strA = numV != null ? ctf0Var.b.a(numV.intValue(), Arrays.copyOf(new Object[0], 0)) : null;
                    int iIntValue = rsm0.t(cau0Var, z2).intValue();
                    lsm0 lsm0Var = ctf0Var.b;
                    String strA2 = lsm0Var.a(iIntValue, Arrays.copyOf(new Object[0], 0));
                    Integer numU = rsm0.u(cau0Var, lxwVar);
                    y9u0Var = new y9u0(i, strA, strA2, numU != null ? new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(numU.intValue(), Arrays.copyOf(new Object[0], 0))), true, false, true), rk.m))) : null);
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    y9u0Var = new z9u0(g2v.b(this.c, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                return new gbu0(immVar2, y9u0Var, cau0Var != cau0.f);
            case 8:
                kou0 kou0Var = (kou0) obj;
                kou0Var.getClass();
                return new e3p0(kou0Var, ctf0Var, g2vVar);
            case 9:
                fru0 fru0Var = (fru0) obj;
                fru0Var.getClass();
                return new e3p0(fru0Var, ctf0Var, g2vVar);
            case 10:
                wtu0 wtu0Var = (wtu0) obj;
                wtu0Var.getClass();
                return new lib(wtu0Var, ctf0Var, g2vVar);
            default:
                j0v0 j0v0Var = (j0v0) obj;
                j0v0Var.getClass();
                return new ov0(j0v0Var, g2vVar, ctf0Var);
        }
    }

    public /* synthetic */ cls0(ctf0 ctf0Var, g2v g2vVar, byte b) {
        this.f4576a = b;
        this.b = ctf0Var;
        this.c = g2vVar;
    }
}
