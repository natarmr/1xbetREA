package a;

/* JADX INFO: loaded from: classes2.dex */
public final class egk extends zri {
    public final boolean d;

    public egk(sq8 sq8Var, boolean z) {
        super(sq8Var);
        this.d = z;
    }

    public final ku5 q() {
        ku5[] ku5VarArr = (ku5[]) this.c;
        xu5 xu5Var = new xu5();
        xu5 xu5Var2 = new xu5();
        xu5 xu5Var3 = new xu5();
        xu5 xu5Var4 = new xu5();
        for (ku5 ku5Var : ku5VarArr) {
            if (ku5Var != null) {
                ku5Var.c();
                int i = ku5Var.e % 30;
                int i2 = ku5Var.f;
                if (!this.d) {
                    i2 += 2;
                }
                int i3 = i2 % 3;
                if (i3 == 0) {
                    xu5Var2.b((i * 3) + 1);
                } else if (i3 == 1) {
                    xu5Var4.b(i / 3);
                    xu5Var3.b(i % 3);
                } else if (i3 == 2) {
                    xu5Var.b(i + 1);
                }
            }
        }
        if (xu5Var.a().length == 0 || xu5Var2.a().length == 0 || xu5Var3.a().length == 0 || xu5Var4.a().length == 0 || xu5Var.a()[0] < 1 || xu5Var2.a()[0] + xu5Var3.a()[0] < 3 || xu5Var2.a()[0] + xu5Var3.a()[0] > 90) {
            return null;
        }
        ku5 ku5Var2 = new ku5(xu5Var.a()[0], xu5Var2.a()[0], xu5Var3.a()[0], xu5Var4.a()[0], (byte) 0);
        r(ku5VarArr, ku5Var2);
        return ku5Var2;
    }

    public final void r(ku5[] ku5VarArr, ku5 ku5Var) {
        for (int i = 0; i < ku5VarArr.length; i++) {
            ku5 ku5Var2 = ku5VarArr[i];
            if (ku5Var2 != null) {
                int i2 = ku5Var2.e % 30;
                int i3 = ku5Var2.f;
                if (i3 > ku5Var.f) {
                    ku5VarArr[i] = null;
                } else {
                    if (!this.d) {
                        i3 += 2;
                    }
                    int i4 = i3 % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2 && i2 + 1 != ku5Var.b) {
                                ku5VarArr[i] = null;
                            }
                        } else if (i2 / 3 != ku5Var.c || i2 % 3 != ku5Var.e) {
                            ku5VarArr[i] = null;
                        }
                    } else if ((i2 * 3) + 1 != ku5Var.d) {
                        ku5VarArr[i] = null;
                    }
                }
            }
        }
    }

    @Override // a.zri
    public final String toString() {
        return "IsLeft: " + this.d + '\n' + super.toString();
    }
}
