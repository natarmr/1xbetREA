package a;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zme implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44622a;
    public final /* synthetic */ ane b;

    public /* synthetic */ zme(ane aneVar, abi0 abi0Var) {
        this.f44622a = (byte) 3;
        this.b = aneVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44622a;
        boolean z = false;
        ane aneVar = this.b;
        switch (b) {
            case 0:
                ez2 ez2Var = (ez2) obj;
                pz40 pz40Var = aneVar.s.t;
                Boolean bool = Boolean.TRUE;
                ((hgk0) pz40Var).setValue(bool);
                ((hgk0) aneVar.s.s).setValue(bool);
                djz djzVar = aneVar.s;
                CharSequence textValue = ez2Var.f8652a.isText() ? ez2Var.f8652a.getTextValue() : null;
                textValue.getClass();
                ane.c1(djzVar, (String) textValue, aneVar.t, aneVar.u);
                return bool;
            case 1:
                List list = (List) obj;
                if (aneVar.s.d() != null) {
                    b9q0 b9q0VarD = aneVar.s.d();
                    b9q0VarD.getClass();
                    list.add(b9q0VarD.f2224a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ane.c1(aneVar.s, ((j83) obj).b, aneVar.t, aneVar.u);
                return Boolean.TRUE;
            default:
                j83 j83Var = (j83) obj;
                if (!aneVar.t && aneVar.u) {
                    r8q0 r8q0Var = aneVar.s.e;
                    if (r8q0Var != null) {
                        List listJ = q3d.j(new bfq(), new l8d(j83Var, 1));
                        djz djzVar2 = aneVar.s;
                        hsj hsjVar = djzVar2.d;
                        ome omeVar = djzVar2.v;
                        a8q0 a8q0VarB = hsjVar.b(listJ);
                        r8q0Var.a(null, a8q0VarB);
                        omeVar.invoke(a8q0VarB);
                    } else {
                        a8q0 a8q0Var = aneVar.r;
                        String str = a8q0Var.f440a.b;
                        long j = a8q0Var.b;
                        int i = o9q0.c;
                        String string = StringsKt.h0(str, (int) (j >> 32), (int) (j & 4294967295L), j83Var).toString();
                        int length = j83Var.b.length() + ((int) (aneVar.r.b >> 32));
                        aneVar.s.v.invoke(new a8q0(string, s7n0.e(length, length), 4));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ zme(ane aneVar, byte b) {
        this.f44622a = b;
        this.b = aneVar;
    }
}
