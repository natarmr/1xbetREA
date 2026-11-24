.class public final La/s3o;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d9z;

.field public final synthetic l:La/pkk0;


# direct methods
.method public synthetic constructor <init>(La/d9z;La/pkk0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/s3o;->i:B

    iput-object p1, p0, La/s3o;->k:La/d9z;

    iput-object p2, p0, La/s3o;->l:La/pkk0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/s3o;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/s3o;

    .line 7
    .line 8
    iget-object v0, p0, La/s3o;->l:La/pkk0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-object p0, p0, La/s3o;->k:La/d9z;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/s3o;-><init>(La/d9z;La/pkk0;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/s3o;

    .line 18
    .line 19
    iget-object v0, p0, La/s3o;->l:La/pkk0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iget-object p0, p0, La/s3o;->k:La/d9z;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/s3o;-><init>(La/d9z;La/pkk0;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, La/s3o;

    .line 29
    .line 30
    iget-object v0, p0, La/s3o;->l:La/pkk0;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iget-object p0, p0, La/s3o;->k:La/d9z;

    .line 34
    .line 35
    invoke-direct {p1, p0, v0, p2, v1}, La/s3o;-><init>(La/d9z;La/pkk0;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/s3o;->i:B

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
    invoke-virtual {p0, p1, p2}, La/s3o;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/s3o;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/s3o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/s3o;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/s3o;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/s3o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/s3o;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/s3o;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/s3o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/s3o;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/s3o;->l:La/pkk0;

    .line 4
    .line 5
    iget-object v2, p0, La/s3o;->k:La/d9z;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, p0, La/s3o;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, La/md0;

    .line 34
    .line 35
    const/16 v3, 0x17

    .line 36
    .line 37
    invoke-direct {p1, v2, v3}, La/md0;-><init>(La/d9z;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v5, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v2, La/oig;

    .line 45
    .line 46
    const/4 v3, 0x5

    .line 47
    invoke-direct {v2, v1, v3}, La/oig;-><init>(La/pkk0;B)V

    .line 48
    .line 49
    .line 50
    iput-boolean v4, p0, La/s3o;->j:Z

    .line 51
    .line 52
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-ne p0, v0, :cond_2

    .line 57
    .line 58
    move-object v5, v0

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    :goto_1
    return-object v5

    .line 63
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 64
    .line 65
    iget-boolean v6, p0, La/s3o;->j:Z

    .line 66
    .line 67
    if-eqz v6, :cond_4

    .line 68
    .line 69
    if-ne v6, v4, :cond_3

    .line 70
    .line 71
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance p1, La/md0;

    .line 83
    .line 84
    const/16 v3, 0x8

    .line 85
    .line 86
    invoke-direct {p1, v2, v3}, La/md0;-><init>(La/d9z;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {v5, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    new-instance v2, La/oig;

    .line 94
    .line 95
    const/4 v3, 0x2

    .line 96
    invoke-direct {v2, v1, v3}, La/oig;-><init>(La/pkk0;B)V

    .line 97
    .line 98
    .line 99
    iput-boolean v4, p0, La/s3o;->j:Z

    .line 100
    .line 101
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-ne p0, v0, :cond_5

    .line 106
    .line 107
    move-object v5, v0

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_3
    return-object v5

    .line 112
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 113
    .line 114
    iget-boolean v6, p0, La/s3o;->j:Z

    .line 115
    .line 116
    if-eqz v6, :cond_7

    .line 117
    .line 118
    if-ne v6, v4, :cond_6

    .line 119
    .line 120
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    new-instance p1, La/md0;

    .line 132
    .line 133
    const/4 v3, 0x7

    .line 134
    invoke-direct {p1, v2, v3}, La/md0;-><init>(La/d9z;B)V

    .line 135
    .line 136
    .line 137
    invoke-static {v5, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance v2, La/oig;

    .line 142
    .line 143
    invoke-direct {v2, v1, v4}, La/oig;-><init>(La/pkk0;B)V

    .line 144
    .line 145
    .line 146
    iput-boolean v4, p0, La/s3o;->j:Z

    .line 147
    .line 148
    invoke-virtual {p1, v2, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    if-ne p0, v0, :cond_8

    .line 153
    .line 154
    move-object v5, v0

    .line 155
    goto :goto_5

    .line 156
    :cond_8
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    :goto_5
    return-object v5

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
