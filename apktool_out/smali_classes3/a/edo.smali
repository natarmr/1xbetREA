.class public final La/edo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mne;

.field public final b:La/wco;


# direct methods
.method public constructor <init>(La/mne;La/ddk;La/xak;La/wco;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/edo;->a:La/mne;

    .line 8
    .line 9
    iput-object p4, p0, La/edo;->b:La/wco;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/yco;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/yco;

    .line 7
    .line 8
    iget v1, v0, La/yco;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/yco;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/yco;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/yco;-><init>(La/edo;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/yco;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/yco;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v4, v0, La/yco;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/edo;->b:La/wco;

    .line 53
    .line 54
    iget-object p0, p0, La/wco;->b:La/n0o0;

    .line 55
    .line 56
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/qco;

    .line 61
    .line 62
    iget-object p0, p0, La/qco;->a:La/zdg0;

    .line 63
    .line 64
    new-instance p3, La/hu6;

    .line 65
    .line 66
    const/4 v2, 0x6

    .line 67
    invoke-direct {p3, p1, p2, v3, v2}, La/hu6;-><init>(JLa/yje;B)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    invoke-static {v0, p0, p3, v4, p1}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    if-ne p3, v1, :cond_3

    .line 76
    .line 77
    return-object v1

    .line 78
    :cond_3
    :goto_1
    check-cast p3, La/rco;

    .line 79
    .line 80
    if-eqz p3, :cond_4

    .line 81
    .line 82
    invoke-static {p3}, La/ddk;->s(La/rco;)La/xco;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_4
    return-object v3
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/edo;->a:La/mne;

    .line 2
    .line 3
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 4
    .line 5
    new-instance v1, La/zco;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v2, v3}, La/zco;-><init>(La/edo;La/yje;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final c()La/eu4;
    .locals 6

    .line 1
    iget-object v0, p0, La/edo;->b:La/wco;

    .line 2
    .line 3
    iget-object v0, v0, La/wco;->b:La/n0o0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, La/qco;

    .line 10
    .line 11
    iget-object v0, v0, La/qco;->a:La/zdg0;

    .line 12
    .line 13
    const-string v1, "event_groups"

    .line 14
    .line 15
    filled-new-array {v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, La/f1e;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    const/16 v4, 0x19

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v2, v3, v5, v4}, La/f1e;-><init>(ILa/yje;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/wwb;->C(La/zdg0;[Ljava/lang/String;Lkotlin/jvm/functions/Function2;)La/zj2;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/a1g;

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    invoke-direct {v1, v0, p0, v2}, La/a1g;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/eu4;

    .line 39
    .line 40
    const/4 v0, 0x7

    .line 41
    invoke-direct {p0, v1, v0}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    return-object p0
.end method

.method public final d(Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La/xco;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v2, La/rco;

    .line 32
    .line 33
    iget-wide v3, v1, La/xco;->a:J

    .line 34
    .line 35
    iget-object v9, v1, La/xco;->b:Ljava/lang/String;

    .line 36
    .line 37
    iget-wide v5, v1, La/xco;->c:J

    .line 38
    .line 39
    iget-wide v7, v1, La/xco;->d:J

    .line 40
    .line 41
    iget-boolean v10, v1, La/xco;->e:Z

    .line 42
    .line 43
    invoke-direct/range {v2 .. v10}, La/rco;-><init>(JJJLjava/lang/String;Z)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object p0, p0, La/edo;->b:La/wco;

    .line 51
    .line 52
    iget-object p0, p0, La/wco;->b:La/n0o0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/qco;

    .line 59
    .line 60
    iget-object p1, p0, La/qco;->a:La/zdg0;

    .line 61
    .line 62
    new-instance v1, La/ofl;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    const/16 v3, 0xd

    .line 66
    .line 67
    invoke-direct {v1, p0, v0, v2, v3}, La/ofl;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    const/4 v0, 0x1

    .line 72
    invoke-static {p2, p1, v1, p0, v0}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    sget-object p1, La/wne;->a:La/wne;

    .line 77
    .line 78
    if-ne p0, p1, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_1
    if-ne p0, p1, :cond_2

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    :goto_2
    if-ne p0, p1, :cond_3

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0
.end method
