package a;

import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class d7w0 implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5614a;
    public final n5d0 b;
    public final n5d0 c;

    public /* synthetic */ d7w0(Object obj, n5d0 n5d0Var, n5d0 n5d0Var2, byte b) {
        this.f5614a = b;
        this.b = n5d0Var;
        this.c = n5d0Var2;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f5614a;
        n5d0 n5d0Var = this.c;
        n5d0 n5d0Var2 = this.b;
        switch (b) {
            case 0:
                zjh0 zjh0Var = (zjh0) n5d0Var2.get();
                et2 et2Var = (et2) n5d0Var.get();
                zjh0Var.getClass();
                et2Var.getClass();
                return new izx(zjh0Var, et2Var);
            case 1:
                s5w0 s5w0Var = (s5w0) n5d0Var2.get();
                t4w0 t4w0Var = (t4w0) n5d0Var.get();
                s5w0Var.getClass();
                t4w0Var.getClass();
                return new a6w0(s5w0Var, t4w0Var);
            case 2:
                a6w0 a6w0Var = (a6w0) n5d0Var2.get();
                zjh0 zjh0Var2 = (zjh0) n5d0Var.get();
                a6w0Var.getClass();
                zjh0Var2.getClass();
                return new d5w0(a6w0Var, zjh0Var2);
            default:
                String str = (String) ((zix) n5d0Var2).f44459a;
                int iIntValue = ((Integer) ((zix) n5d0Var).f44459a).intValue();
                str.getClass();
                return new KeysImpl(str, iIntValue);
        }
    }
}
