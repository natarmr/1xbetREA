.class public final La/ejt0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:La/g45;

.field public n:Ljava/util/List;

.field public o:I

.field public p:B

.field public q:I

.field public r:I

.field public s:B

.field public t:Z

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:La/fht0;

.field public w:I


# direct methods
.method public constructor <init>(La/fht0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ejt0;->v:La/fht0;

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
    iput-object p1, p0, La/ejt0;->u:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/ejt0;->w:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/ejt0;->w:I

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v0, p0, La/ejt0;->v:La/fht0;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v8, p0

    .line 20
    invoke-virtual/range {v0 .. v8}, La/fht0;->h(JJLjava/util/List;IILa/zje;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
