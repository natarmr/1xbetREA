.class public final La/z1a0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/odf0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/z1a0;",
        "La/yx5;",
        "La/odf0;",
        "<init>",
        "()V",
        "a/fl70",
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
.field public static final U1:La/fl70;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:Z

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public N1:La/ii;

.field public O1:La/xi70;

.field public P1:La/zx10;

.field public Q1:La/h430;

.field public final R1:La/khf0;

.field public final S1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/z1a0;

    .line 4
    .line 5
    const-string v2, "screenParams"

    .line 6
    .line 7
    const-string v3, "getScreenParams()Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/z1a0;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/fl70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/z1a0;->U1:La/fl70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0285

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/z1a0;->K1:Z

    .line 9
    .line 10
    new-instance v0, La/khf0;

    .line 11
    .line 12
    const-string v1, "PLAYER_DUEL_FRAGMENT_PARAMS_KEY"

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/z1a0;->R1:La/khf0;

    .line 18
    .line 19
    const-class v0, La/b3a0;

    .line 20
    .line 21
    sget-object v1, La/sre0;->a:La/tre0;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, La/y1a0;

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    invoke-direct {v1, p0, v2}, La/y1a0;-><init>(La/z1a0;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/z1a0;->S1:La/a8z;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/y1a0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p1, p0, v0}, La/y1a0;-><init>(La/z1a0;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, La/y1a0;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p1, p0, v0}, La/y1a0;-><init>(La/z1a0;B)V

    .line 14
    .line 15
    .line 16
    const-string v1, "PLAYERS_DUEL_UNAVAILABLE_REQUEST_KEY"

    .line 17
    .line 18
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Landroidx/compose/ui/platform/ComposeView;

    .line 26
    .line 27
    new-instance v1, La/owp0;

    .line 28
    .line 29
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 30
    .line 31
    .line 32
    new-instance v2, La/cz90;

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    invoke-direct {v2, p0, v3}, La/cz90;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/ugd;

    .line 39
    .line 40
    const v3, 0x514b5c44

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final C0()V
    .locals 13

    .line 1
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    const-string v2, "Can\'t find feature provider!"

    .line 10
    .line 11
    if-eqz v1, :cond_f

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/fragment/app/e;->P()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/lit8 v3, v3, -0x1

    .line 18
    .line 19
    :goto_1
    const/4 v4, 0x0

    .line 20
    if-ltz v3, :cond_d

    .line 21
    .line 22
    invoke-virtual {v1, v3}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    iget-object v5, v5, La/zb5;->i:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v5}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    instance-of v6, v5, La/ka9;

    .line 33
    .line 34
    if-eqz v6, :cond_c

    .line 35
    .line 36
    check-cast v5, La/ka9;

    .line 37
    .line 38
    invoke-virtual {v5}, La/ka9;->H0()La/ioi;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    :goto_2
    if-eqz v3, :cond_b

    .line 47
    .line 48
    invoke-virtual {v3}, Landroidx/fragment/app/e;->P()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    add-int/lit8 v5, v5, -0x1

    .line 53
    .line 54
    :goto_3
    if-ltz v5, :cond_9

    .line 55
    .line 56
    invoke-virtual {v3, v5}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget-object v6, v6, La/zb5;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v3, v6}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    instance-of v7, v6, La/ka9;

    .line 67
    .line 68
    if-eqz v7, :cond_8

    .line 69
    .line 70
    check-cast v6, La/ka9;

    .line 71
    .line 72
    invoke-virtual {v6}, La/ka9;->G0()La/hoi;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :goto_4
    if-eqz v3, :cond_7

    .line 80
    .line 81
    invoke-virtual {v3}, Landroidx/fragment/app/e;->P()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    add-int/lit8 v5, v5, -0x1

    .line 86
    .line 87
    :goto_5
    if-ltz v5, :cond_5

    .line 88
    .line 89
    invoke-virtual {v3, v5}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    iget-object v6, v6, La/zb5;->i:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v3, v6}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    instance-of v7, v6, La/ocl0;

    .line 100
    .line 101
    if-eqz v7, :cond_4

    .line 102
    .line 103
    check-cast v6, La/ocl0;

    .line 104
    .line 105
    new-instance v2, La/y1a0;

    .line 106
    .line 107
    const/4 v3, 0x2

    .line 108
    invoke-direct {v2, p0, v3}, La/y1a0;-><init>(La/z1a0;B)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v6, v2}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-virtual {v3}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    instance-of v5, v3, La/af3;

    .line 127
    .line 128
    if-eqz v5, :cond_0

    .line 129
    .line 130
    check-cast v3, La/af3;

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_0
    move-object v3, v4

    .line 134
    :goto_6
    const-class v5, La/x1a0;

    .line 135
    .line 136
    if-eqz v3, :cond_3

    .line 137
    .line 138
    invoke-interface {v3}, La/af3;->d()La/wcf0;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v3, v5}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, La/o5d0;

    .line 147
    .line 148
    if-eqz v3, :cond_1

    .line 149
    .line 150
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, La/ze3;

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_1
    move-object v3, v4

    .line 158
    :goto_7
    instance-of v6, v3, La/x1a0;

    .line 159
    .line 160
    if-nez v6, :cond_2

    .line 161
    .line 162
    goto :goto_8

    .line 163
    :cond_2
    move-object v4, v3

    .line 164
    :goto_8
    check-cast v4, La/x1a0;

    .line 165
    .line 166
    if-eqz v4, :cond_3

    .line 167
    .line 168
    sget-object v3, La/z1a0;->V1:[La/iiy;

    .line 169
    .line 170
    const/4 v5, 0x0

    .line 171
    aget-object v3, v3, v5

    .line 172
    .line 173
    iget-object v5, p0, La/z1a0;->R1:La/khf0;

    .line 174
    .line 175
    invoke-virtual {v5, p0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    check-cast v3, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

    .line 180
    .line 181
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    iget-object v0, v0, La/cb50;->a:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object v0, v4, La/x1a0;->a:La/cad;

    .line 194
    .line 195
    iget-object v2, v4, La/x1a0;->e:La/rmd0;

    .line 196
    .line 197
    iget-object v6, v4, La/x1a0;->f:La/iw20;

    .line 198
    .line 199
    iget-object v7, v4, La/x1a0;->g:La/zx10;

    .line 200
    .line 201
    iget-object v8, v4, La/x1a0;->b:La/ocl;

    .line 202
    .line 203
    iget-object v9, v4, La/x1a0;->c:La/wdk0;

    .line 204
    .line 205
    iget-object v10, v4, La/x1a0;->d:La/ii;

    .line 206
    .line 207
    iget-object v11, v4, La/x1a0;->h:La/h430;

    .line 208
    .line 209
    iget-object v4, v4, La/x1a0;->i:La/m1e;

    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    new-instance v12, La/g45;

    .line 224
    .line 225
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object v0, v12, La/g45;->a:Ljava/lang/Object;

    .line 229
    .line 230
    iput-object v3, v12, La/g45;->b:Ljava/lang/Object;

    .line 231
    .line 232
    iput-object v6, v12, La/g45;->c:Ljava/lang/Object;

    .line 233
    .line 234
    iput-object v1, v12, La/g45;->d:Ljava/lang/Object;

    .line 235
    .line 236
    iput-object v8, v12, La/g45;->e:Ljava/lang/Object;

    .line 237
    .line 238
    iput-object v5, v12, La/g45;->f:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v2, v12, La/g45;->g:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v4, v12, La/g45;->h:Ljava/lang/Object;

    .line 243
    .line 244
    new-instance v0, La/eni;

    .line 245
    .line 246
    const/16 v1, 0xa

    .line 247
    .line 248
    invoke-direct {v0, v12, v1}, La/eni;-><init>(Ljava/lang/Object;B)V

    .line 249
    .line 250
    .line 251
    iput-object v0, v12, La/g45;->i:Ljava/lang/Object;

    .line 252
    .line 253
    new-instance v0, La/fiu0;

    .line 254
    .line 255
    iget-object v1, v12, La/g45;->i:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v1, La/eni;

    .line 258
    .line 259
    const-class v3, La/b3a0;

    .line 260
    .line 261
    invoke-static {v3, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 266
    .line 267
    .line 268
    iput-object v0, p0, La/z1a0;->L1:La/fiu0;

    .line 269
    .line 270
    iput-object v9, p0, La/z1a0;->M1:La/wdk0;

    .line 271
    .line 272
    iput-object v10, p0, La/z1a0;->N1:La/ii;

    .line 273
    .line 274
    invoke-interface {v2}, La/rmd0;->f()La/xi70;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    iput-object v0, p0, La/z1a0;->O1:La/xi70;

    .line 279
    .line 280
    iput-object v7, p0, La/z1a0;->P1:La/zx10;

    .line 281
    .line 282
    iput-object v11, p0, La/z1a0;->Q1:La/h430;

    .line 283
    .line 284
    return-void

    .line 285
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 286
    .line 287
    invoke-static {v5, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_4
    add-int/lit8 v5, v5, -0x1

    .line 296
    .line 297
    goto/16 :goto_5

    .line 298
    .line 299
    :cond_5
    iget-object v3, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 300
    .line 301
    if-eqz v3, :cond_6

    .line 302
    .line 303
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    goto/16 :goto_4

    .line 308
    .line 309
    :cond_6
    move-object v3, v4

    .line 310
    goto/16 :goto_4

    .line 311
    .line 312
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    return-void

    .line 316
    :cond_8
    add-int/lit8 v5, v5, -0x1

    .line 317
    .line 318
    goto/16 :goto_3

    .line 319
    .line 320
    :cond_9
    iget-object v3, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 321
    .line 322
    if-eqz v3, :cond_a

    .line 323
    .line 324
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    goto/16 :goto_2

    .line 329
    .line 330
    :cond_a
    move-object v3, v4

    .line 331
    goto/16 :goto_2

    .line 332
    .line 333
    :cond_b
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :cond_c
    add-int/lit8 v3, v3, -0x1

    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :cond_d
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 342
    .line 343
    if-eqz v1, :cond_e

    .line 344
    .line 345
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :cond_e
    move-object v1, v4

    .line 352
    goto/16 :goto_0

    .line 353
    .line 354
    :cond_f
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z1a0;->S1:La/a8z;

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

.method public final Z()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/ui/platform/ComposeView;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Landroidx/compose/ui/platform/ComposeView;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/x1;->e()V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-super {p0}, La/yx5;->Z()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final b()La/pdf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z1a0;->P1:La/zx10;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "relatedGamesFeature"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/z1a0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
