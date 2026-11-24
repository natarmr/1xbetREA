.class public final La/c5z;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/vwd0;

.field public j:La/a6u;

.field public k:La/ljg;

.field public l:La/ueh;

.field public m:La/ypl0;

.field public n:La/g0e0;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/a6u;

.field public q:I


# direct methods
.method public constructor <init>(La/a6u;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/c5z;->p:La/a6u;

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
    .locals 1

    .line 1
    iput-object p1, p0, La/c5z;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/c5z;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/c5z;->q:I

    .line 9
    .line 10
    iget-object p1, p0, La/c5z;->p:La/a6u;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/a6u;->I(La/vwd0;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance p1, La/j0g0;

    .line 23
    .line 24
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method
