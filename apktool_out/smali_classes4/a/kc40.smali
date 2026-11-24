.class public final La/kc40;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/kc40;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/uuz",
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
.field public static final l2:La/uuz;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public final k2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/kc40;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;"

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
    sput-object v1, La/kc40;->m2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/uuz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/kc40;->l2:La/uuz;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "params_key"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/kc40;->k2:La/khf0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, -0x218149b9

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    sget-object v2, La/kc40;->m2:[La/iiy;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aget-object v4, v2, v3

    .line 15
    .line 16
    iget-object v5, v0, La/kc40;->k2:La/khf0;

    .line 17
    .line 18
    invoke-virtual {v5, v0, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;

    .line 23
    .line 24
    iget-object v4, v4, Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;->a:La/xb40;

    .line 25
    .line 26
    aget-object v2, v2, v3

    .line 27
    .line 28
    invoke-virtual {v5, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;

    .line 33
    .line 34
    iget-object v2, v2, Lorg/xplatform/cyber/section/impl/meta_heroes/presentation/dialog/MetaHeroesRoleModelParams;->b:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v1, v5}, La/fet;->e(I)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    sget-object v7, La/ukd;->a:La/cl5;

    .line 59
    .line 60
    if-nez v5, :cond_0

    .line 61
    .line 62
    if-ne v6, v7, :cond_1

    .line 63
    .line 64
    :cond_0
    new-instance v5, La/ic40;

    .line 65
    .line 66
    sget-object v6, La/lak0;->c:La/lak0;

    .line 67
    .line 68
    invoke-direct {v5, v6}, La/ic40;-><init>(La/a4x;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v5}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    check-cast v6, La/pz40;

    .line 79
    .line 80
    const v5, -0x73bf80f9

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 84
    .line 85
    .line 86
    new-instance v5, Ljava/util/ArrayList;

    .line 87
    .line 88
    const/16 v8, 0xa

    .line 89
    .line 90
    invoke-static {v2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 91
    .line 92
    .line 93
    move-result v8

    .line 94
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    move v9, v3

    .line 102
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    const/4 v11, 0x1

    .line 107
    if-eqz v10, :cond_a

    .line 108
    .line 109
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    add-int/lit8 v12, v9, 0x1

    .line 114
    .line 115
    if-ltz v9, :cond_9

    .line 116
    .line 117
    check-cast v10, La/xb40;

    .line 118
    .line 119
    new-instance v14, La/lc40;

    .line 120
    .line 121
    new-instance v15, La/rqm;

    .line 122
    .line 123
    new-instance v13, La/tui0;

    .line 124
    .line 125
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    move/from16 v25, v11

    .line 130
    .line 131
    if-eq v3, v11, :cond_6

    .line 132
    .line 133
    const/4 v11, 0x2

    .line 134
    if-eq v3, v11, :cond_5

    .line 135
    .line 136
    const/4 v11, 0x3

    .line 137
    if-eq v3, v11, :cond_4

    .line 138
    .line 139
    const/4 v11, 0x4

    .line 140
    if-eq v3, v11, :cond_3

    .line 141
    .line 142
    const/4 v11, 0x5

    .line 143
    if-eq v3, v11, :cond_2

    .line 144
    .line 145
    const v3, 0x7f130792

    .line 146
    .line 147
    .line 148
    :goto_1
    const/4 v11, 0x0

    .line 149
    goto :goto_2

    .line 150
    :cond_2
    const v3, 0x7f130706

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    const v3, 0x7f130728

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_4
    const v3, 0x7f130709

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    const v3, 0x7f130721

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_6
    const v3, 0x7f130704

    .line 167
    .line 168
    .line 169
    goto :goto_1

    .line 170
    :goto_2
    invoke-static {v3, v11, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    const/4 v11, 0x0

    .line 175
    invoke-direct {v13, v3, v11}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 176
    .line 177
    .line 178
    new-instance v3, La/nvi0;

    .line 179
    .line 180
    if-ne v10, v4, :cond_7

    .line 181
    .line 182
    move/from16 v11, v25

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_7
    const/4 v11, 0x0

    .line 186
    :goto_3
    invoke-direct {v3, v11}, La/nvi0;-><init>(Z)V

    .line 187
    .line 188
    .line 189
    const/16 v23, 0x0

    .line 190
    .line 191
    const/16 v24, 0x1fa

    .line 192
    .line 193
    const/16 v17, 0x0

    .line 194
    .line 195
    const/16 v19, 0x0

    .line 196
    .line 197
    const/16 v20, 0x0

    .line 198
    .line 199
    const/16 v21, 0x0

    .line 200
    .line 201
    const/16 v22, 0x0

    .line 202
    .line 203
    move-object/from16 v18, v3

    .line 204
    .line 205
    move-object/from16 v16, v13

    .line 206
    .line 207
    invoke-direct/range {v15 .. v24}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    add-int/lit8 v3, v3, -0x1

    .line 215
    .line 216
    if-ne v9, v3, :cond_8

    .line 217
    .line 218
    move/from16 v11, v25

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_8
    const/4 v11, 0x0

    .line 222
    :goto_4
    invoke-direct {v14, v10, v15, v11}, La/lc40;-><init>(La/xb40;La/rqm;Z)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move v9, v12

    .line 229
    const/4 v3, 0x0

    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :cond_9
    invoke-static {}, La/q3d;->p()V

    .line 233
    .line 234
    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    throw v16

    .line 238
    :cond_a
    move/from16 v25, v11

    .line 239
    .line 240
    move v11, v3

    .line 241
    invoke-virtual {v1, v11}, La/fet;->r(Z)V

    .line 242
    .line 243
    .line 244
    invoke-static {v5}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    new-instance v3, La/ic40;

    .line 249
    .line 250
    invoke-direct {v3, v2}, La/ic40;-><init>(La/a4x;)V

    .line 251
    .line 252
    .line 253
    invoke-interface {v6, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    check-cast v2, La/ic40;

    .line 261
    .line 262
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    if-ne v3, v7, :cond_b

    .line 267
    .line 268
    new-instance v3, La/b530;

    .line 269
    .line 270
    const/16 v4, 0x9

    .line 271
    .line 272
    invoke-direct {v3, v0, v4}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 279
    .line 280
    new-instance v4, La/bw5;

    .line 281
    .line 282
    move/from16 v0, v25

    .line 283
    .line 284
    invoke-static {v0, v1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    sget-object v6, La/tke;->c:La/ugd;

    .line 289
    .line 290
    new-instance v0, La/ngz;

    .line 291
    .line 292
    const/16 v7, 0x14

    .line 293
    .line 294
    invoke-direct {v0, v2, v3, v7}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 295
    .line 296
    .line 297
    const v2, -0x5a331f88

    .line 298
    .line 299
    .line 300
    invoke-static {v2, v0, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    const/16 v9, 0xa

    .line 305
    .line 306
    const/4 v7, 0x0

    .line 307
    invoke-direct/range {v4 .. v9}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 308
    .line 309
    .line 310
    const/4 v11, 0x0

    .line 311
    invoke-virtual {v1, v11}, La/fet;->r(Z)V

    .line 312
    .line 313
    .line 314
    return-object v4
.end method
