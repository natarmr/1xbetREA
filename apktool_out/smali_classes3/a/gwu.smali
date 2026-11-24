.class public final La/gwu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Z

.field public j:J

.field public k:J

.field public l:La/jvn;

.field public m:La/y3v;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/u8u;

.field public p:I


# direct methods
.method public constructor <init>(La/u8u;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gwu;->o:La/u8u;

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
    .locals 8

    .line 1
    iput-object p1, p0, La/gwu;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/gwu;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/gwu;->p:I

    .line 9
    .line 10
    const-wide/16 v4, 0x0

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v0, p0, La/gwu;->o:La/u8u;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    move-object v7, p0

    .line 19
    invoke-virtual/range {v0 .. v7}, La/u8u;->w(ZJJLa/jvn;La/zje;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
