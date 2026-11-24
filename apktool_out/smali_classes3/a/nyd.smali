.class public final La/nyd;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/oyd;


# direct methods
.method public synthetic constructor <init>(La/oyd;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nyd;->i:B

    iput-object p1, p0, La/nyd;->k:La/oyd;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nyd;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nyd;->k:La/oyd;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/nyd;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/nyd;-><init>(La/oyd;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/nyd;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/nyd;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/nyd;-><init>(La/oyd;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/nyd;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/nyd;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/qyd;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/nyd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nyd;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nyd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/ryd;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/nyd;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/nyd;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/nyd;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/nyd;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/nyd;->k:La/oyd;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, v2, La/oyd;->g2:La/phf0;

    .line 10
    .line 11
    iget-object p0, p0, La/nyd;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/qyd;

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
    sget-object p1, La/oyd;->k2:La/std;

    .line 23
    .line 24
    sget-object p1, La/oyd;->l2:[La/iiy;

    .line 25
    .line 26
    const/4 v1, 0x2

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
    iget-object p0, p0, La/qyd;->a:La/n3w;

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
    iget-object p0, p0, La/nyd;->j:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, La/ryd;

    .line 70
    .line 71
    sget-object v0, La/wne;->a:La/wne;

    .line 72
    .line 73
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    if-eqz p0, :cond_1

    .line 77
    .line 78
    iget-object p0, p0, La/ryd;->a:La/lzd;

    .line 79
    .line 80
    sget-object p1, La/oyd;->k2:La/std;

    .line 81
    .line 82
    invoke-virtual {v2}, La/oyd;->T0()La/pyd;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p1, p1, La/pyd;->f:Landroid/widget/TextView;

    .line 87
    .line 88
    sget-object v0, La/rdj;->a:La/rdj;

    .line 89
    .line 90
    iget-boolean v0, p0, La/lzd;->j:Z

    .line 91
    .line 92
    iget-wide v3, p0, La/lzd;->a:J

    .line 93
    .line 94
    sget-object v1, La/efj;->c:La/efj;

    .line 95
    .line 96
    new-instance v5, La/znq0;

    .line 97
    .line 98
    invoke-direct {v5, v3, v4}, La/znq0;-><init>(J)V

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    const/4 v3, 0x0

    .line 106
    const/16 v4, 0x38

    .line 107
    .line 108
    invoke-static {v5, v1, v0, v3, v4}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, La/oyd;->T0()La/pyd;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iget-object p1, p1, La/pyd;->j:Landroid/widget/TextView;

    .line 120
    .line 121
    iget-object v0, p0, La/lzd;->b:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, La/oyd;->T0()La/pyd;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget-object p1, p1, La/pyd;->g:Landroid/widget/TextView;

    .line 131
    .line 132
    iget-object v0, p0, La/lzd;->c:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, La/oyd;->T0()La/pyd;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iget-object p1, p1, La/pyd;->e:Landroid/widget/TextView;

    .line 142
    .line 143
    iget-object v0, p0, La/lzd;->d:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, La/oyd;->T0()La/pyd;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    iget-object p1, p1, La/pyd;->d:Landroid/widget/TextView;

    .line 153
    .line 154
    iget-object v0, p0, La/lzd;->f:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, La/oyd;->T0()La/pyd;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    iget-object p1, p1, La/pyd;->h:Landroid/widget/TextView;

    .line 164
    .line 165
    iget-object v0, p0, La/lzd;->h:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, La/oyd;->T0()La/pyd;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iget-object p1, p1, La/pyd;->i:Landroid/widget/TextView;

    .line 175
    .line 176
    iget-object v0, p0, La/lzd;->g:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, La/oyd;->T0()La/pyd;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    iget-object p1, p1, La/pyd;->b:Lcom/google/android/material/button/MaterialButton;

    .line 186
    .line 187
    iget-object v0, p0, La/lzd;->i:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, La/oyd;->T0()La/pyd;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    iget-object p1, p1, La/pyd;->c:Landroid/widget/TextView;

    .line 197
    .line 198
    iget-object p0, p0, La/lzd;->e:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    .line 202
    .line 203
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 207
    .line 208
    .line 209
    :goto_1
    return-object v1

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
