.class public final La/l2c;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/m2c;

.field public final synthetic k:Z

.field public final synthetic l:Z

.field public final synthetic m:J


# direct methods
.method public constructor <init>(JLa/m2c;La/yje;ZZ)V
    .locals 0

    .line 1
    iput-object p3, p0, La/l2c;->j:La/m2c;

    .line 2
    .line 3
    iput-boolean p5, p0, La/l2c;->k:Z

    .line 4
    .line 5
    iput-boolean p6, p0, La/l2c;->l:Z

    .line 6
    .line 7
    iput-wide p1, p0, La/l2c;->m:J

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/l2c;

    .line 2
    .line 3
    iget-boolean v6, p0, La/l2c;->l:Z

    .line 4
    .line 5
    iget-wide v1, p0, La/l2c;->m:J

    .line 6
    .line 7
    iget-object v3, p0, La/l2c;->j:La/m2c;

    .line 8
    .line 9
    iget-boolean v5, p0, La/l2c;->k:Z

    .line 10
    .line 11
    move-object v4, p2

    .line 12
    invoke-direct/range {v0 .. v6}, La/l2c;-><init>(JLa/m2c;La/yje;ZZ)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    check-cast p2, La/yje;

    .line 8
    .line 9
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, La/l2c;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/l2c;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/l2c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/l2c;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v6, p0, La/l2c;->j:La/m2c;

    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v3, La/e2c;

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    iget-wide v4, p0, La/l2c;->m:J

    .line 33
    .line 34
    iget-boolean v8, p0, La/l2c;->k:Z

    .line 35
    .line 36
    iget-boolean v9, p0, La/l2c;->l:Z

    .line 37
    .line 38
    invoke-direct/range {v3 .. v9}, La/e2c;-><init>(JLa/m2c;La/yje;ZZ)V

    .line 39
    .line 40
    .line 41
    new-instance v4, La/vsg0;

    .line 42
    .line 43
    invoke-direct {v4, v3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 44
    .line 45
    .line 46
    const-class p1, La/oqt0;

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    const/4 v11, 0x0

    .line 53
    const/16 v12, 0x30

    .line 54
    .line 55
    const-string v5, ""

    .line 56
    .line 57
    const/4 v6, 0x5

    .line 58
    const-wide/16 v7, 0x5

    .line 59
    .line 60
    const/4 v10, 0x0

    .line 61
    invoke-static/range {v4 .. v12}, La/bkb;->i0(La/gmq;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v1, La/k2c;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-direct {v1, p1, v3}, La/k2c;-><init>(La/a1g;B)V

    .line 69
    .line 70
    .line 71
    iput-boolean v2, p0, La/l2c;->i:Z

    .line 72
    .line 73
    invoke-static {v1, p0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v0, :cond_2

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_2
    return-object p0
.end method
