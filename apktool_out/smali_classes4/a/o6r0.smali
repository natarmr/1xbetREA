.class public final synthetic La/o6r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r6r0;


# direct methods
.method public synthetic constructor <init>(La/r6r0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o6r0;->a:B

    iput-object p1, p0, La/o6r0;->b:La/r6r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/o6r0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/o6r0;->b:La/r6r0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/r6r0;->S1:La/s2m0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/r6r0;->G0()La/k3t0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, La/c6r0;->a:La/c6r0;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v1, La/r6r0;->S1:La/s2m0;

    .line 26
    .line 27
    invoke-virtual {v0}, La/r6r0;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget-object v1, La/b6r0;->a:La/b6r0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_1
    sget-object v1, La/r6r0;->S1:La/s2m0;

    .line 40
    .line 41
    invoke-virtual {v0}, La/r6r0;->G0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, La/d6r0;->a:La/d6r0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_2
    new-instance v1, La/q0h0;

    .line 54
    .line 55
    iget-object v0, v0, La/r6r0;->K1:La/pxi;

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_0
    const-string v0, "viewModelFactory"

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v2

    .line 69
    :pswitch_3
    sget-object v1, La/r6r0;->S1:La/s2m0;

    .line 70
    .line 71
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    instance-of v3, v1, La/af3;

    .line 83
    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    check-cast v1, La/af3;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    move-object v1, v2

    .line 90
    :goto_0
    const-class v3, La/s6r0;

    .line 91
    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, La/o5d0;

    .line 103
    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, La/ze3;

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    move-object v1, v2

    .line 114
    :goto_1
    instance-of v4, v1, La/s6r0;

    .line 115
    .line 116
    if-nez v4, :cond_3

    .line 117
    .line 118
    move-object v1, v2

    .line 119
    :cond_3
    check-cast v1, La/s6r0;

    .line 120
    .line 121
    if-eqz v1, :cond_4

    .line 122
    .line 123
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    iget-object v2, v0, La/r6r0;->N1:La/yzn0;

    .line 128
    .line 129
    sget-object v3, La/r6r0;->U1:[La/iiy;

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    aget-object v3, v3, v4

    .line 133
    .line 134
    invoke-virtual {v2, v0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object v14, v0

    .line 139
    check-cast v14, La/m7r0;

    .line 140
    .line 141
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object v12, v1, La/s6r0;->a:La/g2v;

    .line 145
    .line 146
    iget-object v0, v1, La/s6r0;->c:La/m1e;

    .line 147
    .line 148
    iget-object v7, v1, La/s6r0;->d:La/cad;

    .line 149
    .line 150
    iget-object v11, v1, La/s6r0;->b:La/ctf0;

    .line 151
    .line 152
    iget-object v13, v1, La/s6r0;->i:La/y78;

    .line 153
    .line 154
    iget-object v8, v1, La/s6r0;->e:La/iw20;

    .line 155
    .line 156
    iget-object v5, v1, La/s6r0;->f:La/itr;

    .line 157
    .line 158
    iget-object v6, v1, La/s6r0;->h:La/ugf0;

    .line 159
    .line 160
    iget-object v9, v1, La/s6r0;->g:La/iip;

    .line 161
    .line 162
    iget-object v10, v1, La/s6r0;->j:La/nr00;

    .line 163
    .line 164
    iget-object v2, v1, La/s6r0;->k:La/wdk0;

    .line 165
    .line 166
    iget-object v3, v1, La/s6r0;->l:La/r9u;

    .line 167
    .line 168
    iget-object v4, v1, La/s6r0;->m:La/kt2;

    .line 169
    .line 170
    move-object/from16 v16, v0

    .line 171
    .line 172
    iget-object v0, v1, La/s6r0;->n:La/zr1;

    .line 173
    .line 174
    move-object/from16 v20, v0

    .line 175
    .line 176
    iget-object v0, v1, La/s6r0;->p:La/s31;

    .line 177
    .line 178
    iget-object v1, v1, La/s6r0;->o:La/cyu;

    .line 179
    .line 180
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-object/from16 v19, v4

    .line 202
    .line 203
    new-instance v4, La/qxi;

    .line 204
    .line 205
    move-object/from16 v22, v0

    .line 206
    .line 207
    move-object/from16 v21, v1

    .line 208
    .line 209
    move-object/from16 v17, v2

    .line 210
    .line 211
    move-object/from16 v18, v3

    .line 212
    .line 213
    invoke-direct/range {v4 .. v22}, La/qxi;-><init>(La/itr;La/ugf0;La/cad;La/iw20;La/iip;La/nr00;La/ctf0;La/g2v;La/y78;La/m7r0;La/i1w0;La/m1e;La/wdk0;La/r9u;La/kt2;La/zr1;La/cyu;La/s31;)V

    .line 214
    .line 215
    .line 216
    move-object v2, v4

    .line 217
    goto :goto_2

    .line 218
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 219
    .line 220
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :goto_2
    return-object v2

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
