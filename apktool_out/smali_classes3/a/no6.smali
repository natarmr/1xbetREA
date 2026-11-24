.class public final La/no6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:J

.field public final synthetic k:La/po6;


# direct methods
.method public constructor <init>(La/po6;JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/no6;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/no6;->k:La/po6;

    .line 5
    .line 6
    iput-wide p2, p0, La/no6;->j:J

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

.method public constructor <init>(La/po6;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/no6;->i:B

    .line 13
    iput-object p1, p0, La/no6;->k:La/po6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 4

    .line 1
    iget-byte v0, p0, La/no6;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/no6;->k:La/po6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/no6;

    .line 9
    .line 10
    invoke-direct {p0, v1, p2}, La/no6;-><init>(La/po6;La/yje;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    iput-wide p1, p0, La/no6;->j:J

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    new-instance p1, La/no6;

    .line 23
    .line 24
    iget-wide v2, p0, La/no6;->j:J

    .line 25
    .line 26
    invoke-direct {p1, v1, v2, v3, p2}, La/no6;-><init>(La/po6;JLa/yje;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/no6;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    check-cast p2, La/yje;

    .line 13
    .line 14
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1, p2}, La/no6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/no6;

    .line 23
    .line 24
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/no6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/vne;

    .line 32
    .line 33
    check-cast p2, La/yje;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, La/no6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/no6;

    .line 40
    .line 41
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, La/no6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/no6;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/no6;->k:La/po6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-wide v2, p0, La/no6;->j:J

    .line 9
    .line 10
    sget-object p0, La/wne;->a:La/wne;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 p0, 0x0

    .line 16
    .line 17
    cmp-long p0, v2, p0

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    :goto_0
    invoke-virtual {v1, p0}, La/po6;->A(Z)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 31
    .line 32
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, v1, La/po6;->h:La/dsi0;

    .line 36
    .line 37
    iget-wide v2, p0, La/no6;->j:J

    .line 38
    .line 39
    invoke-virtual {p1, v2, v3}, La/dsi0;->b(J)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object p0, v1, La/po6;->r:La/vn7;

    .line 44
    .line 45
    iget-object p0, p0, La/vn7;->a:La/uzc;

    .line 46
    .line 47
    invoke-virtual {p0}, La/uzc;->a()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    iget-object p0, v1, La/po6;->n:La/x4u;

    .line 52
    .line 53
    invoke-virtual {p0}, La/x4u;->d()Ljava/util/HashMap;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    const/4 v8, 0x0

    .line 58
    iget-object v9, v1, La/po6;->B:La/ctf0;

    .line 59
    .line 60
    move-object v5, v4

    .line 61
    invoke-static/range {v4 .. v9}, La/o050;->L(Ljava/util/List;Ljava/util/List;ZLjava/util/HashMap;ZLa/ctf0;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iget-object v0, v1, La/po6;->R:La/p7m0;

    .line 70
    .line 71
    new-instance v2, La/yv7;

    .line 72
    .line 73
    invoke-virtual {v1}, La/po6;->x()Ljava/util/ArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-direct {v2, p0, p1}, La/yv7;-><init>(Ljava/util/ArrayList;Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    invoke-virtual {v0, p0, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
