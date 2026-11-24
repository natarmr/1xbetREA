.class public final La/u600;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/jvn;

.field public j:Ljava/util/List;

.field public k:Ljava/util/List;

.field public l:Ljava/lang/Integer;

.field public m:Ljava/util/List;

.field public n:La/pzu;

.field public o:I

.field public p:Z

.field public q:Z

.field public r:J

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/pzu;

.field public u:I


# direct methods
.method public constructor <init>(La/pzu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/u600;->t:La/pzu;

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
    .locals 11

    .line 1
    iput-object p1, p0, La/u600;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/u600;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/u600;->u:I

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v9, 0x0

    .line 12
    iget-object v0, p0, La/u600;->t:La/pzu;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const-wide/16 v6, 0x0

    .line 20
    .line 21
    move-object v10, p0

    .line 22
    invoke-virtual/range {v0 .. v10}, La/pzu;->S(La/jvn;Ljava/util/List;ILjava/util/List;ZJZLjava/lang/Integer;La/zje;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
