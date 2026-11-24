.class public final La/yau;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:J


# direct methods
.method public synthetic constructor <init>(ILa/yje;)V
    .locals 1

    .line 11
    const/4 v0, 0x1

    iput-byte v0, p0, La/yau;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/yau;->i:B

    .line 3
    .line 4
    iput-wide p1, p0, La/yau;->l:J

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yau;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    check-cast p3, La/yje;

    .line 15
    .line 16
    new-instance p0, La/yau;

    .line 17
    .line 18
    const/4 p2, 0x3

    .line 19
    invoke-direct {p0, p2, p3}, La/yau;-><init>(ILa/yje;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/yau;->k:La/kmq;

    .line 23
    .line 24
    iput-wide v0, p0, La/yau;->l:J

    .line 25
    .line 26
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/yau;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p2, Ljava/lang/Throwable;

    .line 34
    .line 35
    check-cast p3, La/yje;

    .line 36
    .line 37
    new-instance p2, La/yau;

    .line 38
    .line 39
    iget-wide v0, p0, La/yau;->l:J

    .line 40
    .line 41
    invoke-direct {p2, v0, v1, p3}, La/yau;-><init>(JLa/yje;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p2, La/yau;->k:La/kmq;

    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    invoke-virtual {p2, p0}, La/yau;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/yau;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/yau;->k:La/kmq;

    .line 11
    .line 12
    iget-wide v4, p0, La/yau;->l:J

    .line 13
    .line 14
    sget-object v6, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v7, p0, La/yau;->j:Z

    .line 17
    .line 18
    if-eqz v7, :cond_1

    .line 19
    .line 20
    if-ne v7, v2, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Ljava/lang/Long;

    .line 34
    .line 35
    invoke-direct {p1, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 36
    .line 37
    .line 38
    iput-object v3, p0, La/yau;->k:La/kmq;

    .line 39
    .line 40
    iput-wide v4, p0, La/yau;->l:J

    .line 41
    .line 42
    iput-boolean v2, p0, La/yau;->j:Z

    .line 43
    .line 44
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    if-ne p0, v6, :cond_2

    .line 49
    .line 50
    move-object v3, v6

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    :goto_0
    const-wide/16 p0, 0x0

    .line 53
    .line 54
    cmp-long p0, v4, p0

    .line 55
    .line 56
    if-ltz p0, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 v2, 0x0

    .line 60
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    :goto_2
    return-object v3

    .line 65
    :pswitch_0
    iget-object v0, p0, La/yau;->k:La/kmq;

    .line 66
    .line 67
    sget-object v4, La/wne;->a:La/wne;

    .line 68
    .line 69
    iget-boolean v5, p0, La/yau;->j:Z

    .line 70
    .line 71
    if-eqz v5, :cond_5

    .line 72
    .line 73
    if-ne v5, v2, :cond_4

    .line 74
    .line 75
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance p1, La/mi1;

    .line 87
    .line 88
    iget-wide v5, p0, La/yau;->l:J

    .line 89
    .line 90
    sget-object v1, La/iun;->a:La/iun;

    .line 91
    .line 92
    invoke-direct {p1, v5, v6, v1}, La/mi1;-><init>(JLjava/util/List;)V

    .line 93
    .line 94
    .line 95
    iput-object v3, p0, La/yau;->k:La/kmq;

    .line 96
    .line 97
    iput-boolean v2, p0, La/yau;->j:Z

    .line 98
    .line 99
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-ne p0, v4, :cond_6

    .line 104
    .line 105
    move-object v3, v4

    .line 106
    goto :goto_4

    .line 107
    :cond_6
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    :goto_4
    return-object v3

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
