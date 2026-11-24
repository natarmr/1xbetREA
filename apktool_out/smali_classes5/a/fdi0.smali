.class public final La/fdi0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/ldi0;


# direct methods
.method public synthetic constructor <init>(La/ldi0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fdi0;->i:B

    iput-object p1, p0, La/fdi0;->l:La/ldi0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/fdi0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/fdi0;->l:La/ldi0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/fdi0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/fdi0;-><init>(La/ldi0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/fdi0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/fdi0;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/fdi0;-><init>(La/ldi0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/fdi0;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/fdi0;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/fdi0;-><init>(La/ldi0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/fdi0;->k:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/fdi0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ynb0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/fdi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/fdi0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/fdi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/fdi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/fdi0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/fdi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/kmq;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/fdi0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/fdi0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/fdi0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/fdi0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/fdi0;->l:La/ldi0;

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
    iget-object v0, p0, La/fdi0;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, La/ynb0;

    .line 15
    .line 16
    sget-object v5, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v6, p0, La/fdi0;->j:Z

    .line 19
    .line 20
    if-eqz v6, :cond_1

    .line 21
    .line 22
    if-ne v6, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object p1, v4

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object v4, p0, La/fdi0;->k:Ljava/lang/Object;

    .line 37
    .line 38
    iput-boolean v3, p0, La/fdi0;->j:Z

    .line 39
    .line 40
    invoke-virtual {v1, v0, p0}, La/ldi0;->G(La/ynb0;La/zje;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-ne p1, v5, :cond_2

    .line 45
    .line 46
    move-object p1, v5

    .line 47
    :cond_2
    :goto_0
    return-object p1

    .line 48
    :pswitch_0
    iget-object v0, p0, La/fdi0;->k:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lkotlin/Pair;

    .line 51
    .line 52
    sget-object v5, La/wne;->a:La/wne;

    .line 53
    .line 54
    iget-boolean v6, p0, La/fdi0;->j:Z

    .line 55
    .line 56
    if-eqz v6, :cond_4

    .line 57
    .line 58
    if-ne v6, v3, :cond_3

    .line 59
    .line 60
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, La/e7a;

    .line 74
    .line 75
    instance-of v0, p1, La/d7a;

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    sget-object v0, La/tvk;->a:La/rwj;

    .line 80
    .line 81
    sget-object v0, La/ys10;->a:La/vs10;

    .line 82
    .line 83
    new-instance v2, La/bai0;

    .line 84
    .line 85
    const/4 v6, 0x2

    .line 86
    invoke-direct {v2, v1, p1, v4, v6}, La/bai0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 87
    .line 88
    .line 89
    iput-object v4, p0, La/fdi0;->k:Ljava/lang/Object;

    .line 90
    .line 91
    iput-boolean v3, p0, La/fdi0;->j:Z

    .line 92
    .line 93
    invoke-static {v0, v2, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-ne p0, v5, :cond_5

    .line 98
    .line 99
    move-object v4, v5

    .line 100
    goto :goto_2

    .line 101
    :cond_5
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    :goto_2
    return-object v4

    .line 104
    :pswitch_1
    iget-object v0, p0, La/fdi0;->k:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, La/kmq;

    .line 107
    .line 108
    sget-object v5, La/wne;->a:La/wne;

    .line 109
    .line 110
    iget-boolean v6, p0, La/fdi0;->j:Z

    .line 111
    .line 112
    if-eqz v6, :cond_7

    .line 113
    .line 114
    if-ne v6, v3, :cond_6

    .line 115
    .line 116
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, v1, La/ldi0;->f:La/x1u;

    .line 128
    .line 129
    invoke-virtual {p1}, La/x1u;->a()J

    .line 130
    .line 131
    .line 132
    move-result-wide v1

    .line 133
    new-instance p1, Ljava/lang/Long;

    .line 134
    .line 135
    invoke-direct {p1, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 136
    .line 137
    .line 138
    iput-object v4, p0, La/fdi0;->k:Ljava/lang/Object;

    .line 139
    .line 140
    iput-boolean v3, p0, La/fdi0;->j:Z

    .line 141
    .line 142
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    if-ne p0, v5, :cond_8

    .line 147
    .line 148
    move-object v4, v5

    .line 149
    goto :goto_4

    .line 150
    :cond_8
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    :goto_4
    return-object v4

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
