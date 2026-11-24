.class public final synthetic La/bbr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/cgk0;

.field public final synthetic c:La/cgk0;

.field public final synthetic d:La/cgk0;

.field public final synthetic e:La/dk5;

.field public final synthetic f:Z

.field public final synthetic g:La/pz40;

.field public final synthetic h:La/l7m0;


# direct methods
.method public synthetic constructor <init>(ZLa/cgk0;La/cgk0;La/cgk0;La/dk5;ZLa/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/bbr;->a:Z

    iput-object p2, p0, La/bbr;->b:La/cgk0;

    iput-object p3, p0, La/bbr;->c:La/cgk0;

    iput-object p4, p0, La/bbr;->d:La/cgk0;

    iput-object p5, p0, La/bbr;->e:La/dk5;

    iput-boolean p6, p0, La/bbr;->f:Z

    iput-object p7, p0, La/bbr;->g:La/pz40;

    iput-object p8, p0, La/bbr;->h:La/l7m0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/ir8;

    .line 6
    .line 7
    move-object/from16 v6, p2

    .line 8
    .line 9
    check-cast v6, La/fet;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v1, v2, 0x11

    .line 23
    .line 24
    const/16 v3, 0x10

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    const/4 v8, 0x0

    .line 28
    if-eq v1, v3, :cond_0

    .line 29
    .line 30
    move v1, v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v8

    .line 33
    :goto_0
    and-int/2addr v2, v4

    .line 34
    invoke-virtual {v6, v2, v1}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_e

    .line 39
    .line 40
    iget-object v1, v0, La/bbr;->h:La/l7m0;

    .line 41
    .line 42
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/pk5;

    .line 47
    .line 48
    iget-boolean v2, v0, La/bbr;->a:Z

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    if-nez v1, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    instance-of v5, v1, La/nk5;

    .line 55
    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    move-object v3, v1

    .line 59
    check-cast v3, La/nk5;

    .line 60
    .line 61
    iget-object v3, v3, La/nk5;->a:La/jkm;

    .line 62
    .line 63
    :cond_2
    :goto_1
    move-object v9, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    instance-of v5, v1, La/mk5;

    .line 66
    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    move-object v3, v1

    .line 72
    check-cast v3, La/mk5;

    .line 73
    .line 74
    iget-object v3, v3, La/mk5;->d:La/jkm;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :goto_2
    instance-of v3, v1, La/mk5;

    .line 78
    .line 79
    iget-object v12, v0, La/bbr;->e:La/dk5;

    .line 80
    .line 81
    sget-object v10, La/ukd;->a:La/cl5;

    .line 82
    .line 83
    if-eqz v3, :cond_b

    .line 84
    .line 85
    const v3, -0x86af4fe

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v3}, La/fet;->e0(I)V

    .line 89
    .line 90
    .line 91
    check-cast v1, La/mk5;

    .line 92
    .line 93
    iget-object v1, v1, La/mk5;->f:La/gmq;

    .line 94
    .line 95
    invoke-static {v1, v6}, La/kdz;->a(La/gmq;La/fet;)La/hdz;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v3}, La/hdz;->e()La/h7d;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-object v1, v1, La/h7d;->a:La/mva;

    .line 104
    .line 105
    if-nez v1, :cond_4

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    instance-of v5, v1, La/zo00;

    .line 109
    .line 110
    iget-object v7, v0, La/bbr;->b:La/cgk0;

    .line 111
    .line 112
    iget-object v11, v0, La/bbr;->c:La/cgk0;

    .line 113
    .line 114
    iget-object v13, v0, La/bbr;->d:La/cgk0;

    .line 115
    .line 116
    if-eqz v5, :cond_5

    .line 117
    .line 118
    invoke-virtual {v7, v4}, La/cgk0;->m(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v11, v4}, La/cgk0;->m(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v13, v8}, La/cgk0;->m(I)V

    .line 125
    .line 126
    .line 127
    check-cast v1, La/zo00;

    .line 128
    .line 129
    iget-object v1, v1, La/zo00;->b:Ljava/lang/Throwable;

    .line 130
    .line 131
    invoke-virtual {v12, v1}, La/dk5;->J(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    instance-of v1, v1, La/bp00;

    .line 136
    .line 137
    if-eqz v1, :cond_6

    .line 138
    .line 139
    invoke-virtual {v7, v8}, La/cgk0;->m(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11, v4}, La/cgk0;->m(I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13, v8}, La/cgk0;->m(I)V

    .line 146
    .line 147
    .line 148
    :cond_6
    :goto_3
    invoke-virtual {v3}, La/hdz;->e()La/h7d;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    iget-object v1, v1, La/h7d;->c:La/mva;

    .line 153
    .line 154
    instance-of v4, v1, La/zo00;

    .line 155
    .line 156
    if-eqz v4, :cond_7

    .line 157
    .line 158
    check-cast v1, La/zo00;

    .line 159
    .line 160
    iget-object v1, v1, La/zo00;->b:Ljava/lang/Throwable;

    .line 161
    .line 162
    invoke-virtual {v12, v1}, La/dk5;->I(Ljava/lang/Throwable;)V

    .line 163
    .line 164
    .line 165
    :cond_7
    iget-boolean v1, v0, La/bbr;->f:Z

    .line 166
    .line 167
    if-nez v1, :cond_a

    .line 168
    .line 169
    if-nez v2, :cond_a

    .line 170
    .line 171
    const v1, -0x85969bf

    .line 172
    .line 173
    .line 174
    invoke-virtual {v6, v1}, La/fet;->e0(I)V

    .line 175
    .line 176
    .line 177
    iget-object v0, v0, La/bbr;->g:La/pz40;

    .line 178
    .line 179
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    move-object v4, v0

    .line 184
    check-cast v4, La/l4b;

    .line 185
    .line 186
    invoke-virtual {v6, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    if-nez v0, :cond_8

    .line 195
    .line 196
    if-ne v1, v10, :cond_9

    .line 197
    .line 198
    :cond_8
    new-instance v1, La/fj5;

    .line 199
    .line 200
    const/4 v0, 0x3

    .line 201
    invoke-direct {v1, v12, v0}, La/fj5;-><init>(La/dk5;B)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_9
    move-object v5, v1

    .line 208
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 209
    .line 210
    const/16 v7, 0x40

    .line 211
    .line 212
    const/4 v2, 0x0

    .line 213
    invoke-static/range {v2 .. v7}, La/oja0;->x(La/mm40;La/hdz;La/l4b;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_a
    const v0, -0x853104e

    .line 221
    .line 222
    .line 223
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 227
    .line 228
    .line 229
    :goto_4
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_b
    const v0, -0x852ca8e

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6, v8}, La/fet;->r(Z)V

    .line 240
    .line 241
    .line 242
    :goto_5
    invoke-virtual {v6, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    if-nez v0, :cond_c

    .line 251
    .line 252
    if-ne v1, v10, :cond_d

    .line 253
    .line 254
    :cond_c
    new-instance v10, La/wej;

    .line 255
    .line 256
    const/16 v16, 0x0

    .line 257
    .line 258
    const/16 v17, 0x12

    .line 259
    .line 260
    const/4 v11, 0x0

    .line 261
    const-class v13, La/dk5;

    .line 262
    .line 263
    const-string v14, "onRefreshAfterError"

    .line 264
    .line 265
    const-string v15, "onRefreshAfterError()V"

    .line 266
    .line 267
    invoke-direct/range {v10 .. v17}, La/wej;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v6, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    move-object v1, v10

    .line 274
    :cond_d
    check-cast v1, La/jhy;

    .line 275
    .line 276
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 277
    .line 278
    const/4 v0, 0x0

    .line 279
    invoke-static {v9, v0, v1, v6, v8}, La/oja0;->v(La/jkm;FLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_e
    invoke-virtual {v6}, La/fet;->X()V

    .line 284
    .line 285
    .line 286
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object v0
.end method
