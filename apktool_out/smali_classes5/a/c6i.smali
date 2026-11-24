.class public final La/c6i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/t5i;


# direct methods
.method public constructor <init>(La/t5i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/c6i;->a:La/t5i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 30

    .line 1
    new-instance v0, La/g00;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/c6i;->a:La/t5i;

    .line 6
    .line 7
    iget-object v1, v1, La/t5i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/d6i;

    .line 10
    .line 11
    iget-object v2, v1, La/d6i;->a:La/chf0;

    .line 12
    .line 13
    iget-object v3, v1, La/d6i;->b:La/lef0;

    .line 14
    .line 15
    iget-object v3, v3, La/lef0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/gbi;

    .line 18
    .line 19
    new-instance v4, La/fvt0;

    .line 20
    .line 21
    new-instance v5, La/yk50;

    .line 22
    .line 23
    new-instance v6, La/ok50;

    .line 24
    .line 25
    iget-object v3, v3, La/gbi;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, La/gii0;

    .line 28
    .line 29
    const/16 v7, 0x1a

    .line 30
    .line 31
    invoke-direct {v6, v3, v7}, La/ok50;-><init>(La/gii0;B)V

    .line 32
    .line 33
    .line 34
    const/16 v3, 0x14

    .line 35
    .line 36
    invoke-direct {v5, v6, v3}, La/yk50;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v4, v5}, La/fvt0;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v3, v1, La/d6i;->b:La/lef0;

    .line 43
    .line 44
    iget-object v5, v3, La/lef0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, La/gbi;

    .line 47
    .line 48
    invoke-virtual {v5}, La/gbi;->n()La/joc;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget-object v6, v3, La/lef0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, La/gbi;

    .line 55
    .line 56
    invoke-virtual {v6}, La/gbi;->A()La/vqb;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    move-object v7, v4

    .line 61
    move-object v4, v5

    .line 62
    move-object v5, v6

    .line 63
    iget-object v6, v1, La/d6i;->c:La/pru;

    .line 64
    .line 65
    move-object v8, v7

    .line 66
    iget-object v7, v1, La/d6i;->d:La/qgd;

    .line 67
    .line 68
    move-object v9, v8

    .line 69
    iget-object v8, v1, La/d6i;->e:La/zn00;

    .line 70
    .line 71
    move-object v10, v9

    .line 72
    iget-object v9, v1, La/d6i;->f:La/jh70;

    .line 73
    .line 74
    iget-object v11, v1, La/d6i;->g:La/pp90;

    .line 75
    .line 76
    invoke-interface {v11}, La/pp90;->f()La/gnu;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v12, v3, La/lef0;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v12, La/gbi;

    .line 86
    .line 87
    invoke-virtual {v12}, La/gbi;->x()La/iw20;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    move-object v13, v10

    .line 92
    move-object v10, v11

    .line 93
    move-object v11, v12

    .line 94
    iget-object v12, v1, La/d6i;->h:La/i1w0;

    .line 95
    .line 96
    move-object v14, v13

    .line 97
    iget-object v13, v1, La/d6i;->i:La/rjo;

    .line 98
    .line 99
    move-object v15, v14

    .line 100
    iget-object v14, v1, La/d6i;->j:La/ctf0;

    .line 101
    .line 102
    move-object/from16 v16, v0

    .line 103
    .line 104
    iget-object v0, v1, La/d6i;->k:La/cad;

    .line 105
    .line 106
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, La/psc;

    .line 109
    .line 110
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    move-object/from16 p0, v0

    .line 118
    .line 119
    iget-object v0, v1, La/d6i;->l:La/duj;

    .line 120
    .line 121
    move-object/from16 v17, v0

    .line 122
    .line 123
    iget-object v0, v1, La/d6i;->m:La/ntu;

    .line 124
    .line 125
    move-object/from16 v18, v0

    .line 126
    .line 127
    iget-object v0, v3, La/lef0;->a:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, La/gbi;

    .line 130
    .line 131
    move-object/from16 v19, v0

    .line 132
    .line 133
    new-instance v0, La/joc;

    .line 134
    .line 135
    move-object/from16 v20, v2

    .line 136
    .line 137
    invoke-virtual/range {v19 .. v19}, La/gbi;->F()La/g090;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-direct {v0, v2}, La/joc;-><init>(La/g090;)V

    .line 142
    .line 143
    .line 144
    iget-object v2, v1, La/d6i;->n:La/m1e;

    .line 145
    .line 146
    move-object/from16 v19, v0

    .line 147
    .line 148
    iget-object v0, v3, La/lef0;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, La/gbi;

    .line 151
    .line 152
    move-object/from16 v21, v0

    .line 153
    .line 154
    new-instance v0, La/cad;

    .line 155
    .line 156
    move-object/from16 v22, v2

    .line 157
    .line 158
    invoke-virtual/range {v21 .. v21}, La/gbi;->F()La/g090;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    move-object/from16 v21, v4

    .line 163
    .line 164
    const/16 v4, 0x1b

    .line 165
    .line 166
    invoke-direct {v0, v2, v4}, La/cad;-><init>(Ljava/lang/Object;B)V

    .line 167
    .line 168
    .line 169
    iget-object v1, v1, La/d6i;->o:La/rpt;

    .line 170
    .line 171
    iget-object v2, v3, La/lef0;->a:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v2, La/gbi;

    .line 174
    .line 175
    new-instance v23, La/pmi;

    .line 176
    .line 177
    iget-object v3, v2, La/gbi;->l:Ljava/lang/Object;

    .line 178
    .line 179
    move-object/from16 v24, v3

    .line 180
    .line 181
    check-cast v24, La/bot;

    .line 182
    .line 183
    iget-object v3, v2, La/gbi;->m:Ljava/lang/Object;

    .line 184
    .line 185
    move-object/from16 v25, v3

    .line 186
    .line 187
    check-cast v25, La/kpt;

    .line 188
    .line 189
    new-instance v3, La/czt;

    .line 190
    .line 191
    iget-object v4, v2, La/gbi;->o:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v4, La/fsd;

    .line 194
    .line 195
    move-object/from16 v29, v0

    .line 196
    .line 197
    const/4 v0, 0x1

    .line 198
    invoke-direct {v3, v4, v0}, La/czt;-><init>(La/fsd;B)V

    .line 199
    .line 200
    .line 201
    iget-object v0, v2, La/gbi;->n:Ljava/lang/Object;

    .line 202
    .line 203
    move-object/from16 v27, v0

    .line 204
    .line 205
    check-cast v27, La/ntu;

    .line 206
    .line 207
    const/16 v28, 0x18

    .line 208
    .line 209
    move-object/from16 v26, v3

    .line 210
    .line 211
    invoke-direct/range {v23 .. v28}, La/pmi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 212
    .line 213
    .line 214
    move-object v3, v15

    .line 215
    move-object/from16 v0, v16

    .line 216
    .line 217
    move-object/from16 v16, v17

    .line 218
    .line 219
    move-object/from16 v17, v18

    .line 220
    .line 221
    move-object/from16 v18, v19

    .line 222
    .line 223
    move-object/from16 v2, v20

    .line 224
    .line 225
    move-object/from16 v4, v21

    .line 226
    .line 227
    move-object/from16 v19, v22

    .line 228
    .line 229
    move-object/from16 v22, v23

    .line 230
    .line 231
    move-object/from16 v20, v29

    .line 232
    .line 233
    move-object/from16 v15, p0

    .line 234
    .line 235
    move-object/from16 v21, v1

    .line 236
    .line 237
    move-object/from16 v1, p1

    .line 238
    .line 239
    invoke-direct/range {v0 .. v22}, La/g00;-><init>(La/vzg0;La/chf0;La/fvt0;La/joc;La/vqb;La/pru;La/qgd;La/zn00;La/jh70;La/gnu;La/iw20;La/i1w0;La/rjo;La/ctf0;La/mne;La/duj;La/ntu;La/joc;La/m1e;La/cad;La/rpt;La/pmi;)V

    .line 240
    .line 241
    .line 242
    return-object v0
.end method
