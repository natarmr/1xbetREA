.class public final La/vq0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/jr0;

.field public final synthetic k:J

.field public final synthetic l:Z

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Z

.field public final synthetic s:Z

.field public final synthetic t:Z


# direct methods
.method public constructor <init>(La/jr0;JZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vq0;->j:La/jr0;

    .line 2
    .line 3
    iput-wide p2, p0, La/vq0;->k:J

    .line 4
    .line 5
    iput-boolean p4, p0, La/vq0;->l:Z

    .line 6
    .line 7
    iput p5, p0, La/vq0;->m:I

    .line 8
    .line 9
    iput p6, p0, La/vq0;->n:I

    .line 10
    .line 11
    iput-object p7, p0, La/vq0;->o:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p8, p0, La/vq0;->p:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p9, p0, La/vq0;->q:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean p10, p0, La/vq0;->r:Z

    .line 18
    .line 19
    iput-boolean p11, p0, La/vq0;->s:Z

    .line 20
    .line 21
    iput-boolean p12, p0, La/vq0;->t:Z

    .line 22
    .line 23
    const/4 p1, 0x2

    .line 24
    invoke-direct {p0, p1, p13}, La/bnn0;-><init>(ILa/yje;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 14

    .line 1
    new-instance v0, La/vq0;

    .line 2
    .line 3
    iget-boolean v11, p0, La/vq0;->s:Z

    .line 4
    .line 5
    iget-boolean v12, p0, La/vq0;->t:Z

    .line 6
    .line 7
    iget-object v1, p0, La/vq0;->j:La/jr0;

    .line 8
    .line 9
    iget-wide v2, p0, La/vq0;->k:J

    .line 10
    .line 11
    iget-boolean v4, p0, La/vq0;->l:Z

    .line 12
    .line 13
    iget v5, p0, La/vq0;->m:I

    .line 14
    .line 15
    iget v6, p0, La/vq0;->n:I

    .line 16
    .line 17
    iget-object v7, p0, La/vq0;->o:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v8, p0, La/vq0;->p:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v9, p0, La/vq0;->q:Ljava/lang/String;

    .line 22
    .line 23
    iget-boolean v10, p0, La/vq0;->r:Z

    .line 24
    .line 25
    move-object/from16 v13, p2

    .line 26
    .line 27
    invoke-direct/range {v0 .. v13}, La/vq0;-><init>(La/jr0;JZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLa/yje;)V

    .line 28
    .line 29
    .line 30
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
    invoke-virtual {p0, p1, p2}, La/vq0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/vq0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/vq0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-boolean v1, p0, La/vq0;->i:Z

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
    iput-boolean v2, p0, La/vq0;->i:Z

    .line 25
    .line 26
    iget-object v1, p0, La/vq0;->j:La/jr0;

    .line 27
    .line 28
    iget-wide v2, p0, La/vq0;->k:J

    .line 29
    .line 30
    iget-boolean v4, p0, La/vq0;->l:Z

    .line 31
    .line 32
    iget v5, p0, La/vq0;->m:I

    .line 33
    .line 34
    iget v6, p0, La/vq0;->n:I

    .line 35
    .line 36
    iget-object v7, p0, La/vq0;->o:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v8, p0, La/vq0;->p:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v9, p0, La/vq0;->q:Ljava/lang/String;

    .line 41
    .line 42
    iget-boolean v10, p0, La/vq0;->r:Z

    .line 43
    .line 44
    iget-boolean v11, p0, La/vq0;->s:Z

    .line 45
    .line 46
    iget-boolean v12, p0, La/vq0;->t:Z

    .line 47
    .line 48
    move-object v13, p0

    .line 49
    invoke-virtual/range {v1 .. v13}, La/jr0;->b(JZIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLa/zje;)Ljava/io/Serializable;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-ne p0, v0, :cond_2

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    return-object p0
.end method
