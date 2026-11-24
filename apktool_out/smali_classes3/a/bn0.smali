.class public final La/bn0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/dn0;

.field public final synthetic k:J

.field public final synthetic l:I

.field public final synthetic m:La/lu0;


# direct methods
.method public constructor <init>(La/dn0;JILa/lu0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/bn0;->j:La/dn0;

    .line 2
    .line 3
    iput-wide p2, p0, La/bn0;->k:J

    .line 4
    .line 5
    iput p4, p0, La/bn0;->l:I

    .line 6
    .line 7
    iput-object p5, p0, La/bn0;->m:La/lu0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/bn0;

    .line 2
    .line 3
    iget v4, p0, La/bn0;->l:I

    .line 4
    .line 5
    iget-object v5, p0, La/bn0;->m:La/lu0;

    .line 6
    .line 7
    iget-object v1, p0, La/bn0;->j:La/dn0;

    .line 8
    .line 9
    iget-wide v2, p0, La/bn0;->k:J

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, La/bn0;-><init>(La/dn0;JILa/lu0;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, La/bn0;->i:Ljava/lang/Object;

    .line 16
    .line 17
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
    invoke-virtual {p0, p1, p2}, La/bn0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/bn0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/bn0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/bn0;->i:Ljava/lang/Object;

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
    new-instance v2, La/an0;

    .line 11
    .line 12
    iget-object v7, p0, La/bn0;->m:La/lu0;

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    iget-object v3, p0, La/bn0;->j:La/dn0;

    .line 16
    .line 17
    iget-wide v4, p0, La/bn0;->k:J

    .line 18
    .line 19
    iget v6, p0, La/bn0;->l:I

    .line 20
    .line 21
    invoke-direct/range {v2 .. v8}, La/an0;-><init>(La/dn0;JILa/lu0;La/yje;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x3

    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-static {v0, p1, p1, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance p1, La/fm0;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-direct {p1, v3, v0}, La/fm0;-><init>(La/dn0;B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 37
    .line 38
    .line 39
    return-object p0
.end method
