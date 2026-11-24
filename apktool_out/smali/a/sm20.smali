.class public final La/sm20;
.super La/zje;
.source "SourceFile"


# instance fields
.field public A:I

.field public synthetic B:Ljava/lang/Object;

.field public final synthetic Y:La/on20;

.field public Z:I

.field public i:La/oa20;

.field public j:La/q4f;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:La/hg7;

.field public q:Ljava/lang/String;

.field public r:La/en7;

.field public s:Ljava/lang/String;

.field public t:La/on20;

.field public u:La/pn40;

.field public v:Z

.field public w:Z

.field public x:D

.field public y:D

.field public z:J


# direct methods
.method public constructor <init>(La/on20;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sm20;->Y:La/on20;

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
    .locals 2

    .line 1
    iput-object p1, p0, La/sm20;->B:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/sm20;->Z:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/sm20;->Z:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/sm20;->Y:La/on20;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p1, v0, p0}, La/on20;->D0(La/oa20;La/q4f;ZLa/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
