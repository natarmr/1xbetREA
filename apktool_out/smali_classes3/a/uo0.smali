.class public abstract La/uo0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;

.field public static b:La/lr1;

.field public static c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/uo0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    sget-object v0, La/ir1;->c:La/ir1;

    .line 9
    .line 10
    sput-object v0, La/uo0;->b:La/lr1;

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    sput-object v0, La/uo0;->c:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public static a(J)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, La/uo0;->b:La/lr1;

    .line 2
    .line 3
    iget-object v0, v0, La/lr1;->a:La/mr1;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, La/uo0;->c:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, "_"

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static b(JLa/hgh0;Landroid/app/Application;)La/n7i;
    .locals 54

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static/range {p0 .. p1}, La/uo0;->a(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, La/uo0;->a:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, La/n7i;

    .line 17
    .line 18
    if-nez v1, :cond_4

    .line 19
    .line 20
    instance-of v1, v0, La/af3;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast v0, La/af3;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v0, v3

    .line 29
    :goto_0
    const-class v1, La/to0;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/o5d0;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/ze3;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v0, v3

    .line 53
    :goto_1
    instance-of v4, v0, La/to0;

    .line 54
    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    move-object v0, v3

    .line 58
    :cond_2
    check-cast v0, La/to0;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object v6, v0, La/to0;->a:La/ehf0;

    .line 63
    .line 64
    iget-object v5, v0, La/to0;->d:La/cad;

    .line 65
    .line 66
    iget-object v1, v0, La/to0;->v:La/oeg0;

    .line 67
    .line 68
    iget-object v3, v0, La/to0;->k:La/uzc0;

    .line 69
    .line 70
    iget-object v4, v0, La/to0;->l:La/xmt;

    .line 71
    .line 72
    iget-object v7, v0, La/to0;->m:La/bnt;

    .line 73
    .line 74
    iget-object v8, v0, La/to0;->g:La/j1q0;

    .line 75
    .line 76
    iget-object v9, v0, La/to0;->h:La/r9u;

    .line 77
    .line 78
    iget-object v10, v0, La/to0;->q:La/duj;

    .line 79
    .line 80
    iget-object v11, v0, La/to0;->s:La/m1e;

    .line 81
    .line 82
    iget-object v12, v0, La/to0;->e:La/gst0;

    .line 83
    .line 84
    iget-object v13, v0, La/to0;->A:La/ii;

    .line 85
    .line 86
    iget-object v14, v0, La/to0;->b:La/u58;

    .line 87
    .line 88
    iget-object v15, v0, La/to0;->c:La/gg5;

    .line 89
    .line 90
    move-object/from16 v18, v1

    .line 91
    .line 92
    iget-object v1, v0, La/to0;->f:La/s31;

    .line 93
    .line 94
    move-object/from16 v24, v1

    .line 95
    .line 96
    iget-object v1, v0, La/to0;->r:La/s91;

    .line 97
    .line 98
    move-object/from16 v27, v1

    .line 99
    .line 100
    iget-object v1, v0, La/to0;->u:La/v88;

    .line 101
    .line 102
    move-object/from16 v16, v9

    .line 103
    .line 104
    iget-object v9, v0, La/to0;->i:La/wsf0;

    .line 105
    .line 106
    move-object/from16 v30, v1

    .line 107
    .line 108
    iget-object v1, v0, La/to0;->j:La/iqt;

    .line 109
    .line 110
    move-object/from16 v39, v1

    .line 111
    .line 112
    iget-object v1, v0, La/to0;->n:La/kt2;

    .line 113
    .line 114
    move-object/from16 v23, v1

    .line 115
    .line 116
    iget-object v1, v0, La/to0;->o:La/o91;

    .line 117
    .line 118
    move-object/from16 v17, v1

    .line 119
    .line 120
    iget-object v1, v0, La/to0;->p:La/h03;

    .line 121
    .line 122
    move-object/from16 v28, v1

    .line 123
    .line 124
    iget-object v1, v0, La/to0;->w:La/uyu;

    .line 125
    .line 126
    move-object/from16 v31, v1

    .line 127
    .line 128
    iget-object v1, v0, La/to0;->x:La/wyu;

    .line 129
    .line 130
    move-object/from16 v32, v1

    .line 131
    .line 132
    iget-object v1, v0, La/to0;->y:La/ctf0;

    .line 133
    .line 134
    move-object/from16 v33, v1

    .line 135
    .line 136
    iget-object v1, v0, La/to0;->z:La/ix0;

    .line 137
    .line 138
    move-object/from16 v34, v1

    .line 139
    .line 140
    iget-object v1, v0, La/to0;->B:La/ntu;

    .line 141
    .line 142
    move-object/from16 v35, v1

    .line 143
    .line 144
    iget-object v1, v0, La/to0;->C:La/l7k;

    .line 145
    .line 146
    move-object/from16 v36, v1

    .line 147
    .line 148
    iget-object v1, v0, La/to0;->D:La/cyu;

    .line 149
    .line 150
    move-object/from16 v37, v1

    .line 151
    .line 152
    iget-object v1, v0, La/to0;->E:La/gg5;

    .line 153
    .line 154
    move-object/from16 v25, v8

    .line 155
    .line 156
    iget-object v8, v0, La/to0;->t:La/peg0;

    .line 157
    .line 158
    move-object/from16 v43, v1

    .line 159
    .line 160
    iget-object v1, v0, La/to0;->F:La/wdk0;

    .line 161
    .line 162
    move-object/from16 v41, v1

    .line 163
    .line 164
    iget-object v1, v0, La/to0;->G:La/pru;

    .line 165
    .line 166
    move-object/from16 v38, v1

    .line 167
    .line 168
    iget-object v1, v0, La/to0;->H:La/dmt;

    .line 169
    .line 170
    move-object/from16 v22, v7

    .line 171
    .line 172
    iget-object v7, v0, La/to0;->I:La/poq0;

    .line 173
    .line 174
    move-object/from16 v26, v10

    .line 175
    .line 176
    iget-object v10, v0, La/to0;->J:La/lrc;

    .line 177
    .line 178
    move-object/from16 v40, v1

    .line 179
    .line 180
    iget-object v1, v0, La/to0;->K:La/au0;

    .line 181
    .line 182
    move-object/from16 v42, v1

    .line 183
    .line 184
    iget-object v1, v0, La/to0;->L:La/grj;

    .line 185
    .line 186
    move-object/from16 v44, v1

    .line 187
    .line 188
    iget-object v1, v0, La/to0;->M:La/jlx;

    .line 189
    .line 190
    move-object/from16 v45, v1

    .line 191
    .line 192
    iget-object v1, v0, La/to0;->N:La/pyt;

    .line 193
    .line 194
    move-object/from16 v46, v1

    .line 195
    .line 196
    iget-object v1, v0, La/to0;->O:La/qyg0;

    .line 197
    .line 198
    move-object/from16 v47, v1

    .line 199
    .line 200
    iget-object v1, v0, La/to0;->P:La/pyg0;

    .line 201
    .line 202
    move-object/from16 v48, v1

    .line 203
    .line 204
    iget-object v1, v0, La/to0;->Q:La/pmi;

    .line 205
    .line 206
    move-object/from16 v49, v1

    .line 207
    .line 208
    iget-object v1, v0, La/to0;->R:La/dnt;

    .line 209
    .line 210
    move-object/from16 v50, v1

    .line 211
    .line 212
    iget-object v1, v0, La/to0;->S:La/bzt;

    .line 213
    .line 214
    move-object/from16 v29, v11

    .line 215
    .line 216
    iget-object v11, v0, La/to0;->T:La/wsf0;

    .line 217
    .line 218
    move-object/from16 v19, v12

    .line 219
    .line 220
    iget-object v12, v0, La/to0;->U:La/peg0;

    .line 221
    .line 222
    move-object/from16 v51, v1

    .line 223
    .line 224
    iget-object v1, v0, La/to0;->V:La/ytt;

    .line 225
    .line 226
    iget-object v0, v0, La/to0;->W:La/cmt;

    .line 227
    .line 228
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-object/from16 v21, v4

    .line 265
    .line 266
    new-instance v4, La/n7i;

    .line 267
    .line 268
    move-object/from16 v16, v14

    .line 269
    .line 270
    invoke-static/range {p0 .. p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 271
    .line 272
    .line 273
    move-result-object v14

    .line 274
    move-object/from16 v53, v0

    .line 275
    .line 276
    move-object/from16 v52, v1

    .line 277
    .line 278
    move-object/from16 v20, v3

    .line 279
    .line 280
    move-object/from16 v17, v15

    .line 281
    .line 282
    move-object/from16 v15, p2

    .line 283
    .line 284
    invoke-direct/range {v4 .. v53}, La/n7i;-><init>(La/cad;La/ehf0;La/poq0;La/peg0;La/wsf0;La/lrc;La/wsf0;La/peg0;La/ii;Ljava/lang/Long;La/hgh0;La/u58;La/gg5;La/oeg0;La/gst0;La/uzc0;La/xmt;La/bnt;La/kt2;La/s31;La/j1q0;La/duj;La/s91;La/h03;La/m1e;La/v88;La/uyu;La/wyu;La/ctf0;La/ix0;La/ntu;La/l7k;La/cyu;La/pru;La/iqt;La/dmt;La/wdk0;La/au0;La/gg5;La/grj;La/jlx;La/pyt;La/qyg0;La/pyg0;La/pmi;La/dnt;La/bzt;La/ytt;La/cmt;)V

    .line 285
    .line 286
    .line 287
    invoke-static/range {p0 .. p1}, La/uo0;->a(J)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    return-object v4

    .line 295
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 296
    .line 297
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    return-object v3

    .line 305
    :cond_4
    return-object v1
.end method
