.class public final synthetic La/nof0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vof0;


# direct methods
.method public synthetic constructor <init>(La/vof0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nof0;->a:B

    iput-object p1, p0, La/nof0;->b:La/vof0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/nof0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/nof0;->b:La/vof0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/vof0;->O1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, La/vof0;->I0()La/aqf0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, La/aqf0;->C()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    sget-object v0, La/vof0;->O1:[La/iiy;

    .line 22
    .line 23
    invoke-virtual {p0}, La/vof0;->H0()La/e4r;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object p0, p0, La/e4r;->e:Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 28
    .line 29
    iget-object v0, p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->a:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    move-object v3, v2

    .line 46
    check-cast v3, La/srf0;

    .line 47
    .line 48
    iget-object v3, v3, La/srf0;->c:La/mrf0;

    .line 49
    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    iget-object v3, v3, La/mrf0;->d:La/qrf0;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-object v3, v1

    .line 56
    :goto_0
    sget-object v4, La/qrf0;->a:La/qrf0;

    .line 57
    .line 58
    if-ne v3, v4, :cond_0

    .line 59
    .line 60
    move-object v1, v2

    .line 61
    :cond_2
    check-cast v1, La/srf0;

    .line 62
    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    new-instance v0, La/mrf0;

    .line 66
    .line 67
    sget-object v2, La/qrf0;->a:La/qrf0;

    .line 68
    .line 69
    const/4 v2, 0x7

    .line 70
    invoke-direct {v0, v2}, La/mrf0;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iget-boolean p0, p0, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->e:Z

    .line 74
    .line 75
    invoke-virtual {v1, v0, p0}, La/srf0;->a(La/mrf0;Z)V

    .line 76
    .line 77
    .line 78
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    sget-object v0, La/vof0;->O1:[La/iiy;

    .line 82
    .line 83
    iget-object p0, p0, La/vof0;->L1:La/fiu0;

    .line 84
    .line 85
    if-eqz p0, :cond_4

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_4
    const-string p0, "viewModelFactory"

    .line 89
    .line 90
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
