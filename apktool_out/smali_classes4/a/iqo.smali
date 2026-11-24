.class public final synthetic La/iqo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kqo;


# direct methods
.method public synthetic constructor <init>(La/kqo;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iqo;->a:B

    iput-object p1, p0, La/iqo;->b:La/kqo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iqo;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/iqo;->b:La/kqo;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/kqo;->P1:La/pek;

    .line 11
    .line 12
    iget-object v0, v0, La/kqo;->N1:La/a8z;

    .line 13
    .line 14
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/k3t0;

    .line 19
    .line 20
    sget-object v1, La/xpo;->a:La/xpo;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    sget-object v1, La/kqo;->P1:La/pek;

    .line 29
    .line 30
    new-instance v1, La/q0h0;

    .line 31
    .line 32
    invoke-virtual {v0}, La/kqo;->G0()La/dfi;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v0, v0, La/dfi;->v:La/n5d0;

    .line 37
    .line 38
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/cfi;

    .line 43
    .line 44
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :pswitch_1
    sget-object v1, La/kqo;->P1:La/pek;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    instance-of v2, v1, La/af3;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    check-cast v1, La/af3;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move-object v1, v3

    .line 70
    :goto_0
    const-class v2, La/dhj;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, La/o5d0;

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, La/ze3;

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move-object v1, v3

    .line 94
    :goto_1
    instance-of v4, v1, La/dhj;

    .line 95
    .line 96
    if-nez v4, :cond_2

    .line 97
    .line 98
    move-object v1, v3

    .line 99
    :cond_2
    check-cast v1, La/dhj;

    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    iget-object v2, v0, La/kqo;->L1:La/cgx0;

    .line 108
    .line 109
    sget-object v3, La/kqo;->Q1:[La/iiy;

    .line 110
    .line 111
    const/4 v4, 0x1

    .line 112
    aget-object v3, v3, v4

    .line 113
    .line 114
    invoke-virtual {v2, v0, v3}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    xor-int/2addr v0, v4

    .line 123
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object v7, v1, La/dhj;->b:La/yqc;

    .line 127
    .line 128
    iget-object v5, v1, La/dhj;->a:La/cad;

    .line 129
    .line 130
    iget-object v2, v1, La/dhj;->c:La/edo;

    .line 131
    .line 132
    iget-object v3, v1, La/dhj;->e:La/zfo;

    .line 133
    .line 134
    iget-object v4, v1, La/dhj;->f:La/gii0;

    .line 135
    .line 136
    iget-object v10, v1, La/dhj;->g:La/ctf0;

    .line 137
    .line 138
    iget-object v11, v1, La/dhj;->d:La/g2v;

    .line 139
    .line 140
    iget-object v12, v1, La/dhj;->h:La/ouu;

    .line 141
    .line 142
    iget-object v8, v1, La/dhj;->i:La/ii;

    .line 143
    .line 144
    iget-object v13, v1, La/dhj;->j:La/qu;

    .line 145
    .line 146
    iget-object v6, v1, La/dhj;->l:La/m1e;

    .line 147
    .line 148
    iget-object v14, v1, La/dhj;->m:La/qv2;

    .line 149
    .line 150
    iget-object v15, v1, La/dhj;->n:La/knf0;

    .line 151
    .line 152
    move-object/from16 v16, v6

    .line 153
    .line 154
    iget-object v6, v1, La/dhj;->o:La/sue;

    .line 155
    .line 156
    move/from16 p0, v0

    .line 157
    .line 158
    iget-object v0, v1, La/dhj;->p:La/duj;

    .line 159
    .line 160
    move-object/from16 v17, v14

    .line 161
    .line 162
    iget-object v14, v1, La/dhj;->k:La/bek;

    .line 163
    .line 164
    move-object/from16 v18, v0

    .line 165
    .line 166
    iget-object v0, v1, La/dhj;->q:La/nek;

    .line 167
    .line 168
    move-object/from16 v19, v0

    .line 169
    .line 170
    iget-object v0, v1, La/dhj;->r:La/x20;

    .line 171
    .line 172
    move-object/from16 v20, v0

    .line 173
    .line 174
    iget-object v0, v1, La/dhj;->s:La/pmi;

    .line 175
    .line 176
    move-object/from16 v21, v0

    .line 177
    .line 178
    iget-object v0, v1, La/dhj;->t:La/pru;

    .line 179
    .line 180
    move-object/from16 v22, v0

    .line 181
    .line 182
    iget-object v0, v1, La/dhj;->u:La/gst0;

    .line 183
    .line 184
    move-object/from16 v23, v0

    .line 185
    .line 186
    iget-object v0, v1, La/dhj;->v:La/b3c0;

    .line 187
    .line 188
    move-object/from16 v24, v0

    .line 189
    .line 190
    iget-object v0, v1, La/dhj;->w:La/h3c;

    .line 191
    .line 192
    iget-object v1, v1, La/dhj;->x:La/j1q0;

    .line 193
    .line 194
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    new-instance v4, La/dfi;

    .line 228
    .line 229
    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 230
    .line 231
    .line 232
    move-result-object v15

    .line 233
    move-object/from16 v25, v1

    .line 234
    .line 235
    move-object/from16 v23, v24

    .line 236
    .line 237
    move-object/from16 v24, v0

    .line 238
    .line 239
    invoke-direct/range {v4 .. v25}, La/dfi;-><init>(La/cad;La/sue;La/yqc;La/ii;La/i1w0;La/ctf0;La/g2v;La/ouu;La/qu;La/bek;Ljava/lang/Boolean;La/m1e;La/qv2;La/duj;La/nek;La/x20;La/pmi;La/pru;La/b3c0;La/h3c;La/j1q0;)V

    .line 240
    .line 241
    .line 242
    move-object v3, v4

    .line 243
    goto :goto_2

    .line 244
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 245
    .line 246
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :goto_2
    return-object v3

    .line 254
    nop

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
