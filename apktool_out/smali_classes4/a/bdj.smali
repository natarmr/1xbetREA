.class public final synthetic La/bdj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/kwj;

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:La/vne;

.field public final synthetic e:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/kwj;ZILa/vne;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bdj;->a:La/kwj;

    iput-boolean p2, p0, La/bdj;->b:Z

    iput p3, p0, La/bdj;->c:I

    iput-object p4, p0, La/bdj;->d:La/vne;

    iput-object p5, p0, La/bdj;->e:La/pz40;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/bdj;->a:La/kwj;

    .line 2
    .line 3
    invoke-virtual {v0}, La/xk80;->k()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, La/bdj;->b:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/xk80;->k()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    sub-int/2addr v1, v2

    .line 19
    iget v3, p0, La/bdj;->c:I

    .line 20
    .line 21
    add-int/2addr v1, v3

    .line 22
    invoke-static {v1}, La/bsr0;->d0(I)La/w2w0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v3, p0, La/bdj;->e:La/pz40;

    .line 27
    .line 28
    invoke-interface {v3, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, La/p1j;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v1, v0, v3, v2}, La/p1j;-><init>(La/kwj;La/yje;B)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    iget-object p0, p0, La/bdj;->d:La/vne;

    .line 39
    .line 40
    invoke-static {p0, v3, v3, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0
.end method
