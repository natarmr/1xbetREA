package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class dw5 implements nae0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6780a;
    public Object b;

    public dw5(byte b) {
        this.f6780a = b;
        switch (b) {
            case 2:
                this.b = new Object();
                break;
        }
    }

    public void a(iiy iiyVar, Object obj, Object obj2) {
        iiyVar.getClass();
    }

    public void b(iiy iiyVar) {
        iiyVar.getClass();
    }

    public abstract void c(jbi0 jbi0Var);

    public abstract void d();

    public abstract void e();

    public abstract Function1 f(jbi0 jbi0Var);

    public abstract void g(htb htbVar);

    public void h(iiy iiyVar, Object obj) {
        iiyVar.getClass();
        Object obj2 = this.b;
        b(iiyVar);
        this.b = obj;
        a(iiyVar, obj2, obj);
    }

    @Override // a.nae0
    public Object n(iiy iiyVar, Object obj) {
        iiyVar.getClass();
        return this.b;
    }

    public String toString() {
        switch (this.f6780a) {
            case 1:
                return "ObservableProperty(value=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public dw5(Object obj) {
        this.f6780a = (byte) 1;
        this.b = obj;
    }
}
