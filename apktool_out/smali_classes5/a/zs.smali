.class public final synthetic La/zs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ft;


# direct methods
.method public synthetic constructor <init>(La/ft;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zs;->a:B

    iput-object p1, p0, La/zs;->b:La/ft;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/zs;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zs;->b:La/ft;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ft;->N1:La/qek0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/ft;->G0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/ss;->a:La/ss;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/ft;->N1:La/qek0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/ft;->G0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/ws;->a:La/ws;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    sget-object v0, La/ft;->N1:La/qek0;

    .line 37
    .line 38
    new-instance v0, La/q0h0;

    .line 39
    .line 40
    iget-object p0, p0, La/ft;->L1:La/a8z;

    .line 41
    .line 42
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, La/z5i;

    .line 47
    .line 48
    iget-object p0, p0, La/z5i;->m:La/n5d0;

    .line 49
    .line 50
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/y5i;

    .line 55
    .line 56
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_2
    sget-object v0, La/ft;->N1:La/qek0;

    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    instance-of v1, v0, La/af3;

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    check-cast v0, La/af3;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move-object v0, v2

    .line 82
    :goto_0
    const-class v1, La/ms;

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, La/o5d0;

    .line 95
    .line 96
    if-eqz v0, :cond_1

    .line 97
    .line 98
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/ze3;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    move-object v0, v2

    .line 106
    :goto_1
    instance-of v3, v0, La/ms;

    .line 107
    .line 108
    if-nez v3, :cond_2

    .line 109
    .line 110
    move-object v0, v2

    .line 111
    :cond_2
    check-cast v0, La/ms;

    .line 112
    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object p0, v0, La/ms;->a:La/lp4;

    .line 123
    .line 124
    iget-object v3, v0, La/ms;->b:La/y58;

    .line 125
    .line 126
    iget-object v2, v0, La/ms;->c:La/cad;

    .line 127
    .line 128
    iget-object v6, v0, La/ms;->d:La/vd1;

    .line 129
    .line 130
    iget-object v7, v0, La/ms;->e:La/zg;

    .line 131
    .line 132
    iget-object v8, v0, La/ms;->f:La/yo4;

    .line 133
    .line 134
    iget-object v9, v0, La/ms;->g:La/oeg0;

    .line 135
    .line 136
    iget-object v10, v0, La/ms;->i:La/z4w0;

    .line 137
    .line 138
    iget-object v5, v0, La/ms;->h:La/ii;

    .line 139
    .line 140
    iget-object v11, v0, La/ms;->j:La/ctf0;

    .line 141
    .line 142
    iget-object v4, v0, La/ms;->k:La/d1p;

    .line 143
    .line 144
    iget-object v12, v0, La/ms;->l:La/u58;

    .line 145
    .line 146
    iget-object v13, v0, La/ms;->m:La/mi70;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    new-instance v1, La/z5i;

    .line 167
    .line 168
    invoke-direct/range {v1 .. v13}, La/z5i;-><init>(La/cad;La/y58;La/d1p;La/ii;La/vd1;La/zg;La/yo4;La/oeg0;La/z4w0;La/ctf0;La/u58;La/mi70;)V

    .line 169
    .line 170
    .line 171
    move-object v2, v1

    .line 172
    goto :goto_2

    .line 173
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 174
    .line 175
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    :goto_2
    return-object v2

    .line 183
    :pswitch_3
    sget-object v0, La/ft;->N1:La/qek0;

    .line 184
    .line 185
    invoke-virtual {p0}, La/ft;->G0()La/k3t0;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    new-instance v0, La/ts;

    .line 190
    .line 191
    const/4 v1, 0x0

    .line 192
    invoke-direct {v0, v1}, La/ts;-><init>(Z)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_4
    sget-object v0, La/ft;->N1:La/qek0;

    .line 202
    .line 203
    invoke-virtual {p0}, La/ft;->G0()La/k3t0;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    new-instance v0, La/ts;

    .line 208
    .line 209
    const/4 v1, 0x1

    .line 210
    invoke-direct {v0, v1}, La/ts;-><init>(Z)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object p0

    .line 219
    :pswitch_5
    sget-object v0, La/ft;->N1:La/qek0;

    .line 220
    .line 221
    invoke-virtual {p0}, La/ft;->G0()La/k3t0;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    sget-object v0, La/qs;->a:La/qs;

    .line 226
    .line 227
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_6
    sget-object v0, La/ft;->N1:La/qek0;

    .line 234
    .line 235
    invoke-virtual {p0}, La/ft;->G0()La/k3t0;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    sget-object v0, La/us;->a:La/us;

    .line 240
    .line 241
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object p0

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
