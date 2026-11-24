.class public final La/vhz;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vhz;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/rqt",
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
.field public static final l2:La/rqt;

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
    const-class v1, La/vhz;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;"

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
    sput-object v1, La/vhz;->m2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/rqt;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/vhz;->l2:La/rqt;

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
    iput-object v0, p0, La/vhz;->k2:La/khf0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, 0x11fc6b0b

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    sget-object v2, La/vhz;->m2:[La/iiy;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aget-object v4, v2, v3

    .line 15
    .line 16
    iget-object v5, v0, La/vhz;->k2:La/khf0;

    .line 17
    .line 18
    invoke-virtual {v5, v0, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;

    .line 23
    .line 24
    iget-object v4, v4, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;->b:La/xhz;

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
    check-cast v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;

    .line 33
    .line 34
    iget-object v2, v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;->a:Ljava/util/List;

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
    new-instance v5, La/thz;

    .line 65
    .line 66
    sget-object v6, La/lak0;->c:La/lak0;

    .line 67
    .line 68
    invoke-direct {v5, v6}, La/thz;-><init>(La/a4x;)V

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
    const v5, -0x4c4b9605

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
    if-eqz v10, :cond_5

    .line 107
    .line 108
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    add-int/lit8 v12, v9, 0x1

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    if-ltz v9, :cond_4

    .line 116
    .line 117
    check-cast v10, La/xhz;

    .line 118
    .line 119
    new-instance v14, La/whz;

    .line 120
    .line 121
    new-instance v15, La/rqm;

    .line 122
    .line 123
    const/16 v25, 0x1

    .line 124
    .line 125
    new-instance v11, La/tui0;

    .line 126
    .line 127
    move-object/from16 v26, v2

    .line 128
    .line 129
    iget v2, v10, La/xhz;->a:I

    .line 130
    .line 131
    invoke-static {v2, v3, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-direct {v11, v2, v13}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 136
    .line 137
    .line 138
    new-instance v2, La/nvi0;

    .line 139
    .line 140
    if-ne v10, v4, :cond_2

    .line 141
    .line 142
    move/from16 v13, v25

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_2
    move v13, v3

    .line 146
    :goto_1
    invoke-direct {v2, v13}, La/nvi0;-><init>(Z)V

    .line 147
    .line 148
    .line 149
    const/16 v23, 0x0

    .line 150
    .line 151
    const/16 v24, 0x1fa

    .line 152
    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    const/16 v19, 0x0

    .line 156
    .line 157
    const/16 v20, 0x0

    .line 158
    .line 159
    const/16 v21, 0x0

    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    move-object/from16 v18, v2

    .line 164
    .line 165
    move-object/from16 v16, v11

    .line 166
    .line 167
    invoke-direct/range {v15 .. v24}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 168
    .line 169
    .line 170
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->size()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    add-int/lit8 v2, v2, -0x1

    .line 175
    .line 176
    if-ne v9, v2, :cond_3

    .line 177
    .line 178
    move/from16 v11, v25

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_3
    move v11, v3

    .line 182
    :goto_2
    invoke-direct {v14, v10, v15, v11}, La/whz;-><init>(La/xhz;La/rqm;Z)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move v9, v12

    .line 189
    move-object/from16 v2, v26

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 193
    .line 194
    .line 195
    throw v13

    .line 196
    :cond_5
    const/16 v25, 0x1

    .line 197
    .line 198
    invoke-virtual {v1, v3}, La/fet;->r(Z)V

    .line 199
    .line 200
    .line 201
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    new-instance v4, La/thz;

    .line 206
    .line 207
    invoke-direct {v4, v2}, La/thz;-><init>(La/a4x;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v6, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, La/thz;

    .line 218
    .line 219
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    if-ne v4, v7, :cond_6

    .line 224
    .line 225
    new-instance v4, La/ebz;

    .line 226
    .line 227
    const/16 v5, 0xe

    .line 228
    .line 229
    invoke-direct {v4, v0, v5}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 236
    .line 237
    new-instance v5, La/bw5;

    .line 238
    .line 239
    move/from16 v0, v25

    .line 240
    .line 241
    invoke-static {v0, v1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    sget-object v7, La/hew0;->c:La/ugd;

    .line 246
    .line 247
    new-instance v0, La/ngz;

    .line 248
    .line 249
    const/4 v8, 0x2

    .line 250
    invoke-direct {v0, v2, v4, v8}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 251
    .line 252
    .line 253
    const v2, 0x4699d43c

    .line 254
    .line 255
    .line 256
    invoke-static {v2, v0, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    const/16 v10, 0xa

    .line 261
    .line 262
    const/4 v8, 0x0

    .line 263
    invoke-direct/range {v5 .. v10}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1, v3}, La/fet;->r(Z)V

    .line 267
    .line 268
    .line 269
    return-object v5
.end method
