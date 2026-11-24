.class public final La/c3g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public final synthetic j:La/f3g;

.field public final synthetic k:La/pz40;

.field public final synthetic l:La/pz40;

.field public final synthetic m:La/pz40;

.field public final synthetic n:Z

.field public final synthetic o:La/x3m;

.field public final synthetic p:La/pz40;

.field public final synthetic q:Z

.field public final synthetic r:La/pz40;


# direct methods
.method public constructor <init>(La/f3g;La/pz40;La/pz40;La/pz40;ZLa/x3m;La/pz40;ZLa/pz40;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/c3g;->j:La/f3g;

    .line 2
    .line 3
    iput-object p2, p0, La/c3g;->k:La/pz40;

    .line 4
    .line 5
    iput-object p3, p0, La/c3g;->l:La/pz40;

    .line 6
    .line 7
    iput-object p4, p0, La/c3g;->m:La/pz40;

    .line 8
    .line 9
    iput-boolean p5, p0, La/c3g;->n:Z

    .line 10
    .line 11
    iput-object p6, p0, La/c3g;->o:La/x3m;

    .line 12
    .line 13
    iput-object p7, p0, La/c3g;->p:La/pz40;

    .line 14
    .line 15
    iput-boolean p8, p0, La/c3g;->q:Z

    .line 16
    .line 17
    iput-object p9, p0, La/c3g;->r:La/pz40;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1, p10}, La/bnn0;-><init>(ILa/yje;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    new-instance v0, La/c3g;

    .line 2
    .line 3
    iget-boolean v8, p0, La/c3g;->q:Z

    .line 4
    .line 5
    iget-object v9, p0, La/c3g;->r:La/pz40;

    .line 6
    .line 7
    iget-object v1, p0, La/c3g;->j:La/f3g;

    .line 8
    .line 9
    iget-object v2, p0, La/c3g;->k:La/pz40;

    .line 10
    .line 11
    iget-object v3, p0, La/c3g;->l:La/pz40;

    .line 12
    .line 13
    iget-object v4, p0, La/c3g;->m:La/pz40;

    .line 14
    .line 15
    iget-boolean v5, p0, La/c3g;->n:Z

    .line 16
    .line 17
    iget-object v6, p0, La/c3g;->o:La/x3m;

    .line 18
    .line 19
    iget-object v7, p0, La/c3g;->p:La/pz40;

    .line 20
    .line 21
    move-object v10, p2

    .line 22
    invoke-direct/range {v0 .. v10}, La/c3g;-><init>(La/f3g;La/pz40;La/pz40;La/pz40;ZLa/x3m;La/pz40;ZLa/pz40;La/yje;)V

    .line 23
    .line 24
    .line 25
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
    invoke-virtual {p0, p1, p2}, La/c3g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/c3g;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/c3g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-boolean v1, p0, La/c3g;->i:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v5, La/hie0;

    .line 25
    .line 26
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, La/c3g;->j:La/f3g;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget-object p1, p1, La/f3g;->a:La/y3m;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object p1, v2

    .line 37
    :goto_0
    if-eqz p1, :cond_3

    .line 38
    .line 39
    move p1, v3

    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const/4 p1, 0x0

    .line 42
    :goto_1
    iput-boolean p1, v5, La/hie0;->a:Z

    .line 43
    .line 44
    new-instance p1, La/kk0;

    .line 45
    .line 46
    const/16 v1, 0x17

    .line 47
    .line 48
    iget-object v4, p0, La/c3g;->k:La/pz40;

    .line 49
    .line 50
    iget-object v6, p0, La/c3g;->l:La/pz40;

    .line 51
    .line 52
    iget-object v7, p0, La/c3g;->m:La/pz40;

    .line 53
    .line 54
    invoke-direct {p1, v4, v6, v7, v1}, La/kk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance v4, La/b3g;

    .line 62
    .line 63
    iget-boolean v9, p0, La/c3g;->q:Z

    .line 64
    .line 65
    iget-object v10, p0, La/c3g;->r:La/pz40;

    .line 66
    .line 67
    iget-boolean v6, p0, La/c3g;->n:Z

    .line 68
    .line 69
    iget-object v7, p0, La/c3g;->o:La/x3m;

    .line 70
    .line 71
    iget-object v8, p0, La/c3g;->p:La/pz40;

    .line 72
    .line 73
    invoke-direct/range {v4 .. v10}, La/b3g;-><init>(La/hie0;ZLa/x3m;La/pz40;ZLa/pz40;)V

    .line 74
    .line 75
    .line 76
    iput-boolean v3, p0, La/c3g;->i:Z

    .line 77
    .line 78
    invoke-virtual {p1, v4, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, v0, :cond_4

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_4
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0
.end method
