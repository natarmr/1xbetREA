.class public final La/iy70;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/gz70;


# direct methods
.method public synthetic constructor <init>(BLa/yje;La/gz70;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/iy70;->i:B

    iput-object p3, p0, La/iy70;->k:La/gz70;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/iy70;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/iy70;

    .line 7
    .line 8
    iget-object p0, p0, La/iy70;->k:La/gz70;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, v0, p2, p0}, La/iy70;-><init>(BLa/yje;La/gz70;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/iy70;

    .line 16
    .line 17
    iget-object p0, p0, La/iy70;->k:La/gz70;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, v0, p2, p0}, La/iy70;-><init>(BLa/yje;La/gz70;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, La/iy70;

    .line 25
    .line 26
    iget-object p0, p0, La/iy70;->k:La/gz70;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-direct {p1, v0, p2, p0}, La/iy70;-><init>(BLa/yje;La/gz70;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/iy70;->i:B

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
    invoke-virtual {p0, p1, p2}, La/iy70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/iy70;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/iy70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/iy70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/iy70;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/iy70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/iy70;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/iy70;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/iy70;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/iy70;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/iy70;->k:La/gz70;

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
    iget-boolean v5, p0, La/iy70;->j:Z

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
    iget-object p1, v1, La/gz70;->x:La/is;

    .line 32
    .line 33
    iput-boolean v3, p0, La/iy70;->j:Z

    .line 34
    .line 35
    invoke-virtual {p1, v3, p0}, La/is;->e(ZLa/zje;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-ne p0, v0, :cond_2

    .line 40
    .line 41
    move-object v4, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    :goto_1
    return-object v4

    .line 46
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 47
    .line 48
    iget-boolean v5, p0, La/iy70;->j:Z

    .line 49
    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    if-ne v5, v3, :cond_3

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-boolean v3, p0, La/iy70;->j:Z

    .line 66
    .line 67
    sget-object p1, La/gz70;->D:La/c4m0;

    .line 68
    .line 69
    invoke-virtual {v1, p0}, La/gz70;->a(La/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, v0, :cond_5

    .line 74
    .line 75
    move-object v4, v0

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    :goto_3
    return-object v4

    .line 80
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 81
    .line 82
    iget-boolean v5, p0, La/iy70;->j:Z

    .line 83
    .line 84
    if-eqz v5, :cond_7

    .line 85
    .line 86
    if-ne v5, v3, :cond_6

    .line 87
    .line 88
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iput-boolean v3, p0, La/iy70;->j:Z

    .line 100
    .line 101
    const-wide/16 v2, 0x0

    .line 102
    .line 103
    invoke-static {v2, v3, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-ne p0, v0, :cond_8

    .line 108
    .line 109
    move-object v4, v0

    .line 110
    goto :goto_5

    .line 111
    :cond_8
    :goto_4
    sget-object p0, La/gz70;->D:La/c4m0;

    .line 112
    .line 113
    if-eqz p0, :cond_9

    .line 114
    .line 115
    invoke-virtual {p0, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 116
    .line 117
    .line 118
    :cond_9
    sget-object p0, La/oom0;->c:La/oom0;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-static {p0}, La/gz70;->d(La/qom0;)V

    .line 124
    .line 125
    .line 126
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    :goto_5
    return-object v4

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
