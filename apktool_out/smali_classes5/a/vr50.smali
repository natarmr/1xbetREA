.class public final La/vr50;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/wr50;


# direct methods
.method public synthetic constructor <init>(La/wr50;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vr50;->i:B

    iput-object p1, p0, La/vr50;->k:La/wr50;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/vr50;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/vr50;->k:La/wr50;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/vr50;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/vr50;-><init>(La/wr50;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/vr50;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/vr50;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/vr50;-><init>(La/wr50;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/vr50;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/vr50;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1, p2}, La/vr50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/vr50;

    .line 16
    .line 17
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    invoke-virtual {p0, p2}, La/vr50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw p0

    .line 29
    :pswitch_0
    check-cast p1, La/ot50;

    .line 30
    .line 31
    check-cast p2, La/yje;

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, La/vr50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, La/vr50;

    .line 38
    .line 39
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, La/vr50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/vr50;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/vr50;->j:Ljava/lang/Object;

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, La/m460;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :pswitch_0
    iget-object v0, p0, La/vr50;->k:La/wr50;

    .line 28
    .line 29
    iget-object v1, v0, La/wr50;->R1:La/n0o0;

    .line 30
    .line 31
    iget-object p0, p0, La/vr50;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/ot50;

    .line 34
    .line 35
    sget-object v2, La/wne;->a:La/wne;

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    if-eqz p0, :cond_7

    .line 41
    .line 42
    instance-of p1, p0, La/nt50;

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const/16 v3, 0x8

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    sget-object p0, La/wr50;->S1:La/wsz;

    .line 50
    .line 51
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget-object p0, p0, La/d2r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 56
    .line 57
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p0, p0, La/d2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 65
    .line 66
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iget-object p0, p0, La/d2r;->e:La/nq8;

    .line 74
    .line 75
    iget-object p0, p0, La/nq8;->b:Landroid/view/View;

    .line 76
    .line 77
    check-cast p0, Landroid/widget/ProgressBar;

    .line 78
    .line 79
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_1
    instance-of p1, p0, La/lt50;

    .line 85
    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    check-cast p0, La/lt50;

    .line 89
    .line 90
    iget-object p0, p0, La/lt50;->a:Ljava/util/ArrayList;

    .line 91
    .line 92
    sget-object p1, La/wr50;->S1:La/wsz;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_2

    .line 99
    .line 100
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object p1, p1, La/d2r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 105
    .line 106
    invoke-virtual {p1, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 107
    .line 108
    .line 109
    :cond_2
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget-object p1, p1, La/d2r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 114
    .line 115
    invoke-virtual {p1, v3}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object p1, p1, La/d2r;->e:La/nq8;

    .line 123
    .line 124
    iget-object p1, p1, La/nq8;->b:Landroid/view/View;

    .line 125
    .line 126
    check-cast p1, Landroid/widget/ProgressBar;

    .line 127
    .line 128
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget-object p1, p1, La/d2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 136
    .line 137
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iget-object p1, p1, La/d2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 145
    .line 146
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-nez p1, :cond_3

    .line 151
    .line 152
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iget-object p1, p1, La/d2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 157
    .line 158
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, La/tn50;

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 165
    .line 166
    .line 167
    :cond_3
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, La/tn50;

    .line 172
    .line 173
    invoke-virtual {p1, p0}, La/q4;->G(Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_4
    instance-of p1, p0, La/mt50;

    .line 178
    .line 179
    if-eqz p1, :cond_7

    .line 180
    .line 181
    check-cast p0, La/mt50;

    .line 182
    .line 183
    iget-object p1, p0, La/mt50;->a:La/ra10;

    .line 184
    .line 185
    iget-boolean p0, p0, La/mt50;->b:Z

    .line 186
    .line 187
    sget-object v4, La/wr50;->S1:La/wsz;

    .line 188
    .line 189
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    iget-object v4, v4, La/d2r;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 194
    .line 195
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    iget-object v4, v4, La/d2r;->e:La/nq8;

    .line 203
    .line 204
    iget-object v4, v4, La/nq8;->b:Landroid/view/View;

    .line 205
    .line 206
    check-cast v4, Landroid/widget/ProgressBar;

    .line 207
    .line 208
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, La/wr50;->G0()La/d2r;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iget-object v0, v0, La/d2r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 216
    .line 217
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 218
    .line 219
    .line 220
    if-eqz p0, :cond_6

    .line 221
    .line 222
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    check-cast p0, La/tn50;

    .line 227
    .line 228
    invoke-virtual {p0}, La/q4;->d()I

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    if-nez p0, :cond_5

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_5
    move v2, v3

    .line 236
    :cond_6
    :goto_0
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 237
    .line 238
    .line 239
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 243
    .line 244
    .line 245
    const/4 p0, 0x0

    .line 246
    :goto_2
    return-object p0

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
