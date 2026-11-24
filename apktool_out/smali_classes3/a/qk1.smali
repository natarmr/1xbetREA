.class public final La/qk1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:La/ctf0;

.field public final c:La/n0o0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;


# direct methods
.method public constructor <init>(La/d7p;La/ctf0;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/qk1;->a:B

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/qk1;->b:La/ctf0;

    .line 11
    .line 12
    iget-object p2, p1, La/d7p;->a:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iput-object p2, p0, La/qk1;->c:La/n0o0;

    .line 19
    .line 20
    iget-object p1, p1, La/d7p;->b:Ljava/util/Set;

    .line 21
    .line 22
    invoke-static {p1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, La/qk1;->d:La/n0o0;

    .line 27
    .line 28
    invoke-virtual {p2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    check-cast p2, La/fee;

    .line 33
    .line 34
    new-instance v0, La/g7p;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, p0, v1}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    new-instance v1, La/yw9;

    .line 41
    .line 42
    const/16 v2, 0x14

    .line 43
    .line 44
    invoke-direct {v1, p2, v0, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iput-object p2, p0, La/qk1;->e:La/n0o0;

    .line 52
    .line 53
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, La/fee;

    .line 58
    .line 59
    new-instance p2, La/e4p;

    .line 60
    .line 61
    const/16 v0, 0x9

    .line 62
    .line 63
    invoke-direct {p2, v0}, La/e4p;-><init>(B)V

    .line 64
    .line 65
    .line 66
    new-instance v0, La/yw9;

    .line 67
    .line 68
    invoke-direct {v0, p1, p2, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, La/qk1;->f:La/n0o0;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>(La/dz20;La/ctf0;)V
    .locals 3

    const/4 v0, 0x2

    iput-byte v0, p0, La/qk1;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p2, p0, La/qk1;->b:La/ctf0;

    .line 80
    iget-object p2, p1, La/dz20;->a:Ljava/util/List;

    .line 81
    new-instance v0, La/mz20;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/mz20;-><init>(La/qk1;B)V

    .line 82
    new-instance v1, La/yw9;

    const/16 v2, 0x14

    invoke-direct {v1, p2, v0, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    .line 83
    iput-object p2, p0, La/qk1;->c:La/n0o0;

    .line 84
    iget-object p2, p1, La/dz20;->c:Ljava/lang/Long;

    .line 85
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p2

    iput-object p2, p0, La/qk1;->d:La/n0o0;

    .line 86
    iget-object p2, p1, La/dz20;->d:Ljava/util/List;

    .line 87
    new-instance v0, La/mz20;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, La/mz20;-><init>(La/qk1;B)V

    .line 88
    new-instance v1, La/yw9;

    invoke-direct {v1, p2, v0, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    .line 89
    iput-object p2, p0, La/qk1;->e:La/n0o0;

    .line 90
    iget-object p1, p1, La/dz20;->e:Ljava/lang/Long;

    .line 91
    invoke-static {p1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/qk1;->f:La/n0o0;

    return-void
.end method

.method public constructor <init>(La/ok1;La/ctf0;)V
    .locals 3

    const/4 v0, 0x0

    iput-byte v0, p0, La/qk1;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    iput-object p2, p0, La/qk1;->b:La/ctf0;

    .line 94
    iget-boolean p2, p1, La/ok1;->e:Z

    .line 95
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p2

    iput-object p2, p0, La/qk1;->c:La/n0o0;

    .line 96
    invoke-virtual {p2}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La/fee;

    .line 97
    iget-object p2, p2, La/fee;->d:La/pz40;

    .line 98
    new-instance v1, La/m51;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, La/m51;-><init>(Ljava/lang/Object;B)V

    invoke-static {p2, v1}, La/bkb;->G(La/l7m0;Lkotlin/jvm/functions/Function1;)La/n0o0;

    move-result-object p2

    iput-object p2, p0, La/qk1;->d:La/n0o0;

    .line 99
    new-instance p2, La/pk1;

    invoke-direct {p2, p1, v0}, La/pk1;-><init>(La/ok1;B)V

    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    iput-object p2, p0, La/qk1;->e:La/n0o0;

    .line 100
    new-instance p2, La/pk1;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, La/pk1;-><init>(La/ok1;B)V

    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    iput-object p1, p0, La/qk1;->f:La/n0o0;

    return-void
.end method

.method public static a(La/s9p;ZLa/wui0;)La/kvl;
    .locals 7

    .line 1
    new-instance v0, La/kvl;

    .line 2
    .line 3
    new-instance v2, La/tui0;

    .line 4
    .line 5
    invoke-interface {p0}, La/s9p;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, v1, v3}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 11
    .line 12
    .line 13
    new-instance v4, La/hvi0;

    .line 14
    .line 15
    new-instance v1, La/kpe;

    .line 16
    .line 17
    invoke-direct {v1}, La/kpe;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, La/s9p;->b()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-direct {v4, v1, v3, p1}, La/hvi0;-><init>(La/kpe;IZ)V

    .line 25
    .line 26
    .line 27
    const/16 v6, 0x1b4

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    move-object v1, p0

    .line 31
    move-object v5, p2

    .line 32
    invoke-direct/range {v0 .. v6}, La/kvl;-><init>(Ljava/lang/Object;La/tui0;La/oui0;La/pvi0;La/wui0;I)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/qk1;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/qk1;->b:La/ctf0;

    .line 6
    .line 7
    iget-object v4, v0, La/qk1;->f:La/n0o0;

    .line 8
    .line 9
    iget-object v5, v0, La/qk1;->e:La/n0o0;

    .line 10
    .line 11
    iget-object v6, v0, La/qk1;->d:La/n0o0;

    .line 12
    .line 13
    iget-object v0, v0, La/qk1;->c:La/n0o0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/dz20;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    check-cast v8, La/fee;

    .line 30
    .line 31
    iget-object v9, v1, La/dz20;->a:Ljava/util/List;

    .line 32
    .line 33
    iget-boolean v10, v1, La/dz20;->l:Z

    .line 34
    .line 35
    iget-object v11, v1, La/dz20;->k:La/sf6;

    .line 36
    .line 37
    iget-object v12, v1, La/dz20;->f:La/xvm0;

    .line 38
    .line 39
    iget-object v13, v1, La/dz20;->g:La/udl0;

    .line 40
    .line 41
    invoke-virtual {v8, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, La/fee;

    .line 49
    .line 50
    iget-object v8, v1, La/dz20;->c:Ljava/lang/Long;

    .line 51
    .line 52
    invoke-virtual {v6, v8}, La/fee;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, La/fee;

    .line 60
    .line 61
    iget-object v8, v1, La/dz20;->d:Ljava/util/List;

    .line 62
    .line 63
    invoke-virtual {v6, v8}, La/fee;->d(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    check-cast v4, La/fee;

    .line 71
    .line 72
    iget-object v6, v1, La/dz20;->e:Ljava/lang/Long;

    .line 73
    .line 74
    invoke-virtual {v4, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v4, v1, La/dz20;->j:La/px7;

    .line 78
    .line 79
    instance-of v4, v4, La/lx7;

    .line 80
    .line 81
    xor-int/lit8 v26, v4, 0x1

    .line 82
    .line 83
    iget-object v6, v1, La/dz20;->b:La/js20;

    .line 84
    .line 85
    if-nez v6, :cond_0

    .line 86
    .line 87
    new-instance v7, La/jz20;

    .line 88
    .line 89
    invoke-direct {v7, v13}, La/jz20;-><init>(La/udl0;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_b

    .line 93
    .line 94
    :cond_0
    if-nez v12, :cond_1

    .line 95
    .line 96
    new-instance v7, La/jz20;

    .line 97
    .line 98
    invoke-direct {v7, v13}, La/jz20;-><init>(La/udl0;)V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_b

    .line 102
    .line 103
    :cond_1
    iget-object v9, v11, La/sf6;->a:La/ol6;

    .line 104
    .line 105
    instance-of v14, v9, La/nl6;

    .line 106
    .line 107
    instance-of v15, v9, La/ml6;

    .line 108
    .line 109
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v16

    .line 113
    check-cast v16, La/fee;

    .line 114
    .line 115
    invoke-virtual/range {v16 .. v16}, La/fee;->b()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v16

    .line 119
    check-cast v16, Ljava/util/List;

    .line 120
    .line 121
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    const/4 v3, 0x1

    .line 126
    if-le v7, v3, :cond_2

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_2
    if-nez v14, :cond_4

    .line 130
    .line 131
    if-nez v15, :cond_3

    .line 132
    .line 133
    if-eqz v10, :cond_4

    .line 134
    .line 135
    :cond_3
    :goto_0
    move/from16 v20, v3

    .line 136
    .line 137
    :goto_1
    move-object/from16 v24, v13

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_4
    const/16 v20, 0x0

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :goto_2
    new-instance v13, La/kz20;

    .line 144
    .line 145
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, La/fee;

    .line 150
    .line 151
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Ljava/util/List;

    .line 156
    .line 157
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    check-cast v5, La/fee;

    .line 162
    .line 163
    invoke-virtual {v5}, La/fee;->b()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    check-cast v5, La/qym0;

    .line 168
    .line 169
    invoke-interface {v12}, La/xvm0;->getId()J

    .line 170
    .line 171
    .line 172
    move-result-wide v17

    .line 173
    move-wide/from16 v16, v17

    .line 174
    .line 175
    const/4 v7, 0x0

    .line 176
    invoke-interface {v6}, La/js20;->a()J

    .line 177
    .line 178
    .line 179
    move-result-wide v18

    .line 180
    if-nez v10, :cond_6

    .line 181
    .line 182
    if-eqz v15, :cond_5

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_5
    move/from16 v21, v7

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_6
    :goto_3
    move/from16 v21, v3

    .line 189
    .line 190
    :goto_4
    if-eqz v15, :cond_8

    .line 191
    .line 192
    check-cast v9, La/ml6;

    .line 193
    .line 194
    iget-boolean v6, v9, La/ml6;->a:Z

    .line 195
    .line 196
    if-nez v6, :cond_7

    .line 197
    .line 198
    move/from16 v22, v3

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_7
    move/from16 v22, v7

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_8
    sget-object v10, La/nl6;->a:La/nl6;

    .line 205
    .line 206
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v10

    .line 210
    if-nez v10, :cond_a

    .line 211
    .line 212
    sget-object v10, La/ll6;->a:La/ll6;

    .line 213
    .line 214
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    if-eqz v9, :cond_9

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 222
    .line 223
    .line 224
    const/4 v7, 0x0

    .line 225
    goto :goto_b

    .line 226
    :cond_a
    :goto_5
    instance-of v6, v6, La/gs20;

    .line 227
    .line 228
    move/from16 v22, v6

    .line 229
    .line 230
    :goto_6
    if-nez v8, :cond_b

    .line 231
    .line 232
    move/from16 v23, v3

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_b
    move/from16 v23, v7

    .line 236
    .line 237
    :goto_7
    iget-boolean v3, v1, La/dz20;->h:Z

    .line 238
    .line 239
    if-eqz v3, :cond_c

    .line 240
    .line 241
    if-nez v4, :cond_c

    .line 242
    .line 243
    new-instance v3, La/nym0;

    .line 244
    .line 245
    iget-object v1, v1, La/dz20;->i:Ljava/lang/String;

    .line 246
    .line 247
    invoke-direct {v3, v1}, La/nym0;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v25, v3

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_c
    const/16 v25, 0x0

    .line 254
    .line 255
    :goto_8
    xor-int/lit8 v27, v15, 0x1

    .line 256
    .line 257
    if-nez v14, :cond_d

    .line 258
    .line 259
    if-eqz v20, :cond_d

    .line 260
    .line 261
    new-instance v1, La/lm6;

    .line 262
    .line 263
    new-array v3, v7, [Ljava/lang/Object;

    .line 264
    .line 265
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 266
    .line 267
    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    const v4, 0x7f130936

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    iget-boolean v3, v11, La/sf6;->b:Z

    .line 279
    .line 280
    sget-object v4, La/tf6;->a:La/tf6;

    .line 281
    .line 282
    invoke-direct {v1, v2, v15, v3}, La/lm6;-><init>(Ljava/lang/String;ZZ)V

    .line 283
    .line 284
    .line 285
    move-object/from16 v28, v1

    .line 286
    .line 287
    :goto_9
    move-object v14, v0

    .line 288
    move-object v15, v5

    .line 289
    goto :goto_a

    .line 290
    :cond_d
    const/16 v28, 0x0

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :goto_a
    invoke-direct/range {v13 .. v28}, La/kz20;-><init>(Ljava/util/List;La/qym0;JJZZZZLa/udl0;La/nym0;ZZLa/lm6;)V

    .line 294
    .line 295
    .line 296
    move-object v7, v13

    .line 297
    :goto_b
    return-object v7

    .line 298
    :pswitch_0
    move-object/from16 v1, p1

    .line 299
    .line 300
    check-cast v1, La/d7p;

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    check-cast v0, La/fee;

    .line 310
    .line 311
    iget-object v2, v1, La/d7p;->a:Ljava/util/List;

    .line 312
    .line 313
    invoke-virtual {v0, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    check-cast v0, La/fee;

    .line 321
    .line 322
    iget-object v1, v1, La/d7p;->b:Ljava/util/Set;

    .line 323
    .line 324
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    new-instance v0, La/f7p;

    .line 328
    .line 329
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    check-cast v1, La/fee;

    .line 334
    .line 335
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    check-cast v1, La/a4x;

    .line 340
    .line 341
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    check-cast v2, La/fee;

    .line 346
    .line 347
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    check-cast v2, Ljava/lang/Boolean;

    .line 352
    .line 353
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    invoke-direct {v0, v1, v2}, La/f7p;-><init>(La/a4x;Z)V

    .line 358
    .line 359
    .line 360
    return-object v0

    .line 361
    :pswitch_1
    move-object/from16 v1, p1

    .line 362
    .line 363
    check-cast v1, La/ok1;

    .line 364
    .line 365
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    check-cast v0, La/fee;

    .line 373
    .line 374
    iget-boolean v3, v1, La/ok1;->e:Z

    .line 375
    .line 376
    iget-object v7, v1, La/ok1;->a:Ljava/util/List;

    .line 377
    .line 378
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v0, v3}, La/fee;->d(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    iget-boolean v0, v1, La/ok1;->c:Z

    .line 386
    .line 387
    if-eqz v0, :cond_e

    .line 388
    .line 389
    new-instance v0, La/ik1;

    .line 390
    .line 391
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    check-cast v1, La/mdm;

    .line 396
    .line 397
    invoke-direct {v0, v1}, La/ik1;-><init>(La/mdm;)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_d

    .line 401
    .line 402
    :cond_e
    iget-boolean v0, v1, La/ok1;->b:Z

    .line 403
    .line 404
    if-eqz v0, :cond_f

    .line 405
    .line 406
    new-instance v0, La/hk1;

    .line 407
    .line 408
    new-instance v1, La/col;

    .line 409
    .line 410
    new-instance v2, La/b0i;

    .line 411
    .line 412
    sget-object v3, La/sh1;->a:La/sh1;

    .line 413
    .line 414
    sget-object v4, La/rh1;->b:La/rh1;

    .line 415
    .line 416
    invoke-direct {v2, v3, v4}, La/b0i;-><init>(La/sh1;La/rh1;)V

    .line 417
    .line 418
    .line 419
    const/16 v3, 0x9

    .line 420
    .line 421
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    invoke-direct {v1, v2, v3}, La/col;-><init>(La/b0i;Ljava/lang/Integer;)V

    .line 426
    .line 427
    .line 428
    invoke-direct {v0, v1}, La/hk1;-><init>(La/dol;)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_d

    .line 432
    .line 433
    :cond_f
    if-nez v0, :cond_10

    .line 434
    .line 435
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    if-eqz v0, :cond_10

    .line 440
    .line 441
    new-instance v0, La/ik1;

    .line 442
    .line 443
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    check-cast v1, La/mdm;

    .line 448
    .line 449
    invoke-direct {v0, v1}, La/ik1;-><init>(La/mdm;)V

    .line 450
    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_10
    new-instance v0, Ljava/util/ArrayList;

    .line 454
    .line 455
    const/16 v1, 0xa

    .line 456
    .line 457
    invoke-static {v7, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 458
    .line 459
    .line 460
    move-result v1

    .line 461
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 469
    .line 470
    .line 471
    move-result v3

    .line 472
    if-eqz v3, :cond_11

    .line 473
    .line 474
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    check-cast v3, La/lc1;

    .line 479
    .line 480
    new-instance v7, La/eol;

    .line 481
    .line 482
    iget-wide v4, v3, La/lc1;->a:J

    .line 483
    .line 484
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    new-instance v9, La/n0x;

    .line 489
    .line 490
    iget-object v4, v3, La/lc1;->c:Ljava/lang/String;

    .line 491
    .line 492
    invoke-direct {v9, v4}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    iget-object v11, v3, La/lc1;->b:Ljava/lang/String;

    .line 496
    .line 497
    const/4 v3, 0x0

    .line 498
    new-array v4, v3, [Ljava/lang/Object;

    .line 499
    .line 500
    iget-object v5, v2, La/ctf0;->b:La/lsm0;

    .line 501
    .line 502
    invoke-static {v4, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    const v10, 0x7f1303ec

    .line 507
    .line 508
    .line 509
    invoke-virtual {v5, v10, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v13

    .line 513
    new-instance v14, La/m0x;

    .line 514
    .line 515
    const v4, 0x7f08061a

    .line 516
    .line 517
    .line 518
    const/4 v5, 0x6

    .line 519
    const/4 v15, 0x0

    .line 520
    invoke-direct {v14, v4, v15, v5}, La/m0x;-><init>(ILa/bzw;I)V

    .line 521
    .line 522
    .line 523
    const/4 v10, 0x0

    .line 524
    const-string v12, ""

    .line 525
    .line 526
    invoke-direct/range {v7 .. v14}, La/eol;-><init>(Ljava/lang/String;La/n0x;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/m0x;)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    goto :goto_c

    .line 533
    :cond_11
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    new-instance v1, La/b0i;

    .line 538
    .line 539
    sget-object v2, La/sh1;->a:La/sh1;

    .line 540
    .line 541
    sget-object v3, La/rh1;->b:La/rh1;

    .line 542
    .line 543
    invoke-direct {v1, v2, v3}, La/b0i;-><init>(La/sh1;La/rh1;)V

    .line 544
    .line 545
    .line 546
    new-instance v2, La/bol;

    .line 547
    .line 548
    invoke-direct {v2, v0, v1}, La/bol;-><init>(La/a4x;La/b0i;)V

    .line 549
    .line 550
    .line 551
    new-instance v0, La/hk1;

    .line 552
    .line 553
    invoke-direct {v0, v2}, La/hk1;-><init>(La/dol;)V

    .line 554
    .line 555
    .line 556
    :goto_d
    new-instance v1, La/rk1;

    .line 557
    .line 558
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    check-cast v2, La/fee;

    .line 563
    .line 564
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    check-cast v2, La/imm;

    .line 569
    .line 570
    invoke-direct {v1, v2, v0}, La/rk1;-><init>(La/imm;La/jk1;)V

    .line 571
    .line 572
    .line 573
    return-object v1

    .line 574
    nop

    .line 575
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
