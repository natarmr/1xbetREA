.class public final La/hji;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/tii;


# direct methods
.method public constructor <init>(La/tii;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hji;->a:La/tii;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 22

    .line 1
    new-instance v0, La/a2y;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/hji;->a:La/tii;

    .line 6
    .line 7
    iget-object v1, v1, La/tii;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/iji;

    .line 10
    .line 11
    new-instance v2, La/hrc;

    .line 12
    .line 13
    invoke-virtual {v1}, La/iji;->a()La/pzu;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {v2, v3}, La/hrc;-><init>(La/pzu;)V

    .line 18
    .line 19
    .line 20
    new-instance v3, La/lbu;

    .line 21
    .line 22
    new-instance v4, La/ivn;

    .line 23
    .line 24
    invoke-virtual {v1}, La/iji;->a()La/pzu;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-direct {v4, v5}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/hrc;

    .line 32
    .line 33
    invoke-virtual {v1}, La/iji;->a()La/pzu;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-direct {v5, v6}, La/hrc;-><init>(La/pzu;)V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x6

    .line 41
    invoke-direct {v3, v4, v5, v6}, La/lbu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    new-instance v4, La/ngu;

    .line 45
    .line 46
    invoke-virtual {v1}, La/iji;->a()La/pzu;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-direct {v4, v5}, La/ngu;-><init>(La/pzu;)V

    .line 51
    .line 52
    .line 53
    new-instance v5, La/ngu;

    .line 54
    .line 55
    invoke-virtual {v1}, La/iji;->a()La/pzu;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-direct {v5, v6}, La/ngu;-><init>(La/pzu;)V

    .line 60
    .line 61
    .line 62
    new-instance v6, La/ivn;

    .line 63
    .line 64
    invoke-virtual {v1}, La/iji;->a()La/pzu;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-direct {v6, v7}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v13, v1, La/iji;->h:La/wsf0;

    .line 72
    .line 73
    iget-object v7, v13, La/wsf0;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v7, La/g45;

    .line 76
    .line 77
    invoke-virtual {v7}, La/g45;->G()La/khf0;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    iget-object v14, v1, La/iji;->i:La/v88;

    .line 82
    .line 83
    invoke-virtual {v13}, La/wsf0;->b()La/ot;

    .line 84
    .line 85
    .line 86
    move-result-object v15

    .line 87
    iget-object v8, v13, La/wsf0;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v8, La/g45;

    .line 90
    .line 91
    invoke-virtual {v8}, La/g45;->Y()La/b8u;

    .line 92
    .line 93
    .line 94
    move-result-object v16

    .line 95
    iget-object v8, v1, La/iji;->j:La/rou;

    .line 96
    .line 97
    new-instance v12, La/w5z;

    .line 98
    .line 99
    invoke-virtual {v1}, La/iji;->a()La/pzu;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    new-instance v10, La/p4u;

    .line 104
    .line 105
    invoke-virtual {v1}, La/iji;->a()La/pzu;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    invoke-direct {v10, v11}, La/p4u;-><init>(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    new-instance v11, La/ivn;

    .line 113
    .line 114
    move-object/from16 v17, v0

    .line 115
    .line 116
    invoke-virtual {v1}, La/iji;->a()La/pzu;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {v11, v0}, La/ivn;-><init>(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    move-object v0, v8

    .line 124
    move-object v8, v12

    .line 125
    new-instance v12, La/p4u;

    .line 126
    .line 127
    move-object/from16 p0, v0

    .line 128
    .line 129
    new-instance v0, La/gxu;

    .line 130
    .line 131
    move-object/from16 v18, v2

    .line 132
    .line 133
    iget-object v2, v1, La/iji;->d:La/csr0;

    .line 134
    .line 135
    move-object/from16 v19, v3

    .line 136
    .line 137
    new-instance v3, La/ilp0;

    .line 138
    .line 139
    move-object/from16 v20, v4

    .line 140
    .line 141
    iget-object v4, v1, La/iji;->e:La/gii0;

    .line 142
    .line 143
    move-object/from16 v21, v5

    .line 144
    .line 145
    const/4 v5, 0x3

    .line 146
    invoke-direct {v3, v4, v5}, La/ilp0;-><init>(La/gii0;B)V

    .line 147
    .line 148
    .line 149
    iget-object v4, v1, La/iji;->f:La/knf0;

    .line 150
    .line 151
    invoke-direct {v0, v2, v3, v4}, La/gxu;-><init>(La/csr0;La/ilp0;La/knf0;)V

    .line 152
    .line 153
    .line 154
    invoke-direct {v12, v0}, La/p4u;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    move-object/from16 v0, p0

    .line 158
    .line 159
    invoke-direct/range {v8 .. v13}, La/w5z;-><init>(La/pzu;La/p4u;La/ivn;La/p4u;La/hg5;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v13}, La/wsf0;->a()La/ilt0;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    move-object v12, v8

    .line 167
    move-object v8, v14

    .line 168
    iget-object v14, v1, La/iji;->o:La/wyu;

    .line 169
    .line 170
    move-object v9, v15

    .line 171
    iget-object v15, v1, La/iji;->k:La/duj;

    .line 172
    .line 173
    iget-object v2, v1, La/iji;->l:La/cad;

    .line 174
    .line 175
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v2, La/psc;

    .line 178
    .line 179
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget-object v3, v1, La/iji;->m:La/ctf0;

    .line 187
    .line 188
    iget-object v4, v1, La/iji;->n:La/i1w0;

    .line 189
    .line 190
    iget-object v1, v1, La/iji;->p:La/m1e;

    .line 191
    .line 192
    move-object v11, v0

    .line 193
    move-object/from16 v10, v16

    .line 194
    .line 195
    move-object/from16 v0, v17

    .line 196
    .line 197
    move-object/from16 v5, v21

    .line 198
    .line 199
    move-object/from16 v16, v2

    .line 200
    .line 201
    move-object/from16 v17, v3

    .line 202
    .line 203
    move-object/from16 v2, v18

    .line 204
    .line 205
    move-object/from16 v3, v19

    .line 206
    .line 207
    move-object/from16 v19, v1

    .line 208
    .line 209
    move-object/from16 v18, v4

    .line 210
    .line 211
    move-object/from16 v4, v20

    .line 212
    .line 213
    move-object/from16 v1, p1

    .line 214
    .line 215
    invoke-direct/range {v0 .. v19}, La/a2y;-><init>(La/vzg0;La/hrc;La/lbu;La/ngu;La/ngu;La/ivn;La/khf0;La/v88;La/ot;La/b8u;La/rou;La/w5z;La/ilt0;La/wyu;La/duj;La/mne;La/ctf0;La/i1w0;La/m1e;)V

    .line 216
    .line 217
    .line 218
    return-object v0
.end method
