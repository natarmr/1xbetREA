.class public final La/i9o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/z8o;

.field public final b:La/ctf0;

.field public final c:La/g2v;

.field public final d:La/y78;

.field public final e:J

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:La/n0o0;

.field public final j:La/n0o0;

.field public final k:La/n0o0;


# direct methods
.method public constructor <init>(La/z8o;La/ctf0;La/g2v;La/y78;J)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/i9o;->a:La/z8o;

    .line 8
    .line 9
    iput-object p2, p0, La/i9o;->b:La/ctf0;

    .line 10
    .line 11
    iput-object p3, p0, La/i9o;->c:La/g2v;

    .line 12
    .line 13
    iput-object p4, p0, La/i9o;->d:La/y78;

    .line 14
    .line 15
    iput-wide p5, p0, La/i9o;->e:J

    .line 16
    .line 17
    new-instance p2, La/h9o;

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    invoke-direct {p2, p0, p3}, La/h9o;-><init>(La/i9o;B)V

    .line 21
    .line 22
    .line 23
    new-instance p3, La/yw9;

    .line 24
    .line 25
    const/16 p4, 0x14

    .line 26
    .line 27
    invoke-direct {p3, p1, p2, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    iput-object p2, p0, La/i9o;->f:La/n0o0;

    .line 35
    .line 36
    iget-object p2, p1, La/z8o;->f:La/d8o;

    .line 37
    .line 38
    new-instance p3, La/h9o;

    .line 39
    .line 40
    const/4 p5, 0x1

    .line 41
    invoke-direct {p3, p0, p5}, La/h9o;-><init>(La/i9o;B)V

    .line 42
    .line 43
    .line 44
    new-instance p5, La/yw9;

    .line 45
    .line 46
    invoke-direct {p5, p2, p3, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p5}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iput-object p2, p0, La/i9o;->g:La/n0o0;

    .line 54
    .line 55
    iget-object p2, p1, La/z8o;->b:La/w7o;

    .line 56
    .line 57
    const/4 p3, 0x0

    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    iget-object p5, p2, La/w7o;->a:Ljava/lang/Object;

    .line 61
    .line 62
    sget-object p6, La/j0g0;->b:La/e0g0;

    .line 63
    .line 64
    instance-of p6, p5, La/g0g0;

    .line 65
    .line 66
    if-eqz p6, :cond_0

    .line 67
    .line 68
    move-object p5, p3

    .line 69
    :cond_0
    check-cast p5, La/h8o;

    .line 70
    .line 71
    if-nez p5, :cond_2

    .line 72
    .line 73
    :cond_1
    new-instance p5, La/h8o;

    .line 74
    .line 75
    sget-object p6, La/iun;->a:La/iun;

    .line 76
    .line 77
    sget-object v0, La/lun;->a:La/lun;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-direct {p5, p6, v0}, La/h8o;-><init>(Ljava/util/List;Ljava/util/Map;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    new-instance p6, La/h9o;

    .line 86
    .line 87
    const/4 v0, 0x2

    .line 88
    invoke-direct {p6, p0, v0}, La/h9o;-><init>(La/i9o;B)V

    .line 89
    .line 90
    .line 91
    new-instance v0, La/yw9;

    .line 92
    .line 93
    invoke-direct {v0, p5, p6, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 97
    .line 98
    .line 99
    move-result-object p5

    .line 100
    iput-object p5, p0, La/i9o;->h:La/n0o0;

    .line 101
    .line 102
    if-eqz p2, :cond_4

    .line 103
    .line 104
    iget-object p5, p2, La/w7o;->b:Ljava/lang/Object;

    .line 105
    .line 106
    sget-object p6, La/j0g0;->b:La/e0g0;

    .line 107
    .line 108
    instance-of p6, p5, La/g0g0;

    .line 109
    .line 110
    if-eqz p6, :cond_3

    .line 111
    .line 112
    move-object p5, p3

    .line 113
    :cond_3
    check-cast p5, La/h8o;

    .line 114
    .line 115
    if-nez p5, :cond_5

    .line 116
    .line 117
    :cond_4
    new-instance p5, La/h8o;

    .line 118
    .line 119
    sget-object p6, La/iun;->a:La/iun;

    .line 120
    .line 121
    sget-object v0, La/lun;->a:La/lun;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-direct {p5, p6, v0}, La/h8o;-><init>(Ljava/util/List;Ljava/util/Map;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    new-instance p6, La/h9o;

    .line 130
    .line 131
    const/4 v0, 0x3

    .line 132
    invoke-direct {p6, p0, v0}, La/h9o;-><init>(La/i9o;B)V

    .line 133
    .line 134
    .line 135
    new-instance v0, La/yw9;

    .line 136
    .line 137
    invoke-direct {v0, p5, p6, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 141
    .line 142
    .line 143
    move-result-object p5

    .line 144
    iput-object p5, p0, La/i9o;->i:La/n0o0;

    .line 145
    .line 146
    if-eqz p2, :cond_7

    .line 147
    .line 148
    iget-object p2, p2, La/w7o;->c:Ljava/lang/Object;

    .line 149
    .line 150
    sget-object p5, La/j0g0;->b:La/e0g0;

    .line 151
    .line 152
    instance-of p5, p2, La/g0g0;

    .line 153
    .line 154
    if-eqz p5, :cond_6

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_6
    move-object p3, p2

    .line 158
    :goto_0
    check-cast p3, Ljava/util/List;

    .line 159
    .line 160
    if-nez p3, :cond_8

    .line 161
    .line 162
    :cond_7
    sget-object p3, La/iun;->a:La/iun;

    .line 163
    .line 164
    :cond_8
    new-instance p2, La/h9o;

    .line 165
    .line 166
    const/4 p5, 0x4

    .line 167
    invoke-direct {p2, p0, p5}, La/h9o;-><init>(La/i9o;B)V

    .line 168
    .line 169
    .line 170
    new-instance p5, La/yw9;

    .line 171
    .line 172
    invoke-direct {p5, p3, p2, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    invoke-static {p5}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    iput-object p2, p0, La/i9o;->j:La/n0o0;

    .line 180
    .line 181
    iget-object p1, p1, La/z8o;->c:Ljava/util/List;

    .line 182
    .line 183
    new-instance p2, La/h9o;

    .line 184
    .line 185
    const/4 p3, 0x5

    .line 186
    invoke-direct {p2, p0, p3}, La/h9o;-><init>(La/i9o;B)V

    .line 187
    .line 188
    .line 189
    new-instance p3, La/yw9;

    .line 190
    .line 191
    invoke-direct {p3, p1, p2, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iput-object p1, p0, La/i9o;->k:La/n0o0;

    .line 199
    .line 200
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/z8o;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, La/g9o;

    .line 11
    .line 12
    iget-object v3, v0, La/i9o;->f:La/n0o0;

    .line 13
    .line 14
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    check-cast v3, La/fee;

    .line 19
    .line 20
    iget-object v3, v3, La/fee;->e:La/zbk;

    .line 21
    .line 22
    iget-object v4, v1, La/z8o;->b:La/w7o;

    .line 23
    .line 24
    iget-boolean v5, v1, La/z8o;->a:Z

    .line 25
    .line 26
    iget-object v6, v1, La/z8o;->d:La/sff0;

    .line 27
    .line 28
    iget-object v6, v6, La/sff0;->g:La/mum0;

    .line 29
    .line 30
    iget-object v6, v6, La/mum0;->y:La/v5l0;

    .line 31
    .line 32
    iget-object v7, v0, La/i9o;->a:La/z8o;

    .line 33
    .line 34
    iget-boolean v7, v7, La/z8o;->g:Z

    .line 35
    .line 36
    new-instance v8, La/gnm;

    .line 37
    .line 38
    const/16 v9, 0x19

    .line 39
    .line 40
    invoke-direct {v8, v0, v1, v9}, La/gnm;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, La/i9o;->c:La/g2v;

    .line 44
    .line 45
    sget-object v1, La/x7o;->a:La/x7o;

    .line 46
    .line 47
    const-wide/16 v9, -0x1

    .line 48
    .line 49
    if-nez v4, :cond_6

    .line 50
    .line 51
    if-eqz v5, :cond_5

    .line 52
    .line 53
    new-instance v0, La/t8o;

    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x4

    .line 60
    const/4 v6, 0x3

    .line 61
    const/4 v8, 0x1

    .line 62
    const/4 v9, 0x2

    .line 63
    const/4 v10, 0x0

    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    if-eq v4, v8, :cond_3

    .line 67
    .line 68
    if-eq v4, v9, :cond_2

    .line 69
    .line 70
    if-eq v4, v6, :cond_1

    .line 71
    .line 72
    if-ne v4, v5, :cond_0

    .line 73
    .line 74
    sget-object v4, La/h0l0;->a:La/h0l0;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 78
    .line 79
    .line 80
    return-object v10

    .line 81
    :cond_1
    sget-object v4, La/i0l0;->a:La/i0l0;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    sget-object v4, La/j0l0;->a:La/j0l0;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    sget-object v4, La/k0l0;->a:La/k0l0;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    sget-object v4, La/g0l0;->a:La/g0l0;

    .line 91
    .line 92
    :goto_0
    new-instance v11, La/n8o;

    .line 93
    .line 94
    new-instance v12, La/ijm;

    .line 95
    .line 96
    invoke-direct {v12}, La/ijm;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v13, "DISCIPLINES_HEADER_SHIMMER_KEY"

    .line 100
    .line 101
    invoke-direct {v11, v13, v12}, La/n8o;-><init>(Ljava/lang/String;La/jjm;)V

    .line 102
    .line 103
    .line 104
    new-instance v12, La/kok;

    .line 105
    .line 106
    new-instance v13, La/gyl;

    .line 107
    .line 108
    invoke-static {v7}, La/xfn;->b(Z)La/wfn;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    iget v7, v7, La/wfn;->c:F

    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    invoke-static {v7, v14, v9}, La/s5x0;->t(FFI)La/lh80;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-direct {v13, v10, v7, v8}, La/gyl;-><init>(La/syl;La/lh80;I)V

    .line 120
    .line 121
    .line 122
    const-string v7, "DISCIPLINES_TABS_SHIMMER_KEY"

    .line 123
    .line 124
    invoke-direct {v12, v7, v13}, La/kok;-><init>(Ljava/lang/String;La/hyl;)V

    .line 125
    .line 126
    .line 127
    new-instance v7, La/n8o;

    .line 128
    .line 129
    new-instance v10, La/ijm;

    .line 130
    .line 131
    invoke-direct {v10}, La/ijm;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v13, "LIVE_EVENTS_HEADER_SHIMMER_KEY"

    .line 135
    .line 136
    invoke-direct {v7, v13, v10}, La/n8o;-><init>(Ljava/lang/String;La/jjm;)V

    .line 137
    .line 138
    .line 139
    new-instance v10, La/m8o;

    .line 140
    .line 141
    new-instance v13, La/vb90;

    .line 142
    .line 143
    sget-object v14, La/q0s;->b:La/q0s;

    .line 144
    .line 145
    new-instance v15, La/x56;

    .line 146
    .line 147
    invoke-direct {v15, v4}, La/x56;-><init>(La/l0l0;)V

    .line 148
    .line 149
    .line 150
    move/from16 p0, v5

    .line 151
    .line 152
    new-instance v5, La/x56;

    .line 153
    .line 154
    invoke-direct {v5, v4}, La/x56;-><init>(La/l0l0;)V

    .line 155
    .line 156
    .line 157
    filled-new-array {v15, v5}, [La/x56;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-static {v5}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    const/4 v15, 0x0

    .line 166
    invoke-direct {v13, v14, v5, v15, v8}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 167
    .line 168
    .line 169
    const-string v5, "LIVE_EVENTS_SHIMMER_KEY"

    .line 170
    .line 171
    invoke-direct {v10, v5, v13}, La/m8o;-><init>(Ljava/lang/String;La/vb90;)V

    .line 172
    .line 173
    .line 174
    new-instance v5, La/n8o;

    .line 175
    .line 176
    new-instance v13, La/ijm;

    .line 177
    .line 178
    invoke-direct {v13}, La/ijm;-><init>()V

    .line 179
    .line 180
    .line 181
    move/from16 p1, v6

    .line 182
    .line 183
    const-string v6, "LINE_EVENTS_HEADER_SHIMMER_KEY"

    .line 184
    .line 185
    invoke-direct {v5, v6, v13}, La/n8o;-><init>(Ljava/lang/String;La/jjm;)V

    .line 186
    .line 187
    .line 188
    new-instance v6, La/m8o;

    .line 189
    .line 190
    new-instance v13, La/vb90;

    .line 191
    .line 192
    move/from16 v16, v9

    .line 193
    .line 194
    new-instance v9, La/x56;

    .line 195
    .line 196
    invoke-direct {v9, v4}, La/x56;-><init>(La/l0l0;)V

    .line 197
    .line 198
    .line 199
    new-instance v8, La/x56;

    .line 200
    .line 201
    invoke-direct {v8, v4}, La/x56;-><init>(La/l0l0;)V

    .line 202
    .line 203
    .line 204
    filled-new-array {v9, v8}, [La/x56;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-static {v4}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    const/4 v8, 0x1

    .line 213
    invoke-direct {v13, v14, v4, v15, v8}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 214
    .line 215
    .line 216
    const-string v4, "LINE_EVENTS_SHIMMER_KEY"

    .line 217
    .line 218
    invoke-direct {v6, v4, v13}, La/m8o;-><init>(Ljava/lang/String;La/vb90;)V

    .line 219
    .line 220
    .line 221
    const/4 v4, 0x7

    .line 222
    new-array v4, v4, [La/p6t0;

    .line 223
    .line 224
    aput-object v11, v4, v15

    .line 225
    .line 226
    aput-object v12, v4, v8

    .line 227
    .line 228
    sget-object v8, La/f8o;->a:La/f8o;

    .line 229
    .line 230
    aput-object v8, v4, v16

    .line 231
    .line 232
    aput-object v7, v4, p1

    .line 233
    .line 234
    aput-object v10, v4, p0

    .line 235
    .line 236
    const/4 v7, 0x5

    .line 237
    aput-object v5, v4, v7

    .line 238
    .line 239
    const/4 v5, 0x6

    .line 240
    aput-object v6, v4, v5

    .line 241
    .line 242
    invoke-static {v4}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-direct {v0, v1, v4}, La/t8o;-><init>(La/z7o;La/a4x;)V

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_5
    new-instance v1, La/t8o;

    .line 251
    .line 252
    new-instance v4, La/y7o;

    .line 253
    .line 254
    invoke-static {v9, v10, v0}, La/ozb;->Q(JLa/g2v;)La/mdm;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-direct {v4, v0}, La/y7o;-><init>(La/mdm;)V

    .line 259
    .line 260
    .line 261
    invoke-direct {v1, v4}, La/t8o;-><init>(La/y7o;)V

    .line 262
    .line 263
    .line 264
    :goto_1
    move-object v0, v1

    .line 265
    goto :goto_2

    .line 266
    :cond_6
    invoke-virtual {v8}, La/gnm;->invoke()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    check-cast v5, La/a4x;

    .line 271
    .line 272
    iget-object v6, v4, La/w7o;->a:Ljava/lang/Object;

    .line 273
    .line 274
    sget-object v7, La/j0g0;->b:La/e0g0;

    .line 275
    .line 276
    instance-of v6, v6, La/g0g0;

    .line 277
    .line 278
    if-eqz v6, :cond_7

    .line 279
    .line 280
    iget-object v6, v4, La/w7o;->b:Ljava/lang/Object;

    .line 281
    .line 282
    instance-of v6, v6, La/g0g0;

    .line 283
    .line 284
    if-eqz v6, :cond_7

    .line 285
    .line 286
    iget-object v4, v4, La/w7o;->c:Ljava/lang/Object;

    .line 287
    .line 288
    instance-of v4, v4, La/g0g0;

    .line 289
    .line 290
    if-eqz v4, :cond_7

    .line 291
    .line 292
    new-instance v1, La/t8o;

    .line 293
    .line 294
    new-instance v4, La/y7o;

    .line 295
    .line 296
    invoke-static {v9, v10, v0}, La/ozb;->Q(JLa/g2v;)La/mdm;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-direct {v4, v0}, La/y7o;-><init>(La/mdm;)V

    .line 301
    .line 302
    .line 303
    invoke-direct {v1, v4}, La/t8o;-><init>(La/y7o;)V

    .line 304
    .line 305
    .line 306
    goto :goto_1

    .line 307
    :cond_7
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-eqz v4, :cond_8

    .line 312
    .line 313
    new-instance v1, La/t8o;

    .line 314
    .line 315
    new-instance v4, La/y7o;

    .line 316
    .line 317
    invoke-static {v9, v10, v0}, La/ozb;->P(JLa/g2v;)La/mdm;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-direct {v4, v0}, La/y7o;-><init>(La/mdm;)V

    .line 322
    .line 323
    .line 324
    invoke-direct {v1, v4}, La/t8o;-><init>(La/y7o;)V

    .line 325
    .line 326
    .line 327
    goto :goto_1

    .line 328
    :cond_8
    new-instance v0, La/t8o;

    .line 329
    .line 330
    invoke-virtual {v8}, La/gnm;->invoke()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    check-cast v4, La/a4x;

    .line 335
    .line 336
    invoke-direct {v0, v1, v4}, La/t8o;-><init>(La/z7o;La/a4x;)V

    .line 337
    .line 338
    .line 339
    :goto_2
    invoke-direct {v2, v3, v0}, La/g9o;-><init>(La/l7m0;La/t8o;)V

    .line 340
    .line 341
    .line 342
    return-object v2
.end method
