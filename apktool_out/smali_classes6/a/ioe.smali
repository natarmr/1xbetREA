.class public final La/ioe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:J

.field public final synthetic m:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(JLkotlin/jvm/functions/Function2;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/ioe;->i:B

    .line 3
    .line 4
    iput-wide p1, p0, La/ioe;->l:J

    .line 5
    .line 6
    iput-object p3, p0, La/ioe;->m:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function2;JLa/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/ioe;->i:B

    .line 13
    iput-object p1, p0, La/ioe;->m:Lkotlin/jvm/functions/Function2;

    iput-wide p2, p0, La/ioe;->l:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ioe;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ioe;->m:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iget-wide v2, p0, La/ioe;->l:J

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p0, La/ioe;

    .line 11
    .line 12
    invoke-direct {p0, v2, v3, v1, p2}, La/ioe;-><init>(JLkotlin/jvm/functions/Function2;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/ioe;->k:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance p0, La/ioe;

    .line 19
    .line 20
    invoke-direct {p0, v1, v2, v3, p2}, La/ioe;-><init>(Lkotlin/jvm/functions/Function2;JLa/yje;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/ioe;->k:Ljava/lang/Object;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ioe;->i:B

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
    invoke-virtual {p0, p1, p2}, La/ioe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ioe;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ioe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/ioe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/ioe;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/ioe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 10

    .line 1
    iget-byte v0, p0, La/ioe;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ioe;->m:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    iget-wide v2, p0, La/ioe;->l:J

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x2

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/ioe;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/vne;

    .line 18
    .line 19
    sget-object v8, La/wne;->a:La/wne;

    .line 20
    .line 21
    iget-byte v9, p0, La/ioe;->j:B

    .line 22
    .line 23
    if-eqz v9, :cond_2

    .line 24
    .line 25
    if-eq v9, v6, :cond_1

    .line 26
    .line 27
    if-ne v9, v7, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_3
    invoke-static {v0}, La/d5c;->R(La/vne;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_5

    .line 46
    .line 47
    iput-object v0, p0, La/ioe;->k:Ljava/lang/Object;

    .line 48
    .line 49
    iput-byte v6, p0, La/ioe;->j:B

    .line 50
    .line 51
    invoke-static {v2, v3, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v8, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    :goto_1
    iput-object v0, p0, La/ioe;->k:Ljava/lang/Object;

    .line 59
    .line 60
    iput-byte v7, p0, La/ioe;->j:B

    .line 61
    .line 62
    invoke-interface {v1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v8, :cond_3

    .line 67
    .line 68
    :goto_2
    move-object v4, v8

    .line 69
    goto :goto_3

    .line 70
    :cond_5
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    :goto_3
    return-object v4

    .line 73
    :pswitch_0
    iget-object v0, p0, La/ioe;->k:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/vne;

    .line 76
    .line 77
    sget-object v8, La/wne;->a:La/wne;

    .line 78
    .line 79
    iget-byte v9, p0, La/ioe;->j:B

    .line 80
    .line 81
    if-eqz v9, :cond_8

    .line 82
    .line 83
    if-eq v9, v6, :cond_7

    .line 84
    .line 85
    if-ne v9, v7, :cond_6

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_7

    .line 92
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_8
    :goto_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_9
    invoke-static {v0}, La/d5c;->R(La/vne;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_b

    .line 104
    .line 105
    iput-object v0, p0, La/ioe;->k:Ljava/lang/Object;

    .line 106
    .line 107
    iput-byte v6, p0, La/ioe;->j:B

    .line 108
    .line 109
    invoke-interface {v1, v0, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v8, :cond_a

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_a
    :goto_5
    iput-object v0, p0, La/ioe;->k:Ljava/lang/Object;

    .line 117
    .line 118
    iput-byte v7, p0, La/ioe;->j:B

    .line 119
    .line 120
    invoke-static {v2, v3, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v8, :cond_9

    .line 125
    .line 126
    :goto_6
    move-object v4, v8

    .line 127
    goto :goto_7

    .line 128
    :cond_b
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    :goto_7
    return-object v4

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
