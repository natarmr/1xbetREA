.class public final synthetic La/wb5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(La/mm40;ILkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/wb5;->a:B

    iput-object p1, p0, La/wb5;->b:La/mm40;

    iput p2, p0, La/wb5;->d:I

    iput-object p3, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Lkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/wb5;->a:B

    iput-object p1, p0, La/wb5;->b:La/mm40;

    iput-object p2, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    iput p3, p0, La/wb5;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;La/mm40;IB)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/wb5;->a:B

    iput-object p1, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, La/wb5;->b:La/mm40;

    iput p3, p0, La/wb5;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wb5;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/wb5;->d:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, La/wb5;->b:La/mm40;

    .line 22
    .line 23
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    invoke-static {p2, p1, v0, p0}, La/pvm0;->a(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget p2, p0, La/wb5;->d:I

    .line 35
    .line 36
    or-int/lit8 p2, p2, 0x1

    .line 37
    .line 38
    invoke-static {p2}, La/x8x;->L(I)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iget-object v0, p0, La/wb5;->b:La/mm40;

    .line 43
    .line 44
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 45
    .line 46
    invoke-static {p2, p1, v0, p0}, La/pvm0;->b(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget p2, p0, La/wb5;->d:I

    .line 56
    .line 57
    or-int/lit8 p2, p2, 0x1

    .line 58
    .line 59
    invoke-static {p2}, La/x8x;->L(I)I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iget-object v0, p0, La/wb5;->b:La/mm40;

    .line 64
    .line 65
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 66
    .line 67
    invoke-static {p2, p1, v0, p0}, La/ewm0;->a(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget p2, p0, La/wb5;->d:I

    .line 77
    .line 78
    or-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    invoke-static {p2}, La/x8x;->L(I)I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    iget-object v0, p0, La/wb5;->b:La/mm40;

    .line 85
    .line 86
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 87
    .line 88
    invoke-static {p2, p1, v0, p0}, La/ewm0;->b(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    const/4 p2, 0x1

    .line 98
    invoke-static {p2}, La/x8x;->L(I)I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    iget v0, p0, La/wb5;->d:I

    .line 103
    .line 104
    iget-object v1, p0, La/wb5;->b:La/mm40;

    .line 105
    .line 106
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 107
    .line 108
    invoke-static {v0, p2, p1, v1, p0}, La/hxm0;->g(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const/4 p2, 0x7

    .line 118
    invoke-static {p2}, La/x8x;->L(I)I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    iget v0, p0, La/wb5;->d:I

    .line 123
    .line 124
    iget-object v1, p0, La/wb5;->b:La/mm40;

    .line 125
    .line 126
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 127
    .line 128
    invoke-static {v0, p2, p1, v1, p0}, La/qbc;->g(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 129
    .line 130
    .line 131
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const/4 p2, 0x1

    .line 138
    invoke-static {p2}, La/x8x;->L(I)I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    iget v0, p0, La/wb5;->d:I

    .line 143
    .line 144
    iget-object v1, p0, La/wb5;->b:La/mm40;

    .line 145
    .line 146
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 147
    .line 148
    invoke-static {v0, p2, p1, v1, p0}, La/obc;->k(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 149
    .line 150
    .line 151
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    const/4 p2, 0x1

    .line 158
    invoke-static {p2}, La/x8x;->L(I)I

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    iget v0, p0, La/wb5;->d:I

    .line 163
    .line 164
    iget-object v1, p0, La/wb5;->b:La/mm40;

    .line 165
    .line 166
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 167
    .line 168
    invoke-static {v0, p2, p1, v1, p0}, La/mbc;->j(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 169
    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    const/4 p2, 0x1

    .line 178
    invoke-static {p2}, La/x8x;->L(I)I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    iget v0, p0, La/wb5;->d:I

    .line 183
    .line 184
    iget-object v1, p0, La/wb5;->b:La/mm40;

    .line 185
    .line 186
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 187
    .line 188
    invoke-static {v0, p2, p1, v1, p0}, La/fbc;->m(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 189
    .line 190
    .line 191
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    iget p2, p0, La/wb5;->d:I

    .line 198
    .line 199
    or-int/lit8 p2, p2, 0x1

    .line 200
    .line 201
    invoke-static {p2}, La/x8x;->L(I)I

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    iget-object v0, p0, La/wb5;->b:La/mm40;

    .line 206
    .line 207
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 208
    .line 209
    invoke-static {p2, p1, v0, p0}, La/i120;->q(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 210
    .line 211
    .line 212
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_9
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 216
    .line 217
    .line 218
    iget p2, p0, La/wb5;->d:I

    .line 219
    .line 220
    or-int/lit8 p2, p2, 0x1

    .line 221
    .line 222
    invoke-static {p2}, La/x8x;->L(I)I

    .line 223
    .line 224
    .line 225
    move-result p2

    .line 226
    iget-object v0, p0, La/wb5;->b:La/mm40;

    .line 227
    .line 228
    iget-object p0, p0, La/wb5;->c:Lkotlin/jvm/functions/Function0;

    .line 229
    .line 230
    invoke-static {p2, p1, v0, p0}, La/j120;->g(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 231
    .line 232
    .line 233
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object p0

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
