.class public final La/kn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/ctf0;

.field public final b:La/g2v;

.field public final c:J

.field public final d:La/n0o0;

.field public final e:La/n0o0;


# direct methods
.method public constructor <init>(La/ln;La/ctf0;La/g2v;J)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/kn;->a:La/ctf0;

    .line 8
    .line 9
    iput-object p3, p0, La/kn;->b:La/g2v;

    .line 10
    .line 11
    iput-wide p4, p0, La/kn;->c:J

    .line 12
    .line 13
    new-instance p2, La/jn;

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-direct {p2, p0, p3}, La/jn;-><init>(La/kn;B)V

    .line 17
    .line 18
    .line 19
    new-instance p3, La/yw9;

    .line 20
    .line 21
    const/16 p4, 0x14

    .line 22
    .line 23
    invoke-direct {p3, p1, p2, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iput-object p2, p0, La/kn;->d:La/n0o0;

    .line 31
    .line 32
    new-instance p2, La/jn;

    .line 33
    .line 34
    const/4 p3, 0x1

    .line 35
    invoke-direct {p2, p0, p3}, La/jn;-><init>(La/kn;B)V

    .line 36
    .line 37
    .line 38
    new-instance p3, La/yw9;

    .line 39
    .line 40
    invoke-direct {p3, p1, p2, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, La/kn;->e:La/n0o0;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/ln;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/kn;->d:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, La/fee;

    .line 17
    .line 18
    invoke-virtual {v3, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v0, La/kn;->e:La/n0o0;

    .line 22
    .line 23
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, La/fee;

    .line 28
    .line 29
    invoke-virtual {v4, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v4, v1, La/ln;->b:La/j0g0;

    .line 33
    .line 34
    iget-boolean v5, v1, La/ln;->a:Z

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    if-nez v4, :cond_0

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    move v13, v7

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move v13, v6

    .line 45
    :goto_0
    if-eqz v13, :cond_2

    .line 46
    .line 47
    new-instance v8, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v9, 0xc

    .line 50
    .line 51
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    move v10, v6

    .line 55
    :goto_1
    if-ge v10, v9, :cond_1

    .line 56
    .line 57
    new-instance v11, La/gm;

    .line 58
    .line 59
    const-string v12, "ACTIVE_TEAMS_SHIMMER_KEY"

    .line 60
    .line 61
    invoke-static {v10, v12}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    invoke-direct {v11, v12}, La/gm;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    add-int/lit8 v10, v10, 0x1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-static {v8}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    :goto_2
    move-object v11, v8

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    if-eqz v4, :cond_3

    .line 81
    .line 82
    iget-object v8, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 83
    .line 84
    instance-of v8, v8, La/g0g0;

    .line 85
    .line 86
    xor-int/2addr v8, v7

    .line 87
    if-ne v8, v7, :cond_3

    .line 88
    .line 89
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    check-cast v8, La/fee;

    .line 94
    .line 95
    invoke-virtual {v8}, La/fee;->b()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    check-cast v8, Ljava/lang/Iterable;

    .line 100
    .line 101
    invoke-static {v8}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    goto :goto_2

    .line 106
    :cond_3
    sget-object v8, La/lak0;->c:La/lak0;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_3
    new-instance v8, La/nn;

    .line 110
    .line 111
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, La/fee;

    .line 116
    .line 117
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    move-object v9, v2

    .line 122
    check-cast v9, La/imm;

    .line 123
    .line 124
    if-eqz v4, :cond_6

    .line 125
    .line 126
    iget-object v2, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 127
    .line 128
    instance-of v10, v2, La/g0g0;

    .line 129
    .line 130
    xor-int/lit8 v12, v10, 0x1

    .line 131
    .line 132
    if-ne v12, v7, :cond_6

    .line 133
    .line 134
    if-eqz v10, :cond_4

    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    :cond_4
    check-cast v2, Ljava/util/Collection;

    .line 138
    .line 139
    if-eqz v2, :cond_5

    .line 140
    .line 141
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_6

    .line 146
    .line 147
    :cond_5
    move v6, v7

    .line 148
    :cond_6
    iget-object v14, v0, La/kn;->b:La/g2v;

    .line 149
    .line 150
    move-object v2, v8

    .line 151
    iget-wide v7, v0, La/kn;->c:J

    .line 152
    .line 153
    if-eqz v4, :cond_7

    .line 154
    .line 155
    iget-object v0, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 156
    .line 157
    instance-of v0, v0, La/g0g0;

    .line 158
    .line 159
    const/4 v10, 0x1

    .line 160
    if-ne v0, v10, :cond_7

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_7
    if-nez v6, :cond_8

    .line 164
    .line 165
    if-nez v4, :cond_9

    .line 166
    .line 167
    :cond_8
    if-nez v5, :cond_9

    .line 168
    .line 169
    :goto_4
    new-instance v0, La/um;

    .line 170
    .line 171
    invoke-static {v7, v8, v14}, La/ozb;->Q(JLa/g2v;)La/mdm;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-direct {v0, v3}, La/um;-><init>(La/mdm;)V

    .line 176
    .line 177
    .line 178
    :goto_5
    move-object v10, v0

    .line 179
    goto :goto_6

    .line 180
    :cond_9
    if-eqz v6, :cond_a

    .line 181
    .line 182
    new-instance v0, La/um;

    .line 183
    .line 184
    invoke-static {v7, v8, v14}, La/ozb;->P(JLa/g2v;)La/mdm;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-direct {v0, v3}, La/um;-><init>(La/mdm;)V

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_a
    if-eqz v4, :cond_b

    .line 193
    .line 194
    iget-object v0, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 195
    .line 196
    instance-of v0, v0, La/g0g0;

    .line 197
    .line 198
    const/4 v10, 0x1

    .line 199
    xor-int/2addr v0, v10

    .line 200
    if-ne v0, v10, :cond_b

    .line 201
    .line 202
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, La/fee;

    .line 207
    .line 208
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, Ljava/util/List;

    .line 213
    .line 214
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_b

    .line 219
    .line 220
    new-instance v0, La/um;

    .line 221
    .line 222
    sget-object v15, La/pb10;->v:La/pb10;

    .line 223
    .line 224
    const-wide/16 v25, 0x0

    .line 225
    .line 226
    const/16 v27, 0x3de

    .line 227
    .line 228
    const/16 v16, 0x0

    .line 229
    .line 230
    const/16 v17, 0x0

    .line 231
    .line 232
    const/16 v18, 0x0

    .line 233
    .line 234
    const/16 v19, 0x0

    .line 235
    .line 236
    const v20, 0x7f130e37

    .line 237
    .line 238
    .line 239
    const/16 v21, 0x0

    .line 240
    .line 241
    const/16 v22, 0x0

    .line 242
    .line 243
    const-wide/16 v23, 0x0

    .line 244
    .line 245
    invoke-static/range {v14 .. v27}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-direct {v0, v3}, La/um;-><init>(La/mdm;)V

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_b
    sget-object v0, La/tm;->a:La/tm;

    .line 254
    .line 255
    goto :goto_5

    .line 256
    :goto_6
    iget-object v12, v1, La/ln;->d:Ljava/lang/String;

    .line 257
    .line 258
    move-object v8, v2

    .line 259
    invoke-direct/range {v8 .. v13}, La/nn;-><init>(La/imm;La/vm;La/a4x;Ljava/lang/String;Z)V

    .line 260
    .line 261
    .line 262
    return-object v2
.end method
