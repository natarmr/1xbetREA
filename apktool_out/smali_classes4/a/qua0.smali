.class public final La/qua0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:La/ygs;

.field public j:Z

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:La/rua0;

.field public final synthetic m:J

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:J

.field public final synthetic p:J


# direct methods
.method public constructor <init>(Ljava/util/List;La/rua0;JLjava/lang/String;JJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qua0;->k:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, La/qua0;->l:La/rua0;

    .line 4
    .line 5
    iput-wide p3, p0, La/qua0;->m:J

    .line 6
    .line 7
    iput-object p5, p0, La/qua0;->n:Ljava/lang/String;

    .line 8
    .line 9
    iput-wide p6, p0, La/qua0;->o:J

    .line 10
    .line 11
    iput-wide p8, p0, La/qua0;->p:J

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 11

    .line 1
    new-instance v0, La/qua0;

    .line 2
    .line 3
    iget-wide v6, p0, La/qua0;->o:J

    .line 4
    .line 5
    iget-wide v8, p0, La/qua0;->p:J

    .line 6
    .line 7
    iget-object v1, p0, La/qua0;->k:Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, p0, La/qua0;->l:La/rua0;

    .line 10
    .line 11
    iget-wide v3, p0, La/qua0;->m:J

    .line 12
    .line 13
    iget-object v5, p0, La/qua0;->n:Ljava/lang/String;

    .line 14
    .line 15
    move-object v10, p1

    .line 16
    invoke-direct/range {v0 .. v10}, La/qua0;-><init>(Ljava/util/List;La/rua0;JLjava/lang/String;JJLa/yje;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/qua0;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qua0;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/qua0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/qua0;->j:Z

    .line 4
    .line 5
    iget-object v3, p0, La/qua0;->l:La/rua0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, La/qua0;->i:La/ygs;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    move-object v7, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, La/qua0;->k:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/ygs;

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-ne p1, v2, :cond_3

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    iget-object p1, v3, La/rua0;->u:La/h3c;

    .line 46
    .line 47
    iget-wide v4, v1, La/ygs;->d:J

    .line 48
    .line 49
    iput-object v1, p0, La/qua0;->i:La/ygs;

    .line 50
    .line 51
    iput-boolean v2, p0, La/qua0;->j:Z

    .line 52
    .line 53
    invoke-virtual {p1, v4, v5, p0}, La/h3c;->b(JLa/yje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v0, :cond_2

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_2
    move-object v7, v1

    .line 61
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    iget-object p1, v3, La/rua0;->v:La/i1w0;

    .line 68
    .line 69
    new-instance v2, La/q71;

    .line 70
    .line 71
    move-object v6, v3

    .line 72
    const/4 v3, 0x6

    .line 73
    iget-wide v4, p0, La/qua0;->m:J

    .line 74
    .line 75
    invoke-direct/range {v2 .. v8}, La/q71;-><init>(BJLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move-object v6, v3

    .line 83
    iget-object p1, v6, La/rua0;->v:La/i1w0;

    .line 84
    .line 85
    new-instance v2, La/zm8;

    .line 86
    .line 87
    const/4 v9, 0x2

    .line 88
    iget-object v4, p0, La/qua0;->n:Ljava/lang/String;

    .line 89
    .line 90
    move-object v3, v6

    .line 91
    iget-wide v5, p0, La/qua0;->o:J

    .line 92
    .line 93
    iget-wide v7, p0, La/qua0;->p:J

    .line 94
    .line 95
    invoke-direct/range {v2 .. v9}, La/zm8;-><init>(La/i3t0;Ljava/lang/Object;JJB)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 99
    .line 100
    .line 101
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0
.end method
