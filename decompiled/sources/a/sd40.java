package a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sd40 extends j16 implements Handler.Callback {
    public long A;
    public ed40 B;
    public long Y;
    public final gqw0 t;
    public final qlo u;
    public final Handler v;
    public final md40 w;
    public zdx x;
    public boolean y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd40(qlo qloVar, Looper looper) {
        super(5);
        gqw0 gqw0Var = gqw0.s1;
        this.u = qloVar;
        this.v = looper == null ? null : new Handler(looper, this);
        this.t = gqw0Var;
        this.w = new md40(1);
        this.Y = -9223372036854775807L;
    }

    @Override // a.j16
    public final int D(androidx.media3.common.b bVar) {
        if (this.t.O0(bVar)) {
            return j16.f(bVar.T == 0 ? 4 : 2, 0, 0, 0);
        }
        return j16.f(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    public final void H(ed40 ed40Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            cd40[] cd40VarArr = ed40Var.f7600a;
            if (i >= cd40VarArr.length) {
                return;
            }
            androidx.media3.common.b bVarA = cd40VarArr[i].a();
            if (bVarA != null) {
                gqw0 gqw0Var = this.t;
                if (gqw0Var.O0(bVarA)) {
                    zdx zdxVarJ0 = gqw0Var.J0(bVarA);
                    byte[] bArrC = cd40VarArr[i].c();
                    bArrC.getClass();
                    md40 md40Var = this.w;
                    md40Var.v();
                    md40Var.x(bArrC.length);
                    ByteBuffer byteBuffer = md40Var.g;
                    String str = vtt0.f38024a;
                    byteBuffer.put(bArrC);
                    md40Var.y();
                    ed40 ed40VarX = zdxVarJ0.x(md40Var);
                    if (ed40VarX != null) {
                        H(ed40VarX, arrayList);
                    }
                } else {
                    arrayList.add(cd40VarArr[i]);
                }
            } else {
                arrayList.add(cd40VarArr[i]);
            }
            i++;
        }
    }

    public final long I(long j) {
        x0x.K(j != -9223372036854775807L);
        x0x.K(this.Y != -9223372036854775807L);
        return j - this.Y;
    }

    public final void J(ed40 ed40Var) {
        qlo qloVar = this.u;
        ulo uloVar = qloVar.f28944a;
        jn30 jn30Var = uloVar.m0;
        vg00 vg00Var = uloVar.m;
        hbi hbiVarA = jn30Var.a();
        int i = 0;
        while (true) {
            cd40[] cd40VarArr = ed40Var.f7600a;
            if (i >= cd40VarArr.length) {
                break;
            }
            cd40VarArr[i].b(hbiVarA);
            i++;
        }
        uloVar.m0 = new jn30(hbiVarA);
        jn30 jn30VarB = uloVar.b();
        if (!jn30VarB.equals(uloVar.R)) {
            uloVar.R = jn30VarB;
            vg00Var.c(14, new z9f(qloVar, (byte) 21));
        }
        vg00Var.c(28, new z9f(ed40Var, (byte) 22));
        vg00Var.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            J((ed40) message.obj);
            return true;
        }
        v4i0.e();
        return false;
    }

    @Override // a.j16
    public final String k() {
        return "MetadataRenderer";
    }

    @Override // a.j16
    public final boolean m() {
        return this.z;
    }

    @Override // a.j16
    public final boolean o() {
        return true;
    }

    @Override // a.j16
    public final void p() {
        this.B = null;
        this.x = null;
        this.Y = -9223372036854775807L;
    }

    @Override // a.j16
    public final void r(long j, boolean z, boolean z2) {
        this.B = null;
        this.y = false;
        this.z = false;
    }

    @Override // a.j16
    public final void w(androidx.media3.common.b[] bVarArr, long j, long j2, vn30 vn30Var) {
        this.x = this.t.J0(bVarArr[0]);
        ed40 ed40Var = this.B;
        if (ed40Var != null) {
            long j3 = ed40Var.b;
            long j4 = (this.Y + j3) - j2;
            if (j3 != j4) {
                ed40Var = new ed40(j4, ed40Var.f7600a);
            }
            this.B = ed40Var;
        }
        this.Y = j2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8  */
    @Override // a.j16
    public final void z(long j, long j2) {
        int iY;
        ed40 ed40VarX;
        ArrayList arrayList;
        boolean z = true;
        while (z) {
            if (!this.y && this.B == null) {
                md40 md40Var = this.w;
                md40Var.v();
                hsj hsjVar = this.c;
                hsjVar.e();
                int iY2 = y(hsjVar, md40Var, 5);
                if (iY2 != -3 || md40Var.m(4)) {
                    if (iY2 != -4 || md40Var.m(4)) {
                        if (iY2 == -4 || iY2 == -3) {
                            long j3 = this.r;
                            long j4 = j - this.k;
                            if (j3 != -9223372036854775807L && j4 >= j3 - 1000000) {
                                iY = y(hsjVar, md40Var, 0);
                                if (iY == -4) {
                                    if (md40Var.m(4)) {
                                        this.y = true;
                                    } else if (md40Var.i >= this.l) {
                                        md40Var.l = this.A;
                                        md40Var.y();
                                        zdx zdxVar = this.x;
                                        String str = vtt0.f38024a;
                                        ed40VarX = zdxVar.x(md40Var);
                                        if (ed40VarX != null) {
                                            arrayList = new ArrayList(ed40VarX.f7600a.length);
                                            H(ed40VarX, arrayList);
                                            if (!arrayList.isEmpty()) {
                                                this.B = new ed40(I(md40Var.i), (cd40[]) arrayList.toArray(new cd40[0]));
                                            }
                                        }
                                    }
                                } else if (iY == -5) {
                                    androidx.media3.common.b bVar = (androidx.media3.common.b) hsjVar.b;
                                    bVar.getClass();
                                    this.A = bVar.u;
                                }
                            }
                        } else {
                            iY = y(hsjVar, md40Var, 0);
                            if (iY == -4) {
                                if (md40Var.m(4)) {
                                    this.y = true;
                                } else if (md40Var.i >= this.l) {
                                    md40Var.l = this.A;
                                    md40Var.y();
                                    zdx zdxVar2 = this.x;
                                    String str2 = vtt0.f38024a;
                                    ed40VarX = zdxVar2.x(md40Var);
                                    if (ed40VarX != null) {
                                        arrayList = new ArrayList(ed40VarX.f7600a.length);
                                        H(ed40VarX, arrayList);
                                        if (!arrayList.isEmpty()) {
                                            this.B = new ed40(I(md40Var.i), (cd40[]) arrayList.toArray(new cd40[0]));
                                        }
                                    }
                                }
                            } else if (iY == -5) {
                                androidx.media3.common.b bVar2 = (androidx.media3.common.b) hsjVar.b;
                                bVar2.getClass();
                                this.A = bVar2.u;
                            }
                        }
                    } else if (j >= md40Var.i - 1000000) {
                        iY = y(hsjVar, md40Var, 0);
                        if (iY == -4) {
                            if (md40Var.m(4)) {
                                this.y = true;
                            } else if (md40Var.i >= this.l) {
                                md40Var.l = this.A;
                                md40Var.y();
                                zdx zdxVar3 = this.x;
                                String str3 = vtt0.f38024a;
                                ed40VarX = zdxVar3.x(md40Var);
                                if (ed40VarX != null) {
                                    arrayList = new ArrayList(ed40VarX.f7600a.length);
                                    H(ed40VarX, arrayList);
                                    if (!arrayList.isEmpty()) {
                                        this.B = new ed40(I(md40Var.i), (cd40[]) arrayList.toArray(new cd40[0]));
                                    }
                                }
                            }
                        } else if (iY == -5) {
                            androidx.media3.common.b bVar3 = (androidx.media3.common.b) hsjVar.b;
                            bVar3.getClass();
                            this.A = bVar3.u;
                        }
                    }
                }
            }
            ed40 ed40Var = this.B;
            if (ed40Var == null || ed40Var.b > I(j)) {
                z = false;
            } else {
                ed40 ed40Var2 = this.B;
                Handler handler = this.v;
                if (handler != null) {
                    handler.obtainMessage(1, ed40Var2).sendToTarget();
                } else {
                    J(ed40Var2);
                }
                this.B = null;
                z = true;
            }
            if (this.y && this.B == null) {
                this.z = true;
            }
        }
    }
}
