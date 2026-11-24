.class public final La/qwz;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/Throwable;

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/twz;

.field public u:I


# direct methods
.method public constructor <init>(La/twz;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qwz;->t:La/twz;

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
    iput-object p1, p0, La/qwz;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/qwz;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/qwz;->u:I

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    iget-object v0, p0, La/qwz;->t:La/twz;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    move-object v6, p0

    .line 19
    invoke-virtual/range {v0 .. v7}, La/twz;->e(IJJLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
