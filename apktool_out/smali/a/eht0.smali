.class public final La/eht0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/q4f;

.field public j:Ljava/util/List;

.field public k:La/mie0;

.field public l:Ljava/util/ArrayList;

.field public m:Ljava/util/List;

.field public n:La/mie0;

.field public o:I

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:La/fht0;

.field public s:I


# direct methods
.method public constructor <init>(La/fht0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/eht0;->r:La/fht0;

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
    .locals 3

    .line 1
    iput-object p1, p0, La/eht0;->q:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/eht0;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/eht0;->s:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, La/eht0;->r:La/fht0;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p1, p0}, La/fht0;->k(JLa/q4f;La/zje;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
