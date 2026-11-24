package a;

/* JADX INFO: loaded from: classes.dex */
public final class s2e extends dw5 {
    public final /* synthetic */ byte c = 1;
    public final /* synthetic */ t2e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2e(t2e t2eVar) {
        super(ouu0.b);
        this.d = t2eVar;
    }

    @Override // a.dw5
    public final void a(iiy iiyVar, Object obj, Object obj2) {
        xg9 xg9VarA;
        byte b = this.c;
        t2e t2eVar = this.d;
        switch (b) {
            case 0:
                wmk wmkVar = (wmk) obj2;
                bh9 bh9Var = t2eVar.b;
                String name = iiyVar.getName();
                wmkVar.getClass();
                es esVar = wmkVar.f39410a;
                es esVar2 = wmkVar.c;
                es esVar3 = wmkVar.b;
                ycl yclVar = (ycl) esVar3.f8305a;
                String str = (String) esVar3.b;
                if (yclVar == null && str == null && ((ycl) esVar2.f8305a) == null && ((String) esVar2.b) == null) {
                    xg9VarA = esVar.a();
                } else {
                    bh9 bh9Var2 = new bh9(new char[0]);
                    if (((ycl) esVar3.f8305a) != null || str != null) {
                        bh9Var2.F("min", esVar3.a());
                    }
                    if (((ycl) esVar2.f8305a) != null || ((String) esVar2.b) != null) {
                        bh9Var2.F("max", esVar2.a());
                    }
                    bh9Var2.F("value", esVar.a());
                    xg9VarA = bh9Var2;
                }
                bh9Var.F(name, xg9VarA);
                break;
            default:
                bh9 bh9Var3 = t2eVar.b;
                String name2 = iiyVar.getName();
                String str2 = ((ouu0) obj2).f25896a;
                eh9 eh9Var = new eh9(str2.toCharArray());
                eh9Var.b = 0L;
                eh9Var.h(str2.length() - 1);
                bh9Var3.F(name2, eh9Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2e(t2e t2eVar, wmk wmkVar) {
        super(wmkVar);
        this.d = t2eVar;
    }
}
