.class public final La/by0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:Ljava/util/List;

.field public k:La/sff0;

.field public l:La/phf0;

.field public m:B

.field public n:I

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/phf0;

.field public r:I


# direct methods
.method public constructor <init>(La/phf0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/by0;->q:La/phf0;

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
    iput-object p1, p0, La/by0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/by0;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/by0;->r:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, La/by0;->q:La/phf0;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, La/phf0;->r(JLjava/util/List;ILa/zje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
