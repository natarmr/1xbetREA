.class public final La/vwu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/svu;

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:I

.field public m:J

.field public n:J

.field public o:J

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/yhi;

.field public r:I


# direct methods
.method public constructor <init>(La/yhi;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vwu;->q:La/yhi;

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
    iput-object p1, p0, La/vwu;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/vwu;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/vwu;->r:I

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    iget-object v0, p0, La/vwu;->q:La/yhi;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v4, p0

    .line 18
    invoke-virtual/range {v0 .. v6}, La/yhi;->g(IJLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
