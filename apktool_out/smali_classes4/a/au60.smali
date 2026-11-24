.class public final synthetic La/au60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cu60;


# direct methods
.method public synthetic constructor <init>(La/cu60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/au60;->a:B

    iput-object p1, p0, La/au60;->b:La/cu60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/au60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const-class v3, La/cu60;

    .line 6
    .line 7
    iget-object p0, p0, La/au60;->b:La/cu60;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Landroid/view/View;

    .line 13
    .line 14
    sget-object v0, La/cu60;->U1:La/evz;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, La/cu60;->G0()La/aza;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, La/aza;->k:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 32
    .line 33
    invoke-virtual {p0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->getLoadedPictureUrl()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget-object v1, p1, La/h2b;->V:La/p7m0;

    .line 38
    .line 39
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/q1b;

    .line 44
    .line 45
    iget-object v1, v1, La/q1b;->c:La/o1b;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    iget-object v1, v1, La/o1b;->a:La/a570;

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-virtual {p1, v0, v1, v2, p0}, La/h2b;->y(Ljava/lang/String;La/a570;ZLjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 59
    .line 60
    sget-object v0, La/cu60;->U1:La/evz;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p0}, La/cu60;->G0()La/aza;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget-object p0, p0, La/aza;->m:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 78
    .line 79
    invoke-virtual {p0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->getLoadedPictureUrl()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    iget-object v3, p1, La/h2b;->V:La/p7m0;

    .line 84
    .line 85
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, La/q1b;

    .line 90
    .line 91
    iget-object v4, v4, La/q1b;->b:La/o1b;

    .line 92
    .line 93
    if-eqz v4, :cond_1

    .line 94
    .line 95
    iget-object v1, v4, La/o1b;->a:La/a570;

    .line 96
    .line 97
    invoke-virtual {p1, v0, v1, v2, p0}, La/h2b;->y(Ljava/lang/String;La/a570;ZLjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, La/q1b;

    .line 106
    .line 107
    iget-object p0, p0, La/q1b;->d:La/p1b;

    .line 108
    .line 109
    iget-object p0, p0, La/p1b;->a:La/jza;

    .line 110
    .line 111
    iget-object p0, p0, La/jza;->a:La/a570;

    .line 112
    .line 113
    invoke-static {p0}, La/x1x;->D(La/a570;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v2

    .line 117
    iget-object p0, p1, La/h2b;->b:La/i1w0;

    .line 118
    .line 119
    new-instance v0, La/qi4;

    .line 120
    .line 121
    invoke-direct {v0, p1, v2, v3, v1}, La/qi4;-><init>(Ljava/lang/Object;JB)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 125
    .line 126
    .line 127
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 131
    .line 132
    sget-object v0, La/cu60;->U1:La/evz;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {p0}, La/cu60;->G0()La/aza;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    iget-object p0, p0, La/aza;->g:Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;

    .line 150
    .line 151
    invoke-virtual {p0}, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackMiniCardView;->getLoadedPictureUrl()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    iget-object v3, p1, La/h2b;->V:La/p7m0;

    .line 156
    .line 157
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    check-cast v4, La/q1b;

    .line 162
    .line 163
    iget-object v4, v4, La/q1b;->a:La/o1b;

    .line 164
    .line 165
    if-eqz v4, :cond_2

    .line 166
    .line 167
    iget-object v1, v4, La/o1b;->a:La/a570;

    .line 168
    .line 169
    invoke-virtual {p1, v0, v1, v2, p0}, La/h2b;->y(Ljava/lang/String;La/a570;ZLjava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_2
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    check-cast p0, La/q1b;

    .line 178
    .line 179
    iget-object p0, p0, La/q1b;->d:La/p1b;

    .line 180
    .line 181
    iget-object p0, p0, La/p1b;->a:La/jza;

    .line 182
    .line 183
    iget-object p0, p0, La/jza;->a:La/a570;

    .line 184
    .line 185
    invoke-static {p0}, La/x1x;->D(La/a570;)J

    .line 186
    .line 187
    .line 188
    move-result-wide v2

    .line 189
    iget-object p0, p1, La/h2b;->b:La/i1w0;

    .line 190
    .line 191
    new-instance v0, La/qi4;

    .line 192
    .line 193
    invoke-direct {v0, p1, v2, v3, v1}, La/qi4;-><init>(Ljava/lang/Object;JB)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 197
    .line 198
    .line 199
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 205
    .line 206
    .line 207
    move-result-wide v0

    .line 208
    sget-object v3, La/cu60;->U1:La/evz;

    .line 209
    .line 210
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    iget-object v4, p0, La/cu60;->K1:La/phf0;

    .line 215
    .line 216
    sget-object v5, La/cu60;->V1:[La/iiy;

    .line 217
    .line 218
    aget-object v2, v5, v2

    .line 219
    .line 220
    invoke-virtual {v4, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-static {v3, v0, v1, v2}, La/o2t;->b(Landroidx/fragment/app/e;JLjava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p0}, La/cu60;->H0()La/h2b;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p0, p1}, La/h2b;->F(Ljava/util/List;)V

    .line 236
    .line 237
    .line 238
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
