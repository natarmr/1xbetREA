.class public final La/o8q;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:D

.field public j:Z

.field public k:La/ql5;

.field public l:Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

.field public m:La/yh7;

.field public n:I

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:La/r8q;

.field public q:I


# direct methods
.method public constructor <init>(La/r8q;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o8q;->p:La/r8q;

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
    iput-object p1, p0, La/o8q;->o:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/o8q;->q:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/o8q;->q:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, La/o8q;->p:La/r8q;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p0, p1}, La/r8q;->C(DLa/zje;Z)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
