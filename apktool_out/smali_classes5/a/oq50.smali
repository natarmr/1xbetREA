.class public final La/oq50;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public final synthetic k:La/sq50;


# direct methods
.method public synthetic constructor <init>(La/sq50;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/oq50;->i:B

    iput-object p1, p0, La/oq50;->k:La/sq50;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/oq50;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/oq50;->k:La/sq50;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/oq50;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/oq50;-><init>(La/sq50;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/oq50;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/oq50;-><init>(La/sq50;La/yje;B)V

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
    iget-byte v0, p0, La/oq50;->i:B

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
    invoke-virtual {p0, p1, p2}, La/oq50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/oq50;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/oq50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/oq50;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/oq50;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/oq50;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/oq50;->i:B

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
    iget-object v5, p0, La/oq50;->k:La/sq50;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/oq50;->j:B

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
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_1
    :goto_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget p1, La/sq50;->B:I

    .line 36
    .line 37
    iget-object p1, v5, La/sq50;->z:La/n0o0;

    .line 38
    .line 39
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iput-byte v3, p0, La/oq50;->j:B

    .line 52
    .line 53
    invoke-virtual {v5, p0}, La/sq50;->O(La/zje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-ne p0, v0, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    iput-byte v4, p0, La/oq50;->j:B

    .line 61
    .line 62
    invoke-virtual {v5, p0}, La/sq50;->P(La/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-ne p0, v0, :cond_4

    .line 67
    .line 68
    :goto_1
    move-object v1, v0

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    :goto_3
    return-object v1

    .line 73
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 74
    .line 75
    iget-byte v6, p0, La/oq50;->j:B

    .line 76
    .line 77
    if-eqz v6, :cond_7

    .line 78
    .line 79
    if-eq v6, v3, :cond_6

    .line 80
    .line 81
    if-ne v6, v4, :cond_5

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_7

    .line 88
    :cond_6
    :goto_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_6

    .line 92
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    sget p1, La/sq50;->B:I

    .line 96
    .line 97
    iget-object p1, v5, La/sq50;->z:La/n0o0;

    .line 98
    .line 99
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_8

    .line 110
    .line 111
    iput-byte v3, p0, La/oq50;->j:B

    .line 112
    .line 113
    invoke-virtual {v5, p0}, La/sq50;->O(La/zje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-ne p0, v0, :cond_9

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_8
    iput-byte v4, p0, La/oq50;->j:B

    .line 121
    .line 122
    invoke-virtual {v5, p0}, La/sq50;->P(La/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    if-ne p0, v0, :cond_9

    .line 127
    .line 128
    :goto_5
    move-object v1, v0

    .line 129
    goto :goto_7

    .line 130
    :cond_9
    :goto_6
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    :goto_7
    return-object v1

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
