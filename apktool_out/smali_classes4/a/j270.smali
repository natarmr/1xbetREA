.class public final La/j270;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/n270;


# direct methods
.method public synthetic constructor <init>(La/n270;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/j270;->i:B

    iput-object p1, p0, La/j270;->j:La/n270;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/j270;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/j270;->j:La/n270;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/j270;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/j270;-><init>(La/n270;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/j270;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/j270;-><init>(La/n270;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/j270;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/j270;-><init>(La/n270;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/j270;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lkotlin/Pair;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/j270;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/j270;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/j270;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Lkotlin/Pair;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/j270;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/j270;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/j270;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/j270;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/j270;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/j270;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/j270;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/j270;->j:La/n270;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget p1, La/n270;->Z:I

    .line 14
    .line 15
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 16
    .line 17
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-object v1, p0

    .line 27
    check-cast v1, La/c270;

    .line 28
    .line 29
    const/4 v9, 0x0

    .line 30
    const/16 v10, 0xef

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    invoke-static/range {v1 .. v10}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, La/c270;

    .line 62
    .line 63
    iget-object p1, p1, La/c270;->f:La/m170;

    .line 64
    .line 65
    sget-object v0, La/m170;->a:La/m170;

    .line 66
    .line 67
    if-ne p1, v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, La/c270;

    .line 74
    .line 75
    iget-object p1, p1, La/c270;->h:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 84
    .line 85
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 86
    .line 87
    :cond_1
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-object v0, p1

    .line 95
    check-cast v0, La/c270;

    .line 96
    .line 97
    const/4 v8, 0x0

    .line 98
    const/16 v9, 0xef

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    const/4 v2, 0x0

    .line 102
    const/4 v3, 0x0

    .line 103
    const/4 v4, 0x0

    .line 104
    const/4 v5, 0x1

    .line 105
    const/4 v6, 0x0

    .line 106
    const/4 v7, 0x0

    .line 107
    invoke-static/range {v0 .. v9}, La/c270;->a(La/c270;Ljava/lang/String;Ljava/lang/String;La/d270;ZZLa/m170;La/k170;Ljava/util/List;I)La/c270;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_1

    .line 116
    .line 117
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 121
    .line 122
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, La/n270;->z:La/jqt;

    .line 126
    .line 127
    invoke-virtual {p1}, La/jqt;->a()La/h2c;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v0, La/i270;

    .line 132
    .line 133
    const/4 v1, 0x2

    .line 134
    const/4 v2, 0x0

    .line 135
    invoke-direct {v0, p0, v2, v1}, La/i270;-><init>(La/n270;La/yje;B)V

    .line 136
    .line 137
    .line 138
    new-instance v1, La/fnq;

    .line 139
    .line 140
    const/4 v3, 0x4

    .line 141
    invoke-direct {v1, p1, v0, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 142
    .line 143
    .line 144
    new-instance p1, La/pr60;

    .line 145
    .line 146
    const/4 v0, 0x3

    .line 147
    const/4 v3, 0x1

    .line 148
    invoke-direct {p1, v0, v2, v3}, La/pr60;-><init>(ILa/yje;B)V

    .line 149
    .line 150
    .line 151
    new-instance v0, La/dnq;

    .line 152
    .line 153
    invoke-direct {v0, v1, p1, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 154
    .line 155
    .line 156
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p0, p0, La/n270;->O:La/mne;

    .line 161
    .line 162
    iget-object p0, p0, La/mne;->b:La/dvj;

    .line 163
    .line 164
    invoke-static {p1, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {v0, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 169
    .line 170
    .line 171
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    return-object p0

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
