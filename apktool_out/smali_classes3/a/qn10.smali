.class public final synthetic La/qn10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bo10;


# direct methods
.method public synthetic constructor <init>(La/bo10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qn10;->a:B

    iput-object p1, p0, La/qn10;->b:La/bo10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/qn10;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/qn10;->b:La/bo10;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Throwable;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/bo10;->Q:La/c8h0;

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, La/bo10;->A(La/c8h0;Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/bo10;->w(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v2

    .line 31
    const-wide/32 v4, 0x36ee80

    .line 32
    .line 33
    .line 34
    div-long v7, v2, v4

    .line 35
    .line 36
    sget-object p1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    .line 37
    .line 38
    invoke-virtual {p1, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    sub-long/2addr v2, v4

    .line 43
    const-wide/32 v4, 0xea60

    .line 44
    .line 45
    .line 46
    div-long v9, v2, v4

    .line 47
    .line 48
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 49
    .line 50
    invoke-virtual {p1, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    sub-long/2addr v2, v4

    .line 55
    const-wide/16 v4, 0x3e8

    .line 56
    .line 57
    div-long v11, v2, v4

    .line 58
    .line 59
    new-instance v6, La/xmq0;

    .line 60
    .line 61
    invoke-direct/range {v6 .. v12}, La/xmq0;-><init>(JJJ)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, La/bo10;->y:La/p7m0;

    .line 65
    .line 66
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    move-object p1, p0

    .line 71
    check-cast p1, La/snq0;

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-static {p1, v2, v6, v1}, La/snq0;->a(La/snq0;La/c8h0;La/xmq0;I)La/snq0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_0

    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, La/bo10;->Q:La/c8h0;

    .line 93
    .line 94
    invoke-virtual {p0, v0, v1}, La/bo10;->A(La/c8h0;Z)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p1}, La/bo10;->w(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, La/bo10;->w(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
