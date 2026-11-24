.class public final synthetic La/xo90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zo90;


# direct methods
.method public synthetic constructor <init>(La/zo90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xo90;->a:B

    iput-object p1, p0, La/xo90;->b:La/zo90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/xo90;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object p0, p0, La/xo90;->b:La/zo90;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/zo90;->p2:La/fl70;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const v0, 0x7f07070c

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :pswitch_0
    sget-object v0, La/zo90;->p2:La/fl70;

    .line 28
    .line 29
    new-instance v0, La/gw5;

    .line 30
    .line 31
    invoke-direct {v0, p0, v1}, La/gw5;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_1
    sget-object v0, La/zo90;->p2:La/fl70;

    .line 36
    .line 37
    new-instance v0, La/vn90;

    .line 38
    .line 39
    new-instance v2, La/yi90;

    .line 40
    .line 41
    invoke-virtual {p0}, La/zo90;->W0()La/es90;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x5

    .line 47
    const/4 v3, 0x1

    .line 48
    const-class v5, La/es90;

    .line 49
    .line 50
    const-string v6, "onPickerItemClick"

    .line 51
    .line 52
    const-string v7, "onPickerItemClick(I)V"

    .line 53
    .line 54
    invoke-direct/range {v2 .. v9}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance p0, La/so90;

    .line 61
    .line 62
    const/4 v3, 0x7

    .line 63
    invoke-direct {p0, v3}, La/so90;-><init>(B)V

    .line 64
    .line 65
    .line 66
    new-instance v3, La/to90;

    .line 67
    .line 68
    const/4 v4, 0x2

    .line 69
    invoke-direct {v3, v2, v4}, La/to90;-><init>(La/yi90;B)V

    .line 70
    .line 71
    .line 72
    new-instance v5, La/iv60;

    .line 73
    .line 74
    const/16 v6, 0xd

    .line 75
    .line 76
    invoke-direct {v5, v1, v6}, La/iv60;-><init>(IB)V

    .line 77
    .line 78
    .line 79
    sget-object v6, La/xk60;->p:La/xk60;

    .line 80
    .line 81
    new-instance v7, La/gbn;

    .line 82
    .line 83
    invoke-direct {v7, p0, v5, v3, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 87
    .line 88
    invoke-virtual {p0, v7}, La/dp;->b(La/gbn;)V

    .line 89
    .line 90
    .line 91
    new-instance v3, La/so90;

    .line 92
    .line 93
    const/16 v5, 0x8

    .line 94
    .line 95
    invoke-direct {v3, v5}, La/so90;-><init>(B)V

    .line 96
    .line 97
    .line 98
    new-instance v5, La/to90;

    .line 99
    .line 100
    invoke-direct {v5, v2, v1}, La/to90;-><init>(La/yi90;B)V

    .line 101
    .line 102
    .line 103
    new-instance v6, La/iv60;

    .line 104
    .line 105
    const/16 v7, 0xe

    .line 106
    .line 107
    invoke-direct {v6, v1, v7}, La/iv60;-><init>(IB)V

    .line 108
    .line 109
    .line 110
    sget-object v7, La/xk60;->q:La/xk60;

    .line 111
    .line 112
    new-instance v8, La/gbn;

    .line 113
    .line 114
    invoke-direct {v8, v3, v6, v5, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v8}, La/dp;->b(La/gbn;)V

    .line 118
    .line 119
    .line 120
    new-instance v3, La/so90;

    .line 121
    .line 122
    const/4 v5, 0x0

    .line 123
    invoke-direct {v3, v5}, La/so90;-><init>(B)V

    .line 124
    .line 125
    .line 126
    new-instance v6, La/to90;

    .line 127
    .line 128
    invoke-direct {v6, v2, v5}, La/to90;-><init>(La/yi90;B)V

    .line 129
    .line 130
    .line 131
    new-instance v5, La/iv60;

    .line 132
    .line 133
    const/16 v7, 0xa

    .line 134
    .line 135
    invoke-direct {v5, v1, v7}, La/iv60;-><init>(IB)V

    .line 136
    .line 137
    .line 138
    sget-object v7, La/xk60;->m:La/xk60;

    .line 139
    .line 140
    new-instance v8, La/gbn;

    .line 141
    .line 142
    invoke-direct {v8, v3, v5, v6, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0, v8}, La/dp;->b(La/gbn;)V

    .line 146
    .line 147
    .line 148
    new-instance v3, La/so90;

    .line 149
    .line 150
    invoke-direct {v3, v1}, La/so90;-><init>(B)V

    .line 151
    .line 152
    .line 153
    new-instance v5, La/ev80;

    .line 154
    .line 155
    const/16 v6, 0x1d

    .line 156
    .line 157
    invoke-direct {v5, v6}, La/ev80;-><init>(B)V

    .line 158
    .line 159
    .line 160
    new-instance v6, La/iv60;

    .line 161
    .line 162
    const/16 v7, 0xc

    .line 163
    .line 164
    invoke-direct {v6, v1, v7}, La/iv60;-><init>(IB)V

    .line 165
    .line 166
    .line 167
    sget-object v7, La/xk60;->o:La/xk60;

    .line 168
    .line 169
    new-instance v8, La/gbn;

    .line 170
    .line 171
    invoke-direct {v8, v3, v6, v5, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v8}, La/dp;->b(La/gbn;)V

    .line 175
    .line 176
    .line 177
    new-instance v3, La/so90;

    .line 178
    .line 179
    invoke-direct {v3, v4}, La/so90;-><init>(B)V

    .line 180
    .line 181
    .line 182
    new-instance v4, La/to90;

    .line 183
    .line 184
    const/4 v5, 0x1

    .line 185
    invoke-direct {v4, v2, v5}, La/to90;-><init>(La/yi90;B)V

    .line 186
    .line 187
    .line 188
    new-instance v2, La/iv60;

    .line 189
    .line 190
    const/16 v5, 0xb

    .line 191
    .line 192
    invoke-direct {v2, v1, v5}, La/iv60;-><init>(IB)V

    .line 193
    .line 194
    .line 195
    sget-object v1, La/xk60;->n:La/xk60;

    .line 196
    .line 197
    new-instance v5, La/gbn;

    .line 198
    .line 199
    invoke-direct {v5, v3, v2, v4, v1}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 203
    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_2
    new-instance v0, La/t0h0;

    .line 207
    .line 208
    iget-object v1, p0, La/zo90;->g2:La/pni;

    .line 209
    .line 210
    const/4 v2, 0x0

    .line 211
    if-eqz v1, :cond_1

    .line 212
    .line 213
    iget-object p0, p0, La/zo90;->h2:La/qni;

    .line 214
    .line 215
    if-eqz p0, :cond_0

    .line 216
    .line 217
    invoke-direct {v0, v1, p0}, La/t0h0;-><init>(La/pni;La/qni;)V

    .line 218
    .line 219
    .line 220
    return-object v0

    .line 221
    :cond_0
    const-string p0, "pickerStateHolderFactory"

    .line 222
    .line 223
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v2

    .line 227
    :cond_1
    const-string p0, "viewModelFactory"

    .line 228
    .line 229
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v2

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
