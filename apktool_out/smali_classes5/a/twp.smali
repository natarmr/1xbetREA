.class public final La/twp;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:J

.field public l:Ljava/util/Map;

.field public m:La/wti;

.field public n:La/twp;

.field public o:Ljava/lang/Throwable;

.field public p:I

.field public q:I

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/wti;

.field public u:I


# direct methods
.method public constructor <init>(La/wti;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/twp;->t:La/wti;

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
    iput-object p1, p0, La/twp;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/twp;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/twp;->u:I

    .line 9
    .line 10
    iget-object p1, p0, La/twp;->t:La/wti;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, La/wti;->f(JLa/zje;)Ljava/io/Serializable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object p1, La/wne;->a:La/wne;

    .line 19
    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance p1, La/j0g0;

    .line 24
    .line 25
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object p1
.end method
