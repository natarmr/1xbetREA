.class public final La/x1e;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/lang/Object;

.field public j:Ljava/io/Serializable;

.field public k:La/hva0;

.field public l:La/mie0;

.field public m:Lkotlin/coroutines/CoroutineContext;

.field public n:La/mie0;

.field public o:Z

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/a2e;

.field public r:I


# direct methods
.method public constructor <init>(La/a2e;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x1e;->q:La/a2e;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/zje;-><init>(La/yje;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, La/x1e;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/x1e;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/x1e;->r:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/x1e;->q:La/a2e;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, La/a2e;->m(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
