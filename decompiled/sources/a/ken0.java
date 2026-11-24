package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ken0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18161a;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final mdm g;

    public ken0(jen0 jen0Var, g2v g2vVar, int i) {
        this.f18161a = i;
        this.b = bkb.H(jen0Var.d);
        this.c = bkb.H(jen0Var.e);
        this.d = bkb.H(Boolean.valueOf(jen0Var.f16384a));
        this.e = bkb.H(Boolean.valueOf(jen0Var.b));
        this.f = bkb.H(Boolean.valueOf(jen0Var.c));
        this.g = g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0176  */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        jen0 jen0Var = (jen0) obj;
        jen0Var.getClass();
        n0o0 n0o0Var = this.b;
        fee feeVar = (fee) n0o0Var.getValue();
        feeVar.getClass();
        pz40 pz40VarA = feeVar.a();
        ((List) feeVar.a().getValue()).getClass();
        pz40VarA.setValue(jen0Var.d);
        n0o0 n0o0Var2 = this.c;
        fee feeVar2 = (fee) n0o0Var2.getValue();
        feeVar2.getClass();
        pz40 pz40VarA2 = feeVar2.a();
        ((een0) feeVar2.a().getValue()).getClass();
        pz40VarA2.setValue(jen0Var.e);
        fee feeVar3 = (fee) this.d.getValue();
        feeVar3.getClass();
        pz40 pz40VarA3 = feeVar3.a();
        ((Boolean) feeVar3.a().getValue()).getClass();
        pz40VarA3.setValue(Boolean.valueOf(jen0Var.f16384a));
        fee feeVar4 = (fee) this.e.getValue();
        feeVar4.getClass();
        pz40 pz40VarA4 = feeVar4.a();
        ((Boolean) feeVar4.a().getValue()).getClass();
        pz40VarA4.setValue(Boolean.valueOf(jen0Var.b));
        n0o0 n0o0Var3 = this.f;
        fee feeVar5 = (fee) n0o0Var3.getValue();
        feeVar5.getClass();
        pz40 pz40VarA5 = feeVar5.a();
        ((Boolean) feeVar5.a().getValue()).getClass();
        pz40VarA5.setValue(Boolean.valueOf(jen0Var.c));
        if (((fee) n0o0Var2.getValue()).c() == een0.b) {
            return new men0(this.g);
        }
        if (((fee) n0o0Var2.getValue()).c() == een0.d) {
            return new len0(this.f18161a);
        }
        if (((Collection) ((fee) n0o0Var.getValue()).c()).isEmpty() || ((fee) n0o0Var2.getValue()).c() != een0.c) {
            return new nen0(((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue());
        }
        Iterable<nmp0> iterable = (Iterable) ((fee) n0o0Var.getValue()).c();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (nmp0 nmp0Var : iterable) {
            long j = nmp0Var.f23784a;
            String str = (String) CollectionsKt.firstOrNull(nmp0Var.d);
            String str2 = nmp0Var.b;
            pz40 pz40Var = s6t0.f31722a;
            e2l0 e2l0Var = new e2l0(str2, s6t0.b().f33626a.getTextPrimary());
            p1l0 p1l0Var = p1l0.SPORT_ICON;
            p1l0 p1l0Var2 = p1l0.PLAYER_ICON;
            String string = "";
            if (str == null || str.length() == 0) {
                str = null;
            } else if (!kotlin.text.c.x(str, ujn.h, false)) {
                if (str.length() == 0) {
                    str = "";
                } else {
                    List list = u0d.f34849a;
                    if (u0d.c(str)) {
                        str = "";
                    } else {
                        str = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                    }
                }
            }
            String str3 = str;
            long j2 = nmp0Var.c;
            if (j2 != 0) {
                bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                rz4.s(j2, ".svg", bzuVarD);
                string = ((StringBuilder) bzuVarD.b).toString();
            }
            s1l0 s1l0Var = new s1l0(p1l0Var2, null, str3, string, null, 100);
            f3l0 f3l0Var = new f3l0(nmp0Var.f, nmp0Var.e);
            zcl zclVar = qmk.f28987a;
            arrayList.add(new aan0(j, new zrm(e2l0Var, s1l0Var, f3l0Var, (d4d) null, new l3l0(16.0f), 8)));
        }
        return new oen0(dyb.r0(arrayList));
    }
}
