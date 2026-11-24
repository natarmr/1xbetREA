.class public final La/w1c0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/b2c0;


# direct methods
.method public synthetic constructor <init>(La/b2c0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w1c0;->i:B

    iput-object p1, p0, La/w1c0;->k:La/b2c0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/w1c0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/w1c0;->k:La/b2c0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/w1c0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/w1c0;-><init>(La/b2c0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/w1c0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/w1c0;-><init>(La/b2c0;La/yje;B)V

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
    iget-byte v0, p0, La/w1c0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/w1c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/w1c0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/w1c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/w1c0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/w1c0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/w1c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/w1c0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    iget-object v5, p0, La/w1c0;->k:La/b2c0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/w1c0;->j:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v3, :cond_1

    .line 20
    .line 21
    if-ne v6, v4, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_4

    .line 27
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_5

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, v5, La/b2c0;->p:La/rou;

    .line 39
    .line 40
    iput-byte v3, p0, La/w1c0;->j:B

    .line 41
    .line 42
    invoke-virtual {p1, v3, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_3

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_3
    :goto_0
    check-cast p1, La/m2c0;

    .line 50
    .line 51
    iget-object v1, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v2, p1, La/m2c0;->k:La/jqt0;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v6, 0x0

    .line 60
    if-nez v1, :cond_5

    .line 61
    .line 62
    sget-object v1, La/jqt0;->b:La/jqt0;

    .line 63
    .line 64
    if-eq v2, v1, :cond_4

    .line 65
    .line 66
    sget-object v1, La/jqt0;->c:La/jqt0;

    .line 67
    .line 68
    if-ne v2, v1, :cond_5

    .line 69
    .line 70
    :cond_4
    move v1, v3

    .line 71
    goto :goto_1

    .line 72
    :cond_5
    move v1, v6

    .line 73
    :goto_1
    iget-object p1, p1, La/m2c0;->Z:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-lez p1, :cond_6

    .line 80
    .line 81
    sget-object p1, La/jqt0;->b:La/jqt0;

    .line 82
    .line 83
    if-eq v2, p1, :cond_7

    .line 84
    .line 85
    sget-object p1, La/jqt0;->c:La/jqt0;

    .line 86
    .line 87
    if-ne v2, p1, :cond_6

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    move v3, v6

    .line 91
    :cond_7
    :goto_2
    if-nez v1, :cond_8

    .line 92
    .line 93
    if-nez v3, :cond_8

    .line 94
    .line 95
    iput-byte v4, p0, La/w1c0;->j:B

    .line 96
    .line 97
    sget-object p1, La/b2c0;->C:Ljava/util/List;

    .line 98
    .line 99
    invoke-virtual {v5, p0}, La/b2c0;->R(La/zje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p0, v0, :cond_8

    .line 104
    .line 105
    :goto_3
    move-object v1, v0

    .line 106
    goto :goto_5

    .line 107
    :cond_8
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    :goto_5
    return-object v1

    .line 110
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 111
    .line 112
    iget-byte v6, p0, La/w1c0;->j:B

    .line 113
    .line 114
    if-eqz v6, :cond_b

    .line 115
    .line 116
    if-eq v6, v3, :cond_a

    .line 117
    .line 118
    if-ne v6, v4, :cond_9

    .line 119
    .line 120
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_8

    .line 124
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_9

    .line 128
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iput-byte v3, p0, La/w1c0;->j:B

    .line 136
    .line 137
    sget-object p1, La/b2c0;->C:Ljava/util/List;

    .line 138
    .line 139
    invoke-virtual {v5, p0}, La/b2c0;->S(La/zje;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-ne p1, v0, :cond_c

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_c
    :goto_6
    iput-byte v4, p0, La/w1c0;->j:B

    .line 147
    .line 148
    sget-object p1, La/b2c0;->C:Ljava/util/List;

    .line 149
    .line 150
    invoke-virtual {v5, p0}, La/b2c0;->M(La/zje;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    if-ne p0, v0, :cond_d

    .line 155
    .line 156
    :goto_7
    move-object v1, v0

    .line 157
    goto :goto_9

    .line 158
    :cond_d
    :goto_8
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    :goto_9
    return-object v1

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
