.class public final La/a5;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/lbh0;

.field public synthetic l:J


# direct methods
.method public synthetic constructor <init>(La/lbh0;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/a5;->i:B

    iput-object p1, p0, La/a5;->k:La/lbh0;

    iput-wide p2, p0, La/a5;->l:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/lbh0;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/a5;->i:B

    .line 2
    iput-object p1, p0, La/a5;->k:La/lbh0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/a5;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/a5;

    .line 7
    .line 8
    iget-wide v3, p0, La/a5;->l:J

    .line 9
    .line 10
    const/4 v6, 0x3

    .line 11
    iget-object v2, p0, La/a5;->k:La/lbh0;

    .line 12
    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, La/a5;-><init>(La/lbh0;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    move-object v6, p2

    .line 19
    new-instance v2, La/a5;

    .line 20
    .line 21
    iget-wide v4, p0, La/a5;->l:J

    .line 22
    .line 23
    const/4 v7, 0x2

    .line 24
    iget-object v3, p0, La/a5;->k:La/lbh0;

    .line 25
    .line 26
    invoke-direct/range {v2 .. v7}, La/a5;-><init>(La/lbh0;JLa/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_1
    move-object v6, p2

    .line 31
    new-instance v2, La/a5;

    .line 32
    .line 33
    iget-wide v4, p0, La/a5;->l:J

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    iget-object v3, p0, La/a5;->k:La/lbh0;

    .line 37
    .line 38
    invoke-direct/range {v2 .. v7}, La/a5;-><init>(La/lbh0;JLa/yje;B)V

    .line 39
    .line 40
    .line 41
    return-object v2

    .line 42
    :pswitch_2
    move-object v6, p2

    .line 43
    new-instance p2, La/a5;

    .line 44
    .line 45
    iget-object p0, p0, La/a5;->k:La/lbh0;

    .line 46
    .line 47
    invoke-direct {p2, p0, v6}, La/a5;-><init>(La/lbh0;La/yje;)V

    .line 48
    .line 49
    .line 50
    check-cast p1, La/ne60;

    .line 51
    .line 52
    iget-wide p0, p1, La/ne60;->a:J

    .line 53
    .line 54
    iput-wide p0, p2, La/a5;->l:J

    .line 55
    .line 56
    return-object p2

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a5;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/a5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a5;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/a5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/a5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/a5;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/a5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/a5;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/a5;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/a5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/ne60;

    .line 58
    .line 59
    iget-wide v0, p1, La/ne60;->a:J

    .line 60
    .line 61
    check-cast p2, La/yje;

    .line 62
    .line 63
    new-instance p1, La/a5;

    .line 64
    .line 65
    iget-object p0, p0, La/a5;->k:La/lbh0;

    .line 66
    .line 67
    invoke-direct {p1, p0, p2}, La/a5;-><init>(La/lbh0;La/yje;)V

    .line 68
    .line 69
    .line 70
    iput-wide v0, p1, La/a5;->l:J

    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    invoke-virtual {p1, p0}, La/a5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/a5;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/a5;->k:La/lbh0;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/a5;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, v1, La/lbh0;->s1:La/sch0;

    .line 32
    .line 33
    iget-wide v1, p0, La/a5;->l:J

    .line 34
    .line 35
    iput-boolean v3, p0, La/a5;->j:Z

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-virtual {p1, v1, v2, v3, p0}, La/sch0;->c(JZLa/bnn0;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-ne p0, v0, :cond_2

    .line 43
    .line 44
    move-object v4, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    :goto_1
    return-object v4

    .line 49
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 50
    .line 51
    iget-boolean v5, p0, La/a5;->j:Z

    .line 52
    .line 53
    if-eqz v5, :cond_4

    .line 54
    .line 55
    if-ne v5, v3, :cond_3

    .line 56
    .line 57
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, v1, La/lbh0;->s1:La/sch0;

    .line 69
    .line 70
    iget-wide v1, p0, La/a5;->l:J

    .line 71
    .line 72
    iput-boolean v3, p0, La/a5;->j:Z

    .line 73
    .line 74
    invoke-virtual {p1, v1, v2, v3, p0}, La/sch0;->c(JZLa/bnn0;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, v0, :cond_5

    .line 79
    .line 80
    move-object v4, v0

    .line 81
    goto :goto_3

    .line 82
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    :goto_3
    return-object v4

    .line 85
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 86
    .line 87
    iget-boolean v5, p0, La/a5;->j:Z

    .line 88
    .line 89
    if-eqz v5, :cond_7

    .line 90
    .line 91
    if-ne v5, v3, :cond_6

    .line 92
    .line 93
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object p1, v1, La/lbh0;->s1:La/sch0;

    .line 105
    .line 106
    sget-object v1, La/c050;->b:La/c050;

    .line 107
    .line 108
    new-instance v2, La/hu6;

    .line 109
    .line 110
    iget-wide v5, p0, La/a5;->l:J

    .line 111
    .line 112
    const/16 v7, 0x9

    .line 113
    .line 114
    invoke-direct {v2, v5, v6, v4, v7}, La/hu6;-><init>(JLa/yje;B)V

    .line 115
    .line 116
    .line 117
    iput-boolean v3, p0, La/a5;->j:Z

    .line 118
    .line 119
    invoke-virtual {p1, v1, v2, p0}, La/sch0;->g(La/c050;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    if-ne p0, v0, :cond_8

    .line 124
    .line 125
    move-object v4, v0

    .line 126
    goto :goto_5

    .line 127
    :cond_8
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    :goto_5
    return-object v4

    .line 130
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 131
    .line 132
    iget-boolean v5, p0, La/a5;->j:Z

    .line 133
    .line 134
    if-eqz v5, :cond_a

    .line 135
    .line 136
    if-ne v5, v3, :cond_9

    .line 137
    .line 138
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    move-object p1, v4

    .line 146
    goto :goto_6

    .line 147
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget-wide v4, p0, La/a5;->l:J

    .line 151
    .line 152
    iput-boolean v3, p0, La/a5;->j:Z

    .line 153
    .line 154
    iget-object p1, v1, La/lbh0;->s1:La/sch0;

    .line 155
    .line 156
    invoke-static {p1, v4, v5, p0}, La/fbh0;->c(La/sch0;JLa/zje;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-ne p1, v0, :cond_b

    .line 161
    .line 162
    move-object p1, v0

    .line 163
    :cond_b
    :goto_6
    return-object p1

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
