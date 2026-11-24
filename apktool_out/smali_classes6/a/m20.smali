.class public final synthetic La/m20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s20;


# direct methods
.method public synthetic constructor <init>(La/s20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m20;->a:B

    iput-object p1, p0, La/m20;->b:La/s20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/m20;->a:B

    .line 2
    .line 3
    const/16 v1, 0x3b

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/m20;->b:La/s20;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/k0w0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v0, La/mbu0;->b:La/svs0;

    .line 17
    .line 18
    iget v1, p0, La/s20;->o:I

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, La/svs0;->a(I)La/mbu0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x1

    .line 32
    if-eq v0, v1, :cond_5

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    if-eq v0, v1, :cond_4

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    if-eq v0, v1, :cond_3

    .line 39
    .line 40
    const/4 v1, 0x5

    .line 41
    if-eq v0, v1, :cond_2

    .line 42
    .line 43
    const/4 v1, 0x6

    .line 44
    if-eq v0, v1, :cond_1

    .line 45
    .line 46
    const/4 v1, 0x7

    .line 47
    if-eq v0, v1, :cond_0

    .line 48
    .line 49
    iget-object p0, p0, La/s20;->t:La/r46;

    .line 50
    .line 51
    invoke-virtual {p0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object p0, p0, La/s20;->v:La/j9i;

    .line 57
    .line 58
    iget-object p0, p0, La/j9i;->a:La/bbw0;

    .line 59
    .line 60
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p0, La/clc;

    .line 63
    .line 64
    invoke-virtual {p0}, La/clc;->d()La/r46;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    iget-object p0, p0, La/s20;->u:La/ljf0;

    .line 74
    .line 75
    iget-object p0, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, La/bbw0;

    .line 78
    .line 79
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, La/clc;

    .line 82
    .line 83
    invoke-virtual {p0}, La/clc;->d()La/r46;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    iget-object p0, p0, La/s20;->w:La/y2m0;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    new-instance p0, Lorg/xplatform/verification/sum_sub/impl/navigation/SumSubScreens$SumSubIframeFragmentScreen;

    .line 98
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    iget-object p0, p0, La/s20;->y:La/xb5;

    .line 104
    .line 105
    iget-object p0, p0, La/xb5;->a:La/bbw0;

    .line 106
    .line 107
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p0, La/clc;

    .line 110
    .line 111
    invoke-virtual {p0}, La/clc;->d()La/r46;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    goto :goto_0

    .line 120
    :cond_4
    iget-object p0, p0, La/s20;->x:La/xuz;

    .line 121
    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance p0, Lorg/xplatform/verification/nomapay/impl/navigation/NomaPayWebScreens$NomaPayFragmentScreen;

    .line 126
    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    iget-object p0, p0, La/s20;->s:La/l9u0;

    .line 132
    .line 133
    sget-object v0, La/mbu0;->b:La/svs0;

    .line 134
    .line 135
    new-instance v0, Lorg/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen;

    .line 136
    .line 137
    const/4 v1, -0x1

    .line 138
    iget-object p0, p0, La/l9u0;->a:La/r9u;

    .line 139
    .line 140
    invoke-direct {v0, v1, p0}, Lorg/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen;-><init>(ILa/r9u;)V

    .line 141
    .line 142
    .line 143
    move-object p0, v0

    .line 144
    :goto_0
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 145
    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, La/s20;->v()V

    .line 159
    .line 160
    .line 161
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 162
    .line 163
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 164
    .line 165
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 173
    .line 174
    move-object v4, p1

    .line 175
    check-cast v4, La/k20;

    .line 176
    .line 177
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    sget-object v3, La/e10;->c:La/e10;

    .line 181
    .line 182
    invoke-static {v4, v2, v3, v1}, La/k20;->a(La/k20;La/cau0;La/e10;I)La/k20;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v0, p1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_6

    .line 191
    .line 192
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object p0

    .line 195
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, La/s20;->v()V

    .line 204
    .line 205
    .line 206
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 207
    .line 208
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 209
    .line 210
    :cond_7
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 218
    .line 219
    move-object v4, v0

    .line 220
    check-cast v4, La/k20;

    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    sget-object v3, La/e10;->c:La/e10;

    .line 226
    .line 227
    invoke-static {v4, v2, v3, v1}, La/k20;->a(La/k20;La/cau0;La/e10;I)La/k20;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {p1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_7

    .line 236
    .line 237
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object p0

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
