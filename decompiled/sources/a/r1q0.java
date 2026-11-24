package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class r1q0 extends bnn0 implements aer {
    public /* synthetic */ ghp i;
    public /* synthetic */ cre j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;
    public /* synthetic */ String m;
    public final /* synthetic */ n660 n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1q0(n660 n660Var, boolean z, yje yjeVar) {
        super(6, yjeVar);
        this.n = n660Var;
        this.o = z;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ghp ghpVar = this.i;
        cre creVar = this.j;
        boolean z = this.k;
        boolean z2 = this.l;
        String str = this.m;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        boolean z3 = ghpVar.f11311a;
        boolean z4 = ghpVar.b;
        boolean z5 = ghpVar.c;
        boolean z6 = ghpVar.d;
        boolean z7 = ghpVar.e;
        boolean z8 = ghpVar.f;
        boolean z9 = ghpVar.g;
        String strA = str;
        boolean z10 = ghpVar.h;
        n660 n660Var = this.n;
        peg0 peg0Var = (peg0) n660Var.c;
        j1q0 j1q0Var = (j1q0) n660Var.f22981a;
        String strC = q7d0.c(j1q0Var.f15748a.f21021a, "FAKE_WORDS_ENABLED");
        if (strC == null) {
            strC = "";
        }
        if (!z2 && strA.length() <= 0) {
            strA = ((knf0) ((yk50) n660Var.d).b).a();
        }
        String str2 = strA;
        ((us3) peg0Var.b).getClass();
        String string = ((us3) peg0Var.b).c().toString();
        boolean zK = j1q0Var.f15748a.k();
        boolean zE = j1q0Var.f15748a.e();
        String str3 = strC;
        boolean zL = j1q0Var.f15748a.l();
        boolean zM = j1q0Var.f15748a.m();
        boolean z11 = j1q0Var.f15748a.f21021a.a().getBoolean("SPECIAL_EVENT_ENABLE", false);
        boolean zH = j1q0Var.f15748a.h(this.o);
        boolean z12 = ghpVar.q;
        boolean z13 = ghpVar.p;
        String strB = j1q0Var.f15748a.f21021a.b("MANUAL_TEST_DOMAIN", "");
        return new l1q0(z3, z4, z5, z6, z7, z8, z9, z10, str3, str2, false, creVar, string, zE, zL, zM, zK, z11, zH, z, z13, z12, strB == null ? "" : strB, j1q0Var.f15748a.q(), z2, ghpVar.t, ghpVar.s, j1q0Var.f15748a.f21021a.a().getBoolean("TEST_MULTIPLY_STRINGS_ENABLE", false));
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        r1q0 r1q0Var = new r1q0(this.n, this.o, (yje) obj6);
        r1q0Var.i = (ghp) obj;
        r1q0Var.j = (cre) obj2;
        r1q0Var.k = zBooleanValue;
        r1q0Var.l = zBooleanValue2;
        r1q0Var.m = (String) obj5;
        return r1q0Var.invokeSuspend(Unit.f46060a);
    }
}
