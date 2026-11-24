.class public final La/w1e;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Z

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:La/mie0;

.field public m:La/mie0;

.field public n:Lkotlin/coroutines/CoroutineContext;

.field public o:La/mie0;

.field public p:La/usd;

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La/z1e;

.field public s:I


# direct methods
.method public constructor <init>(La/z1e;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/w1e;->r:La/z1e;

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
    iput-object p1, p0, La/w1e;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/w1e;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/w1e;->s:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/w1e;->r:La/z1e;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, La/z1e;->m(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
