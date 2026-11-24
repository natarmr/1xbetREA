package a;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class rxn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ boolean l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Enum o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxn(o43 o43Var, boolean z, k43 k43Var, boolean z2, c0d c0dVar, yje yjeVar) {
        super(2, yjeVar);
        this.m = o43Var;
        this.j = z;
        this.n = k43Var;
        this.l = z2;
        this.o = c0dVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Enum r1 = this.o;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                rxn rxnVar = new rxn((o43) this.m, this.j, (k43) obj2, this.l, (c0d) r1, yjeVar);
                rxnVar.k = obj;
                return rxnVar;
            default:
                rxn rxnVar2 = new rxn((vff0) obj2, (rhi0) r1, this.l, yjeVar);
                rxnVar2.k = obj;
                return rxnVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((rxn) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws roe {
        String string;
        rxn rxnVar;
        Object g0g0Var;
        Object g0g0Var2;
        yje yjeVar = null;
        switch (this.i) {
            case 0:
                vne vneVar = (vne) this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                zsf zsfVar = new zsf(0.42f, 0.0f, 1.0f, 1.0f);
                o43 o43Var = (o43) this.m;
                boolean z = this.j;
                k43 k43Var = (k43) this.n;
                boolean z2 = this.l;
                c0d c0dVar = (c0d) this.o;
                if (z) {
                    qxn qxnVar = new qxn((t33) o43Var.g.f40005a, k43Var.i(), zsfVar, o43Var.e, null);
                    zsfVar = zsfVar;
                    qjj.W(vneVar, null, null, qxnVar, 3);
                }
                if (z2) {
                    qjj.W(vneVar, null, null, new se5((Object) o43Var.e, (Object) zsfVar, o43Var.g.f40005a, k43Var.d(), (yje) null, (byte) 3), 3);
                }
                if (c0dVar == c0d.b || c0dVar == c0d.c) {
                    qjj.W(vneVar, null, null, new mee((Object) o43Var.f, (Object) zsfVar, (Object) ((t33) o43Var.g.f40005a), k43Var.d(), (Object) o43Var.d, (yje) null, (byte) 2), 3);
                }
                if (c0dVar == c0d.e) {
                    qjj.W(vneVar, null, null, new o73(o43Var.f, zsfVar, yjeVar, (byte) 4), 3);
                }
                return Unit.f46060a;
            default:
                vne vneVar2 = (vne) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    string = ((vff0) this.n).f.c().toString();
                    a1d a1dVar = ((vff0) this.n).b;
                    this.k = vneVar2;
                    this.m = string;
                    this.j = true;
                    rxnVar = this;
                    obj = ((zff0) ((sza) a1dVar.b).invoke()).a("org.xbet.client1", 22, string, "application/vnd.xenvelop+json", rxnVar);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str = (String) this.m;
                    z1x.P(obj);
                    rxnVar = this;
                    string = str;
                }
                mwn mwnVar = (mwn) ((dx5) obj).a();
                vff0 vff0Var = (vff0) rxnVar.n;
                rhi0 rhi0Var = (rhi0) rxnVar.o;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = vff0Var.g.a(mwnVar, rhi0Var, vff0Var.h);
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                yff0 yff0Var = (yff0) g0g0Var;
                if (yff0Var == null) {
                    return Unit.f46060a;
                }
                vff0 vff0Var2 = (vff0) rxnVar.n;
                rhi0 rhi0Var2 = (rhi0) rxnVar.o;
                nrd nrdVar = vff0Var2.g;
                vby vbyVar = vff0Var2.h;
                String str2 = mwnVar.b;
                if (str2 != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(lmc.Y(nrdVar.a(vff0Var2.e.s(), rhi0Var2, vbyVar).f42540a, vbyVar));
                    try {
                        g0g0Var2 = lmc.Y(vff0Var2.b(rhi0Var2).f42540a, vbyVar);
                    } catch (Throwable th2) {
                        e0g0 e0g0Var3 = j0g0.b;
                        g0g0Var2 = new g0g0(th2);
                    }
                    Object obj2 = lun.f20680a;
                    obj2.getClass();
                    if (g0g0Var2 instanceof g0g0) {
                        g0g0Var2 = obj2;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap((Map) g0g0Var2);
                    edy edyVarY = lmc.Y(yff0Var.f42540a, vbyVar);
                    HashMap map = new HashMap(edyVarY.f7643a.size() + linkedHashMap2.size() + linkedHashMap.size());
                    map.putAll(linkedHashMap);
                    map.putAll(linkedHashMap2);
                    map.putAll(edyVarY);
                    String strD = vbyVar.d(yff0.Companion.serializer(), new yff0(lmc.X(map, vbyVar)));
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = strD.getBytes(charset);
                    bytes.getClass();
                    try {
                        byte[] bytes2 = nrdVar.f23996a.b(rhi0Var2).getBytes(charset);
                        bytes2.getClass();
                        byte[] bArrC = zvv.c(str2);
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, "AES");
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrC);
                        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        cipher.init(1, secretKeySpec, ivParameterSpec);
                        byte[] bArrDoFinal = cipher.doFinal(bytes);
                        bArrDoFinal.getClass();
                        String strG = zvv.g(bArrDoFinal);
                        Arrays.fill(bytes2, (byte) 0);
                        Arrays.fill(bArrC, (byte) 0);
                        mwnVar = new mwn(strG, str2);
                    } catch (Throwable th3) {
                        e0g0 e0g0Var4 = j0g0.b;
                        if (j0g0.a(new g0g0(th3)) == null) {
                            csj.b();
                            return null;
                        }
                        jf4.n("Config encryption error");
                        return null;
                    }
                    break;
                }
                ((vff0) rxnVar.n).d.e(mwnVar, string, (rhi0) rxnVar.o);
                vff0 vff0Var3 = (vff0) rxnVar.n;
                rhi0 rhi0Var3 = (rhi0) rxnVar.o;
                boolean z4 = rxnVar.l;
                yff0 yff0VarA = vff0Var3.g.a(mwnVar, rhi0Var3, vff0Var3.h);
                vff0Var3.j.put(rhi0Var3, yff0VarA);
                vff0Var3.k.clear();
                vff0Var3.c(yff0VarA, z4);
                vff0Var3.o = vff0.i(yff0VarA);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxn(vff0 vff0Var, rhi0 rhi0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.n = vff0Var;
        this.o = rhi0Var;
        this.l = z;
    }
}
