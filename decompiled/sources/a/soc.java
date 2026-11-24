package a;

/* JADX INFO: loaded from: classes4.dex */
public final class soc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn0 f32538a;

    public soc(dn0 dn0Var, byte b) {
        dn0Var.getClass();
        switch (b) {
            case 3:
                this.f32538a = dn0Var;
                break;
            default:
                this.f32538a = dn0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar, String str, boolean z, boolean z2) {
        ob60 ob60Var;
        if (zjeVar instanceof ob60) {
            ob60Var = (ob60) zjeVar;
            int i = ob60Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ob60Var.k = i - Integer.MIN_VALUE;
            } else {
                ob60Var = new ob60(this, zjeVar);
            }
        } else {
            ob60Var = new ob60(this, zjeVar);
        }
        Object fnqVar = ob60Var.i;
        Object obj = wne.f39444a;
        int i2 = ob60Var.k;
        if (i2 == 0) {
            z1x.P(fnqVar);
            ob60Var.k = 1;
            dn0 dn0Var = this.f32538a;
            fnqVar = new fnq(dn0Var.c.e, new lm0(dn0Var, str, z, z2, null, (byte) 1));
            if (fnqVar == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(fnqVar);
        }
        return new wk30((gmq) fnqVar, (byte) 7);
    }

    public void b() {
        this.f32538a.c.c = true;
    }

    public /* synthetic */ soc(dn0 dn0Var, char c) {
        this.f32538a = dn0Var;
    }
}
