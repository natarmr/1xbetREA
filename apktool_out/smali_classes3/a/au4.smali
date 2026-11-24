.class public final La/au4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/ku4;


# direct methods
.method public synthetic constructor <init>(La/ku4;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/au4;->i:B

    iput-object p1, p0, La/au4;->k:La/ku4;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/au4;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/au4;->k:La/ku4;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/au4;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/au4;-><init>(La/ku4;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/au4;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/au4;-><init>(La/ku4;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/au4;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/au4;-><init>(La/ku4;La/yje;B)V

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
    iget-byte v0, p0, La/au4;->i:B

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
    invoke-virtual {p0, p1, p2}, La/au4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/au4;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/au4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/au4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/au4;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/au4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/au4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/au4;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/au4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/au4;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/au4;->k:La/ku4;

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
    iget-boolean v5, p0, La/au4;->j:Z

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
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

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
    iget-object p1, v1, La/ku4;->l:La/rou;

    .line 32
    .line 33
    iput-boolean v4, p0, La/au4;->j:Z

    .line 34
    .line 35
    invoke-virtual {p1, v4, p0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v2, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    :goto_1
    return-object v2

    .line 46
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 47
    .line 48
    iget-boolean v5, p0, La/au4;->j:Z

    .line 49
    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    if-ne v5, v4, :cond_3

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v1, La/ku4;->c:La/suk;

    .line 68
    .line 69
    iget-object p1, p1, La/suk;->a:La/ts4;

    .line 70
    .line 71
    iget-object p1, p1, La/ts4;->e:La/vo4;

    .line 72
    .line 73
    iget-object p1, p1, La/vo4;->a:La/qoj0;

    .line 74
    .line 75
    new-instance v2, La/bm3;

    .line 76
    .line 77
    const/16 v3, 0x1d

    .line 78
    .line 79
    invoke-direct {v2, v1, v3}, La/bm3;-><init>(Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    iput-boolean v4, p0, La/au4;->j:Z

    .line 83
    .line 84
    invoke-virtual {p1, v2, p0}, La/qoj0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-object v2, v0

    .line 88
    :goto_2
    return-object v2

    .line 89
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 90
    .line 91
    iget-boolean v5, p0, La/au4;->j:Z

    .line 92
    .line 93
    if-eqz v5, :cond_6

    .line 94
    .line 95
    if-ne v5, v4, :cond_5

    .line 96
    .line 97
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object p1, La/ku4;->J:La/qq4;

    .line 109
    .line 110
    sget-object p1, La/vt4;->a:La/vt4;

    .line 111
    .line 112
    invoke-virtual {v1, p1}, La/ku4;->G(La/xt4;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, v1, La/ku4;->g:La/cu;

    .line 116
    .line 117
    iput-boolean v4, p0, La/au4;->j:Z

    .line 118
    .line 119
    invoke-virtual {p1, p0}, La/cu;->l(La/zje;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    if-ne p0, v0, :cond_7

    .line 124
    .line 125
    move-object v2, v0

    .line 126
    goto :goto_4

    .line 127
    :cond_7
    :goto_3
    sget-object p0, La/ku4;->J:La/qq4;

    .line 128
    .line 129
    iget-object p0, v1, La/ku4;->v:La/ol60;

    .line 130
    .line 131
    sget-object p1, La/st4;->a:La/st4;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, La/ku4;->w()V

    .line 137
    .line 138
    .line 139
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    :goto_4
    return-object v2

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
