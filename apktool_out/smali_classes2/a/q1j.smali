.class public final La/q1j;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006\u00b2\u0006\u000c\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/q1j;",
        "La/iw5;",
        "<init>",
        "()V",
        "",
        "lastPage",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic n2:I


# instance fields
.field public k2:La/wdk0;

.field public l2:La/fiu0;

.field public final m2:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/u1j;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/o1j;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, La/o1j;-><init>(La/q1j;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/q1j;->m2:La/a8z;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 19

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const v0, 0x9ed97fd

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, La/q1j;->P0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v10, La/ukd;->a:La/cl5;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    if-ne v1, v10, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v6, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    new-instance v0, La/y6h;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x6

    .line 36
    const/4 v1, 0x1

    .line 37
    const-class v3, La/q1j;

    .line 38
    .line 39
    const-string v4, "handleSideEffect"

    .line 40
    .line 41
    const-string v5, "handleSideEffect(Lorg/xplatform/aggregator/daily_tasks/impl/presentation/onboarding/models/DailyTaskOnboardingSideEffect;)V"

    .line 42
    .line 43
    invoke-direct/range {v0 .. v7}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    move-object v6, v2

    .line 47
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v1, v0

    .line 51
    :goto_1
    check-cast v1, La/jhy;

    .line 52
    .line 53
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    sget-object v0, La/lkz;->a:La/lkz;

    .line 56
    .line 57
    invoke-static {v1, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v8, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    or-int/2addr v1, v2

    .line 70
    const/4 v2, 0x3

    .line 71
    invoke-virtual {v8, v2}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    or-int/2addr v1, v2

    .line 76
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    or-int/2addr v1, v2

    .line 81
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/4 v3, 0x0

    .line 86
    if-nez v1, :cond_2

    .line 87
    .line 88
    if-ne v2, v10, :cond_3

    .line 89
    .line 90
    :cond_2
    new-instance v2, La/g6g;

    .line 91
    .line 92
    invoke-direct {v2, v9, v6, v0, v3}, La/g6g;-><init>(La/k3t0;La/q1j;La/pz40;La/yje;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 99
    .line 100
    invoke-static {v8, v6, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6}, La/q1j;->P0()La/k3t0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, La/i3t0;

    .line 108
    .line 109
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/e2j;

    .line 118
    .line 119
    iget-object v0, v0, La/e2j;->a:La/omm;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-nez v0, :cond_4

    .line 133
    .line 134
    if-ne v1, v10, :cond_5

    .line 135
    .line 136
    :cond_4
    new-instance v1, La/xx;

    .line 137
    .line 138
    const/16 v0, 0x1d

    .line 139
    .line 140
    invoke-direct {v1, v7, v0}, La/xx;-><init>(La/pz40;B)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 147
    .line 148
    const/4 v9, 0x0

    .line 149
    const/4 v0, 0x2

    .line 150
    invoke-static {v9, v1, v8, v9, v0}, La/zk80;->b(ILkotlin/jvm/functions/Function0;La/fet;II)La/kwj;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    invoke-virtual {v11}, La/xk80;->k()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v11}, La/kwj;->n()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    invoke-virtual {v8, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    or-int/2addr v4, v5

    .line 179
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    if-nez v4, :cond_6

    .line 184
    .line 185
    if-ne v5, v10, :cond_7

    .line 186
    .line 187
    :cond_6
    new-instance v5, La/e9g;

    .line 188
    .line 189
    const/16 v4, 0xb

    .line 190
    .line 191
    invoke-direct {v5, v6, v11, v3, v4}, La/e9g;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v8, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 198
    .line 199
    invoke-static {v1, v2, v5, v8}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    const/4 v12, 0x1

    .line 211
    if-nez v1, :cond_8

    .line 212
    .line 213
    if-ne v2, v10, :cond_9

    .line 214
    .line 215
    :cond_8
    new-instance v2, La/o1j;

    .line 216
    .line 217
    invoke-direct {v2, v6, v12}, La/o1j;-><init>(La/q1j;B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 224
    .line 225
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    if-nez v1, :cond_a

    .line 234
    .line 235
    if-ne v3, v10, :cond_b

    .line 236
    .line 237
    :cond_a
    new-instance v3, La/o1j;

    .line 238
    .line 239
    invoke-direct {v3, v6, v0}, La/o1j;-><init>(La/q1j;B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    :cond_b
    move-object v1, v3

    .line 246
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 247
    .line 248
    const/4 v4, 0x0

    .line 249
    const/4 v5, 0x4

    .line 250
    move-object v0, v2

    .line 251
    const/4 v2, 0x0

    .line 252
    move-object v3, v8

    .line 253
    invoke-static/range {v0 .. v5}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-ne v0, v10, :cond_c

    .line 261
    .line 262
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 263
    .line 264
    invoke-static {v0, v8}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    :cond_c
    move-object v3, v0

    .line 272
    check-cast v3, La/vne;

    .line 273
    .line 274
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    if-ne v0, v10, :cond_d

    .line 279
    .line 280
    new-instance v0, La/vef;

    .line 281
    .line 282
    const/16 v1, 0x11

    .line 283
    .line 284
    invoke-direct {v0, v11, v7, v1}, La/vef;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 285
    .line 286
    .line 287
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    :cond_d
    move-object v5, v0

    .line 295
    check-cast v5, La/l7m0;

    .line 296
    .line 297
    new-instance v13, La/bw5;

    .line 298
    .line 299
    invoke-static {v12, v8}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 300
    .line 301
    .line 302
    move-result-object v14

    .line 303
    new-instance v0, La/hgs0;

    .line 304
    .line 305
    const/4 v6, 0x4

    .line 306
    move-object/from16 v4, p0

    .line 307
    .line 308
    move-object v1, v7

    .line 309
    move-object v2, v11

    .line 310
    invoke-direct/range {v0 .. v6}, La/hgs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 311
    .line 312
    .line 313
    const v1, -0x1bfe2ad4

    .line 314
    .line 315
    .line 316
    invoke-static {v1, v0, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 317
    .line 318
    .line 319
    move-result-object v17

    .line 320
    const/16 v18, 0xe

    .line 321
    .line 322
    const/4 v15, 0x0

    .line 323
    const/16 v16, 0x0

    .line 324
    .line 325
    invoke-direct/range {v13 .. v18}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v8, v9}, La/fet;->r(Z)V

    .line 329
    .line 330
    .line 331
    return-object v13
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/q1j;->m2:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/v4j;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/v4j;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/v4j;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    iget-object v3, v1, La/v4j;->a:La/cad;

    .line 59
    .line 60
    iget-object v4, v1, La/v4j;->c:La/knf0;

    .line 61
    .line 62
    iget-object v5, v1, La/v4j;->d:La/duj;

    .line 63
    .line 64
    iget-object v6, v1, La/v4j;->e:La/ctf0;

    .line 65
    .line 66
    iget-object v7, v1, La/v4j;->f:La/q7d0;

    .line 67
    .line 68
    iget-object v8, v1, La/v4j;->g:La/gii0;

    .line 69
    .line 70
    iget-object v9, v1, La/v4j;->h:La/btt0;

    .line 71
    .line 72
    iget-object v10, v1, La/v4j;->i:La/o0j;

    .line 73
    .line 74
    iget-object v11, v1, La/v4j;->j:La/wdk0;

    .line 75
    .line 76
    iget-object v12, v1, La/v4j;->b:La/b4j;

    .line 77
    .line 78
    iget-object v13, v1, La/v4j;->k:La/je;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    new-instance v2, La/o3c;

    .line 102
    .line 103
    invoke-direct/range {v2 .. v13}, La/o3c;-><init>(La/cad;La/knf0;La/duj;La/ctf0;La/q7d0;La/gii0;La/btt0;La/o0j;La/wdk0;La/b4j;La/je;)V

    .line 104
    .line 105
    .line 106
    iput-object v11, p0, La/q1j;->k2:La/wdk0;

    .line 107
    .line 108
    new-instance p1, La/fiu0;

    .line 109
    .line 110
    iget-object v0, v2, La/o3c;->k:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, La/yei;

    .line 113
    .line 114
    const-class v1, La/u1j;

    .line 115
    .line 116
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 121
    .line 122
    .line 123
    iput-object p1, p0, La/q1j;->l2:La/fiu0;

    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 127
    .line 128
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x3

    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 18
    .line 19
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/q1j;->P0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object p1, La/g1j;->a:La/g1j;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
