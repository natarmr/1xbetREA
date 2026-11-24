.class public final synthetic La/hs6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/is6;


# direct methods
.method public synthetic constructor <init>(La/is6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hs6;->a:B

    iput-object p1, p0, La/hs6;->b:La/is6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/hs6;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/hs6;->b:La/is6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, La/is6;->r2:I

    .line 9
    .line 10
    invoke-virtual {p0}, La/is6;->P0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/m320;->a:La/m320;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget v0, La/is6;->r2:I

    .line 23
    .line 24
    invoke-virtual {p0}, La/is6;->P0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/e420;->a:La/e420;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    sget v0, La/is6;->r2:I

    .line 37
    .line 38
    invoke-virtual {p0}, La/is6;->P0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    sget-object v0, La/q320;->a:La/q320;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_2
    sget v0, La/is6;->r2:I

    .line 51
    .line 52
    invoke-virtual {p0}, La/is6;->P0()La/k3t0;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sget-object v0, La/y420;->a:La/y420;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_3
    sget v0, La/is6;->r2:I

    .line 65
    .line 66
    invoke-virtual {p0}, La/is6;->P0()La/k3t0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sget-object v0, La/x420;->a:La/x420;

    .line 71
    .line 72
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_4
    sget v0, La/is6;->r2:I

    .line 79
    .line 80
    iget-object p0, p0, La/is6;->k2:La/fiu0;

    .line 81
    .line 82
    if-eqz p0, :cond_0

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_0
    const-string p0, "viewModelFactory"

    .line 86
    .line 87
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    throw p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
