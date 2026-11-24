.class public final synthetic La/e38;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h38;


# direct methods
.method public synthetic constructor <init>(La/h38;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/e38;->a:B

    iput-object p1, p0, La/e38;->b:La/h38;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/e38;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/e38;->b:La/h38;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p0, La/h38;->V1:La/yk5;

    .line 10
    .line 11
    invoke-virtual {v2}, La/h38;->H0()La/d48;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, La/d48;->B:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, La/v38;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/16 v7, 0xfb

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    invoke-static/range {v1 .. v7}, La/v38;->a(La/v38;La/kbn;Ljava/lang/String;ZZLandroid/text/SpannableStringBuilder;I)La/v38;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p0, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    sget-object p0, La/h38;->V1:La/yk5;

    .line 45
    .line 46
    invoke-virtual {v2}, La/h38;->H0()La/d48;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    sget-object v0, La/jl90;->b:La/jl90;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/d48;->A(La/jl90;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    sget-object p0, La/h38;->V1:La/yk5;

    .line 59
    .line 60
    invoke-virtual {v2}, La/h38;->H0()La/d48;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    sget-object v0, La/jl90;->c:La/jl90;

    .line 65
    .line 66
    invoke-virtual {p0, v0}, La/d48;->A(La/jl90;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_2
    sget-object p0, La/h38;->V1:La/yk5;

    .line 73
    .line 74
    iget-object p0, v2, La/h38;->Q1:La/a8z;

    .line 75
    .line 76
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, La/iai;

    .line 81
    .line 82
    iget-object p0, p0, La/iai;->l:La/n5d0;

    .line 83
    .line 84
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/hai;

    .line 89
    .line 90
    return-object p0

    .line 91
    :pswitch_3
    sget-object p0, La/h38;->V1:La/yk5;

    .line 92
    .line 93
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    instance-of v0, p0, La/af3;

    .line 105
    .line 106
    if-eqz v0, :cond_1

    .line 107
    .line 108
    check-cast p0, La/af3;

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    move-object p0, v1

    .line 112
    :goto_0
    const-class v0, La/b38;

    .line 113
    .line 114
    if-eqz p0, :cond_4

    .line 115
    .line 116
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, La/o5d0;

    .line 125
    .line 126
    if-eqz p0, :cond_2

    .line 127
    .line 128
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    check-cast p0, La/ze3;

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    move-object p0, v1

    .line 136
    :goto_1
    instance-of v3, p0, La/b38;

    .line 137
    .line 138
    if-nez v3, :cond_3

    .line 139
    .line 140
    move-object p0, v1

    .line 141
    :cond_3
    check-cast p0, La/b38;

    .line 142
    .line 143
    if-eqz p0, :cond_4

    .line 144
    .line 145
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    iget-object v0, v2, La/h38;->U1:La/yzn0;

    .line 150
    .line 151
    sget-object v1, La/h38;->W1:[La/iiy;

    .line 152
    .line 153
    const/4 v3, 0x1

    .line 154
    aget-object v1, v1, v3

    .line 155
    .line 156
    invoke-virtual {v0, v2, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    move-object v11, v0

    .line 161
    check-cast v11, La/l38;

    .line 162
    .line 163
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object v5, p0, La/b38;->b:La/lef0;

    .line 167
    .line 168
    iget-object v10, p0, La/b38;->c:La/ii;

    .line 169
    .line 170
    iget-object v4, p0, La/b38;->d:La/nc0;

    .line 171
    .line 172
    iget-object v12, p0, La/b38;->e:La/wdk0;

    .line 173
    .line 174
    iget-object v6, p0, La/b38;->a:La/pp90;

    .line 175
    .line 176
    iget-object v13, p0, La/b38;->f:La/rl70;

    .line 177
    .line 178
    iget-object v7, p0, La/b38;->g:La/pv00;

    .line 179
    .line 180
    iget-object v14, p0, La/b38;->h:La/mi70;

    .line 181
    .line 182
    iget-object v8, p0, La/b38;->i:La/d1p;

    .line 183
    .line 184
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    new-instance v3, La/iai;

    .line 197
    .line 198
    invoke-direct/range {v3 .. v14}, La/iai;-><init>(La/nc0;La/lef0;La/pp90;La/pv00;La/d1p;La/i1w0;La/ii;La/l38;La/wdk0;La/rl70;La/mi70;)V

    .line 199
    .line 200
    .line 201
    move-object v1, v3

    .line 202
    goto :goto_2

    .line 203
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 204
    .line 205
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :goto_2
    return-object v1

    .line 213
    :pswitch_4
    sget-object v0, La/h38;->V1:La/yk5;

    .line 214
    .line 215
    iget-object v4, p0, La/e38;->b:La/h38;

    .line 216
    .line 217
    iget-object v2, v4, La/h38;->P1:La/wdk0;

    .line 218
    .line 219
    if-eqz v2, :cond_5

    .line 220
    .line 221
    new-instance v3, La/xdk0;

    .line 222
    .line 223
    sget-object v6, La/rek0;->b:La/rek0;

    .line 224
    .line 225
    const p0, 0x7f130dca

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v7

    .line 232
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    const/4 v11, 0x0

    .line 236
    const/16 v12, 0x7c

    .line 237
    .line 238
    const/4 v8, 0x0

    .line 239
    const/4 v9, 0x0

    .line 240
    const/4 v10, 0x0

    .line 241
    move-object v5, v3

    .line 242
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 243
    .line 244
    .line 245
    const/16 v9, 0x3fc

    .line 246
    .line 247
    const/4 v5, 0x0

    .line 248
    const/4 v6, 0x0

    .line 249
    const/4 v7, 0x0

    .line 250
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 251
    .line 252
    .line 253
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    :cond_5
    const-string p0, "snackbarManager"

    .line 257
    .line 258
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v1

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
