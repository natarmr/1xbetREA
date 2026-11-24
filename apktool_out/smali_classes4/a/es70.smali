.class public final synthetic La/es70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gs70;


# direct methods
.method public synthetic constructor <init>(La/gs70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/es70;->a:B

    iput-object p1, p0, La/es70;->b:La/gs70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/es70;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/es70;->b:La/gs70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/gs70;->r2:La/nh70;

    .line 9
    .line 10
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object v0, La/gs70;->r2:La/nh70;

    .line 17
    .line 18
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:Z

    .line 24
    .line 25
    invoke-virtual {p0}, La/gs70;->P0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v0, La/vr70;->a:La/vr70;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    sget-object v0, La/gs70;->r2:La/nh70;

    .line 38
    .line 39
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_2
    sget-object v0, La/gs70;->r2:La/nh70;

    .line 46
    .line 47
    new-instance v0, La/fs70;

    .line 48
    .line 49
    invoke-direct {v0, p0}, La/fs70;-><init>(La/gs70;)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_3
    sget-object v0, La/gs70;->r2:La/nh70;

    .line 54
    .line 55
    iget-object p0, p0, La/gs70;->l2:La/fiu0;

    .line 56
    .line 57
    if-eqz p0, :cond_0

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_0
    const-string p0, "viewModelFactory"

    .line 61
    .line 62
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    throw p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
