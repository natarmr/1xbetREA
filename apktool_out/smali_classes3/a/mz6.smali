.class public final La/mz6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/b07;


# direct methods
.method public synthetic constructor <init>(La/b07;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mz6;->i:B

    iput-object p1, p0, La/mz6;->k:La/b07;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/mz6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mz6;->k:La/b07;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mz6;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/mz6;-><init>(La/b07;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/mz6;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/mz6;-><init>(La/b07;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/mz6;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/mz6;-><init>(La/b07;La/yje;B)V

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
    iget-byte v0, p0, La/mz6;->i:B

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
    invoke-virtual {p0, p1, p2}, La/mz6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mz6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mz6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/mz6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/mz6;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/mz6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/mz6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/mz6;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/mz6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/mz6;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/mz6;->k:La/b07;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/mz6;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-boolean v4, p0, La/mz6;->j:Z

    .line 32
    .line 33
    sget-object p0, La/b07;->w:Ljava/util/List;

    .line 34
    .line 35
    iget-object p0, v1, La/b07;->i:La/y3v;

    .line 36
    .line 37
    invoke-virtual {p0}, La/y3v;->q()Lkotlin/Unit;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-ne p0, v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    :goto_0
    if-ne p0, v0, :cond_3

    .line 47
    .line 48
    move-object v2, v0

    .line 49
    goto :goto_2

    .line 50
    :cond_3
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    :goto_2
    return-object v2

    .line 53
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 54
    .line 55
    iget-boolean v5, p0, La/mz6;->j:Z

    .line 56
    .line 57
    if-eqz v5, :cond_5

    .line 58
    .line 59
    if-ne v5, v4, :cond_4

    .line 60
    .line 61
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, v1, La/b07;->n:La/wsf0;

    .line 73
    .line 74
    iput-boolean v4, p0, La/mz6;->j:Z

    .line 75
    .line 76
    sget-object v1, La/d16;->a:La/d16;

    .line 77
    .line 78
    invoke-virtual {p1, v1, p0}, La/wsf0;->m(La/i16;La/zje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, v0, :cond_6

    .line 83
    .line 84
    move-object v2, v0

    .line 85
    goto :goto_4

    .line 86
    :cond_6
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    :goto_4
    return-object v2

    .line 89
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 90
    .line 91
    iget-boolean v5, p0, La/mz6;->j:Z

    .line 92
    .line 93
    if-eqz v5, :cond_8

    .line 94
    .line 95
    if-ne v5, v4, :cond_7

    .line 96
    .line 97
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, v1, La/b07;->j:La/b8u;

    .line 109
    .line 110
    iget-object p1, p1, La/b8u;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, La/rkc0;

    .line 113
    .line 114
    iget-object p1, p1, La/rkc0;->b:La/dnc0;

    .line 115
    .line 116
    iget-object p1, p1, La/dnc0;->d:La/qoj0;

    .line 117
    .line 118
    new-instance v2, La/c00;

    .line 119
    .line 120
    const/16 v3, 0x12

    .line 121
    .line 122
    invoke-direct {v2, p1, v1, v3}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 123
    .line 124
    .line 125
    new-instance p1, La/jz6;

    .line 126
    .line 127
    const/4 v3, 0x0

    .line 128
    invoke-direct {p1, v1, v3}, La/jz6;-><init>(Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    iput-boolean v4, p0, La/mz6;->j:Z

    .line 132
    .line 133
    invoke-virtual {v2, p1, p0}, La/c00;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-ne p0, v0, :cond_9

    .line 138
    .line 139
    move-object v2, v0

    .line 140
    goto :goto_6

    .line 141
    :cond_9
    :goto_5
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    :goto_6
    return-object v2

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
