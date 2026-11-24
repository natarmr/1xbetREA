.class public final La/ofu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/sys0;

.field public j:La/s77;

.field public k:La/gr00;

.field public l:Ljava/util/List;

.field public m:Ljava/lang/String;

.field public n:La/s77;

.field public o:Ljava/util/List;

.field public p:J

.field public q:J

.field public r:J

.field public s:I

.field public t:Z

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:La/nc0;

.field public w:I


# direct methods
.method public constructor <init>(La/nc0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ofu;->v:La/nc0;

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
    iput-object p1, p0, La/ofu;->u:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/ofu;->w:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/ofu;->w:I

    .line 9
    .line 10
    iget-object p1, p0, La/ofu;->v:La/nc0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, La/nc0;->f(La/sys0;La/s77;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
