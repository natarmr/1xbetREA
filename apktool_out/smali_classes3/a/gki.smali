.class public final La/gki;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n5d0;


# direct methods
.method public synthetic constructor <init>(La/n5d0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gki;->a:B

    iput-object p1, p0, La/gki;->b:La/n5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/gki;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/gki;->b:La/n5d0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v5, p1

    .line 13
    .line 14
    check-cast v5, La/i1w0;

    .line 15
    .line 16
    new-instance v4, La/hjc0;

    .line 17
    .line 18
    check-cast v0, La/c7i;

    .line 19
    .line 20
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, La/iyi;

    .line 23
    .line 24
    new-instance v6, La/tpx;

    .line 25
    .line 26
    iget-object v7, v1, La/iyi;->b:La/tnc0;

    .line 27
    .line 28
    invoke-direct {v6, v7, v3}, La/tpx;-><init>(La/tnc0;B)V

    .line 29
    .line 30
    .line 31
    iget-object v3, v1, La/iyi;->a:La/g8i;

    .line 32
    .line 33
    invoke-virtual {v3}, La/g8i;->v1()La/mne;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    new-instance v8, La/wsf0;

    .line 38
    .line 39
    iget-object v9, v1, La/iyi;->b:La/tnc0;

    .line 40
    .line 41
    invoke-direct {v8, v9}, La/wsf0;-><init>(La/tnc0;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/kki;

    .line 47
    .line 48
    new-instance v9, La/y3v;

    .line 49
    .line 50
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, La/iyi;

    .line 53
    .line 54
    iget-object v10, v0, La/iyi;->d:La/s470;

    .line 55
    .line 56
    iget-object v11, v0, La/iyi;->a:La/g8i;

    .line 57
    .line 58
    invoke-virtual {v11}, La/g8i;->Oa()La/ort;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    iget-object v12, v0, La/iyi;->e:La/rkc0;

    .line 63
    .line 64
    invoke-direct {v9, v10, v11, v12}, La/y3v;-><init>(La/s470;La/ort;La/rkc0;)V

    .line 65
    .line 66
    .line 67
    iget-object v10, v1, La/iyi;->d:La/s470;

    .line 68
    .line 69
    invoke-virtual {v3}, La/g8i;->q1()La/m1e;

    .line 70
    .line 71
    .line 72
    move-result-object v11

    .line 73
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance v12, La/tpx;

    .line 77
    .line 78
    iget-object v1, v0, La/iyi;->b:La/tnc0;

    .line 79
    .line 80
    invoke-direct {v12, v1, v2}, La/tpx;-><init>(La/tnc0;B)V

    .line 81
    .line 82
    .line 83
    new-instance v13, La/b8u;

    .line 84
    .line 85
    iget-object v1, v0, La/iyi;->e:La/rkc0;

    .line 86
    .line 87
    invoke-direct {v13, v1}, La/b8u;-><init>(La/rkc0;)V

    .line 88
    .line 89
    .line 90
    new-instance v14, La/xsu;

    .line 91
    .line 92
    iget-object v0, v0, La/iyi;->e:La/rkc0;

    .line 93
    .line 94
    invoke-direct {v14, v0}, La/xsu;-><init>(La/rkc0;)V

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v4 .. v14}, La/hjc0;-><init>(La/i1w0;La/tpx;La/mne;La/wsf0;La/y3v;La/s470;La/m1e;La/tpx;La/b8u;La/xsu;)V

    .line 98
    .line 99
    .line 100
    return-object v4

    .line 101
    :pswitch_0
    move-object/from16 v6, p1

    .line 102
    .line 103
    check-cast v6, La/i1w0;

    .line 104
    .line 105
    new-instance v5, La/hjc0;

    .line 106
    .line 107
    check-cast v0, La/c7i;

    .line 108
    .line 109
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, La/nli;

    .line 112
    .line 113
    new-instance v7, La/tpx;

    .line 114
    .line 115
    iget-object v4, v1, La/nli;->b:La/tnc0;

    .line 116
    .line 117
    invoke-direct {v7, v4, v3}, La/tpx;-><init>(La/tnc0;B)V

    .line 118
    .line 119
    .line 120
    iget-object v3, v1, La/nli;->a:La/g8i;

    .line 121
    .line 122
    invoke-virtual {v3}, La/g8i;->v1()La/mne;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    new-instance v9, La/wsf0;

    .line 127
    .line 128
    iget-object v1, v1, La/nli;->b:La/tnc0;

    .line 129
    .line 130
    invoke-direct {v9, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/kki;

    .line 136
    .line 137
    new-instance v10, La/y3v;

    .line 138
    .line 139
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, La/nli;

    .line 142
    .line 143
    sget-object v11, La/s470;->c:La/s470;

    .line 144
    .line 145
    iget-object v1, v0, La/nli;->a:La/g8i;

    .line 146
    .line 147
    invoke-virtual {v1}, La/g8i;->Oa()La/ort;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    iget-object v4, v0, La/nli;->d:La/rkc0;

    .line 152
    .line 153
    invoke-direct {v10, v11, v1, v4}, La/y3v;-><init>(La/s470;La/ort;La/rkc0;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, La/g8i;->q1()La/m1e;

    .line 157
    .line 158
    .line 159
    move-result-object v12

    .line 160
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    new-instance v13, La/tpx;

    .line 164
    .line 165
    iget-object v1, v0, La/nli;->b:La/tnc0;

    .line 166
    .line 167
    invoke-direct {v13, v1, v2}, La/tpx;-><init>(La/tnc0;B)V

    .line 168
    .line 169
    .line 170
    new-instance v14, La/b8u;

    .line 171
    .line 172
    iget-object v1, v0, La/nli;->d:La/rkc0;

    .line 173
    .line 174
    invoke-direct {v14, v1}, La/b8u;-><init>(La/rkc0;)V

    .line 175
    .line 176
    .line 177
    new-instance v15, La/xsu;

    .line 178
    .line 179
    iget-object v0, v0, La/nli;->d:La/rkc0;

    .line 180
    .line 181
    invoke-direct {v15, v0}, La/xsu;-><init>(La/rkc0;)V

    .line 182
    .line 183
    .line 184
    invoke-direct/range {v5 .. v15}, La/hjc0;-><init>(La/i1w0;La/tpx;La/mne;La/wsf0;La/y3v;La/s470;La/m1e;La/tpx;La/b8u;La/xsu;)V

    .line 185
    .line 186
    .line 187
    return-object v5

    .line 188
    :pswitch_1
    move-object/from16 v7, p1

    .line 189
    .line 190
    check-cast v7, La/i1w0;

    .line 191
    .line 192
    new-instance v6, La/hjc0;

    .line 193
    .line 194
    check-cast v0, La/c7i;

    .line 195
    .line 196
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v1, La/fki;

    .line 199
    .line 200
    new-instance v8, La/tpx;

    .line 201
    .line 202
    iget-object v4, v1, La/fki;->b:La/tnc0;

    .line 203
    .line 204
    invoke-direct {v8, v4, v3}, La/tpx;-><init>(La/tnc0;B)V

    .line 205
    .line 206
    .line 207
    iget-object v3, v1, La/fki;->a:La/g8i;

    .line 208
    .line 209
    invoke-virtual {v3}, La/g8i;->v1()La/mne;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    new-instance v10, La/wsf0;

    .line 214
    .line 215
    iget-object v1, v1, La/fki;->b:La/tnc0;

    .line 216
    .line 217
    invoke-direct {v10, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 218
    .line 219
    .line 220
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v0, La/kki;

    .line 223
    .line 224
    new-instance v11, La/y3v;

    .line 225
    .line 226
    iget-object v0, v0, La/kki;->e:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v0, La/fki;

    .line 229
    .line 230
    sget-object v12, La/s470;->f:La/s470;

    .line 231
    .line 232
    iget-object v1, v0, La/fki;->a:La/g8i;

    .line 233
    .line 234
    invoke-virtual {v1}, La/g8i;->Oa()La/ort;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    iget-object v4, v0, La/fki;->d:La/rkc0;

    .line 239
    .line 240
    invoke-direct {v11, v12, v1, v4}, La/y3v;-><init>(La/s470;La/ort;La/rkc0;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3}, La/g8i;->q1()La/m1e;

    .line 244
    .line 245
    .line 246
    move-result-object v13

    .line 247
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    new-instance v14, La/tpx;

    .line 251
    .line 252
    iget-object v1, v0, La/fki;->b:La/tnc0;

    .line 253
    .line 254
    invoke-direct {v14, v1, v2}, La/tpx;-><init>(La/tnc0;B)V

    .line 255
    .line 256
    .line 257
    new-instance v15, La/b8u;

    .line 258
    .line 259
    iget-object v1, v0, La/fki;->d:La/rkc0;

    .line 260
    .line 261
    invoke-direct {v15, v1}, La/b8u;-><init>(La/rkc0;)V

    .line 262
    .line 263
    .line 264
    new-instance v1, La/xsu;

    .line 265
    .line 266
    iget-object v0, v0, La/fki;->d:La/rkc0;

    .line 267
    .line 268
    invoke-direct {v1, v0}, La/xsu;-><init>(La/rkc0;)V

    .line 269
    .line 270
    .line 271
    move-object/from16 v16, v1

    .line 272
    .line 273
    invoke-direct/range {v6 .. v16}, La/hjc0;-><init>(La/i1w0;La/tpx;La/mne;La/wsf0;La/y3v;La/s470;La/m1e;La/tpx;La/b8u;La/xsu;)V

    .line 274
    .line 275
    .line 276
    return-object v6

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
