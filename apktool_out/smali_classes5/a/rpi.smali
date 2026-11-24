.class public final La/rpi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/omi;


# direct methods
.method public constructor <init>(La/omi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rpi;->a:La/omi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 21

    .line 1
    new-instance v0, La/sec0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/rpi;->a:La/omi;

    .line 6
    .line 7
    iget-object v1, v1, La/omi;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/spi;

    .line 10
    .line 11
    new-instance v2, La/hnu;

    .line 12
    .line 13
    new-instance v3, La/w5z;

    .line 14
    .line 15
    iget-object v4, v1, La/spi;->t:La/n5d0;

    .line 16
    .line 17
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, La/agc0;

    .line 22
    .line 23
    iget-object v5, v1, La/spi;->a:La/xyt;

    .line 24
    .line 25
    iget-object v6, v1, La/spi;->b:La/btt0;

    .line 26
    .line 27
    iget-object v7, v1, La/spi;->c:La/knf0;

    .line 28
    .line 29
    new-instance v8, La/jw20;

    .line 30
    .line 31
    iget-object v9, v1, La/spi;->d:La/gii0;

    .line 32
    .line 33
    const/16 v10, 0xf

    .line 34
    .line 35
    invoke-direct {v8, v9, v10}, La/jw20;-><init>(La/gii0;B)V

    .line 36
    .line 37
    .line 38
    invoke-direct/range {v3 .. v8}, La/w5z;-><init>(La/agc0;La/xyt;La/btt0;La/knf0;La/jw20;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, v3}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, La/lbu;

    .line 45
    .line 46
    new-instance v4, La/qgd;

    .line 47
    .line 48
    iget-object v5, v1, La/spi;->a:La/xyt;

    .line 49
    .line 50
    new-instance v6, La/x1u;

    .line 51
    .line 52
    iget-object v12, v1, La/spi;->e:La/gst0;

    .line 53
    .line 54
    const/4 v7, 0x1

    .line 55
    invoke-direct {v6, v12, v7}, La/x1u;-><init>(La/gst0;B)V

    .line 56
    .line 57
    .line 58
    new-instance v7, La/qf9;

    .line 59
    .line 60
    invoke-virtual {v1}, La/spi;->a()La/pzu;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-direct {v7, v8}, La/qf9;-><init>(La/pzu;)V

    .line 65
    .line 66
    .line 67
    new-instance v8, La/a6u;

    .line 68
    .line 69
    iget-object v14, v1, La/spi;->f:La/ntu;

    .line 70
    .line 71
    iget-object v15, v1, La/spi;->g:La/pru;

    .line 72
    .line 73
    iget-object v9, v1, La/spi;->h:La/cdu;

    .line 74
    .line 75
    iget-object v10, v1, La/spi;->i:La/fhj;

    .line 76
    .line 77
    new-instance v11, La/k9c;

    .line 78
    .line 79
    new-instance v13, La/ort;

    .line 80
    .line 81
    move-object/from16 v20, v0

    .line 82
    .line 83
    const/4 v0, 0x3

    .line 84
    invoke-direct {v13, v12, v0}, La/ort;-><init>(La/gst0;B)V

    .line 85
    .line 86
    .line 87
    invoke-direct {v11, v13}, La/k9c;-><init>(La/ort;)V

    .line 88
    .line 89
    .line 90
    const/16 v19, 0xa

    .line 91
    .line 92
    move-object v13, v8

    .line 93
    move-object/from16 v16, v9

    .line 94
    .line 95
    move-object/from16 v17, v10

    .line 96
    .line 97
    move-object/from16 v18, v11

    .line 98
    .line 99
    invoke-direct/range {v13 .. v19}, La/a6u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    new-instance v9, La/rf9;

    .line 103
    .line 104
    invoke-virtual {v1}, La/spi;->a()La/pzu;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-direct {v9, v10}, La/rf9;-><init>(La/pzu;)V

    .line 109
    .line 110
    .line 111
    iget-object v11, v1, La/spi;->j:La/rou;

    .line 112
    .line 113
    move-object v10, v15

    .line 114
    invoke-direct/range {v4 .. v11}, La/qgd;-><init>(La/xyt;La/x1u;La/qf9;La/a6u;La/rf9;La/pru;La/rou;)V

    .line 115
    .line 116
    .line 117
    new-instance v13, La/a6u;

    .line 118
    .line 119
    new-instance v5, La/k9c;

    .line 120
    .line 121
    new-instance v6, La/ort;

    .line 122
    .line 123
    invoke-direct {v6, v12, v0}, La/ort;-><init>(La/gst0;B)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v5, v6}, La/k9c;-><init>(La/ort;)V

    .line 127
    .line 128
    .line 129
    move-object/from16 v18, v5

    .line 130
    .line 131
    invoke-direct/range {v13 .. v19}, La/a6u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    const/16 v0, 0xa

    .line 135
    .line 136
    invoke-direct {v3, v4, v13, v0}, La/lbu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 137
    .line 138
    .line 139
    new-instance v4, La/rl70;

    .line 140
    .line 141
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 142
    .line 143
    .line 144
    iget-object v5, v1, La/spi;->k:La/i1w0;

    .line 145
    .line 146
    iget-object v6, v1, La/spi;->l:La/m1e;

    .line 147
    .line 148
    iget-object v7, v1, La/spi;->m:La/duj;

    .line 149
    .line 150
    iget-object v8, v1, La/spi;->n:La/ctf0;

    .line 151
    .line 152
    iget-object v9, v1, La/spi;->o:La/g2v;

    .line 153
    .line 154
    iget-object v0, v1, La/spi;->p:La/wsf0;

    .line 155
    .line 156
    iget-object v10, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v10, La/g45;

    .line 159
    .line 160
    invoke-virtual {v10}, La/g45;->E()La/nou;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    new-instance v11, La/j910;

    .line 165
    .line 166
    new-instance v12, La/f4u;

    .line 167
    .line 168
    invoke-virtual {v1}, La/spi;->a()La/pzu;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    const/16 v14, 0x1a

    .line 173
    .line 174
    invoke-direct {v12, v13, v14}, La/f4u;-><init>(Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    iget-object v0, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, La/g45;

    .line 180
    .line 181
    invoke-virtual {v0}, La/g45;->n0()La/trm0;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const/16 v13, 0x16

    .line 186
    .line 187
    invoke-direct {v11, v12, v0, v13}, La/j910;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 188
    .line 189
    .line 190
    iget-object v12, v1, La/spi;->q:La/b4j;

    .line 191
    .line 192
    iget-object v13, v1, La/spi;->r:La/x20;

    .line 193
    .line 194
    iget-object v0, v1, La/spi;->s:La/cad;

    .line 195
    .line 196
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, La/psc;

    .line 199
    .line 200
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 201
    .line 202
    .line 203
    move-result-object v14

    .line 204
    invoke-static {v14}, La/x1x;->x(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    move-object/from16 v1, p1

    .line 208
    .line 209
    move-object/from16 v0, v20

    .line 210
    .line 211
    invoke-direct/range {v0 .. v15}, La/sec0;-><init>(La/vzg0;La/hnu;La/lbu;La/rl70;La/i1w0;La/m1e;La/duj;La/ctf0;La/g2v;La/nou;La/j910;La/b4j;La/x20;La/mne;La/pru;)V

    .line 212
    .line 213
    .line 214
    return-object v0
.end method
