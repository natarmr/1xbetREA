.class public final La/xn10;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:La/csr;

.field public k:La/a570;

.field public l:Ljava/lang/String;

.field public m:La/lz60;

.field public n:Z

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/bo10;

.field public q:I


# direct methods
.method public constructor <init>(La/bo10;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/xn10;->p:La/bo10;

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
    iput-object p1, p0, La/xn10;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/xn10;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/xn10;->q:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, La/xn10;->p:La/bo10;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, La/bo10;->F(JLa/csr;ZLa/zje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
