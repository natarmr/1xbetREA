.class public final La/q5v;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:Z

.field public l:Z

.field public m:Ljava/lang/String;

.field public n:Ljava/util/List;

.field public o:Ljava/util/List;

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/dgu;

.field public r:I


# direct methods
.method public constructor <init>(La/dgu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/q5v;->q:La/dgu;

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
    .locals 9

    .line 1
    iput-object p1, p0, La/q5v;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/q5v;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/q5v;->r:I

    .line 9
    .line 10
    const-wide/16 v5, 0x0

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v0, p0, La/q5v;->q:La/dgu;

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v8, p0

    .line 20
    invoke-virtual/range {v0 .. v8}, La/dgu;->p(JZZJLjava/lang/String;La/zje;)Ljava/io/Serializable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
