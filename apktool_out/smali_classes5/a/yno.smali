.class public final La/yno;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:J

.field public synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yno;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte p0, p0, La/yno;->i:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    check-cast p3, La/yje;

    .line 16
    .line 17
    new-instance p0, La/yno;

    .line 18
    .line 19
    const/4 p2, 0x2

    .line 20
    invoke-direct {p0, v0, p3, p2}, La/yno;-><init>(ILa/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/yno;->k:Ljava/lang/Object;

    .line 24
    .line 25
    iput-wide v1, p0, La/yno;->j:J

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/yno;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, Ljava/util/Map;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Number;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    check-cast p3, La/yje;

    .line 43
    .line 44
    new-instance p0, La/yno;

    .line 45
    .line 46
    const/4 p2, 0x1

    .line 47
    invoke-direct {p0, v0, p3, p2}, La/yno;-><init>(ILa/yje;B)V

    .line 48
    .line 49
    .line 50
    check-cast p1, Ljava/util/Map;

    .line 51
    .line 52
    iput-object p1, p0, La/yno;->k:Ljava/lang/Object;

    .line 53
    .line 54
    iput-wide v1, p0, La/yno;->j:J

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/yno;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_1
    check-cast p1, La/fs20;

    .line 64
    .line 65
    check-cast p2, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    check-cast p3, La/yje;

    .line 72
    .line 73
    new-instance p0, La/yno;

    .line 74
    .line 75
    const/4 p2, 0x0

    .line 76
    invoke-direct {p0, v0, p3, p2}, La/yno;-><init>(ILa/yje;B)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, La/yno;->k:Ljava/lang/Object;

    .line 80
    .line 81
    iput-wide v1, p0, La/yno;->j:J

    .line 82
    .line 83
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, La/yno;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/yno;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/yno;->k:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    iget-wide v1, p0, La/yno;->j:J

    .line 11
    .line 12
    sget-object p0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p0, La/dxk0;

    .line 18
    .line 19
    invoke-direct {p0, v0, v1, v2}, La/dxk0;-><init>(Ljava/lang/String;J)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iget-object v0, p0, La/yno;->k:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/Map;

    .line 26
    .line 27
    check-cast v0, Ljava/util/Map;

    .line 28
    .line 29
    iget-wide v1, p0, La/yno;->j:J

    .line 30
    .line 31
    sget-object p0, La/wne;->a:La/wne;

    .line 32
    .line 33
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance p0, Ljava/lang/Long;

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/util/Set;

    .line 46
    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    check-cast p0, Ljava/lang/Iterable;

    .line 50
    .line 51
    new-instance p1, La/vvt;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-direct {p1, v0}, La/vvt;-><init>(B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 p0, 0x0

    .line 63
    :goto_0
    if-nez p0, :cond_1

    .line 64
    .line 65
    sget-object p0, La/iun;->a:La/iun;

    .line 66
    .line 67
    :cond_1
    return-object p0

    .line 68
    :pswitch_1
    iget-object v0, p0, La/yno;->k:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La/fs20;

    .line 71
    .line 72
    iget-wide v1, p0, La/yno;->j:J

    .line 73
    .line 74
    sget-object p0, La/wne;->a:La/wne;

    .line 75
    .line 76
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v0}, La/fs20;->a()J

    .line 80
    .line 81
    .line 82
    move-result-wide p0

    .line 83
    new-instance v0, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-direct {v0, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 86
    .line 87
    .line 88
    new-instance p0, Ljava/lang/Long;

    .line 89
    .line 90
    invoke-direct {p0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 91
    .line 92
    .line 93
    new-instance p1, Lkotlin/Pair;

    .line 94
    .line 95
    invoke-direct {p1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-object p1

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
