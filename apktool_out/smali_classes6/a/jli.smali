.class public final La/jli;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rki;


# direct methods
.method public constructor <init>(La/rki;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jli;->a:La/rki;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 24

    .line 1
    new-instance v0, La/xc30;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/jli;->a:La/rki;

    .line 6
    .line 7
    iget-object v1, v1, La/rki;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/cr;

    .line 10
    .line 11
    new-instance v2, La/xsu;

    .line 12
    .line 13
    new-instance v3, La/cyu;

    .line 14
    .line 15
    new-instance v4, La/zn00;

    .line 16
    .line 17
    iget-object v5, v1, La/cr;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, La/gii0;

    .line 20
    .line 21
    const/4 v6, 0x3

    .line 22
    invoke-direct {v4, v5, v6}, La/zn00;-><init>(La/gii0;B)V

    .line 23
    .line 24
    .line 25
    iget-object v5, v1, La/cr;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, La/zb30;

    .line 28
    .line 29
    iget-object v7, v1, La/cr;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v7, La/knf0;

    .line 32
    .line 33
    invoke-direct {v3, v4, v5, v7}, La/cyu;-><init>(La/zn00;La/zb30;La/knf0;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, v3}, La/xsu;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v3, v1, La/cr;->f:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, La/ocl;

    .line 42
    .line 43
    iget-object v4, v1, La/cr;->g:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, La/m1e;

    .line 46
    .line 47
    iget-object v5, v1, La/cr;->h:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v5, Ljava/lang/String;

    .line 50
    .line 51
    iget-object v7, v1, La/cr;->i:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v7, Ljava/lang/Long;

    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    iget-object v9, v1, La/cr;->j:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v9, La/uyu;

    .line 62
    .line 63
    iget-object v10, v1, La/cr;->k:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v10, La/duj;

    .line 66
    .line 67
    iget-object v11, v1, La/cr;->l:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v11, La/cad;

    .line 70
    .line 71
    iget-object v11, v11, La/cad;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v11, La/psc;

    .line 74
    .line 75
    invoke-virtual {v11}, La/psc;->h()La/mne;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move-wide v12, v7

    .line 83
    move-object v8, v9

    .line 84
    move-object v9, v10

    .line 85
    move-object v10, v11

    .line 86
    new-instance v11, La/weu;

    .line 87
    .line 88
    iget-object v7, v1, La/cr;->m:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v7, La/pmi0;

    .line 91
    .line 92
    iget-object v14, v7, La/pmi0;->a:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v14, La/daf;

    .line 95
    .line 96
    invoke-virtual {v14}, La/daf;->A()La/nfm0;

    .line 97
    .line 98
    .line 99
    move-result-object v14

    .line 100
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    const/4 v15, 0x0

    .line 104
    invoke-direct {v11, v14, v15}, La/weu;-><init>(La/nfm0;B)V

    .line 105
    .line 106
    .line 107
    move-wide v13, v12

    .line 108
    new-instance v12, La/qzt;

    .line 109
    .line 110
    iget-object v6, v1, La/cr;->b:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v6, La/pru;

    .line 113
    .line 114
    invoke-direct {v12, v6, v15}, La/qzt;-><init>(La/pru;B)V

    .line 115
    .line 116
    .line 117
    iget-object v6, v1, La/cr;->n:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v6, La/ctf0;

    .line 120
    .line 121
    iget-object v15, v7, La/pmi0;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v15, La/daf;

    .line 124
    .line 125
    invoke-virtual {v15}, La/daf;->r()La/fhj;

    .line 126
    .line 127
    .line 128
    move-result-object v15

    .line 129
    move-object/from16 v16, v0

    .line 130
    .line 131
    iget-object v0, v1, La/cr;->o:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, La/wyu;

    .line 134
    .line 135
    move-object/from16 v17, v0

    .line 136
    .line 137
    iget-object v0, v1, La/cr;->p:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, La/i1w0;

    .line 140
    .line 141
    move-object/from16 v18, v0

    .line 142
    .line 143
    iget-object v0, v7, La/pmi0;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, La/daf;

    .line 146
    .line 147
    invoke-virtual {v0}, La/daf;->s()La/f7u;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    move-object/from16 v19, v0

    .line 152
    .line 153
    new-instance v0, La/jwu;

    .line 154
    .line 155
    iget-object v7, v7, La/pmi0;->a:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v7, La/daf;

    .line 158
    .line 159
    invoke-virtual {v7}, La/daf;->A()La/nfm0;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    move-object/from16 v20, v2

    .line 167
    .line 168
    const/4 v2, 0x2

    .line 169
    invoke-direct {v0, v7, v2}, La/jwu;-><init>(La/nfm0;B)V

    .line 170
    .line 171
    .line 172
    new-instance v2, La/clc;

    .line 173
    .line 174
    new-instance v7, La/cyu;

    .line 175
    .line 176
    move-object/from16 v21, v0

    .line 177
    .line 178
    new-instance v0, La/zn00;

    .line 179
    .line 180
    move-object/from16 v22, v3

    .line 181
    .line 182
    iget-object v3, v1, La/cr;->c:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v3, La/gii0;

    .line 185
    .line 186
    move-object/from16 v23, v4

    .line 187
    .line 188
    const/4 v4, 0x3

    .line 189
    invoke-direct {v0, v3, v4}, La/zn00;-><init>(La/gii0;B)V

    .line 190
    .line 191
    .line 192
    iget-object v3, v1, La/cr;->d:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v3, La/zb30;

    .line 195
    .line 196
    iget-object v4, v1, La/cr;->e:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v4, La/knf0;

    .line 199
    .line 200
    invoke-direct {v7, v0, v3, v4}, La/cyu;-><init>(La/zn00;La/zb30;La/knf0;)V

    .line 201
    .line 202
    .line 203
    const/4 v4, 0x3

    .line 204
    invoke-direct {v2, v7, v4}, La/clc;-><init>(Ljava/lang/Object;B)V

    .line 205
    .line 206
    .line 207
    iget-object v0, v1, La/cr;->r:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v0, La/r9u;

    .line 210
    .line 211
    move-wide v3, v13

    .line 212
    move-object v13, v6

    .line 213
    move-wide v6, v3

    .line 214
    move-object v14, v15

    .line 215
    move-object/from16 v15, v17

    .line 216
    .line 217
    move-object/from16 v17, v19

    .line 218
    .line 219
    move-object/from16 v1, v20

    .line 220
    .line 221
    move-object/from16 v3, v22

    .line 222
    .line 223
    move-object/from16 v4, v23

    .line 224
    .line 225
    move-object/from16 v20, v0

    .line 226
    .line 227
    move-object/from16 v19, v2

    .line 228
    .line 229
    move-object/from16 v0, v16

    .line 230
    .line 231
    move-object/from16 v16, v18

    .line 232
    .line 233
    move-object/from16 v18, v21

    .line 234
    .line 235
    move-object/from16 v2, p1

    .line 236
    .line 237
    invoke-direct/range {v0 .. v20}, La/xc30;-><init>(La/xsu;La/vzg0;La/ocl;La/m1e;Ljava/lang/String;JLa/uyu;La/duj;La/mne;La/weu;La/qzt;La/ctf0;La/fhj;La/wyu;La/i1w0;La/f7u;La/jwu;La/clc;La/r9u;)V

    .line 238
    .line 239
    .line 240
    return-object v0
.end method
