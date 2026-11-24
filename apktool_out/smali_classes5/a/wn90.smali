.class public final synthetic La/wn90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ao90;


# direct methods
.method public synthetic constructor <init>(La/ao90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wn90;->a:B

    iput-object p1, p0, La/wn90;->b:La/ao90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/wn90;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wn90;->b:La/ao90;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ao90;->o2:La/xi70;

    .line 9
    .line 10
    invoke-virtual {p0}, La/ao90;->P0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/co90;->a:La/co90;

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
    sget-object v0, La/ao90;->o2:La/xi70;

    .line 23
    .line 24
    invoke-virtual {p0}, La/ao90;->P0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object v0, La/bo90;->a:La/bo90;

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
    new-instance v0, La/q0h0;

    .line 37
    .line 38
    iget-object p0, p0, La/ao90;->k2:La/a8z;

    .line 39
    .line 40
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/sni;

    .line 45
    .line 46
    iget-object p0, p0, La/sni;->n:La/n5d0;

    .line 47
    .line 48
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, La/rni;

    .line 53
    .line 54
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_2
    sget-object v0, La/ao90;->o2:La/xi70;

    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    instance-of v1, v0, La/af3;

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    check-cast v0, La/af3;

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    move-object v0, v2

    .line 80
    :goto_0
    const-class v1, La/ap90;

    .line 81
    .line 82
    if-eqz v0, :cond_3

    .line 83
    .line 84
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/o5d0;

    .line 93
    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, La/ze3;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    move-object v0, v2

    .line 104
    :goto_1
    instance-of v3, v0, La/ap90;

    .line 105
    .line 106
    if-nez v3, :cond_2

    .line 107
    .line 108
    move-object v0, v2

    .line 109
    :cond_2
    check-cast v0, La/ap90;

    .line 110
    .line 111
    if-eqz v0, :cond_3

    .line 112
    .line 113
    iget-object v1, p0, La/ao90;->m2:La/khf0;

    .line 114
    .line 115
    sget-object v2, La/ao90;->p2:[La/iiy;

    .line 116
    .line 117
    const/4 v3, 0x0

    .line 118
    aget-object v3, v2, v3

    .line 119
    .line 120
    invoke-virtual {v1, p0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 125
    .line 126
    iget-object v3, p0, La/ao90;->n2:La/khf0;

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    aget-object v2, v2, v4

    .line 130
    .line 131
    invoke-virtual {v3, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    check-cast p0, Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;

    .line 136
    .line 137
    invoke-virtual {v0, v1, p0}, La/ap90;->a(Lorg/xplatform/picker/api/presentation/PickerParams;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)La/sni;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    goto :goto_2

    .line 142
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 143
    .line 144
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :goto_2
    return-object v2

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
