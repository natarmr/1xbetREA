.class public final synthetic La/h3s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k9s;


# direct methods
.method public synthetic constructor <init>(La/k9s;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h3s;->a:B

    iput-object p1, p0, La/h3s;->b:La/k9s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h3s;->a:B

    .line 4
    .line 5
    const-string v2, "KEY_LIVE"

    .line 6
    .line 7
    const-string v3, "KEY_GAME_ID"

    .line 8
    .line 9
    iget-object v0, v0, La/h3s;->b:La/k9s;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/oyg0;

    .line 17
    .line 18
    move-object/from16 v4, p2

    .line 19
    .line 20
    check-cast v4, La/z2s;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-wide v5, v0, La/k9s;->a:J

    .line 29
    .line 30
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-static {v1, v7, v3}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v7, v0, La/k9s;->g:Ljava/lang/String;

    .line 38
    .line 39
    iget-wide v8, v0, La/k9s;->b:J

    .line 40
    .line 41
    move-wide v10, v8

    .line 42
    iget-boolean v9, v0, La/k9s;->z:Z

    .line 43
    .line 44
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v1, v3, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-boolean v1, v0, La/k9s;->W:Z

    .line 52
    .line 53
    invoke-interface {v0}, La/l9s;->s()Z

    .line 54
    .line 55
    .line 56
    move-result v23

    .line 57
    iget-boolean v2, v0, La/k9s;->v:Z

    .line 58
    .line 59
    move-wide v12, v10

    .line 60
    iget-wide v10, v0, La/k9s;->s:J

    .line 61
    .line 62
    iget-object v3, v0, La/k9s;->A:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v8, v0, La/k9s;->j:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v14, v0, La/k9s;->F:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v15, v0, La/k9s;->Z:La/vzj0;

    .line 69
    .line 70
    iget-object v0, v0, La/k9s;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    const v48, -0x20653820

    .line 77
    .line 78
    .line 79
    const v49, 0xffff

    .line 80
    .line 81
    .line 82
    move-object/from16 v17, v8

    .line 83
    .line 84
    move-object v8, v12

    .line 85
    const-wide/16 v12, 0x0

    .line 86
    .line 87
    move-object/from16 v18, v14

    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    move-object/from16 v27, v15

    .line 91
    .line 92
    const/4 v15, 0x0

    .line 93
    const/16 v19, 0x0

    .line 94
    .line 95
    const/16 v20, 0x0

    .line 96
    .line 97
    const/16 v22, 0x0

    .line 98
    .line 99
    const/16 v24, 0x0

    .line 100
    .line 101
    const/16 v25, 0x0

    .line 102
    .line 103
    const/16 v28, 0x0

    .line 104
    .line 105
    const/16 v29, 0x0

    .line 106
    .line 107
    const/16 v30, 0x0

    .line 108
    .line 109
    const/16 v31, 0x0

    .line 110
    .line 111
    const/16 v33, 0x0

    .line 112
    .line 113
    const/16 v34, 0x0

    .line 114
    .line 115
    const/16 v35, 0x0

    .line 116
    .line 117
    const/16 v36, 0x0

    .line 118
    .line 119
    const/16 v37, 0x0

    .line 120
    .line 121
    const/16 v38, 0x0

    .line 122
    .line 123
    const/16 v39, 0x0

    .line 124
    .line 125
    const/16 v40, 0x0

    .line 126
    .line 127
    const/16 v41, 0x0

    .line 128
    .line 129
    const/16 v42, 0x0

    .line 130
    .line 131
    const/16 v43, 0x0

    .line 132
    .line 133
    const/16 v44, 0x0

    .line 134
    .line 135
    const/16 v45, 0x0

    .line 136
    .line 137
    const/16 v46, 0x0

    .line 138
    .line 139
    const/16 v47, 0x0

    .line 140
    .line 141
    move-object/from16 v32, v0

    .line 142
    .line 143
    move/from16 v21, v1

    .line 144
    .line 145
    move/from16 v26, v2

    .line 146
    .line 147
    move-object/from16 v16, v3

    .line 148
    .line 149
    invoke-static/range {v4 .. v49}, La/z2s;->a(La/z2s;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/irs;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;II)La/z2s;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0

    .line 154
    :pswitch_0
    move-object/from16 v1, p1

    .line 155
    .line 156
    check-cast v1, La/oyg0;

    .line 157
    .line 158
    move-object/from16 v4, p2

    .line 159
    .line 160
    check-cast v4, La/z2s;

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 169
    .line 170
    const-string v6, "KEY_SHOW_SUB_GAMES"

    .line 171
    .line 172
    invoke-static {v1, v5, v6}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    iget-wide v5, v0, La/k9s;->a:J

    .line 176
    .line 177
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-static {v1, v7, v3}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    iget-object v7, v0, La/k9s;->g:Ljava/lang/String;

    .line 185
    .line 186
    iget-wide v8, v0, La/k9s;->b:J

    .line 187
    .line 188
    move-wide v10, v8

    .line 189
    iget-boolean v9, v0, La/k9s;->z:Z

    .line 190
    .line 191
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-static {v1, v3, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    iget-boolean v1, v0, La/k9s;->W:Z

    .line 199
    .line 200
    invoke-interface {v0}, La/l9s;->s()Z

    .line 201
    .line 202
    .line 203
    move-result v23

    .line 204
    iget-boolean v2, v0, La/k9s;->v:Z

    .line 205
    .line 206
    move-wide v12, v10

    .line 207
    iget-wide v10, v0, La/k9s;->s:J

    .line 208
    .line 209
    iget-object v0, v0, La/k9s;->l:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    const v48, 0x5fdaffe0

    .line 216
    .line 217
    .line 218
    const v49, 0xfffe

    .line 219
    .line 220
    .line 221
    const-wide/16 v12, 0x0

    .line 222
    .line 223
    const/4 v14, 0x0

    .line 224
    const/4 v15, 0x0

    .line 225
    const/16 v16, 0x0

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    .line 231
    const/16 v19, 0x0

    .line 232
    .line 233
    const/16 v20, 0x0

    .line 234
    .line 235
    const/16 v22, 0x0

    .line 236
    .line 237
    const/16 v24, 0x0

    .line 238
    .line 239
    const/16 v25, 0x0

    .line 240
    .line 241
    const/16 v27, 0x0

    .line 242
    .line 243
    const/16 v28, 0x0

    .line 244
    .line 245
    const/16 v29, 0x0

    .line 246
    .line 247
    const/16 v30, 0x0

    .line 248
    .line 249
    const/16 v31, 0x0

    .line 250
    .line 251
    const/16 v33, 0x1

    .line 252
    .line 253
    const/16 v34, 0x0

    .line 254
    .line 255
    const/16 v35, 0x0

    .line 256
    .line 257
    const/16 v36, 0x0

    .line 258
    .line 259
    const/16 v37, 0x0

    .line 260
    .line 261
    const/16 v38, 0x0

    .line 262
    .line 263
    const/16 v39, 0x0

    .line 264
    .line 265
    const/16 v40, 0x0

    .line 266
    .line 267
    const/16 v41, 0x0

    .line 268
    .line 269
    const/16 v42, 0x0

    .line 270
    .line 271
    const/16 v43, 0x0

    .line 272
    .line 273
    const/16 v44, 0x0

    .line 274
    .line 275
    const/16 v45, 0x0

    .line 276
    .line 277
    const/16 v46, 0x0

    .line 278
    .line 279
    const/16 v47, 0x0

    .line 280
    .line 281
    move-object/from16 v32, v0

    .line 282
    .line 283
    move/from16 v21, v1

    .line 284
    .line 285
    move/from16 v26, v2

    .line 286
    .line 287
    invoke-static/range {v4 .. v49}, La/z2s;->a(La/z2s;JLjava/lang/String;Ljava/lang/Long;ZJJLjava/lang/Long;La/t3z;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZLjava/lang/String;Ljava/lang/String;ZZLa/fsr;La/xvm0;La/js20;La/dja;La/irs;La/dja;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;ZLjava/util/List;II)La/z2s;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    return-object v0

    .line 292
    nop

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
