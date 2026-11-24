.class public final La/lug0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/mug0;


# direct methods
.method public synthetic constructor <init>(La/mug0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lug0;->i:B

    iput-object p1, p0, La/lug0;->k:La/mug0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/lug0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/lug0;->k:La/mug0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/lug0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/lug0;-><init>(La/mug0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/lug0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/lug0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/lug0;-><init>(La/mug0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/lug0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lug0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/pug0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/lug0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/lug0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/lug0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/qug0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/lug0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/lug0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/lug0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/lug0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/lug0;->k:La/mug0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, v2, La/mug0;->i2:La/phf0;

    .line 10
    .line 11
    iget-object p0, p0, La/lug0;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/pug0;

    .line 14
    .line 15
    sget-object v3, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    sget-object p1, La/mug0;->m2:La/lme0;

    .line 23
    .line 24
    sget-object p1, La/mug0;->n2:[La/iiy;

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    aget-object v3, p1, v1

    .line 28
    .line 29
    invoke-virtual {v0, v2, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    aget-object p1, p1, v1

    .line 34
    .line 35
    invoke-virtual {v0, v2, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p0, p0, La/pug0;->a:Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 40
    .line 41
    new-instance v0, Lkotlin/Pair;

    .line 42
    .line 43
    invoke-direct {v0, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0, v2, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, La/yo8;->x0()V

    .line 58
    .line 59
    .line 60
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 64
    .line 65
    .line 66
    :goto_0
    return-object v1

    .line 67
    :pswitch_0
    iget-object p0, p0, La/lug0;->j:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, La/qug0;

    .line 70
    .line 71
    sget-object v0, La/wne;->a:La/wne;

    .line 72
    .line 73
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    iget-object p0, p0, La/qug0;->a:La/xvg0;

    .line 79
    .line 80
    iget-boolean p1, p0, La/xvg0;->b:Z

    .line 81
    .line 82
    sget-object v0, La/mug0;->m2:La/lme0;

    .line 83
    .line 84
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v0, v0, La/nug0;->c:Landroid/widget/TextView;

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    const/16 v3, 0x8

    .line 92
    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    move v4, v1

    .line 96
    goto :goto_1

    .line 97
    :cond_1
    move v4, v3

    .line 98
    :goto_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, La/nug0;->d:Landroid/widget/TextView;

    .line 106
    .line 107
    if-eqz p1, :cond_2

    .line 108
    .line 109
    move v3, v1

    .line 110
    :cond_2
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object p1, p1, La/nug0;->i:Landroid/widget/TextView;

    .line 118
    .line 119
    sget-object v0, La/rdj;->a:La/rdj;

    .line 120
    .line 121
    iget-boolean v0, p0, La/xvg0;->m:Z

    .line 122
    .line 123
    iget-wide v3, p0, La/xvg0;->a:J

    .line 124
    .line 125
    sget-object v5, La/efj;->c:La/efj;

    .line 126
    .line 127
    new-instance v6, La/znq0;

    .line 128
    .line 129
    invoke-direct {v6, v3, v4}, La/znq0;-><init>(J)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const/16 v3, 0x38

    .line 137
    .line 138
    invoke-static {v6, v5, v0, v1, v3}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object p1, p1, La/nug0;->m:Landroid/widget/TextView;

    .line 150
    .line 151
    iget-object v0, p0, La/xvg0;->c:Ljava/lang/String;

    .line 152
    .line 153
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p1, p1, La/nug0;->j:Landroid/widget/TextView;

    .line 161
    .line 162
    iget-object v0, p0, La/xvg0;->d:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object p1, p1, La/nug0;->g:Landroid/widget/TextView;

    .line 172
    .line 173
    iget-object v0, p0, La/xvg0;->e:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iget-object p1, p1, La/nug0;->h:Landroid/widget/TextView;

    .line 183
    .line 184
    iget-object v0, p0, La/xvg0;->h:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iget-object p1, p1, La/nug0;->d:Landroid/widget/TextView;

    .line 194
    .line 195
    iget-object v0, p0, La/xvg0;->i:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iget-object p1, p1, La/nug0;->f:Landroid/widget/TextView;

    .line 205
    .line 206
    iget-object v0, p0, La/xvg0;->g:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iget-object p1, p1, La/nug0;->k:Landroid/widget/TextView;

    .line 216
    .line 217
    iget-object v0, p0, La/xvg0;->k:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    iget-object p1, p1, La/nug0;->l:Landroid/widget/TextView;

    .line 227
    .line 228
    iget-object v0, p0, La/xvg0;->j:Ljava/lang/String;

    .line 229
    .line 230
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    iget-object p1, p1, La/nug0;->b:Lcom/google/android/material/button/MaterialButton;

    .line 238
    .line 239
    iget-object v0, p0, La/xvg0;->l:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, La/mug0;->T0()La/nug0;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    iget-object p1, p1, La/nug0;->e:Landroid/widget/TextView;

    .line 249
    .line 250
    iget-object p0, p0, La/xvg0;->f:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 253
    .line 254
    .line 255
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 259
    .line 260
    .line 261
    :goto_2
    return-object v1

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
