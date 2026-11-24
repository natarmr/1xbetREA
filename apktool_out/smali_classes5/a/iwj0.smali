.class public final synthetic La/iwj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xxj0;


# direct methods
.method public synthetic constructor <init>(La/xxj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iwj0;->a:B

    iput-object p1, p0, La/iwj0;->b:La/xxj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/iwj0;->a:B

    .line 2
    .line 3
    sget-object v1, La/onb0;->a:La/onb0;

    .line 4
    .line 5
    iget-object v2, p0, La/iwj0;->b:La/xxj0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/m97;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, v2, La/xxj0;->q0:La/ol60;

    .line 16
    .line 17
    new-instance p1, La/tuj0;

    .line 18
    .line 19
    sget-object v4, La/pek0;->a:La/pek0;

    .line 20
    .line 21
    iget-object v0, v2, La/xxj0;->m:La/ctf0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    new-array v2, v1, [Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 27
    .line 28
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const v2, 0x7f13023f

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    sget-object v8, La/jdk0;->a:La/jdk0;

    .line 40
    .line 41
    new-instance v3, La/xdk0;

    .line 42
    .line 43
    const v0, 0x7f080be7

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    const/16 v10, 0x4c

    .line 51
    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, v3}, La/tuj0;-><init>(La/xdk0;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    instance-of p0, p1, Ljava/util/concurrent/CancellationException;

    .line 72
    .line 73
    if-nez p0, :cond_0

    .line 74
    .line 75
    invoke-virtual {v2, v1}, La/xxj0;->P(La/qnb0;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, La/iwj0;->b:La/xxj0;

    .line 87
    .line 88
    iget-object p0, v2, La/xxj0;->c:La/duj;

    .line 89
    .line 90
    new-instance v0, La/nfj0;

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x3

    .line 94
    const/4 v1, 0x2

    .line 95
    const-class v3, La/xxj0;

    .line 96
    .line 97
    const-string v4, "handleAdvanceError"

    .line 98
    .line 99
    const-string v5, "handleAdvanceError(Ljava/lang/Throwable;Ljava/lang/String;)V"

    .line 100
    .line 101
    invoke-direct/range {v0 .. v7}, La/nfj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object p0, v2, La/xxj0;->c:La/duj;

    .line 116
    .line 117
    new-instance v0, La/ogj0;

    .line 118
    .line 119
    const/16 v1, 0x14

    .line 120
    .line 121
    invoke-direct {v0, v1}, La/ogj0;-><init>(B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object p0, v2, La/xxj0;->c:La/duj;

    .line 136
    .line 137
    new-instance v0, La/jwj0;

    .line 138
    .line 139
    const/4 v1, 0x2

    .line 140
    invoke-direct {v0, v2, v1}, La/jwj0;-><init>(La/xxj0;B)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    instance-of p0, p1, Ljava/util/concurrent/CancellationException;

    .line 155
    .line 156
    if-nez p0, :cond_2

    .line 157
    .line 158
    iget-object p0, v2, La/xxj0;->o0:La/nwo0;

    .line 159
    .line 160
    iget-boolean p0, p0, La/nwo0;->a:Z

    .line 161
    .line 162
    if-eqz p0, :cond_1

    .line 163
    .line 164
    sget-object p0, La/wvo0;->a:La/wvo0;

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_1
    sget-object p0, La/zvo0;->a:La/zvo0;

    .line 168
    .line 169
    :goto_0
    invoke-virtual {v2, p0}, La/xxj0;->Q(La/gwo0;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v1}, La/xxj0;->P(La/qnb0;)V

    .line 173
    .line 174
    .line 175
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object p0, v2, La/xxj0;->c:La/duj;

    .line 184
    .line 185
    new-instance v0, La/jwj0;

    .line 186
    .line 187
    const/4 v1, 0x1

    .line 188
    invoke-direct {v0, v2, v1}, La/jwj0;-><init>(La/xxj0;B)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
