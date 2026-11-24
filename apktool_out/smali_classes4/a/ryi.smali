.class public final La/ryi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/msi;


# direct methods
.method public constructor <init>(La/msi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ryi;->a:La/msi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 26

    .line 1
    new-instance v0, La/tzt0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/ryi;->a:La/msi;

    .line 6
    .line 7
    iget-object v1, v1, La/msi;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/syi;

    .line 10
    .line 11
    iget-object v2, v1, La/syi;->a:Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;

    .line 12
    .line 13
    iget-object v3, v1, La/syi;->b:La/duj;

    .line 14
    .line 15
    iget-object v4, v1, La/syi;->c:La/pyg;

    .line 16
    .line 17
    invoke-interface {v4}, La/pyg;->a()La/hzg;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v1, La/syi;->d:La/m1e;

    .line 25
    .line 26
    iget-object v6, v1, La/syi;->e:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v7, v1, La/syi;->f:La/cad;

    .line 29
    .line 30
    iget-object v7, v7, La/cad;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v7, La/psc;

    .line 33
    .line 34
    invoke-virtual {v7}, La/psc;->h()La/mne;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v8, La/w5z;

    .line 42
    .line 43
    iget-object v14, v1, La/syi;->g:La/clc;

    .line 44
    .line 45
    iget-object v9, v14, La/clc;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v9, La/v7i;

    .line 48
    .line 49
    move-object v10, v9

    .line 50
    invoke-virtual {v10}, La/v7i;->i()La/reu;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    move-object v11, v10

    .line 55
    invoke-virtual {v11}, La/v7i;->f()La/uyn;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    iget-object v12, v1, La/syi;->h:La/iip;

    .line 60
    .line 61
    invoke-interface {v12}, La/iip;->V()La/j3c;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v13, v11

    .line 69
    move-object v11, v12

    .line 70
    new-instance v12, La/bzu;

    .line 71
    .line 72
    iget-object v15, v1, La/syi;->y:La/n5d0;

    .line 73
    .line 74
    invoke-interface {v15}, La/o5d0;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v15

    .line 78
    check-cast v15, La/k1u0;

    .line 79
    .line 80
    invoke-direct {v12, v15}, La/bzu;-><init>(La/k1u0;)V

    .line 81
    .line 82
    .line 83
    move-object v15, v13

    .line 84
    new-instance v13, La/ezt;

    .line 85
    .line 86
    invoke-virtual {v15}, La/v7i;->g()La/qah;

    .line 87
    .line 88
    .line 89
    move-result-object v15

    .line 90
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v13, v15}, La/ezt;-><init>(La/qah;)V

    .line 94
    .line 95
    .line 96
    invoke-direct/range {v8 .. v13}, La/w5z;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object v9, v14, La/clc;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v9, La/v7i;

    .line 102
    .line 103
    invoke-virtual {v9}, La/v7i;->h()La/a7q;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    iget-object v10, v1, La/syi;->j:La/roi0;

    .line 108
    .line 109
    iget-object v10, v10, La/roi0;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v10, La/daf;

    .line 112
    .line 113
    invoke-virtual {v10}, La/daf;->B()La/nvu;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    iget-object v11, v1, La/syi;->k:La/g2v;

    .line 118
    .line 119
    iget-object v12, v1, La/syi;->l:La/ctf0;

    .line 120
    .line 121
    iget-object v13, v1, La/syi;->m:La/xri;

    .line 122
    .line 123
    invoke-virtual {v13}, La/xri;->a()La/svu;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v15, v1, La/syi;->n:La/ugf0;

    .line 131
    .line 132
    iget-object v15, v15, La/ugf0;->a:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v15, La/daf;

    .line 135
    .line 136
    invoke-virtual {v15}, La/daf;->w()La/luu;

    .line 137
    .line 138
    .line 139
    move-result-object v15

    .line 140
    invoke-static {v15}, La/x1x;->x(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    move-object/from16 v16, v15

    .line 144
    .line 145
    iget-object v15, v1, La/syi;->o:La/dwu;

    .line 146
    .line 147
    move-object/from16 v17, v0

    .line 148
    .line 149
    iget-object v0, v1, La/syi;->p:La/oeg0;

    .line 150
    .line 151
    iget-object v14, v14, La/clc;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v14, La/v7i;

    .line 154
    .line 155
    iget-object v14, v14, La/v7i;->e:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v14, La/h3c;

    .line 158
    .line 159
    move-object/from16 v18, v0

    .line 160
    .line 161
    iget-object v0, v1, La/syi;->q:La/epi0;

    .line 162
    .line 163
    iget-object v0, v0, La/epi0;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, La/xzp;

    .line 166
    .line 167
    invoke-virtual {v0}, La/xzp;->C()La/r9u;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    move-object/from16 p0, v0

    .line 172
    .line 173
    iget-object v0, v1, La/syi;->r:La/qgh;

    .line 174
    .line 175
    move-object/from16 v19, v0

    .line 176
    .line 177
    new-instance v0, La/ih5;

    .line 178
    .line 179
    move-object/from16 v20, v2

    .line 180
    .line 181
    iget-object v2, v1, La/syi;->s:La/kt2;

    .line 182
    .line 183
    move-object/from16 v21, v3

    .line 184
    .line 185
    const/4 v3, 0x1

    .line 186
    invoke-direct {v0, v2, v3}, La/ih5;-><init>(La/kt2;B)V

    .line 187
    .line 188
    .line 189
    iget-object v2, v1, La/syi;->t:La/zr1;

    .line 190
    .line 191
    iget-object v3, v1, La/syi;->u:La/a1d;

    .line 192
    .line 193
    move-object/from16 v22, v0

    .line 194
    .line 195
    iget-object v0, v3, La/a1d;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, La/qv2;

    .line 198
    .line 199
    invoke-virtual {v0}, La/qv2;->i()La/hqc;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    move-object/from16 v23, v0

    .line 204
    .line 205
    iget-object v0, v1, La/syi;->v:La/lbu;

    .line 206
    .line 207
    iget-object v1, v1, La/syi;->w:La/bwl;

    .line 208
    .line 209
    iget-object v1, v1, La/bwl;->a:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v1, La/dbi;

    .line 212
    .line 213
    invoke-virtual {v1}, La/dbi;->B()La/hcp0;

    .line 214
    .line 215
    .line 216
    move-result-object v24

    .line 217
    iget-object v1, v3, La/a1d;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v1, La/qv2;

    .line 220
    .line 221
    invoke-virtual {v1}, La/qv2;->g()La/ivn;

    .line 222
    .line 223
    .line 224
    move-result-object v25

    .line 225
    move-object/from16 v1, p1

    .line 226
    .line 227
    move-object/from16 v3, v21

    .line 228
    .line 229
    move-object/from16 v21, v2

    .line 230
    .line 231
    move-object/from16 v2, v20

    .line 232
    .line 233
    move-object/from16 v20, v22

    .line 234
    .line 235
    move-object/from16 v22, v23

    .line 236
    .line 237
    move-object/from16 v23, v0

    .line 238
    .line 239
    move-object/from16 v0, v17

    .line 240
    .line 241
    move-object/from16 v17, v14

    .line 242
    .line 243
    move-object/from16 v14, v16

    .line 244
    .line 245
    move-object/from16 v16, v18

    .line 246
    .line 247
    move-object/from16 v18, p0

    .line 248
    .line 249
    invoke-direct/range {v0 .. v25}, La/tzt0;-><init>(La/vzg0;Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;La/duj;La/hzg;La/m1e;Ljava/lang/String;La/mne;La/w5z;La/a7q;La/nvu;La/g2v;La/ctf0;La/svu;La/luu;La/dwu;La/oeg0;La/h3c;La/r9u;La/qgh;La/ih5;La/zr1;La/hqc;La/lbu;La/hcp0;La/ivn;)V

    .line 250
    .line 251
    .line 252
    return-object v0
.end method
