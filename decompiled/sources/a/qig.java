package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes2.dex */
public final class qig implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28790a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ qig(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f28790a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchFieldException {
        byte b = this.f28790a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ComponentCallbacks2 componentCallbacks2 = (Application) obj4;
                af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(kig.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof kig)) {
                        ze3Var = null;
                    }
                    kig kigVar = (kig) ze3Var;
                    if (kigVar != null) {
                        CyberChampsMainParams cyberChampsMainParams = (CyberChampsMainParams) obj3;
                        sip sipVar = (sip) obj2;
                        cog cogVar = (cog) obj;
                        cyberChampsMainParams.getClass();
                        sipVar.getClass();
                        cogVar.getClass();
                        cad cadVar = kigVar.f18336a;
                        pyg pygVar = kigVar.b;
                        iw20 iw20Var = kigVar.c;
                        ugf0 ugf0Var = kigVar.d;
                        iip iipVar = kigVar.e;
                        a1d a1dVar = kigVar.f;
                        m1e m1eVar = kigVar.g;
                        ctf0 ctf0Var = kigVar.h;
                        wdk0 wdk0Var = kigVar.i;
                        viu viuVar = kigVar.j;
                        g2v g2vVar = kigVar.k;
                        b3c0 b3c0Var = kigVar.l;
                        oeg0 oeg0Var = kigVar.m;
                        fvt0 fvt0Var = kigVar.n;
                        nv20 nv20Var = kigVar.o;
                        m1eVar.getClass();
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        b3c0Var.getClass();
                        oeg0Var.getClass();
                        pygVar.getClass();
                        iipVar.getClass();
                        return new kei(cadVar, pygVar, iw20Var, ugf0Var, iipVar, a1dVar, m1eVar, ctf0Var, wdk0Var, cyberChampsMainParams, sipVar, viuVar, g2vVar, b3c0Var, oeg0Var, fvt0Var, nv20Var, cogVar);
                    }
                }
                jf4.n(b1j.i(kig.class, "Cannot create dependency "));
                return null;
            case 1:
                riu0 riu0Var = (riu0) ((Function0) obj4).invoke();
                miu0 miu0Var = (miu0) ((Function0) obj3).invoke();
                wmv wmvVar = riu0Var instanceof wmv ? (wmv) riu0Var : null;
                wbf wbfVarO = wmvVar != null ? wmvVar.o() : vbf.b;
                piu0 piu0VarG = riu0Var.g();
                piu0VarG.getClass();
                miu0Var.getClass();
                wbfVarO.getClass();
                h0q0 h0q0Var = new h0q0(piu0VarG, miu0Var, wbfVarO);
                String str = (String) ((Function0) obj2).invoke();
                sgy sgyVarB = (sgy) obj;
                if (sgyVarB == null) {
                    sgyVarB = sre0.f32672a.b(k3t0.class);
                }
                Class clsG = azw.G(sgyVarB);
                str.getClass();
                return h0q0Var.t(sre0.f32672a.b(clsG), str);
            case 2:
                String str2 = (String) obj4;
                ihy ihyVar = (ihy) obj3;
                h0d0 h0d0Var = (h0d0) obj2;
                String str3 = (String) obj;
                bh30 bh30VarF = ihy.f14802a.f(str2);
                if (bh30VarF != null) {
                    return ihyVar.u(Integer.parseInt((String) ((ah30) bh30VarF.a()).get(1)), str2);
                }
                if (ihyVar instanceof xgy) {
                    xgy xgyVar = (xgy) ihyVar;
                    if (xgyVar.b.getAnnotation(Metadata.class) == null) {
                        try {
                            Field fieldA = ihyVar.A(h0d0Var.getName());
                            if (Modifier.isStatic(fieldA.getModifiers())) {
                                return new t9y(ihyVar, fieldA, h0d0Var.getBoundReceiver(), rgy.k);
                            }
                        } catch (Exception unused) {
                            if (str2.equals("getEntries()Lkotlin/enums/EnumEntries;")) {
                                return new b9y(xgyVar);
                            }
                        }
                    }
                }
                if (ihyVar instanceof zhy) {
                    return new ksy(ihyVar, str2, h0d0Var.getBoundReceiver(), ihyVar.C(str3, str2), rgy.k);
                }
                return new kdk(ihyVar, str3, str2, h0d0Var.getBoundReceiver());
            case 3:
                String str4 = (String) obj4;
                ihy ihyVar2 = (ihy) obj3;
                cz40 cz40Var = (cz40) obj2;
                String str5 = (String) obj;
                bh30 bh30VarF2 = ihy.f14802a.f(str4);
                if (bh30VarF2 != null) {
                    return ihyVar2.u(Integer.parseInt((String) ((ah30) bh30VarF2.a()).get(1)), str4);
                }
                if ((ihyVar2 instanceof xgy) && ((xgy) ihyVar2).b.getAnnotation(Metadata.class) == null) {
                    Field fieldA2 = ihyVar2.A(cz40Var.getName());
                    if (Modifier.isStatic(fieldA2.getModifiers())) {
                        return new k9y(ihyVar2, fieldA2, cz40Var.getBoundReceiver(), rgy.k);
                    }
                }
                if (ihyVar2 instanceof zhy) {
                    return new ury(ihyVar2, str4, cz40Var.getBoundReceiver(), ihyVar2.C(str5, str4), rgy.k);
                }
                return new sck(ihyVar2, str5, str4, cz40Var.getBoundReceiver());
            case 4:
                ihy ihyVar3 = (ihy) obj4;
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                i0d0 i0d0Var = (i0d0) obj;
                if (ihyVar3 instanceof zhy) {
                    return new nsy(ihyVar3, str7, i0d0Var.getBoundReceiver(), ihyVar3.C(str6, str7), rgy.k);
                }
                return new ndk(ihyVar3, str6, str7, i0d0Var.getBoundReceiver());
            default:
                ihy ihyVar4 = (ihy) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                dz40 dz40Var = (dz40) obj;
                if (ihyVar4 instanceof zhy) {
                    return new wry(ihyVar4, str9, dz40Var.getBoundReceiver(), ihyVar4.C(str8, str9), rgy.k);
                }
                return new uck(ihyVar4, str8, str9, dz40Var.getBoundReceiver());
        }
    }
}
