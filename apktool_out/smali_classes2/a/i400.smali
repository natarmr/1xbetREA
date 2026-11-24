.class public final La/i400;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:J

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Ljava/lang/String;

.field public q:Ljava/lang/Throwable;

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/j400;

.field public t:I


# direct methods
.method public constructor <init>(La/j400;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/i400;->s:La/j400;

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
    .locals 6

    .line 1
    iput-object p1, p0, La/i400;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/i400;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/i400;->t:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v0, p0, La/i400;->s:La/j400;

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    move-object v4, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, La/j400;->c(IJLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
