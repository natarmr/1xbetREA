.class public final synthetic La/ti4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cj4;


# direct methods
.method public synthetic constructor <init>(La/cj4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ti4;->a:B

    iput-object p1, p0, La/ti4;->b:La/cj4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ti4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ti4;->b:La/cj4;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    check-cast p2, Landroid/os/Bundle;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 13
    .line 14
    const-string v0, "KEY_PICKER_MODEL_REQUEST"

    .line 15
    .line 16
    invoke-static {p2, p1, v0}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance p2, La/th4;

    .line 25
    .line 26
    invoke-direct {p2, p1}, La/th4;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 36
    .line 37
    const-string v0, "KEY_AUTH_ENTRY_POINT_REQUEST"

    .line 38
    .line 39
    invoke-static {p2, p1, v0}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance p2, La/ph4;

    .line 48
    .line 49
    invoke-direct {p2, p1}, La/ph4;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, La/cj4;->N1:La/rl70;

    .line 67
    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    const-string p1, "PICKER_DIALOG_TAG"

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance p2, La/vh4;

    .line 81
    .line 82
    invoke-direct {p2, p1}, La/vh4;-><init>(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_0
    const-string p0, "pickerDialogFactory"

    .line 92
    .line 93
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/4 p0, 0x0

    .line 97
    throw p0

    .line 98
    :pswitch_2
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 99
    .line 100
    const-string v0, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 101
    .line 102
    invoke-static {p2, p1, v0}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    const-string v0, "KEY_PICKER_COUNTRY_ALLOWED_REQUEST"

    .line 107
    .line 108
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    new-instance v0, La/uh4;

    .line 117
    .line 118
    invoke-direct {v0, p1, p2}, La/uh4;-><init>(IZ)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
