.class public abstract La/qcl0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


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
    sput-object v0, La/qcl0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenParams;Lkotlin/jvm/functions/Function0;La/i7s;Ljava/lang/String;)La/qhi;
    .locals 34

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/qcl0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, La/qhi;

    .line 13
    .line 14
    if-nez v2, :cond_4

    .line 15
    .line 16
    invoke-static/range {p2 .. p2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 17
    .line 18
    .line 19
    move-result-object v17

    .line 20
    invoke-interface/range {p1 .. p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroid/app/Application;

    .line 25
    .line 26
    instance-of v3, v2, La/af3;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    check-cast v2, La/af3;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v2, v4

    .line 35
    :goto_0
    const-class v3, La/w6s;

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    invoke-interface {v2}, La/af3;->d()La/wcf0;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, La/o5d0;

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, La/ze3;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move-object v2, v4

    .line 59
    :goto_1
    instance-of v5, v2, La/w6s;

    .line 60
    .line 61
    if-nez v5, :cond_2

    .line 62
    .line 63
    move-object v2, v4

    .line 64
    :cond_2
    check-cast v2, La/w6s;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v4, v2, La/w6s;->a:La/cad;

    .line 72
    .line 73
    iget-object v5, v2, La/w6s;->g:La/ugf0;

    .line 74
    .line 75
    iget-object v3, v2, La/w6s;->b:La/oeg0;

    .line 76
    .line 77
    iget-object v6, v2, La/w6s;->q:La/o2j0;

    .line 78
    .line 79
    iget-object v7, v2, La/w6s;->c:La/m1e;

    .line 80
    .line 81
    iget-object v8, v2, La/w6s;->d:La/wdk0;

    .line 82
    .line 83
    iget-object v9, v2, La/w6s;->e:La/ctf0;

    .line 84
    .line 85
    iget-object v10, v2, La/w6s;->f:La/xri;

    .line 86
    .line 87
    move-object v11, v6

    .line 88
    iget-object v6, v2, La/w6s;->h:La/rmd0;

    .line 89
    .line 90
    move-object/from16 v18, v7

    .line 91
    .line 92
    iget-object v7, v2, La/w6s;->i:La/iw20;

    .line 93
    .line 94
    iget-object v12, v2, La/w6s;->j:La/gfk0;

    .line 95
    .line 96
    iget-object v13, v2, La/w6s;->k:La/wyu;

    .line 97
    .line 98
    iget-object v14, v2, La/w6s;->l:La/uyu;

    .line 99
    .line 100
    move-object/from16 v20, v9

    .line 101
    .line 102
    iget-object v9, v2, La/w6s;->m:La/a1d;

    .line 103
    .line 104
    move-object v15, v10

    .line 105
    iget-object v10, v2, La/w6s;->n:La/ivn;

    .line 106
    .line 107
    move-object/from16 v16, v11

    .line 108
    .line 109
    iget-object v11, v2, La/w6s;->p:La/ugf0;

    .line 110
    .line 111
    move-object/from16 v22, v13

    .line 112
    .line 113
    iget-object v13, v2, La/w6s;->o:La/zx10;

    .line 114
    .line 115
    move-object/from16 v21, v12

    .line 116
    .line 117
    iget-object v12, v2, La/w6s;->r:La/roi0;

    .line 118
    .line 119
    move-object/from16 v19, v3

    .line 120
    .line 121
    iget-object v3, v2, La/w6s;->s:La/uuz;

    .line 122
    .line 123
    move-object/from16 v23, v19

    .line 124
    .line 125
    move-object/from16 v19, v8

    .line 126
    .line 127
    iget-object v8, v2, La/w6s;->t:La/bwl;

    .line 128
    .line 129
    move-object/from16 v24, v3

    .line 130
    .line 131
    iget-object v3, v2, La/w6s;->v:La/ndf0;

    .line 132
    .line 133
    move-object/from16 v25, v23

    .line 134
    .line 135
    move-object/from16 v23, v14

    .line 136
    .line 137
    iget-object v14, v2, La/w6s;->u:La/nh70;

    .line 138
    .line 139
    move-object/from16 v26, v3

    .line 140
    .line 141
    iget-object v3, v2, La/w6s;->w:La/qv2;

    .line 142
    .line 143
    move-object/from16 v27, v3

    .line 144
    .line 145
    iget-object v3, v2, La/w6s;->x:La/h3c;

    .line 146
    .line 147
    move-object/from16 v28, v3

    .line 148
    .line 149
    iget-object v3, v2, La/w6s;->y:La/je;

    .line 150
    .line 151
    move-object/from16 v29, v3

    .line 152
    .line 153
    iget-object v3, v2, La/w6s;->z:La/kt2;

    .line 154
    .line 155
    move-object/from16 v30, v3

    .line 156
    .line 157
    iget-object v3, v2, La/w6s;->A:La/gst0;

    .line 158
    .line 159
    move-object/from16 v31, v3

    .line 160
    .line 161
    iget-object v3, v2, La/w6s;->B:La/knf0;

    .line 162
    .line 163
    move-object/from16 v32, v3

    .line 164
    .line 165
    iget-object v3, v2, La/w6s;->C:La/peg0;

    .line 166
    .line 167
    move-object/from16 v33, v3

    .line 168
    .line 169
    iget-object v3, v2, La/w6s;->D:La/r9u;

    .line 170
    .line 171
    iget-object v2, v2, La/w6s;->E:La/wsf0;

    .line 172
    .line 173
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-object/from16 v25, v26

    .line 210
    .line 211
    move-object/from16 v26, v27

    .line 212
    .line 213
    move-object/from16 v27, v28

    .line 214
    .line 215
    move-object/from16 v28, v29

    .line 216
    .line 217
    move-object/from16 v29, v30

    .line 218
    .line 219
    move-object/from16 v30, v31

    .line 220
    .line 221
    move-object/from16 v31, v32

    .line 222
    .line 223
    move-object/from16 v32, v33

    .line 224
    .line 225
    move-object/from16 v33, v3

    .line 226
    .line 227
    new-instance v3, La/qhi;

    .line 228
    .line 229
    move-object/from16 v16, p0

    .line 230
    .line 231
    move-object v15, v2

    .line 232
    invoke-direct/range {v3 .. v33}, La/qhi;-><init>(La/cad;La/ugf0;La/rmd0;La/iw20;La/bwl;La/a1d;La/ivn;La/ugf0;La/roi0;La/zx10;La/nh70;La/wsf0;Lorg/xplatform/sportgame/dashboard/api/SportGameDashboardScreenParams;La/i1w0;La/m1e;La/wdk0;La/ctf0;La/gfk0;La/wyu;La/uyu;La/uuz;La/ndf0;La/qv2;La/h3c;La/je;La/kt2;La/gst0;La/knf0;La/peg0;La/r9u;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    return-object v3

    .line 239
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 240
    .line 241
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    return-object v4

    .line 249
    :cond_4
    return-object v2
.end method
