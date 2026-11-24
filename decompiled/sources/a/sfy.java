package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class sfy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32136a;

    static {
        sso ssoVar = sso.b;
    }

    public /* synthetic */ sfy(byte b) {
        this.f32136a = b;
    }

    public final z3 a(ByteArrayInputStream byteArrayInputStream, sso ssoVar) throws aox {
        z3 z3Var;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                z3Var = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = byteArrayInputStream.read();
                            if (i3 == -1) {
                                throw aox.a();
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new aox("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = byteArrayInputStream.read();
                                if (i4 == -1) {
                                    throw aox.a();
                                }
                                if ((i4 & 128) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                pyc pycVar = new pyc(new w3(byteArrayInputStream, i));
                z3Var = (z3) b(pycVar, ssoVar);
                try {
                    pycVar.a(0);
                } catch (aox e) {
                    e.f1223a = z3Var;
                    throw e;
                }
            }
            if (z3Var == null || z3Var.b()) {
                return z3Var;
            }
            aox aoxVar = new aox(new ss3((byte) 28).getMessage());
            aoxVar.f1223a = z3Var;
            throw aoxVar;
        } catch (IOException e2) {
            throw new aox(e2.getMessage());
        }
    }

    public final Object b(pyc pycVar, sso ssoVar) {
        switch (this.f32136a) {
            case 0:
                return new ufy(pycVar);
            case 1:
                return new vfy(pycVar);
            case 2:
                return new xfy(pycVar, ssoVar);
            case 3:
                return new cgy(pycVar, ssoVar);
            case 4:
                return new bgy(pycVar);
            case 5:
                return new p2d0(pycVar, ssoVar);
            case 6:
                return new n2d0(pycVar, ssoVar);
            case 7:
                return new m2d0(pycVar, ssoVar);
            case 8:
                return new s2d0(pycVar, ssoVar);
            case 9:
                return new t2d0(pycVar);
            case 10:
                return new v2d0(pycVar, ssoVar);
            case 11:
                return new x2d0(pycVar, ssoVar);
            case 12:
                return new b3d0(pycVar, ssoVar);
            case 13:
                return new d3d0(pycVar, ssoVar);
            case 14:
                return new g3d0(pycVar, ssoVar);
            case 15:
                return new i3d0(pycVar, ssoVar);
            case 16:
                return new m3d0(pycVar, ssoVar);
            case 17:
                return new n3d0(pycVar, ssoVar);
            case 18:
                return new p3d0(pycVar, ssoVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new t3d0(pycVar, ssoVar);
            case 20:
                return new s3d0(pycVar);
            case 21:
                return new v3d0(pycVar);
            case 22:
                return new a4d0(pycVar, ssoVar);
            case 23:
                return new y3d0(pycVar, ssoVar);
            case 24:
                return new c4d0(pycVar, ssoVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new f4d0(pycVar, ssoVar);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new g4d0(pycVar, ssoVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new i4d0(pycVar, ssoVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new m4d0(pycVar);
            default:
                return new n4d0(pycVar, ssoVar);
        }
    }
}
