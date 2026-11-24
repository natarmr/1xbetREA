.class public final synthetic La/r430;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w430;


# direct methods
.method public synthetic constructor <init>(La/w430;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r430;->a:B

    iput-object p1, p0, La/r430;->b:La/w430;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/r430;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/r430;->b:La/w430;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/xgl0;

    .line 9
    .line 10
    sget-object v0, La/w430;->Y1:La/u430;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/w430;->G0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/jy20;

    .line 20
    .line 21
    new-instance v1, La/z030;

    .line 22
    .line 23
    invoke-direct {v1, p1}, La/z030;-><init>(La/xgl0;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, La/jy20;-><init>(La/g130;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    check-cast p1, La/wgl0;

    .line 36
    .line 37
    sget-object v0, La/w430;->Y1:La/u430;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    instance-of v0, p1, La/vgl0;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0}, La/w430;->G0()La/k3t0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance v0, La/jy20;

    .line 51
    .line 52
    new-instance v1, La/y030;

    .line 53
    .line 54
    check-cast p1, La/vgl0;

    .line 55
    .line 56
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 57
    .line 58
    invoke-direct {v1, p1}, La/y030;-><init>(La/xgl0;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1}, La/jy20;-><init>(La/g130;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_1
    check-cast p1, La/g130;

    .line 71
    .line 72
    sget-object v0, La/w430;->Y1:La/u430;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, La/w430;->G0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    new-instance v0, La/jy20;

    .line 82
    .line 83
    invoke-direct {v0, p1}, La/jy20;-><init>(La/g130;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
