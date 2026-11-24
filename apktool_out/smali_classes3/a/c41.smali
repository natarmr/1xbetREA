.class public final La/c41;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;

.field public final p:La/grj;

.field public final q:La/e41;

.field public final r:La/s31;


# direct methods
.method public constructor <init>(Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;La/grj;La/e41;La/s31;La/mne;La/ctf0;)V
    .locals 6

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/mc;

    .line 5
    .line 6
    const/16 v0, 0xb

    .line 7
    .line 8
    invoke-direct {v2, p6, p1, v0}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/eo0;

    .line 12
    .line 13
    const/16 p6, 0xf

    .line 14
    .line 15
    invoke-direct {v3, p6}, La/eo0;-><init>(B)V

    .line 16
    .line 17
    .line 18
    iget-object p6, p5, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object p5, p5, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p6, p5}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/c41;->o:Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;

    .line 33
    .line 34
    iput-object p2, v0, La/c41;->p:La/grj;

    .line 35
    .line 36
    iput-object p3, v0, La/c41;->q:La/e41;

    .line 37
    .line 38
    iput-object p4, v0, La/c41;->r:La/s31;

    .line 39
    .line 40
    iget-object p0, p4, La/s31;->a:La/kt2;

    .line 41
    .line 42
    const-string p1, "jackpot_id"

    .line 43
    .line 44
    const-string p2, "530"

    .line 45
    .line 46
    const-string p4, "jackpot_popup_show"

    .line 47
    .line 48
    invoke-static {p1, p2, p0, p4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p3, La/e41;->a:La/s1p;

    .line 52
    .line 53
    const-wide/16 p1, 0x2ed6

    .line 54
    .line 55
    const/16 p3, 0x212

    .line 56
    .line 57
    invoke-static {p3, p0, p1, p2}, La/b1j;->r(ILa/s1p;J)V

    .line 58
    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/x31;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/w31;

    .line 10
    .line 11
    iget-object v1, p0, La/c41;->r:La/s31;

    .line 12
    .line 13
    iget-object v2, p0, La/c41;->q:La/e41;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object p1, La/o31;->a:La/o31;

    .line 18
    .line 19
    invoke-virtual {v2, p1}, La/e41;->a(La/o31;)V

    .line 20
    .line 21
    .line 22
    const-string p1, "take_part"

    .line 23
    .line 24
    invoke-virtual {v1, p1}, La/s31;->e(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, La/c41;->o:Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;

    .line 28
    .line 29
    iget-object p1, p1, Lorg/xplatform/aggregator/impl/category/presentation/models/AggregatorJackpotBottomSheetParams;->b:Ljava/lang/String;

    .line 30
    .line 31
    iget-object p0, p0, La/c41;->p:La/grj;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, La/grj;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    instance-of p0, p1, La/v31;

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    sget-object p0, La/o31;->b:La/o31;

    .line 42
    .line 43
    invoke-virtual {v2, p0}, La/e41;->a(La/o31;)V

    .line 44
    .line 45
    .line 46
    const-string p0, "later"

    .line 47
    .line 48
    invoke-virtual {v1, p0}, La/s31;->e(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    instance-of p0, p1, La/u31;

    .line 53
    .line 54
    if-eqz p0, :cond_2

    .line 55
    .line 56
    sget-object p0, La/o31;->c:La/o31;

    .line 57
    .line 58
    invoke-virtual {v2, p0}, La/e41;->a(La/o31;)V

    .line 59
    .line 60
    .line 61
    const-string p0, "ignore"

    .line 62
    .line 63
    invoke-virtual {v1, p0}, La/s31;->e(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 68
    .line 69
    .line 70
    return-void
.end method
