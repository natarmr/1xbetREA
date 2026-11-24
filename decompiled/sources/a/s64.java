package a;

import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class s64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1p f31684a;

    public s64(s1p s1pVar, byte b) {
        s1pVar.getClass();
        switch (b) {
            case 1:
                this.f31684a = s1pVar;
                break;
            case 2:
                this.f31684a = s1pVar;
                break;
            case 3:
                this.f31684a = s1pVar;
                break;
            case 4:
                this.f31684a = s1pVar;
                break;
            case 5:
                this.f31684a = s1pVar;
                break;
            case 6:
                this.f31684a = s1pVar;
                break;
            case 7:
                this.f31684a = s1pVar;
                break;
            case 8:
                this.f31684a = s1pVar;
                break;
            default:
                this.f31684a = s1pVar;
                break;
        }
    }

    public void a(String str, long j, boolean z) {
        Set setC = dui0.c(new i1p((byte) 2, j), new j1p(z ? "on" : "off", (byte) 0));
        if (str != null && str.length() != 0) {
            setC.add(new j1p(str, (byte) 1));
        }
        this.f31684a.a(setC, 3208L);
    }

    public Object b(String str, zje zjeVar) {
        Object objB = this.f31684a.b(12661L, zjeVar, cui0.b(new j1p(str, (byte) 0)));
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    public void c(String str) {
        b1j.v(str, this.f31684a, 3035L);
    }

    public void d(y1p y1pVar, String str) {
        y1pVar.getClass();
        this.f31684a.a(tx3.l0(new k1p[]{new j1p(y1pVar.f41868a, (byte) 0), new j1p(str, (byte) 2)}), 3020L);
    }

    public void e(String str) {
        b1j.v(str, this.f31684a, 3281L);
    }

    public void f(hfi0 hfi0Var) {
        this.f31684a.a(cui0.b(new j1p(hfi0Var.f12975a, (byte) 0)), 11076L);
    }

    public void g(boolean z) {
        this.f31684a.a(cui0.b(new j1p(z ? "on" : "off", (byte) 0)), 10644L);
    }

    public void h(int i) {
        b1j.r(i, this.f31684a, 3039L);
    }

    public void i(boolean z, it2 it2Var) {
        this.f31684a.a(tx3.l0(new k1p[]{new j1p("сall_code", (byte) 0), new j1p(it2Var.f15333a, (byte) 1), new j1p(z ? "ok" : "cancel", (byte) 2)}), 12544L);
    }

    public void j(boolean z, it2 it2Var) {
        this.f31684a.a(tx3.l0(new k1p[]{new j1p("telegram", (byte) 0), new j1p(it2Var.f15333a, (byte) 1), new j1p(z ? "ok" : "cancel", (byte) 2)}), 12544L);
    }

    public void k(boolean z, it2 it2Var) {
        this.f31684a.a(tx3.l0(new k1p[]{new j1p("voice_sms", (byte) 0), new j1p(it2Var.f15333a, (byte) 1), new j1p(z ? "ok" : "cancel", (byte) 2)}), 12544L);
    }
}
