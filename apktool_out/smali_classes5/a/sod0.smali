.class public final La/sod0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:Z

.field public final synthetic j:La/tod0;

.field public final synthetic k:D

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLa/tod0;DLjava/lang/String;La/yje;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/sod0;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, La/sod0;->j:La/tod0;

    .line 4
    .line 5
    iput-wide p3, p0, La/sod0;->k:D

    .line 6
    .line 7
    iput-object p5, p0, La/sod0;->l:Ljava/lang/String;

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
    new-instance v0, La/sod0;

    .line 2
    .line 3
    iget-wide v3, p0, La/sod0;->k:D

    .line 4
    .line 5
    iget-object v5, p0, La/sod0;->l:Ljava/lang/String;

    .line 6
    .line 7
    iget-boolean v1, p0, La/sod0;->i:Z

    .line 8
    .line 9
    iget-object v2, p0, La/sod0;->j:La/tod0;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, La/sod0;-><init>(ZLa/tod0;DLjava/lang/String;La/yje;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, La/sod0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/sod0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/sod0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/sod0;->j:La/tod0;

    .line 7
    .line 8
    iget-object p1, p1, La/tod0;->n:La/ol60;

    .line 9
    .line 10
    iget-boolean v0, p0, La/sod0;->i:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object p0, La/fod0;->a:La/fod0;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/god0;

    .line 21
    .line 22
    iget-wide v1, p0, La/sod0;->k:D

    .line 23
    .line 24
    iget-object p0, p0, La/sod0;->l:Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {v0, p0, v1, v2}, La/god0;-><init>(Ljava/lang/String;D)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
