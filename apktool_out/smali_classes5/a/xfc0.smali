.class public final La/xfc0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/yfc0;


# direct methods
.method public synthetic constructor <init>(La/yfc0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xfc0;->i:B

    iput-object p1, p0, La/xfc0;->k:La/yfc0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/xfc0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/xfc0;->k:La/yfc0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/xfc0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/xfc0;-><init>(La/yfc0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/xfc0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/xfc0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/xfc0;-><init>(La/yfc0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/xfc0;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/xfc0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/xgc0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/xfc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xfc0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xfc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/chc0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/xfc0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/xfc0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/xfc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/xfc0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/xfc0;->k:La/yfc0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/xfc0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/xgc0;

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object p1, v1, La/yfc0;->k2:La/phf0;

    .line 20
    .line 21
    iget-object p0, p0, La/xgc0;->a:Lorg/xplatform/makebet_promocodes/api/presentation/models/PromoCodeInfoUiModel;

    .line 22
    .line 23
    sget-object v0, La/yfc0;->l2:La/xi70;

    .line 24
    .line 25
    sget-object v0, La/yfc0;->m2:[La/iiy;

    .line 26
    .line 27
    const/4 v2, 0x1

    .line 28
    aget-object v3, v0, v2

    .line 29
    .line 30
    invoke-virtual {p1, v1, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    aget-object v0, v0, v2

    .line 35
    .line 36
    invoke-virtual {p1, v1, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance v0, Lkotlin/Pair;

    .line 41
    .line 42
    invoke-direct {v0, p1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0, v1, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, La/yo8;->x0()V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    :goto_0
    return-object p0

    .line 67
    :pswitch_0
    iget-object v0, v1, La/yfc0;->j2:La/a8z;

    .line 68
    .line 69
    iget-object p0, p0, La/xfc0;->j:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, La/chc0;

    .line 72
    .line 73
    sget-object v2, La/wne;->a:La/wne;

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, La/ygc0;->a:La/ygc0;

    .line 79
    .line 80
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    const v2, 0x7f1404af

    .line 85
    .line 86
    .line 87
    const v3, 0x7f131237

    .line 88
    .line 89
    .line 90
    const/4 v4, 0x0

    .line 91
    const/16 v5, 0x8

    .line 92
    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    invoke-virtual {v1}, La/yfc0;->V0()La/zo8;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iget-object p0, p0, La/zo8;->c:Landroidx/constraintlayout/widget/Group;

    .line 100
    .line 101
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, La/yfc0;->V0()La/zo8;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    iget-object p0, p0, La/zo8;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 109
    .line 110
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    new-instance p0, La/kp8;

    .line 114
    .line 115
    invoke-virtual {v1, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-direct {p0, p1, v2}, La/kp8;-><init>(Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, p0}, La/stl;->I0(La/kp8;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, La/yfc0;->V0()La/zo8;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    iget-object p0, p0, La/zo8;->b:Landroid/widget/FrameLayout;

    .line 133
    .line 134
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    sget-object p1, La/ahc0;->a:La/ahc0;

    .line 139
    .line 140
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_2

    .line 145
    .line 146
    invoke-virtual {v1}, La/yfc0;->V0()La/zo8;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    iget-object p0, p0, La/zo8;->c:Landroidx/constraintlayout/widget/Group;

    .line 151
    .line 152
    invoke-virtual {p0, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, La/yfc0;->V0()La/zo8;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    iget-object p0, p0, La/zo8;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 160
    .line 161
    invoke-virtual {p0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, La/yfc0;->V0()La/zo8;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    iget-object p0, p0, La/zo8;->b:Landroid/widget/FrameLayout;

    .line 169
    .line 170
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_2
    instance-of p1, p0, La/bhc0;

    .line 175
    .line 176
    if-eqz p1, :cond_3

    .line 177
    .line 178
    invoke-virtual {v1}, La/yfc0;->V0()La/zo8;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    iget-object p1, p1, La/zo8;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 183
    .line 184
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1}, La/yfc0;->V0()La/zo8;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget-object p1, p1, La/zo8;->c:Landroidx/constraintlayout/widget/Group;

    .line 192
    .line 193
    invoke-virtual {p1, v5}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, La/yfc0;->V0()La/zo8;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    iget-object p1, p1, La/zo8;->b:Landroid/widget/FrameLayout;

    .line 201
    .line 202
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 203
    .line 204
    .line 205
    new-instance p1, La/kp8;

    .line 206
    .line 207
    invoke-virtual {v1, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    invoke-direct {p1, v3, v2}, La/kp8;-><init>(Ljava/lang/String;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, p1}, La/stl;->I0(La/kp8;)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    check-cast p1, La/tfc0;

    .line 225
    .line 226
    check-cast p0, La/bhc0;

    .line 227
    .line 228
    iget-object p0, p0, La/bhc0;->a:Ljava/util/List;

    .line 229
    .line 230
    iput-object p0, p1, La/i26;->f:Ljava/lang/Object;

    .line 231
    .line 232
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    check-cast p0, La/tfc0;

    .line 237
    .line 238
    invoke-virtual {p0}, La/yge0;->g()V

    .line 239
    .line 240
    .line 241
    iget-object p0, v1, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 242
    .line 243
    if-eqz p0, :cond_3

    .line 244
    .line 245
    iget p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 246
    .line 247
    const/4 v0, 0x4

    .line 248
    if-ne p1, v0, :cond_3

    .line 249
    .line 250
    const/4 p1, 0x3

    .line 251
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 252
    .line 253
    .line 254
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object p0

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
