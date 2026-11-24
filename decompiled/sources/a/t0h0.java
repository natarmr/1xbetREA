package a;

import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes5.dex */
public final class t0h0 implements miu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33119a = 0;
    public final Object b;
    public final Object c;

    public t0h0(j0h0 j0h0Var, i1w0 i1w0Var) {
        j0h0Var.getClass();
        i1w0Var.getClass();
        this.b = j0h0Var;
        this.c = i1w0Var;
    }

    @Override // a.miu0
    public final diu0 c(Class cls, by40 by40Var) {
        byte b = this.f33119a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return ((j0h0) obj).a(zzg0.a(by40Var), (i1w0) obj2);
            default:
                vzg0 vzg0VarA = zzg0.a(by40Var);
                pru pruVar = ((sni) ((qni) obj2).f29030a.c).h;
                g090 g090Var = new g090();
                g090Var.f10448a = vzg0VarA;
                boolean z = pruVar.a().N.c;
                Boolean bool = (Boolean) vzg0VarA.a("KEY_ENTER_PHONE_CODE_BY_MANUALLY");
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                iun iunVar = iun.f15405a;
                String str = (String) vzg0VarA.a("KEY_PHONE_CODE_BY_MANUALLY");
                if (str == null) {
                    str = "+";
                }
                String str2 = str;
                String str3 = (String) vzg0VarA.a("KEY_SEARCH_VALUE");
                if (str3 == null) {
                    str3 = "";
                }
                g090Var.b = q7m0.a(new cr90(z, zBooleanValue, str2, str3, iunVar, false, null, (Integer) vzg0VarA.a("KEY_BOTTOM_SHEET_STATE_BY_MANUALLY")));
                pni pniVar = (pni) obj;
                pniVar.getClass();
                sni sniVar = (sni) pniVar.f27288a.c;
                ctf0 ctf0Var = sniVar.f32496a;
                gnu gnuVar = new gnu(new dq00(sniVar.b, sniVar.c));
                mne mneVarH = ((psc) sniVar.d.b).h();
                x1x.x(mneVarH);
                duj dujVar = sniVar.e;
                PickerParams pickerParams = sniVar.f;
                yp90 yp90Var = sniVar.b;
                imb imbVar = sniVar.c;
                fnu fnuVar = new fnu(new dq00(yp90Var, imbVar));
                bot botVar = sniVar.g;
                pru pruVar2 = sniVar.h;
                return new es90(ctf0Var, gnuVar, mneVarH, dujVar, pickerParams, fnuVar, new wti(botVar, pruVar2), new fnu(new dq00(yp90Var, imbVar)), g090Var, new cyu(new b4j(sniVar.i, (byte) 3), sniVar.j, sniVar.k), pruVar2);
        }
    }

    public t0h0(pni pniVar, qni qniVar) {
        pniVar.getClass();
        qniVar.getClass();
        this.b = pniVar;
        this.c = qniVar;
    }
}
