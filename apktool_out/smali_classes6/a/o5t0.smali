.class public final La/o5t0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/lang/String;

.field public j:La/p5t0;

.field public k:La/o5t0;

.field public l:Ljava/lang/Throwable;

.field public m:J

.field public n:J

.field public o:I

.field public p:I

.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/p5t0;

.field public t:I


# direct methods
.method public constructor <init>(La/p5t0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o5t0;->s:La/p5t0;

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
    iput-object p1, p0, La/o5t0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/o5t0;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/o5t0;->t:I

    .line 9
    .line 10
    iget-object p1, p0, La/o5t0;->s:La/p5t0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/p5t0;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

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
