.class public final La/pvf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vuu0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/String;

.field public final c:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/pvf;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p4, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/pvf;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p2, p0, La/pvf;->c:J

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/pvf;->b:Ljava/lang/String;

    .line 21
    .line 22
    iput-wide p2, p0, La/pvf;->c:J

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/pvf;->b:Ljava/lang/String;

    .line 29
    .line 30
    iput-wide p2, p0, La/pvf;->c:J

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(La/j83;)La/nls0;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/pvf;->a:B

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const-string v4, " "

    .line 9
    .line 10
    iget-object v5, v0, La/pvf;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v2, v1, La/j83;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-lez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-lez v2, :cond_0

    .line 31
    .line 32
    new-instance v2, La/h83;

    .line 33
    .line 34
    invoke-direct {v2}, La/h83;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, La/h83;->b(La/j83;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2, v4}, La/h83;->c(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v6, La/smk0;

    .line 44
    .line 45
    const/16 v25, 0x0

    .line 46
    .line 47
    const v26, 0xfffe

    .line 48
    .line 49
    .line 50
    iget-wide v7, v0, La/pvf;->c:J

    .line 51
    .line 52
    const-wide/16 v9, 0x0

    .line 53
    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v15, 0x0

    .line 59
    const-wide/16 v16, 0x0

    .line 60
    .line 61
    const/16 v18, 0x0

    .line 62
    .line 63
    const/16 v19, 0x0

    .line 64
    .line 65
    const/16 v20, 0x0

    .line 66
    .line 67
    const-wide/16 v21, 0x0

    .line 68
    .line 69
    const/16 v23, 0x0

    .line 70
    .line 71
    const/16 v24, 0x0

    .line 72
    .line 73
    invoke-direct/range {v6 .. v26}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v6}, La/h83;->g(La/smk0;)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    :try_start_0
    invoke-virtual {v2, v5}, La/h83;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v4}, La/h83;->d(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, La/h83;->h()La/j83;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    invoke-virtual {v2, v4}, La/h83;->d(I)V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :cond_0
    move-object v0, v1

    .line 97
    :goto_0
    new-instance v2, La/nls0;

    .line 98
    .line 99
    new-instance v4, La/a1d;

    .line 100
    .line 101
    invoke-direct {v4, v1, v3}, La/a1d;-><init>(Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v2, v0, v4}, La/nls0;-><init>(La/j83;La/qe60;)V

    .line 105
    .line 106
    .line 107
    return-object v2

    .line 108
    :pswitch_0
    iget-object v2, v1, La/j83;->b:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-lez v2, :cond_1

    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-lez v2, :cond_1

    .line 121
    .line 122
    new-instance v2, La/h83;

    .line 123
    .line 124
    invoke-direct {v2}, La/h83;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v1}, La/h83;->b(La/j83;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4}, La/h83;->c(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    new-instance v6, La/smk0;

    .line 134
    .line 135
    const/16 v25, 0x0

    .line 136
    .line 137
    const v26, 0xfffe

    .line 138
    .line 139
    .line 140
    iget-wide v7, v0, La/pvf;->c:J

    .line 141
    .line 142
    const-wide/16 v9, 0x0

    .line 143
    .line 144
    const/4 v11, 0x0

    .line 145
    const/4 v12, 0x0

    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x0

    .line 149
    const-wide/16 v16, 0x0

    .line 150
    .line 151
    const/16 v18, 0x0

    .line 152
    .line 153
    const/16 v19, 0x0

    .line 154
    .line 155
    const/16 v20, 0x0

    .line 156
    .line 157
    const-wide/16 v21, 0x0

    .line 158
    .line 159
    const/16 v23, 0x0

    .line 160
    .line 161
    const/16 v24, 0x0

    .line 162
    .line 163
    invoke-direct/range {v6 .. v26}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v6}, La/h83;->g(La/smk0;)I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    :try_start_1
    invoke-virtual {v2, v5}, La/h83;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v4}, La/h83;->d(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, La/h83;->h()La/j83;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    goto :goto_1

    .line 181
    :catchall_1
    move-exception v0

    .line 182
    invoke-virtual {v2, v4}, La/h83;->d(I)V

    .line 183
    .line 184
    .line 185
    throw v0

    .line 186
    :cond_1
    move-object v0, v1

    .line 187
    :goto_1
    new-instance v2, La/nls0;

    .line 188
    .line 189
    new-instance v4, La/cad;

    .line 190
    .line 191
    invoke-direct {v4, v1, v3}, La/cad;-><init>(Ljava/lang/Object;B)V

    .line 192
    .line 193
    .line 194
    invoke-direct {v2, v0, v4}, La/nls0;-><init>(La/j83;La/qe60;)V

    .line 195
    .line 196
    .line 197
    return-object v2

    .line 198
    :pswitch_1
    iget-object v2, v1, La/j83;->b:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-lez v2, :cond_2

    .line 205
    .line 206
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    if-lez v2, :cond_2

    .line 211
    .line 212
    new-instance v2, La/h83;

    .line 213
    .line 214
    invoke-direct {v2}, La/h83;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v1}, La/h83;->b(La/j83;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v4}, La/h83;->c(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    new-instance v6, La/smk0;

    .line 224
    .line 225
    const/16 v25, 0x0

    .line 226
    .line 227
    const v26, 0xfffe

    .line 228
    .line 229
    .line 230
    iget-wide v7, v0, La/pvf;->c:J

    .line 231
    .line 232
    const-wide/16 v9, 0x0

    .line 233
    .line 234
    const/4 v11, 0x0

    .line 235
    const/4 v12, 0x0

    .line 236
    const/4 v13, 0x0

    .line 237
    const/4 v14, 0x0

    .line 238
    const/4 v15, 0x0

    .line 239
    const-wide/16 v16, 0x0

    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    const/16 v19, 0x0

    .line 244
    .line 245
    const/16 v20, 0x0

    .line 246
    .line 247
    const-wide/16 v21, 0x0

    .line 248
    .line 249
    const/16 v23, 0x0

    .line 250
    .line 251
    const/16 v24, 0x0

    .line 252
    .line 253
    invoke-direct/range {v6 .. v26}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v6}, La/h83;->g(La/smk0;)I

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    :try_start_2
    invoke-virtual {v2, v5}, La/h83;->c(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v3}, La/h83;->d(I)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, La/h83;->h()La/j83;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    goto :goto_2

    .line 271
    :catchall_2
    move-exception v0

    .line 272
    invoke-virtual {v2, v3}, La/h83;->d(I)V

    .line 273
    .line 274
    .line 275
    throw v0

    .line 276
    :cond_2
    move-object v0, v1

    .line 277
    :goto_2
    new-instance v2, La/nls0;

    .line 278
    .line 279
    new-instance v3, La/vqc;

    .line 280
    .line 281
    const/16 v4, 0xb

    .line 282
    .line 283
    invoke-direct {v3, v1, v4}, La/vqc;-><init>(Ljava/lang/Object;B)V

    .line 284
    .line 285
    .line 286
    invoke-direct {v2, v0, v3}, La/nls0;-><init>(La/j83;La/qe60;)V

    .line 287
    .line 288
    .line 289
    return-object v2

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
