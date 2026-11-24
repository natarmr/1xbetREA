.class public final La/gsc0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:I

.field public k:I

.field public l:Z

.field public m:Ljava/lang/Long;

.field public n:Ljava/util/List;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/pzu;

.field public q:I


# direct methods
.method public constructor <init>(La/pzu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gsc0;->p:La/pzu;

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
    .locals 8

    .line 1
    iput-object p1, p0, La/gsc0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/gsc0;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/gsc0;->q:I

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v0, p0, La/gsc0;->p:La/pzu;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const-wide/16 v3, 0x0

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    move-object v5, p0

    .line 19
    invoke-virtual/range {v0 .. v7}, La/pzu;->a0(IIJLa/zje;Ljava/lang/Long;Z)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
