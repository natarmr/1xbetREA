.class public final La/dki;
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
    iput-byte p2, p0, La/dki;->a:B

    iput-object p1, p0, La/dki;->b:La/n5d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dki;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v0, v0, La/dki;->b:La/n5d0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v4, p1

    .line 12
    .line 13
    check-cast v4, La/i1w0;

    .line 14
    .line 15
    new-instance v3, La/gkc0;

    .line 16
    .line 17
    check-cast v0, La/psi;

    .line 18
    .line 19
    iget-object v0, v0, La/psi;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, La/iyi;

    .line 22
    .line 23
    new-instance v5, La/tpx;

    .line 24
    .line 25
    iget-object v1, v0, La/iyi;->b:La/tnc0;

    .line 26
    .line 27
    invoke-direct {v5, v1, v2}, La/tpx;-><init>(La/tnc0;B)V

    .line 28
    .line 29
    .line 30
    new-instance v6, La/ikt0;

    .line 31
    .line 32
    iget-object v1, v0, La/iyi;->b:La/tnc0;

    .line 33
    .line 34
    invoke-direct {v6, v1}, La/ikt0;-><init>(La/tnc0;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, La/iyi;->a:La/g8i;

    .line 38
    .line 39
    invoke-virtual {v2}, La/g8i;->q1()La/m1e;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v8, La/wsf0;

    .line 47
    .line 48
    invoke-direct {v8, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 49
    .line 50
    .line 51
    iget-object v9, v0, La/iyi;->c:La/wsf0;

    .line 52
    .line 53
    iget-object v10, v9, La/wsf0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v10, La/g45;

    .line 56
    .line 57
    invoke-virtual {v10}, La/g45;->n0()La/trm0;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    invoke-virtual {v9}, La/wsf0;->a()La/ilt0;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-virtual {v2}, La/g8i;->v1()La/mne;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    new-instance v12, La/ljf0;

    .line 70
    .line 71
    invoke-direct {v12, v1}, La/ljf0;-><init>(La/tnc0;)V

    .line 72
    .line 73
    .line 74
    iget-object v13, v0, La/iyi;->d:La/s470;

    .line 75
    .line 76
    invoke-virtual {v2}, La/g8i;->q4()La/ddu;

    .line 77
    .line 78
    .line 79
    move-result-object v14

    .line 80
    invoke-virtual {v2}, La/g8i;->d2()La/duj;

    .line 81
    .line 82
    .line 83
    move-result-object v15

    .line 84
    move-object/from16 v18, v10

    .line 85
    .line 86
    move-object v10, v9

    .line 87
    move-object/from16 v9, v18

    .line 88
    .line 89
    invoke-direct/range {v3 .. v15}, La/gkc0;-><init>(La/i1w0;La/tpx;La/ikt0;La/m1e;La/wsf0;La/trm0;La/ilt0;La/mne;La/ljf0;La/s470;La/ddu;La/duj;)V

    .line 90
    .line 91
    .line 92
    return-object v3

    .line 93
    :pswitch_0
    move-object/from16 v5, p1

    .line 94
    .line 95
    check-cast v5, La/i1w0;

    .line 96
    .line 97
    new-instance v4, La/gkc0;

    .line 98
    .line 99
    check-cast v0, La/gji;

    .line 100
    .line 101
    iget-object v0, v0, La/gji;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, La/nli;

    .line 104
    .line 105
    new-instance v6, La/tpx;

    .line 106
    .line 107
    iget-object v1, v0, La/nli;->b:La/tnc0;

    .line 108
    .line 109
    invoke-direct {v6, v1, v2}, La/tpx;-><init>(La/tnc0;B)V

    .line 110
    .line 111
    .line 112
    new-instance v7, La/ikt0;

    .line 113
    .line 114
    iget-object v1, v0, La/nli;->b:La/tnc0;

    .line 115
    .line 116
    invoke-direct {v7, v1}, La/ikt0;-><init>(La/tnc0;)V

    .line 117
    .line 118
    .line 119
    iget-object v2, v0, La/nli;->a:La/g8i;

    .line 120
    .line 121
    invoke-virtual {v2}, La/g8i;->q1()La/m1e;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    new-instance v9, La/wsf0;

    .line 129
    .line 130
    invoke-direct {v9, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, La/nli;->c:La/wsf0;

    .line 134
    .line 135
    iget-object v3, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v3, La/g45;

    .line 138
    .line 139
    invoke-virtual {v3}, La/g45;->n0()La/trm0;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    invoke-virtual {v0}, La/wsf0;->a()La/ilt0;

    .line 144
    .line 145
    .line 146
    move-result-object v11

    .line 147
    invoke-virtual {v2}, La/g8i;->v1()La/mne;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    new-instance v13, La/ljf0;

    .line 152
    .line 153
    invoke-direct {v13, v1}, La/ljf0;-><init>(La/tnc0;)V

    .line 154
    .line 155
    .line 156
    sget-object v14, La/s470;->c:La/s470;

    .line 157
    .line 158
    invoke-virtual {v2}, La/g8i;->q4()La/ddu;

    .line 159
    .line 160
    .line 161
    move-result-object v15

    .line 162
    invoke-virtual {v2}, La/g8i;->d2()La/duj;

    .line 163
    .line 164
    .line 165
    move-result-object v16

    .line 166
    invoke-direct/range {v4 .. v16}, La/gkc0;-><init>(La/i1w0;La/tpx;La/ikt0;La/m1e;La/wsf0;La/trm0;La/ilt0;La/mne;La/ljf0;La/s470;La/ddu;La/duj;)V

    .line 167
    .line 168
    .line 169
    return-object v4

    .line 170
    :pswitch_1
    move-object/from16 v6, p1

    .line 171
    .line 172
    check-cast v6, La/i1w0;

    .line 173
    .line 174
    new-instance v5, La/gkc0;

    .line 175
    .line 176
    check-cast v0, La/rii;

    .line 177
    .line 178
    iget-object v0, v0, La/rii;->c:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, La/fki;

    .line 181
    .line 182
    new-instance v7, La/tpx;

    .line 183
    .line 184
    iget-object v1, v0, La/fki;->b:La/tnc0;

    .line 185
    .line 186
    invoke-direct {v7, v1, v2}, La/tpx;-><init>(La/tnc0;B)V

    .line 187
    .line 188
    .line 189
    new-instance v8, La/ikt0;

    .line 190
    .line 191
    iget-object v1, v0, La/fki;->b:La/tnc0;

    .line 192
    .line 193
    invoke-direct {v8, v1}, La/ikt0;-><init>(La/tnc0;)V

    .line 194
    .line 195
    .line 196
    iget-object v2, v0, La/fki;->a:La/g8i;

    .line 197
    .line 198
    invoke-virtual {v2}, La/g8i;->q1()La/m1e;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    new-instance v10, La/wsf0;

    .line 206
    .line 207
    invoke-direct {v10, v1}, La/wsf0;-><init>(La/tnc0;)V

    .line 208
    .line 209
    .line 210
    iget-object v0, v0, La/fki;->c:La/wsf0;

    .line 211
    .line 212
    iget-object v3, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v3, La/g45;

    .line 215
    .line 216
    invoke-virtual {v3}, La/g45;->n0()La/trm0;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    invoke-virtual {v0}, La/wsf0;->a()La/ilt0;

    .line 221
    .line 222
    .line 223
    move-result-object v12

    .line 224
    invoke-virtual {v2}, La/g8i;->v1()La/mne;

    .line 225
    .line 226
    .line 227
    move-result-object v13

    .line 228
    new-instance v14, La/ljf0;

    .line 229
    .line 230
    invoke-direct {v14, v1}, La/ljf0;-><init>(La/tnc0;)V

    .line 231
    .line 232
    .line 233
    sget-object v15, La/s470;->f:La/s470;

    .line 234
    .line 235
    invoke-virtual {v2}, La/g8i;->q4()La/ddu;

    .line 236
    .line 237
    .line 238
    move-result-object v16

    .line 239
    invoke-virtual {v2}, La/g8i;->d2()La/duj;

    .line 240
    .line 241
    .line 242
    move-result-object v17

    .line 243
    invoke-direct/range {v5 .. v17}, La/gkc0;-><init>(La/i1w0;La/tpx;La/ikt0;La/m1e;La/wsf0;La/trm0;La/ilt0;La/mne;La/ljf0;La/s470;La/ddu;La/duj;)V

    .line 244
    .line 245
    .line 246
    return-object v5

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
