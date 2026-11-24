.class public final synthetic La/adg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cdg0;

.field public final synthetic c:La/edg0;


# direct methods
.method public synthetic constructor <init>(La/cdg0;La/edg0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/adg0;->a:B

    iput-object p1, p0, La/adg0;->b:La/cdg0;

    iput-object p2, p0, La/adg0;->c:La/edg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/adg0;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, La/adg0;->c:La/edg0;

    .line 12
    .line 13
    iget-object v0, v0, La/adg0;->b:La/cdg0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/y5d;

    .line 21
    .line 22
    move-object/from16 v7, p2

    .line 23
    .line 24
    check-cast v7, La/fet;

    .line 25
    .line 26
    move-object/from16 v8, p3

    .line 27
    .line 28
    check-cast v8, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 v1, v8, 0x11

    .line 38
    .line 39
    if-eq v1, v4, :cond_0

    .line 40
    .line 41
    move v3, v5

    .line 42
    :cond_0
    and-int/lit8 v1, v8, 0x1

    .line 43
    .line 44
    invoke-virtual {v7, v1, v3}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    move-object/from16 v28, v7

    .line 51
    .line 52
    iget-object v7, v0, La/cdg0;->b:Ljava/lang/String;

    .line 53
    .line 54
    sget-object v14, La/j1t0;->b:La/qrq;

    .line 55
    .line 56
    sget-wide v18, La/qmk;->p:J

    .line 57
    .line 58
    sget-wide v20, La/qmk;->C:J

    .line 59
    .line 60
    new-instance v8, La/y9q0;

    .line 61
    .line 62
    move-wide/from16 v11, v18

    .line 63
    .line 64
    const/16 v19, 0x0

    .line 65
    .line 66
    const v22, 0xfdffdd

    .line 67
    .line 68
    .line 69
    const-wide/16 v9, 0x0

    .line 70
    .line 71
    const/4 v13, 0x0

    .line 72
    const-wide/16 v15, 0x0

    .line 73
    .line 74
    const/16 v17, 0x0

    .line 75
    .line 76
    const/16 v18, 0x0

    .line 77
    .line 78
    invoke-direct/range {v8 .. v22}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 79
    .line 80
    .line 81
    sget-wide v16, La/qmk;->o:J

    .line 82
    .line 83
    const-wide/high16 v3, 0x3fd0000000000000L    # 0.25

    .line 84
    .line 85
    invoke-static {v3, v4}, La/idm0;->s(D)J

    .line 86
    .line 87
    .line 88
    move-result-wide v20

    .line 89
    new-instance v15, La/n05;

    .line 90
    .line 91
    move-wide/from16 v18, v11

    .line 92
    .line 93
    invoke-direct/range {v15 .. v21}, La/n05;-><init>(JJJ)V

    .line 94
    .line 95
    .line 96
    sget-wide v20, La/qmk;->q:J

    .line 97
    .line 98
    iget-boolean v0, v0, La/cdg0;->e:Z

    .line 99
    .line 100
    if-eqz v0, :cond_1

    .line 101
    .line 102
    iget-wide v0, v6, La/edg0;->e:J

    .line 103
    .line 104
    :goto_0
    move-wide v9, v0

    .line 105
    goto :goto_1

    .line 106
    :cond_1
    iget-wide v0, v6, La/edg0;->f:J

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :goto_1
    const-string v0, "MONTH_CONTENT"

    .line 110
    .line 111
    invoke-static {v2, v0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const/16 v30, 0x6180

    .line 116
    .line 117
    const v31, 0x1a7f0

    .line 118
    .line 119
    .line 120
    const-wide/16 v12, 0x0

    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    move-object v11, v15

    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const-wide/16 v17, 0x0

    .line 128
    .line 129
    const/16 v19, 0x0

    .line 130
    .line 131
    const/16 v22, 0x2

    .line 132
    .line 133
    const/16 v23, 0x0

    .line 134
    .line 135
    const/16 v24, 0x1

    .line 136
    .line 137
    const/16 v25, 0x0

    .line 138
    .line 139
    const/16 v26, 0x0

    .line 140
    .line 141
    const/16 v29, 0x30

    .line 142
    .line 143
    move-object/from16 v27, v8

    .line 144
    .line 145
    move-object v8, v0

    .line 146
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_2
    move-object/from16 v28, v7

    .line 151
    .line 152
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 153
    .line 154
    .line 155
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0

    .line 158
    :pswitch_0
    move-object/from16 v1, p1

    .line 159
    .line 160
    check-cast v1, La/y5d;

    .line 161
    .line 162
    move-object/from16 v7, p2

    .line 163
    .line 164
    check-cast v7, La/fet;

    .line 165
    .line 166
    move-object/from16 v8, p3

    .line 167
    .line 168
    check-cast v8, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    and-int/lit8 v1, v8, 0x11

    .line 178
    .line 179
    if-eq v1, v4, :cond_3

    .line 180
    .line 181
    move v3, v5

    .line 182
    :cond_3
    and-int/lit8 v1, v8, 0x1

    .line 183
    .line 184
    invoke-virtual {v7, v1, v3}, La/fet;->U(IZ)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_5

    .line 189
    .line 190
    move-object/from16 v28, v7

    .line 191
    .line 192
    iget-object v7, v0, La/cdg0;->a:Ljava/lang/String;

    .line 193
    .line 194
    sget-object v14, La/j1t0;->b:La/qrq;

    .line 195
    .line 196
    sget-wide v11, La/qmk;->r:J

    .line 197
    .line 198
    sget-wide v20, La/qmk;->F:J

    .line 199
    .line 200
    new-instance v8, La/y9q0;

    .line 201
    .line 202
    const/16 v19, 0x0

    .line 203
    .line 204
    const v22, 0xfdffdd

    .line 205
    .line 206
    .line 207
    const-wide/16 v9, 0x0

    .line 208
    .line 209
    const/4 v13, 0x0

    .line 210
    const-wide/16 v15, 0x0

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    const/16 v18, 0x0

    .line 215
    .line 216
    invoke-direct/range {v8 .. v22}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 217
    .line 218
    .line 219
    sget-wide v20, La/qmk;->t:J

    .line 220
    .line 221
    iget-boolean v0, v0, La/cdg0;->e:Z

    .line 222
    .line 223
    if-eqz v0, :cond_4

    .line 224
    .line 225
    iget-wide v0, v6, La/edg0;->c:J

    .line 226
    .line 227
    :goto_3
    move-wide v9, v0

    .line 228
    goto :goto_4

    .line 229
    :cond_4
    iget-wide v0, v6, La/edg0;->d:J

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :goto_4
    const-string v0, "DAY_CONTENT"

    .line 233
    .line 234
    invoke-static {v2, v0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    const/16 v30, 0x6180

    .line 239
    .line 240
    const v31, 0x1a7f8

    .line 241
    .line 242
    .line 243
    const/4 v11, 0x0

    .line 244
    const-wide/16 v12, 0x0

    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    const/4 v15, 0x0

    .line 248
    const/16 v16, 0x0

    .line 249
    .line 250
    const-wide/16 v17, 0x0

    .line 251
    .line 252
    const/16 v19, 0x0

    .line 253
    .line 254
    const/16 v22, 0x2

    .line 255
    .line 256
    const/16 v23, 0x0

    .line 257
    .line 258
    const/16 v24, 0x1

    .line 259
    .line 260
    const/16 v25, 0x0

    .line 261
    .line 262
    const/16 v26, 0x0

    .line 263
    .line 264
    const/16 v29, 0x30

    .line 265
    .line 266
    move-object/from16 v27, v8

    .line 267
    .line 268
    move-object v8, v0

    .line 269
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 270
    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_5
    move-object/from16 v28, v7

    .line 274
    .line 275
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 276
    .line 277
    .line 278
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 279
    .line 280
    return-object v0

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
