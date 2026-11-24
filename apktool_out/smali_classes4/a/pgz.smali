.class public final La/pgz;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/pgz;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/art",
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
.field public static final l2:La/art;

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
    const-class v1, La/pgz;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;"

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
    sput-object v1, La/pgz;->m2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/art;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/pgz;->l2:La/art;

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
    iput-object v0, p0, La/pgz;->k2:La/khf0;

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
    const v2, 0x74c4b050

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    sget-object v2, La/pgz;->m2:[La/iiy;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aget-object v2, v2, v3

    .line 15
    .line 16
    iget-object v4, v0, La/pgz;->k2:La/khf0;

    .line 17
    .line 18
    invoke-virtual {v4, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;

    .line 23
    .line 24
    iget-object v2, v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;->a:La/qgz;

    .line 25
    .line 26
    sget-object v4, La/qgz;->e:La/c0o;

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
    new-instance v5, La/rgz;

    .line 57
    .line 58
    sget-object v6, La/lak0;->c:La/lak0;

    .line 59
    .line 60
    invoke-direct {v5, v6}, La/rgz;-><init>(La/a4x;)V

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
    const v5, 0x26706677

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
    if-eqz v10, :cond_5

    .line 99
    .line 100
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    add-int/lit8 v12, v9, 0x1

    .line 105
    .line 106
    const/4 v13, 0x0

    .line 107
    if-ltz v9, :cond_4

    .line 108
    .line 109
    check-cast v10, La/qgz;

    .line 110
    .line 111
    new-instance v14, La/sgz;

    .line 112
    .line 113
    new-instance v15, La/rqm;

    .line 114
    .line 115
    const/16 v25, 0x1

    .line 116
    .line 117
    new-instance v11, La/tui0;

    .line 118
    .line 119
    move-object/from16 v26, v4

    .line 120
    .line 121
    iget v4, v10, La/qgz;->a:I

    .line 122
    .line 123
    invoke-static {v4, v3, v1}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-direct {v11, v4, v13}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 128
    .line 129
    .line 130
    new-instance v4, La/nvi0;

    .line 131
    .line 132
    if-ne v10, v2, :cond_2

    .line 133
    .line 134
    move/from16 v13, v25

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    move v13, v3

    .line 138
    :goto_1
    invoke-direct {v4, v13}, La/nvi0;-><init>(Z)V

    .line 139
    .line 140
    .line 141
    const/16 v23, 0x0

    .line 142
    .line 143
    const/16 v24, 0x1fa

    .line 144
    .line 145
    const/16 v17, 0x0

    .line 146
    .line 147
    const/16 v19, 0x0

    .line 148
    .line 149
    const/16 v20, 0x0

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const/16 v22, 0x0

    .line 154
    .line 155
    move-object/from16 v18, v4

    .line 156
    .line 157
    move-object/from16 v16, v11

    .line 158
    .line 159
    invoke-direct/range {v15 .. v24}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 160
    .line 161
    .line 162
    invoke-interface/range {v26 .. v26}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v4

    .line 166
    add-int/lit8 v4, v4, -0x1

    .line 167
    .line 168
    if-ne v9, v4, :cond_3

    .line 169
    .line 170
    move/from16 v11, v25

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_3
    move v11, v3

    .line 174
    :goto_2
    invoke-direct {v14, v10, v15, v11}, La/sgz;-><init>(La/qgz;La/rqm;Z)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move v9, v12

    .line 181
    move-object/from16 v4, v26

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :cond_4
    invoke-static {}, La/q3d;->p()V

    .line 185
    .line 186
    .line 187
    throw v13

    .line 188
    :cond_5
    const/16 v25, 0x1

    .line 189
    .line 190
    invoke-virtual {v1, v3}, La/fet;->r(Z)V

    .line 191
    .line 192
    .line 193
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    new-instance v4, La/rgz;

    .line 198
    .line 199
    invoke-direct {v4, v2}, La/rgz;-><init>(La/a4x;)V

    .line 200
    .line 201
    .line 202
    invoke-interface {v6, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, La/rgz;

    .line 210
    .line 211
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    if-ne v4, v7, :cond_6

    .line 216
    .line 217
    new-instance v4, La/ebz;

    .line 218
    .line 219
    const/16 v5, 0xb

    .line 220
    .line 221
    invoke-direct {v4, v0, v5}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 228
    .line 229
    new-instance v5, La/bw5;

    .line 230
    .line 231
    move/from16 v0, v25

    .line 232
    .line 233
    invoke-static {v0, v1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    sget-object v7, La/epv0;->d:La/ugd;

    .line 238
    .line 239
    new-instance v0, La/ngz;

    .line 240
    .line 241
    invoke-direct {v0, v2, v4, v3}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 242
    .line 243
    .line 244
    const v2, -0x7cf74201

    .line 245
    .line 246
    .line 247
    invoke-static {v2, v0, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    const/16 v10, 0xa

    .line 252
    .line 253
    const/4 v8, 0x0

    .line 254
    invoke-direct/range {v5 .. v10}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1, v3}, La/fet;->r(Z)V

    .line 258
    .line 259
    .line 260
    return-object v5
.end method
