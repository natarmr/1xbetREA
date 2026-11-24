.class public final La/c06;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/d06;

.field public final synthetic k:Z

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:J

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:D

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Z


# direct methods
.method public constructor <init>(La/d06;ZLjava/lang/String;JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/c06;->j:La/d06;

    .line 2
    .line 3
    iput-boolean p2, p0, La/c06;->k:Z

    .line 4
    .line 5
    iput-object p3, p0, La/c06;->l:Ljava/lang/String;

    .line 6
    .line 7
    iput-wide p4, p0, La/c06;->m:J

    .line 8
    .line 9
    iput-object p6, p0, La/c06;->n:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p7, p0, La/c06;->o:D

    .line 12
    .line 13
    iput-object p9, p0, La/c06;->p:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p10, p0, La/c06;->q:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p11, p0, La/c06;->r:Ljava/lang/String;

    .line 18
    .line 19
    iput-boolean p12, p0, La/c06;->s:Z

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p13}, La/bnn0;-><init>(ILa/yje;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 14

    .line 1
    new-instance v0, La/c06;

    .line 2
    .line 3
    iget-object v11, p0, La/c06;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v12, p0, La/c06;->s:Z

    .line 6
    .line 7
    iget-object v1, p0, La/c06;->j:La/d06;

    .line 8
    .line 9
    iget-boolean v2, p0, La/c06;->k:Z

    .line 10
    .line 11
    iget-object v3, p0, La/c06;->l:Ljava/lang/String;

    .line 12
    .line 13
    iget-wide v4, p0, La/c06;->m:J

    .line 14
    .line 15
    iget-object v6, p0, La/c06;->n:Ljava/lang/String;

    .line 16
    .line 17
    iget-wide v7, p0, La/c06;->o:D

    .line 18
    .line 19
    iget-object v9, p0, La/c06;->p:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v10, p0, La/c06;->q:Ljava/lang/String;

    .line 22
    .line 23
    move-object/from16 v13, p2

    .line 24
    .line 25
    invoke-direct/range {v0 .. v13}, La/c06;-><init>(La/d06;ZLjava/lang/String;JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/yje;)V

    .line 26
    .line 27
    .line 28
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
    invoke-virtual {p0, p1, p2}, La/c06;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/c06;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c06;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/c06;->i:Z

    .line 6
    .line 7
    iget-object v3, v0, La/c06;->j:La/d06;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    if-ne v2, v4, :cond_0

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0

    .line 25
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v3, La/d06;->n:La/m1u;

    .line 29
    .line 30
    new-instance v5, La/ehn0;

    .line 31
    .line 32
    iget-object v15, v0, La/c06;->r:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v6, v0, La/c06;->s:Z

    .line 35
    .line 36
    move/from16 v16, v6

    .line 37
    .line 38
    iget-boolean v6, v0, La/c06;->k:Z

    .line 39
    .line 40
    iget-object v7, v0, La/c06;->l:Ljava/lang/String;

    .line 41
    .line 42
    iget-wide v8, v0, La/c06;->m:J

    .line 43
    .line 44
    iget-object v10, v0, La/c06;->n:Ljava/lang/String;

    .line 45
    .line 46
    iget-wide v11, v0, La/c06;->o:D

    .line 47
    .line 48
    iget-object v13, v0, La/c06;->p:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v14, v0, La/c06;->q:Ljava/lang/String;

    .line 51
    .line 52
    invoke-direct/range {v5 .. v16}, La/ehn0;-><init>(ZLjava/lang/String;JLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    iput-boolean v4, v0, La/c06;->i:Z

    .line 56
    .line 57
    invoke-virtual {v2, v5, v0}, La/m1u;->a(La/ehn0;La/bnn0;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-ne v0, v1, :cond_2

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_2
    :goto_0
    iget-object v0, v3, La/d06;->o:La/ol60;

    .line 65
    .line 66
    sget-object v1, La/j320;->a:La/j320;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0
.end method
