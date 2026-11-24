.class public final La/g990;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/p990;


# direct methods
.method public synthetic constructor <init>(La/p990;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g990;->i:B

    iput-object p1, p0, La/g990;->k:La/p990;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/g990;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/g990;->k:La/p990;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/g990;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/g990;-><init>(La/p990;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/g990;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/g990;-><init>(La/p990;La/yje;B)V

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
    iget-byte v0, p0, La/g990;->i:B

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
    invoke-virtual {p0, p1, p2}, La/g990;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/g990;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/g990;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/g990;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/g990;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/g990;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/g990;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    iget-object v2, p0, La/g990;->k:La/p990;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/g990;->j:B

    .line 16
    .line 17
    const/4 v7, 0x3

    .line 18
    if-eqz v6, :cond_3

    .line 19
    .line 20
    if-eq v6, v3, :cond_2

    .line 21
    .line 22
    if-eq v6, v4, :cond_1

    .line 23
    .line 24
    if-ne v6, v7, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, v2, La/p990;->c:La/hse0;

    .line 46
    .line 47
    iput-byte v3, p0, La/g990;->j:B

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    const/4 v3, 0x7

    .line 51
    invoke-static {p1, v5, v1, p0, v3}, La/hse0;->a(La/hse0;Ljava/lang/String;ZLa/yje;I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    :goto_0
    iget-object p1, v2, La/p990;->B:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_6

    .line 65
    .line 66
    iget-object p1, v2, La/p990;->e:La/w5z;

    .line 67
    .line 68
    iget-boolean v1, v2, La/p990;->A:Z

    .line 69
    .line 70
    iget-wide v5, v2, La/p990;->F:J

    .line 71
    .line 72
    iput-byte v4, p0, La/g990;->j:B

    .line 73
    .line 74
    invoke-virtual {p1, v5, v6, p0, v1}, La/w5z;->T(JLa/zje;Z)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v0, :cond_5

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 82
    .line 83
    :cond_6
    iput-byte v7, p0, La/g990;->j:B

    .line 84
    .line 85
    invoke-virtual {v2, p1, p0}, La/p990;->z(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, v0, :cond_7

    .line 90
    .line 91
    :goto_2
    move-object v5, v0

    .line 92
    goto :goto_4

    .line 93
    :cond_7
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    :goto_4
    return-object v5

    .line 96
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 97
    .line 98
    iget-byte v6, p0, La/g990;->j:B

    .line 99
    .line 100
    if-eqz v6, :cond_a

    .line 101
    .line 102
    if-eq v6, v3, :cond_9

    .line 103
    .line 104
    if-ne v6, v4, :cond_8

    .line 105
    .line 106
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_7

    .line 110
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_8

    .line 114
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iget-object p1, v2, La/p990;->B:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-nez v1, :cond_c

    .line 128
    .line 129
    iget-object p1, v2, La/p990;->e:La/w5z;

    .line 130
    .line 131
    iget-boolean v1, v2, La/p990;->A:Z

    .line 132
    .line 133
    iget-wide v5, v2, La/p990;->F:J

    .line 134
    .line 135
    iput-byte v3, p0, La/g990;->j:B

    .line 136
    .line 137
    invoke-virtual {p1, v5, v6, p0, v1}, La/w5z;->T(JLa/zje;Z)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne p1, v0, :cond_b

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_b
    :goto_5
    check-cast p1, Ljava/lang/String;

    .line 145
    .line 146
    :cond_c
    iput-byte v4, p0, La/g990;->j:B

    .line 147
    .line 148
    invoke-virtual {v2, p1, p0}, La/p990;->y(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-ne p0, v0, :cond_d

    .line 153
    .line 154
    :goto_6
    move-object v5, v0

    .line 155
    goto :goto_8

    .line 156
    :cond_d
    :goto_7
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    :goto_8
    return-object v5

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
