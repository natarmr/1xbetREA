.class public final synthetic La/pks;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yks;

.field public final synthetic c:La/fsr;


# direct methods
.method public synthetic constructor <init>(La/fsr;La/yks;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/pks;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pks;->c:La/fsr;

    iput-object p2, p0, La/pks;->b:La/yks;

    return-void
.end method

.method public synthetic constructor <init>(La/yks;La/fsr;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/pks;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/pks;->b:La/yks;

    iput-object p2, p0, La/pks;->c:La/fsr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 51

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pks;->a:B

    .line 4
    .line 5
    const-string v2, "KEY_BROADCASTING_TAB"

    .line 6
    .line 7
    const-string v3, "KEY_CURRENT_NAVIGATION_TAB"

    .line 8
    .line 9
    iget-object v4, v0, La/pks;->b:La/yks;

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
    move-object/from16 v5, p2

    .line 19
    .line 20
    check-cast v5, La/njs;

    .line 21
    .line 22
    iget-object v1, v4, La/yks;->p:Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;

    .line 23
    .line 24
    iget-object v4, v4, La/yks;->o:La/vzg0;

    .line 25
    .line 26
    iget-object v6, v1, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;->d:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 27
    .line 28
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x2

    .line 34
    const/4 v9, 0x1

    .line 35
    if-eqz v6, :cond_2

    .line 36
    .line 37
    if-eq v6, v9, :cond_1

    .line 38
    .line 39
    if-ne v6, v8, :cond_0

    .line 40
    .line 41
    iget-object v6, v5, La/njs;->j:La/tf50;

    .line 42
    .line 43
    :goto_0
    move-object/from16 v16, v6

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    sget-object v6, La/tf50;->b:La/tf50;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    sget-object v6, La/tf50;->b:La/tf50;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :goto_1
    iget-object v1, v1, Lorg/xplatform/sportgame/lite/api/SportGameLiteScreenParams;->d:Lorg/xplatform/ui_core/game_broadcating/models/GameBroadcastType;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    if-eq v1, v9, :cond_4

    .line 66
    .line 67
    if-ne v1, v8, :cond_3

    .line 68
    .line 69
    iget-object v1, v5, La/njs;->k:La/o49;

    .line 70
    .line 71
    :goto_2
    move-object/from16 v17, v1

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 75
    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    sget-object v1, La/o49;->b:La/o49;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    sget-object v1, La/o49;->a:La/o49;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :goto_3
    const/16 v49, -0x601

    .line 85
    .line 86
    const v50, 0xffdf

    .line 87
    .line 88
    .line 89
    const-wide/16 v6, 0x0

    .line 90
    .line 91
    const/4 v8, 0x0

    .line 92
    const/4 v9, 0x0

    .line 93
    const/4 v10, 0x0

    .line 94
    const-wide/16 v11, 0x0

    .line 95
    .line 96
    const-wide/16 v13, 0x0

    .line 97
    .line 98
    const/4 v15, 0x0

    .line 99
    const/16 v18, 0x0

    .line 100
    .line 101
    const/16 v19, 0x0

    .line 102
    .line 103
    const/16 v20, 0x0

    .line 104
    .line 105
    const/16 v21, 0x0

    .line 106
    .line 107
    const/16 v22, 0x0

    .line 108
    .line 109
    const/16 v23, 0x0

    .line 110
    .line 111
    const/16 v24, 0x0

    .line 112
    .line 113
    const/16 v25, 0x0

    .line 114
    .line 115
    const/16 v26, 0x0

    .line 116
    .line 117
    const/16 v27, 0x0

    .line 118
    .line 119
    const/16 v28, 0x0

    .line 120
    .line 121
    const/16 v29, 0x0

    .line 122
    .line 123
    const/16 v30, 0x0

    .line 124
    .line 125
    const/16 v31, 0x0

    .line 126
    .line 127
    const/16 v32, 0x0

    .line 128
    .line 129
    const/16 v33, 0x0

    .line 130
    .line 131
    const/16 v34, 0x0

    .line 132
    .line 133
    const/16 v35, 0x0

    .line 134
    .line 135
    const/16 v36, 0x0

    .line 136
    .line 137
    const/16 v37, 0x0

    .line 138
    .line 139
    const/16 v38, 0x0

    .line 140
    .line 141
    iget-object v0, v0, La/pks;->c:La/fsr;

    .line 142
    .line 143
    const/16 v40, 0x0

    .line 144
    .line 145
    const/16 v41, 0x0

    .line 146
    .line 147
    const/16 v42, 0x0

    .line 148
    .line 149
    const/16 v43, 0x0

    .line 150
    .line 151
    const/16 v44, 0x0

    .line 152
    .line 153
    const/16 v45, 0x0

    .line 154
    .line 155
    const/16 v46, 0x0

    .line 156
    .line 157
    const/16 v47, 0x0

    .line 158
    .line 159
    const/16 v48, 0x0

    .line 160
    .line 161
    move-object/from16 v39, v0

    .line 162
    .line 163
    invoke-static/range {v5 .. v50}, La/njs;->a(La/njs;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;La/tf50;La/o49;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZLa/fsr;La/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;II)La/njs;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    iget-object v0, v7, La/njs;->j:La/tf50;

    .line 168
    .line 169
    invoke-virtual {v4, v3, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget-object v0, v7, La/njs;->k:La/o49;

    .line 173
    .line 174
    invoke-virtual {v4, v2, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :goto_4
    return-object v7

    .line 178
    :pswitch_0
    move-object/from16 v1, p1

    .line 179
    .line 180
    check-cast v1, La/oyg0;

    .line 181
    .line 182
    move-object/from16 v5, p2

    .line 183
    .line 184
    check-cast v5, La/njs;

    .line 185
    .line 186
    sget-object v16, La/tf50;->b:La/tf50;

    .line 187
    .line 188
    sget-object v17, La/o49;->a:La/o49;

    .line 189
    .line 190
    const v49, -0x8000601

    .line 191
    .line 192
    .line 193
    const v50, 0xffdf

    .line 194
    .line 195
    .line 196
    const-wide/16 v6, 0x0

    .line 197
    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v9, 0x0

    .line 200
    const/4 v10, 0x0

    .line 201
    const-wide/16 v11, 0x0

    .line 202
    .line 203
    const-wide/16 v13, 0x0

    .line 204
    .line 205
    const/4 v15, 0x0

    .line 206
    const/16 v18, 0x0

    .line 207
    .line 208
    const/16 v19, 0x0

    .line 209
    .line 210
    const/16 v20, 0x0

    .line 211
    .line 212
    const/16 v21, 0x0

    .line 213
    .line 214
    const/16 v22, 0x0

    .line 215
    .line 216
    const/16 v23, 0x0

    .line 217
    .line 218
    const/16 v24, 0x0

    .line 219
    .line 220
    const/16 v25, 0x0

    .line 221
    .line 222
    const/16 v26, 0x0

    .line 223
    .line 224
    const/16 v27, 0x0

    .line 225
    .line 226
    const/16 v28, 0x0

    .line 227
    .line 228
    const/16 v29, 0x0

    .line 229
    .line 230
    const/16 v30, 0x0

    .line 231
    .line 232
    const/16 v31, 0x0

    .line 233
    .line 234
    const/16 v32, 0x0

    .line 235
    .line 236
    const/16 v33, 0x0

    .line 237
    .line 238
    const/16 v34, 0x1

    .line 239
    .line 240
    const/16 v35, 0x0

    .line 241
    .line 242
    const/16 v36, 0x0

    .line 243
    .line 244
    const/16 v37, 0x0

    .line 245
    .line 246
    const/16 v38, 0x0

    .line 247
    .line 248
    iget-object v0, v0, La/pks;->c:La/fsr;

    .line 249
    .line 250
    const/16 v40, 0x0

    .line 251
    .line 252
    const/16 v41, 0x0

    .line 253
    .line 254
    const/16 v42, 0x0

    .line 255
    .line 256
    const/16 v43, 0x0

    .line 257
    .line 258
    const/16 v44, 0x0

    .line 259
    .line 260
    const/16 v45, 0x0

    .line 261
    .line 262
    const/16 v46, 0x0

    .line 263
    .line 264
    const/16 v47, 0x0

    .line 265
    .line 266
    const/16 v48, 0x0

    .line 267
    .line 268
    move-object/from16 v39, v0

    .line 269
    .line 270
    invoke-static/range {v5 .. v50}, La/njs;->a(La/njs;JLjava/lang/String;Ljava/lang/Long;ZJJLa/t3z;La/tf50;La/o49;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLa/vzj0;ZZZZZZZLa/fsr;La/xvm0;La/js20;Ljava/lang/Long;La/gna;La/anq0;La/bg30;La/ui9;Ljava/util/List;Ljava/util/List;II)La/njs;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v1, v4, La/yks;->o:La/vzg0;

    .line 275
    .line 276
    iget-object v4, v0, La/njs;->j:La/tf50;

    .line 277
    .line 278
    invoke-virtual {v1, v3, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    iget-object v3, v0, La/njs;->k:La/o49;

    .line 282
    .line 283
    invoke-virtual {v1, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
