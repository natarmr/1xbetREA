package a;

import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class tby implements fuo {
    public huo b;
    public byte c;
    public int d;
    public int e;
    public st40 g;
    public guo h;
    public hac i;
    public iv40 j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f33692a = new fq80(2);
    public long f = -1;

    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        String strU;
        hac hacVarV;
        rcf0 rcf0Var;
        int i;
        st40 st40Var;
        long j;
        byte b = this.c;
        long j2 = -1;
        fq80 fq80Var = this.f33692a;
        if (b == 0) {
            fq80Var.J(2);
            guoVar.readFully(fq80Var.f9961a, 0, 2);
            int iG = fq80Var.G();
            this.d = iG;
            if (iG == 65498) {
                if (this.f != -1) {
                    this.c = (byte) 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((iG < 65488 || iG > 65497) && iG != 65281) {
                this.c = (byte) 1;
            }
            return 0;
        }
        if (b == 1) {
            fq80Var.J(2);
            guoVar.n(fq80Var.f9961a, 0, 2);
            this.e = fq80Var.G() - 2;
            guoVar.m(2);
            this.c = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b != 4) {
                if (b != 5) {
                    if (b == 6) {
                        return -1;
                    }
                    v4i0.e();
                    return 0;
                }
                if (this.i == null || guoVar != this.h) {
                    this.h = guoVar;
                    this.i = new hac(guoVar, this.f);
                }
                iv40 iv40Var = this.j;
                iv40Var.getClass();
                int iA = iv40Var.a(this.i, mtcVar);
                if (iA == 1) {
                    mtcVar.f22363a += this.f;
                }
                return iA;
            }
            long position = guoVar.getPosition();
            long j3 = this.f;
            if (position != j3) {
                mtcVar.f22363a = j3;
                return 1;
            }
            if (!guoVar.b(fq80Var.f9961a, 0, 1, true)) {
                g();
                return 0;
            }
            guoVar.g();
            if (this.j == null) {
                this.j = new iv40(jfn0.f16437a, 8);
            }
            hac hacVar = new hac(guoVar, this.f);
            this.i = hacVar;
            if (!this.j.c(hacVar)) {
                g();
                return 0;
            }
            iv40 iv40Var2 = this.j;
            long j4 = this.f;
            huo huoVar = this.b;
            huoVar.getClass();
            iv40Var2.e(new hac(j4, huoVar, (byte) 4));
            st40 st40Var2 = this.g;
            st40Var2.getClass();
            huo huoVar2 = this.b;
            huoVar2.getClass();
            ncs0 ncs0VarQ = huoVar2.q(1024, 4);
            awq awqVar = new awq();
            awqVar.n = mg40.n("image/jpeg");
            awqVar.l = new ed40(st40Var2);
            ohs0.w(awqVar, ncs0VarQ);
            this.c = (byte) 5;
            return 0;
        }
        if (this.d == 65505) {
            fq80 fq80Var2 = new fq80(this.e);
            guoVar.readFully(fq80Var2.f9961a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(fq80Var2.u()) && (strU = fq80Var2.u()) != null) {
                long length = guoVar.getLength();
                if (length == -1) {
                    st40Var = null;
                } else {
                    try {
                        hacVarV = oja0.V(strU);
                    } catch (kq80 | NumberFormatException | XmlPullParserException unused) {
                        f1t0.g0("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        hacVarV = null;
                    }
                    if (hacVarV != null && (i = (rcf0Var = (rcf0) hacVarV.c).d) >= 2) {
                        int i2 = i - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (i2 >= 0) {
                            rt40 rt40Var = (rt40) rcf0Var.get(i2);
                            String str = rt40Var.f31062a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i2 == 0) {
                                length -= rt40Var.c;
                                j = 0;
                            } else {
                                j = length - rt40Var.b;
                            }
                            long j9 = length;
                            length = j;
                            if (z && length != j9) {
                                j8 = j9 - length;
                                j7 = length;
                            }
                            if (i2 == 0) {
                                j6 = j9;
                                j5 = length;
                            }
                            i2--;
                            j2 = j2;
                        }
                        long j10 = j2;
                        if (j7 == j10 || j8 == j10 || j5 == j10 || j6 == j10) {
                            st40Var = null;
                        } else {
                            st40Var = new st40(j5, j6, hacVarV.b, j7, j8);
                        }
                    } else {
                        st40Var = null;
                    }
                }
                this.g = st40Var;
                if (st40Var != null) {
                    this.f = st40Var.d;
                }
            }
        } else {
            guoVar.m(this.e);
        }
        this.c = (byte) 0;
        return 0;
    }

    @Override // a.fuo
    public final void b(long j, long j2) {
        if (j == 0) {
            this.c = (byte) 0;
            this.j = null;
        } else if (this.c == 5) {
            iv40 iv40Var = this.j;
            iv40Var.getClass();
            iv40Var.b(j, j2);
        }
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        String strU;
        fq80 fq80Var = this.f33692a;
        fq80Var.J(2);
        guoVar.n(fq80Var.f9961a, 0, 2);
        if (fq80Var.G() == 65496) {
            while (true) {
                fq80Var.J(2);
                guoVar.n(fq80Var.f9961a, 0, 2);
                int iG = fq80Var.G();
                this.d = iG;
                if (iG == 65498) {
                    break;
                }
                fq80Var.J(2);
                guoVar.n(fq80Var.f9961a, 0, 2);
                int iG2 = fq80Var.G() - 2;
                if (iG2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    guoVar.j(iG2);
                } else {
                    fq80Var.J(iG2);
                    guoVar.n(fq80Var.f9961a, 0, iG2);
                    if (Objects.equals(fq80Var.u(), "http://ns.adobe.com/xap/1.0/") && (strU = fq80Var.u()) != null) {
                        String[] strArr = oja0.e;
                        for (int i = 0; i < 4; i++) {
                            if (strU.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        this.b = huoVar;
    }

    public final void g() {
        huo huoVar = this.b;
        huoVar.getClass();
        huoVar.o();
        this.b.f(new ca5(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override // a.fuo
    public final void release() {
        iv40 iv40Var = this.j;
        if (iv40Var != null) {
            iv40Var.getClass();
        }
    }
}
