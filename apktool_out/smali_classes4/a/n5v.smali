.class public final La/n5v;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:La/dgu;

.field public final synthetic l:Z

.field public final synthetic m:I

.field public final synthetic n:J

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;La/dgu;ZIJLjava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/n5v;->j:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, La/n5v;->k:La/dgu;

    .line 4
    .line 5
    iput-boolean p3, p0, La/n5v;->l:Z

    .line 6
    .line 7
    iput p4, p0, La/n5v;->m:I

    .line 8
    .line 9
    iput-wide p5, p0, La/n5v;->n:J

    .line 10
    .line 11
    iput-object p7, p0, La/n5v;->o:Ljava/lang/String;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/n5v;

    .line 2
    .line 3
    iget-wide v5, p0, La/n5v;->n:J

    .line 4
    .line 5
    iget-object v7, p0, La/n5v;->o:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, La/n5v;->j:Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, p0, La/n5v;->k:La/dgu;

    .line 10
    .line 11
    iget-boolean v3, p0, La/n5v;->l:Z

    .line 12
    .line 13
    iget v4, p0, La/n5v;->m:I

    .line 14
    .line 15
    move-object v8, p2

    .line 16
    invoke-direct/range {v0 .. v8}, La/n5v;-><init>(Ljava/util/List;La/dgu;ZIJLjava/lang/String;La/yje;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/n5v;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/n5v;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/n5v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/n5v;->i:Z

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
    goto :goto_0

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
    move p1, v2

    .line 25
    iget-object v2, p0, La/n5v;->j:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    sget-object p0, La/iun;->a:La/iun;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    iget-object v1, p0, La/n5v;->k:La/dgu;

    .line 37
    .line 38
    iget-object v1, v1, La/dgu;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, La/wdu;

    .line 41
    .line 42
    iput-boolean p1, p0, La/n5v;->i:Z

    .line 43
    .line 44
    sget-object v7, La/j8p;->d:La/j8p;

    .line 45
    .line 46
    iget-boolean v3, p0, La/n5v;->l:Z

    .line 47
    .line 48
    iget v4, p0, La/n5v;->m:I

    .line 49
    .line 50
    iget-wide v5, p0, La/n5v;->n:J

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    iget-object v9, p0, La/n5v;->o:Ljava/lang/String;

    .line 54
    .line 55
    move-object v10, p0

    .line 56
    invoke-virtual/range {v1 .. v10}, La/wdu;->j(Ljava/util/List;ZIJLa/j8p;ZLjava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_3

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_3
    :goto_0
    check-cast p1, Ljava/util/List;

    .line 64
    .line 65
    return-object p1
.end method
