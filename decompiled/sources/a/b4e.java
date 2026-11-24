package a;

import android.content.Context;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b4e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1953a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public b4e(Context context, fpv0 fpv0Var) {
        this.f1953a = (byte) 0;
        this.b = fpv0Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.c = applicationContext;
        this.d = new Object();
        this.f = new LinkedHashSet();
    }

    public void a(dgu dguVar) {
        dguVar.H(this);
    }

    public void b(b4e b4eVar) {
        b4eVar.j();
        b4eVar.e(this);
        b4e b4eVar2 = (b4e) this.d;
        if (b4eVar2 == null) {
            this.c = b4eVar;
            this.d = b4eVar;
        } else {
            b4eVar2.f = b4eVar;
            b4eVar.e = b4eVar2;
            this.d = b4eVar;
        }
    }

    public b4e c() {
        return (b4e) this.b;
    }

    public abstract Object d();

    public void e(b4e b4eVar) {
        this.b = b4eVar;
    }

    public void f(Object obj) {
        synchronized (this.d) {
            Object obj2 = this.e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.e = obj;
                ((fpv0) this.b).e.execute(new a4e(CollectionsKt.L0((LinkedHashSet) this.f), this, (byte) 0));
            }
        }
    }

    public abstract void g();

    public abstract void h();

    public String i() {
        return "";
    }

    public void j() {
        b4e b4eVar = (b4e) this.e;
        if (b4eVar != null) {
            b4eVar.f = (b4e) this.f;
        } else {
            b4e b4eVar2 = (b4e) this.b;
            if (b4eVar2 != null) {
                b4eVar2.c = (b4e) this.f;
            }
        }
        b4e b4eVar3 = (b4e) this.f;
        if (b4eVar3 != null) {
            b4eVar3.e = b4eVar;
        } else {
            b4e b4eVar4 = (b4e) this.b;
            if (b4eVar4 != null) {
                b4eVar4.d = b4eVar;
            }
        }
        this.b = null;
        this.f = null;
        this.e = null;
    }

    public String toString() {
        switch (this.f1953a) {
            case 1:
                return getClass().getSimpleName() + "{" + i() + "}";
            default:
                return super.toString();
        }
    }

    public b4e() {
        this.f1953a = (byte) 1;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
