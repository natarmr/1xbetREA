.class public final synthetic La/u560;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w560;


# direct methods
.method public synthetic constructor <init>(La/w560;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u560;->a:B

    iput-object p1, p0, La/u560;->b:La/w560;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/u560;->a:B

    .line 4
    .line 5
    sget-object v2, La/d560;->a:La/d560;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/u560;->b:La/w560;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v1, La/w560;->Q1:La/uuz;

    .line 14
    .line 15
    invoke-virtual {v0}, La/w560;->G0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_0
    sget-object v1, La/w560;->Q1:La/uuz;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const-string v2, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 34
    .line 35
    invoke-static {v2}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v4, "package"

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v4, v5, v3}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    const/16 v3, 0x22b

    .line 53
    .line 54
    invoke-virtual {v1, v2, v3}, La/agd;->startActivityForResult(Landroid/content/Intent;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, La/w560;->G0()La/k3t0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sget-object v1, La/g560;->a:La/g560;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_1
    sget-object v1, La/w560;->Q1:La/uuz;

    .line 70
    .line 71
    invoke-virtual {v0}, La/w560;->G0()La/k3t0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v1, La/c560;

    .line 76
    .line 77
    const/4 v2, 0x1

    .line 78
    invoke-direct {v1, v2}, La/c560;-><init>(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_2
    sget-object v1, La/w560;->Q1:La/uuz;

    .line 88
    .line 89
    invoke-virtual {v0}, La/w560;->G0()La/k3t0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_3
    sget-object v1, La/w560;->Q1:La/uuz;

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    new-array v1, v1, [Ljava/lang/String;

    .line 103
    .line 104
    const-string v2, "android.permission.CAMERA"

    .line 105
    .line 106
    invoke-static {v0, v2, v1}, La/m7x;->P(Landroidx/fragment/app/Fragment;Ljava/lang/String;[Ljava/lang/String;)La/khf0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, La/khf0;->d()La/qog0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0

    .line 115
    :pswitch_4
    sget-object v1, La/w560;->Q1:La/uuz;

    .line 116
    .line 117
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    instance-of v2, v1, La/af3;

    .line 129
    .line 130
    if-eqz v2, :cond_1

    .line 131
    .line 132
    check-cast v1, La/af3;

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_1
    move-object v1, v3

    .line 136
    :goto_0
    const-class v2, La/j560;

    .line 137
    .line 138
    if-eqz v1, :cond_4

    .line 139
    .line 140
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, La/o5d0;

    .line 149
    .line 150
    if-eqz v1, :cond_2

    .line 151
    .line 152
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, La/ze3;

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    move-object v1, v3

    .line 160
    :goto_1
    instance-of v4, v1, La/j560;

    .line 161
    .line 162
    if-nez v4, :cond_3

    .line 163
    .line 164
    move-object v1, v3

    .line 165
    :cond_3
    check-cast v1, La/j560;

    .line 166
    .line 167
    if-eqz v1, :cond_4

    .line 168
    .line 169
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    iget-object v8, v1, La/j560;->a:La/btt0;

    .line 177
    .line 178
    iget-object v11, v1, La/j560;->b:La/duj;

    .line 179
    .line 180
    iget-object v6, v1, La/j560;->c:La/mne;

    .line 181
    .line 182
    iget-object v0, v1, La/j560;->d:La/gii0;

    .line 183
    .line 184
    iget-object v9, v1, La/j560;->e:La/j1q0;

    .line 185
    .line 186
    iget-object v12, v1, La/j560;->f:La/ilp0;

    .line 187
    .line 188
    iget-object v10, v1, La/j560;->g:La/ii;

    .line 189
    .line 190
    iget-object v2, v1, La/j560;->h:La/ctf0;

    .line 191
    .line 192
    iget-object v13, v1, La/j560;->i:La/ntu;

    .line 193
    .line 194
    iget-object v14, v1, La/j560;->j:La/knf0;

    .line 195
    .line 196
    iget-object v15, v1, La/j560;->k:La/kuy;

    .line 197
    .line 198
    iget-object v3, v1, La/j560;->l:La/i7u0;

    .line 199
    .line 200
    iget-object v1, v1, La/j560;->m:La/q7u0;

    .line 201
    .line 202
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    new-instance v4, La/fmi;

    .line 224
    .line 225
    new-instance v5, La/htz;

    .line 226
    .line 227
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 228
    .line 229
    .line 230
    move-object/from16 v17, v1

    .line 231
    .line 232
    move-object/from16 v16, v3

    .line 233
    .line 234
    invoke-direct/range {v4 .. v17}, La/fmi;-><init>(La/htz;La/mne;La/i1w0;La/btt0;La/j1q0;La/ii;La/duj;La/ilp0;La/ntu;La/knf0;La/kuy;La/i7u0;La/q7u0;)V

    .line 235
    .line 236
    .line 237
    move-object v3, v4

    .line 238
    goto :goto_2

    .line 239
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 240
    .line 241
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :goto_2
    return-object v3

    .line 249
    :pswitch_5
    sget-object v1, La/w560;->Q1:La/uuz;

    .line 250
    .line 251
    iget-object v0, v0, La/w560;->K1:La/fiu0;

    .line 252
    .line 253
    if-eqz v0, :cond_5

    .line 254
    .line 255
    return-object v0

    .line 256
    :cond_5
    const-string v0, "viewModelFactory"

    .line 257
    .line 258
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v3

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
