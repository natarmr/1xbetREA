package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class xae extends v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40548a;

    public /* synthetic */ xae(byte b) {
        this.f40548a = b;
    }

    @Override // a.v3
    public void a(ywu ywuVar) {
        switch (this.f40548a) {
            case 1:
                ime imeVar = (ime) ywuVar.l();
                imeVar.f15020a.add(new xb00());
                break;
            case 2:
                break;
        }
    }

    @Override // a.v3
    public void b(qgd qgdVar) {
        switch (this.f40548a) {
            case 0:
                qgdVar.e = new std();
                break;
        }
    }

    @Override // a.v3
    public void c(z220 z220Var) {
        switch (this.f40548a) {
            case 3:
                Set setSingleton = Collections.singleton(new esm0());
                if (setSingleton == null) {
                    hny.u("extensions must not be null");
                } else {
                    Iterator it = setSingleton.iterator();
                    while (it.hasNext()) {
                        if (((esm0) it.next()) instanceof esm0) {
                            ((ArrayList) z220Var.c).add(new dsm0());
                        }
                    }
                }
                break;
        }
    }

    @Override // a.v3
    public void d(vjy vjyVar) {
        switch (this.f40548a) {
            case 3:
                vjyVar.b(csm0.class, new j98((byte) 7));
                break;
        }
    }

    @Override // a.v3
    public void e(d930 d930Var) {
        switch (this.f40548a) {
            case 3:
                d930Var.a(csm0.class, new gme((byte) 15));
                break;
        }
    }
}
