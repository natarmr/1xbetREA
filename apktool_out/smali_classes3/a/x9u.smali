.class public final La/x9u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/a6u;

.field public final synthetic k:La/c3c0;

.field public final synthetic l:J

.field public final synthetic m:Z

.field public final synthetic n:Z

.field public final synthetic o:La/c3c0;


# direct methods
.method public constructor <init>(La/a6u;La/c3c0;JZZLa/c3c0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x9u;->j:La/a6u;

    .line 2
    .line 3
    iput-object p2, p0, La/x9u;->k:La/c3c0;

    .line 4
    .line 5
    iput-wide p3, p0, La/x9u;->l:J

    .line 6
    .line 7
    iput-boolean p5, p0, La/x9u;->m:Z

    .line 8
    .line 9
    iput-boolean p6, p0, La/x9u;->n:Z

    .line 10
    .line 11
    iput-object p7, p0, La/x9u;->o:La/c3c0;

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
    new-instance v0, La/x9u;

    .line 2
    .line 3
    iget-boolean v6, p0, La/x9u;->n:Z

    .line 4
    .line 5
    iget-object v7, p0, La/x9u;->o:La/c3c0;

    .line 6
    .line 7
    iget-object v1, p0, La/x9u;->j:La/a6u;

    .line 8
    .line 9
    iget-object v2, p0, La/x9u;->k:La/c3c0;

    .line 10
    .line 11
    iget-wide v3, p0, La/x9u;->l:J

    .line 12
    .line 13
    iget-boolean v5, p0, La/x9u;->m:Z

    .line 14
    .line 15
    move-object v8, p2

    .line 16
    invoke-direct/range {v0 .. v8}, La/x9u;-><init>(La/a6u;La/c3c0;JZZLa/c3c0;La/yje;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/x9u;->i:Ljava/lang/Object;

    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/x9u;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/x9u;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/x9u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, La/x9u;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/vne;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, La/w9u;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v3, p0, La/x9u;->j:La/a6u;

    .line 14
    .line 15
    iget-wide v4, p0, La/x9u;->l:J

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    invoke-direct/range {v2 .. v7}, La/w9u;-><init>(La/a6u;JLa/yje;B)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    invoke-static {v0, v6, v2, p1}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v8, La/w9u;

    .line 27
    .line 28
    const/4 v13, 0x1

    .line 29
    move-object v9, v3

    .line 30
    move-wide v10, v4

    .line 31
    move-object v12, v6

    .line 32
    invoke-direct/range {v8 .. v13}, La/w9u;-><init>(La/a6u;JLa/yje;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v6, v8, p1}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    sget-object v8, La/sip;->c:La/sip;

    .line 40
    .line 41
    iget-boolean v12, p0, La/x9u;->m:Z

    .line 42
    .line 43
    iget-boolean v13, p0, La/x9u;->n:Z

    .line 44
    .line 45
    iget-object v7, p0, La/x9u;->j:La/a6u;

    .line 46
    .line 47
    iget-object v9, p0, La/x9u;->k:La/c3c0;

    .line 48
    .line 49
    iget-wide v10, p0, La/x9u;->l:J

    .line 50
    .line 51
    invoke-virtual/range {v7 .. v13}, La/a6u;->h(La/sip;La/c3c0;JZZ)La/dnq;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v8, La/sip;->b:La/sip;

    .line 56
    .line 57
    iget-boolean v12, p0, La/x9u;->m:Z

    .line 58
    .line 59
    iget-boolean v13, p0, La/x9u;->n:Z

    .line 60
    .line 61
    iget-object v7, p0, La/x9u;->j:La/a6u;

    .line 62
    .line 63
    iget-object v9, p0, La/x9u;->o:La/c3c0;

    .line 64
    .line 65
    iget-wide v10, p0, La/x9u;->l:J

    .line 66
    .line 67
    invoke-virtual/range {v7 .. v13}, La/a6u;->h(La/sip;La/c3c0;JZZ)La/dnq;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    new-instance v2, La/ymq;

    .line 72
    .line 73
    const/4 v3, 0x1

    .line 74
    invoke-direct {v2, v1, p1, v6, v3}, La/ymq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 75
    .line 76
    .line 77
    new-instance p1, La/p6d;

    .line 78
    .line 79
    invoke-direct {p1, v0, p0, v2, v3}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 80
    .line 81
    .line 82
    return-object p1
.end method
