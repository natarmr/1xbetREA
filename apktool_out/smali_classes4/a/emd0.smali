.class public final La/emd0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/dao;

.field public j:La/m9s;

.field public k:La/ms2;

.field public l:La/gmd0;

.field public m:Ljava/lang/Object;

.field public n:La/m97;

.field public o:La/zh7;

.field public p:La/zh7;

.field public q:Ljava/lang/String;

.field public r:La/zh7;

.field public s:Z

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:La/gmd0;

.field public w:I


# direct methods
.method public constructor <init>(La/gmd0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/emd0;->v:La/gmd0;

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
    iput-object p1, p0, La/emd0;->u:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/emd0;->w:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/emd0;->w:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, La/emd0;->v:La/gmd0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, La/gmd0;->l(La/dao;La/m9s;La/ms2;ZLa/zje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
