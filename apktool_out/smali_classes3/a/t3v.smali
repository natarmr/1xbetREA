.class public final La/t3v;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:Ljava/util/Date;

.field public l:La/ypl0;

.field public m:B

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/nc0;

.field public q:I


# direct methods
.method public constructor <init>(La/nc0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/t3v;->p:La/nc0;

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
    iput-object p1, p0, La/t3v;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/t3v;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/t3v;->q:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v0, p0, La/t3v;->p:La/nc0;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    const-wide/16 v3, 0x0

    .line 17
    .line 18
    move-object v7, p0

    .line 19
    invoke-virtual/range {v0 .. v7}, La/nc0;->v(JJLjava/util/Date;ILa/zje;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
