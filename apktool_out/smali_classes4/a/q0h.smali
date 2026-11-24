.class public final synthetic La/q0h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(BILa/a4x;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/q0h;->a:B

    iput-object p3, p0, La/q0h;->b:La/a4x;

    iput-object p4, p0, La/q0h;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/q0h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q0h;->b:La/a4x;

    iput-object p2, p0, La/q0h;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/q0h;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/q0h;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/q0h;->b:La/a4x;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/fet;

    .line 12
    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p0, v1, p1, p2}, La/l7x;->t(La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, La/fet;

    .line 29
    .line 30
    check-cast p2, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, La/x8x;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {p0, v1, p1, p2}, La/yyw;->x(La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    check-cast p1, La/fet;

    .line 46
    .line 47
    check-cast p2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v2}, La/x8x;->L(I)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-static {p0, v1, p1, p2}, La/yyw;->c(La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_2
    check-cast p1, La/fet;

    .line 63
    .line 64
    check-cast p2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v2}, La/x8x;->L(I)I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-static {p0, v1, p1, p2}, La/yyw;->a(La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_3
    move-object v3, p1

    .line 80
    check-cast v3, La/i8z;

    .line 81
    .line 82
    check-cast p2, Ljava/lang/Integer;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_3

    .line 100
    .line 101
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    check-cast p2, La/s8p;

    .line 106
    .line 107
    if-eqz p2, :cond_2

    .line 108
    .line 109
    instance-of v0, p2, La/gun;

    .line 110
    .line 111
    if-eqz v0, :cond_0

    .line 112
    .line 113
    new-instance v0, La/dx2;

    .line 114
    .line 115
    const/16 v4, 0xc

    .line 116
    .line 117
    invoke-direct {v0, p1, v4}, La/dx2;-><init>(IB)V

    .line 118
    .line 119
    .line 120
    new-instance v4, La/lfp;

    .line 121
    .line 122
    const/4 v5, 0x0

    .line 123
    invoke-direct {v4, p2, v5}, La/lfp;-><init>(La/s8p;B)V

    .line 124
    .line 125
    .line 126
    new-instance p2, La/ugd;

    .line 127
    .line 128
    const v5, 0x1d428e65

    .line 129
    .line 130
    .line 131
    invoke-direct {p2, v5, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v3, v0, p2}, La/i8z;->d(La/i8z;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_0
    instance-of v0, p2, La/h4t;

    .line 139
    .line 140
    if-eqz v0, :cond_1

    .line 141
    .line 142
    new-instance v0, La/dx2;

    .line 143
    .line 144
    const/16 v4, 0xd

    .line 145
    .line 146
    invoke-direct {v0, p1, v4}, La/dx2;-><init>(IB)V

    .line 147
    .line 148
    .line 149
    new-instance v4, La/lfp;

    .line 150
    .line 151
    invoke-direct {v4, p2, v2}, La/lfp;-><init>(La/s8p;B)V

    .line 152
    .line 153
    .line 154
    new-instance p2, La/ugd;

    .line 155
    .line 156
    const v5, 0x6407ace

    .line 157
    .line 158
    .line 159
    invoke-direct {p2, v5, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v3, v0, p2}, La/i8z;->d(La/i8z;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_1
    instance-of v0, p2, La/uee0;

    .line 167
    .line 168
    if-eqz v0, :cond_2

    .line 169
    .line 170
    check-cast p2, La/uee0;

    .line 171
    .line 172
    iget-object v4, p2, La/uee0;->a:La/ftr;

    .line 173
    .line 174
    new-instance v5, La/ag0;

    .line 175
    .line 176
    const/16 p2, 0x1d

    .line 177
    .line 178
    invoke-direct {v5, v1, p2}, La/ag0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 179
    .line 180
    .line 181
    new-instance v6, La/qyo;

    .line 182
    .line 183
    const/16 p2, 0xa

    .line 184
    .line 185
    invoke-direct {v6, v1, p2}, La/qyo;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 186
    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    const/16 v8, 0x8

    .line 190
    .line 191
    invoke-static/range {v3 .. v8}, La/uzb;->U(La/i8z;La/htr;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/xz8;I)V

    .line 192
    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 196
    .line 197
    .line 198
    const/4 p0, 0x0

    .line 199
    goto :goto_1

    .line 200
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    :goto_1
    return-object p0

    .line 203
    :pswitch_4
    check-cast p1, La/fet;

    .line 204
    .line 205
    check-cast p2, Ljava/lang/Integer;

    .line 206
    .line 207
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-static {v2}, La/x8x;->L(I)I

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    invoke-static {p0, v1, p1, p2}, La/dtb;->d(La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 215
    .line 216
    .line 217
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object p0

    .line 220
    nop

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
