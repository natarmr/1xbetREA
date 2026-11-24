package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class rnf0 extends vw5 {
    public final mne d;
    public final kh3 e;
    public final yqt0 f;
    public final p7m0 g;
    public Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnf0(o8f o8fVar, mne mneVar, htz htzVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = mneVar;
        this.e = kh3.USER_CONSENT;
        this.f = yqt0.USER_CONSENT;
        this.g = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        p7m0 p7m0Var;
        Object value;
        sjeVar.getClass();
        do {
            p7m0Var = this.g;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, i8d.b));
        sac.V(sjeVar, new dff0(this, sjeVar, (byte) 6), null, this.d.c, new coc0(this, null, (byte) 23), 10);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.e;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.g;
    }

    @Override // a.vw5
    public final List d() {
        return null;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.f;
    }
}
