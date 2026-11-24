.class public final La/zci0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/ldi0;


# direct methods
.method public synthetic constructor <init>(La/ldi0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/zci0;->i:B

    iput-object p1, p0, La/zci0;->j:La/ldi0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/zci0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zci0;->j:La/ldi0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/zci0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/zci0;-><init>(La/ldi0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/zci0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/zci0;-><init>(La/ldi0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zci0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/kmq;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/zci0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/zci0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/zci0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kbi0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/zci0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/zci0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/zci0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/zci0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/zci0;->j:La/ldi0;

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
    iget-object p1, p0, La/ldi0;->D:La/c4m0;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 v0, 0x1

    .line 22
    if-ne p1, v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, La/ldi0;->u:La/m1e;

    .line 26
    .line 27
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, La/yci0;

    .line 32
    .line 33
    const/4 v1, 0x5

    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v0, p0, v2, v1}, La/yci0;-><init>(La/ldi0;La/yje;B)V

    .line 36
    .line 37
    .line 38
    new-instance v1, La/fnq;

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    invoke-direct {v1, p1, v0, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, p0, La/ldi0;->e:La/mne;

    .line 49
    .line 50
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 51
    .line 52
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance v0, La/bai0;

    .line 57
    .line 58
    const/4 v3, 0x3

    .line 59
    invoke-direct {v0, p0, v2, v3}, La/bai0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, La/ldi0;->D:La/c4m0;

    .line 67
    .line 68
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 72
    .line 73
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, La/ldi0;->H:La/p7m0;

    .line 77
    .line 78
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v1, v0

    .line 83
    check-cast v1, La/uci0;

    .line 84
    .line 85
    sget-object v2, La/obk0;->b:La/zie0;

    .line 86
    .line 87
    iget-object v3, p0, La/ldi0;->G:La/p7m0;

    .line 88
    .line 89
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, La/kbi0;

    .line 94
    .line 95
    iget-object v4, v4, La/kbi0;->b:Ljava/util/List;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-static {v4}, La/zie0;->d(Ljava/util/List;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, La/kbi0;

    .line 109
    .line 110
    iget-object v4, v4, La/kbi0;->b:Ljava/util/List;

    .line 111
    .line 112
    invoke-static {v4}, La/zie0;->f(Ljava/util/List;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    check-cast v5, La/kbi0;

    .line 121
    .line 122
    iget-object v5, v5, La/kbi0;->b:Ljava/util/List;

    .line 123
    .line 124
    invoke-static {v5}, La/zie0;->e(Ljava/util/List;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, La/kbi0;

    .line 133
    .line 134
    iget-object v3, v3, La/kbi0;->b:Ljava/util/List;

    .line 135
    .line 136
    invoke-static {v3}, La/zie0;->c(Ljava/util/List;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    const/4 v8, 0x0

    .line 141
    const/16 v9, 0xfe1

    .line 142
    .line 143
    const/4 v6, 0x0

    .line 144
    const/4 v7, 0x0

    .line 145
    move v10, v5

    .line 146
    move v5, v3

    .line 147
    move v3, v4

    .line 148
    move v4, v10

    .line 149
    invoke-static/range {v1 .. v9}, La/uci0;->a(La/uci0;ZZZZLa/eci0;ZZI)La/uci0;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_1

    .line 158
    .line 159
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object p0

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
