.class public final synthetic La/jmv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jmv0;->a:B

    iput-object p1, p0, La/jmv0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/jmv0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/oxv0;

    .line 4
    .line 5
    iget-object v0, p0, La/oxv0;->f:La/mkt0;

    .line 6
    .line 7
    iget-object v0, v0, La/mkt0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/pz40;

    .line 10
    .line 11
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    check-cast v0, La/hgk0;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, La/oxv0;->h:F

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0
.end method

.method private final b()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/jmv0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/txv0;

    .line 4
    .line 5
    iget-object p0, p0, La/txv0;->e:La/mwv0;

    .line 6
    .line 7
    iget-object p0, p0, La/mwv0;->a:La/pz40;

    .line 8
    .line 9
    check-cast p0, La/hgk0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/ywv0;

    .line 16
    .line 17
    return-object p0
.end method

.method private final c()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object p0, p0, La/jmv0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/cyv0;

    .line 4
    .line 5
    sget-object v0, La/cyv0;->O1:La/sxs0;

    .line 6
    .line 7
    new-instance v0, La/ayv0;

    .line 8
    .line 9
    new-instance v1, La/gdv0;

    .line 10
    .line 11
    const/4 v2, 0x6

    .line 12
    invoke-direct {v1, p0, v2}, La/gdv0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/uqv0;

    .line 16
    .line 17
    const/4 v3, 0x3

    .line 18
    invoke-direct {v2, p0, v3}, La/uqv0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, La/zjb;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object v4, v0, La/zz3;->d:La/dp;

    .line 29
    .line 30
    invoke-virtual {v4, p0}, La/dp;->b(La/gbn;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, La/gkb;->T(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v4, p0}, La/dp;->b(La/gbn;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, La/e3c;->y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v4, p0}, La/dp;->b(La/gbn;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, La/i9v0;

    .line 48
    .line 49
    const/16 v5, 0x10

    .line 50
    .line 51
    invoke-direct {p0, v5}, La/i9v0;-><init>(B)V

    .line 52
    .line 53
    .line 54
    new-instance v6, La/zfv0;

    .line 55
    .line 56
    invoke-direct {v6, v1, v2, v5}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    new-instance v1, La/fyv0;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    invoke-direct {v1, v3, v2}, La/fyv0;-><init>(IB)V

    .line 63
    .line 64
    .line 65
    sget-object v2, La/mnu0;->i:La/mnu0;

    .line 66
    .line 67
    new-instance v3, La/gbn;

    .line 68
    .line 69
    invoke-direct {v3, p0, v1, v6, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v3}, La/dp;->b(La/gbn;)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method

.method private final g()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/jmv0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/wzv0;

    .line 4
    .line 5
    sget-object v0, La/wzv0;->O1:La/wxs0;

    .line 6
    .line 7
    new-instance v0, La/szv0;

    .line 8
    .line 9
    new-instance v1, La/gdv0;

    .line 10
    .line 11
    const/4 v2, 0x7

    .line 12
    invoke-direct {v1, p0, v2}, La/gdv0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/uqv0;

    .line 16
    .line 17
    const/4 v3, 0x5

    .line 18
    invoke-direct {v2, p0, v3}, La/uqv0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, La/k9x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object v3, v0, La/zz3;->d:La/dp;

    .line 29
    .line 30
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, La/gkb;->T(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, La/e3c;->y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v2}, La/pym0;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v3, p0}, La/dp;->b(La/gbn;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method private final h()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/jmv0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/o1w0;

    .line 4
    .line 5
    iget-object p0, p0, La/o1w0;->g:La/p7m0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/j1w0;

    .line 12
    .line 13
    iget-boolean p0, p0, La/j1w0;->a:Z

    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method private final i()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/jmv0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/afm0;

    .line 4
    .line 5
    iget-object p0, p0, La/afm0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/azj0;

    .line 8
    .line 9
    const-class v0, La/c2w0;

    .line 10
    .line 11
    sget-object v1, La/sre0;->a:La/tre0;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, La/azj0;->d(La/sgy;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/c2w0;

    .line 22
    .line 23
    return-object p0
.end method

.method private final l()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, La/jmv0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/g4w0;

    .line 4
    .line 5
    iget-object p0, p0, La/g4w0;->a:La/c1a;

    .line 6
    .line 7
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, La/ow9;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/ow9;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    check-cast p0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    const-string p0, "Required value was null."

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jmv0;->a:B

    .line 4
    .line 5
    const-string v2, "viewModelFactory"

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    iget-object v7, v0, La/jmv0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string v1, "null"

    .line 15
    .line 16
    check-cast v7, La/x7w0;

    .line 17
    .line 18
    const-string v2, "bootloader"

    .line 19
    .line 20
    const-string v8, "device"

    .line 21
    .line 22
    const-string v9, "board"

    .line 23
    .line 24
    const-string v10, "hardware"

    .line 25
    .line 26
    iget-object v11, v7, La/x7w0;->b:La/ln4;

    .line 27
    .line 28
    iget-object v12, v11, La/ln4;->a:La/us00;

    .line 29
    .line 30
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 35
    .line 36
    .line 37
    move-result-object v13

    .line 38
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 42
    .line 43
    new-instance v0, Landroid/os/StatFs;

    .line 44
    .line 45
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object v14

    .line 49
    invoke-virtual {v14}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v14

    .line 53
    invoke-direct {v0, v14}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    sget-object v14, La/j0g0;->b:La/e0g0;

    .line 59
    .line 60
    new-instance v14, La/g0g0;

    .line 61
    .line 62
    invoke-direct {v14, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v14

    .line 66
    :goto_0
    nop

    .line 67
    instance-of v14, v0, La/g0g0;

    .line 68
    .line 69
    if-eqz v14, :cond_0

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    :cond_0
    move-object v14, v0

    .line 73
    check-cast v14, Landroid/os/StatFs;

    .line 74
    .line 75
    :try_start_1
    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v12}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v15

    .line 83
    invoke-virtual {v0, v15, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 84
    .line 85
    .line 86
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    goto :goto_1

    .line 88
    :catchall_1
    move-exception v0

    .line 89
    sget-object v15, La/j0g0;->b:La/e0g0;

    .line 90
    .line 91
    new-instance v15, La/g0g0;

    .line 92
    .line 93
    invoke-direct {v15, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object v0, v15

    .line 97
    :goto_1
    nop

    .line 98
    instance-of v15, v0, La/g0g0;

    .line 99
    .line 100
    if-eqz v15, :cond_1

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    :cond_1
    move-object v15, v0

    .line 104
    check-cast v15, Landroid/content/pm/PackageInfo;

    .line 105
    .line 106
    const/4 v4, 0x2

    .line 107
    :try_start_2
    invoke-static {v5}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 112
    .line 113
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-eqz v3, :cond_2

    .line 118
    .line 119
    sget-object v0, La/lun;->a:La/lun;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object/from16 v27, v1

    .line 125
    .line 126
    move-object/from16 v19, v11

    .line 127
    .line 128
    move-object/from16 v20, v15

    .line 129
    .line 130
    :goto_2
    move-object v1, v0

    .line 131
    goto/16 :goto_8

    .line 132
    .line 133
    :goto_3
    move-object/from16 v27, v1

    .line 134
    .line 135
    :goto_4
    move-object/from16 v19, v11

    .line 136
    .line 137
    :goto_5
    move-object/from16 v20, v15

    .line 138
    .line 139
    goto/16 :goto_6

    .line 140
    .line 141
    :cond_2
    new-array v3, v4, [I

    .line 142
    .line 143
    invoke-static {v0, v3, v5, v3, v5}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 147
    .line 148
    .line 149
    const/16 v3, 0x3040

    .line 150
    .line 151
    move/from16 v26, v5

    .line 152
    .line 153
    const/16 v5, 0x3033

    .line 154
    .line 155
    const/16 v4, 0x3038

    .line 156
    .line 157
    move-object/from16 v27, v1

    .line 158
    .line 159
    const/4 v1, 0x4

    .line 160
    :try_start_3
    filled-new-array {v3, v1, v5, v6, v4}, [I

    .line 161
    .line 162
    .line 163
    move-result-object v19

    .line 164
    new-array v1, v6, [Landroid/opengl/EGLConfig;

    .line 165
    .line 166
    new-array v3, v6, [I

    .line 167
    .line 168
    const/16 v23, 0x1

    .line 169
    .line 170
    const/16 v25, 0x0

    .line 171
    .line 172
    const/16 v20, 0x0

    .line 173
    .line 174
    const/16 v22, 0x0

    .line 175
    .line 176
    move-object/from16 v18, v0

    .line 177
    .line 178
    move-object/from16 v21, v1

    .line 179
    .line 180
    move-object/from16 v24, v3

    .line 181
    .line 182
    invoke-static/range {v18 .. v25}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 183
    .line 184
    .line 185
    aget-object v1, v21, v26

    .line 186
    .line 187
    if-nez v1, :cond_3

    .line 188
    .line 189
    sget-object v0, La/lun;->a:La/lun;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-object v1, v0

    .line 195
    move-object/from16 v19, v11

    .line 196
    .line 197
    move-object/from16 v20, v15

    .line 198
    .line 199
    goto/16 :goto_8

    .line 200
    .line 201
    :cond_3
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 202
    .line 203
    const/16 v5, 0x3098

    .line 204
    .line 205
    const/4 v6, 0x2

    .line 206
    filled-new-array {v5, v6, v4}, [I

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    move/from16 v6, v26

    .line 211
    .line 212
    invoke-static {v0, v1, v3, v5, v6}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 213
    .line 214
    .line 215
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 216
    const/16 v5, 0x3057

    .line 217
    .line 218
    const/16 v6, 0x3056

    .line 219
    .line 220
    move-object/from16 v19, v11

    .line 221
    .line 222
    const/4 v11, 0x1

    .line 223
    :try_start_4
    filled-new-array {v5, v11, v6, v11, v4}, [I

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    const/4 v6, 0x0

    .line 228
    invoke-static {v0, v1, v4, v6}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-static {v0, v1, v1, v3}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 233
    .line 234
    .line 235
    const-string v4, "vendor"

    .line 236
    .line 237
    const/16 v5, 0x1f00

    .line 238
    .line 239
    invoke-static {v5}, Landroid/opengl/GLES20;->glGetString(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    new-instance v6, Lkotlin/Pair;

    .line 244
    .line 245
    invoke-direct {v6, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    const-string v4, "renderer"

    .line 249
    .line 250
    const/16 v5, 0x1f01

    .line 251
    .line 252
    invoke-static {v5}, Landroid/opengl/GLES20;->glGetString(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    new-instance v11, Lkotlin/Pair;

    .line 257
    .line 258
    invoke-direct {v11, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    const-string v4, "version"

    .line 262
    .line 263
    const/16 v5, 0x1f02

    .line 264
    .line 265
    invoke-static {v5}, Landroid/opengl/GLES20;->glGetString(I)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 269
    move-object/from16 v20, v15

    .line 270
    .line 271
    :try_start_5
    new-instance v15, Lkotlin/Pair;

    .line 272
    .line 273
    invoke-direct {v15, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    filled-new-array {v6, v11, v15}, [Lkotlin/Pair;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-static {v4}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 291
    .line 292
    sget-object v6, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 293
    .line 294
    invoke-static {v0, v5, v5, v6}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 295
    .line 296
    .line 297
    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 298
    .line 299
    .line 300
    invoke-static {v0, v3}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 301
    .line 302
    .line 303
    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :catchall_2
    move-exception v0

    .line 308
    goto :goto_6

    .line 309
    :catchall_3
    move-exception v0

    .line 310
    goto/16 :goto_5

    .line 311
    .line 312
    :catchall_4
    move-exception v0

    .line 313
    goto/16 :goto_4

    .line 314
    .line 315
    :catchall_5
    move-exception v0

    .line 316
    goto/16 :goto_3

    .line 317
    .line 318
    :goto_6
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 319
    .line 320
    new-instance v4, La/g0g0;

    .line 321
    .line 322
    invoke-direct {v4, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 323
    .line 324
    .line 325
    :goto_7
    sget-object v0, La/lun;->a:La/lun;

    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    instance-of v1, v4, La/g0g0;

    .line 331
    .line 332
    if-eqz v1, :cond_4

    .line 333
    .line 334
    move-object v4, v0

    .line 335
    :cond_4
    move-object v0, v4

    .line 336
    check-cast v0, Ljava/util/Map;

    .line 337
    .line 338
    goto/16 :goto_2

    .line 339
    .line 340
    :goto_8
    :try_start_6
    const-string v0, "android.os.SystemProperties"

    .line 341
    .line 342
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    const-string v3, "get"

    .line 347
    .line 348
    const-class v4, Ljava/lang/String;

    .line 349
    .line 350
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    const-string v3, "kernelQemu"

    .line 359
    .line 360
    const-string v4, "ro.kernel.qemu"

    .line 361
    .line 362
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    const/4 v5, 0x0

    .line 367
    invoke-virtual {v0, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    check-cast v4, Ljava/lang/String;

    .line 375
    .line 376
    new-instance v5, Lkotlin/Pair;

    .line 377
    .line 378
    invoke-direct {v5, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    const-string v3, "ro.hardware"

    .line 382
    .line 383
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    const/4 v4, 0x0

    .line 388
    invoke-virtual {v0, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    check-cast v3, Ljava/lang/String;

    .line 396
    .line 397
    new-instance v4, Lkotlin/Pair;

    .line 398
    .line 399
    invoke-direct {v4, v10, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    const-string v3, "ro.product.board"

    .line 403
    .line 404
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    const/4 v6, 0x0

    .line 409
    invoke-virtual {v0, v6, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    check-cast v3, Ljava/lang/String;

    .line 417
    .line 418
    new-instance v6, Lkotlin/Pair;

    .line 419
    .line 420
    invoke-direct {v6, v9, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    const-string v3, "ro.product.device"

    .line 424
    .line 425
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    const/4 v11, 0x0

    .line 430
    invoke-virtual {v0, v11, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    check-cast v3, Ljava/lang/String;

    .line 438
    .line 439
    new-instance v11, Lkotlin/Pair;

    .line 440
    .line 441
    invoke-direct {v11, v8, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    const-string v3, "cpuAbi"

    .line 445
    .line 446
    const-string v15, "ro.product.name"

    .line 447
    .line 448
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v15

    .line 452
    move-object/from16 v29, v4

    .line 453
    .line 454
    const/4 v4, 0x0

    .line 455
    invoke-virtual {v0, v4, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v15

    .line 459
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    check-cast v15, Ljava/lang/String;

    .line 463
    .line 464
    new-instance v4, Lkotlin/Pair;

    .line 465
    .line 466
    invoke-direct {v4, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    const-string v3, "qemu"

    .line 470
    .line 471
    const-string v15, "ro.product.cpu.abi"

    .line 472
    .line 473
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v15

    .line 477
    move-object/from16 v32, v4

    .line 478
    .line 479
    const/4 v4, 0x0

    .line 480
    invoke-virtual {v0, v4, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v15

    .line 484
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    check-cast v15, Ljava/lang/String;

    .line 488
    .line 489
    new-instance v4, Lkotlin/Pair;

    .line 490
    .line 491
    invoke-direct {v4, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    const-string v3, "characteristics"

    .line 495
    .line 496
    const-string v15, "ro.build.characteristics"

    .line 497
    .line 498
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v15

    .line 502
    move-object/from16 v33, v4

    .line 503
    .line 504
    const/4 v4, 0x0

    .line 505
    invoke-virtual {v0, v4, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v15

    .line 509
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    check-cast v15, Ljava/lang/String;

    .line 513
    .line 514
    new-instance v4, Lkotlin/Pair;

    .line 515
    .line 516
    invoke-direct {v4, v3, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    const-string v3, "ro.bootloader"

    .line 520
    .line 521
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    const/4 v15, 0x0

    .line 526
    invoke-virtual {v0, v15, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    check-cast v3, Ljava/lang/String;

    .line 534
    .line 535
    new-instance v15, Lkotlin/Pair;

    .line 536
    .line 537
    invoke-direct {v15, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    const-string v3, "verifiedbootstate"

    .line 541
    .line 542
    const-string v21, "ro.boot.verifiedbootstate"

    .line 543
    .line 544
    move-object/from16 v34, v4

    .line 545
    .line 546
    filled-new-array/range {v21 .. v21}, [Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    move-object/from16 v28, v5

    .line 551
    .line 552
    const/4 v5, 0x0

    .line 553
    invoke-virtual {v0, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v4

    .line 557
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    check-cast v4, Ljava/lang/String;

    .line 561
    .line 562
    new-instance v5, Lkotlin/Pair;

    .line 563
    .line 564
    invoke-direct {v5, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    const-string v3, "flashLocked"

    .line 568
    .line 569
    const-string v4, "ro.boot.flash.locked"

    .line 570
    .line 571
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v4

    .line 575
    move-object/from16 v36, v5

    .line 576
    .line 577
    const/4 v5, 0x0

    .line 578
    invoke-virtual {v0, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    check-cast v4, Ljava/lang/String;

    .line 586
    .line 587
    new-instance v5, Lkotlin/Pair;

    .line 588
    .line 589
    invoke-direct {v5, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 590
    .line 591
    .line 592
    const-string v3, "deviceState"

    .line 593
    .line 594
    const-string v4, "ro.boot.vbmeta.device_state"

    .line 595
    .line 596
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v4

    .line 600
    move-object/from16 v37, v5

    .line 601
    .line 602
    const/4 v5, 0x0

    .line 603
    invoke-virtual {v0, v5, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    check-cast v0, Ljava/lang/String;

    .line 611
    .line 612
    new-instance v4, Lkotlin/Pair;

    .line 613
    .line 614
    invoke-direct {v4, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 615
    .line 616
    .line 617
    move-object/from16 v38, v4

    .line 618
    .line 619
    move-object/from16 v30, v6

    .line 620
    .line 621
    move-object/from16 v31, v11

    .line 622
    .line 623
    move-object/from16 v35, v15

    .line 624
    .line 625
    filled-new-array/range {v28 .. v38}, [Lkotlin/Pair;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 630
    .line 631
    .line 632
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 633
    goto :goto_9

    .line 634
    :catchall_6
    move-exception v0

    .line 635
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 636
    .line 637
    new-instance v3, La/g0g0;

    .line 638
    .line 639
    invoke-direct {v3, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 640
    .line 641
    .line 642
    move-object v0, v3

    .line 643
    :goto_9
    sget-object v3, La/lun;->a:La/lun;

    .line 644
    .line 645
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    instance-of v4, v0, La/g0g0;

    .line 649
    .line 650
    if-eqz v4, :cond_5

    .line 651
    .line 652
    move-object v0, v3

    .line 653
    :cond_5
    move-object v3, v0

    .line 654
    check-cast v3, Ljava/util/Map;

    .line 655
    .line 656
    invoke-virtual {v12}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-virtual {v12}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 661
    .line 662
    .line 663
    move-result-object v4

    .line 664
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 665
    .line 666
    .line 667
    move-result-object v4

    .line 668
    iget v4, v4, Landroid/content/res/Configuration;->uiMode:I

    .line 669
    .line 670
    and-int/lit8 v4, v4, 0x30

    .line 671
    .line 672
    const/16 v5, 0x10

    .line 673
    .line 674
    if-eq v4, v5, :cond_7

    .line 675
    .line 676
    const/16 v5, 0x20

    .line 677
    .line 678
    if-eq v4, v5, :cond_6

    .line 679
    .line 680
    const-string v4, "undefined"

    .line 681
    .line 682
    goto :goto_a

    .line 683
    :cond_6
    const-string v4, "yes"

    .line 684
    .line 685
    goto :goto_a

    .line 686
    :cond_7
    const-string v4, "no"

    .line 687
    .line 688
    :goto_a
    new-instance v5, Lkotlin/Pair;

    .line 689
    .line 690
    const-string v6, "darkMode"

    .line 691
    .line 692
    invoke-direct {v5, v6, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    const-string v4, "os.version"

    .line 696
    .line 697
    invoke-static {v4}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v11

    .line 701
    const-string v15, ""

    .line 702
    .line 703
    if-nez v11, :cond_8

    .line 704
    .line 705
    move-object v11, v15

    .line 706
    :cond_8
    move-object/from16 v21, v4

    .line 707
    .line 708
    new-instance v4, Lkotlin/Pair;

    .line 709
    .line 710
    move-object/from16 v22, v15

    .line 711
    .line 712
    const-string v15, "osVersion"

    .line 713
    .line 714
    invoke-direct {v4, v15, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    const-string v11, "screen_brightness"

    .line 718
    .line 719
    move-object/from16 v23, v6

    .line 720
    .line 721
    const/4 v6, -0x1

    .line 722
    invoke-static {v0, v11, v6}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 723
    .line 724
    .line 725
    move-result v11

    .line 726
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v11

    .line 730
    new-instance v6, Lkotlin/Pair;

    .line 731
    .line 732
    move-object/from16 v25, v3

    .line 733
    .line 734
    const-string v3, "brightness"

    .line 735
    .line 736
    invoke-direct {v6, v3, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    const-string v11, "screen_off_timeout"

    .line 740
    .line 741
    move-object/from16 v28, v3

    .line 742
    .line 743
    const/4 v3, -0x1

    .line 744
    invoke-static {v0, v11, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 745
    .line 746
    .line 747
    move-result v0

    .line 748
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    new-instance v3, Lkotlin/Pair;

    .line 753
    .line 754
    const-string v11, "screenTimeout"

    .line 755
    .line 756
    invoke-direct {v3, v11, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    filled-new-array {v5, v4, v6, v3}, [Lkotlin/Pair;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    const-string v0, "camera"

    .line 768
    .line 769
    invoke-virtual {v12, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    check-cast v4, Landroid/hardware/camera2/CameraManager;

    .line 777
    .line 778
    new-instance v5, Ljava/util/ArrayList;

    .line 779
    .line 780
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 781
    .line 782
    .line 783
    new-instance v6, Ljava/util/ArrayList;

    .line 784
    .line 785
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 786
    .line 787
    .line 788
    move-object/from16 v24, v11

    .line 789
    .line 790
    new-instance v11, Ljava/util/ArrayList;

    .line 791
    .line 792
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 793
    .line 794
    .line 795
    move-object/from16 v29, v3

    .line 796
    .line 797
    new-instance v3, Ljava/util/ArrayList;

    .line 798
    .line 799
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 800
    .line 801
    .line 802
    move-object/from16 v30, v1

    .line 803
    .line 804
    new-instance v1, Ljava/util/ArrayList;

    .line 805
    .line 806
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 807
    .line 808
    .line 809
    move-object/from16 v31, v14

    .line 810
    .line 811
    new-instance v14, Ljava/util/ArrayList;

    .line 812
    .line 813
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 814
    .line 815
    .line 816
    move-object/from16 v32, v7

    .line 817
    .line 818
    :try_start_7
    invoke-virtual {v4}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v7

    .line 822
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 823
    .line 824
    .line 825
    move-object/from16 v33, v13

    .line 826
    .line 827
    :try_start_8
    array-length v13, v7

    .line 828
    move-object/from16 v34, v7

    .line 829
    .line 830
    const/4 v7, 0x0

    .line 831
    :goto_b
    if-ge v7, v13, :cond_c

    .line 832
    .line 833
    move/from16 v35, v7

    .line 834
    .line 835
    aget-object v7, v34, v35

    .line 836
    .line 837
    move/from16 v36, v13

    .line 838
    .line 839
    invoke-virtual {v4, v7}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    .line 840
    .line 841
    .line 842
    move-result-object v13

    .line 843
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 844
    .line 845
    .line 846
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_PHYSICAL_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 853
    .line 854
    invoke-virtual {v13, v7}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    move-result-object v7

    .line 858
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v7

    .line 862
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_AVAILABLE_FOCAL_LENGTHS:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 866
    .line 867
    invoke-virtual {v13, v7}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v7

    .line 871
    check-cast v7, [F

    .line 872
    .line 873
    if-eqz v7, :cond_9

    .line 874
    .line 875
    invoke-static {v7}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 876
    .line 877
    .line 878
    move-result-object v7

    .line 879
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    goto :goto_c

    .line 883
    :cond_9
    move-object/from16 v7, v27

    .line 884
    .line 885
    :goto_c
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 886
    .line 887
    .line 888
    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_AVAILABLE_APERTURES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 889
    .line 890
    invoke-virtual {v13, v7}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v7

    .line 894
    check-cast v7, [F

    .line 895
    .line 896
    if-eqz v7, :cond_a

    .line 897
    .line 898
    invoke-static {v7}, Ljava/util/Arrays;->toString([F)Ljava/lang/String;

    .line 899
    .line 900
    .line 901
    move-result-object v7

    .line 902
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    goto :goto_d

    .line 906
    :cond_a
    move-object/from16 v7, v27

    .line 907
    .line 908
    :goto_d
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 912
    .line 913
    invoke-virtual {v13, v7}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v7

    .line 917
    check-cast v7, [I

    .line 918
    .line 919
    if-eqz v7, :cond_b

    .line 920
    .line 921
    invoke-static {v7}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v7

    .line 925
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 926
    .line 927
    .line 928
    goto :goto_e

    .line 929
    :cond_b
    move-object/from16 v7, v27

    .line 930
    .line 931
    :goto_e
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    sget-object v7, Landroid/hardware/camera2/CameraCharacteristics;->FLASH_INFO_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 935
    .line 936
    invoke-virtual {v13, v7}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v7

    .line 940
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v7

    .line 944
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 945
    .line 946
    .line 947
    add-int/lit8 v7, v35, 0x1

    .line 948
    .line 949
    move/from16 v13, v36

    .line 950
    .line 951
    goto :goto_b

    .line 952
    :catchall_7
    move-object/from16 v33, v13

    .line 953
    .line 954
    :catchall_8
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 955
    .line 956
    :cond_c
    new-instance v4, Lkotlin/Pair;

    .line 957
    .line 958
    const-string v7, "id"

    .line 959
    .line 960
    invoke-direct {v4, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 961
    .line 962
    .line 963
    new-instance v5, Lkotlin/Pair;

    .line 964
    .line 965
    const-string v7, "sensorSize"

    .line 966
    .line 967
    invoke-direct {v5, v7, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 968
    .line 969
    .line 970
    new-instance v6, Lkotlin/Pair;

    .line 971
    .line 972
    const-string v7, "focalLengths"

    .line 973
    .line 974
    invoke-direct {v6, v7, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    new-instance v7, Lkotlin/Pair;

    .line 978
    .line 979
    const-string v11, "apertures"

    .line 980
    .line 981
    invoke-direct {v7, v11, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 982
    .line 983
    .line 984
    new-instance v3, Lkotlin/Pair;

    .line 985
    .line 986
    const-string v11, "ois"

    .line 987
    .line 988
    invoke-direct {v3, v11, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 989
    .line 990
    .line 991
    new-instance v1, Lkotlin/Pair;

    .line 992
    .line 993
    const-string v11, "flash"

    .line 994
    .line 995
    invoke-direct {v1, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 996
    .line 997
    .line 998
    move-object/from16 v39, v1

    .line 999
    .line 1000
    move-object/from16 v38, v3

    .line 1001
    .line 1002
    move-object/from16 v34, v4

    .line 1003
    .line 1004
    move-object/from16 v35, v5

    .line 1005
    .line 1006
    move-object/from16 v36, v6

    .line 1007
    .line 1008
    move-object/from16 v37, v7

    .line 1009
    .line 1010
    filled-new-array/range {v34 .. v39}, [Lkotlin/Pair;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    invoke-static {v1}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 1015
    .line 1016
    .line 1017
    move-result-object v1

    .line 1018
    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v3

    .line 1022
    new-instance v4, La/nhf0;

    .line 1023
    .line 1024
    new-instance v5, La/o58;

    .line 1025
    .line 1026
    const/4 v6, 0x0

    .line 1027
    invoke-direct {v5, v12, v6}, La/o58;-><init>(Landroid/content/Context;B)V

    .line 1028
    .line 1029
    .line 1030
    invoke-direct {v4, v5}, La/nhf0;-><init>(La/o58;)V

    .line 1031
    .line 1032
    .line 1033
    const/16 v5, 0xf

    .line 1034
    .line 1035
    invoke-virtual {v4, v5}, La/nhf0;->d(I)I

    .line 1036
    .line 1037
    .line 1038
    move-result v4

    .line 1039
    if-eqz v4, :cond_f

    .line 1040
    .line 1041
    const/4 v11, 0x1

    .line 1042
    if-eq v4, v11, :cond_e

    .line 1043
    .line 1044
    const/16 v5, 0xc

    .line 1045
    .line 1046
    if-eq v4, v5, :cond_d

    .line 1047
    .line 1048
    const-string v4, "none_enrolled"

    .line 1049
    .line 1050
    goto :goto_f

    .line 1051
    :cond_d
    const-string v4, "no_hw"

    .line 1052
    .line 1053
    goto :goto_f

    .line 1054
    :cond_e
    const-string v4, "unavailable"

    .line 1055
    .line 1056
    goto :goto_f

    .line 1057
    :cond_f
    const-string v4, "success"

    .line 1058
    .line 1059
    :goto_f
    const-string v5, "android.hardware.nfc"

    .line 1060
    .line 1061
    invoke-virtual {v3, v5}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1062
    .line 1063
    .line 1064
    move-result v5

    .line 1065
    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v5

    .line 1069
    new-instance v6, Lkotlin/Pair;

    .line 1070
    .line 1071
    const-string v7, "nfc"

    .line 1072
    .line 1073
    invoke-direct {v6, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1074
    .line 1075
    .line 1076
    const-string v5, "android.hardware.bluetooth"

    .line 1077
    .line 1078
    invoke-virtual {v3, v5}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1079
    .line 1080
    .line 1081
    move-result v5

    .line 1082
    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v5

    .line 1086
    new-instance v7, Lkotlin/Pair;

    .line 1087
    .line 1088
    const-string v11, "bluetooth"

    .line 1089
    .line 1090
    invoke-direct {v7, v11, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1091
    .line 1092
    .line 1093
    const-string v5, "android.hardware.camera.any"

    .line 1094
    .line 1095
    invoke-virtual {v3, v5}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v5

    .line 1099
    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v5

    .line 1103
    new-instance v11, Lkotlin/Pair;

    .line 1104
    .line 1105
    invoke-direct {v11, v0, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1106
    .line 1107
    .line 1108
    const-string v0, "android.hardware.camera.front"

    .line 1109
    .line 1110
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1111
    .line 1112
    .line 1113
    move-result v0

    .line 1114
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v0

    .line 1118
    new-instance v5, Lkotlin/Pair;

    .line 1119
    .line 1120
    const-string v13, "cameraFront"

    .line 1121
    .line 1122
    invoke-direct {v5, v13, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1123
    .line 1124
    .line 1125
    const-string v0, "android.hardware.camera.autofocus"

    .line 1126
    .line 1127
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    new-instance v13, Lkotlin/Pair;

    .line 1136
    .line 1137
    const-string v14, "autofocus"

    .line 1138
    .line 1139
    invoke-direct {v13, v14, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1140
    .line 1141
    .line 1142
    const-string v0, "android.hardware.telephony"

    .line 1143
    .line 1144
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1145
    .line 1146
    .line 1147
    move-result v0

    .line 1148
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v0

    .line 1152
    new-instance v14, Lkotlin/Pair;

    .line 1153
    .line 1154
    move-object/from16 v37, v5

    .line 1155
    .line 1156
    const-string v5, "telephony"

    .line 1157
    .line 1158
    invoke-direct {v14, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1159
    .line 1160
    .line 1161
    const-string v0, "android.hardware.bluetooth_le"

    .line 1162
    .line 1163
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v0

    .line 1167
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    new-instance v5, Lkotlin/Pair;

    .line 1172
    .line 1173
    move-object/from16 v34, v6

    .line 1174
    .line 1175
    const-string v6, "bluetoothLe"

    .line 1176
    .line 1177
    invoke-direct {v5, v6, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1178
    .line 1179
    .line 1180
    const-string v0, "android.hardware.wifi"

    .line 1181
    .line 1182
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v0

    .line 1186
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    new-instance v6, Lkotlin/Pair;

    .line 1191
    .line 1192
    move-object/from16 v40, v5

    .line 1193
    .line 1194
    const-string v5, "wifi"

    .line 1195
    .line 1196
    invoke-direct {v6, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1197
    .line 1198
    .line 1199
    const-string v0, "android.hardware.usb.host"

    .line 1200
    .line 1201
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v0

    .line 1205
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    new-instance v5, Lkotlin/Pair;

    .line 1210
    .line 1211
    move-object/from16 v41, v6

    .line 1212
    .line 1213
    const-string v6, "usbHost"

    .line 1214
    .line 1215
    invoke-direct {v5, v6, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1216
    .line 1217
    .line 1218
    const-string v0, "android.hardware.ethernet"

    .line 1219
    .line 1220
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1221
    .line 1222
    .line 1223
    move-result v0

    .line 1224
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v0

    .line 1228
    new-instance v6, Lkotlin/Pair;

    .line 1229
    .line 1230
    move-object/from16 v42, v5

    .line 1231
    .line 1232
    const-string v5, "ethernet"

    .line 1233
    .line 1234
    invoke-direct {v6, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1235
    .line 1236
    .line 1237
    const-string v0, "android.hardware.location.gps"

    .line 1238
    .line 1239
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v0

    .line 1243
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v0

    .line 1247
    new-instance v5, Lkotlin/Pair;

    .line 1248
    .line 1249
    move-object/from16 v43, v6

    .line 1250
    .line 1251
    const-string v6, "gps"

    .line 1252
    .line 1253
    invoke-direct {v5, v6, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1254
    .line 1255
    .line 1256
    const-string v0, "android.hardware.microphone"

    .line 1257
    .line 1258
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v0

    .line 1262
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    new-instance v6, Lkotlin/Pair;

    .line 1267
    .line 1268
    move-object/from16 v44, v5

    .line 1269
    .line 1270
    const-string v5, "microphone"

    .line 1271
    .line 1272
    invoke-direct {v6, v5, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1273
    .line 1274
    .line 1275
    const-string v0, "android.hardware.fingerprint"

    .line 1276
    .line 1277
    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1278
    .line 1279
    .line 1280
    move-result v0

    .line 1281
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    new-instance v5, Lkotlin/Pair;

    .line 1286
    .line 1287
    move-object/from16 v45, v6

    .line 1288
    .line 1289
    const-string v6, "fingerprint"

    .line 1290
    .line 1291
    invoke-direct {v5, v6, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1292
    .line 1293
    .line 1294
    new-instance v0, Lkotlin/Pair;

    .line 1295
    .line 1296
    const-string v6, "biometric"

    .line 1297
    .line 1298
    invoke-direct {v0, v6, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1299
    .line 1300
    .line 1301
    const-string v4, "android.hardware.consumerir"

    .line 1302
    .line 1303
    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1304
    .line 1305
    .line 1306
    move-result v3

    .line 1307
    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v3

    .line 1311
    new-instance v4, Lkotlin/Pair;

    .line 1312
    .line 1313
    const-string v6, "ir"

    .line 1314
    .line 1315
    invoke-direct {v4, v6, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1316
    .line 1317
    .line 1318
    move-object/from16 v47, v0

    .line 1319
    .line 1320
    move-object/from16 v48, v4

    .line 1321
    .line 1322
    move-object/from16 v46, v5

    .line 1323
    .line 1324
    move-object/from16 v35, v7

    .line 1325
    .line 1326
    move-object/from16 v36, v11

    .line 1327
    .line 1328
    move-object/from16 v38, v13

    .line 1329
    .line 1330
    move-object/from16 v39, v14

    .line 1331
    .line 1332
    filled-new-array/range {v34 .. v48}, [Lkotlin/Pair;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v3

    .line 1340
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0

    .line 1348
    iget v4, v0, Landroid/content/res/Configuration;->screenLayout:I

    .line 1349
    .line 1350
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v4

    .line 1354
    new-instance v5, Lkotlin/Pair;

    .line 1355
    .line 1356
    const-string v6, "screenLayout"

    .line 1357
    .line 1358
    invoke-direct {v5, v6, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1359
    .line 1360
    .line 1361
    iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 1362
    .line 1363
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v0

    .line 1367
    new-instance v4, Lkotlin/Pair;

    .line 1368
    .line 1369
    const-string v6, "smallestScreenWidth"

    .line 1370
    .line 1371
    invoke-direct {v4, v6, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1372
    .line 1373
    .line 1374
    :try_start_9
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 1375
    .line 1376
    const-string v0, "activity"

    .line 1377
    .line 1378
    invoke-virtual {v12, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1383
    .line 1384
    .line 1385
    check-cast v0, Landroid/app/ActivityManager;

    .line 1386
    .line 1387
    new-instance v6, Landroid/app/ActivityManager$MemoryInfo;

    .line 1388
    .line 1389
    invoke-direct {v6}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v0, v6}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 1393
    .line 1394
    .line 1395
    iget-wide v6, v6, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 1396
    .line 1397
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1401
    goto :goto_10

    .line 1402
    :catchall_9
    move-exception v0

    .line 1403
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 1404
    .line 1405
    new-instance v6, La/g0g0;

    .line 1406
    .line 1407
    invoke-direct {v6, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 1408
    .line 1409
    .line 1410
    move-object v0, v6

    .line 1411
    :goto_10
    nop

    .line 1412
    instance-of v6, v0, La/g0g0;

    .line 1413
    .line 1414
    if-eqz v6, :cond_10

    .line 1415
    .line 1416
    const-string v0, "unknown"

    .line 1417
    .line 1418
    :cond_10
    new-instance v6, Lkotlin/Pair;

    .line 1419
    .line 1420
    const-string v7, "totalRam"

    .line 1421
    .line 1422
    invoke-direct {v6, v7, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1423
    .line 1424
    .line 1425
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 1426
    .line 1427
    new-instance v7, Lkotlin/Pair;

    .line 1428
    .line 1429
    const-string v11, "buildFingerprint"

    .line 1430
    .line 1431
    invoke-direct {v7, v11, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1432
    .line 1433
    .line 1434
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    .line 1435
    .line 1436
    new-instance v11, Lkotlin/Pair;

    .line 1437
    .line 1438
    const-string v13, "buildDisplay"

    .line 1439
    .line 1440
    invoke-direct {v11, v13, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1441
    .line 1442
    .line 1443
    sget-object v0, Landroid/os/Build;->USER:Ljava/lang/String;

    .line 1444
    .line 1445
    new-instance v13, Lkotlin/Pair;

    .line 1446
    .line 1447
    const-string v14, "buildUser"

    .line 1448
    .line 1449
    invoke-direct {v13, v14, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1450
    .line 1451
    .line 1452
    move-object/from16 v35, v4

    .line 1453
    .line 1454
    move-object/from16 v34, v5

    .line 1455
    .line 1456
    move-object/from16 v36, v6

    .line 1457
    .line 1458
    move-object/from16 v37, v7

    .line 1459
    .line 1460
    move-object/from16 v38, v11

    .line 1461
    .line 1462
    move-object/from16 v39, v13

    .line 1463
    .line 1464
    filled-new-array/range {v34 .. v39}, [Lkotlin/Pair;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v0

    .line 1468
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v0

    .line 1472
    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1473
    .line 1474
    new-instance v5, Lkotlin/Pair;

    .line 1475
    .line 1476
    const-string v6, "brand"

    .line 1477
    .line 1478
    invoke-direct {v5, v6, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1479
    .line 1480
    .line 1481
    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 1482
    .line 1483
    new-instance v6, Lkotlin/Pair;

    .line 1484
    .line 1485
    invoke-direct {v6, v8, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1486
    .line 1487
    .line 1488
    sget-object v4, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    .line 1489
    .line 1490
    new-instance v7, Lkotlin/Pair;

    .line 1491
    .line 1492
    const-string v8, "product"

    .line 1493
    .line 1494
    invoke-direct {v7, v8, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1495
    .line 1496
    .line 1497
    sget-object v4, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    .line 1498
    .line 1499
    new-instance v8, Lkotlin/Pair;

    .line 1500
    .line 1501
    invoke-direct {v8, v10, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1502
    .line 1503
    .line 1504
    sget-object v4, Landroid/os/Build;->BOARD:Ljava/lang/String;

    .line 1505
    .line 1506
    new-instance v10, Lkotlin/Pair;

    .line 1507
    .line 1508
    invoke-direct {v10, v9, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1509
    .line 1510
    .line 1511
    sget-object v4, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    .line 1512
    .line 1513
    new-instance v9, Lkotlin/Pair;

    .line 1514
    .line 1515
    invoke-direct {v9, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1516
    .line 1517
    .line 1518
    sget-object v2, Landroid/os/Build;->HOST:Ljava/lang/String;

    .line 1519
    .line 1520
    new-instance v4, Lkotlin/Pair;

    .line 1521
    .line 1522
    const-string v11, "host"

    .line 1523
    .line 1524
    invoke-direct {v4, v11, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1525
    .line 1526
    .line 1527
    sget-object v2, Landroid/os/Build;->TAGS:Ljava/lang/String;

    .line 1528
    .line 1529
    new-instance v11, Lkotlin/Pair;

    .line 1530
    .line 1531
    const-string v13, "tags"

    .line 1532
    .line 1533
    invoke-direct {v11, v13, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1534
    .line 1535
    .line 1536
    sget-object v2, Landroid/os/Build;->TYPE:Ljava/lang/String;

    .line 1537
    .line 1538
    new-instance v13, Lkotlin/Pair;

    .line 1539
    .line 1540
    const-string v14, "type"

    .line 1541
    .line 1542
    invoke-direct {v13, v14, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1543
    .line 1544
    .line 1545
    move-object/from16 v40, v4

    .line 1546
    .line 1547
    move-object/from16 v34, v5

    .line 1548
    .line 1549
    move-object/from16 v35, v6

    .line 1550
    .line 1551
    move-object/from16 v36, v7

    .line 1552
    .line 1553
    move-object/from16 v37, v8

    .line 1554
    .line 1555
    move-object/from16 v39, v9

    .line 1556
    .line 1557
    move-object/from16 v38, v10

    .line 1558
    .line 1559
    move-object/from16 v41, v11

    .line 1560
    .line 1561
    move-object/from16 v42, v13

    .line 1562
    .line 1563
    filled-new-array/range {v34 .. v42}, [Lkotlin/Pair;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v2

    .line 1567
    invoke-static {v2}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v2

    .line 1571
    sget-object v4, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    .line 1572
    .line 1573
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1574
    .line 1575
    .line 1576
    invoke-static {v4}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v4

    .line 1580
    new-instance v5, Lkotlin/Pair;

    .line 1581
    .line 1582
    const-string v6, "supported"

    .line 1583
    .line 1584
    invoke-direct {v5, v6, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1585
    .line 1586
    .line 1587
    sget-object v4, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    .line 1588
    .line 1589
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1590
    .line 1591
    .line 1592
    invoke-static {v4}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v4

    .line 1596
    new-instance v7, Lkotlin/Pair;

    .line 1597
    .line 1598
    const-string v8, "supported32"

    .line 1599
    .line 1600
    invoke-direct {v7, v8, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1601
    .line 1602
    .line 1603
    sget-object v4, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    .line 1604
    .line 1605
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1606
    .line 1607
    .line 1608
    invoke-static {v4}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v4

    .line 1612
    new-instance v9, Lkotlin/Pair;

    .line 1613
    .line 1614
    const-string v10, "supported64"

    .line 1615
    .line 1616
    invoke-direct {v9, v10, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1617
    .line 1618
    .line 1619
    filled-new-array {v5, v7, v9}, [Lkotlin/Pair;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v4

    .line 1623
    invoke-static {v4}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v4

    .line 1627
    invoke-static/range {v21 .. v21}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 1628
    .line 1629
    .line 1630
    move-result-object v5

    .line 1631
    if-nez v5, :cond_11

    .line 1632
    .line 1633
    move-object/from16 v5, v22

    .line 1634
    .line 1635
    :cond_11
    new-instance v7, Lkotlin/Pair;

    .line 1636
    .line 1637
    invoke-direct {v7, v15, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1638
    .line 1639
    .line 1640
    invoke-static {v7}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v5

    .line 1644
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1645
    .line 1646
    const/16 v9, 0x1e

    .line 1647
    .line 1648
    if-ge v7, v9, :cond_12

    .line 1649
    .line 1650
    sget-object v7, La/iun;->a:La/iun;

    .line 1651
    .line 1652
    goto/16 :goto_14

    .line 1653
    .line 1654
    :cond_12
    const-string v7, "display"

    .line 1655
    .line 1656
    invoke-virtual {v12, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v7

    .line 1660
    instance-of v9, v7, Landroid/hardware/display/DisplayManager;

    .line 1661
    .line 1662
    if-eqz v9, :cond_13

    .line 1663
    .line 1664
    check-cast v7, Landroid/hardware/display/DisplayManager;

    .line 1665
    .line 1666
    goto :goto_11

    .line 1667
    :cond_13
    const/4 v7, 0x0

    .line 1668
    :goto_11
    if-eqz v7, :cond_14

    .line 1669
    .line 1670
    const/4 v9, 0x0

    .line 1671
    invoke-virtual {v7, v9}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v7

    .line 1675
    goto :goto_12

    .line 1676
    :cond_14
    const/4 v7, 0x0

    .line 1677
    :goto_12
    if-eqz v7, :cond_16

    .line 1678
    .line 1679
    invoke-virtual {v7}, Landroid/view/Display;->getSupportedModes()[Landroid/view/Display$Mode;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v7

    .line 1683
    if-eqz v7, :cond_16

    .line 1684
    .line 1685
    new-instance v9, Ljava/util/ArrayList;

    .line 1686
    .line 1687
    array-length v11, v7

    .line 1688
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 1689
    .line 1690
    .line 1691
    array-length v11, v7

    .line 1692
    const/4 v12, 0x0

    .line 1693
    :goto_13
    if-ge v12, v11, :cond_15

    .line 1694
    .line 1695
    aget-object v13, v7, v12

    .line 1696
    .line 1697
    new-instance v14, Ljava/lang/StringBuilder;

    .line 1698
    .line 1699
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 1700
    .line 1701
    .line 1702
    move-object/from16 v16, v7

    .line 1703
    .line 1704
    invoke-virtual {v13}, Landroid/view/Display$Mode;->getModeId()I

    .line 1705
    .line 1706
    .line 1707
    move-result v7

    .line 1708
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1709
    .line 1710
    .line 1711
    const/16 v7, 0x3a

    .line 1712
    .line 1713
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1714
    .line 1715
    .line 1716
    invoke-virtual {v13}, Landroid/view/Display$Mode;->getPhysicalWidth()I

    .line 1717
    .line 1718
    .line 1719
    move-result v7

    .line 1720
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1721
    .line 1722
    .line 1723
    const/16 v7, 0x78

    .line 1724
    .line 1725
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v13}, Landroid/view/Display$Mode;->getPhysicalHeight()I

    .line 1729
    .line 1730
    .line 1731
    move-result v7

    .line 1732
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1733
    .line 1734
    .line 1735
    const/16 v7, 0x40

    .line 1736
    .line 1737
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v13}, Landroid/view/Display$Mode;->getRefreshRate()F

    .line 1741
    .line 1742
    .line 1743
    move-result v7

    .line 1744
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v7

    .line 1751
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1752
    .line 1753
    .line 1754
    add-int/lit8 v12, v12, 0x1

    .line 1755
    .line 1756
    move-object/from16 v7, v16

    .line 1757
    .line 1758
    goto :goto_13

    .line 1759
    :cond_15
    move-object v7, v9

    .line 1760
    goto :goto_14

    .line 1761
    :cond_16
    sget-object v7, La/iun;->a:La/iun;

    .line 1762
    .line 1763
    :goto_14
    new-instance v9, Ljava/util/ArrayList;

    .line 1764
    .line 1765
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 1766
    .line 1767
    .line 1768
    new-instance v11, La/yzn;

    .line 1769
    .line 1770
    const/4 v12, 0x7

    .line 1771
    invoke-direct {v11, v2, v12}, La/yzn;-><init>(Ljava/util/Map;B)V

    .line 1772
    .line 1773
    .line 1774
    const-string v2, "Build"

    .line 1775
    .line 1776
    invoke-static {v2, v11}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v2

    .line 1780
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1781
    .line 1782
    .line 1783
    new-instance v2, La/n7w0;

    .line 1784
    .line 1785
    invoke-direct {v2}, La/n7w0;-><init>()V

    .line 1786
    .line 1787
    .line 1788
    sget-object v11, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1789
    .line 1790
    const-string v13, "model"

    .line 1791
    .line 1792
    invoke-virtual {v2, v11, v13}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1793
    .line 1794
    .line 1795
    sget-object v11, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 1796
    .line 1797
    const-string v13, "manufacturer"

    .line 1798
    .line 1799
    invoke-virtual {v2, v11, v13}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1800
    .line 1801
    .line 1802
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1803
    .line 1804
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v11

    .line 1808
    const-string v13, "sdkInt"

    .line 1809
    .line 1810
    invoke-virtual {v2, v11, v13}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1811
    .line 1812
    .line 1813
    sget-object v11, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 1814
    .line 1815
    const-string v13, "release"

    .line 1816
    .line 1817
    invoke-virtual {v2, v11, v13}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1818
    .line 1819
    .line 1820
    new-instance v11, La/h6w0;

    .line 1821
    .line 1822
    iget-object v2, v2, La/n7w0;->a:Ljava/util/ArrayList;

    .line 1823
    .line 1824
    const-string v13, "System"

    .line 1825
    .line 1826
    invoke-direct {v11, v13, v2}, La/h6w0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1827
    .line 1828
    .line 1829
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1830
    .line 1831
    .line 1832
    new-instance v2, La/yzn;

    .line 1833
    .line 1834
    const/4 v11, 0x6

    .line 1835
    invoke-direct {v2, v0, v11}, La/yzn;-><init>(Ljava/util/Map;B)V

    .line 1836
    .line 1837
    .line 1838
    const-string v0, "Hardware"

    .line 1839
    .line 1840
    invoke-static {v0, v2}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v0

    .line 1844
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1845
    .line 1846
    .line 1847
    new-instance v0, Ljava/util/ArrayList;

    .line 1848
    .line 1849
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1850
    .line 1851
    .line 1852
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v2

    .line 1856
    new-instance v11, La/g7w0;

    .line 1857
    .line 1858
    if-eqz v2, :cond_17

    .line 1859
    .line 1860
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v2

    .line 1864
    if-nez v2, :cond_18

    .line 1865
    .line 1866
    :cond_17
    move-object/from16 v2, v27

    .line 1867
    .line 1868
    :cond_18
    invoke-direct {v11, v6, v2}, La/g7w0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1869
    .line 1870
    .line 1871
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1872
    .line 1873
    .line 1874
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v2

    .line 1878
    new-instance v6, La/g7w0;

    .line 1879
    .line 1880
    if-eqz v2, :cond_19

    .line 1881
    .line 1882
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v2

    .line 1886
    if-nez v2, :cond_1a

    .line 1887
    .line 1888
    :cond_19
    move-object/from16 v2, v27

    .line 1889
    .line 1890
    :cond_1a
    invoke-direct {v6, v8, v2}, La/g7w0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1891
    .line 1892
    .line 1893
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1894
    .line 1895
    .line 1896
    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v2

    .line 1900
    new-instance v4, La/g7w0;

    .line 1901
    .line 1902
    if-eqz v2, :cond_1b

    .line 1903
    .line 1904
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v2

    .line 1908
    if-nez v2, :cond_1c

    .line 1909
    .line 1910
    :cond_1b
    move-object/from16 v2, v27

    .line 1911
    .line 1912
    :cond_1c
    invoke-direct {v4, v10, v2}, La/g7w0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1913
    .line 1914
    .line 1915
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1916
    .line 1917
    .line 1918
    new-instance v2, La/h6w0;

    .line 1919
    .line 1920
    const-string v4, "CpuAbi"

    .line 1921
    .line 1922
    invoke-direct {v2, v4, v0}, La/h6w0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1923
    .line 1924
    .line 1925
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1926
    .line 1927
    .line 1928
    new-instance v0, La/zfv0;

    .line 1929
    .line 1930
    const/16 v2, 0x14

    .line 1931
    .line 1932
    move-object/from16 v4, v33

    .line 1933
    .line 1934
    invoke-direct {v0, v7, v4, v2}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1935
    .line 1936
    .line 1937
    const-string v2, "Display"

    .line 1938
    .line 1939
    invoke-static {v2, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v0

    .line 1943
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1944
    .line 1945
    .line 1946
    new-instance v0, Ljava/util/ArrayList;

    .line 1947
    .line 1948
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1949
    .line 1950
    .line 1951
    invoke-interface {v5, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v2

    .line 1955
    new-instance v4, La/g7w0;

    .line 1956
    .line 1957
    if-eqz v2, :cond_1d

    .line 1958
    .line 1959
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v2

    .line 1963
    if-nez v2, :cond_1e

    .line 1964
    .line 1965
    :cond_1d
    move-object/from16 v2, v27

    .line 1966
    .line 1967
    :cond_1e
    invoke-direct {v4, v15, v2}, La/g7w0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1968
    .line 1969
    .line 1970
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1971
    .line 1972
    .line 1973
    new-instance v2, La/h6w0;

    .line 1974
    .line 1975
    const-string v4, "Kernel"

    .line 1976
    .line 1977
    invoke-direct {v2, v4, v0}, La/h6w0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1978
    .line 1979
    .line 1980
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1981
    .line 1982
    .line 1983
    new-instance v0, Ljava/util/ArrayList;

    .line 1984
    .line 1985
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1986
    .line 1987
    .line 1988
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v2

    .line 1992
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 1993
    .line 1994
    .line 1995
    move-result-object v4

    .line 1996
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v2

    .line 2000
    new-instance v5, La/g7w0;

    .line 2001
    .line 2002
    if-eqz v2, :cond_1f

    .line 2003
    .line 2004
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v2

    .line 2008
    if-nez v2, :cond_20

    .line 2009
    .line 2010
    :cond_1f
    move-object/from16 v2, v27

    .line 2011
    .line 2012
    :cond_20
    const-string v6, "language"

    .line 2013
    .line 2014
    invoke-direct {v5, v6, v2}, La/g7w0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2015
    .line 2016
    .line 2017
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2018
    .line 2019
    .line 2020
    invoke-virtual {v4}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v2

    .line 2024
    new-instance v4, La/g7w0;

    .line 2025
    .line 2026
    if-eqz v2, :cond_21

    .line 2027
    .line 2028
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v2

    .line 2032
    if-nez v2, :cond_22

    .line 2033
    .line 2034
    :cond_21
    move-object/from16 v2, v27

    .line 2035
    .line 2036
    :cond_22
    const-string v5, "timezoneId"

    .line 2037
    .line 2038
    invoke-direct {v4, v5, v2}, La/g7w0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2042
    .line 2043
    .line 2044
    new-instance v2, La/h6w0;

    .line 2045
    .line 2046
    const-string v4, "Locale"

    .line 2047
    .line 2048
    invoke-direct {v2, v4, v0}, La/h6w0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 2049
    .line 2050
    .line 2051
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2052
    .line 2053
    .line 2054
    new-instance v0, La/r7w0;

    .line 2055
    .line 2056
    move-object/from16 v7, v32

    .line 2057
    .line 2058
    const/4 v6, 0x2

    .line 2059
    invoke-direct {v0, v7, v6}, La/r7w0;-><init>(La/x7w0;B)V

    .line 2060
    .line 2061
    .line 2062
    const-string v2, "Keyboards"

    .line 2063
    .line 2064
    invoke-static {v2, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v0

    .line 2068
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2069
    .line 2070
    .line 2071
    new-instance v0, La/r7w0;

    .line 2072
    .line 2073
    const/4 v2, 0x3

    .line 2074
    invoke-direct {v0, v7, v2}, La/r7w0;-><init>(La/x7w0;B)V

    .line 2075
    .line 2076
    .line 2077
    const-string v2, "Sensors"

    .line 2078
    .line 2079
    invoke-static {v2, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v0

    .line 2083
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2084
    .line 2085
    .line 2086
    new-instance v0, La/r7w0;

    .line 2087
    .line 2088
    const/4 v2, 0x4

    .line 2089
    invoke-direct {v0, v7, v2}, La/r7w0;-><init>(La/x7w0;B)V

    .line 2090
    .line 2091
    .line 2092
    const-string v2, "SensorDataFirst"

    .line 2093
    .line 2094
    invoke-static {v2, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v0

    .line 2098
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2099
    .line 2100
    .line 2101
    new-instance v0, La/r7w0;

    .line 2102
    .line 2103
    invoke-direct {v0, v7, v12}, La/r7w0;-><init>(La/x7w0;B)V

    .line 2104
    .line 2105
    .line 2106
    const-string v2, "SensorDataSecond"

    .line 2107
    .line 2108
    invoke-static {v2, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v0

    .line 2112
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2113
    .line 2114
    .line 2115
    new-instance v0, La/gdv0;

    .line 2116
    .line 2117
    const/16 v2, 0xe

    .line 2118
    .line 2119
    move-object/from16 v4, v31

    .line 2120
    .line 2121
    invoke-direct {v0, v4, v2}, La/gdv0;-><init>(Ljava/lang/Object;B)V

    .line 2122
    .line 2123
    .line 2124
    const-string v2, "Storage"

    .line 2125
    .line 2126
    invoke-static {v2, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v0

    .line 2130
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2131
    .line 2132
    .line 2133
    new-instance v0, La/gdv0;

    .line 2134
    .line 2135
    move-object/from16 v2, v20

    .line 2136
    .line 2137
    invoke-direct {v0, v2, v7}, La/gdv0;-><init>(Landroid/content/pm/PackageInfo;La/x7w0;)V

    .line 2138
    .line 2139
    .line 2140
    const-string v4, "AppMetadata"

    .line 2141
    .line 2142
    invoke-static {v4, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2143
    .line 2144
    .line 2145
    move-result-object v0

    .line 2146
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2147
    .line 2148
    .line 2149
    new-instance v0, La/yzn;

    .line 2150
    .line 2151
    move-object/from16 v4, v30

    .line 2152
    .line 2153
    const/4 v6, 0x2

    .line 2154
    invoke-direct {v0, v4, v6}, La/yzn;-><init>(Ljava/util/Map;B)V

    .line 2155
    .line 2156
    .line 2157
    const-string v4, "OpenGL"

    .line 2158
    .line 2159
    invoke-static {v4, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v0

    .line 2163
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2164
    .line 2165
    .line 2166
    new-instance v0, La/ejv0;

    .line 2167
    .line 2168
    const/16 v4, 0x18

    .line 2169
    .line 2170
    invoke-direct {v0, v7, v4}, La/ejv0;-><init>(La/x7w0;B)V

    .line 2171
    .line 2172
    .line 2173
    const-string v4, "GpuSpectrometer"

    .line 2174
    .line 2175
    invoke-static {v4, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v0

    .line 2179
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2180
    .line 2181
    .line 2182
    new-instance v0, La/n7w0;

    .line 2183
    .line 2184
    invoke-direct {v0}, La/n7w0;-><init>()V

    .line 2185
    .line 2186
    .line 2187
    iget-object v4, v7, La/x7w0;->d:Lorg/xplatform/fingerprint/impl/MathTribunal;

    .line 2188
    .line 2189
    invoke-static {v4}, Lorg/xplatform/fingerprint/impl/MathTribunal;->a(Lorg/xplatform/fingerprint/impl/MathTribunal;)La/ti30;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v4

    .line 2193
    if-eqz v4, :cond_23

    .line 2194
    .line 2195
    iget-object v5, v4, La/ti30;->a:Ljava/lang/String;

    .line 2196
    .line 2197
    goto :goto_15

    .line 2198
    :cond_23
    const/4 v5, 0x0

    .line 2199
    :goto_15
    const-string v6, "bitMaskHex"

    .line 2200
    .line 2201
    invoke-virtual {v0, v5, v6}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2202
    .line 2203
    .line 2204
    if-eqz v4, :cond_24

    .line 2205
    .line 2206
    iget-wide v4, v4, La/ti30;->b:D

    .line 2207
    .line 2208
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v4

    .line 2212
    goto :goto_16

    .line 2213
    :cond_24
    const/4 v4, 0x0

    .line 2214
    :goto_16
    const-string v5, "executionTimeMs"

    .line 2215
    .line 2216
    invoke-virtual {v0, v4, v5}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2217
    .line 2218
    .line 2219
    new-instance v4, La/h6w0;

    .line 2220
    .line 2221
    iget-object v0, v0, La/n7w0;->a:Ljava/util/ArrayList;

    .line 2222
    .line 2223
    const-string v5, "MathTribunal"

    .line 2224
    .line 2225
    invoke-direct {v4, v5, v0}, La/h6w0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 2226
    .line 2227
    .line 2228
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2229
    .line 2230
    .line 2231
    new-instance v0, La/r7w0;

    .line 2232
    .line 2233
    const/4 v6, 0x0

    .line 2234
    invoke-direct {v0, v7, v6}, La/r7w0;-><init>(La/x7w0;B)V

    .line 2235
    .line 2236
    .line 2237
    const-string v4, "AudioTract"

    .line 2238
    .line 2239
    invoke-static {v4, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v0

    .line 2243
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2244
    .line 2245
    .line 2246
    new-instance v0, La/ejv0;

    .line 2247
    .line 2248
    const/16 v4, 0x19

    .line 2249
    .line 2250
    invoke-direct {v0, v7, v4}, La/ejv0;-><init>(La/x7w0;B)V

    .line 2251
    .line 2252
    .line 2253
    const-string v4, "MediaCodec"

    .line 2254
    .line 2255
    invoke-static {v4, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v0

    .line 2259
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2260
    .line 2261
    .line 2262
    new-instance v0, La/r7w0;

    .line 2263
    .line 2264
    const/4 v11, 0x1

    .line 2265
    invoke-direct {v0, v7, v11}, La/r7w0;-><init>(La/x7w0;B)V

    .line 2266
    .line 2267
    .line 2268
    const-string v4, "Security"

    .line 2269
    .line 2270
    invoke-static {v4, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2271
    .line 2272
    .line 2273
    move-result-object v0

    .line 2274
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2275
    .line 2276
    .line 2277
    new-instance v0, La/yzn;

    .line 2278
    .line 2279
    move-object/from16 v4, v25

    .line 2280
    .line 2281
    invoke-direct {v0, v4, v7}, La/yzn;-><init>(Ljava/util/Map;La/x7w0;)V

    .line 2282
    .line 2283
    .line 2284
    const-string v4, "Emulator"

    .line 2285
    .line 2286
    invoke-static {v4, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2287
    .line 2288
    .line 2289
    move-result-object v0

    .line 2290
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2291
    .line 2292
    .line 2293
    new-instance v0, La/zfv0;

    .line 2294
    .line 2295
    const/16 v4, 0x13

    .line 2296
    .line 2297
    invoke-direct {v0, v7, v2, v4}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2298
    .line 2299
    .line 2300
    const-string v2, "AppIdentity"

    .line 2301
    .line 2302
    invoke-static {v2, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v0

    .line 2306
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2307
    .line 2308
    .line 2309
    new-instance v0, La/n7w0;

    .line 2310
    .line 2311
    invoke-direct {v0}, La/n7w0;-><init>()V

    .line 2312
    .line 2313
    .line 2314
    move-object/from16 v2, v29

    .line 2315
    .line 2316
    invoke-interface {v2, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v4

    .line 2320
    invoke-virtual {v0, v4, v15}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2321
    .line 2322
    .line 2323
    move-object/from16 v4, v23

    .line 2324
    .line 2325
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2326
    .line 2327
    .line 2328
    move-result-object v5

    .line 2329
    invoke-virtual {v0, v5, v4}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2330
    .line 2331
    .line 2332
    move-object/from16 v4, v28

    .line 2333
    .line 2334
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v5

    .line 2338
    invoke-virtual {v0, v5, v4}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2339
    .line 2340
    .line 2341
    move-object/from16 v4, v24

    .line 2342
    .line 2343
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v2

    .line 2347
    invoke-virtual {v0, v2, v4}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2348
    .line 2349
    .line 2350
    new-instance v2, La/h6w0;

    .line 2351
    .line 2352
    iget-object v0, v0, La/n7w0;->a:Ljava/util/ArrayList;

    .line 2353
    .line 2354
    const-string v4, "SystemPreferences"

    .line 2355
    .line 2356
    invoke-direct {v2, v4, v0}, La/h6w0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 2357
    .line 2358
    .line 2359
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2360
    .line 2361
    .line 2362
    new-instance v0, La/yzn;

    .line 2363
    .line 2364
    const/4 v2, 0x4

    .line 2365
    invoke-direct {v0, v3, v2}, La/yzn;-><init>(Ljava/util/Map;B)V

    .line 2366
    .line 2367
    .line 2368
    const-string v2, "HardwareFeatures"

    .line 2369
    .line 2370
    invoke-static {v2, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v0

    .line 2374
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2375
    .line 2376
    .line 2377
    new-instance v0, La/yzn;

    .line 2378
    .line 2379
    const/4 v2, 0x5

    .line 2380
    invoke-direct {v0, v1, v2}, La/yzn;-><init>(Ljava/util/Map;B)V

    .line 2381
    .line 2382
    .line 2383
    const-string v1, "Cameras"

    .line 2384
    .line 2385
    invoke-static {v1, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2386
    .line 2387
    .line 2388
    move-result-object v0

    .line 2389
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2390
    .line 2391
    .line 2392
    new-instance v0, La/ejv0;

    .line 2393
    .line 2394
    const/16 v1, 0x1a

    .line 2395
    .line 2396
    invoke-direct {v0, v7, v1}, La/ejv0;-><init>(La/x7w0;B)V

    .line 2397
    .line 2398
    .line 2399
    const-string v1, "InputDevices"

    .line 2400
    .line 2401
    invoke-static {v1, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2402
    .line 2403
    .line 2404
    move-result-object v0

    .line 2405
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2406
    .line 2407
    .line 2408
    new-instance v0, La/ejv0;

    .line 2409
    .line 2410
    const/16 v1, 0x1b

    .line 2411
    .line 2412
    invoke-direct {v0, v7, v1}, La/ejv0;-><init>(La/x7w0;B)V

    .line 2413
    .line 2414
    .line 2415
    const-string v1, "AndroidGraphicsFingerprint"

    .line 2416
    .line 2417
    invoke-static {v1, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2418
    .line 2419
    .line 2420
    move-result-object v0

    .line 2421
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2422
    .line 2423
    .line 2424
    new-instance v0, La/n7w0;

    .line 2425
    .line 2426
    invoke-direct {v0}, La/n7w0;-><init>()V

    .line 2427
    .line 2428
    .line 2429
    invoke-static {}, Ljava/security/Security;->getProviders()[Ljava/security/Provider;

    .line 2430
    .line 2431
    .line 2432
    move-result-object v1

    .line 2433
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2434
    .line 2435
    .line 2436
    new-instance v2, Ljava/util/ArrayList;

    .line 2437
    .line 2438
    array-length v3, v1

    .line 2439
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2440
    .line 2441
    .line 2442
    array-length v3, v1

    .line 2443
    const/4 v5, 0x0

    .line 2444
    :goto_17
    if-ge v5, v3, :cond_25

    .line 2445
    .line 2446
    aget-object v4, v1, v5

    .line 2447
    .line 2448
    invoke-virtual {v4}, Ljava/security/Provider;->getName()Ljava/lang/String;

    .line 2449
    .line 2450
    .line 2451
    move-result-object v4

    .line 2452
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2453
    .line 2454
    .line 2455
    add-int/lit8 v5, v5, 0x1

    .line 2456
    .line 2457
    goto :goto_17

    .line 2458
    :cond_25
    const-string v1, "providers"

    .line 2459
    .line 2460
    invoke-virtual {v0, v2, v1}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2461
    .line 2462
    .line 2463
    new-instance v1, La/h6w0;

    .line 2464
    .line 2465
    iget-object v0, v0, La/n7w0;->a:Ljava/util/ArrayList;

    .line 2466
    .line 2467
    const-string v2, "Crypto"

    .line 2468
    .line 2469
    invoke-direct {v1, v2, v0}, La/h6w0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 2470
    .line 2471
    .line 2472
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2473
    .line 2474
    .line 2475
    new-instance v0, La/n7w0;

    .line 2476
    .line 2477
    invoke-direct {v0}, La/n7w0;-><init>()V

    .line 2478
    .line 2479
    .line 2480
    move-object/from16 v1, v19

    .line 2481
    .line 2482
    iget-object v1, v1, La/ln4;->a:La/us00;

    .line 2483
    .line 2484
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2485
    .line 2486
    .line 2487
    move-result-object v1

    .line 2488
    invoke-virtual {v1}, Landroid/content/pm/PackageManager;->getSystemSharedLibraryNames()[Ljava/lang/String;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v1

    .line 2492
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 2493
    .line 2494
    .line 2495
    move-result-object v1

    .line 2496
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2497
    .line 2498
    .line 2499
    const-string v2, "list"

    .line 2500
    .line 2501
    invoke-virtual {v0, v1, v2}, La/n7w0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2502
    .line 2503
    .line 2504
    new-instance v1, La/h6w0;

    .line 2505
    .line 2506
    iget-object v0, v0, La/n7w0;->a:Ljava/util/ArrayList;

    .line 2507
    .line 2508
    const-string v2, "SystemLibraries"

    .line 2509
    .line 2510
    invoke-direct {v1, v2, v0}, La/h6w0;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 2511
    .line 2512
    .line 2513
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2514
    .line 2515
    .line 2516
    new-instance v0, La/ejv0;

    .line 2517
    .line 2518
    const/16 v1, 0x1c

    .line 2519
    .line 2520
    invoke-direct {v0, v7, v1}, La/ejv0;-><init>(La/x7w0;B)V

    .line 2521
    .line 2522
    .line 2523
    const-string v1, "StackTrace"

    .line 2524
    .line 2525
    invoke-static {v1, v0}, La/x7w0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/h6w0;

    .line 2526
    .line 2527
    .line 2528
    move-result-object v0

    .line 2529
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2530
    .line 2531
    .line 2532
    return-object v9

    .line 2533
    :pswitch_0
    invoke-direct {v0}, La/jmv0;->l()Ljava/lang/Object;

    .line 2534
    .line 2535
    .line 2536
    move-result-object v0

    .line 2537
    return-object v0

    .line 2538
    :pswitch_1
    invoke-direct {v0}, La/jmv0;->i()Ljava/lang/Object;

    .line 2539
    .line 2540
    .line 2541
    move-result-object v0

    .line 2542
    return-object v0

    .line 2543
    :pswitch_2
    invoke-direct {v0}, La/jmv0;->h()Ljava/lang/Object;

    .line 2544
    .line 2545
    .line 2546
    move-result-object v0

    .line 2547
    return-object v0

    .line 2548
    :pswitch_3
    invoke-direct {v0}, La/jmv0;->g()Ljava/lang/Object;

    .line 2549
    .line 2550
    .line 2551
    move-result-object v0

    .line 2552
    return-object v0

    .line 2553
    :pswitch_4
    invoke-direct {v0}, La/jmv0;->c()Ljava/lang/Object;

    .line 2554
    .line 2555
    .line 2556
    move-result-object v0

    .line 2557
    return-object v0

    .line 2558
    :pswitch_5
    invoke-direct {v0}, La/jmv0;->b()Ljava/lang/Object;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v0

    .line 2562
    return-object v0

    .line 2563
    :pswitch_6
    invoke-direct {v0}, La/jmv0;->a()Ljava/lang/Object;

    .line 2564
    .line 2565
    .line 2566
    move-result-object v0

    .line 2567
    return-object v0

    .line 2568
    :pswitch_7
    check-cast v7, La/pzu;

    .line 2569
    .line 2570
    iget-object v0, v7, La/pzu;->f:Ljava/lang/Object;

    .line 2571
    .line 2572
    check-cast v0, La/mkt0;

    .line 2573
    .line 2574
    invoke-virtual {v0}, La/mkt0;->b()Z

    .line 2575
    .line 2576
    .line 2577
    move-result v0

    .line 2578
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2579
    .line 2580
    .line 2581
    move-result-object v0

    .line 2582
    return-object v0

    .line 2583
    :pswitch_8
    check-cast v7, La/fht0;

    .line 2584
    .line 2585
    invoke-virtual {v7}, La/fht0;->f()La/cvv0;

    .line 2586
    .line 2587
    .line 2588
    move-result-object v0

    .line 2589
    return-object v0

    .line 2590
    :pswitch_9
    check-cast v7, La/qwv0;

    .line 2591
    .line 2592
    iget-object v0, v7, La/qwv0;->a:La/ywv0;

    .line 2593
    .line 2594
    iget-object v1, v0, La/ywv0;->a:La/duv0;

    .line 2595
    .line 2596
    iget-object v1, v1, La/duv0;->g:La/pz40;

    .line 2597
    .line 2598
    check-cast v1, La/hgk0;

    .line 2599
    .line 2600
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 2601
    .line 2602
    .line 2603
    move-result-object v1

    .line 2604
    check-cast v1, La/pkk0;

    .line 2605
    .line 2606
    if-eqz v1, :cond_26

    .line 2607
    .line 2608
    check-cast v1, La/r3k;

    .line 2609
    .line 2610
    invoke-virtual {v1}, La/r3k;->a()V

    .line 2611
    .line 2612
    .line 2613
    :cond_26
    iget-object v0, v0, La/ywv0;->a:La/duv0;

    .line 2614
    .line 2615
    iget-object v0, v0, La/duv0;->h:La/pz40;

    .line 2616
    .line 2617
    check-cast v0, La/hgk0;

    .line 2618
    .line 2619
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 2620
    .line 2621
    .line 2622
    move-result-object v0

    .line 2623
    check-cast v0, La/wpq;

    .line 2624
    .line 2625
    if-eqz v0, :cond_27

    .line 2626
    .line 2627
    check-cast v0, La/ypq;

    .line 2628
    .line 2629
    const/4 v11, 0x1

    .line 2630
    invoke-virtual {v0, v11}, La/ypq;->b(Z)V

    .line 2631
    .line 2632
    .line 2633
    :cond_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2634
    .line 2635
    return-object v0

    .line 2636
    :pswitch_a
    check-cast v7, La/vkr0;

    .line 2637
    .line 2638
    iget-object v0, v7, La/vkr0;->c:Ljava/lang/Object;

    .line 2639
    .line 2640
    check-cast v0, La/mkt0;

    .line 2641
    .line 2642
    iget-object v0, v0, La/mkt0;->b:Ljava/lang/Object;

    .line 2643
    .line 2644
    check-cast v0, La/pz40;

    .line 2645
    .line 2646
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2647
    .line 2648
    check-cast v0, La/hgk0;

    .line 2649
    .line 2650
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 2651
    .line 2652
    .line 2653
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2654
    .line 2655
    return-object v0

    .line 2656
    :pswitch_b
    check-cast v7, La/etv0;

    .line 2657
    .line 2658
    iget-object v0, v7, La/etv0;->q:La/ywv0;

    .line 2659
    .line 2660
    iget-object v0, v0, La/ywv0;->g:La/fuj0;

    .line 2661
    .line 2662
    iget-object v0, v0, La/fuj0;->b:Ljava/lang/Object;

    .line 2663
    .line 2664
    check-cast v0, La/l7m0;

    .line 2665
    .line 2666
    check-cast v0, La/hgk0;

    .line 2667
    .line 2668
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 2669
    .line 2670
    .line 2671
    move-result-object v0

    .line 2672
    check-cast v0, La/zvv0;

    .line 2673
    .line 2674
    iget-object v1, v7, La/etv0;->p:La/xcz;

    .line 2675
    .line 2676
    if-nez v1, :cond_28

    .line 2677
    .line 2678
    new-instance v1, La/cwv0;

    .line 2679
    .line 2680
    iget-object v2, v0, La/zvv0;->d:La/nsv0;

    .line 2681
    .line 2682
    iget v2, v2, La/nsv0;->a:I

    .line 2683
    .line 2684
    iget-object v3, v7, La/etv0;->o:La/xcz;

    .line 2685
    .line 2686
    iget-object v3, v3, La/xcz;->j:La/ywj;

    .line 2687
    .line 2688
    invoke-virtual {v3}, La/ywj;->a()Z

    .line 2689
    .line 2690
    .line 2691
    move-result v3

    .line 2692
    iget-object v4, v7, La/etv0;->o:La/xcz;

    .line 2693
    .line 2694
    invoke-virtual {v4}, La/xcz;->d()Z

    .line 2695
    .line 2696
    .line 2697
    move-result v4

    .line 2698
    iget-object v5, v7, La/etv0;->o:La/xcz;

    .line 2699
    .line 2700
    invoke-virtual {v5}, La/xcz;->c()Z

    .line 2701
    .line 2702
    .line 2703
    move-result v5

    .line 2704
    invoke-direct {v1, v2, v3, v4, v5}, La/cwv0;-><init>(IZZZ)V

    .line 2705
    .line 2706
    .line 2707
    goto :goto_18

    .line 2708
    :cond_28
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 2709
    .line 2710
    .line 2711
    move-result-object v2

    .line 2712
    invoke-virtual {v1}, La/xcz;->d()Z

    .line 2713
    .line 2714
    .line 2715
    sget-object v3, La/os00;->a:La/zfn;

    .line 2716
    .line 2717
    invoke-static {v7, v3}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2718
    .line 2719
    .line 2720
    move-result-object v3

    .line 2721
    check-cast v3, La/bvv0;

    .line 2722
    .line 2723
    if-eqz v3, :cond_29

    .line 2724
    .line 2725
    invoke-virtual {v2}, La/mcz;->h()J

    .line 2726
    .line 2727
    .line 2728
    iget-object v3, v2, La/mcz;->l:Ljava/util/List;

    .line 2729
    .line 2730
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 2731
    .line 2732
    .line 2733
    move-result-object v3

    .line 2734
    check-cast v3, La/ncz;

    .line 2735
    .line 2736
    :cond_29
    new-instance v3, La/bwv0;

    .line 2737
    .line 2738
    iget-object v4, v1, La/xcz;->j:La/ywj;

    .line 2739
    .line 2740
    invoke-virtual {v4}, La/ywj;->a()Z

    .line 2741
    .line 2742
    .line 2743
    move-result v4

    .line 2744
    invoke-virtual {v1}, La/xcz;->d()Z

    .line 2745
    .line 2746
    .line 2747
    move-result v5

    .line 2748
    invoke-virtual {v1}, La/xcz;->c()Z

    .line 2749
    .line 2750
    .line 2751
    move-result v1

    .line 2752
    invoke-direct {v3, v2, v4, v5, v1}, La/bwv0;-><init>(La/mcz;ZZZ)V

    .line 2753
    .line 2754
    .line 2755
    move-object v1, v3

    .line 2756
    :goto_18
    new-instance v2, La/awv0;

    .line 2757
    .line 2758
    iget-boolean v3, v7, La/etv0;->r:Z

    .line 2759
    .line 2760
    if-nez v3, :cond_2a

    .line 2761
    .line 2762
    :goto_19
    const/4 v5, 0x1

    .line 2763
    goto :goto_1a

    .line 2764
    :cond_2a
    iget-object v3, v7, La/etv0;->q:La/ywv0;

    .line 2765
    .line 2766
    iget-object v3, v3, La/ywv0;->j:La/ruv0;

    .line 2767
    .line 2768
    invoke-virtual {v3}, La/ruv0;->g()Z

    .line 2769
    .line 2770
    .line 2771
    move-result v3

    .line 2772
    if-nez v3, :cond_2b

    .line 2773
    .line 2774
    iget-object v3, v7, La/etv0;->q:La/ywv0;

    .line 2775
    .line 2776
    iget-object v3, v3, La/ywv0;->f:La/mkt0;

    .line 2777
    .line 2778
    invoke-virtual {v3}, La/mkt0;->b()Z

    .line 2779
    .line 2780
    .line 2781
    move-result v3

    .line 2782
    if-nez v3, :cond_2b

    .line 2783
    .line 2784
    goto :goto_19

    .line 2785
    :cond_2b
    const/4 v5, 0x0

    .line 2786
    :goto_1a
    invoke-direct {v2, v1, v0, v5}, La/awv0;-><init>(La/dwv0;La/zvv0;Z)V

    .line 2787
    .line 2788
    .line 2789
    return-object v2

    .line 2790
    :pswitch_c
    check-cast v7, La/hsv0;

    .line 2791
    .line 2792
    iget-object v0, v7, La/hsv0;->c:La/u950;

    .line 2793
    .line 2794
    if-nez v0, :cond_2c

    .line 2795
    .line 2796
    goto :goto_1b

    .line 2797
    :cond_2c
    iget-object v1, v0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2798
    .line 2799
    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 2800
    .line 2801
    .line 2802
    move-result v1

    .line 2803
    const/4 v11, 0x1

    .line 2804
    if-le v1, v11, :cond_2d

    .line 2805
    .line 2806
    invoke-static {v0}, La/q3d;->i(Ljava/util/List;)I

    .line 2807
    .line 2808
    .line 2809
    move-result v1

    .line 2810
    invoke-virtual {v0, v1}, La/u950;->remove(I)Ljava/lang/Object;

    .line 2811
    .line 2812
    .line 2813
    move-result-object v0

    .line 2814
    check-cast v0, La/rb50;

    .line 2815
    .line 2816
    invoke-virtual {v7, v0}, La/hsv0;->b(La/rb50;)V

    .line 2817
    .line 2818
    .line 2819
    :cond_2d
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2820
    .line 2821
    return-object v0

    .line 2822
    :pswitch_d
    check-cast v7, Landroidx/work/Worker;

    .line 2823
    .line 2824
    invoke-virtual {v7}, Landroidx/work/Worker;->c()La/mg00;

    .line 2825
    .line 2826
    .line 2827
    move-result-object v0

    .line 2828
    return-object v0

    .line 2829
    :pswitch_e
    check-cast v7, La/cpv0;

    .line 2830
    .line 2831
    iget-object v0, v7, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 2832
    .line 2833
    iget-object v1, v7, La/cpv0;->a:Landroid/content/Context;

    .line 2834
    .line 2835
    sget-object v2, La/x9o0;->e:Ljava/lang/String;

    .line 2836
    .line 2837
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2838
    .line 2839
    const/16 v3, 0x22

    .line 2840
    .line 2841
    if-lt v2, v3, :cond_2e

    .line 2842
    .line 2843
    invoke-static {v1}, La/fby;->b(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 2844
    .line 2845
    .line 2846
    move-result-object v2

    .line 2847
    invoke-virtual {v2}, Landroid/app/job/JobScheduler;->cancelAll()V

    .line 2848
    .line 2849
    .line 2850
    :cond_2e
    const-string v2, "jobscheduler"

    .line 2851
    .line 2852
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 2853
    .line 2854
    .line 2855
    move-result-object v2

    .line 2856
    check-cast v2, Landroid/app/job/JobScheduler;

    .line 2857
    .line 2858
    invoke-static {v1, v2}, La/x9o0;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v1

    .line 2862
    if-eqz v1, :cond_2f

    .line 2863
    .line 2864
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2865
    .line 2866
    .line 2867
    move-result v3

    .line 2868
    if-nez v3, :cond_2f

    .line 2869
    .line 2870
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2871
    .line 2872
    .line 2873
    move-result-object v1

    .line 2874
    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2875
    .line 2876
    .line 2877
    move-result v3

    .line 2878
    if-eqz v3, :cond_2f

    .line 2879
    .line 2880
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2881
    .line 2882
    .line 2883
    move-result-object v3

    .line 2884
    check-cast v3, Landroid/app/job/JobInfo;

    .line 2885
    .line 2886
    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getId()I

    .line 2887
    .line 2888
    .line 2889
    move-result v3

    .line 2890
    invoke-static {v2, v3}, La/x9o0;->a(Landroid/app/job/JobScheduler;I)V

    .line 2891
    .line 2892
    .line 2893
    goto :goto_1c

    .line 2894
    :cond_2f
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 2895
    .line 2896
    .line 2897
    move-result-object v1

    .line 2898
    iget-object v1, v1, La/upv0;->a:La/aeg0;

    .line 2899
    .line 2900
    new-instance v2, La/ejv0;

    .line 2901
    .line 2902
    const/16 v5, 0xc

    .line 2903
    .line 2904
    invoke-direct {v2, v5}, La/ejv0;-><init>(B)V

    .line 2905
    .line 2906
    .line 2907
    const/4 v6, 0x0

    .line 2908
    const/4 v11, 0x1

    .line 2909
    invoke-static {v1, v6, v11, v2}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 2910
    .line 2911
    .line 2912
    move-result-object v1

    .line 2913
    check-cast v1, Ljava/lang/Number;

    .line 2914
    .line 2915
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2916
    .line 2917
    .line 2918
    iget-object v1, v7, La/cpv0;->b:La/wsd;

    .line 2919
    .line 2920
    iget-object v2, v7, La/cpv0;->e:Ljava/util/List;

    .line 2921
    .line 2922
    invoke-static {v1, v0, v2}, La/m2h0;->b(La/wsd;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 2923
    .line 2924
    .line 2925
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2926
    .line 2927
    return-object v0

    .line 2928
    :pswitch_f
    check-cast v7, La/qov0;

    .line 2929
    .line 2930
    invoke-static {v7}, La/xyn;->a(La/qov0;)V

    .line 2931
    .line 2932
    .line 2933
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2934
    .line 2935
    return-object v0

    .line 2936
    :pswitch_10
    check-cast v7, La/hnv0;

    .line 2937
    .line 2938
    sget-object v0, La/hnv0;->Q1:La/kys0;

    .line 2939
    .line 2940
    iget-object v0, v7, La/hnv0;->N1:La/fiu0;

    .line 2941
    .line 2942
    if-eqz v0, :cond_30

    .line 2943
    .line 2944
    return-object v0

    .line 2945
    :cond_30
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2946
    .line 2947
    .line 2948
    const/16 v17, 0x0

    .line 2949
    .line 2950
    throw v17

    .line 2951
    :pswitch_11
    const/16 v17, 0x0

    .line 2952
    .line 2953
    check-cast v7, La/lmv0;

    .line 2954
    .line 2955
    sget-object v0, La/lmv0;->P1:La/wxs0;

    .line 2956
    .line 2957
    iget-object v0, v7, La/lmv0;->M1:La/fiu0;

    .line 2958
    .line 2959
    if-eqz v0, :cond_31

    .line 2960
    .line 2961
    return-object v0

    .line 2962
    :cond_31
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2963
    .line 2964
    .line 2965
    throw v17

    .line 2966
    nop

    .line 2967
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
