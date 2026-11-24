.class public final synthetic La/xsb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zsb;


# direct methods
.method public synthetic constructor <init>(La/zsb;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xsb;->a:B

    iput-object p1, p0, La/xsb;->b:La/zsb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/xsb;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xsb;->b:La/zsb;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/zsb;->n2:La/yk5;

    .line 9
    .line 10
    invoke-virtual {p0}, La/zsb;->P0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/tsb;->a:La/tsb;

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
    sget-object v0, La/zsb;->n2:La/yk5;

    .line 23
    .line 24
    invoke-virtual {p0}, La/zsb;->P0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v0, La/qsb;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, v1}, La/qsb;-><init>(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_1
    sget-object v0, La/zsb;->n2:La/yk5;

    .line 41
    .line 42
    invoke-virtual {p0}, La/zsb;->P0()La/k3t0;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance v0, La/qsb;

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-direct {v0, v1}, La/qsb;-><init>(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_2
    sget-object v0, La/zsb;->n2:La/yk5;

    .line 59
    .line 60
    iget-object p0, p0, La/zsb;->l2:La/fiu0;

    .line 61
    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_0
    const-string p0, "viewModelFactory"

    .line 66
    .line 67
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    throw p0

    .line 72
    :pswitch_3
    sget-object v0, La/zsb;->n2:La/yk5;

    .line 73
    .line 74
    invoke-virtual {p0}, La/zsb;->P0()La/k3t0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    sget-object v0, La/psb;->a:La/psb;

    .line 79
    .line 80
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_4
    sget-object v0, La/zsb;->n2:La/yk5;

    .line 87
    .line 88
    invoke-virtual {p0}, La/zsb;->P0()La/k3t0;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    sget-object v0, La/usb;->a:La/usb;

    .line 93
    .line 94
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
