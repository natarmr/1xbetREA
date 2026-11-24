.class public final La/t520;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/hxu;

.field public j:La/q4f;

.field public k:Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;

.field public l:La/cl5;

.field public m:I

.field public n:D

.field public o:D

.field public p:D

.field public q:Z

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:La/h620;

.field public t:I


# direct methods
.method public constructor <init>(La/h620;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/t520;->s:La/h620;

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
    iput-object p1, p0, La/t520;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/t520;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/t520;->t:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, La/t520;->s:La/h620;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, La/h620;->y(La/hxu;La/q4f;Lorg/xplatform/coupon/impl/make_bet/presentation/model/StepInputUiModel;Lorg/xplatform/coupon/impl/make_bet/presentation/model/CoefStepInputUiModel;La/zje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
