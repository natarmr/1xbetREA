.class public final La/cn20;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/vf7;

.field public j:La/ql5;

.field public k:Z

.field public l:D

.field public m:D

.field public n:D

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/on20;

.field public r:I


# direct methods
.method public constructor <init>(La/on20;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cn20;->q:La/on20;

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
    iput-object p1, p0, La/cn20;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/cn20;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/cn20;->r:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/cn20;->q:La/on20;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, La/on20;->M0(La/vf7;ZLa/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
