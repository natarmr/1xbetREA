.class public final La/r5p;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/s5p;


# direct methods
.method public synthetic constructor <init>(La/s5p;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r5p;->i:B

    iput-object p1, p0, La/r5p;->k:La/s5p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r5p;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/r5p;->k:La/s5p;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r5p;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/r5p;-><init>(La/s5p;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/r5p;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/r5p;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/r5p;-><init>(La/s5p;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/r5p;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/r5p;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/b6p;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/r5p;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/r5p;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/r5p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/f6p;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/r5p;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/r5p;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/r5p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/r5p;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/r5p;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/b6p;

    .line 10
    .line 11
    sget-object v2, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object p1, La/s5p;->P1:La/nek;

    .line 19
    .line 20
    iget-object v3, p0, La/r5p;->k:La/s5p;

    .line 21
    .line 22
    iget-object p0, v3, La/s5p;->M1:La/a8z;

    .line 23
    .line 24
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/igi;

    .line 29
    .line 30
    iget-object v1, p0, La/igi;->p:La/wdk0;

    .line 31
    .line 32
    new-instance v2, La/xdk0;

    .line 33
    .line 34
    sget-object v5, La/rek0;->b:La/rek0;

    .line 35
    .line 36
    iget p0, v0, La/b6p;->a:I

    .line 37
    .line 38
    invoke-virtual {v3, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    const/16 v11, 0x7c

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v9, 0x0

    .line 51
    move-object v4, v2

    .line 52
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 53
    .line 54
    .line 55
    const/16 v8, 0x3fc

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 61
    .line 62
    .line 63
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 67
    .line 68
    .line 69
    :goto_0
    return-object v1

    .line 70
    :pswitch_0
    iget-object v0, p0, La/r5p;->k:La/s5p;

    .line 71
    .line 72
    iget-object v2, v0, La/s5p;->O1:La/a8z;

    .line 73
    .line 74
    iget-object p0, p0, La/r5p;->j:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, La/f6p;

    .line 77
    .line 78
    sget-object v3, La/wne;->a:La/wne;

    .line 79
    .line 80
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    instance-of p1, p0, La/e6p;

    .line 86
    .line 87
    const/16 v3, 0x8

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    if-eqz p1, :cond_1

    .line 91
    .line 92
    check-cast p0, La/e6p;

    .line 93
    .line 94
    sget-object p1, La/s5p;->P1:La/nek;

    .line 95
    .line 96
    invoke-virtual {v0}, La/s5p;->G0()La/xzq;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object p1, p1, La/xzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 101
    .line 102
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, La/s5p;->G0()La/xzq;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget-object p1, p1, La/xzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 110
    .line 111
    invoke-virtual {p1, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, La/o5p;

    .line 119
    .line 120
    iget-object p0, p0, La/e6p;->a:Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {p1, p0}, La/zz3;->A(Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    instance-of p1, p0, La/c6p;

    .line 127
    .line 128
    if-eqz p1, :cond_2

    .line 129
    .line 130
    check-cast p0, La/c6p;

    .line 131
    .line 132
    sget-object p1, La/s5p;->P1:La/nek;

    .line 133
    .line 134
    invoke-virtual {v0}, La/s5p;->G0()La/xzq;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iget-object p1, p1, La/xzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 139
    .line 140
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, La/s5p;->G0()La/xzq;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iget-object p1, p1, La/xzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 148
    .line 149
    invoke-virtual {p1, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    check-cast p1, La/o5p;

    .line 157
    .line 158
    iget-object p0, p0, La/c6p;->a:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {p1, p0}, La/zz3;->A(Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    instance-of p1, p0, La/d6p;

    .line 165
    .line 166
    if-eqz p1, :cond_3

    .line 167
    .line 168
    check-cast p0, La/d6p;

    .line 169
    .line 170
    sget-object p1, La/s5p;->P1:La/nek;

    .line 171
    .line 172
    invoke-virtual {v0}, La/s5p;->G0()La/xzq;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iget-object p1, p1, La/xzq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 177
    .line 178
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, La/s5p;->G0()La/xzq;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    iget-object p1, p1, La/xzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 186
    .line 187
    invoke-virtual {p1, v4}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, La/s5p;->G0()La/xzq;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iget-object p1, p1, La/xzq;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 195
    .line 196
    iget-object p0, p0, La/d6p;->a:La/jkm;

    .line 197
    .line 198
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 199
    .line 200
    .line 201
    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 205
    .line 206
    .line 207
    :goto_2
    return-object v1

    .line 208
    nop

    .line 209
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
