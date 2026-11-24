.class public final La/fn20;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/m97;

.field public j:La/l0d;

.field public k:La/l0d;

.field public l:I

.field public m:I

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/mn20;

.field public p:I


# direct methods
.method public constructor <init>(La/mn20;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fn20;->o:La/mn20;

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
    .locals 1

    .line 1
    iput-object p1, p0, La/fn20;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/fn20;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/fn20;->p:I

    .line 9
    .line 10
    iget-object p1, p0, La/fn20;->o:La/mn20;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/mn20;->F(La/m97;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
