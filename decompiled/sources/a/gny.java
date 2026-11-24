package a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gny extends jjt {
    private static final gny DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private zlx key_ = d5d0.d;
    private int primaryKeyId_;

    static {
        gny gnyVar = new gny();
        DEFAULT_INSTANCE = gnyVar;
        jjt.u(gny.class, gnyVar);
    }

    public static dny C() {
        return (dny) DEFAULT_INSTANCE.i();
    }

    public static gny D(ByteArrayInputStream byteArrayInputStream, qso qsoVar) throws ynx {
        jjt jjtVarT = jjt.t(DEFAULT_INSTANCE, new myc(byteArrayInputStream), qsoVar);
        jjt.h(jjtVarT);
        return (gny) jjtVarT;
    }

    public static gny E(byte[] bArr, qso qsoVar) {
        gny gnyVar = DEFAULT_INSTANCE;
        int length = bArr.length;
        jjt jjtVarR = gnyVar.r();
        try {
            z4d0 z4d0Var = z4d0.c;
            z4d0Var.getClass();
            o2h0 o2h0VarA = z4d0Var.a(jjtVarR.getClass());
            vw3 vw3Var = new vw3();
            qsoVar.getClass();
            o2h0VarA.h(jjtVarR, bArr, 0, length, vw3Var);
            o2h0VarA.b(jjtVarR);
            jjt.h(jjtVarR);
            return (gny) jjtVarR;
        } catch (v7t0 e) {
            throw new ynx(e.getMessage());
        } catch (ynx e2) {
            if (e2.f42961a) {
                throw new ynx(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof ynx) {
                throw ((ynx) e3.getCause());
            }
            throw new ynx(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw ynx.h();
        }
    }

    public final List A() {
        return this.key_;
    }

    public final int B() {
        return this.primaryKeyId_;
    }

    public final void F(int i) {
        this.primaryKeyId_ = i;
    }

    @Override // a.jjt
    public final Object j(int i) {
        hq80 cjtVar;
        switch (hne.E(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", fny.class});
            case 3:
                return new gny();
            case 4:
                return new dny(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (gny.class) {
                    try {
                        cjtVar = PARSER;
                        if (cjtVar == null) {
                            cjtVar = new cjt();
                            PARSER = cjtVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cjtVar;
            default:
                e9d0.b();
                return null;
        }
    }

    public final void x(fny fnyVar) {
        zlx zlxVarN = this.key_;
        if (!((m4) zlxVarN).f21141a) {
            int size = zlxVarN.size();
            zlxVarN = zlxVarN.n(size == 0 ? 10 : size * 2);
            this.key_ = zlxVarN;
        }
        zlxVarN.add(fnyVar);
    }

    public final fny y(int i) {
        return (fny) this.key_.get(i);
    }

    public final int z() {
        return this.key_.size();
    }
}
