package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class q3v0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28070a;
    public final /* synthetic */ r3v0 b;

    public /* synthetic */ q3v0(r3v0 r3v0Var, byte b) {
        this.f28070a = b;
        this.b = r3v0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object g0g0Var;
        Object g0g0Var2;
        Object g0g0Var3;
        Object g0g0Var4;
        Object g0g0Var5;
        Object g0g0Var6;
        byte b = this.f28070a;
        r3v0 r3v0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                str.getClass();
                try {
                    e0g0 e0g0Var = j0g0.b;
                    vby vbyVar = r3v0Var.f29804a;
                    vbyVar.getClass();
                    g0g0Var = ((wxw) vbyVar.b(wxw.Companion.serializer(jv70.Companion.serializer()), str)).b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                if (g0g0Var != null) {
                    return r7x.I((jv70) g0g0Var);
                }
                return null;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                try {
                    e0g0 e0g0Var3 = j0g0.b;
                    vby vbyVar2 = r3v0Var.f29804a;
                    vbyVar2.getClass();
                    g0g0Var2 = ((wxw) vbyVar2.b(wxw.Companion.serializer(ew70.Companion.serializer()), str2)).b;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var4 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                if (g0g0Var2 instanceof g0g0) {
                    g0g0Var2 = null;
                }
                if (g0g0Var2 != null) {
                    return a8k0.K((ew70) g0g0Var2);
                }
                return null;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                try {
                    e0g0 e0g0Var5 = j0g0.b;
                    vby vbyVar3 = r3v0Var.f29804a;
                    vbyVar3.getClass();
                    g0g0Var3 = ((wxw) vbyVar3.b(wxw.Companion.serializer(sw70.Companion.serializer()), str3)).b;
                    break;
                } catch (Throwable th3) {
                    e0g0 e0g0Var6 = j0g0.b;
                    g0g0Var3 = new g0g0(th3);
                }
                if (g0g0Var3 instanceof g0g0) {
                    g0g0Var3 = null;
                }
                if (g0g0Var3 != null) {
                    return h8x.S((sw70) g0g0Var3);
                }
                return null;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                try {
                    e0g0 e0g0Var7 = j0g0.b;
                    vby vbyVar4 = r3v0Var.f29804a;
                    vbyVar4.getClass();
                    g0g0Var4 = ((wxw) vbyVar4.b(wxw.Companion.serializer(mv70.Companion.serializer()), str4)).b;
                    break;
                } catch (Throwable th4) {
                    e0g0 e0g0Var8 = j0g0.b;
                    g0g0Var4 = new g0g0(th4);
                }
                if (g0g0Var4 instanceof g0g0) {
                    g0g0Var4 = null;
                }
                if (g0g0Var4 != null) {
                    return u7x.I((mv70) g0g0Var4);
                }
                return null;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                try {
                    e0g0 e0g0Var9 = j0g0.b;
                    vby vbyVar5 = r3v0Var.f29804a;
                    vbyVar5.getClass();
                    g0g0Var5 = ((wxw) vbyVar5.b(wxw.Companion.serializer(mx70.Companion.serializer()), str5)).b;
                    break;
                } catch (Throwable th5) {
                    e0g0 e0g0Var10 = j0g0.b;
                    g0g0Var5 = new g0g0(th5);
                }
                if (g0g0Var5 instanceof g0g0) {
                    g0g0Var5 = null;
                }
                if (g0g0Var5 != null) {
                    return m8x.m0((mx70) g0g0Var5);
                }
                return null;
            default:
                String str6 = (String) obj;
                str6.getClass();
                try {
                    e0g0 e0g0Var11 = j0g0.b;
                    vby vbyVar6 = r3v0Var.f29804a;
                    vbyVar6.getClass();
                    g0g0Var6 = ((wxw) vbyVar6.b(wxw.Companion.serializer(zv70.Companion.serializer()), str6)).b;
                    break;
                } catch (Throwable th6) {
                    e0g0 e0g0Var12 = j0g0.b;
                    g0g0Var6 = new g0g0(th6);
                }
                if (g0g0Var6 instanceof g0g0) {
                    g0g0Var6 = null;
                }
                if (g0g0Var6 == null) {
                    return null;
                }
                String str7 = ((zv70) g0g0Var6).f45043a;
                return kng0.k("://open/betonyournationalteam?", str7 != null ? "type=".concat(str7) : null);
        }
    }
}
