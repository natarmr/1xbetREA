.class public final La/x4w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ngw0;
.implements La/g1x0;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x4w0;->a:Ljava/lang/Object;

    iput-object p2, p0, La/x4w0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/x4w0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;La/lpw0;La/sjw0;)La/x4w0;
    .locals 4

    .line 1
    sget-object v0, La/x7x0;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v1, v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/16 v3, 0x21

    .line 21
    .line 22
    if-lt v2, v3, :cond_0

    .line 23
    .line 24
    const/16 v3, 0x7e

    .line 25
    .line 26
    if-gt v2, v3, :cond_0

    .line 27
    .line 28
    int-to-byte v2, v2

    .line 29
    aput-byte v2, v0, v1

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 35
    .line 36
    new-instance p1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string p2, "Not a printable ASCII character: "

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_1
    invoke-static {v0}, La/icw0;->a([B)La/icw0;

    .line 55
    .line 56
    .line 57
    new-instance v0, La/x4w0;

    .line 58
    .line 59
    invoke-direct {v0, p2, p0, p1}, La/x4w0;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object v0
.end method


# virtual methods
.method public a(ILjava/lang/Throwable;[B)V
    .locals 7

    .line 1
    iget-object p3, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, La/b1x0;

    .line 4
    .line 5
    invoke-virtual {p3}, La/zrw0;->m1()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzom;

    .line 11
    .line 12
    const/16 v1, 0xc8

    .line 13
    .line 14
    if-eq p1, v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0xcc

    .line 17
    .line 18
    if-eq p1, v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0x130

    .line 21
    .line 22
    if-ne p1, v1, :cond_1

    .line 23
    .line 24
    move p1, v1

    .line 25
    :cond_0
    if-nez p2, :cond_1

    .line 26
    .line 27
    iget-object p1, p3, La/p4;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, La/kxw0;

    .line 30
    .line 31
    iget-object p1, p1, La/kxw0;->f:La/uuw0;

    .line 32
    .line 33
    invoke-static {p1}, La/kxw0;->g(La/ryw0;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p1, La/uuw0;->o:La/quw0;

    .line 37
    .line 38
    iget-wide v1, v0, Lcom/google/android/gms/measurement/internal/zzom;->a:J

    .line 39
    .line 40
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    const-string v1, "[sgtm] Upload succeeded for row_id"

    .line 45
    .line 46
    invoke-virtual {p1, p2, v1}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, La/p1x0;->c:La/p1x0;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget-object v1, p3, La/p4;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, La/kxw0;

    .line 55
    .line 56
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 57
    .line 58
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v1, La/uuw0;->j:La/quw0;

    .line 62
    .line 63
    iget-wide v2, v0, Lcom/google/android/gms/measurement/internal/zzom;->a:J

    .line 64
    .line 65
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    const-string v4, "[sgtm] Upload failed for row_id. response, exception"

    .line 74
    .line 75
    invoke-virtual {v1, v4, v2, v3, p2}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p2, La/btw0;->u:La/atw0;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-virtual {p2, v1}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    check-cast p2, Ljava/lang/String;

    .line 86
    .line 87
    const-string v1, ","

    .line 88
    .line 89
    invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_2

    .line 106
    .line 107
    sget-object p1, La/p1x0;->e:La/p1x0;

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    sget-object p1, La/p1x0;->d:La/p1x0;

    .line 111
    .line 112
    :goto_0
    iget-object p0, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 115
    .line 116
    iget-object p2, p3, La/p4;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p2, La/kxw0;

    .line 119
    .line 120
    invoke-virtual {p2}, La/kxw0;->i()La/a4x0;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    new-instance v1, Lcom/google/android/gms/measurement/internal/zzaf;

    .line 125
    .line 126
    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzom;->a:J

    .line 127
    .line 128
    iget-byte v2, p1, La/p1x0;->a:B

    .line 129
    .line 130
    iget-wide v5, v0, Lcom/google/android/gms/measurement/internal/zzom;->f:J

    .line 131
    .line 132
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/zzaf;-><init>(IJJ)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, La/zrw0;->m1()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2}, La/etw0;->n1()V

    .line 139
    .line 140
    .line 141
    const/4 v0, 0x1

    .line 142
    invoke-virtual {p2, v0}, La/a4x0;->B1(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    new-instance v2, La/hf5;

    .line 147
    .line 148
    const/16 v5, 0x15

    .line 149
    .line 150
    invoke-direct {v2, p2, v0, v1, v5}, La/hf5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, v2}, La/a4x0;->z1(Ljava/lang/Runnable;)V

    .line 154
    .line 155
    .line 156
    iget-object p2, p3, La/p4;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p2, La/kxw0;

    .line 159
    .line 160
    iget-object p2, p2, La/kxw0;->f:La/uuw0;

    .line 161
    .line 162
    invoke-static {p2}, La/kxw0;->g(La/ryw0;)V

    .line 163
    .line 164
    .line 165
    iget-object p2, p2, La/uuw0;->o:La/quw0;

    .line 166
    .line 167
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    const-string v0, "[sgtm] Updated status for row_id"

    .line 172
    .line 173
    invoke-virtual {p2, p3, p1, v0}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    monitor-enter p0

    .line 177
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 181
    .line 182
    .line 183
    monitor-exit p0

    .line 184
    return-void

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    move-object p1, v0

    .line 187
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    throw p1
.end method

.method public b()V
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 7
    .line 8
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x2

    .line 14
    if-nez v2, :cond_6

    .line 15
    .line 16
    iput-object v1, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    new-array v2, v4, [I

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    invoke-static {v1, v2, v0, v2, v5}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_5

    .line 26
    .line 27
    const/16 v1, 0x9

    .line 28
    .line 29
    new-array v7, v1, [I

    .line 30
    .line 31
    fill-array-data v7, :array_0

    .line 32
    .line 33
    .line 34
    new-array v9, v5, [Landroid/opengl/EGLConfig;

    .line 35
    .line 36
    new-array v12, v5, [I

    .line 37
    .line 38
    iget-object v1, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v6, v1

    .line 41
    check-cast v6, Landroid/opengl/EGLDisplay;

    .line 42
    .line 43
    const/4 v11, 0x1

    .line 44
    const/4 v13, 0x0

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v10, 0x0

    .line 47
    invoke-static/range {v6 .. v13}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    aget v1, v12, v0

    .line 54
    .line 55
    if-lez v1, :cond_4

    .line 56
    .line 57
    aget-object v1, v9, v0

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    iget-object v2, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Landroid/opengl/EGLDisplay;

    .line 64
    .line 65
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 66
    .line 67
    const/16 v6, 0x3098

    .line 68
    .line 69
    const/16 v7, 0x3038

    .line 70
    .line 71
    filled-new-array {v6, v4, v7}, [I

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-static {v2, v1, v5, v6, v0}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 80
    .line 81
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_2

    .line 86
    .line 87
    iput-object v2, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 88
    .line 89
    iget-object v2, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Landroid/opengl/EGLDisplay;

    .line 92
    .line 93
    const/16 v5, 0x3057

    .line 94
    .line 95
    const/16 v6, 0x3056

    .line 96
    .line 97
    const/16 v8, 0x100

    .line 98
    .line 99
    filled-new-array {v5, v8, v6, v8, v7}, [I

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-static {v2, v1, v5, v0}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 108
    .line 109
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_1

    .line 114
    .line 115
    iput-object v0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 116
    .line 117
    iget-object v1, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Landroid/opengl/EGLDisplay;

    .line 120
    .line 121
    iget-object p0, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, Landroid/opengl/EGLContext;

    .line 124
    .line 125
    invoke-static {v1, v0, v0, p0}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-eqz p0, :cond_0

    .line 130
    .line 131
    return-void

    .line 132
    :cond_0
    new-instance p0, La/tiu0;

    .line 133
    .line 134
    const-string v0, "eglMakeCurrent failed"

    .line 135
    .line 136
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 137
    .line 138
    .line 139
    throw p0

    .line 140
    :cond_1
    new-instance p0, La/tiu0;

    .line 141
    .line 142
    const-string v0, "eglCreatePbufferSurface failed"

    .line 143
    .line 144
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 145
    .line 146
    .line 147
    throw p0

    .line 148
    :cond_2
    new-instance p0, La/tiu0;

    .line 149
    .line 150
    const-string v0, "eglCreateContext failed"

    .line 151
    .line 152
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 153
    .line 154
    .line 155
    throw p0

    .line 156
    :cond_3
    new-instance p0, La/tiu0;

    .line 157
    .line 158
    const-string v0, "eglChooseConfig returned null"

    .line 159
    .line 160
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 161
    .line 162
    .line 163
    throw p0

    .line 164
    :cond_4
    new-instance p0, La/tiu0;

    .line 165
    .line 166
    const-string v0, "eglChooseConfig failed"

    .line 167
    .line 168
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 169
    .line 170
    .line 171
    throw p0

    .line 172
    :cond_5
    new-instance p0, La/tiu0;

    .line 173
    .line 174
    const-string v0, "eglInitialize failed"

    .line 175
    .line 176
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 177
    .line 178
    .line 179
    throw p0

    .line 180
    :cond_6
    new-instance p0, La/tiu0;

    .line 181
    .line 182
    const-string v0, "eglGetDisplay failed"

    .line 183
    .line 184
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 185
    .line 186
    .line 187
    throw p0

    .line 188
    nop

    .line 189
    :array_0
    .array-data 4
        0x3024
        0x8
        0x3023
        0x8
        0x3022
        0x8
        0x3040
        0x4
        0x3038
    .end array-data
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 18
    .line 19
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 20
    .line 21
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 22
    .line 23
    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Landroid/opengl/EGLSurface;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 43
    .line 44
    iget-object v1, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Landroid/opengl/EGLSurface;

    .line 47
    .line 48
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-object v0, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Landroid/opengl/EGLContext;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    iget-object v0, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 68
    .line 69
    iget-object v1, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Landroid/opengl/EGLContext;

    .line 72
    .line 73
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 74
    .line 75
    .line 76
    :cond_1
    iget-object v0, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 79
    .line 80
    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 81
    .line 82
    .line 83
    :cond_2
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 84
    .line 85
    iput-object v0, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 86
    .line 87
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 88
    .line 89
    iput-object v0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 90
    .line 91
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 92
    .line 93
    iput-object v0, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 94
    .line 95
    return-void
.end method

.method public e()La/g8x0;
    .locals 3

    .line 1
    iget-object v0, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v2, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/lang/Integer;

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    iget-object v2, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, La/hbb;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    new-instance v1, La/g8x0;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget-object p0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, La/hbb;

    .line 37
    .line 38
    invoke-direct {v1, v0, v2, p0}, La/g8x0;-><init>(IILa/hbb;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_0
    const-string p0, "variant not set"

    .line 43
    .line 44
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_1
    const-string p0, "tag size not set"

    .line 49
    .line 50
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_2
    const-string p0, "key size not set"

    .line 55
    .line 56
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v1
.end method

.method public f(I)V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 11
    .line 12
    shl-int/lit8 p1, p1, 0x3

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "Invalid key size %d; only 128-bit and 256-bit AES keys are supported"

    .line 23
    .line 24
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 37
    .line 38
    return-void
.end method

.method public g(I)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-lt p1, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    if-lt v0, p1, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 17
    .line 18
    const-string v0, "Invalid tag size for AesCmacParameters: "

    .line 19
    .line 20
    invoke-static {p1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method public h(La/xfw0;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 2
    .line 3
    iget-object v0, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/lsj;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p1, v0, La/lsj;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p1, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, La/nmt0;

    .line 14
    .line 15
    iget-object p1, p1, La/nmt0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, La/ywq0;

    .line 18
    .line 19
    new-instance v1, La/glt0;

    .line 20
    .line 21
    iget-object v2, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, La/hcp0;

    .line 24
    .line 25
    invoke-direct {v1, p0, v2, p0}, La/glt0;-><init>(La/x4w0;La/hcp0;La/x4w0;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p1, La/ywq0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, La/rfw0;

    .line 31
    .line 32
    iget-object p1, p1, La/ywq0;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    const-string v2, "/verifyPhoneNumber"

    .line 37
    .line 38
    invoke-virtual {p0, v2, p1}, La/c2;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v2, La/njw0;

    .line 43
    .line 44
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, La/fht0;

    .line 50
    .line 51
    invoke-static {p1, v0, v1, v2, p0}, La/hhm0;->G(Ljava/lang/String;La/ufw0;La/ngw0;La/xfw0;La/fht0;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public zza(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/hcp0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/hcp0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
