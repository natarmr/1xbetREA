.class public final La/fd70;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/ql5;

.field public j:La/bm5;

.field public k:La/bsu;

.field public l:Z

.field public m:Z

.field public n:Z

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/xd70;

.field public q:I


# direct methods
.method public constructor <init>(La/xd70;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fd70;->p:La/xd70;

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
    iput-object p1, p0, La/fd70;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/fd70;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/fd70;->q:I

    .line 9
    .line 10
    iget-object p1, p0, La/fd70;->p:La/xd70;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/xd70;->R(La/zje;)Ljava/io/Serializable;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
