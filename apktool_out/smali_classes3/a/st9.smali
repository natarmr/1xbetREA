.class public final synthetic La/st9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ut9;


# direct methods
.method public synthetic constructor <init>(La/ut9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/st9;->a:B

    iput-object p1, p0, La/st9;->b:La/ut9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/st9;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/st9;->b:La/ut9;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/ut9;->q2:La/phf0;

    .line 9
    .line 10
    sget-object v1, La/ut9;->t2:[La/iiy;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    sget-object v0, La/ut9;->s2:La/bj5;

    .line 33
    .line 34
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x1

    .line 39
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 40
    .line 41
    invoke-virtual {p0}, La/ut9;->P0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object v0, La/jt9;->a:La/jt9;

    .line 46
    .line 47
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_1
    sget-object v0, La/ut9;->s2:La/bj5;

    .line 54
    .line 55
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_2
    sget-object v0, La/ut9;->s2:La/bj5;

    .line 62
    .line 63
    new-instance v0, La/tt9;

    .line 64
    .line 65
    invoke-direct {v0, p0}, La/tt9;-><init>(La/ut9;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_3
    sget-object v0, La/ut9;->s2:La/bj5;

    .line 70
    .line 71
    iget-object p0, p0, La/ut9;->l2:La/fiu0;

    .line 72
    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_0
    const-string p0, "viewModelFactory"

    .line 77
    .line 78
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const/4 p0, 0x0

    .line 82
    throw p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
