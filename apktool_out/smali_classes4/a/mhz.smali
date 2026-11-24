.class public final La/mhz;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/mhz;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/bst",
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
.field public static final l2:La/bst;

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
    const-class v1, La/mhz;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;"

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
    sput-object v1, La/mhz;->m2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/bst;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/mhz;->l2:La/bst;

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
    iput-object v0, p0, La/mhz;->k2:La/khf0;

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
    const v2, 0x50dd5640

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    sget-object v2, La/mhz;->m2:[La/iiy;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aget-object v2, v2, v3

    .line 15
    .line 16
    iget-object v4, v0, La/mhz;->k2:La/khf0;

    .line 17
    .line 18
    invoke-virtual {v4, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;

    .line 23
    .line 24
    iget-object v2, v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;->a:La/epe;

    .line 25
    .line 26
    sget-object v4, La/epe;->d:La/c0o;

    .line 27
    .line 28
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1, v5}, La/fet;->e(I)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    sget-object v7, La/ukd;->a:La/cl5;

    .line 51
    .line 52
    if-nez v5, :cond_0

    .line 53
    .line 54
    if-ne v6, v7, :cond_1

    .line 55
    .line 56
    :cond_0
    new-instance v5, La/khz;

    .line 57
    .line 58
    sget-object v6, La/lak0;->c:La/lak0;

    .line 59
    .line 60
    invoke-direct {v5, v6}, La/khz;-><init>(La/a4x;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v5}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    check-cast v6, La/pz40;

    .line 71
    .line 72
    const v5, -0x178d31ba

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 76
    .line 77
    .line 78
    new-instance v5, Ljava/util/ArrayList;

    .line 79
    .line 80
    const/16 v8, 0xa

    .line 81
    .line 82
    invoke-static {v4, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    move v9, v3

    .line 94
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    const/4 v11, 0x1

    .line 99
    if-eqz v10, :cond_7

    .line 100
    .line 101
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    add-int/lit8 v12, v9, 0x1

    .line 106
    .line 107
    if-ltz v9, :cond_6

    .line 108
    .line 109
    check-cast v10, La/epe;

    .line 110
    .line 111
    new-instance v14, La/nhz;

    .line 112
    .line 113
    new-instance v15, La/rqm;

    .line 114
    .line 115
    new-instance v13, La/tui0;

    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_3

    .line 122
    .line 123
    if-ne v3, v11, :cond_2

    .line 124
    .line 125
    const v3, -0xef456ab

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 129
    .line 130
    .line 131
    const v3, 0x7f130595

    .line 132
    .line 133
    .line 134
    move/from16 v25, v11

    .line 135
    .line 136
    const/4 v11, 0x0

    .line 137
    invoke-static {v3, v11, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v1, v11}, La/fet;->r(Z)V

    .line 142
    .line 143
    .line 144
    :goto_1
    const/4 v11, 0x0

    .line 145
    goto :goto_2

    .line 146
    :cond_2
    const/4 v11, 0x0

    .line 147
    const v0, -0xef46aed

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v1, v11}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    throw v0

    .line 155
    :cond_3
    move/from16 v25, v11

    .line 156
    .line 157
    const/4 v11, 0x0

    .line 158
    const v3, -0xef46290

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 162
    .line 163
    .line 164
    const v3, 0x7f1309fd

    .line 165
    .line 166
    .line 167
    invoke-static {v3, v11, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {v1, v11}, La/fet;->r(Z)V

    .line 172
    .line 173
    .line 174
    goto :goto_1

    .line 175
    :goto_2
    invoke-direct {v13, v3, v11}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 176
    .line 177
    .line 178
    new-instance v3, La/nvi0;

    .line 179
    .line 180
    if-ne v10, v2, :cond_4

    .line 181
    .line 182
    move/from16 v11, v25

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_4
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
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    add-int/lit8 v3, v3, -0x1

    .line 215
    .line 216
    if-ne v9, v3, :cond_5

    .line 217
    .line 218
    move/from16 v11, v25

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_5
    const/4 v11, 0x0

    .line 222
    :goto_4
    invoke-direct {v14, v10, v15, v11}, La/nhz;-><init>(La/epe;La/rqm;Z)V

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
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 233
    .line 234
    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    throw v16

    .line 238
    :cond_7
    move/from16 v25, v11

    .line 239
    .line 240
    move v11, v3

    .line 241
    invoke-virtual {v1, v11}, La/fet;->r(Z)V

    .line 242
    .line 243
    .line 244
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    new-instance v3, La/khz;

    .line 249
    .line 250
    invoke-direct {v3, v2}, La/khz;-><init>(La/a4x;)V

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
    check-cast v2, La/khz;

    .line 261
    .line 262
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    if-ne v3, v7, :cond_8

    .line 267
    .line 268
    new-instance v3, La/ebz;

    .line 269
    .line 270
    const/16 v4, 0xc

    .line 271
    .line 272
    invoke-direct {v3, v0, v4}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    :cond_8
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
    sget-object v6, La/i4w0;->c:La/ugd;

    .line 289
    .line 290
    new-instance v7, La/ngz;

    .line 291
    .line 292
    invoke-direct {v7, v2, v3, v0}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 293
    .line 294
    .line 295
    const v0, -0x37f3c28f

    .line 296
    .line 297
    .line 298
    invoke-static {v0, v7, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 299
    .line 300
    .line 301
    move-result-object v8

    .line 302
    const/16 v9, 0xa

    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    invoke-direct/range {v4 .. v9}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 306
    .line 307
    .line 308
    const/4 v11, 0x0

    .line 309
    invoke-virtual {v1, v11}, La/fet;->r(Z)V

    .line 310
    .line 311
    .line 312
    return-object v4
.end method
