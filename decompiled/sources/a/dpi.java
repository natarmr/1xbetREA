package a;

/* JADX INFO: loaded from: classes4.dex */
public final class dpi implements tbb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pyg f6467a;
    public final sjl0 b;
    public final pru c;
    public final ugf0 d;
    public final ih5 e;
    public final zr1 f;
    public final kt2 g;
    public final gg5 h;
    public final oeg0 i;
    public final ivn j;
    public final bwl k;
    public final ctf0 l;
    public final lsn m;
    public final iip n;
    public final sb6 o;
    public final gst0 p;
    public final vqc q;
    public final b3c0 r;

    public dpi(pyg pygVar, ugf0 ugf0Var, bwl bwlVar, iip iipVar, lsn lsnVar, vqc vqcVar, oeg0 oeg0Var, ih5 ih5Var, sjl0 sjl0Var, gg5 gg5Var, pru pruVar, zr1 zr1Var, kt2 kt2Var, ivn ivnVar, ctf0 ctf0Var, sb6 sb6Var, gst0 gst0Var, b3c0 b3c0Var) {
        this.f6467a = pygVar;
        this.b = sjl0Var;
        this.c = pruVar;
        this.d = ugf0Var;
        this.e = ih5Var;
        this.f = zr1Var;
        this.g = kt2Var;
        this.h = gg5Var;
        this.i = oeg0Var;
        this.j = ivnVar;
        this.k = bwlVar;
        this.l = ctf0Var;
        this.m = lsnVar;
        this.n = iipVar;
        this.o = sb6Var;
        this.p = gst0Var;
        this.q = vqcVar;
        this.r = b3c0Var;
    }

    @Override // a.tbb0
    public final alg a() {
        hzg hzgVarA = this.f6467a.a();
        x1x.x(hzgVarA);
        luu luuVarW = ((daf) this.d.f35622a).w();
        x1x.x(luuVarW);
        zg zgVar = new zg(this.g, (byte) 11);
        dbi dbiVar = (dbi) this.k.f3330a;
        return new ulg(hzgVarA, this.c, luuVarW, this.e, this.f, zgVar, this.h, this.i, this.j, dbiVar.j(), dbiVar.m(), this.l);
    }

    @Override // a.tbb0
    public final s2r0 b() {
        v7i v7iVarK = ((gbi) this.m.f20589a).k();
        j3c j3cVarV = this.n.V();
        x1x.x(j3cVarV);
        sb6 sb6Var = this.o;
        gst0 gst0Var = this.p;
        return new z2r0(v7iVarK, j3cVarV, this.c, new jtj(sb6Var, gst0Var), new uyn(sb6Var), new ocl(((cih) this.q.b).a()), new reu(this.r), new jc60(gst0Var, (byte) 1), new iqt(gst0Var));
    }

    @Override // a.tbb0
    public final hsj c() {
        cyu cyuVarK = this.f6467a.k();
        x1x.x(cyuVarK);
        sjl0 sjl0Var = this.b;
        sjl0Var.getClass();
        hsj hsjVar = new hsj();
        hsjVar.f13586a = cyuVarK;
        hsjVar.b = sjl0Var;
        return hsjVar;
    }

    @Override // a.tbb0
    public final g3u d() {
        return new i3u(this.f6467a.g(), this.b);
    }
}
