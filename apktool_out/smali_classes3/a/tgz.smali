.class public final La/tgz;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/lang/String;

.field public j:La/zpu;

.field public k:La/zpu;

.field public l:La/tgz;

.field public m:Ljava/lang/Throwable;

.field public n:J

.field public o:J

.field public p:I

.field public q:I

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/zpu;

.field public u:I


# direct methods
.method public constructor <init>(La/zpu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/tgz;->t:La/zpu;

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
    iput-object p1, p0, La/tgz;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/tgz;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/tgz;->u:I

    .line 9
    .line 10
    iget-object p1, p0, La/tgz;->t:La/zpu;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/zpu;->e(Ljava/lang/String;La/zje;)Ljava/lang/Object;

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
