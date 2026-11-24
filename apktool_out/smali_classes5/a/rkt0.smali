.class public final La/rkt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/h5v0;
.implements La/fz5;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements La/zuw0;
.implements La/jix0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/b3c0;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/rkt0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, La/rkt0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;)V
    .locals 2

    const/4 v0, 0x6

    iput-byte v0, p0, La/rkt0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, La/lkr0;

    const/16 v1, 0x12

    invoke-direct {v0, p1, v1}, La/lkr0;-><init>(La/gii0;B)V

    iput-object v0, p0, La/rkt0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/us00;)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    iput-byte v0, p0, La/rkt0;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v0, "sensor"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p1, Landroid/hardware/SensorManager;

    .line 18
    .line 19
    iput-object p1, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 22
    iput-byte p2, p0, La/rkt0;->a:B

    iput-object p1, p0, La/rkt0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h(I)La/rkt0;
    .locals 2

    .line 1
    new-instance v0, La/rkt0;

    .line 2
    .line 3
    invoke-static {p0}, La/s7x0;->a(I)[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, La/icw0;->a([B)La/icw0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/16 v1, 0xb

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static i(Ljava/lang/String;)La/rkt0;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, La/xyw0;->e(C)La/tyw0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    sget-object p0, La/tyw0;->b:La/tyw0;

    .line 26
    .line 27
    :goto_1
    new-instance v0, La/rkt0;

    .line 28
    .line 29
    const/16 v1, 0xc

    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method


# virtual methods
.method public a(ILa/a9w0;)Ljava/lang/Object;
    .locals 9

    .line 1
    new-instance v0, La/n5a;

    .line 2
    .line 3
    invoke-static {p2}, La/pnx;->b(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, La/n5a;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La/n5a;->r()V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p2, Landroid/hardware/SensorManager;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 25
    .line 26
    sget-object p0, La/u8w0;->Companion:La/s8w0;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v1, La/u8w0;

    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    new-array v8, p0, [F

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const-string v2, ""

    .line 39
    .line 40
    const-string v3, ""

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-direct/range {v1 .. v8}, La/u8w0;-><init>(Ljava/lang/String;Ljava/lang/String;IFFF[F)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v1, La/o4w0;

    .line 52
    .line 53
    invoke-direct {v1, p0, v0, p1}, La/o4w0;-><init>(La/rkt0;La/n5a;Landroid/hardware/Sensor;)V

    .line 54
    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    invoke-virtual {p2, v1, p1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 58
    .line 59
    .line 60
    new-instance p1, La/xlr0;

    .line 61
    .line 62
    const/16 p2, 0xd

    .line 63
    .line 64
    invoke-direct {p1, p0, v1, p2}, La/xlr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1}, La/n5a;->t(Lkotlin/jvm/functions/Function1;)V

    .line 68
    .line 69
    .line 70
    :goto_0
    invoke-virtual {v0}, La/n5a;->p()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object p1, La/wne;->a:La/wne;

    .line 75
    .line 76
    return-object p0
.end method

.method public b(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/rav;

    .line 4
    .line 5
    invoke-interface {p0, p1}, La/rav;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic c(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    .line 1
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, La/m6x0;

    .line 5
    .line 6
    move-object v1, p1

    .line 7
    move v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move-object v5, p5

    .line 11
    invoke-virtual/range {v0 .. v5}, La/m6x0;->y(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public createWebView(Landroid/webkit/WebView;)Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;
    .locals 0

    .line 1
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->createWebView(Landroid/webkit/WebView;)Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class p1, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 10
    .line 11
    invoke-static {p1, p0}, La/rq8;->G(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public d(La/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, La/a9w0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/a9w0;

    .line 11
    .line 12
    iget v3, v2, La/a9w0;->m:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/a9w0;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/a9w0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/a9w0;-><init>(La/rkt0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/a9w0;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/a9w0;->m:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v7, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget-object v0, v2, La/a9w0;->j:La/u8w0;

    .line 47
    .line 48
    iget-object v2, v2, La/a9w0;->i:La/u8w0;

    .line 49
    .line 50
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object v10, v0

    .line 54
    move-object v9, v2

    .line 55
    goto :goto_4

    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    return-object v0

    .line 63
    :cond_2
    iget-object v4, v2, La/a9w0;->i:La/u8w0;

    .line 64
    .line 65
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iput v7, v2, La/a9w0;->m:I

    .line 77
    .line 78
    invoke-virtual {v0, v7, v2}, La/rkt0;->a(ILa/a9w0;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-ne v1, v3, :cond_5

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    :goto_1
    check-cast v1, La/u8w0;

    .line 86
    .line 87
    iput-object v1, v2, La/a9w0;->i:La/u8w0;

    .line 88
    .line 89
    iput v6, v2, La/a9w0;->m:I

    .line 90
    .line 91
    const/4 v4, 0x4

    .line 92
    invoke-virtual {v0, v4, v2}, La/rkt0;->a(ILa/a9w0;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-ne v4, v3, :cond_6

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_6
    move-object/from16 v16, v4

    .line 100
    .line 101
    move-object v4, v1

    .line 102
    move-object/from16 v1, v16

    .line 103
    .line 104
    :goto_2
    check-cast v1, La/u8w0;

    .line 105
    .line 106
    iput-object v4, v2, La/a9w0;->i:La/u8w0;

    .line 107
    .line 108
    iput-object v1, v2, La/a9w0;->j:La/u8w0;

    .line 109
    .line 110
    iput v5, v2, La/a9w0;->m:I

    .line 111
    .line 112
    invoke-virtual {v0, v6, v2}, La/rkt0;->a(ILa/a9w0;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-ne v0, v3, :cond_7

    .line 117
    .line 118
    :goto_3
    return-object v3

    .line 119
    :cond_7
    move-object v10, v1

    .line 120
    move-object v9, v4

    .line 121
    move-object v1, v0

    .line 122
    :goto_4
    move-object v11, v1

    .line 123
    check-cast v11, La/u8w0;

    .line 124
    .line 125
    iget-object v0, v9, La/u8w0;->g:[F

    .line 126
    .line 127
    iget-object v1, v11, La/u8w0;->g:[F

    .line 128
    .line 129
    array-length v2, v0

    .line 130
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 131
    .line 132
    const/4 v4, 0x0

    .line 133
    if-eq v2, v5, :cond_8

    .line 134
    .line 135
    new-array v0, v5, [F

    .line 136
    .line 137
    aput v3, v0, v4

    .line 138
    .line 139
    aput v3, v0, v7

    .line 140
    .line 141
    aput v3, v0, v6

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_8
    array-length v2, v1

    .line 145
    if-ne v2, v5, :cond_9

    .line 146
    .line 147
    const/16 v2, 0x9

    .line 148
    .line 149
    new-array v8, v2, [F

    .line 150
    .line 151
    new-array v2, v2, [F

    .line 152
    .line 153
    invoke-static {v8, v2, v0, v1}, Landroid/hardware/SensorManager;->getRotationMatrix([F[F[F[F)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_9

    .line 158
    .line 159
    new-array v0, v5, [F

    .line 160
    .line 161
    invoke-static {v8, v0}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    .line 162
    .line 163
    .line 164
    aget v1, v0, v4

    .line 165
    .line 166
    float-to-double v1, v1

    .line 167
    invoke-static {v1, v2}, Ljava/lang/Math;->toDegrees(D)D

    .line 168
    .line 169
    .line 170
    move-result-wide v1

    .line 171
    double-to-float v1, v1

    .line 172
    aget v2, v0, v7

    .line 173
    .line 174
    float-to-double v2, v2

    .line 175
    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    .line 176
    .line 177
    .line 178
    move-result-wide v2

    .line 179
    double-to-float v2, v2

    .line 180
    aget v0, v0, v6

    .line 181
    .line 182
    float-to-double v12, v0

    .line 183
    invoke-static {v12, v13}, Ljava/lang/Math;->toDegrees(D)D

    .line 184
    .line 185
    .line 186
    move-result-wide v12

    .line 187
    double-to-float v0, v12

    .line 188
    new-array v3, v5, [F

    .line 189
    .line 190
    aput v1, v3, v4

    .line 191
    .line 192
    aput v2, v3, v7

    .line 193
    .line 194
    aput v0, v3, v6

    .line 195
    .line 196
    move-object v0, v3

    .line 197
    goto :goto_5

    .line 198
    :cond_9
    aget v1, v0, v4

    .line 199
    .line 200
    aget v2, v0, v7

    .line 201
    .line 202
    aget v0, v0, v6

    .line 203
    .line 204
    float-to-double v12, v2

    .line 205
    float-to-double v14, v0

    .line 206
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->atan2(DD)D

    .line 207
    .line 208
    .line 209
    move-result-wide v12

    .line 210
    invoke-static {v12, v13}, Ljava/lang/Math;->toDegrees(D)D

    .line 211
    .line 212
    .line 213
    move-result-wide v12

    .line 214
    double-to-float v8, v12

    .line 215
    float-to-double v12, v1

    .line 216
    neg-double v12, v12

    .line 217
    mul-float/2addr v2, v2

    .line 218
    mul-float/2addr v0, v0

    .line 219
    add-float/2addr v0, v2

    .line 220
    float-to-double v0, v0

    .line 221
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 222
    .line 223
    .line 224
    move-result-wide v0

    .line 225
    invoke-static {v12, v13, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 226
    .line 227
    .line 228
    move-result-wide v0

    .line 229
    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    .line 230
    .line 231
    .line 232
    move-result-wide v0

    .line 233
    double-to-float v0, v0

    .line 234
    new-array v1, v5, [F

    .line 235
    .line 236
    aput v3, v1, v4

    .line 237
    .line 238
    aput v0, v1, v7

    .line 239
    .line 240
    aput v8, v1, v6

    .line 241
    .line 242
    move-object v0, v1

    .line 243
    :goto_5
    new-instance v8, La/y8w0;

    .line 244
    .line 245
    aget v12, v0, v4

    .line 246
    .line 247
    aget v13, v0, v7

    .line 248
    .line 249
    aget v14, v0, v6

    .line 250
    .line 251
    invoke-direct/range {v8 .. v14}, La/y8w0;-><init>(La/u8w0;La/u8w0;La/u8w0;FFF)V

    .line 252
    .line 253
    .line 254
    return-object v8
.end method

.method public e(La/wt20;La/mt00;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-wide v1, p1, La/wt20;->a:J

    .line 4
    .line 5
    iget-boolean v3, p1, La/wt20;->d:Z

    .line 6
    .line 7
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/q430;

    .line 10
    .line 11
    iget-object p0, p0, La/q430;->a:La/eio;

    .line 12
    .line 13
    iget p1, p1, La/wt20;->c:I

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    if-nez p1, :cond_3

    .line 19
    .line 20
    if-nez v3, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, La/eio;->a()La/tt20;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p0, p0, La/tt20;->a:La/zdg0;

    .line 27
    .line 28
    new-instance p1, La/hu6;

    .line 29
    .line 30
    const/4 v3, 0x7

    .line 31
    invoke-direct {p1, v1, v2, v4, v3}, La/hu6;-><init>(JLa/yje;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p2, p0, p1, v6, v5}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-ne p0, v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    :goto_0
    if-ne p0, v0, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    :goto_1
    if-ne p0, v0, :cond_2

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_3
    new-instance v7, La/ut20;

    .line 55
    .line 56
    invoke-direct {v7, p1, v1, v2, v3}, La/ut20;-><init>(IJZ)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/eio;->a()La/tt20;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-object p1, p0, La/tt20;->a:La/zdg0;

    .line 64
    .line 65
    new-instance v1, La/v620;

    .line 66
    .line 67
    const/16 v2, 0x1c

    .line 68
    .line 69
    invoke-direct {v1, p0, v7, v4, v2}, La/v620;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p2, p1, v1, v6, v5}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-ne p0, v0, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_2
    if-ne p0, v0, :cond_5

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    :goto_3
    if-ne p0, v0, :cond_6

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    :goto_4
    if-ne p0, v0, :cond_7

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0
.end method

.method public f(La/smi0;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/pmi0;

    .line 4
    .line 5
    iget-object p0, p0, La/pmi0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/lmi0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/lmi0;->a()La/qz40;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, La/p7m0;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, La/lmi0;->b:La/vwb0;

    .line 26
    .line 27
    iget-object p0, p0, La/lmi0;->a:La/vby;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v1, La/smi0;->Companion:La/rmi0;

    .line 33
    .line 34
    invoke-virtual {v1}, La/rmi0;->serializer()La/jiy;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/jiy;

    .line 39
    .line 40
    invoke-virtual {p0, v1, p1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, "SAVED_TIMER_STATUS_KEY"

    .line 45
    .line 46
    invoke-virtual {v0, p1, p0}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public g(Z)V
    .locals 8

    .line 1
    iget-byte v0, p0, La/rkt0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, La/b3c0;

    .line 10
    .line 11
    iget-object p0, p0, La/b3c0;->b:La/x2c0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/x2c0;->a()La/m2c0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const v6, -0x200001

    .line 21
    .line 22
    .line 23
    const/16 v7, 0xff

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x0

    .line 27
    move v5, p1

    .line 28
    invoke-static/range {v2 .. v7}, La/m2c0;->a(La/m2c0;La/y0b;IZII)La/m2c0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p0, p0, La/x2c0;->a:La/p7m0;

    .line 33
    .line 34
    invoke-virtual {p0, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :pswitch_0
    move v5, p1

    .line 39
    check-cast p0, La/cad;

    .line 40
    .line 41
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, La/bad;

    .line 44
    .line 45
    iget-object p0, p0, La/bad;->a:La/p7m0;

    .line 46
    .line 47
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getStatics()Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;
    .locals 1

    .line 1
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getStatics()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p0}, La/rq8;->G(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/StaticsBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;
    .locals 1

    .line 1
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getWebkitToCompatConverter()Ljava/lang/reflect/InvocationHandler;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-class v0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 10
    .line 11
    invoke-static {v0, p0}, La/rq8;->G(Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 16
    .line 17
    return-object p0
.end method

.method public k()[Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;

    .line 4
    .line 5
    invoke-interface {p0}, Lorg/chromium/support_lib_boundary/WebViewProviderFactoryBoundaryInterface;->getSupportedFeatures()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n0x0;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, La/l2;->cancel(Z)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, La/l2;->m(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, p1}, La/l2;->n(Ljava/lang/Throwable;)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    invoke-static {}, La/v4i0;->e()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public zza(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, La/rkt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/lix0;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p0, p1, v0}, La/lix0;->b(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
