package a;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class mxg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g090 f22554a;

    public /* synthetic */ mxg0(g090 g090Var) {
        this.f22554a = g090Var;
    }

    public Object a(ArrayList arrayList, zje zjeVar) {
        g090 g090Var = this.f22554a;
        Object objD0 = qjj.d0(((mne) g090Var.b).b, new s980(g090Var, arrayList, null, (byte) 7), zjeVar);
        wne wneVar = wne.f39444a;
        if (objD0 != wneVar) {
            objD0 = Unit.f46060a;
        }
        return objD0 == wneVar ? objD0 : Unit.f46060a;
    }

    public void b() {
        pwf0 pwf0Var = pwf0.c;
        d190 d190Var = (d190) this.f22554a.f10448a;
        d190Var.getClass();
        d190Var.c = "";
        d190Var.e = pwf0Var;
    }
}
