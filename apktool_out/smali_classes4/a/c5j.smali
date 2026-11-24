.class public final La/c5j;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:I

.field public l:I

.field public m:I

.field public n:La/kki;

.field public o:La/kki;

.field public p:La/c5j;

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La/kki;

.field public s:I


# direct methods
.method public constructor <init>(La/kki;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/c5j;->r:La/kki;

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
    .locals 7

    .line 1
    iput-object p1, p0, La/c5j;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/c5j;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/c5j;->s:I

    .line 9
    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object v0, p0, La/c5j;->r:La/kki;

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v6, p0

    .line 18
    invoke-virtual/range {v0 .. v6}, La/kki;->z(IJJLa/zje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
