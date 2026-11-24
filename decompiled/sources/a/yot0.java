package a;

import java.util.NoSuchElementException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class yot0 implements bmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cpt0 f43003a;

    public yot0(cpt0 cpt0Var) {
        this.f43003a = cpt0Var;
    }

    @Override // a.bmf0
    public final void w(gnf0 gnf0Var, long j, qmf0 qmf0Var) {
        Integer num;
        if (this.f43003a.q.f43546a == 0 || (num = (Integer) gnf0Var.a(vso0.b)) == null) {
            return;
        }
        cpt0 cpt0Var = this.f43003a;
        int iIntValue = num.intValue();
        synchronized (cpt0Var.c) {
            xw3 xw3Var = cpt0Var.f;
            Throwable th = new Throwable("Failed in framework level".concat(" with CaptureFailure.reason = " + qmf0Var.L()));
            while (!xw3Var.isEmpty() && ((zot0) xw3Var.first()).f44731a <= iIntValue) {
                ((odd) ((zot0) xw3Var.first()).b).b0(th);
                if (xw3Var.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                xw3Var.remove(0);
                this.f43003a.q.a();
            }
        }
    }

    @Override // a.bmf0
    public final void y(gnf0 gnf0Var, long j, oz2 oz2Var) {
        Integer num;
        if (this.f43003a.q.f43546a == 0 || (num = (Integer) gnf0Var.a(vso0.b)) == null) {
            return;
        }
        cpt0 cpt0Var = this.f43003a;
        int iIntValue = num.intValue();
        synchronized (cpt0Var.c) {
            xw3 xw3Var = cpt0Var.f;
            while (!xw3Var.isEmpty() && ((zot0) xw3Var.first()).f44731a <= iIntValue) {
                ((odd) ((zot0) xw3Var.first()).b).N(Unit.f46060a);
                if (xw3Var.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                xw3Var.remove(0);
                this.f43003a.q.a();
            }
        }
    }
}
