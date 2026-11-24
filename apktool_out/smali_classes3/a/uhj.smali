.class public final La/uhj;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:I

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:J

.field public p:Ljava/util/List;

.field public q:Ljava/util/List;

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/uii;

.field public t:I


# direct methods
.method public constructor <init>(La/uii;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/uhj;->s:La/uii;

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
    .locals 10

    .line 1
    iput-object p1, p0, La/uhj;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/uhj;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/uhj;->t:I

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x0

    .line 12
    iget-object v0, p0, La/uhj;->s:La/uii;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v9, p0

    .line 21
    invoke-virtual/range {v0 .. v9}, La/uii;->l(IZJZZZZLa/zje;)Ljava/io/Serializable;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
