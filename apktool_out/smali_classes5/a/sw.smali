.class public final synthetic La/sw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/sw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sw;->b:Ljava/lang/String;

    iput-object p2, p0, La/sw;->c:Ljava/lang/String;

    iput-boolean p3, p0, La/sw;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/sw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sw;->b:Ljava/lang/String;

    iput-boolean p2, p0, La/sw;->d:Z

    iput-object p3, p0, La/sw;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput-byte v0, p0, La/sw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/sw;->d:Z

    iput-object p2, p0, La/sw;->b:Ljava/lang/String;

    iput-object p3, p0, La/sw;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sw;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-boolean v4, v0, La/sw;->d:Z

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/fet;

    .line 16
    .line 17
    move-object/from16 v6, p2

    .line 18
    .line 19
    check-cast v6, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    and-int/lit8 v7, v6, 0x3

    .line 26
    .line 27
    const/4 v8, 0x2

    .line 28
    if-eq v7, v8, :cond_0

    .line 29
    .line 30
    move v5, v3

    .line 31
    :cond_0
    and-int/2addr v6, v3

    .line 32
    invoke-virtual {v1, v6, v5}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_3

    .line 37
    .line 38
    iget-object v5, v0, La/sw;->b:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v0, v0, La/sw;->c:Ljava/lang/String;

    .line 41
    .line 42
    const-string v6, " - "

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    invoke-static {v5, v6, v0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_0
    move-object v6, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v0, v6, v5}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_0

    .line 57
    :goto_1
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 58
    .line 59
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, La/g1t0;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 79
    .line 80
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 81
    .line 82
    .line 83
    move-result-wide v8

    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    move/from16 v20, v3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_2
    move/from16 v20, v2

    .line 90
    .line 91
    :goto_2
    const/16 v24, 0x0

    .line 92
    .line 93
    const v25, 0xfefffe

    .line 94
    .line 95
    .line 96
    const-wide/16 v10, 0x0

    .line 97
    .line 98
    const/4 v12, 0x0

    .line 99
    const/4 v13, 0x0

    .line 100
    const/4 v14, 0x0

    .line 101
    const-wide/16 v15, 0x0

    .line 102
    .line 103
    const/16 v17, 0x0

    .line 104
    .line 105
    const/16 v18, 0x0

    .line 106
    .line 107
    const/16 v19, 0x0

    .line 108
    .line 109
    const-wide/16 v21, 0x0

    .line 110
    .line 111
    const/16 v23, 0x0

    .line 112
    .line 113
    invoke-static/range {v7 .. v25}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    sget-object v0, La/jm40;->b:La/jm40;

    .line 118
    .line 119
    const-string v2, "DATE_TIME_INFO_TEXT"

    .line 120
    .line 121
    invoke-static {v0, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    const v17, 0x1b6030

    .line 126
    .line 127
    .line 128
    const/16 v18, 0x388

    .line 129
    .line 130
    const/4 v9, 0x0

    .line 131
    const/4 v10, 0x2

    .line 132
    const/4 v11, 0x0

    .line 133
    const/4 v12, 0x1

    .line 134
    const/4 v13, 0x0

    .line 135
    const/4 v15, 0x0

    .line 136
    move-object/from16 v16, v1

    .line 137
    .line 138
    invoke-static/range {v6 .. v18}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_3
    move-object/from16 v16, v1

    .line 143
    .line 144
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 145
    .line 146
    .line 147
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object v0

    .line 150
    :pswitch_0
    move-object/from16 v1, p1

    .line 151
    .line 152
    check-cast v1, La/oyg0;

    .line 153
    .line 154
    move-object/from16 v6, p2

    .line 155
    .line 156
    check-cast v6, La/yx8;

    .line 157
    .line 158
    iget-object v1, v6, La/yx8;->c:La/xx8;

    .line 159
    .line 160
    iget-object v8, v1, La/xx8;->a:Ljava/lang/String;

    .line 161
    .line 162
    iget-boolean v11, v1, La/xx8;->b:Z

    .line 163
    .line 164
    iget-object v12, v1, La/xx8;->e:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object v9, v0, La/sw;->b:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    iget-object v10, v0, La/sw;->c:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    new-instance v7, La/xx8;

    .line 183
    .line 184
    invoke-direct/range {v7 .. v12}, La/xx8;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 185
    .line 186
    .line 187
    iget-object v0, v6, La/yx8;->b:La/vx8;

    .line 188
    .line 189
    if-eqz v4, :cond_4

    .line 190
    .line 191
    invoke-static {v0, v5, v2}, La/vx8;->a(La/vx8;ZI)La/vx8;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    :cond_4
    move-object v8, v0

    .line 196
    const/4 v15, 0x0

    .line 197
    const v16, 0xffff9

    .line 198
    .line 199
    .line 200
    move-object v9, v7

    .line 201
    const/4 v7, 0x0

    .line 202
    const/4 v10, 0x0

    .line 203
    const/4 v11, 0x0

    .line 204
    const/4 v12, 0x0

    .line 205
    const/4 v13, 0x0

    .line 206
    const/4 v14, 0x0

    .line 207
    invoke-static/range {v6 .. v16}, La/yx8;->a(La/yx8;La/wx8;La/vx8;La/xx8;ZLa/ql5;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZI)La/yx8;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :pswitch_1
    move-object/from16 v1, p1

    .line 213
    .line 214
    check-cast v1, La/oyg0;

    .line 215
    .line 216
    move-object/from16 v6, p2

    .line 217
    .line 218
    check-cast v6, La/lw;

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    iget-object v12, v0, La/sw;->b:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_5

    .line 233
    .line 234
    move v9, v3

    .line 235
    goto :goto_4

    .line 236
    :cond_5
    move v9, v5

    .line 237
    :goto_4
    invoke-static {v12}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    iget-boolean v10, v0, La/sw;->d:Z

    .line 250
    .line 251
    if-lez v1, :cond_6

    .line 252
    .line 253
    iget-object v1, v6, La/lw;->b:La/xuf;

    .line 254
    .line 255
    iget-boolean v1, v1, La/xuf;->o:Z

    .line 256
    .line 257
    if-nez v1, :cond_6

    .line 258
    .line 259
    if-nez v10, :cond_6

    .line 260
    .line 261
    move v13, v3

    .line 262
    goto :goto_5

    .line 263
    :cond_6
    move v13, v5

    .line 264
    :goto_5
    const/4 v8, 0x0

    .line 265
    const/4 v14, 0x3

    .line 266
    const/4 v7, 0x0

    .line 267
    iget-object v11, v0, La/sw;->c:Ljava/lang/String;

    .line 268
    .line 269
    invoke-static/range {v6 .. v14}, La/lw;->a(La/lw;ZLa/xuf;ZZLjava/lang/String;Ljava/lang/String;ZI)La/lw;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    return-object v0

    .line 274
    nop

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
