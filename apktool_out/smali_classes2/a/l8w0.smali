.class public final La/l8w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ngw0;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# virtual methods
.method public a()V
    .locals 15

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
    iput-object v1, p0, La/l8w0;->a:Ljava/lang/Object;

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
    const/16 v1, 0x3040

    .line 28
    .line 29
    const/16 v2, 0x40

    .line 30
    .line 31
    const/16 v6, 0x3038

    .line 32
    .line 33
    filled-new-array {v1, v2, v6}, [I

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    new-array v10, v5, [Landroid/opengl/EGLConfig;

    .line 38
    .line 39
    new-array v13, v5, [I

    .line 40
    .line 41
    iget-object v1, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v7, v1

    .line 44
    check-cast v7, Landroid/opengl/EGLDisplay;

    .line 45
    .line 46
    const/4 v12, 0x1

    .line 47
    const/4 v14, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v11, 0x0

    .line 50
    invoke-static/range {v7 .. v14}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    aget v1, v13, v0

    .line 57
    .line 58
    if-lez v1, :cond_4

    .line 59
    .line 60
    aget-object v1, v10, v0

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    iget-object v2, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Landroid/opengl/EGLDisplay;

    .line 67
    .line 68
    sget-object v7, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 69
    .line 70
    const/4 v8, 0x3

    .line 71
    const/16 v9, 0x30fb

    .line 72
    .line 73
    const/16 v10, 0x3098

    .line 74
    .line 75
    filled-new-array {v10, v8, v9, v5, v6}, [I

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-static {v2, v1, v7, v8, v0}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    sget-object v7, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 84
    .line 85
    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-nez v7, :cond_2

    .line 90
    .line 91
    iput-object v2, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object v2, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Landroid/opengl/EGLDisplay;

    .line 96
    .line 97
    const/16 v7, 0x3057

    .line 98
    .line 99
    const/16 v8, 0x3056

    .line 100
    .line 101
    filled-new-array {v7, v5, v8, v5, v6}, [I

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-static {v2, v1, v5, v0}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 110
    .line 111
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_1

    .line 116
    .line 117
    iput-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 118
    .line 119
    iget-object v1, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Landroid/opengl/EGLDisplay;

    .line 122
    .line 123
    iget-object p0, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Landroid/opengl/EGLContext;

    .line 126
    .line 127
    invoke-static {v1, v0, v0, p0}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_0

    .line 132
    .line 133
    return-void

    .line 134
    :cond_0
    new-instance p0, La/tiu0;

    .line 135
    .line 136
    const-string v0, "eglMakeCurrent failed"

    .line 137
    .line 138
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 139
    .line 140
    .line 141
    throw p0

    .line 142
    :cond_1
    new-instance p0, La/tiu0;

    .line 143
    .line 144
    const-string v0, "eglCreatePbufferSurface failed"

    .line 145
    .line 146
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 147
    .line 148
    .line 149
    throw p0

    .line 150
    :cond_2
    new-instance p0, La/tiu0;

    .line 151
    .line 152
    const-string v0, "eglCreateContext failed"

    .line 153
    .line 154
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 155
    .line 156
    .line 157
    throw p0

    .line 158
    :cond_3
    new-instance p0, La/tiu0;

    .line 159
    .line 160
    const-string v0, "eglChooseConfig returned null"

    .line 161
    .line 162
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 163
    .line 164
    .line 165
    throw p0

    .line 166
    :cond_4
    new-instance p0, La/tiu0;

    .line 167
    .line 168
    const-string v0, "eglChooseConfig failed (ES 3.1 unsupported?)"

    .line 169
    .line 170
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 171
    .line 172
    .line 173
    throw p0

    .line 174
    :cond_5
    new-instance p0, La/tiu0;

    .line 175
    .line 176
    const-string v0, "eglInitialize failed"

    .line 177
    .line 178
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 179
    .line 180
    .line 181
    throw p0

    .line 182
    :cond_6
    new-instance p0, La/tiu0;

    .line 183
    .line 184
    const-string v0, "eglGetDisplay failed"

    .line 185
    .line 186
    invoke-direct {p0, v0, v3, v4}, La/tiu0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 187
    .line 188
    .line 189
    throw p0
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, La/l8w0;->a:Ljava/lang/Object;

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
    move-result v1

    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 16
    .line 17
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 18
    .line 19
    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Landroid/opengl/EGLSurface;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object v1, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Landroid/opengl/EGLContext;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 57
    .line 58
    .line 59
    :cond_2
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 60
    .line 61
    iput-object v0, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 62
    .line 63
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 64
    .line 65
    iput-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 66
    .line 67
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 68
    .line 69
    iput-object v0, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 70
    .line 71
    return-void
.end method

.method public c()La/crw0;
    .locals 4

    .line 1
    iget-object v0, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/jrw0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    iget-object v2, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/rkt0;

    .line 11
    .line 12
    if-eqz v2, :cond_8

    .line 13
    .line 14
    iget v3, v0, La/jrw0;->a:I

    .line 15
    .line 16
    iget-object v2, v2, La/rkt0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, La/icw0;

    .line 19
    .line 20
    iget-object v2, v2, La/icw0;->a:[B

    .line 21
    .line 22
    array-length v2, v2

    .line 23
    if-ne v3, v2, :cond_7

    .line 24
    .line 25
    invoke-virtual {v0}, La/jrw0;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 39
    .line 40
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_1
    :goto_0
    iget-object v0, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/jrw0;

    .line 47
    .line 48
    invoke-virtual {v0}, La/jrw0;->a()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/Integer;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string p0, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 62
    .line 63
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    iget-object v0, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La/jrw0;

    .line 70
    .line 71
    iget-object v0, v0, La/jrw0;->d:La/drq;

    .line 72
    .line 73
    sget-object v2, La/drq;->g:La/drq;

    .line 74
    .line 75
    if-ne v0, v2, :cond_4

    .line 76
    .line 77
    sget-object v0, La/q6x0;->a:La/icw0;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    sget-object v2, La/drq;->f:La/drq;

    .line 81
    .line 82
    if-ne v0, v2, :cond_5

    .line 83
    .line 84
    iget-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0}, La/q6x0;->a(I)La/icw0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    sget-object v2, La/drq;->e:La/drq;

    .line 98
    .line 99
    if-ne v0, v2, :cond_6

    .line 100
    .line 101
    iget-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-static {v0}, La/q6x0;->b(I)La/icw0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :goto_2
    new-instance v1, La/crw0;

    .line 114
    .line 115
    iget-object v2, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, La/jrw0;

    .line 118
    .line 119
    iget-object v3, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v3, La/rkt0;

    .line 122
    .line 123
    iget-object p0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-direct {v1, v2, v3, v0, p0}, La/crw0;-><init>(La/jrw0;La/rkt0;La/icw0;Ljava/lang/Integer;)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :cond_6
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    const-string v0, "Unknown AesEaxParameters.Variant: "

    .line 136
    .line 137
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_7
    const-string p0, "Key size mismatch"

    .line 146
    .line 147
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :cond_8
    const-string p0, "Cannot build without parameters and/or key material"

    .line 152
    .line 153
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v1
.end method

.method public d()La/h8x0;
    .locals 4

    .line 1
    iget-object v0, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/p8x0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    iget-object v2, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/rkt0;

    .line 11
    .line 12
    if-eqz v2, :cond_9

    .line 13
    .line 14
    iget v3, v0, La/p8x0;->a:I

    .line 15
    .line 16
    iget-object v2, v2, La/rkt0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, La/icw0;

    .line 19
    .line 20
    iget-object v2, v2, La/icw0;->a:[B

    .line 21
    .line 22
    array-length v2, v2

    .line 23
    if-ne v3, v2, :cond_8

    .line 24
    .line 25
    invoke-virtual {v0}, La/p8x0;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 39
    .line 40
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_1
    :goto_0
    iget-object v0, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/p8x0;

    .line 47
    .line 48
    invoke-virtual {v0}, La/p8x0;->a()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/Integer;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string p0, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 62
    .line 63
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    iget-object v0, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La/p8x0;

    .line 70
    .line 71
    iget-object v0, v0, La/p8x0;->c:La/arw0;

    .line 72
    .line 73
    sget-object v2, La/arw0;->k:La/arw0;

    .line 74
    .line 75
    if-ne v0, v2, :cond_4

    .line 76
    .line 77
    sget-object v0, La/q6x0;->a:La/icw0;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    sget-object v2, La/arw0;->j:La/arw0;

    .line 81
    .line 82
    if-eq v0, v2, :cond_7

    .line 83
    .line 84
    sget-object v2, La/arw0;->i:La/arw0;

    .line 85
    .line 86
    if-ne v0, v2, :cond_5

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_5
    sget-object v2, La/arw0;->h:La/arw0;

    .line 90
    .line 91
    if-ne v0, v2, :cond_6

    .line 92
    .line 93
    iget-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-static {v0}, La/q6x0;->b(I)La/icw0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    goto :goto_3

    .line 106
    :cond_6
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const-string v0, "Unknown HmacParameters.Variant: "

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-object v1

    .line 120
    :cond_7
    :goto_2
    iget-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-static {v0}, La/q6x0;->a(I)La/icw0;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :goto_3
    new-instance v1, La/h8x0;

    .line 133
    .line 134
    iget-object v2, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v2, La/p8x0;

    .line 137
    .line 138
    iget-object v3, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v3, La/rkt0;

    .line 141
    .line 142
    iget-object p0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-direct {v1, v2, v3, v0, p0}, La/h8x0;-><init>(La/p8x0;La/rkt0;La/icw0;Ljava/lang/Integer;)V

    .line 147
    .line 148
    .line 149
    return-object v1

    .line 150
    :cond_8
    const-string p0, "Key size mismatch"

    .line 151
    .line 152
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-object v1

    .line 156
    :cond_9
    const-string p0, "Cannot build without parameters and/or key material"

    .line 157
    .line 158
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v1
.end method

.method public e()Ljava/io/File;
    .locals 5

    .line 1
    iget-object v0, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/lin0;

    .line 4
    .line 5
    new-instance v1, Ljava/io/File;

    .line 6
    .line 7
    invoke-interface {v0}, La/lin0;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/lin0;

    .line 16
    .line 17
    invoke-interface {p0}, La/lin0;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    add-int/2addr v2, v3

    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x3

    .line 45
    .line 46
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 47
    .line 48
    .line 49
    const-string v2, "/"

    .line 50
    .line 51
    const-string v4, ".pb"

    .line 52
    .line 53
    invoke-static {v3, v0, v2, p0, v4}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v1
.end method

.method public synthetic h(La/xfw0;)V
    .locals 2

    .line 1
    check-cast p1, La/ljw0;

    .line 2
    .line 3
    iget-object v0, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/cmt0;

    .line 6
    .line 7
    iget-object v0, v0, La/cmt0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/nmt0;

    .line 10
    .line 11
    iget-object v1, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/hcp0;

    .line 14
    .line 15
    invoke-static {v0, p1, v1, p0}, La/nmt0;->e(La/nmt0;La/ljw0;La/hcp0;La/ngw0;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public zza(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/cmt0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/cmt0;->zza(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
