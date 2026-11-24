.class public final synthetic La/hh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:La/nn20;


# direct methods
.method public synthetic constructor <init>(ZLa/nn20;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hh20;->a:B

    iput-boolean p1, p0, La/hh20;->b:Z

    iput-object p2, p0, La/hh20;->c:La/nn20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hh20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, v0, La/hh20;->c:La/nn20;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/oyg0;

    .line 16
    .line 17
    move-object/from16 v6, p2

    .line 18
    .line 19
    check-cast v6, La/b820;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v7, v6, La/b820;->d:La/rvj0;

    .line 28
    .line 29
    iget-object v1, v7, La/rvj0;->a:La/dx6;

    .line 30
    .line 31
    iget-object v8, v1, La/dx6;->b:La/vw6;

    .line 32
    .line 33
    const/16 v25, 0x0

    .line 34
    .line 35
    const/16 v27, 0x7fff

    .line 36
    .line 37
    const-wide/16 v9, 0x0

    .line 38
    .line 39
    const-wide/16 v11, 0x0

    .line 40
    .line 41
    const-wide/16 v13, 0x0

    .line 42
    .line 43
    const-wide/16 v15, 0x0

    .line 44
    .line 45
    const-wide/16 v17, 0x0

    .line 46
    .line 47
    const/16 v19, 0x0

    .line 48
    .line 49
    const/16 v20, 0x0

    .line 50
    .line 51
    const/16 v21, 0x0

    .line 52
    .line 53
    const/16 v22, 0x0

    .line 54
    .line 55
    const/16 v23, 0x0

    .line 56
    .line 57
    const/16 v24, 0x0

    .line 58
    .line 59
    iget-boolean v0, v0, La/hh20;->b:Z

    .line 60
    .line 61
    move/from16 v26, v0

    .line 62
    .line 63
    invoke-static/range {v8 .. v27}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move/from16 v8, v26

    .line 68
    .line 69
    const/4 v9, 0x1

    .line 70
    invoke-static {v1, v4, v0, v9}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, v7, La/rvj0;->b:La/mnb0;

    .line 75
    .line 76
    invoke-virtual {v5, v8}, La/nn20;->h0(Z)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {v1, v3, v5, v4, v2}, La/mnb0;->a(La/mnb0;ZLjava/lang/String;Ljava/lang/String;I)La/mnb0;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    const/4 v12, 0x0

    .line 85
    const/16 v13, 0x1c

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v11, 0x0

    .line 89
    move-object v8, v0

    .line 90
    invoke-static/range {v7 .. v13}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    const/16 v18, 0x0

    .line 95
    .line 96
    const/16 v19, 0x1ff7

    .line 97
    .line 98
    const/4 v7, 0x0

    .line 99
    const/4 v8, 0x0

    .line 100
    const/4 v9, 0x0

    .line 101
    const/4 v13, 0x0

    .line 102
    const/4 v14, 0x0

    .line 103
    const/4 v15, 0x0

    .line 104
    const/16 v16, 0x0

    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    invoke-static/range {v6 .. v19}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    return-object v0

    .line 113
    :pswitch_0
    move-object/from16 v1, p1

    .line 114
    .line 115
    check-cast v1, La/oyg0;

    .line 116
    .line 117
    move-object/from16 v6, p2

    .line 118
    .line 119
    check-cast v6, La/b820;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v7, v6, La/b820;->d:La/rvj0;

    .line 128
    .line 129
    iget-object v1, v6, La/b820;->f:La/gx4;

    .line 130
    .line 131
    iget-object v8, v7, La/rvj0;->c:La/kwo0;

    .line 132
    .line 133
    const/4 v13, 0x0

    .line 134
    const/16 v14, 0x3e

    .line 135
    .line 136
    iget-boolean v9, v0, La/hh20;->b:Z

    .line 137
    .line 138
    const/4 v10, 0x0

    .line 139
    const-wide/16 v11, 0x0

    .line 140
    .line 141
    invoke-static/range {v8 .. v14}, La/kwo0;->a(La/kwo0;ZZDLjava/util/List;I)La/kwo0;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    move/from16 v16, v9

    .line 146
    .line 147
    iget-object v0, v7, La/rvj0;->b:La/mnb0;

    .line 148
    .line 149
    iget-object v8, v7, La/rvj0;->a:La/dx6;

    .line 150
    .line 151
    iget-object v8, v8, La/dx6;->b:La/vw6;

    .line 152
    .line 153
    iget-boolean v8, v8, La/vw6;->p:Z

    .line 154
    .line 155
    invoke-virtual {v5, v8}, La/nn20;->h0(Z)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-static {v0, v3, v8, v4, v2}, La/mnb0;->a(La/mnb0;ZLjava/lang/String;Ljava/lang/String;I)La/mnb0;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    const/4 v12, 0x0

    .line 164
    const/16 v13, 0x19

    .line 165
    .line 166
    const/4 v8, 0x0

    .line 167
    const/4 v11, 0x0

    .line 168
    invoke-static/range {v7 .. v13}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iget-object v7, v6, La/b820;->e:La/czc0;

    .line 173
    .line 174
    if-eqz v7, :cond_0

    .line 175
    .line 176
    iget-object v8, v7, La/czc0;->c:La/qlc0;

    .line 177
    .line 178
    xor-int/lit8 v26, v16, 0x1

    .line 179
    .line 180
    const/16 v28, 0x0

    .line 181
    .line 182
    const/16 v29, 0xdf

    .line 183
    .line 184
    const-wide/16 v18, 0x0

    .line 185
    .line 186
    const/16 v20, 0x0

    .line 187
    .line 188
    const/16 v21, 0x0

    .line 189
    .line 190
    const-wide/16 v22, 0x0

    .line 191
    .line 192
    const-wide/16 v24, 0x0

    .line 193
    .line 194
    const/16 v27, 0x0

    .line 195
    .line 196
    move-object/from16 v17, v8

    .line 197
    .line 198
    invoke-static/range {v17 .. v29}, La/qlc0;->a(La/qlc0;DLjava/lang/String;Ljava/lang/String;DDZZZI)La/qlc0;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    const/4 v11, 0x0

    .line 203
    const/16 v12, 0x1b

    .line 204
    .line 205
    const/4 v8, 0x0

    .line 206
    const/4 v10, 0x0

    .line 207
    invoke-static/range {v7 .. v12}, La/czc0;->a(La/czc0;La/tyc0;La/qlc0;ZZI)La/czc0;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    goto :goto_0

    .line 212
    :cond_0
    move-object v7, v4

    .line 213
    :goto_0
    if-eqz v1, :cond_1

    .line 214
    .line 215
    iget-object v15, v1, La/gx4;->d:La/kwo0;

    .line 216
    .line 217
    const/16 v20, 0x0

    .line 218
    .line 219
    const/16 v21, 0x3e

    .line 220
    .line 221
    const/16 v17, 0x0

    .line 222
    .line 223
    const-wide/16 v18, 0x0

    .line 224
    .line 225
    invoke-static/range {v15 .. v21}, La/kwo0;->a(La/kwo0;ZZDLjava/util/List;I)La/kwo0;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    iget-object v8, v1, La/gx4;->e:La/mnb0;

    .line 230
    .line 231
    invoke-virtual {v5, v3}, La/nn20;->h0(Z)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-static {v8, v3, v5, v4, v2}, La/mnb0;->a(La/mnb0;ZLjava/lang/String;Ljava/lang/String;I)La/mnb0;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    const/4 v14, 0x7

    .line 240
    const/4 v9, 0x0

    .line 241
    const/4 v10, 0x0

    .line 242
    const/4 v11, 0x0

    .line 243
    move-object v8, v1

    .line 244
    invoke-static/range {v8 .. v14}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    :cond_1
    move-object v12, v4

    .line 249
    const/16 v18, 0x0

    .line 250
    .line 251
    const/16 v19, 0x1fc7

    .line 252
    .line 253
    move-object v11, v7

    .line 254
    const/4 v7, 0x0

    .line 255
    const/4 v8, 0x0

    .line 256
    const/4 v9, 0x0

    .line 257
    const/4 v13, 0x0

    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    const/16 v16, 0x0

    .line 261
    .line 262
    const/16 v17, 0x0

    .line 263
    .line 264
    move-object v10, v0

    .line 265
    invoke-static/range {v6 .. v19}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    return-object v0

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
