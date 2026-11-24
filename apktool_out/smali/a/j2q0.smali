.class public final synthetic La/j2q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l2q0;


# direct methods
.method public synthetic constructor <init>(La/l2q0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j2q0;->a:B

    iput-object p1, p0, La/j2q0;->b:La/l2q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j2q0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/j2q0;->b:La/l2q0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, v0, La/l2q0;->f1:La/k2q0;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v4, v0, La/l2q0;->A:Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v2, v0, La/l2q0;->f1:La/k2q0;

    .line 33
    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    iput-boolean v1, v2, La/k2q0;->c:Z

    .line 37
    .line 38
    :cond_2
    invoke-static {v0}, La/s0x;->S(La/qai0;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, La/n7x;->I(La/v6z;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, La/vfc;->J(La/ehl;)V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_0
    move-object/from16 v1, p1

    .line 54
    .line 55
    check-cast v1, La/j83;

    .line 56
    .line 57
    iget-object v3, v0, La/l2q0;->f1:La/k2q0;

    .line 58
    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    iget-object v4, v3, La/k2q0;->b:La/j83;

    .line 62
    .line 63
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    iput-object v1, v3, La/k2q0;->b:La/j83;

    .line 71
    .line 72
    iget-object v3, v3, La/k2q0;->d:La/ew40;

    .line 73
    .line 74
    if-eqz v3, :cond_5

    .line 75
    .line 76
    iget-object v4, v0, La/l2q0;->p:La/y9q0;

    .line 77
    .line 78
    iget-object v5, v0, La/l2q0;->q:La/mrq;

    .line 79
    .line 80
    iget v6, v0, La/l2q0;->s:I

    .line 81
    .line 82
    iget-boolean v7, v0, La/l2q0;->t:Z

    .line 83
    .line 84
    iget v8, v0, La/l2q0;->u:I

    .line 85
    .line 86
    iget v9, v0, La/l2q0;->v:I

    .line 87
    .line 88
    sget-object v10, La/iun;->a:La/iun;

    .line 89
    .line 90
    iget-object v11, v0, La/l2q0;->z:La/n05;

    .line 91
    .line 92
    iput-object v1, v3, La/ew40;->a:La/j83;

    .line 93
    .line 94
    invoke-virtual {v3, v4}, La/ew40;->f(La/y9q0;)V

    .line 95
    .line 96
    .line 97
    iput-object v5, v3, La/ew40;->b:La/mrq;

    .line 98
    .line 99
    iput v6, v3, La/ew40;->c:I

    .line 100
    .line 101
    iput-boolean v7, v3, La/ew40;->d:Z

    .line 102
    .line 103
    iput v8, v3, La/ew40;->e:I

    .line 104
    .line 105
    iput v9, v3, La/ew40;->f:I

    .line 106
    .line 107
    iput-object v10, v3, La/ew40;->g:Ljava/util/List;

    .line 108
    .line 109
    iput-object v11, v3, La/ew40;->h:La/n05;

    .line 110
    .line 111
    iget-wide v4, v3, La/ew40;->s:J

    .line 112
    .line 113
    const/4 v1, 0x2

    .line 114
    shl-long/2addr v4, v1

    .line 115
    const-wide/16 v6, 0x2

    .line 116
    .line 117
    or-long/2addr v4, v6

    .line 118
    iput-wide v4, v3, La/ew40;->s:J

    .line 119
    .line 120
    iput-object v2, v3, La/ew40;->m:La/w5z;

    .line 121
    .line 122
    iput-object v2, v3, La/ew40;->o:La/a9q0;

    .line 123
    .line 124
    const/4 v1, -0x1

    .line 125
    iput v1, v3, La/ew40;->q:I

    .line 126
    .line 127
    iput v1, v3, La/ew40;->p:I

    .line 128
    .line 129
    iput-object v2, v3, La/ew40;->r:La/dw40;

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_4
    new-instance v11, La/k2q0;

    .line 133
    .line 134
    iget-object v2, v0, La/l2q0;->o:La/j83;

    .line 135
    .line 136
    invoke-direct {v11, v2, v1}, La/k2q0;-><init>(La/j83;La/j83;)V

    .line 137
    .line 138
    .line 139
    move-object v2, v1

    .line 140
    new-instance v1, La/ew40;

    .line 141
    .line 142
    iget-object v3, v0, La/l2q0;->p:La/y9q0;

    .line 143
    .line 144
    iget-object v4, v0, La/l2q0;->q:La/mrq;

    .line 145
    .line 146
    iget v5, v0, La/l2q0;->s:I

    .line 147
    .line 148
    iget-boolean v6, v0, La/l2q0;->t:Z

    .line 149
    .line 150
    iget v7, v0, La/l2q0;->u:I

    .line 151
    .line 152
    iget v8, v0, La/l2q0;->v:I

    .line 153
    .line 154
    sget-object v9, La/iun;->a:La/iun;

    .line 155
    .line 156
    iget-object v10, v0, La/l2q0;->z:La/n05;

    .line 157
    .line 158
    invoke-direct/range {v1 .. v10}, La/ew40;-><init>(La/j83;La/y9q0;La/mrq;IZIILjava/util/List;La/n05;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, La/l2q0;->Z0()La/ew40;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iget-object v2, v2, La/ew40;->k:La/w6k;

    .line 166
    .line 167
    invoke-virtual {v1, v2}, La/ew40;->d(La/w6k;)V

    .line 168
    .line 169
    .line 170
    iput-object v1, v11, La/k2q0;->d:La/ew40;

    .line 171
    .line 172
    iput-object v11, v0, La/l2q0;->f1:La/k2q0;

    .line 173
    .line 174
    :cond_5
    :goto_1
    invoke-static {v0}, La/s0x;->S(La/qai0;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, La/n7x;->I(La/v6z;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v0}, La/vfc;->J(La/ehl;)V

    .line 181
    .line 182
    .line 183
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 184
    .line 185
    return-object v0

    .line 186
    :pswitch_1
    move-object/from16 v1, p1

    .line 187
    .line 188
    check-cast v1, Ljava/util/List;

    .line 189
    .line 190
    invoke-virtual {v0}, La/l2q0;->Z0()La/ew40;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    iget-object v5, v5, La/ew40;->o:La/a9q0;

    .line 195
    .line 196
    if-eqz v5, :cond_7

    .line 197
    .line 198
    iget-object v2, v5, La/a9q0;->a:La/z8q0;

    .line 199
    .line 200
    new-instance v6, La/z8q0;

    .line 201
    .line 202
    iget-object v7, v2, La/z8q0;->a:La/j83;

    .line 203
    .line 204
    iget-object v8, v0, La/l2q0;->p:La/y9q0;

    .line 205
    .line 206
    iget-object v0, v0, La/l2q0;->y:La/n4d;

    .line 207
    .line 208
    if-eqz v0, :cond_6

    .line 209
    .line 210
    invoke-interface {v0}, La/n4d;->a()J

    .line 211
    .line 212
    .line 213
    move-result-wide v9

    .line 214
    goto :goto_2

    .line 215
    :cond_6
    sget-wide v9, La/y3d;->g:J

    .line 216
    .line 217
    :goto_2
    const-wide/16 v19, 0x0

    .line 218
    .line 219
    const v21, 0xfffffe

    .line 220
    .line 221
    .line 222
    const-wide/16 v11, 0x0

    .line 223
    .line 224
    const/4 v13, 0x0

    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const-wide/16 v16, 0x0

    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    .line 231
    invoke-static/range {v8 .. v21}, La/y9q0;->e(La/y9q0;JJLa/psq;La/lsq;La/nrq;JIJI)La/y9q0;

    .line 232
    .line 233
    .line 234
    move-result-object v8

    .line 235
    iget-object v9, v2, La/z8q0;->c:Ljava/util/List;

    .line 236
    .line 237
    iget v10, v2, La/z8q0;->d:I

    .line 238
    .line 239
    iget-boolean v11, v2, La/z8q0;->e:Z

    .line 240
    .line 241
    iget v12, v2, La/z8q0;->f:I

    .line 242
    .line 243
    iget-object v13, v2, La/z8q0;->g:La/w6k;

    .line 244
    .line 245
    iget-object v14, v2, La/z8q0;->h:La/k6z;

    .line 246
    .line 247
    iget-object v15, v2, La/z8q0;->i:La/mrq;

    .line 248
    .line 249
    iget-wide v3, v2, La/z8q0;->j:J

    .line 250
    .line 251
    move-wide/from16 v16, v3

    .line 252
    .line 253
    invoke-direct/range {v6 .. v17}, La/z8q0;-><init>(La/j83;La/y9q0;Ljava/util/List;IZILa/w6k;La/k6z;La/mrq;J)V

    .line 254
    .line 255
    .line 256
    iget-wide v2, v5, La/a9q0;->c:J

    .line 257
    .line 258
    new-instance v4, La/a9q0;

    .line 259
    .line 260
    iget-object v5, v5, La/a9q0;->b:La/bw40;

    .line 261
    .line 262
    invoke-direct {v4, v6, v5, v2, v3}, La/a9q0;-><init>(La/z8q0;La/bw40;J)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-object v2, v4

    .line 269
    :cond_7
    if-eqz v2, :cond_8

    .line 270
    .line 271
    const/4 v3, 0x1

    .line 272
    goto :goto_3

    .line 273
    :cond_8
    const/4 v3, 0x0

    .line 274
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    return-object v0

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
