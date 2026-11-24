package a;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class tfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33880a;
    public int b = -1;
    public int c = -1;
    public int d = -1;

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    public tfr(String str, String str2) throws Throwable {
        int iK;
        int iK2;
        int iGlCreateProgram;
        try {
            iK = vfr.k(35633, str);
            try {
                iK2 = vfr.k(35632, str2);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        vfr.b("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iK);
                        vfr.b("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iK2);
                        vfr.b("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.f33880a = iGlCreateProgram;
                            a();
                        } else {
                            throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                        }
                    } catch (IllegalArgumentException e) {
                        e = e;
                        if (iK != -1) {
                            GLES20.glDeleteShader(iK);
                        }
                        if (iK2 != -1) {
                            GLES20.glDeleteShader(iK2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (iK != -1) {
                            GLES20.glDeleteShader(iK);
                        }
                        if (iK2 != -1) {
                            GLES20.glDeleteShader(iK2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    e = e3;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e4) {
                e = e4;
                iK2 = -1;
                iGlCreateProgram = iK2;
                if (iK != -1) {
                    GLES20.glDeleteShader(iK);
                }
                if (iK2 != -1) {
                    GLES20.glDeleteShader(iK2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            }
        } catch (IllegalArgumentException | IllegalStateException e5) {
            e = e5;
            iK = -1;
            iK2 = -1;
        }
    }

    public final void a() {
        int i = this.f33880a;
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        this.d = iGlGetAttribLocation;
        vfr.e(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
        this.b = iGlGetUniformLocation;
        vfr.e(iGlGetUniformLocation, "uTransMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
        this.c = iGlGetUniformLocation2;
        vfr.e(iGlGetUniformLocation2, "uAlphaScale");
    }

    public void b() {
        GLES20.glUseProgram(this.f33880a);
        vfr.b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        vfr.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) vfr.h);
        vfr.b("glVertexAttribPointer");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        vfr.b("glUniformMatrix4fv");
        GLES20.glUniform1f(this.c, 1.0f);
        vfr.b("glUniform1f");
    }
}
