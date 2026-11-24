.class public final La/nai;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r9u;


# direct methods
.method public constructor <init>(La/r9u;B)V
    .locals 0

    .line 1
    packed-switch p2, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/nai;->a:La/r9u;

    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/nai;->a:La/r9u;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JJJ)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;
    .locals 8

    .line 1
    sget-object v0, La/ygp;->l1:La/ygp;

    .line 2
    .line 3
    iget-object p0, p0, La/nai;->a:La/r9u;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/m1q0;->d(La/ygp;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v0, Lorg/xplatform/statistic/stage/impl/stage_net/presentation/screen/StageNetRefactorScreen;

    .line 22
    .line 23
    move-object v1, p1

    .line 24
    move-wide v2, p2

    .line 25
    move-wide v4, p4

    .line 26
    move-wide v6, p6

    .line 27
    invoke-direct/range {v0 .. v7}, Lorg/xplatform/statistic/stage/impl/stage_net/presentation/screen/StageNetRefactorScreen;-><init>(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JJJ)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    new-instance p0, Lorg/xplatform/statistic/stage/impl/stage_net/presentation/screen/StageNetScreen;

    .line 32
    .line 33
    invoke-direct/range {p0 .. p7}, Lorg/xplatform/statistic/stage/impl/stage_net/presentation/screen/StageNetScreen;-><init>(Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JJJ)V

    .line 34
    .line 35
    .line 36
    return-object p0
.end method
