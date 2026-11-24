.class public final La/xxt;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/mie0;

.field public j:Z

.field public final synthetic k:La/mie0;

.field public final synthetic l:La/cmt;

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:J

.field public final synthetic o:J

.field public final synthetic p:I


# direct methods
.method public constructor <init>(La/mie0;La/cmt;Ljava/util/List;JJILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/xxt;->k:La/mie0;

    .line 2
    .line 3
    iput-object p2, p0, La/xxt;->l:La/cmt;

    .line 4
    .line 5
    iput-object p3, p0, La/xxt;->m:Ljava/util/List;

    .line 6
    .line 7
    iput-wide p4, p0, La/xxt;->n:J

    .line 8
    .line 9
    iput-wide p6, p0, La/xxt;->o:J

    .line 10
    .line 11
    iput p8, p0, La/xxt;->p:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/xxt;

    .line 2
    .line 3
    iget-wide v6, p0, La/xxt;->o:J

    .line 4
    .line 5
    iget v8, p0, La/xxt;->p:I

    .line 6
    .line 7
    iget-object v1, p0, La/xxt;->k:La/mie0;

    .line 8
    .line 9
    iget-object v2, p0, La/xxt;->l:La/cmt;

    .line 10
    .line 11
    iget-object v3, p0, La/xxt;->m:Ljava/util/List;

    .line 12
    .line 13
    iget-wide v4, p0, La/xxt;->n:J

    .line 14
    .line 15
    move-object v9, p2

    .line 16
    invoke-direct/range {v0 .. v9}, La/xxt;-><init>(La/mie0;La/cmt;Ljava/util/List;JJILa/yje;)V

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
    invoke-virtual {p0, p1, p2}, La/xxt;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/xxt;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/xxt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/xxt;->j:Z

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
    iget-object p0, p0, La/xxt;->i:La/mie0;

    .line 11
    .line 12
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, La/xxt;->l:La/cmt;

    .line 27
    .line 28
    iget-object p1, p1, La/cmt;->b:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v3, p1

    .line 31
    check-cast v3, La/oif0;

    .line 32
    .line 33
    iget-object p1, p0, La/xxt;->k:La/mie0;

    .line 34
    .line 35
    iput-object p1, p0, La/xxt;->i:La/mie0;

    .line 36
    .line 37
    iput-boolean v2, p0, La/xxt;->j:Z

    .line 38
    .line 39
    iget-object v4, p0, La/xxt;->m:Ljava/util/List;

    .line 40
    .line 41
    iget-wide v5, p0, La/xxt;->n:J

    .line 42
    .line 43
    iget-wide v7, p0, La/xxt;->o:J

    .line 44
    .line 45
    iget v9, p0, La/xxt;->p:I

    .line 46
    .line 47
    move-object v10, p0

    .line 48
    invoke-virtual/range {v3 .. v10}, La/oif0;->p(Ljava/util/List;JJILa/zje;)Ljava/io/Serializable;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    move-object v11, p1

    .line 56
    move-object p1, p0

    .line 57
    move-object p0, v11

    .line 58
    :goto_0
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0
.end method
