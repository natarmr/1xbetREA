.class public final synthetic La/zi4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wpq;

.field public final synthetic c:La/pkk0;

.field public final synthetic d:La/cj4;


# direct methods
.method public synthetic constructor <init>(La/wpq;La/pkk0;La/cj4;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/zi4;->a:B

    iput-object p1, p0, La/zi4;->b:La/wpq;

    iput-object p2, p0, La/zi4;->c:La/pkk0;

    iput-object p3, p0, La/zi4;->d:La/cj4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/zi4;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/zi4;->d:La/cj4;

    .line 4
    .line 5
    iget-object v2, p0, La/zi4;->c:La/pkk0;

    .line 6
    .line 7
    iget-object p0, p0, La/zi4;->b:La/wpq;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 13
    .line 14
    invoke-static {p0}, La/wpq;->a(La/wpq;)V

    .line 15
    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v2, La/r3k;

    .line 20
    .line 21
    invoke-virtual {v2}, La/r3k;->a()V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v1}, La/cj4;->G0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/li4;->a:La/li4;

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
    :pswitch_0
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 37
    .line 38
    invoke-static {p0}, La/wpq;->a(La/wpq;)V

    .line 39
    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    check-cast v2, La/r3k;

    .line 44
    .line 45
    invoke-virtual {v2}, La/r3k;->a()V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v1}, La/cj4;->G0()La/k3t0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    sget-object v0, La/di4;->a:La/di4;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_1
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 61
    .line 62
    invoke-static {p0}, La/wpq;->a(La/wpq;)V

    .line 63
    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    check-cast v2, La/r3k;

    .line 68
    .line 69
    invoke-virtual {v2}, La/r3k;->a()V

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {v1}, La/cj4;->G0()La/k3t0;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    sget-object v0, La/wh4;->a:La/wh4;

    .line 77
    .line 78
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_2
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 85
    .line 86
    invoke-static {p0}, La/wpq;->a(La/wpq;)V

    .line 87
    .line 88
    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    check-cast v2, La/r3k;

    .line 92
    .line 93
    invoke-virtual {v2}, La/r3k;->a()V

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-virtual {v1}, La/cj4;->G0()La/k3t0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    sget-object v0, La/ei4;->a:La/ei4;

    .line 101
    .line 102
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
